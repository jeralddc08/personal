package Bank;

import java.util.Scanner;

public class Actions {
	public Account account[] = new Account[100];
	

	public void addAccount(String account_num,String name,String password, int balance, String phone, int count) {
		
		account[count]= new Account(account_num,name,password,balance,phone);
		account[count].display();
		
	}
	public void display(int count) {
		System.out.println(count);
		for (int i = 0; i < count;i++) {
			
			account[i].display();
		}
	}
	public String search(String num,String pass,int count) {
		int i =0;
		boolean found = false;
		String acc="-";
		while ((i < count) & !found){
			if ((account[i].account().equals(num)) & (account[i].pass().equals(pass)) ) {
				found = true;
				return acc = account[i].account();
			}
			i++;
		}
		return acc;
	}
	
	public int balance(String num,int count) {
		int i =0;
		boolean found = false;
		int acc=0;
		while ((i < count) & !found){
			if (account[i].account().equals(num)) {
				found = true;
				return acc = account[i].bal();
			}
			i++;
		}
		return acc;
	}
	public int deposit(String num,int dep,int count) {
		int i =0;
		boolean found = false;
		int acc=0;
		while ((i < count) & !found){
			if (account[i].account().equals(num)) {
				found = true;
				account[i].dep(dep);
				return acc = account[i].bal();
			}
			i++;
		}
		return acc;
	}
	public int withdraw(String num,int dep,int count) {
		int i =0;
		boolean found = false;
		int acc=0;
		while ((i < count) & !found){
			if (account[i].account().equals(num)) {
				found = true;
				account[i].with(dep);
				return acc = account[i].bal();
			}
			i++;
		}
		return acc;
	}
}
