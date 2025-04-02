package com.filmindustry.movieapp;

import com.filmindustry.movieapp.distributor.Distributor;
import com.filmindustry.movieapp.movie.*;

public class MovieRunner {

    public static void main(String[] args) {
        System.out.println("Movie Industry System Started\n");

        // KGF: Chapter 2

        // Director Details:-
        Director director = new Director("Prashanth Neel", 42, 5);
        director.directorDetails();

        // Producer Details:-
        Producer producer = new Producer("Vijay Kiragandur", 45, "Hombale Films");
        producer.producerDetails();

        // Cinematographer Details:-
        Cinematographer cinematographer = new Cinematographer("Bhuvan Gowda", 40, 10);
        cinematographer.cinematographerDetails();

        // Editor Details:-
        Editor editor = new Editor("Ujwal Kulkarni", 25, 5);
        editor.editorDetails();

        // Actor Details:-
        Actor[] actors = new Actor[4];
        System.out.println("\nActors:");

        actors[0] = new Actor("Yash", 38, "Rocky Bhai");
        actors[1] = new Actor("Srinidhi Shetty", 31, "Reena Desai");
        actors[2] = new Actor("Raveena Tandon", 51, "Ramika Sen");
        actors[3] = new Actor("Sanjay Dutt", 65, "Adheera");

        for (Actor actor : actors) {
            actor.actorsDetails();
        }

        // Distributors Details:-
        Distributor[] distributors = new Distributor[3];
        System.out.println("\nDistributors:");

        distributors[0] = new Distributor("Hombale Films", "India", "Hombale Films");
        distributors[1] = new Distributor("Excel Entertainments", "Hindi Region", "Excel Entertainments");
        distributors[2] = new Distributor("Amazon Prime Video", "OTT", "Amazon Prime");

        for (Distributor distributor : distributors) {
            distributor.distributorDetails();
        }

        // Movie Details:-
        Movie movie = new Movie("KGF Chapter-2", "Action/Drama", 2.50, 2022, director, producer, actors, cinematographer, editor, distributors);
        movie.movieDetails();

        System.out.println("\nMovie Industry System Ended");
    }
}
