public class Main {

    // Метод с шага 11
    public static Car[] getCarByBrand(Car[] cars, String brand) {
        return java.util.Arrays.stream(cars)
                .filter(car -> car.getBrand().equalsIgnoreCase(brand))
                .toArray(Car[]::new);
    }

    // Метод с шага 14
    public static Car[] getCarByBrandAndYears(Car[] cars, String brand, int years) {
        int currentYear = java.time.Year.now().getValue();
        return java.util.Arrays.stream(cars)
                .filter(car -> car.getBrand().equalsIgnoreCase(brand) && (currentYear - car.getYear() > years))
                .toArray(Car[]::new);
    }


    public static void main(String[] args) {
        Car[] cars = {
            new Car("Toyota", "Corolla", 2018),
            new Car("Honda", "Civic", 2020),
            new Car("Toyota", "Camry", 2019)
        };

        Car[] toyotas = getCarByBrand(cars, "Toyota");
        System.out.println("Toyota cars found: " + toyotas.length);

        Car[] oldToyotas = getCarByBrandAndYears(cars, "Toyota", 3);
        System.out.println("Toyota cars older than 3 years: " + oldToyotas.length);
    }
}
