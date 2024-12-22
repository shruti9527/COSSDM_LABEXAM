public class evenNo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 200; i += 2) {
            sum += i;
        }
        System.out.println("Sum of first 100 even numbers: " + sum);
    }
}


//git config --get user.name
//git config --get user.email
git config --get user.name
git config --global user.name "YourCorrectUsername"
git config --global user.email "your-email@example.com"
git remote -v
git remote set-url origin https://<your_username>:<your_token>@github.com/shruti9527/COSSDM_LABEXAM.git
git credential-manager erase
