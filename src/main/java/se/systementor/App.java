package se.systementor;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        var t = new BankAccount("11212", "197112121212");
        t.deposit(100);
        for(var x: t.getTransactions())
        {
            System.out.printf("%s %s %d",  
                x.getTimestamp().toString(),
                x.getType().toString(),
                x.getBelopp());
        }
        System.out.println("Hello World!");
    }
}
