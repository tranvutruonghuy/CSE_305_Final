package utils;

import java.util.List;

import model.StudentAccount;

public class HandleLoginAndSignUpTool {
    public static int findIndexOfLoginAccount(String username, String password,
            List<StudentAccount> studentAccountList) {
        int index = -1;
        for (int i = 0; i < studentAccountList.size(); i++) {
            if (studentAccountList.get(i).getUsername().equals(username)
                    && studentAccountList.get(i).getPassword().equals(password)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static boolean isAccountExisted(String username, List<StudentAccount> studentAccountList) {
        for (StudentAccount e : studentAccountList) {
            if (e.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
