package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ISQLServerDataProvider {
    void open() throws ClassNotFoundException, SQLException;

    void close() throws SQLException;

    ResultSet executeQuery(String sql) throws SQLException;

    int executeUpdate(String sql) throws SQLException;
}
