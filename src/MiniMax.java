public class MiniMax {
    
    private int mini;
    private int max;

    public MiniMax() {
        this.mini=Integer.MAX_VALUE;
        this.max=Integer.MIN_VALUE;
    }

    public int getMini() {
        return this.mini;
    }

    public void setMini(int mini) {
        this.mini = mini;
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
