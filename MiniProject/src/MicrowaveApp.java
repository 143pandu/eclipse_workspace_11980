import java.util.*;
import java.util.stream.Collectors;

class Microwave {
    private String brand;
    private String model;
    private int powerOutput; // In watts
    private int capacity;    // In liters
    private String type;

    public Microwave(String brand, String model, int powerOutput, int capacity, String type) {
        this.brand = brand;
        this.model = model;
        this.powerOutput = powerOutput;
        this.capacity = capacity;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerOutput() {
        return powerOutput;
    }

    public void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", powerOutput=" + powerOutput +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}

public class MicrowaveApp {
    private static List<Microwave> microwaves = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;

        do {
            System.out.println("MICROWAVE MANAGEMENT APPLICATION");
            System.out.println("--------------------------------");
            System.out.println("1. Add Microwave");
            System.out.println("2. View All Microwaves");
            System.out.println("3. Search Microwaves by Brand");
            System.out.println("4. Remove Microwave by Model");
            System.out.println("5. Update Microwave by Model");
            System.out.println("0. Exit");
            System.out.print("Please select an option: ");
            option = in.nextInt();

            switch (option) {
                case 1:
                    addMicrowave(in);
                    break;
                case 2:
                    viewAllMicrowaves();
                    break;
                case 3:
                    searchMicrowavesByBrand(in);
                    break;
                case 4:
                    removeMicrowaveByModel(in);
                    break;
                case 5:
                    updateMicrowaveByModel(in);
                    break;
                case 0:
                    System.out.println("Thank you for using the Microwave Management Application.");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 0);
    }

    private static void addMicrowave(Scanner in) {
        System.out.print("Enter Brand: ");
        String brand = in.next();

        System.out.print("Enter Model: ");
        String model = in.next();

        System.out.print("Enter Power Output (Watts): ");
        int powerOutput = in.nextInt();

        System.out.print("Enter Capacity (Liters): ");
        int capacity = in.nextInt();

        System.out.print("Enter Type: ");
        String type = in.next();

        microwaves.add(new Microwave(brand, model, powerOutput, capacity, type));
        System.out.println("Microwave added successfully!");
    }

    private static void viewAllMicrowaves() {
        if (microwaves.isEmpty()) {
            System.out.println("No microwaves found.");
        } else {
            microwaves.forEach(System.out::println);
        }
    }

    private static void searchMicrowavesByBrand(Scanner in) {
        System.out.print("Enter Brand to Search: ");
        String brand = in.next();

        List<Microwave> result = microwaves.stream()
                .filter(microwave -> microwave.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("No microwaves found for brand: " + brand);
        } else {
            result.forEach(System.out::println);
        }
    }

    private static void removeMicrowaveByModel(Scanner in) {
        System.out.print("Enter Model to Remove: ");
        String model = in.next();

        boolean removed = microwaves.removeIf(microwave -> microwave.getModel().equalsIgnoreCase(model));

        if (removed) {
            System.out.println("Microwave removed successfully!");
        } else {
            System.out.println("No microwave found with model: " + model);
        }
    }

    private static void updateMicrowaveByModel(Scanner in) {
        System.out.print("Enter Model to Update: ");
        String model = in.next();

        Optional<Microwave> optionalMicrowave = microwaves.stream()
                .filter(microwave -> microwave.getModel().equalsIgnoreCase(model))
                .findFirst();

        if (optionalMicrowave.isPresent()) {
            Microwave microwave = optionalMicrowave.get();
            System.out.println("Current details: " + microwave);

            System.out.print("Enter new Brand (or press Enter to skip): ");
            in.nextLine(); // Consume newline
            String brand = in.nextLine();
            if (!brand.isEmpty()) {
                microwave.setBrand(brand);
            }

            System.out.print("Enter new Power Output (Watts) (or 0 to skip): ");
            int powerOutput = in.nextInt();
            if (powerOutput != 0) {
                microwave.setPowerOutput(powerOutput);
            }

            System.out.print("Enter new Capacity (Liters) (or 0 to skip): ");
            int capacity = in.nextInt();
            if (capacity != 0) {
                microwave.setCapacity(capacity);
            }

            System.out.print("Enter new Type (or press Enter to skip): ");
            in.nextLine(); // Consume newline
            String type = in.nextLine();
            if (!type.isEmpty()) {
                microwave.setType(type);
            }

            System.out.println("Microwave updated successfully!");
        } else {
            System.out.println("No microwave found with model: " + model);
        }
    }
}

