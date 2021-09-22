import javax.swing.*;
import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
    public static void main(String[] args) {
        DecimalFormat round = new DecimalFormat("#.00");
        String name;
        double strength , dex, sprt, damage,mana, spell, cloak;


        //user input
        name = JOptionPane.showInputDialog("Name your character!");
        strength  = Double.parseDouble(JOptionPane.showInputDialog("Enter your characters level of strength."));
        dex = Double.parseDouble(JOptionPane.showInputDialog("Enter your characters level of dexterity"));
        sprt = Double.parseDouble(JOptionPane.showInputDialog("Enter your characters level of spirit."));
        //user stats
        damage = (strength * dex)/ (sprt/100.0);
        mana = damage *(damage/15.0) * (sprt/1000.0);
        spell = (strength * sprt)* 1.34;
        cloak = (dex * sprt)* (strength * .4);

        System.out.println(name + " Stats:");
        System.out.println("Strength: " + round.format(strength));
        System.out.println("Dexterity: " + round.format(dex));
        System.out.println("Spirit: " + round.format(sprt));
        System.out.println(" ");
        System.out.println(name + "'s abilities constitute:");
        System.out.println("Damage: " + round.format(damage));
        System.out.println("Mana: " + round.format(mana));
        System.out.println("Spell Capacity: " + round.format(spell));
        System.out.println("Cloaking: " + round.format(cloak));
        System.exit(0);

    }
}
