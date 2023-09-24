package lab4_1.number9;

class FurnitureShop {
    private Furniture[] stock;

    public FurnitureShop(Furniture[] stock) {
        this.stock = stock;
    }

    // Вывести информацию о всей доступной мебели в магазине
    public void showStock() {
        System.out.println("Товары в наличии:");
        for (Furniture item : stock) {
            item.getInfo();
        }
    }
}
