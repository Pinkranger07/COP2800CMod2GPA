// PalmerPenguinsM2.java
// Nyesha Littles
// 5/30/2026
// Program to calculate and display Palmer Penguin statistics

public class PalmerPenguinsM2 {

    // Constants to represent the species
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";
    static final int TOTAL_SPECIES = 3;

    // New constants representing individual counts for each species
    static final int NUM_CHINSTRAP = 68;
    static final int NUM_GENTOO = 123;
    static final int NUM_ADELIE = 151;

    public static void main(String[] args) {

        // Output the species names with introductory text
        System.out.println("Introducing the Palmer Penguins:");
        System.out.println(SP_CHINSTRAP + "!");
        System.out.println(SP_GENTOO + "!");
        System.out.println("and last but not least...");
        System.out.println(SP_ADELIE + "!");
        
        System.out.println("There are a total of " + TOTAL_SPECIES + 
            " penguin species in this dataset.");

        // Calculate the total number of penguins
        int totalPenguins = NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;
        System.out.println("There are a total of " + totalPenguins + 
            " penguins in the dataset.");

        // Display percentages using formatted output (printf)
        System.out.printf("%s: %d (%.2f%%)\n", SP_CHINSTRAP, NUM_CHINSTRAP,
            ((double) NUM_CHINSTRAP / totalPenguins * 100));

        System.out.printf("%s: %d (%.2f%%)\n", SP_GENTOO, NUM_GENTOO,
            ((double) NUM_GENTOO / totalPenguins * 100));

        System.out.printf("%s: %d (%.2f%%)\n", SP_ADELIE, NUM_ADELIE,
            ((double) NUM_ADELIE / totalPenguins * 100));
    }
}