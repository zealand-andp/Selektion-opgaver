package dk.docjava.grundlaeggende_programmering.selektion;

public class Opgave2 {
    // I denne løsning bliver programkode og testkode blandet lidt i forbindelse med initialisering af input.
    // Derudover er vi nødt til at genskrive programkoden hvis vi ønsker at teste programmet med forskellige input.
    // Alternativet er at placere programmet i en separat metode (se Opgave2_med_metode).

    public static void main(String[] args) {
        // Test case for sum større end hundrede
        // Input: x = 41, y = 67
        // Forventet output: output = "Summen er større end hundrede"

        // Programkode
        int x = 41;
        int y = 67;

        int sum = 41 + 67;

        String output = "";
        if (sum > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);

        // Testkode
        if (output == "Summen er større end hundrede")
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        // Test case for sum mindre end hundrede
        // Input: x = 25, y = 43
        // Forventet output: output = ""

        //Programkode
        x = 25;
        y = 43;

        sum = 25 + 43;

        output = "";
        if (sum > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);

        // Testkode
        if (output == "")
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }
}
