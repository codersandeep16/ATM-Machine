package ATMMachine;

import java.util.Scanner;

class ATM {

	float Balance;
	int PIN = 5627;

//	Menu function

	public void checkpin() {
		System.out.println("Enter Your Pin");

		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		if (enterpin == PIN) {
			menu();
		} else {
			System.out.println("Enter a valid pin");
			menu();
		}
	}

	public void menu() {
		System.out.println("Enter Your Choice :");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Mony");
		System.out.println("3. Deposit Mony");
		System.out.println("4. Exit");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		if (opt == 1) {
			checkBalance();
		} else if (opt == 2) {
			withdrawMony();
		} else if (opt == 3) {
			depositMony();
		} else if (opt == 4) {
			return;
		}

		else {
			System.out.println("Enter a valid choice");
		}
	}

	public void checkBalance() {
		System.out.println("Balance:" + Balance);
		menu();
	}

	public void withdrawMony() {
		System.out.println("Enter Amount to Withdraw:");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if (amount > Balance) {
			System.out.println("Insufficient Balance");
		} else {
			Balance = Balance - amount;
			System.out.println("Mmony Withdrawl Successful");
		}

		menu();
	}

	public void depositMony() {
		System.out.println("Enter amount: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Mony Deposit Successfully");
		menu();
	}
}

public class ATMMachine {
	public static void main(String[] args) {
		ATM obj=new ATM();
		obj.checkpin();
	}

}
