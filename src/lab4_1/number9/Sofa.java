package lab4_1.number9;

class Sofa extends Furniture {
    private String material;

    public Sofa(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void getInfo() {
        System.out.println("Диван: " + getName() + ", Цена: $" + getPrice() + ", Материал: " + material);
    }
}
