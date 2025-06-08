# MySQL Database Connector

This simple Java program demonstrates how to establish a basic connection to a MySQL database server. It serves as a foundational example for more complex database interactions.

-----

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

Before you begin, make sure you have the following installed:

  * **Java Development Kit (JDK)**: Version 8 or higher. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/downloads/).

  * **MySQL Server**: Ensure your MySQL server is running. If you don't have it installed, you can download it from the [suspicious link removed].

  * **MySQL Connector/J**: This is the official JDBC driver for MySQL.

    You can download the JAR file from the [MySQL Connector/J download page](https://dev.mysql.com/downloads/connector/j/).

### Setup Instructions

1.  **Download the MySQL Connector/J JAR:**
    Go to the [MySQL Connector/J download page](https://dev.mysql.com/downloads/connector/j/) and download the platform-independent `mysql-connector-j-X.X.X.jar` file (replace `X.X.X` with the actual version number).

2.  **Save the Java file:**
    Save the provided Java code as `abc.java` in a directory of your choice.

3.  **Compile the Java code:**
    Open your terminal or command prompt, navigate to the directory where you saved `abc.java`, and compile it, including the MySQL Connector/J JAR in your classpath:

    ```bash
    javac -cp ".;path/to/mysql-connector-j-X.X.X.jar" abc.java
    ```

      * **On Windows:** Replace `path/to/mysql-connector-j-X.X.X.jar` with the actual path to your downloaded JAR file (e.g., `C:\Users\YourUser\Downloads\mysql-connector-j-X.X.X.jar`).
      * **On Linux/macOS:** Use `:` instead of `;` to separate classpath entries (e.g., `.:/path/to/mysql-connector-j-X.X.X.jar`).

4.  **Run the compiled code:**
    Execute the compiled Java class, again including the MySQL Connector/J JAR in your classpath:

    ```bash
    java -cp ".;path/to/mysql-connector-j-X.X.X.jar" abc
    ```

      * **On Windows:** Use `;` for classpath separation.
      * **On Linux/macOS:** Use `:` for classpath separation.

-----

## Configuration

Before running the code, you might need to adjust the following line in `abc.java`:

```java
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
```

  * `jdbc:mysql://localhost:3306/test`:
      * `localhost`: Replace `localhost` if your MySQL server is on a different host.
      * `3306`: This is the default MySQL port. Change it if your server uses a different port.
      * `test`: This is the database name. **Change `test` to the name of the database you want to connect to.**
  * `"root"`: This is the username for your MySQL connection. **Change `"root"` to your actual MySQL username.**
  * `""`: This is the password for your MySQL connection. **If your MySQL user has a password, enter it here within the quotes.** For example, `DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "your_user", "your_password");`.

-----

## Output

Upon successful execution, you should see the following message in your console:

```
Successfully connected to MySQL server...
```

If there's an issue, an exception message will be printed to `System.err`.

-----

