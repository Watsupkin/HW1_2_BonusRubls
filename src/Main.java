public class Main {
    public static void main(String[] args) {
        int onAccount = 100; //изначально на счету
        int refillAmount = 1100; //сумма пополнения
        int bonus = refillAmount > 1000 ? (refillAmount / 100):0;
        int summ = onAccount + refillAmount + bonus;
        System.out.println("На счету:" + summ);
    }
}
