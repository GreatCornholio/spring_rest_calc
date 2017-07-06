package calc;


public enum OperationsEnum {
    ADD("add"),
    SUB("sub"),
    MUL("mul"),
    DIV("div"),
    SQRT("sqrt");

    private String code;

    private OperationsEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static OperationsEnum find(String value) {
        if (value != null) {
            for (OperationsEnum v : values()) {
                if (v.getCode().equals(value)) {
                    return v;
                }
            }
        }
        throw new CalcException("Only 'add', 'sub', 'div', 'mul', 'sqrt' operations availible");
    }
}
