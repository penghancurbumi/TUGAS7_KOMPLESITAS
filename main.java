import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        // Jenis koin yang tersedia dalam Rupiah
        int[] coins = {2, 3, 5, 10, 15}; // rupiah yang tersedia
        
        // Input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang ingin ditukarkan (dalam Rupiah): ");
        int amount = scanner.nextInt(); // Jumlah uang yang ingin ditukarkan
        
        // Menghitung jumlah koin yang dibutuhkan
        int[] coinCount = new int[coins.length];
        int totalNeeded = 0;

        // Menghitung jumlah koin yang dibutuhkan
        for (int i = coins.length - 1; i >= 0; i--) { // Mulai dari koin terbesar
            if (amount >= coins[i]) {
                coinCount[i] = amount / coins[i]; // Banyak koin dari jenis ini
                amount = amount % coins[i]; // Sisa jumlah uang setelah ditukarkan
                totalNeeded += coinCount[i] * coins[i]; // Menjumlahkan total Rupiah yang diperlukan
            }
        }

        // Menampilkan hasil
        System.out.println("Jumlah uang yang diperlukan:");
        for (int i = 0; i < coins.length; i++) {
            if (coinCount[i] > 0) {
                System.out.println(coins[i] + " ribu: " + coinCount[i] + " lembar");
            }
        }
        // Jika masih ada uang yang tersisa
        if (amount > 0) {
            System.out.println("Tidak dapat menukarkan sisa uang sebesar: " + amount + " Rupiah");
        }

        scanner.close();
    }
}
