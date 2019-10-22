/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan48;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator calc = new Kalkulator();
        calc.setValue1(7);
        calc.setValue2(5);
        calc.setNameProject();
        calc.setNoteProject("This Project shown you how to manage method in java");
        System.out.println("Result add is = "+calc.add(7, 5));
        System.out.println("Result minus is = "+calc.minus(7, 5));
        System.out.println("Result multiplication is = "+calc.multiplication(7, 5));
        System.out.println("Result division is = "+calc.division(7, 5));
    }

}
