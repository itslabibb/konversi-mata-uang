import java.util.Scanner;

public class uang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat = "";

        // Exchange rates
        double rateUSD = 0.000065; // IDR to USD
        double rateEUR = 0.000061; // IDR to EUR
        double rateJPY = 0.0097;   // IDR to JPY
        double rateCNY = 0.00047;  // IDR to CNY

        do {
            System.out.println("Pilih mata uang tujuan:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. JPY");
            System.out.println("4. CNY");

            System.out.print("Masukkan pilihan (1-4): ");
            int choice = scanner.nextInt();

            System.out.print("Jumlah IDR: ");
            double amountIDR = scanner.nextDouble();

            double convertedAmount = 0;
            String currency = "";

            if (choice == 1) {
                convertedAmount = amountIDR * rateUSD;
                currency = "USD";
            } else if (choice == 2) {
                convertedAmount = amountIDR * rateEUR;
                currency = "EUR";
            } else if (choice == 3) {
                convertedAmount = amountIDR * rateJPY;
                currency = "JPY";
            } else if (choice == 4) {
                convertedAmount = amountIDR * rateCNY;
                currency = "CNY";
            } else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            System.out.printf("Hasil konversi: %.2f %s%n", convertedAmount, currency);

            System.out.print("Apakah ingin melakukan konversi kembali? (y/n): ");
            repeat = scanner.next();

            // Nested loop example
            for (int i = 0; i < 1; i++) {
                if (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n")) {
                    System.out.println("Input tidak valid. Harap masukkan 'y' atau 'n'.");
                    System.out.print("Apakah ingin melakukan konversi kembali? (y/n): ");
                    repeat = scanner.next();
                }
            }
        } while (repeat.equalsIgnoreCase("y"));

        scanner.close();
        System.out.println("Terima kasih telah menggunakan aplikasi konversi mata uang.");
    }
}