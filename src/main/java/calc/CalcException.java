package calc;

public class CalcException extends RuntimeException{
    private String message;

    public CalcException(String message) {
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}