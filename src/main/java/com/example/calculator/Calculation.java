package com.example.calculator;

public class Calculation
{
    public double evaluateExpression(String expression) {
        double value = 0.0;
        int index = 0;
        char operator = ' ';
        boolean isFirstOperand = true;
        double currentOperand = 0.0;

        while (index < expression.length()) {
            char c = expression.charAt(index);

            if (Character.isDigit(c) || c == '.') {
                String operand = "";
                while (index < expression.length() && (Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')) {
                    operand += expression.charAt(index++);
                }
                index--;
                currentOperand = Double.parseDouble(operand);
            } else if (isOperator(c)) {
                if (isFirstOperand) {
                    value = currentOperand;
                    isFirstOperand = false;
                } else {
                    value = applyOperator(value, operator, currentOperand);
                }
                operator = c;
            } else if (c == '(') {
                int endIndex = findMatchingClosingParenthesis(expression, index);
                currentOperand = evaluateExpression(expression.substring(index + 1, endIndex));
                index = endIndex;
            }

            index++;
        }

        if (!isFirstOperand) {
            value = applyOperator(value, operator, currentOperand);
        } else {
            value = currentOperand;
        }

        return value;
    }

    private static double applyOperator(double leftOperand, char operator, double rightOperand) {
        switch (operator) {
            case '+':
                return leftOperand + rightOperand;
            case '-':
                return leftOperand - rightOperand;
            case '*':
                return leftOperand * rightOperand;
            case '/':
                return leftOperand / rightOperand;
            default:
                return 0.0;
        }
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int findMatchingClosingParenthesis(String expression, int startIndex) {
        int count = 1;
        int index = startIndex + 1;

        while (count > 0 && index < expression.length()) {
            char c = expression.charAt(index);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            index++;
        }

        return index - 1;
    }
}