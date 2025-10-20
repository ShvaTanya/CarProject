public class Main {

    public static Car[] getCarByBrand(Car[] cars, String brand) {
        return java.util.Arrays.stream(cars)
                .filter(car -> car.getBrand().equalsIgnoreCase(brand))
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
    }
}









