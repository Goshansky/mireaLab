package lab6.number10;

class Monitor {
    private int sizeInches;

    public Monitor(int sizeInches) {
        this.sizeInches = sizeInches;
    }

    @Override
    public String toString() {
        return "Monitor: " + sizeInches + " inches";
    }
}
