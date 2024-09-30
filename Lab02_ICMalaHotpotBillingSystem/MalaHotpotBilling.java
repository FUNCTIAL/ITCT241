// File: MalaHotpotBilling.java
// Description: Create bill for Mala Hotpot shop based on costs and customer count.
// Assignment Number: 2
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: Aj. Petch
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

public class MalaHotpotBilling {
    // Pricing
    int initialCost = 299;
    int hourCost = 100;

    // Customers
    int cusNum = 1;
    String entry = "1230";
    String exit = "1300";

    public void buffetCost() {
        // Entry
        int entryHour = Integer.parseInt(entry.substring(0, 2));
        int entryMin = Integer.parseInt(entry.substring(2));
        // Exit
        int exitHour = Integer.parseInt(exit.substring(0, 2));
        int exitMin = Integer.parseInt(exit.substring(2));
        // Duration
        int durationHour = exitHour - entryHour;
        int durationMin = exitMin - entryMin;

        // Remove negative minutes
        if (durationMin < 0) {
            durationHour--;
            durationMin = 60 + durationMin;
        }

        int totalCost = 0;

        // FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD
        // for (int i = 0; i < durationHour; i++) {
        //     if (i < 2) {
        //         totalCost = totalCost + initialCost;
        //         i++;
        //     }

        //     else {
        //         totalCost = totalCost + hourCost;
        //     }
        // }
        // FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD FOR LOOP BAD IF HELL GOOD

        totalCost = initialCost + Math.max(0, hourCost*(durationHour-2));

        // Minutes Cost
        if ((durationHour > 2) && (durationMin > 0)) {
            totalCost = totalCost + hourCost;
        }

        // Customers count
        totalCost = totalCost * cusNum;

        System.out.println();
        System.out.println("== Welcome to IC Mala Hotpot Buffet ==");
        System.out.println("** Billing **");
        System.out.println();
        System.out.println("No. customer: " + cusNum);
        System.out.println("Entry time -> " + entry);
        System.out.println("Exit time -> " + exit);
        System.err.println("Duration of Stay: " + durationHour + " hours " + durationMin + " minutes");
        System.out.println("Total Cost: " + totalCost + " Baht");
        System.out.println();
    }

    public void main(String[] args) {
        buffetCost();
    }
}