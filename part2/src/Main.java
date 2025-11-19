public class Main {
    public static void main(String[] args) {
        System.out.println("=== Headgear Assignment Test ===\n");

        // -----------------------------
        // 1. Normal objects test
        // -----------------------------
        try {
            System.out.println(">>> Creating normal headgear objects...");
            Headgear crown1 = new Crown(5); // 5 jewels
            Headgear crown2 = new Crown(0); // edge case: 0 jewels
            Headgear helmet1 = new ScooterHelmet(2.5, true); // visor
            Headgear helmet2 = new ScooterHelmet(1.0, false); // no visor
            Headgear bobble1 = new BobbleHat(1.5, 10); // normal bobble
            Headgear bobble2 = new BobbleHat(2.0, 0);  // bobble diameter 0

            Headgear[] allGear = {crown1, crown2, helmet1, helmet2, bobble1, bobble2};

            System.out.println(">>> Printing individual objects:");
            for (Headgear h : allGear) {
                System.out.println(h);
            }

            System.out.println("\n>>> Total value of all objects: £" + Headgear.totalValue(allGear));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Testing invalid constructor values ===");
        // -----------------------------
        // 2. Invalid constructor parameters
        // -----------------------------
        try {
            new Crown(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Crown test passed: " + e.getMessage());
        }

        try {
            new ScooterHelmet(-2.0, true);
        } catch (IllegalArgumentException e) {
            System.out.println("ScooterHelmet test passed: " + e.getMessage());
        }

        try {
            new BobbleHat(1.5, -5);
        } catch (IllegalArgumentException e) {
            System.out.println("BobbleHat test passed: " + e.getMessage());
        }

        System.out.println("\n=== Testing invalid setter values ===");
        // -----------------------------
        // 3. Invalid setter parameters
        // -----------------------------
        try {
            Crown c = new Crown(3);
            c.setNumberOfJewels(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Crown setter test passed: " + e.getMessage());
        }

        try {
            ScooterHelmet h = new ScooterHelmet(1.0, true);
            h.setProtectionFactor(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("ScooterHelmet setter test passed: " + e.getMessage());
        }

        try {
            BobbleHat b = new BobbleHat(1.0, 5);
            b.setBobbleDiameter(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("BobbleHat setter test passed: " + e.getMessage());
        }

        System.out.println("\n=== Testing totalValue() edge cases ===");
        // -----------------------------
        // 4. totalValue edge cases
        // -----------------------------
        try {
            Headgear[] arrayWithNull = { new Crown(1), null };
            Headgear.totalValue(arrayWithNull);
        } catch (IllegalArgumentException e) {
            System.out.println("Array with null test passed: " + e.getMessage());
        }

        try {
            Headgear.totalValue(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Null array test passed: " + e.getMessage());
        }

        try {
            Headgear[] emptyArray = {};
            double totalEmpty = Headgear.totalValue(emptyArray);
            System.out.println("Empty array total value: £" + totalEmpty);
        } catch (IllegalArgumentException e) {
            System.out.println("Empty array test failed: " + e.getMessage());
        }

        System.out.println("\n=== All tests completed ===");
    }
}
