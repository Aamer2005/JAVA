import java.util.ArrayList;
import java.util.Scanner;


class Bank
{
    ArrayList<Account> accountList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String bankName;

    Bank(String bankName)
    {
        this.bankName = bankName;
        System.out.println("Welceme To "+this.bankName);
        OpenBank();
    }

    public void OpenBank()
    {
        System.out.print("\nEnter 1 : Registeration \nEnter 2 : Check Account Exist Or Not\nEnter 3 : Account deletion\nEnter 4 : Account Operation\nEnter 5:List the accounts\n\nChoice ->");
        Integer choice = sc.nextInt();
        sc.nextLine();
        if(choice==1)
        {
            createAccountObject();
        }
        else if(choice==2)
        {
            checkAccount();
        }
        else if(choice==3)
        {
            deleteAccount();
        }
        else if(choice==4)
        {
            accountOperation();
        }
        else if(choice==5)
        {
            listAccounts();
        }
        else{
            
        }
    }

    public void createAccountObject()
    {
        Account account = new Account();
        accountList.add(account);
        OpenBank();
    }

    public void checkAccount()
    {
        System.out.print("Enter user name : ");
        String name = sc.nextLine();
        System.out.print("Enter pincode : ");
        String pincode = sc.nextLine();

        int found =0;
        for(Account i : accountList)
        {
            if(i.username.equals(name) && i.pincode.equals(pincode))
            {
                found=1;
                System.out.println("Account Found : "+i);
                break;
            }
            
        }

        if(found==1)
        {
            // System.out.println("Account Found : "+i);
        }
        else if(found==0)
        {
            System.out.println("Account NOT Found : ");
        }

        OpenBank();
    }


    public void deleteAccount()
    {
        System.out.print("\nEnter user name : ");
        String name = sc.nextLine();
        System.out.print("\nEnter pincode : ");
        String pincode = sc.nextLine();

        int found = 0;
        Account account = null;

        for(Account i : accountList)
        {
            if(i.username.equals(name) && i.pincode.equals(pincode))
            {
                found=1;
                account = i;
                break;
            }
            
        }

        if(found==1)
        {
        accountList.remove(account);
        System.out.print("\nAccount Deleted!!! ");

        }
        else
        {
            System.out.print("\nAccount NOT Deleted!!!");
        }

        OpenBank();
    }

    public void accountOperation()
    {
         
        Account account = getAccount();
        AccountOperation ao;
        if(account!=null)
        {
            ao = new AccountOperation(account);
        }

        OpenBank();
    }

    public Account getAccount()
    {
        System.out.print("\nEnter user name : ");
        String name = sc.nextLine();
        System.out.print("Enter pincode : ");
        String pincode = sc.nextLine();

        int found = 0;
        Account account = null;

        for(Account i : accountList)
        {
            if(i.username.equals(name) && i.pincode.equals(pincode))
            {
                found=1;
                account = i;
                break;
            }
            
        }

        return account;
    }

    public void listAccounts()
    {
        int count=1;
        System.out.println("\nINFORMATION : ");
        for(Account i : accountList)
        {
            System.out.print((count++)+" ");
            System.out.println(i);
        }

        OpenBank();
    }

    public static void main(String[] args)
    {
        new Bank("SBI");
    }
}