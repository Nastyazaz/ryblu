

public class main {
    public static void main(String[] args) {
        // Текущий баланс клиента
        int currentBalance = 100;
        // Сумма пополнения
        int topUpAmount = 1100;

        // Проверка условия для получения бонуса
        int bonusAmount = 0;
        if (topUpAmount >= 1000) {
            bonusAmount = topUpAmount / 100;
            System.out.println("Бонус: " + bonusAmount);
        } else {
            System.out.println("Бонус: 0");
        }

        // Вычисление итогового баланса
        int finalBalance;
        finalBalance = currentBalance + topUpAmount + bonusAmount;
        System.out.println("Итоговый баланс: " + finalBalance);
    }
}
