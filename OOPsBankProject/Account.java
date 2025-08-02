import java.util.Scanner;
class Account{

    String pincode="";
    String username = "";
    Double balance = 0d;
    Scanner sc = new Scanner(System.in);

    Account()
    {
        if(username=="")
        {
        System.out.println("\nRegisteraion!!!");
        System.out.println("\"Welcome To Account Creation\" ");
        starter();
        }
    }

    public void starter()
    {
            createAccount();
    }

    public void createAccount()
    {
        if(username.equals(""))
        {
        System.out.print("\nEnter UserName : ");
        this.username = sc.nextLine();
        createPincode();
        }
    }


    public void createPincode()
    {
        String check;
        if(this.pincode.equals(""))
        {
        System.out.print("Enter PinCode : ");
        this.pincode = sc.nextLine();
        System.out.println("\nPinCode Created Succefully!!!");
        }
        else{
            System.out.println("\nPinCode is already created !!!");
        }
        
    }

    // String getPin()
    // {
    //     return this.pincode;
    // }

    //  String getUsername()
    // {
    //     return this.username;
    // }

    public String toString()
    {
        return "\n{\nUserName : "+this.username+"\nPinCode : "+this.pincode+"\nBank Id : "+super.toString()+"\nBalance : "+this.balance+"$"+"\n}";
    }
}