package OOPChapter1.VendingMachine;

public class VendingMachine {
    int price = 80;
    int balance;
    int total;

    VendingMachine() {
        System.out.println("Here");
        total = 10;
    }

    VendingMachine(int price) {
        this();
        System.out.println("There");
        this.price = price;
    }

    void showTotal() {
        System.out.println(total);
    }

    void showPrompt() {
        System.out.println("Welcome");
    }

    void insertMoney(int amount) {
        balance += amount;
    }

    void showBalance() {
        System.out.println(balance);
    }

    void getFood() {
        if (balance >= price) {
            System.out.println("Here you are.");
            balance -= price;
            total += price;
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(80);
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
        vm.showTotal();
    }
}
