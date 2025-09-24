/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLM.Week01;

/**
 *
 * @author ali.nizam
 */
public class TowersOfHanoi {

    // Recursive function to solve Towers of Hanoi
    public static void solve(int n, char source, char auxiliary, char target) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " → " + target);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary
        solve(n - 1, source, target, auxiliary);

        // Step 2: Move the nth disk from source to target
        System.out.println("Move disk " + n + " from " + source + " → " + target);

        // Step 3: Move n-1 disks from auxiliary to target
        solve(n - 1, auxiliary, source, target);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        System.out.println("Towers of Hanoi solution for " + n + " disks:");
        solve(n, 'A', 'B', 'C');
    }
}