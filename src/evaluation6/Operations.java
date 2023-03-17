package evaluation6;

import java.sql.*;
import java.util.Scanner;

public class Operations {
    Scanner sc = new Scanner(System.in);

    void insidermenustudent() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter choice : \n 0: Exit \n 1: Insert \n 2: update \n 3: Retrive \n 4: Delete ");
            int choice = sc.nextInt();
            switch (choice) {

                case 0:
                    exit = true;
                    break;

                case 1:
                    Studentinsert();
                    break;

                case 2:
                    Studentupdate();
                    break;
                case 3:
                    StudentRetrive();
                    break;

                case 4:
                    StudentDelete();
                    break;

            }
        }
    }

    void insidermenuteacher() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter choice : \n 0: Exit \n 1: Insert \n 2: update \n 3: Retrive \n 4: Delete ");
            int choice = sc.nextInt();
            switch (choice) {

                case 0:
                    exit = true;
                    break;

                case 1:
                    teacherInsert();
                    break;

                case 2:
                    Studentupdate();
                    break;
                case 3:
                    StudentRetrive();
                    break;

                case 4:
                    StudentDelete();
                    break;

            }
        }
    }


    void Studentinsert() {
        Connection connection;
        PreparedStatement ps;
        ResultSet resultSet;

        int id;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");

            System.out.println("Enter id :");
            id = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter subject ");
            String subject = sc.next();
            System.out.println("Enter city");
            String city = sc.next();
            System.out.println("Enter marks");
            int marks = sc.nextInt();

            ps = connection.prepareStatement("insert into Student (id,name,subject,city,marks) values (?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, subject);
            ps.setString(4, city);
            ps.setInt(5, marks);

            ps.execute();

            System.out.println("Data Added");


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    void teacherInsert() {
        Connection connection;
        PreparedStatement ps;
        ResultSet resultSet;

        int id;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");

            System.out.println("Enter id :");
            id = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter subject ");
            String subject = sc.next();
            System.out.println("Enter city");
            String city = sc.next();
            System.out.println("Enter Salary ");
            int Salary = sc.nextInt();
            System.out.println("Enter Experience ");
            int experience = sc.nextInt();
            System.out.println("Enter id of Student ");
            int studentId=sc.nextInt();
            ps = connection.prepareStatement(" insert into teacher (tid,tname,tsubject,tcity,tSalary,experience,sid) values (?,?,?,?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, subject);
            ps.setString(4, city);
            ps.setInt(5, Salary);
            ps.setInt(6, experience);
            ps.setInt(7,studentId);


            ps.execute();

            System.out.println("Data Added");


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    void Studentupdate() {
        Connection connection;
        PreparedStatement ps;
        ResultSet resultSet;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");
            System.out.println("Enter Student id");
            int Studentid = sc.nextInt();
            System.out.println("Enter updated Marks :");
            int updatedMarks=sc.nextInt();
            ps = connection.prepareStatement("update Student set marks = "+updatedMarks+" where id="+Studentid);
            ps.executeUpdate();
            System.out.println("Updated The Record");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

    void teacherUpdate() {
        Connection connection;
        PreparedStatement ps;
        ResultSet resultSet;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");
            System.out.println("Enter teacher id");
            int teacherid = sc.nextInt();
            System.out.println("Enter updated Salary :");
            int updatedSalary=sc.nextInt();
            ps = connection.prepareStatement("update Student set marks = "+updatedSalary+" where id="+teacherid);
            ps.executeUpdate();
            System.out.println("Updated The Record");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

    void StudentRetrive() {

        Connection connection;
        Statement statement;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");
            statement = connection.createStatement();
            System.out.println("Enter id :");
            int sid = sc.nextInt();
            System.out.println("ID :");
            rs = statement.executeQuery("select * from Student where id=" + sid);

            while (rs.next()) {
                System.out.println("Student Details are : ");
                System.out.println("id : " + rs.getInt(1));
                System.out.println(" name : " + rs.getString(2));
                System.out.println("Subject : " + rs.getString(3));
                System.out.println("City : " + rs.getString(4));
                System.out.println("marks : " + rs.getString(5));

                System.out.println("----------------------");
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    void teacherRetrieve() {

        Connection connection;
        Statement statement;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");
            statement = connection.createStatement();
            System.out.println("Enter id :");
            int tid = sc.nextInt();
            System.out.println("ID :");
            rs = statement.executeQuery("select * from teacher where id=" + tid);

            while (rs.next()) {
                System.out.println("Teacher Details are : ");
                System.out.println("id : " + rs.getInt(1));
                System.out.println(" name : " + rs.getString(2));
                System.out.println("Subject : " + rs.getString(3));
                System.out.println("City : " + rs.getString(4));
                System.out.println("Salary : " + rs.getInt(5));
                System.out.println("Experience : "+ rs.getInt(6));


                System.out.println("----------------------");
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    void StudentDelete() {
        Connection connection;
        PreparedStatement ps;
        ResultSet resultSet;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");
            System.out.println("Enter Student id");
            int Studentid = sc.nextInt();
            ps = connection.prepareStatement("delete from Student where id=" + Studentid);
            ps.execute();
            System.out.println("Deletion Done");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

    void teacherDelete() {
        Connection connection;
        PreparedStatement ps;
        ResultSet resultSet;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");
            System.out.println("Enter Teacher id");
            int teacherId = sc.nextInt();
            ps = connection.prepareStatement("delete from teacher where id=" + teacherId);
            ps.execute();
            System.out.println("Deletion Done");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    void Query5() {
        Connection connection;
        Statement statement;
        ResultSet rs;


        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID :");
            try {
                rs = statement.executeQuery(" select * from Student where name like 'z%'");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            while (rs.next()) {
                System.out.println("teacher Details are : ");
                System.out.println("id : " + rs.getInt(1));
                System.out.println(" name : " + rs.getString(2));
                System.out.println("Subject : " + rs.getString(3));
                System.out.println("City : " + rs.getString(4));
//                System.out.println(" : " + rs.getString(5));
//                System.out.println("experience  : " + rs.getInt(6));


                System.out.println("----------------------");
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void Query6() {
        Connection connection;
        Statement statement;
        ResultSet rs;


        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID :");
            try {
                rs = statement.executeQuery(" select * from teacher where experience >=5 and tsalary >=50000");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            while (rs.next()) {
                System.out.println("teacher Details are : ");
                System.out.println("id : " + rs.getInt(1));
                System.out.println(" name : " + rs.getString(2));
                System.out.println("Subject : " + rs.getString(3));
                System.out.println("City : " + rs.getString(4));
                System.out.println("salary : " + rs.getString(5));
                System.out.println("experience  : " + rs.getInt(6));


                System.out.println("----------------------");
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void Query7() {
        Connection connection;
        Statement statement;
        ResultSet rs;


        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Evaluation6", "root", "Sujan@123");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ID :");
            try {
                rs = statement.executeQuery(" SELECT Student.* FROM Student INNER JOIN teacher ON Student.id = teacher.sid WHERE teacher.tcity IN ('Pune', 'Mumbai') AND teacher.tname LIKE '%a'");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            while (rs.next()) {
                System.out.println(" Details are : ");
                System.out.println("id : " + rs.getInt(1));
                System.out.println(" name : " + rs.getString(2));
                System.out.println("Subject : " + rs.getString(3));
                System.out.println("City : " + rs.getString(4));



                System.out.println("----------------------");
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
/*Enter choice :
 0: EXIT
 1: Student Insertion
 2: Student  Update
 3: Student Retrieve
 4: Student Delete
 5: query 5
1
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
Enter id :
3
Enter name
sujan
Enter subject
c
Enter city
nanded
Enter marks
78
Data Added
Enter choice :
 0: EXIT
 1: Student Insertion
 2: Student  Update
 3: Student Retrieve
 4: Student Delete
 5: query 5
3
Enter id :
2
ID :
Student Details are :
id : 2
 name : sujan
Subject : adsdf
City : adf
marks : 67
----------------------

Enter choice :
 0: EXIT
 1: Student Insertion
 2: Student  Update
 3: Student Retrieve
 4: Student Delete
 5: query 5
4
Enter Student id
5
Deletion Done
Enter choice :
 0: EXIT
 1: Student Insertion
 2: Student  Update
 3: Student Retrieve
 4: Student Delete
 5: query 5
5
ID :
teacher Details are :
id : 2
 name : zain
Subject : java
City : pune
salary : 6300
experience  : 2
----------------------

teacher Details are :
id : 3
 name : zoya
Subject : c
City : nanded
salary : 60000
experience  : 6
----------------------

Enter choice :
 0: EXIT
 1: Student Insertion
 2: Student  Update
 3: Student Retrieve
 4: Student Delete
 5: query 5*/