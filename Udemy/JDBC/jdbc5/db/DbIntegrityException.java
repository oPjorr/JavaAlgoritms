package Udemy.JDBC.jdbc5.db;

import java.io.Serial;

public class DbIntegrityException extends RuntimeException {
  @Serial
  private static final long serialVersionUID = 1L;
    public DbIntegrityException(String message) {
        super(message);
    }
}
