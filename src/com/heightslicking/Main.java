package com.heightslicking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // - Single Comment
        /* Block Comment */

        //Phase 1

        Scanner keyboard;
        String noun;
        String verb;
        String adjective;
        String organ;
        String verbFive;
        String verbSix;
        String object;
        String verbTwo;
        String movement;
        String verbEight;
        String verbSeven;
        String verbFour;
        String verbThree;
        String bodyPart;
        String verbNine;
        String verbTen;
        String objectTwo;
        String thing;
        String feeling;
        String emotion;
        //Phase 2

        keyboard = new Scanner(System.in);
        System.out.println("Give me a verb");
        verb = keyboard.nextLine();
        System.out.println("Okay now give me another verb there's a lot of these");
        verbSeven = keyboard.nextLine();
        System.out.println("Nice, now give me an object.");
        object = keyboard.nextLine();
        System.out.println("I know, but another verb.");
        verbThree = keyboard.nextLine();
        System.out.println("Another verb please, really sorry");
        verbSix = keyboard.nextLine();
        System.out.println("Give me a adjective.");
        adjective = keyboard.nextLine();
        System.out.println("Give me another verb.");
        verbFour = keyboard.nextLine();
        System.out.println("I need an organ no reason why");
        organ = keyboard.nextLine();
        System.out.println("Give me another verb");
        verbFive = keyboard.nextLine();
        System.out.println("I need another verb too");
        verbTwo = keyboard.nextLine();
        System.out.println("Okay so this is going to be repetitive, but another verb");
        verbEight = keyboard.nextLine();
        System.out.println("MOVE give me a movement");
        movement = keyboard.nextLine();
        System.out.println("Okay give me a noun");
        noun = keyboard.nextLine();
        System.out.println("okay I need a body part");
        bodyPart = keyboard.nextLine();
        System.out.println("I need a adjective");
        adjective = keyboard.nextLine();
        System.out.println("And it's back another verb");
        verbNine = keyboard.nextLine();
        System.out.println("annnnd another verb there was alot of these");
        verbTen = keyboard.nextLine();
        System.out.println("I need another object please");
        objectTwo = keyboard.nextLine();
        System.out.println("Name me a thing");
        thing = keyboard.nextLine();
        System.out.println("I need feeling name me a feeling of emotion");
        feeling = keyboard.nextLine();
        System.out.println("i need another emotion give me it");
        emotion = keyboard.nextLine();

        //Phase 3

        System.out.println("We "+verb + ", we "+verbTwo + ", our "+ organ + " in vain");
        System.out.println("We "+verbFive + ", never asking why");
        System.out.println("We "+verbFour + ", I "+verbThree + " under your "+objectTwo);
        System.out.println("A "+feeling + " no one could deny");
        System.out.println("Don't you ever say I just "+verbSix + " away");
        System.out.println("I will always "+verbSeven + " you");
        System.out.println("I can't "+verbNine + " a lie, "+verbEight + " for my "+thing);
        System.out.println("I will always want you");
        System.out.println("I came in like a "+object);
        System.out.println("I never "+verbTen + " so "+adjective + " in "+emotion);
        System.out.println("All I wanted was to break your "+bodyPart);
        System.out.println("All you ever did was wreak "+noun);
        System.out.println("Yeah, you "+movement + " me");
    }
}
