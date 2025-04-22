/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package chatappp1;

import static org.junit.jupiter.api.Assertions.assertEquals;  
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class ChatAppP1Test {

    ChatAppP1 app = new ChatAppP1();

    @Test
    public void testCheckUsernamePass() {
        assertTrue(app.checkUsername("a_bc"));
    }

    @Test
    public void testCheckUsernameFailNoUnderscore() {
        assertFalse(app.checkUsername("abcd"));
    }

    @Test
    public void testCheckUsernameFailTooLong() {
        assertFalse(app.checkUsername("abc_de"));
    }

    @Test
    public void testCheckPasswordPass() {
        assertTrue(app.checkPassword("Password1!"));
    }

    @Test
    public void testCheckPasswordFailNoCapital() {
        assertFalse(app.checkPassword("password1!"));
    }

    @Test
    public void testCheckPasswordFailNoNumber() {
        assertFalse(app.checkPassword("Password!"));
    }

    @Test
    public void testCheckPasswordFailNoSpecialCharacter() {
        assertFalse(app.checkPassword("Password1"));
    }

    @Test
    public void testCheckPasswordFailTooShort() {
        assertFalse(app.checkPassword("P1!a"));
    }

    @Test
    public void testCheckCellPhonePass() {
        assertTrue(app.checkCellPhone("+27831234567"));
    }

    @Test
    public void testCheckCellPhoneFailNoPlus() {
        assertFalse(app.checkCellPhone("27831234567"));
    }

    @Test
    public void testCheckCellPhoneFailWrongLength() {
        assertFalse(app.checkCellPhone("+2783123456"));
    }

    @Test
    public void testCheckCellPhoneFailContainsLetters() {
        assertFalse(app.checkCellPhone("+27ABC12345"));
    }
}

