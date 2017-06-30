package calc;

public class Calc {

    private final double content;

    public Calc(String op, Float firstNum, Float secondNum) {

        if (!(op.equals("add") || op.equals("sub") || op.equals("div") || op.equals("mul")|| op.equals("sqrt"))){
            throw new CalcException("Only 'add', 'sub', 'div', 'mul', 'sqrt' operations availible");
        }
        if (!op.equals("sqrt") && secondNum == null){
            throw new CalcException("Please give parameter 's'");
        }

        switch (op){
            case "add":
                content = firstNum + secondNum;
                break;
            case "sub":
                content = firstNum - secondNum;
                break;
            case "mul":
                content = firstNum * secondNum;
                break;
            case "div":
                if (secondNum != 0)
                    content = firstNum / secondNum;
                else throw new CalcException("you can't devide by 0");
                break;
            case "sqrt":
                content = Math.sqrt(firstNum);
                break;
            default:
                throw new CalcException("unknown operation!");
        }
    }

    public double getContent() {
        return content;
    }
}