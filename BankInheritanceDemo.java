package Inheritance;

class BankAccount 
{
    String accountHolderName;
    long accountNumber;

    void AccountDetails(String name, long accNo)
    {
        this.accountHolderName = name;
        this.accountNumber = accNo;
    }

    void displayAccountDetails() 
    {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SBI extends BankAccount 
{
    String branchName;
    String ifscCode;

    void SbiDetails(String branch, String ifsc) 
    {
        this.branchName = branch;
        this.ifscCode = ifsc;
    }

    void displaySbiDetails() 
    {
        System.out.println("Bank: SBI");
        System.out.println("Branch: " + branchName);
        System.out.println("IFSC Code: " + ifscCode);
    }
}

class HDFC extends BankAccount 
    {
    String branchName;
    String ifscCode;

    void setHdfcDetails(String branch, String ifsc) {
        this.branchName = branch;
        this.ifscCode = ifsc;
    }

    void displayHdfcDetails() 
    {
        System.out.println("Bank: HDFC");
        System.out.println("Branch: " + branchName);
        System.out.println("IFSC Code: " + ifscCode);
    }
}

public class BankInheritanceDemo
{
    public static void main(String[] args) 
    {
        SBI sbiAcc = new SBI();
        sbiAcc.AccountDetails("Tejo Sridhar", 123456789);
        sbiAcc.SbiDetails("Chennai", "SBI1234");
        sbiAcc.displayAccountDetails();
        sbiAcc.displaySbiDetails();

        System.out.println();

        HDFC hdfcAcc = new HDFC();
        hdfcAcc.getAccountDetails("Thala Dhoni", 987654321);
        hdfcAcc.setHdfcDetails("Ranchi", "HDFC5678");
        hdfcAcc.displayAccountDetails();
        hdfcAcc.displayHdfcDetails();
    }
}
