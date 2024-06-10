package model;

public class StudentAccount {
    private String name;
    private String irn = "N/a";
    private String username;
    private String password;
    private double expense = 0;
    private String gender = "N/a";

    public StudentAccount(String name, String username, String password, String irn, String gender, double expense) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.irn = irn;
        this.gender = gender;
        this.expense = expense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIrn() {
        return irn;
    }

    public void setIrn(String irn) {
        this.irn = irn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
