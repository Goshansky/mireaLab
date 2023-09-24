package lab4.Zadanie3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        // Добавление товаров
        store.addProduct("P1", "Ноутбук", 1000.0, Category.ELECTRONICS);
        store.addProduct("P2", "Футболка", 20.0, Category.CLOTHING);
        store.addProduct("P3", "Книга", 15.0, Category.BOOKS);

        // Регистрация пользователей
        store.registerUser("user1", "password1");
        store.registerUser("user2", "password2");

        // Вход пользователя
        if (store.login("user1", "password1")) {
            User currentUser = store.getCurrentUser();

            // Просмотр категорий и товаров
            store.viewCategories();
            store.viewProductsByCategory(Category.CLOTHING);

            // Добавление товаров в корзину
            store.addToCart("P2");
            store.addToCart("P3");

            // Оформление заказа
            store.checkout();
        } else {
            System.out.println("Ошибка входа. Пользователь не найден.");
        }

        // Выход пользователя
        store.logout();
    }
}