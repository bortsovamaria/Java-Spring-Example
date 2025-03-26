package learn.school.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
public class PostgreSqlJDBC {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5454/postgres";
        String user = "postgres";
        String password = "mysecretpassword";

        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                log.info("Подключение к базе данных установлено!");
            } else {
                log.info("Не удалось установить подключение к базе данных.");
            }

            createTable(conn);

            insertData(conn, "John Doe", "john.doe@example.com");
            insertData(conn, "Jane Smith", "jane.smith@example.com");

            selectData(conn);

        } catch (ClassNotFoundException e) {
            log.error("Драйвер PostgreSQL не найден.", e);
        } catch (SQLException e) {
            log.error("Ошибка при подключении к базе данных.", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    log.info("Соединение с базой данных закрыто.");
                }
            } catch (SQLException e) {
                log.error("Failed");
            }
        }
    }

    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "id SERIAL PRIMARY KEY, " +
                "name VARCHAR(100) NOT NULL, " +
                "email VARCHAR(100) NOT NULL)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.execute();
            System.out.println("Таблица создана или уже существует.");
        }
    }

    private static void insertData(Connection conn, String name, String email) throws SQLException {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            int rowsInserted = stmt.executeUpdate();
            System.out.println(rowsInserted + " строк вставлено.");
        }
    }

    private static void selectData(Connection conn) throws SQLException {
        String sql = "SELECT id, name, email FROM users";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("Данные из таблицы users:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        }
    }
}