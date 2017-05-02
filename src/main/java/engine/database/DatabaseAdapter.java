package engine.database;

import java.sql.*;

public class DatabaseAdapter {

    private String path;
    private String jdbc;

    public DatabaseAdapter(String filename) {
        this.path = filename;
        this.jdbc = "jdbc:sqlite:" + filename;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            // could not find a JDBC adapter
            // warn user that sessions will not be saved
        }
    }

    public void save() {

    }

    public void load() {

    }

    public boolean set(int key, String value) {
        try {
            Connection connection = this.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS jsonmap (id integer, json string)");
            statement.executeUpdate("INSERT INTO jsonmap values(" + key + ", '" + value + "')");
            return true;
        } catch(SQLException e) {
            return false;
        }
    }

    public String get(int key) {
        try {
            Connection connection = this.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT json FROM jsonmap WHERE id=" + key);
            // we only care about the first entry, because they are unique
            rs.next();
            return rs.getString("json");
        } catch(SQLException e) {
            return null;
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.jdbc);
    }

}
