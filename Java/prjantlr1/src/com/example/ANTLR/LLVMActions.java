package com.example.ANTLR;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;


public class LLVMActions extends simplenameBaseListener {
    private HashSet<String> variables;
    Stack<String> stack = new Stack<>();

    public LLVMActions() {
        variables = new HashSet<>();
    }

    @Override
    public void exitProgram(simplenameParser.ProgramContext ctx) {
        System.out.println(LLVMGenerator.generate());
    }

    @Override
    public void exitAssign(simplenameParser.AssignContext ctx) {
//        // Get variable name
//        String variableName = ctx.ID(0).getText();
//        // Get value from variable or number
//        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText()
//                : ctx.NUMBER().getText();
//        // Add variable to map
//        if(ctx.ID().size() > 1)
//            variables.put(variableName, variables.get(value));
//        else
//            variables.put(variableName, Integer.parseInt(value));

//        String ID = ctx.ID(1).getText();
//        String ID = ctx.ID().size() > 1 ? ctx.ID(1).getText()
//                : ctx.NUMBER().getText();
//        if (!variables.contains(ID)) {
//            variables.add(ID);
//            LLVMGenerator.declare(ID);
//        }
//        LLVMGenerator.assign(ID, stack.pop());


    }

//    @Override
//    public void exitEquation(simplenameParser.EquationContext ctx) {
//        // This method is called when the parser has finished
//        // parsing the add statement
//
//        String variableName = ctx.NUMBER().size() > 1 ? ctx.NUMBER(1).getText()
//                : ctx.NUMBER(0).getText();
//        int value = ctx.NUMBER().size() > 1 ? variables.get(ctx.NUMBER(0).getText())
//                : Integer.parseInt(ctx.NUMBER().toString());
//
//        variables.put(variableName, variables.get(variableName) + value);
//    }

    @Override
    public void exitEquation(simplenameParser.EquationContext ctx) {
//        if (ctx.ADD() != null) {
//            LLVMGenerator.add(stack.pop(), stack.pop());
//            stack.push("%" + (LLVMGenerator.reg - 1));
//        }

    }


//    @Override
//    public void exitPrint(simplenameParser.PrintContext ctx) {
////        String output = "";
////        if (ctx.NUMBER() != null) {
////            output = ctx.NUMBER().getText();
////        }
////        if (ctx.ID() != null) {
////            output = variables.get(ctx.ID().getText()).toString();
////        }
////        if (ctx.STRING() != null) {
////            output = ctx.STRING().getText();
////        }
////
////        System.out.println(output);
//
//            String ID = ctx.ID().getText();
//            if( variables.contains(ID) ) {
//                LLVMGenerator.printf( ID );
//            } else {
//                error(ctx.getStart().getLine(), "unknown variable "+ID);
//            }
//
//    }

    @Override
    public void exitRead(simplenameParser.ReadContext ctx) {
        String ID = ctx.ID().getText();
        if( ! variables.contains(ID) ) {
            variables.add(ID);
            LLVMGenerator.declare(ID);
        }
        LLVMGenerator.scanf(ID);
    }

    void error(int line, String msg){
        System.err.println("Error, line "+line+", "+msg);
        System.exit(1);
    }

}

