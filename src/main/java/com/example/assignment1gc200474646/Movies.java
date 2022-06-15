package com.example.assignment1gc200474646;

public class Movies {
    private String title;
    private int year;
    private String age;
    private int imdb;
    private String rottenTomatoes;
    private double netflix;
    private double hulu;
    private double primeVideo;
    private double disneyPlus;
    private int type;
    private String directors;
    private String genres;
    private String country;
    private String language;
    private int runtime;
    private int id;

    public Movies(String title, int year, String age, int imdb, String rottenTomatoes, double netflix, double hulu, double primeVideo, double disneyPlus, int type, String directors, String genres, String country, String language, int runtime) {
        this.title = title;
        this.year = year;
        this.age = age;
        this.imdb = imdb;
        this.rottenTomatoes = rottenTomatoes;
        this.netflix = netflix;
        this.hulu = hulu;
        this.primeVideo = primeVideo;
        this.disneyPlus = disneyPlus;
        this.type = type;
        this.directors = directors;
        this.genres = genres;
        this.country = country;
        this.language = language;
        this.runtime = runtime;
    }

    public Movies(String title, int year, String age, int imdb, String rottenTomatoes, double netflix, double hulu, double primeVideo, double disneyPlus, int type, String directors, String genres, String country, String language, int runtime, int id) {
        this(title,year,age,imdb,rottenTomatoes,netflix,hulu,primeVideo,disneyPlus,type,directors,genres,country,language, runtime);
        setId(id);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0)
        this.id = id;
        else
            throw new IllegalArgumentException("Id should be > 0");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getImdb() {
        return imdb;
    }

    public void setImdb(int imdb) {
        this.imdb = imdb;
    }

    public String getRottenTomatoes() {
        return rottenTomatoes;
    }

    public void setRottenTomatoes(String rottenTomatoes) {
        this.rottenTomatoes = rottenTomatoes;
    }

    public double getNetflix() {
        return netflix;
    }

    public void setNetflix(double netflix) {
        this.netflix = netflix;
    }

    public double getHulu() {
        return hulu;
    }

    public void setHulu(double hulu) {
        this.hulu = hulu;
    }

    public double getPrimeVideo() {
        return primeVideo;
    }

    public void setPrimeVideo(double primeVideo) {
        this.primeVideo = primeVideo;
    }

    public double getDisneyPlus() {
        return disneyPlus;
    }

    public void setDisneyPlus(double disneyPlus) {
        this.disneyPlus = disneyPlus;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
