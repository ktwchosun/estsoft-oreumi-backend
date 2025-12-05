package day06;

public class BankAccount {
    // 필드
    private String owner;
    private int accountNumber;
    private int balance;

    // 메서드
    public BankAccount(String owner, int accountNumber) {
        setOwner(owner);
        setAccountNumber(accountNumber);

        balance = 0;
    }
    // 새 은행 계좌를 만들ㄹ려면 소유주ㅘ 계좌 번호가 반드시 필요하므로 기본생성자는 추가하지 않는다.

    private void setOwner(String owner) {
        this.owner = owner;
    }
    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {return owner;}
    public int getAccountNumber() {return accountNumber;}
    public int getBalance() {return balance;}

    public BankAccount deposit(int amount) {
        if (amount <= 0) {
            System.out.println("ERROR: Invalid amount");
            return this;
        }
        balance += amount;

        System.out.printf("You have deposited %d won.\n", amount);
        return this;
    }

    public BankAccount withdraw(int amount) {
        //출금하기 전에 출금할 금액을 검사
        if(amount > balance || amount <= 0) {
            System.out.println("ERROR: Invalid amount");
            return this;
        }
        balance -= amount;

        System.out.printf("You have withdrawn %d won.\n", amount);
        return this;
    }

    public void printBalance() {
        System.out.printf("Balance: %d\n\n", balance);
    }

    public void print() {
        System.out.println("Owner: " + owner);
        System.out.println("Account Number: " + accountNumber);
        printBalance();
    }


}
