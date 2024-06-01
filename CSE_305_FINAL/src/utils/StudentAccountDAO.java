package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.StudentAccount;

public class StudentAccountDAO {
public static void saveAccountAsChar(StudentAccount student, String fileName) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(student.getName());
            bw.newLine();
            bw.write(student.getUsername());
            bw.newLine();
            bw.write(student.getPassword());
            bw.newLine();

        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static List<StudentAccount> restoreListFromFile(String fileName) {
        List<StudentAccount> res = new ArrayList<>();
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while((line = br.readLine()) != null){
                String name = line;
                String userName = br.readLine();
                String password = br.readLine();
                res.add(new StudentAccount(name, userName, password));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentAccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentAccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(StudentAccountDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
