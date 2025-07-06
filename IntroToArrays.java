public class IntroToArrays {
    public static void main(String[] args) {
        String[] favMovies = new String[3];
        
        favMovies[0] = "Bahubali";
        favMovies[1] = "Kaithi";
        favMovies[2] = "Leo";

        for (int i = 0; i < favMovies.length; i++) {
            System.out.println("My fav movie no. " + (i + 1) + " is: " + favMovies[i]);
        }
    }
}