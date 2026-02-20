public class LatihanLogin {
    public static void main(String[] args) {
        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username    : admin");
        System.out.println("Password    : ****");
        System.out.println("---");

        String adminLogin = "admin";
        String passwordLogin = "admin12345";

        if(adminLogin == "admin")
        {
            System.out.println("Username Valid");

            if(passwordLogin == "admin123")
            {
                System.out.println("Password Benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
                
            }
            else{
                System.out.println("Password Salah");
                System.out.println("LOGIN GAGAL!");
            }
        }
        else{
            System.out.println("Username Salah");

            if(passwordLogin == "admin123")
            {
                System.out.println("Password Benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            }
            else{
                System.out.println("Password Salah");
                System.out.println("LOGIN GAGAL!");
            }
        }
    }
}