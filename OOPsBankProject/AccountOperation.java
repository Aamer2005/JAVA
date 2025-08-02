import java.util.Scanner;

class AccountOperation
{
    Account accountObject;
    Scanner sc = new Scanner(System.in);

    AccountOperation(Account object)
    {
        this.accountObject = object;
        starter();
    }

      public void starter()
    {
        System.out.print("\n\nEnter 1 : Check Balance\nEnter 2 : Deposit Amount\nEnter 3: Withdraw Amount\nEnter 4 : Change Credentials\n\nChoice : ");

        Integer choice = sc.nextInt();
        sc.nextLine();
        if(choice==1)
        {
            checkBalance();
        }
        else if(choice==2)
        {
            depositAmount();
        }
        else if(choice==3)
        {
            withdrawAmount();
        }
        else if(choice==4)
        {
            changeCredentials();
        }
        else{

            System.out.println("Logout!!!");
        }
    }

    public void checkBalance()
    {
        System.out.print("\nEnter PinCode : ");
        String check = sc.nextLine();

        if(check.equals(this.accountObject.pincode))
        {
            System.out.println("\nYour Balance : "+this.accountObject.balance+"$ ");
        }
        starter();
    }

    String getPin()
    {
        return this.accountObject.pincode;
    }

     String getUsername()
    {
        return this.accountObject.username;
    }

    public void depositAmount()
    {
        double amount = 0.0;
        System.out.print("\nEnter PinCode : ");
        String check = sc.nextLine();

        if(check.equals(this.accountObject.pincode))
        {
            System.out.print("\nEnter Amount : ");
            amount=sc.nextDouble();

            if(amount>=0)
            {
                this.accountObject.balance+=amount;
                System.out.println("\nAmount added successfully!!!");
            }
            else{
                System.out.println("\nAmount should not be negative !!!");
            }
        }
        starter();
    }
    public void withdrawAmount()
    {
        double amount = 0.0;
        System.out.print("\nEnter PinCode : ");
        String check = sc.nextLine();

        if(check.equals(this.accountObject.pincode))
        {
            System.out.print("\nEnter Amount : ");
            amount=sc.nextDouble();

            if(amount>=0 && this.accountObject.balance>=amount)
            {
                this.accountObject.balance-=amount;
                System.out.println("\nAmount withdraw successfully!!!");
            }
            else{
                System.out.println("\nInsufficient balance OR Amount should not be negative !!!");
            }
        }
        starter();
    }

    public void changeCredentials()
    {
            changePincode();
            starter();
    }

     public void changePincode()
    {
         String check;
        if(this.accountObject.pincode.equals(""))
        {
        }
        else{
            System.out.println("\nTo Change PinCode Enter Previous Code: ");
            
            check = sc.nextLine();

            if(check.equals(this.accountObject.pincode))
            {
                System.out.print("Enter new PinCode : ");
                this.accountObject.pincode = sc.nextLine();
            }
            else
            {
                System.out.println("Error !!! Wrong Pin");
            }
        }
    }
}