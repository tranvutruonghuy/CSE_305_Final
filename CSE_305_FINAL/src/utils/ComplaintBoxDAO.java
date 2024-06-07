package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ComplaintBoxDAO {
    public static List<String[]> loadListFromFileChar(String fileName) {
        List<String[]> res = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] complaintInfor = new String[3];
                complaintInfor[0] = line;
                complaintInfor[1] = br.readLine();
                complaintInfor[2] = br.readLine();
                complaintInfor[3] = br.readLine();
                res.add(complaintInfor);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return res;
    }

    public static void saveDataAsChar(String[] complaintInfor, String fileName) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(complaintInfor[0]);
            bw.newLine();
            bw.write(complaintInfor[1]);
            bw.newLine();
            bw.write(complaintInfor[2]);
            bw.newLine();
            bw.write(complaintInfor[3]);
            bw.newLine();
            bw.flush();
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

    public static void saveListAsChar(List<String[]> complaintInforList, String fileName) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName));
            for (String[] s : complaintInforList) {
                bw.write(s[0]);
                bw.newLine();
                bw.write(s[1]);
                bw.newLine();
                bw.write(s[2]);
                bw.newLine();
                bw.write(s[3]);
                bw.newLine();
                bw.flush();
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
}
