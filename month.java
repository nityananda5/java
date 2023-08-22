import java.util.Scanner;

public class month {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the month (1-12): ");
		String month = scanner.nextLine();

		int days = getDaysInMonth(month);

		if (days == -1) {
			System.out.println("Invalid month input. Please enter a value between 1 and 12.");
		} else {
			System.out.println("Number of days in month " + month + ": " + days);
		}

		scanner.close();
	}

	public static int getDaysInMonth(String month) {
		switch (month) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "octuber":
		case "december":
			return 31;
		case "april":
		case "june":
		case "september":
		case "november":
			return 30;
		case "febuary":
			return 28;
		default:
			return -1;
		}
	}
}
