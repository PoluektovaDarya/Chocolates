public class ChocolateCalculator {
    public static void main(String[] args) {
        int money = 15; // Имеющиеся деньги
        int price = 1;  // Цена за шоколадку
        int wrap = 3;   // Количество обёрток для обмена

        int chocolates = money / price; // Начальное количество шоколадок
        int wrappers = chocolates; // Начальное количество оберток

        while (wrappers >= wrap) {
            int newChocolates = wrappers / wrap; // Получаем дополнительные шоколадки
            chocolates += newChocolates; // Увеличиваем общее количество шоколадок
            int remainingWrappers = wrappers % wrap; // Оставшиеся обертки после обмена
            wrappers = newChocolates + remainingWrappers; // Новое количество оберток
        }

        System.out.println("Максимальное количество шоколадок, которое вы можете получить: " + chocolates);
    }
}
