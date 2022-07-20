package exo_interfaces.case1;

import exo_interfaces.case1.Client;

import java.util.Scanner;

public class MainPaiementMethod {
    public static void main(String[] args) {

        Client Thomas = new Client();
        Scanner input = new Scanner(System.in);
        System.out.println("Choisissez une methode de paiement");

        Thomas.processPayment();
    }
}
