 public class day14_factory {
    interface Transaction {
        void send(String to, String message);
    }


    class CreditTransaction implements Transaction {
        @Override
        public void send(String to, String message) {
            System.out.println("Credited 1500: " + message + ", to " + to);
        }
    }

    class DebitTransaction implements Transaction {
        @Override
        public void send(String to, String message) {
            System.out.println("debited 1500:" + message + " , to " + to);
        }
    }

    static Transaction getNotification(day14_factory factory, String type) {
        return switch (type) {
            case "credit" -> factory.new CreditTransaction();
            case "debit" -> factory.new DebitTransaction();
            default -> throw new IllegalArgumentException("Invalid account type: " + type);
        };
    }

    static void main() {
        day14_factory factory = new day14_factory();
        String type = "debit";
        getNotification(factory, type).send("36900976876", "amount 800 debited");
    }
}
