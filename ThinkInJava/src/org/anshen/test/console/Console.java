package org.anshen.test.console;

public class Console {
    
    public static void main(String[] args) {
        java.io.Console console = System.console();
        String username = console.readLine("UserName:");
        char[] pwd = console.readPassword("Password:");
        
        System.out.println("UserName = " + username);
        System.out.println("Password = " + new String(pwd));
    }
    
}
