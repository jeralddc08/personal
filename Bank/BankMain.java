package Bank;

import java.util.Scanner;

public class BankMain {
	/**Create a bank class having account no, name, balance, phone no. 
	 * Display the Data. Insert the data and search the data according to account no. 
	 * if you enter a account no it should display the employee details using scanner class
	 *  develop this application. Use the object oriented concepts like creating class,objects etc.
	 *  ***/
	static Actions act= new Actions();
	String account_num ="";
	int bal = 0;
	public static void main (String[] args) {
		//User name is named account number
		BankMain b = new BankMain();
		boolean flag = true;
		int count = 0;
		Scanner ch = new Scanner(System.in);
		while (flag) {
			System.out.println("\n1: Create account \n"
					+"2: Enter Card \n"
					+"3: Search account \n"
					+ "4: Exit");
			
			
			int choi = ch.nextInt();
			ch.nextLine();
			switch(choi){
			case 1:
				System.out.println("Create account");
				createAccount(count);
				count++;
				break;
			case 2:
				System.out.println("Enter Card");
				if(b.login(count)) {
					System.out.println("Login Succesful!");
					//System.out.println(b.account_num);
					b.atm_menu(count);
				}else
					System.out.println("Login Not Succesful");
				
				break;
			case 5:
				System.out.println("Display: ");
				act.display(count);
				break;
			case 3:
				System.out.println("Search Account: ");
				System.out.println("Enter Account no.: ");
				String num = ch.next();
				
				//act.search(num,count);
				break;
			case 4:
				flag = false;
				break;
			default:
			}
		}
	}
	public static void createAccount(int count) {
		Scanner c = new Scanner(System.in);
		System.out.print("Enter Account no./Username : ");
		String account = c.nextLine();
		System.out.print("Enter Account password : ");
		String password = c.nextLine();
		System.out.print("Enter Name: ");
		String name = c.nextLine();
		System.out.print("Enter Balance: ");
		int balance = c.nextInt();
		System.out.print("Enter Phone no. : ");
		c.nextLine();
		String phone = c.nextLine();
		act.addAccount(account, name,password, balance, phone, count);
		
	}
	public boolean login(int count) {
		boolean login = false;
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter Account no./Username: ");
		String num = ch.next();
		System.out.println("Enter Password: ");
		String pass = ch.next();
		account_num = act.search(num, pass, count);
		
		if(account_num.equals("-")) {
			bal = act.balance(num, count);
			return login;
		}else
			return login=true;
				
	}
	
	public void atm_menu(int count) {
		Scanner ch = new Scanner(System.in);
		int choi;
		bal = act.balance(account_num, count);
		do {
			System.out.println("\n1: Check Balance \n"
					+"2: Deposit \n"
					+"3: Withdraw \n"
					+ "4: Exit");
			choi = ch.nextInt();
			ch.nextLine();
			switch(choi){
			case 1:
				System.out.println("Check Balance");
				System.out.println("Your balance is : "+bal);
				System.out.println("Enter any key to continue.");
				ch.nextLine();
				break;
			case 2:
				System.out.println("Deposit");
				System.out.println("Enter amount to deposit.");
				int deposit = ch.nextInt();
				bal = act.deposit(account_num,deposit, count);
				System.out.println("Your balance is : "+bal);
				System.out.println("Enter any key to continue.");
				ch.nextLine();
				ch.nextLine();
				break;
			case 3:
				System.out.println("Withdraw");
				System.out.println("Enter amount to deposit.");
				int withdraw = ch.nextInt();
				if (withdraw < bal) {
					bal = act.withdraw(account_num,withdraw, count);
				}else
					System.out.println("Insuficient Funds!");
				System.out.println("Your balance is : "+bal);
				System.out.println("Enter any key to continue.");
				ch.nextLine();
				ch.nextLine();
				break;
			case 4:
				account_num ="";
				bal = 0;
				break;
			}
		}while(choi != 4);
	}
	
	
}
	
	;
	