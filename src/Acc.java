public class Acc {
    public static void main(String[] args) {
Account account=new Account();
   account.balance=1000;
   account.add=15;
   account.take=100;
        System.out.println("Баланста "+account.balance+"$ акча бар");
        System.out.print(account.take+"$ " );
        Account.withdrawal();
        System.out.println("Баланста калган акча "+ (account.balance-account.take)+"$");
        System.out.printf(account.add +"$ ");
        Account.deposit();
        System.out.println("Баланста "+ (account.balance-account.take+account.add)+"$ акча бар");

    }
}
