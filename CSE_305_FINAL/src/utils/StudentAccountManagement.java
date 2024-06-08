package utils;

import java.util.ArrayList;
import java.util.List;

import model.StudentAccount;
import utils.StudentAccountDAO;

public class StudentAccountManagement {
    private static List<StudentAccount> studentAccountList = StudentAccountDAO
            .restoreListFromFile("CSE_305_Final\\CSE_305_FINAL\\src");

    // public static int findIndexOfLoginAccount(String username, String password) {
    // return HandleLoginAndSignUpTool.findIndexOfLoginAccount(username, password,
    // studentAccountList);
    // }

    public static boolean isAccountExisted(String username) {
        return HandleLoginAndSignUpTool.isAccountExisted(username, studentAccountList);
    }
}
