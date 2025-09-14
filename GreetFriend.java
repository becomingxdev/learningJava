public class GreetFriend {
    public static void main(String[] args) {
        
        //Using while loop
        int count = 1;
        while (count < 6) {
            System.out.println("Hello, friend #" + count);
            count++;
        }

        //Using for loop
        for(int i = 1; i < 6; i++) {
            System.out.println("Hello, friend #" + i);
        }

    }
    
}