package assessment.basicProgrammingConcepts;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main (String[] args) {

        String[] dogBreeds = {"St, Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman",
        "German Shepherd", "Bulldog", "Labrador Retriever", "Golden Retriever", "Poodle", "Siberian Husky"};

        System.out.print("What is your dogs name? ");
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println();

        System.out.println(name + " is: ");
        System.out.println();

        DogGenetics chooser = new DogGenetics();
        chooser.chooseBreeds(dogBreeds);

        System.out.println("Wow, that's QUITE a dog!");


    }

    public void chooseBreeds(String[] breeds){
        Random randomizer = new Random();

        String[] dogBreeds = breeds.clone();

        int sumPerc = 100;
        for (int i=0; i<5; i++){
            int dogBreedNr = randomizer.nextInt(dogBreeds.length);
            String dogBreedPick = dogBreeds[dogBreedNr];
            if(dogBreedPick == null) {
                i--;
            } else {
                int percent;
                if(i != 4) {
                    percent = randomizer.nextInt(sumPerc-(5-i-1)) + 1;
                }
                else {
                    percent = sumPerc;
                }
                sumPerc = sumPerc - percent;
                System.out.println(percent + "% " + dogBreedPick);
                dogBreeds[dogBreedNr] = null;
            }
        }
        System.out.println();
    }
}
