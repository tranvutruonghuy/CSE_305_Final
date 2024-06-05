package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
        File file = new File(fileName);
        if (!file.mkdir()) {
            file.mkdirs();
        }
        try {
            bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(student.getName());
            bw.newLine();
            bw.write(student.getUsername());
            bw.newLine();
            bw.write(student.getPassword());
            bw.newLine();
            bw.write(student.getIrn());
            bw.newLine();
            bw.write(student.getGender());
            bw.newLine();
            bw.write(Double.toString(student.getExpense()));
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

    public static void updateFile(List<StudentAccount> list, String fileName) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(fileName, false));
            for (StudentAccount student : list) {
                bw.write(student.getName());
                bw.newLine();
                bw.write(student.getUsername());
                bw.newLine();
                bw.write(student.getPassword());
                bw.newLine();
                bw.write(student.getIrn());
                bw.newLine();
                bw.write(student.getGender());
                bw.newLine();
                bw.write(Double.toString(student.getExpense()));
                bw.newLine();
            }
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

    public static ArrayList<StudentAccount> restoreListFromFile(String fileName) {
        ArrayList<StudentAccount> res = new ArrayList<>();
        BufferedReader br = null;
        File file = new File(fileName);
        try {

            br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                String name = line;
                String userName = br.readLine();
                String password = br.readLine();
                String irn = br.readLine();
                String gender = br.readLine();
                double expense = Double.parseDouble(br.readLine());
                res.add(new StudentAccount(name, userName, password, irn, gender, expense));
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentAccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentAccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(StudentAccountDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
    }

}
