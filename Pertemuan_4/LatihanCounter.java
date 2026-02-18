public class LatihanCounter {
    public static void main(String[] args) {
        int counter = 10;

        System.out.println("=== COUNTER ===");
        System.out.println("Nilai Awal : " + counter);

        counter++;
        counter++;
        System.out.println("Setelah ++ (2x) : " + counter);

        counter--;
        System.out.println("Setelah -- : " + counter);

        counter+=5;
        System.out.println("Setelah += 5 : " + counter);

        counter-=3;
        System.out.println("Setelah -= 3 : " + counter);

        counter*=2;
        System.out.println("Setelah *= : " + counter);
    }
}