/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author iamst
 */
public class PasswordValidator {
    public boolean isValid(String password) {
        return minLength(password) && hasSpecialChar(password);
    }
    private boolean minLength(String password) {
        return password.length() >=10;
    }
    private boolean hasSpecialChar(String password) {
        for(int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            } 
        } return false;
    }
}
