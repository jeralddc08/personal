package Bank;

public class Account {
	//account no, name, balance, phone no. 
	 String account_num,name,phone,password;
	 
	 int size, bal;
	 Account(String account_num,String name,String password, int balance, String phone){
		 this.account_num = account_num;
		 this.name = name;
		 this.password = password;
		 this.bal = balance;
		 this.phone = phone;
		 
	 }
	 public String account() {
		 return this.account_num;
	 }
	 public String pass() {
		 return this.password;
	 }
	 public int bal() {
		 return this.bal;
	 }
	 public void dep(int hm) {
		 this.bal += hm;
	 }
	 public void with(int hm) {
		 this.bal -= hm;
	 }
	 public void display() {
		 System.out.println("Account no./Username : "+ this.account_num);
		 System.out.println("Name : "+ this.name);
		 System.out.println("Password : "+ this.password);
		 System.out.println("Balance: "+ this.bal);
		 System.out.println("Phone : "+ this.phone);
		 
	 }

}
