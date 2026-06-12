/*public class day7 {

    static class Request {

        private final String name;
        private final String date;
        private final String reason;

        Request(String name, String date, String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
        }

        void reject() {
        }

        void displayDetails() {
            System.out.println("Name   : " + name);
            System.out.println("Date   : " + date);
            System.out.println("Reason : " + reason);
        }
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approve() {
            System.out.println("Leave request approved.");
        }

        void reject() {
            System.out.println("Leave request rejected.");
        }
    }

    static class LoanRequest extends Request {

        LoanRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approve() {
            System.out.println("od request approved.");
        }

        void reject() {
            System.out.println("od request rejected.");
        }
    }

    static void main(String[] args) {

        LeaveRequest leaveRequest =
                new LeaveRequest("madhu", "12-06-2026", "Medical Leave");

        leaveRequest.displayDetails();
        leaveRequest.approve();

        System.out.println();

        LoanRequest loanRequest =
                new LoanRequest("abi " +
                        "" +
                        "" +
                        "" +
                        "", "12-06-2026", "od");

        loanRequest.displayDetails();
        loanRequest.reject();
    }
}
*/
 public class day7 {
    static class payment {
        String amount;

        void transfer() {
            System.out.println("payment is successfully done");
        }

        static class Upipayment extends payment {
            @Override
            void transfer() {
                System.out.println("upi payment is successfully done");
            }
        }

        static class Cardpayment extends payment {
            @Override
            void transfer() {
                System.out.println("card payment is successfully done");
            }
        }

        static class Netbanking extends payment {
            @Override
            void transfer() {
                System.out.println("netbanking is successfully done");
            }
        }

    }

    static void main() {
        payment.Upipayment upipayment = new payment.Upipayment();
        upipayment.transfer();
        payment.Cardpayment cardpayment = new payment.Cardpayment();
        cardpayment.transfer();
        payment.Netbanking netbanking = new payment.Netbanking();
        netbanking.transfer();
    }
}