import java.util.Scanner;

public class WasteStatusCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter waste which iscollected in kg: ");
        double wasteCollected = scanner.nextDouble();

        if (wasteCollected >= 69) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}