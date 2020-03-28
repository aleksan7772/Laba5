public class Auto {
    static final boolean cleared = true;
    private String Color;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    private String mark;
    private boolean crash;
    private int max_spped;
    private String[] breakdowns;  // поломки
    private double cost;

    public static boolean isCleared() {
        return cleared;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isCrash() {
        return crash;
    }

    public void setCrash(boolean crash) {
        this.crash = crash;
    }

    public int getMax_spped() {
        return max_spped;
    }

    public void setMax_spped(int max_spped) {
        this.max_spped = max_spped;
    }

    public String[] getBreakdowns() {
        return breakdowns;
    }

    public void setBreakdowns(String[] breakdowns) {
        this.breakdowns = breakdowns;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
