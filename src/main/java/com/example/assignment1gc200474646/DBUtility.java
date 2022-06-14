package com.example.assignment1gc200474646;
import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static String user = DBCredentials.user;
    private static String password = DBCredentials.password;
    private static String connectURL = "jdbc:mysql://127.0.0.1:3308/moviesonstreamingplatforms";

    public static ArrayList<Movies> getMoviesFromDB(){
        ArrayList<Movies> movies = new ArrayList<>();

        String sql = "SELECT moviesonstreamingplatforms.ID,title,year,age,directors,genres"+" FROM moviesstreamingplatforms";

        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                String title = resultSet.getString("Title");
               int year = resultSet.getInt("Year");
                int age = resultSet.getInt("Age");
                int imdb = resultSet.getInt("IMDb");
                int rottenTomatoes = resultSet.getInt("Rotten Tomatoes");
                double netflix = resultSet.getDouble("Netflix");
                double hulu = resultSet.getDouble("Hulu");
                double primeVideo = resultSet.getDouble("Prime Video");
                double disneyPlus = resultSet.getDouble("DisneyPlus");
                int type = resultSet.getInt("Type");
                String directors = resultSet.getString("Directors");
                String genres = resultSet.getString("Genres");
                String country = resultSet.getString("Country");
                String language = resultSet.getString("Language");
                int runtime = resultSet.getInt("Runtime");

                movies.add(new Movies(title,year,age,imdb,rottenTomatoes,netflix,hulu,primeVideo,disneyPlus,type,directors,genres,country,language,runtime));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movies;
    }
}



