import java.util.HashMap;
import java.util.Stack;


enum VarType {INT, REAL, UNKNOWN}

class Value {
    public String name;
    public VarType type;

    public Value(String name, VarType type) {
        this.name = name;
        this.type = type;
    }
}

public class LLVMActions2 extends MyGrammarBaseListener {
    HashMap<String, VarType> variables = new HashMap<>();
    Stack<Value> stack = new Stack<>();


    @Override
    public void exitMain(MyGrammarParser.MainContext ctx) {
        System.out.println(LLVMGenerator2.generate());
    }


    @Override
    public void exitAssigment(MyGrammarParser.AssigmentContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        variables.put(ID, v.type);
        if (v.type == VarType.INT) {
            LLVMGenerator2.declare_i32(ID);
            LLVMGenerator2.assign_i32(ID, v.name);
        }
        if (v.type == VarType.REAL) {
            LLVMGenerator2.declare_double(ID);
            LLVMGenerator2.assign_double(ID, v.name);
        }
    }

    @Override
    public void exitIntreal(MyGrammarParser.IntrealContext ctx) {
        if (ctx.number().INT() != null) {
            stack.push(new Value(ctx.number().INT().getText(), VarType.INT));
        }

        if (ctx.number().REAL() != null) {
            stack.push(new Value(ctx.number().REAL().getText(), VarType.REAL));
        }
    }

    @Override
    public void exitAdd(MyGrammarParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator2.add_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator2.add_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.REAL));
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
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator2.sub_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.REAL));
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
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator2.mul_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.REAL));
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
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator2.div_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator2.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "div type mismatch");
        }
    }

    @Override
    public void exitPrint(MyGrammarParser.PrintContext ctx) {
       if(ctx.value().ID() != null) {
           String ID = ctx.value().ID().getText();
           VarType type = variables.get(ID);
           if (type != null) {
               if (type == VarType.INT) {
                   LLVMGenerator2.printf_i32(ID);
               }
               if (type == VarType.REAL) {
                   LLVMGenerator2.printf_double(ID);
               }
           } else {
               error(ctx.getStart().getLine(), "unknown variable " + ID);
           }
       }


    }
    @Override
    public void exitInput(MyGrammarParser.InputContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if( type != null ) {
            if (type == VarType.INT) {
                if( ! variables.containsKey(ID) ) {
                    variables.put(ID, VarType.INT);
                    LLVMGenerator2.declare_i32(ID);
                }
                LLVMGenerator2.scanf_i32(ID);
            }
            if (type == VarType.REAL) {
                if(! variables.containsKey(ID) ) {
                    variables.put(ID, VarType.REAL);
                    LLVMGenerator2.declare_double(ID);
                }
                LLVMGenerator2.scanf_double(ID);
            }
        }
    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }
}
