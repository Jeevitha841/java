package com.filmindustry.movieapp.movie;

import com.filmindustry.movieapp.distributor.Distributor;

public class Movie {
    public String titel;
    public String genre;
    public double duration;
    public int releaseYear;
    public Director director;
    public Producer producer;
    public Actor[] actors;
    public Cinematographer cinematographer;
    public Editor editor;
    public Distributor[] distributor;

    public Movie(String titel, String genre, double duration, int releaseYear, Director director, Producer producer, Actor[] actors, Cinematographer cinematographer, Editor editor, Distributor[] distributor) {
        this.titel = titel;
        this.genre = genre;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.director = director;
        this.producer = producer;
        this.actors = actors;
        this.cinematographer = cinematographer;
        this.editor = editor;
        this.distributor = distributor;
    }

    public void movieDetails() {
        System.out.println("\nMovie Title: " + this.titel);
        System.out.println("Movie Genre: " + this.genre);
        System.out.println("Movie Duration: " + this.duration + " Hours");
        System.out.println("Movie Release Year: " + this.releaseYear);
        System.out.println("Movie Director: ");
        this.director.directorDetails();
        System.out.println("Movie Producer: ");
        this.producer.producerDetails();
        for (Actor actor : actors) {
            actor.actorsDetails();
        }
        System.out.println("Movie Cinematographer: ");
        this.cinematographer.cinematographerDetails();
        System.out.println("Movie Editor: ");
        this.editor.editorDetails();
        for (Distributor distributors : distributor) {
            distributors.distributorDetails();
        }
    }
}
