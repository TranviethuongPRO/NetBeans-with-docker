package com.mycompany.mavenproject3;

/**
 *
 * @author PC
 */
public class Mavenproject3 {

    private String userId;
    private String email;

    public Mavenproject3(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public void updateEmail(String newEmail) { this.email = newEmail; }

    public static void main(String[] args) {
        System.out.println("Hello World!");

    }
}
