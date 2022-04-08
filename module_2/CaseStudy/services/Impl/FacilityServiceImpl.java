package CaseStudy.services.Impl;

import CaseStudy.models.Facility;
import CaseStudy.models.House;
import CaseStudy.models.Room;
import CaseStudy.models.Villa;
import CaseStudy.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for(Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()){
            System.out.println("Service " + element.getKey() + " Số lần đã thuê: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {
        System.out.println("List Facility maintenance");
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getValue() >= 5) {
                System.out.println("Facility: " + element.getKey() + " USED " + element.getValue() + " times");
            }
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println();
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter service name: ");
        String serviceName = scanner.nextLine();

        System.out.print("Enter area: ");
        Double area = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter rental cost: ");
        int rentalCost = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter rental type: ");
        String rentalType = scanner.nextLine();

        System.out.print("Enter villa standard: ");
        String standardVilla = scanner.nextLine();

        System.out.print("Enter area pool: ");
        Double areaPool = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter floor number: ");
        int floorNumber = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(id, serviceName, area, rentalCost, maxPeople, rentalType, standardVilla, areaPool, floorNumber);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Add villa success!");
    }

    @Override
    public void addNewHouse() {
        System.out.println();
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter service name: ");
        String serviceName = scanner.nextLine();

        System.out.print("Enter area: ");
        Double area = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter rental cost: ");
        int rentalCost = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter rental type: ");
        String rentalType = scanner.nextLine();

        System.out.print("Enter house standard: ");
        String standardHouse = scanner.nextLine();

        System.out.print("Enter floor number: ");
        int floorNumber = Integer.parseInt(scanner.nextLine());

        House house = new House(id, serviceName, area, rentalCost, maxPeople, rentalType, standardHouse, floorNumber);
        facilityIntegerMap.put(house, 0);
        System.out.println("Add house success!");
    }

    @Override
    public void addNewRoom() {
        System.out.println();
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter service name: ");
        String serviceName = scanner.nextLine();

        System.out.print("Enter area: ");
        Double area = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter rental cost: ");
        int rentalCost = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter rental type: ");
        String rentalType = scanner.nextLine();

        System.out.print("Enter free service: ");
        String freeService = scanner.nextLine();

        Room room = new Room(id, serviceName, area, rentalCost, maxPeople, rentalType, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Add room success!");
    }
}
