import java.util.Scanner;
class AccountInfo extends Account{

    Scanner sc = new Scanner(System.in);

    Account()
    {
        System.out.println("Login!!!");
        System.out.println("\"Welcome To Account\" ");
        starter();
    }

    public void starter()
    {
        System.out.print("\n\nEnter 1 : Create Account\nEnter 2 : Check Balance\nEnter 3 : Deposit Amount\nEnter 4: Withdraw Amount\nEnter 5 : Change Credentials\n\nChoice : ");

        Integer choice = sc.nextInt();
        sc.nextLine();
        if(choice==1)
        {
            createAccount();
        }
        else if(choice==2)
        {
            checkBalance();
        }
        else if(choice==3)
        {
            depositAmount();
        }
        else if(choice==4)
        {
            withdrawAmount();
        }
        else if(choice==5)
        {
            changeCredentials();
        }
        else{

            System.out.println("Logout!!!");
        }
    }

    public void createAccount()
    {
        if(username.equals(""))
        {
        System.out.print("Enter UserName : ");
        this.username = sc.nextLine();
        
        createPincode();
        }
    }

    public void changeCredentials()
    {
        changePincode();
        starter();
    }

    public void changePincode()
    {
         String check;
        if(this.pincode.equals(""))
        {
        }
        else{
            System.out.println("To Change PinCode Enter Previous Code: ");
            
            check = sc.nextLine();

            if(check.equals(this.pincode))
            {
                System.out.print("Enter new PinCode : ");
                this.pincode = sc.nextLine();
            }
            else
            {
                System.out.println("Error !!! Wrong Pin");
            }
        }
    }

    public void createPincode()
    {
        String check;
        if(this.pincode.equals(""))
        {
        System.out.print("Enter PinCode : ");
        this.pincode = sc.nextLine();
        System.out.println("PinCode Created Succefully!!!");
        }
        else{
            System.out.println("PinCode is already created !!!");
        }
        starter();
    }

    String getPin()
    {
        return this.pincode;
    }

     String getUsername()
    {
        return this.username;
    }

    public void checkBalance()
    {
        System.out.print("Enter PinCode : ");
        String check = sc.nextLine();

        if(check.equals(this.pincode))
        {
            System.out.println("Your Balance : "+this.balance+"$ ");
        }
        starter();
    }

    public void depositAmount()
    {
        double amount = 0.0;
        System.out.print("Enter PinCode : ");
        String check = sc.nextLine();

        if(check.equals(this.pincode))
        {
            System.out.print("Enter Amount : ");
            amount=sc.nextDouble();

            if(amount>=0)
            {
                balance+=amount;
                System.out.println("Amount added successfully!!!");
            }
            else{
                System.out.println("Amount should not be negative !!!");
            }
        }
        starter();
    }

    public void withdrawAmount()
    {
        double amount = 0.0;
        System.out.print("Enter PinCode : ");
        String check = sc.nextLine();

        if(check.equals(this.pincode))
        {
            System.out.print("Enter Amount : ");
            amount=sc.nextDouble();

            if(amount>=0 && balance>=amount)
            {
                balance-=amount;
                System.out.println("Amount withdraw successfully!!!");
            }
            else{
                System.out.println("Insufficient balance OR Amount should not be negative !!!");
            }
        }
        starter();
    }
}