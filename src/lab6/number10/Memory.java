package lab6.number10;

class Memory {
    private int sizeGB;

    public Memory(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    @Override
    public String toString() {
        return "Memory: " + sizeGB + "GB";
    }
}
