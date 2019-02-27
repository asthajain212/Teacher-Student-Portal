
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;

///  This is my project
public class MyDatabaseHandler {

    Connection connect = null;

    public void connectDatabase() {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/portal", "root", "");
            System.out.println("Successfully Connected to Mysql");

        } catch (Exception e) {
            System.out.println("Not Connected..");
            e.printStackTrace();
        }

    }

    public ResultSet testQuery() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM teacher";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

//            String query = "SELECT * FROM student WHERE student_name =? and id_student =?";
//            PreparedStatement pStatement = connect.prepareStatement(query);
//            pStatement.setString(1, "ABC");
//            pStatement.setString(2, "1");
//            resultSet = pStatement.executeQuery();
            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet testQuerySt() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM student";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

//            String query = "SELECT * FROM student WHERE student_name =? and id_student =?";
//            PreparedStatement pStatement = connect.prepareStatement(query);
//            pStatement.setString(1, "ABC");
//            pStatement.setString(2, "1");
//            resultSet = pStatement.executeQuery();
            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet testQueryhum3115() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM hum3115";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet testQuerycse3101() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM cse3101";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet gettingQueryhum3115() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM markhum3115";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet gettingQuerycse3101() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM markcse3101";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet gettingQuerycse3103() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM markcse3103";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet gettingQuerycse3107() {
        
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM markcse3107";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet gettingQuerycse3109() {
        
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM markcse3109";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet gettingQuerycse3100() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM markcse3100";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet gettingQuerycse3104() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM markcse3104";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet gettingQuerycse3108() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM markcse3108";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet gettingQuerycse3110() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM markcse3110";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    
    
    public ResultSet testQuerycse3103() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM cse3103";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet testQuerycse3107() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM cse3107";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet testQuerycse3109() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM cse3109";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet testQuerycse3100() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM cse3100";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet testQuerycse3104() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM cse3104";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet testQuerycse3108() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM cse3108";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    public ResultSet testQuerycse3110() {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM cse3110";
            Statement statement;
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            System.out.println("Successfully Done Query..");

        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return resultSet;
    }
    
    
    public int gettingStudent3115(ResultSet resultSet) {

        int flag = 0;

        try {
            
            Vector<String> v = new Vector<String>();

            String _tempid, _temppassword, _name = "";

            while (resultSet.next()) {

                String id = resultSet.getString("Id");
                v.add(id);
                System.out.println("ID: "+id);
                flag = 1;
            }
            
            System.out.println("my vector size: "+v.size());
            
            Collections.sort(v);
         
            GivingMark3115 m3115 = new GivingMark3115();
            m3115.myStudent(v);
                    
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    
    public int gettingStudent3101(ResultSet resultSet) {

        int flag = 0;

        try {
            
            Vector<String> v = new Vector<String>();

            String _tempid, _temppassword, _name = "";

            while (resultSet.next()) {

                String id = resultSet.getString("Id");
                v.add(id);
                System.out.println("ID: "+id);
                flag = 1;
            }
            
            Collections.sort(v);
            
          
            GivingMark3101 m3101 = new GivingMark3101();
            m3101.myStudent(v);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int gettingStudent3103(ResultSet resultSet) {

        int flag = 0;

        try {
            
            Vector<String> v = new Vector<String>();

            String _tempid, _temppassword, _name = "";

            while (resultSet.next()) {

                String id = resultSet.getString("Id");
                v.add(id);
                System.out.println("ID: "+id);
                flag = 1;
            }
            
            Collections.sort(v);

            GivingMark3103 m3103 = new GivingMark3103();
            m3103.myStudent(v);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int gettingStudent3107(ResultSet resultSet) {

        int flag = 0;

        try {
            
            Vector<String> v = new Vector<String>();

            String _tempid, _temppassword, _name = "";

            while (resultSet.next()) {

                String id = resultSet.getString("Id");
                v.add(id);
                System.out.println("ID: "+id);
                flag = 1;
            }
            
            Collections.sort(v);

            GivingMark3107 m3107 = new GivingMark3107();
            m3107.myStudent(v);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int gettingStudent3109(ResultSet resultSet) {

        int flag = 0;

        try {
            
            Vector<String> v = new Vector<String>();

            String _tempid, _temppassword, _name = "";

            while (resultSet.next()) {

                String id = resultSet.getString("Id");
                v.add(id);
                System.out.println("ID: "+id);
                flag = 1;
            }
            
            Collections.sort(v);

            GivingMark3109 m3109 = new GivingMark3109();
            m3109.myStudent(v);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int gettingStudent3100(ResultSet resultSet) {

        int flag = 0;

        try {
            
            Vector<String> v = new Vector<String>();

            String _tempid, _temppassword, _name = "";

            while (resultSet.next()) {

                String id = resultSet.getString("Id");
                v.add(id);
                System.out.println("ID: "+id);
                flag = 1;
            }
            
            Collections.sort(v);
            
          
            GivingMark3100 m3100 = new GivingMark3100();
            m3100.myStudent(v);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    
    public int gettingStudent3104(ResultSet resultSet) {

        int flag = 0;

        try {
            
            Vector<String> v = new Vector<String>();

            String _tempid, _temppassword, _name = "";

            while (resultSet.next()) {

                String id = resultSet.getString("Id");
                v.add(id);
                System.out.println("ID: "+id);
                flag = 1;
            }
            
            Collections.sort(v);
            
          
            GivingMark3104 m3104 = new GivingMark3104();
            m3104.myStudent(v);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    
    public int gettingStudent3108(ResultSet resultSet) {

        int flag = 0;

        try {
            
            Vector<String> v = new Vector<String>();

            String _tempid, _temppassword, _name = "";

            while (resultSet.next()) {

                String id = resultSet.getString("Id");
                v.add(id);
                System.out.println("ID: "+id);
                flag = 1;
            }
            
            Collections.sort(v);
            
          
            GivingMark3108 m3108 = new GivingMark3108();
            m3108.myStudent(v);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int gettingStudent3110(ResultSet resultSet) {

        int flag = 0;

        try {
            
            Vector<String> v = new Vector<String>();

            String _tempid, _temppassword, _name = "";

            while (resultSet.next()) {

                String id = resultSet.getString("Id");
                v.add(id);
                System.out.println("ID: "+id);
                flag = 1;
            }
            
            Collections.sort(v);
            
          
            GivingMark3110 m3110 = new GivingMark3110();
            m3110.myStudent(v);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }


    public void checkResult(ResultSet resultSet, String _email, String _password) {

        int flag = 0;

        try {

            String _tempemail, _temppassword, _name = "",_tempcourse;

            _tempemail = _email;
            _temppassword = _password;
            
            
            System.out.println("tempemail: "+_tempemail);
            System.out.println("temppass: "+_temppassword);
            
            
            CourseTeacher1 c = new CourseTeacher1();

            while (resultSet.next()) {

                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String course = resultSet.getString("courseName");
                _name = resultSet.getString("name");
                
                System.out.println("email: "+email);
                System.out.println("password: "+password);
                System.out.println("courseName: "+course);

                if ((email.equals(_tempemail)) && (password.equals(_temppassword))) {
                    
                    
                    System.out.println("hello sohag");
                    c.funcSetInfo(_name,course);
                    
                    
                    flag = 1;
                    //break;
                }
            }
            
            if(flag == 1){
                c.setVisible(true);
            }
            
           
            else if (flag == 0) {
                JOptionPane.showMessageDialog(null, " SORRY! you don't have any account");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void getResultHum3115(ResultSet resultSet, String course) {

        int flag = 0;
        
        try {

            String tempcourse;
            tempcourse = course;
            
            while (resultSet.next()) {
                
                String _course = resultSet.getString("courseName");

                System.out.println("courseName: "+_course);

                if (tempcourse.equals(_course)) {
                    System.out.println("hello sohag");
                   
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " SORRY! Sir this Course has an instructor");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getResultCse3101(ResultSet resultSet, String course) {

        int flag = 0;
        
        try {

            String tempcourse;
            tempcourse = course;
            
            while (resultSet.next()) {
                
                String _course = resultSet.getString("courseName");

                System.out.println("courseName: "+_course);

                if (tempcourse.equals(_course)) {
                    System.out.println("hello sohag");
                   
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " SORRY! Sir this Course has an instructor");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getResultCse3103(ResultSet resultSet, String course) {

        int flag = 0;
        
        try {

            String tempcourse;
            tempcourse = course;
            
            while (resultSet.next()) {
                
                String _course = resultSet.getString("courseName");

                System.out.println("courseName: "+_course);

                if (tempcourse.equals(_course)) {
                    System.out.println("hello sohag");
                   
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " SORRY! Sir this Course has an instructor");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getResultCse3107(ResultSet resultSet, String course) {

        int flag = 0;
        
        try {

            String tempcourse;
            tempcourse = course;
            
            while (resultSet.next()) {
                
                String _course = resultSet.getString("courseName");

                System.out.println("courseName: "+_course);

                if (tempcourse.equals(_course)) {
                    System.out.println("hello sohag");
                   
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " SORRY! Sir this Course has an instructor");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getResultCse3109(ResultSet resultSet, String course) {

        int flag = 0;
        
        try {

            String tempcourse;
            tempcourse = course;
            
            while (resultSet.next()) {
                
                String _course = resultSet.getString("courseName");

                System.out.println("courseName: "+_course);

                if (tempcourse.equals(_course)) {
                    System.out.println("hello sohag");
                   
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " SORRY! Sir this Course has an instructor");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getResultCse3100(ResultSet resultSet, String course) {

        int flag = 0;
        
        try {

            String tempcourse;
            tempcourse = course;
            
            while (resultSet.next()) {
                
                String _course = resultSet.getString("courseName");

                System.out.println("courseName: "+_course);

                if (tempcourse.equals(_course)) {
                    System.out.println("hello sohag");
                   
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " SORRY! Sir this Course has an instructor");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getResultCse3104(ResultSet resultSet, String course) {

        int flag = 0;
        
        try {

            String tempcourse;
            tempcourse = course;
            
            while (resultSet.next()) {
                
                String _course = resultSet.getString("courseName");

                System.out.println("courseName: "+_course);

                if (tempcourse.equals(_course)) {
                    System.out.println("hello sohag");
                   
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " SORRY! Sir this Course has an instructor");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getResultCse3108(ResultSet resultSet, String course) {

        int flag = 0;
        
        try {

            String tempcourse;
            tempcourse = course;
            
            while (resultSet.next()) {
                
                String _course = resultSet.getString("courseName");

                System.out.println("courseName: "+_course);

                if (tempcourse.equals(_course)) {
                    System.out.println("hello sohag");
                   
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " SORRY! Sir this Course has an instructor");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getResultCse3110(ResultSet resultSet, String course) {

        int flag = 0;
        
        try {

            String tempcourse;
            tempcourse = course;
            
            while (resultSet.next()) {
                
                String _course = resultSet.getString("courseName");

                System.out.println("courseName: "+_course);

                if (tempcourse.equals(_course)) {
                    System.out.println("hello sohag");
                   
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 1){
                JOptionPane.showMessageDialog(null, " SORRY! Sir this Course has an instructor");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    public int checkResultSt(ResultSet resultSet, String _id, String _password) {

        int flag = 0;

        try {

            String _tempid, _temppassword, _name = "";

            _tempid = _id;
            _temppassword = _password;

            while (resultSet.next()) {

                String id = resultSet.getString("ID");
                String password = resultSet.getString("password");
                
                System.out.println("ID: "+id);
                System.out.println("password: "+password);
                

                if ((id.equals(_tempid)) && (password.equals(_temppassword))) {

                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, " SORRY! you don't have any account");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int checkResulthum3115(ResultSet resultSet, String _id) {

        int flag = 0;

        try {

            String _tempid, _name = "";

            _tempid = _id;
           
            System.out.println("tempId: "+_tempid);
            
            while (resultSet.next()) {

                String Id = resultSet.getString("Id");
                int mark = resultSet.getInt("Total");
                String grade = resultSet.getString("Grade");
                double gpa = resultSet.getDouble("Gpa");
                int quiz = resultSet.getInt("Quiz");
                int attendance = resultSet.getInt("Attendance");
                int Final = resultSet.getInt("Final");

                if ((Id.equals(_tempid))) {

                    hum3115 c = new hum3115();
                    //System.out.println("id here: "+Id);
                    flag = 1;
                    c.funcHum3115(Id,mark,grade,gpa,quiz,attendance,Final);
                    c.setVisible(true);
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Your result has not been published.");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int checkResultcse3101(ResultSet resultSet, String _id) {

        int flag = 0;

        try {

            String _tempid, _name = "";

            _tempid = _id;
           
            System.out.println("tempId: "+_tempid);
            
            while (resultSet.next()) {

                String Id = resultSet.getString("Id");
                int mark = resultSet.getInt("Total");
                String grade = resultSet.getString("Grade");
                double gpa = resultSet.getDouble("Gpa");
                int quiz = resultSet.getInt("Quiz");
                int attendance = resultSet.getInt("Attendance");
                int Final = resultSet.getInt("Final");
                
                //System.out.println("ID: "+Id);

                if ((Id.equals(_tempid))) {

                    cse3101 c = new cse3101();
                    //System.out.println("id here: "+Id);
                    flag = 1;
                    c.funcCse3101(Id,mark,grade,gpa,quiz,attendance,Final);
                    c.setVisible(true);
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Your result has not been published.");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int checkResultcse3103(ResultSet resultSet, String _id) {

        int flag = 0;

        try {

            String _tempid, _name = "";

            _tempid = _id;
           
            System.out.println("tempId: "+_tempid);
            
            while (resultSet.next()) {

                String Id = resultSet.getString("Id");
                int mark = resultSet.getInt("Total");
                String grade = resultSet.getString("Grade");
                double gpa = resultSet.getDouble("Gpa");
                int quiz = resultSet.getInt("Quiz");
                int attendance = resultSet.getInt("Attendance");
                int Final = resultSet.getInt("Final");

                if ((Id.equals(_tempid))) {

                    cse3103 c = new cse3103();
                    //System.out.println("id here: "+Id);
                    flag = 1;
                    c.funcCse3103(Id,mark,grade,gpa,quiz,attendance,Final);
                    c.setVisible(true);
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Your result has not been published.");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int checkResultcse3107(ResultSet resultSet, String _id) {

        int flag = 0;

        try {

            String _tempid, _name = "";

            _tempid = _id;
           
            System.out.println("tempId: "+_tempid);
            
            while (resultSet.next()) {

                String Id = resultSet.getString("Id");
                int mark = resultSet.getInt("Total");
                String grade = resultSet.getString("Grade");
                double gpa = resultSet.getDouble("Gpa");
                int quiz = resultSet.getInt("Quiz");
                int attendance = resultSet.getInt("Attendance");
                int Final = resultSet.getInt("Final");

                if ((Id.equals(_tempid))) {

                    cse3107 c = new cse3107();
                    //System.out.println("id here: "+Id);
                    flag = 1;
                    c.funcCse3107(Id,mark,grade,gpa,quiz,attendance,Final);
                    c.setVisible(true);
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Your result has not been published.");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int checkResultcse3109(ResultSet resultSet, String _id) {

        int flag = 0;

        try {

            String _tempid, _name = "";

            _tempid = _id;
           
            System.out.println("tempId: "+_tempid);
            
            while (resultSet.next()) {

                String Id = resultSet.getString("Id");
                int mark = resultSet.getInt("Total");
                String grade = resultSet.getString("Grade");
                double gpa = resultSet.getDouble("Gpa");
                int quiz = resultSet.getInt("Quiz");
                int attendance = resultSet.getInt("Attendance");
                int Final = resultSet.getInt("Final");
                
                //System.out.println("ID: "+Id);

                if ((Id.equals(_tempid))) {

                    cse3109 c = new cse3109();
                    //System.out.println("id here: "+Id);
                    flag = 1;
                    c.funcCse3109(Id,mark,grade,gpa,quiz,attendance,Final);
                    c.setVisible(true);
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Your result has not been published.");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    
    public int checkResultcse3100(ResultSet resultSet, String _id) {

        int flag = 0;

        try {

            String _tempid, _name = "";

            _tempid = _id;
           
            System.out.println("tempId: "+_tempid);
            
            while (resultSet.next()) {

                String Id = resultSet.getString("Id");
                int mark = resultSet.getInt("Total");
                int attendance = resultSet.getInt("Attendance");
                int online = resultSet.getInt("Online");
                int offline = resultSet.getInt("Offline");
                int mid = resultSet.getInt("Mid");
                int project = resultSet.getInt("Project");
                double gpa = resultSet.getDouble("Gpa");
                String grade = resultSet.getString("Grade");
                
                //System.out.println("ID: "+Id);

                if ((Id.equals(_tempid))) {

                    cse3100 c = new cse3100();
                    //System.out.println("id here: "+Id);
                    flag = 1;
                    c.funcCse3100(Id,mark,attendance,online,offline,mid,project,grade,gpa);
                    c.setVisible(true);
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Your result has not been published.");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    
    public int checkResultcse3104(ResultSet resultSet, String _id) {

        int flag = 0;

        try {

            String _tempid, _name = "";

            _tempid = _id;
           
            System.out.println("tempId: "+_tempid);
            
            while (resultSet.next()) {

                String Id = resultSet.getString("Id");
                int mark = resultSet.getInt("Total");
                int attendance = resultSet.getInt("Attendance");
                int online = resultSet.getInt("Online");
                int offline = resultSet.getInt("Offline");
                int mid = resultSet.getInt("Mid");
                int project = resultSet.getInt("Project");
                double gpa = resultSet.getDouble("Gpa");
                String grade = resultSet.getString("Grade");
                
                //System.out.println("ID: "+Id);

                if ((Id.equals(_tempid))) {

                    cse3104 c = new cse3104();
                    //System.out.println("id here: "+Id);
                    flag = 1;
                    c.funcCse3104(Id,mark,attendance,online,offline,mid,project,grade,gpa);
                    c.setVisible(true);
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Your result has not been published.");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    
    public int checkResultcse3108(ResultSet resultSet, String _id) {

        int flag = 0;

        try {

            String _tempid, _name = "";

            _tempid = _id;
           
            System.out.println("tempId: "+_tempid);
            
            while (resultSet.next()) {

                String Id = resultSet.getString("Id");
                int mark = resultSet.getInt("Total");
                int attendance = resultSet.getInt("Attendance");
                int online = resultSet.getInt("Online");
                int offline = resultSet.getInt("Offline");
                int mid = resultSet.getInt("Mid");
                int project = resultSet.getInt("Project");
                double gpa = resultSet.getDouble("Gpa");
                String grade = resultSet.getString("Grade");
                
                //System.out.println("ID: "+Id);

                if ((Id.equals(_tempid))) {

                    cse3108 c = new cse3108();
                    //System.out.println("id here: "+Id);
                    flag = 1;
                    c.funcCse3108(Id,mark,attendance,online,offline,mid,project,grade,gpa);
                    c.setVisible(true);
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Your result has not been published.");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    
    public int checkResultcse3110(ResultSet resultSet, String _id) {

        int flag = 0;

        try {

            String _tempid, _name = "";

            _tempid = _id;
           
            System.out.println("tempId: "+_tempid);
            
            while (resultSet.next()) {

                String Id = resultSet.getString("Id");
                int mark = resultSet.getInt("Total");
                int attendance = resultSet.getInt("Attendance");
                int online = resultSet.getInt("Online");
                int offline = resultSet.getInt("Offline");
                int mid = resultSet.getInt("Mid");
                int project = resultSet.getInt("Project");
                double gpa = resultSet.getDouble("Gpa");
                String grade = resultSet.getString("Grade");
                
                //System.out.println("ID: "+Id);

                if ((Id.equals(_tempid))) {

                    cse3110 c = new cse3110();
                    //System.out.println("id here: "+Id);
                    flag = 1;
                    c.funcCse3108(Id,mark,attendance,online,offline,mid,project,grade,gpa);
                    c.setVisible(true);
                    break;
                }
            }

            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "Your result has not been published.");
                return 0;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return flag;
    }
    

    public void insertData(String name, String password, String dateofBirth, String email, String phone, String coursename) {
        try {
            
           
            
            String query = "INSERT INTO teacher (name,password,dateofBirth,email,phone,coursename) values(?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, name);
            pStatement.setString(2, password);
            pStatement.setString(3, dateofBirth);
            pStatement.setString(4, email);
            pStatement.setString(5, phone);
            pStatement.setString(6, coursename);

            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    public void insertDataSt(String id,String name, String password, String dateofBirth, String email, String phone,String coursename) {
        try {
            String query = "INSERT INTO student (id,name,password,dateofBirth,email,phone,coursename) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, coursename);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    // THIS IS FOR MARKING HUM3115
    
    public void insertDatahum3115(String id,String name, String password, String dateofBirth, String email, String phone,String courses) {
        try {
            String query = "INSERT INTO markhum3115 (id,name,password,dateofBirth,email,phone,courses) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, courses);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    /// this is for marking cse3101
    
    public void insertDatacse3101(String id,String name, String password, String dateofBirth, String email, String phone,String courses) {
        try {
            String query = "INSERT INTO markcse3101 (id,name,password,dateofBirth,email,phone,courses) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, courses);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    /// this is for marking cse3103
    
    public void insertDatacse3103(String id,String name, String password, String dateofBirth, String email, String phone,String courses) {
        try {
            String query = "INSERT INTO markcse3103 (id,name,password,dateofBirth,email,phone,courses) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, courses);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    /// this is for marking cse3107
    
    public void insertDatacse3107(String id,String name, String password, String dateofBirth, String email, String phone,String courses) {
        try {
            String query = "INSERT INTO markcse3107 (id,name,password,dateofBirth,email,phone,courses) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, courses);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    /// this is for marking cse3109
    
    public void insertDatacse3109(String id,String name, String password, String dateofBirth, String email, String phone,String courses) {
        try {
            String query = "INSERT INTO markcse3109 (id,name,password,dateofBirth,email,phone,courses) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, courses);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    /// this is for marking cse3109
    
    public void insertDatacse3100(String id,String name, String password, String dateofBirth, String email, String phone,String courses) {
        try {
            String query = "INSERT INTO markcse3100 (id,name,password,dateofBirth,email,phone,courses) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, courses);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    /// this is for marking cse3109
    
    public void insertDatacse3104(String id,String name, String password, String dateofBirth, String email, String phone,String courses) {
        try {
            String query = "INSERT INTO markcse3104 (id,name,password,dateofBirth,email,phone,courses) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, courses);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    /// this is for marking cse3109
    
    public void insertDatacse3108(String id,String name, String password, String dateofBirth, String email, String phone,String courses) {
        try {
            String query = "INSERT INTO markcse3108(id,name,password,dateofBirth,email,phone,courses) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, courses);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    /// this is for marking cse3109
    
    public void insertDatacse3110(String id,String name, String password, String dateofBirth, String email, String phone,String courses) {
        try {
            String query = "INSERT INTO markcse3110 (id,name,password,dateofBirth,email,phone,courses) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setString(2, name);
            pStatement.setString(3, password);
            pStatement.setString(4, dateofBirth);
            pStatement.setString(5, email);
            pStatement.setString(6, phone);
            pStatement.setString(7, courses);
            pStatement.executeUpdate();

            System.out.println("Successfully Inserted..");

        } catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    
    public void insertMarkcse3100(String id, int attendance, int online, int offline, int mid, int project, String grade,double gpa,int total) {
        try {
            String query = "INSERT INTO cse3100 (Id,Attendance,Online,Offline,Mid,Project,Grade,Gpa,Total) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setInt(2, attendance);
            pStatement.setInt(3, online);
            pStatement.setInt(4, offline);
            pStatement.setInt(5, mid);
            pStatement.setInt(6, project);
            pStatement.setString(7, grade);
            pStatement.setDouble(8, gpa);
            pStatement.setInt(9, total);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully MarkDistributed..");
        } 
        
        catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    public void insertMarkcse3104(String id, int attendance, int online, int offline, int mid, int project, String grade,double gpa,int total) {
        try {
            String query = "INSERT INTO cse3104 (Id,Attendance,Online,Offline,Mid,Project,Grade,Gpa,Total) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setInt(2, attendance);
            pStatement.setInt(3, online);
            pStatement.setInt(4, offline);
            pStatement.setInt(5, mid);
            pStatement.setInt(6, project);
            pStatement.setString(7, grade);
            pStatement.setDouble(8, gpa);
            pStatement.setInt(9, total);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully MarkDistributed..");
        } 
        
        catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    
    public void insertMarkcse3108(String id, int attendance, int online, int offline, int mid, int project, String grade,double gpa,int total) {
        try {
            String query = "INSERT INTO cse3108 (Id,Attendance,Online,Offline,Mid,Project,Grade,Gpa,Total) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setInt(2, attendance);
            pStatement.setInt(3, online);
            pStatement.setInt(4, offline);
            pStatement.setInt(5, mid);
            pStatement.setInt(6, project);
            pStatement.setString(7, grade);
            pStatement.setDouble(8, gpa);
            pStatement.setInt(9, total);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully MarkDistributed..");
        } 
        
        catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    
    public void insertMarkcse3110(String id, int attendance, int online, int offline, int mid, int project, String grade,double gpa,int total) {
        try {
            String query = "INSERT INTO cse3110 (Id,Attendance,Online,Offline,Mid,Project,Grade,Gpa,Total) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setInt(2, attendance);
            pStatement.setInt(3, online);
            pStatement.setInt(4, offline);
            pStatement.setInt(5, mid);
            pStatement.setInt(6, project);
            pStatement.setString(7, grade);
            pStatement.setDouble(8, gpa);
            pStatement.setInt(9, total);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully MarkDistributed..");
        } 
        
        catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    

    public void insertMarkhum3115(String id, int quiz, int attendance, int Final,String grade,double gpa,int total) {
        try {
            String query = "INSERT INTO hum3115 (Id,Quiz,Attendance,Final,Grade,Gpa,Total) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setInt(2, quiz);
            pStatement.setInt(3, attendance);
            pStatement.setInt(4, Final);
            pStatement.setString(5, grade);
            pStatement.setDouble(6, gpa);
            pStatement.setInt(7, total);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully MarkDistributed..");
        } 
        
        catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    

    public void insertMarkcse3101(String id, int quiz, int attendance, int Final,String grade,double gpa,int total) {
        try {
            String query = "INSERT INTO CSE3101 (Id,Quiz,Attendance,Final,Grade,Gpa,Total) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setInt(2, quiz);
            pStatement.setInt(3, attendance);
            pStatement.setInt(4, Final);
            pStatement.setString(5, grade);
            pStatement.setDouble(6, gpa);
            pStatement.setInt(7, total);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully MarkDistributed..");
        } 
        
        catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
    
    
    
     public void insertMarkcse3103(String id, int quiz, int attendance, int Final,String grade,double gpa,int total) {
        try {
            
            String query = "INSERT INTO CSE3103 (Id,Quiz,Attendance,Final,Grade,Gpa,Total) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setInt(2, quiz);
            pStatement.setInt(3, attendance);
            pStatement.setInt(4, Final);
            pStatement.setString(5, grade);
            pStatement.setDouble(6, gpa);
            pStatement.setInt(7, total);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully MarkDistributed..");
        } 
        
        catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
     
     public void insertMarkcse3107(String id, int quiz, int attendance, int Final,String grade,double gpa,int total) {
        try {
            
            //System.out.println("hello shohagh");
            
            String query = "INSERT INTO CSE3107 (Id,Quiz,Attendance,Final,Grade,Gpa,Total) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setInt(2, quiz);
            pStatement.setInt(3, attendance);
            pStatement.setInt(4, Final);
            pStatement.setString(5, grade);
            pStatement.setDouble(6, gpa);
            pStatement.setInt(7, total);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully MarkDistributed..");
        } 
        
        catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }
     
     public void insertMarkcse3109(String id, int quiz, int attendance, int Final,String grade,double gpa,int total) {
        try {
            
            //System.out.println("hello shohagh");
            
            String query = "INSERT INTO CSE3109 (Id,Quiz,Attendance,Final,Grade,Gpa,Total) values(?,?,?,?,?,?,?)";
            PreparedStatement pStatement = connect.prepareStatement(query);

            pStatement.setString(1, id);
            pStatement.setInt(2, quiz);
            pStatement.setInt(3, attendance);
            pStatement.setInt(4, Final);
            pStatement.setString(5, grade);
            pStatement.setDouble(6, gpa);
            pStatement.setInt(7, total);
           
            pStatement.executeUpdate();
            
            System.out.println("Successfully MarkDistributed..");
        } 
        
        catch (Exception e) {
            System.out.println("Error in inserting");
            e.printStackTrace();
        }
    }

}
