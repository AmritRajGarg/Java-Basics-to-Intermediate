# Student Record Inserter

This Java program demonstrates how to connect to a MySQL database, create a database and table if they don't exist, and then insert a new student record. It's a foundational example for basic database manipulation in Java.

---

## Getting Started

Follow these steps to set up and run the program on your local machine.

### Prerequisites

Before you begin, ensure you have the following installed:

* **Java Development Kit (JDK)**: Version 8 or higher.
* **MySQL Server**: Make sure your MySQL server is running.
* **MySQL Connector/J**: This is the official JDBC driver for MySQL. You'll need the JAR file. If you don't have it, download it from the [MySQL Connector/J download page](https://dev.mysql.com/downloads/connector/j/).

### Setup Instructions

1.  **Prepare your MySQL Database:**
    You'll need to create a database named `Student` and a table named `stud_rec` within it. You can do this using a MySQL client (like MySQL Workbench, phpMyAdmin, or the MySQL command line).

    Open your MySQL client and execute the following SQL commands:

    ```sql
    CREATE DATABASE IF NOT EXISTS Student;

    USE Student;

    CREATE TABLE IF NOT EXISTS stud_rec (
        roll_no INT PRIMARY KEY,
        name VARCHAR(20)
    );
    ```

    * `CREATE DATABASE IF NOT EXISTS Student;`: This creates a database named `Student` if it doesn't already exist.
    * `USE Student;`: This selects the `Student` database for subsequent operations.
    * `CREATE TABLE IF NOT EXISTS stud_rec (roll_no INT PRIMARY KEY, name VARCHAR(20));`: This creates a table named `stud_rec` with two columns:
        * `roll_no`: An integer column that serves as the primary key.
        * `name`: A varchar column to store names, with a maximum length of 20 characters.

2.  **Download MySQL Connector/J:**
    If you haven't already, download the `mysql-connector-j-X.X.X.jar` file from the [MySQL Connector/J download page](https://dev.mysql.com/downloads/connector/j/). Replace `X.X.X` with the actual version number.

3.  **Save the Java file:**
    Save the provided Java code as `InsertStudentRecord.java` in a directory of your choice.

4.  **Compile the Java code:**
    Open your terminal or command prompt, navigate to the directory where you saved `InsertStudentRecord.java`, and compile it, including the MySQL Connector/J JAR in your classpath:

    ```bash
    javac -cp ".;path/to/mysql-connector-j-X.X.X.jar" InsertStudentRecord.java
    ```

    * **On Windows:** Replace `path/to/mysql-connector-j-X.X.X.jar` with the actual path to your downloaded JAR file (e.g., `C:\Users\YourUser\Downloads\mysql-connector-j-X.X.X.jar`).
    * **On Linux/macOS:** Use `:` instead of `;` to separate classpath entries (e.g., `.:/path/to/mysql-connector-j-X.X.X.jar`).

5.  **Run the compiled code:**
    Execute the compiled Java class, again including the MySQL Connector/J JAR in your classpath:

    ```bash
    java -cp ".;path/to/mysql-connector-j-X.X.X.jar" InsertStudentRecord
    ```

    * **On Windows:** Use `;` for classpath separation.
    * **On Linux/macOS:** Use `:` for classpath separation.

---

## Configuration

You may need to modify the following lines in `InsertStudentRecord.java` to match your MySQL setup:

```java
String url = "jdbc:mysql://localhost:3306/Student"; // Your database URL
String username = "root"; // Default XAMPP username
String password = ""; // Default XAMPP password (empty)
```

* **`url`**:
    * `localhost`: Change this if your MySQL server is on a different host.
    * `3306`: This is the default MySQL port. Change it if your server uses a different port.
    * `Student`: This is the database name. **Ensure this matches the database you created in step 1 of the setup.**
* **`username`**: **Change `"root"` to your actual MySQL username.**
* **`password`**: **If your MySQL user has a password, enter it here within the quotes.** For example, `String password = "mysecretpassword";`.

You can also change the `rollNo` and `name` variables to insert different values:

```java
int rollNo = 123;
String name = "Amrit Raj Garg";
```

---

## Output

Upon successful execution, you should see the following message in your console:

```
1 record inserted.
```

If there's an error, a stack trace detailing the exception will be printed.

---

## What's Next?

This program provides a basic example of inserting a single record. Consider enhancing it by:

* Taking `rollNo` and `name` as user input.
* Implementing methods to read, update, or delete records.
* Adding more robust error handling.
* Using a `try-with-resources` statement for automatic closing of `Connection` and `PreparedStatement`.
