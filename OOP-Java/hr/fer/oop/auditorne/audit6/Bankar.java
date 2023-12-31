package hr.fer.oop.auditorne.audit6;

import java.util.Arrays;
public class Bankar {
    public static void pohlepnoGrabljenje() {
        char[] gimme = new char[Integer.MAX_VALUE];
        Arrays.fill(gimme, '$');
        System.out.println("Uspjeh!");
    }

    public static void main(String[] args) {
        try {
            pohlepnoGrabljenje();
        } catch (Exception ex) {
            System.err.println("Ha! Uhvacen na djelu!" + ex.getMessage());
        }

    }
}