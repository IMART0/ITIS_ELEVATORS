public class Main {
    public static void main(String[] args) throws ElevatorCallException {
        ElevatorManager emplElev = new ElevatorManager(); // Создание менеджеров для лифтов
        ElevatorManager oddElev = new ElevatorManager();
        ElevatorManager evenElev = new ElevatorManager();
        emplElev.addElevator(new EmployeeElevator());
        for (int i = 0; i < 3; ++i) {              // Добавление лифтов в менеджер
            evenElev.addElevator(new EvenElevator());
            oddElev.addElevator(new OddElevator());
        }
        Call[] calls = new Call[20];

        for (int i = 1; i <= 15; ++i) {
            calls[i] = new Call((i % 12) + 1); //Создание 15 различных вызовов для чётных и нечётных лифтов
            if ((i+1)%2 == 0) {
                evenElev.free().call(calls[i]);
            }
            else {
                oddElev.free().call(calls[i]);
            }
        }
        for (int i = 1; i <= 5; ++i) {
            calls[i] = new Call((i*324)%14, ElevatorType.EMPLOYEE); //Создание ещё 5 различных вызовов
            emplElev.free().call(calls[i]);
        }
    }
}
