package hu.szakdolgozat.modell;


public class StackFrame {
    private String functionName;
    private int parameterValue;

    public StackFrame(String name, int param) {
        this.functionName = name;
        this.parameterValue = param;
    }

    public String getDisplayInfo() {
        return functionName + "(" + parameterValue + ")";
    }
}