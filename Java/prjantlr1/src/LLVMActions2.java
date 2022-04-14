import java.util.*;


enum VarType {INT, REAL, STRING, UNKNOWN}

enum StructureType {FUNCTION, VARIABLE, ARRAY}

class Value {
    public String name;
    public VarType type;
    public StructureType structType;
    public int size;

    public Value(String name, VarType type, StructureType structType, int size) {
        this.name = name;
        this.type = type;
        this.structType = structType;
        this.size = size;
    }
}

public class LLVMActions2 extends MyGrammarBaseListener {
    Map<String, VarType> variables = new HashMap<>();
    Map<String, Integer> insidevar = new HashMap<>();
    Map<String, Value> structers = new HashMap<>();
    //    Map<String, Map<String, Value>> arraysDeclarations = new HashMap<>();
    Stack<Value> stack = new Stack<>();
    Stack<Value> arraysdefinisions = new Stack<>();


    @Override
    public void exitMain(MyGrammarParser.MainContext ctx) {
        System.out.println(LLVMGenerator2.generate());
    }


    @Override
    public void exitAssigment(MyGrammarParser.AssigmentContext ctx) {
        String ID = ctx.ID().getText();
        // -1 bo mamy cudzyslowia
        if (ctx.arrayindex() == null) {
            Value v = stack.pop();
            variables.put(ID, v.type);
            insidevar.put(ID, v.name.length() - 1);
            switch (v.type) {
                case INT:
                    LLVMGenerator2.declare_i32(ID);
                    LLVMGenerator2.assign_i32(ID, v.name);
                    break;

                case REAL:
                    LLVMGenerator2.declare_double(ID);
                    LLVMGenerator2.assign_double(ID, v.name);
                    break;

                case STRING:
                    LLVMGenerator2.declare_assign_string(ID, v.name);
                    break;
            }
        }

        if (ctx.arrayindex() != null) {
            int index = Integer.parseInt(ctx.arrayindex().INT().getText());
            Value v = structers.get(ID);
            if (index <= v.size) {
                switch (v.type) {
                    case INT:
                        String elementInt = ctx.number().INT().getText();
                        LLVMGenerator2.assign_i32_array(ID, v.size, index, elementInt);
                        break;

                    case REAL:
                        String elementReal = ctx.number().REAL().getText();
                        LLVMGenerator2.assign_double_array(ID, v.size, index, elementReal);
                        break;
                }
            } else {
                error(ctx.getStart().getLine(), "ArrayIndexOutOfBoundException");
            }
        }
//        else {
//            error(ctx.getStart().getLine(), "assigment type mismatch");
//        }
    }

    @Override
    public void exitDeclarationArray(MyGrammarParser.DeclarationArrayContext ctx) {
        String ID = ctx.ID().getText();
        Value v = arraysdefinisions.pop();
        structers.put(ID, v);
        if (v.type == VarType.INT) {
            LLVMGenerator2.declare_i32_array(ID, v.size);
        }
        if (v.type == VarType.REAL) {
            LLVMGenerator2.declare_double_array(ID, v.size);
        }
    }

    @Override
    public void exitNumber(MyGrammarParser.NumberContext ctx) {
        if (ctx.INT() != null) {
            stack.push(new Value(ctx.INT().getText(), VarType.INT, StructureType.VARIABLE, 0));
        }
        if (ctx.REAL() != null) {
            stack.push(new Value(ctx.REAL().getText(), VarType.REAL, StructureType.VARIABLE, 0));
        }
    }

    @Override
    public void exitArray(MyGrammarParser.ArrayContext ctx) {
        // zrobic ify obslugujece rozne typy
        if (ctx.TYPEINT() != null) {
            arraysdefinisions.push(new Value("", VarType.INT, StructureType.ARRAY, Integer.parseInt(ctx.INT().getText())));
        }
        if (ctx.TYPEREAL() != null) {
            arraysdefinisions.push(new Value("", VarType.REAL, StructureType.ARRAY, Integer.parseInt(ctx.INT().getText())));
        }
    }

    @Override
    public void exitString(MyGrammarParser.StringContext ctx) {
        if (ctx.STRING() != null) {
            stack.push(new Value(ctx.STRING().getText(), VarType.STRING, StructureType.VARIABLE, 0));
        } else {
            error(ctx.getStart().getLine(), "string type syntax mismatch");
        }
    }

    @Override
    public void exitAdd(MyGrammarParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            switch (v1.type) {
                case INT:
                    LLVMGenerator2.add_i32(v1.name, v2.name);
                    stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.INT, StructureType.VARIABLE, 0));
                    break;
                case REAL:
                    LLVMGenerator2.add_double(v1.name, v2.name);
                    stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.REAL, StructureType.VARIABLE, 0));
                    break;
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSub(MyGrammarParser.SubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator2.sub_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.INT, StructureType.VARIABLE, 0));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator2.sub_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.REAL, StructureType.VARIABLE, 0));
            }
        } else {
            error(ctx.getStart().getLine(), "sub type mismatch");
        }
    }

    @Override
    public void exitMul(MyGrammarParser.MulContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator2.mul_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.INT, StructureType.VARIABLE, 0));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator2.mul_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.REAL, StructureType.VARIABLE, 0));
            }
        } else {
            error(ctx.getStart().getLine(), "mul type mismatch");
        }
    }

    @Override
    public void exitDiv(MyGrammarParser.DivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator2.div_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.INT, StructureType.VARIABLE, 0));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator2.div_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.REAL, StructureType.VARIABLE, 0));
            }
        } else {
            error(ctx.getStart().getLine(), "div type mismatch");
        }
    }

    @Override
    public void exitPrint(MyGrammarParser.PrintContext ctx) {
        if (ctx.value().ID() != null) {
            String ID = ctx.value().ID().getText();
            VarType type = variables.get(ID);
            if (type != null) {
                if (type == VarType.INT) {
                    LLVMGenerator2.printf_i32(ID);
                }
                if (type == VarType.REAL) {
                    LLVMGenerator2.printf_double(ID);
                }
                if (type == VarType.STRING) {
                    LLVMGenerator2.printf_string(ID, insidevar.get(ID));
                }
            } else {
                error(ctx.getStart().getLine(), "unknown variable " + ID);
            }
        }

    }

    @Override
    public void exitInputreal(MyGrammarParser.InputrealContext ctx) {
        String ID = ctx.ID().getText();

        if (!variables.containsKey(ID)) {
            variables.put(ID, VarType.REAL);
            LLVMGenerator2.declare_double(ID);
        }
        LLVMGenerator2.scanf_double(ID);
    }

    @Override
    public void exitInputint(MyGrammarParser.InputintContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            variables.put(ID, VarType.INT);
            LLVMGenerator2.declare_i32(ID);
        }
        LLVMGenerator2.scanf_i32(ID);
    }

    @Override
    public void exitInputstring(MyGrammarParser.InputstringContext ctx) {
        String ID = ctx.ID().getText();

        if (!variables.containsKey(ID)) {
            variables.put(ID, VarType.STRING);
            insidevar.put(ID, 3); // 3 bo to jest minimalne miejsce potrzebne
            LLVMGenerator2.declare_assign_string(ID);
        }
        variables.put(ID, VarType.STRING);
        insidevar.put(ID, 3); // 3 bo to jest minimalne miejsce potrzebne
        LLVMGenerator2.scanf_string(ID);

    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }
}
