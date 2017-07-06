package calc;

public class Calc {

    private final double content;

    public Calc(OperationsEnum opEn, Float firstNum, Float secondNum) {

        if(opEn != OperationsEnum.SQRT && secondNum == null){
            throw new CalcException("Please give parameter 's'");
        }

        switch (opEn){
            case ADD:
                content = firstNum + secondNum;
                break;
            case SUB:
                content = firstNum - secondNum;
                break;
            case MUL:
                content = firstNum * secondNum;
                break;
            case DIV:
                if (secondNum != 0)
                    content = firstNum / secondNum;
                else throw new CalcException("you can't devide by 0");
                break;
            case SQRT:
                content = Math.sqrt(firstNum);
                break;
            default:
                throw new CalcException("unknown operation!"); // this problem solved in OperationsEnum. but extra sefety.
        }
    }

    public double getContent() {
        return content;
    }
}