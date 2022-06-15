package com.example.assignment1gc200474646;
import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
    private static String user = DBCredentials.user;
    private static String password = DBCredentials.password;
    private static String connectURL = "jdbc:mysql://172.31.22.43:3306/Twisha200474646";

    public static ArrayList<Movies> getMoviesFromDB(){
        ArrayList<Movies> movies = new ArrayList<>();

        String sql = "SELECT*FROM MoviesOnStreamingPlatforms";

        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                String title = resultSet.getString("Title");
               int year = resultSet.getInt("Year");
                String age = resultSet.getString("Age");
                int imdb = resultSet.getInt("IMDb");
                String rottenTomatoes = resultSet.getString("Rotten Tomatoes");
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
                int id  = resultSet.getInt("Id");


                movies.add(new Movies(title,year,age,imdb,rottenTomatoes,netflix,hulu,primeVideo,disneyPlus,type,directors,genres,country,language,runtime,id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movies;
    }
    public static XYChart.Series<String, Integer> getRuntimeStats(){
        XYChart.Series<String, Integer> series = new XYChart.Series<>();

        String sql = "SELECT title , Runtime "+
                "FROM MoviesOnStreamingPlatforms "+
                "limit 10";

        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                String title = resultSet.getString("Title");

                int runtime = resultSet.getInt("Runtime");

                series.getData().add(new XYChart.Data<>(title,runtime));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return series;

    }
}



