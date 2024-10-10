package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLServerDataProvider implements ISQLServerDataProvider{

    private Connection connection;
    private static final String DB_URL = "jdbc:sqlserver://SUPERCOW\\SQLEXPRESS:1433;"
            + "databaseName=QLNS;"
            + "encrypt=true;"
            + "trustServerCertificate=true";

    private static final String USER_NAME = "myuser";
    private static final String PASSWORD = "myuser";

    @Override
    public void open() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        this.connection = DriverManager.getConnection(SQLServerDataProvider.DB_URL,
                SQLServerDataProvider.USER_NAME,
                SQLServerDataProvider.PASSWORD);
    }

    @Override
    public void close() throws SQLException {
        this.connection.close();

    }

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(sql);
    }
}

