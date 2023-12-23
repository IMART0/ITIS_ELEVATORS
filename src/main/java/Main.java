public class Main {
    public static void main(String[] args) throws ElevatorCallException {
        ElevatorManager emplElev = new ElevatorManager();
        ElevatorManager oddElev = new ElevatorManager();
        ElevatorManager evenElev = new ElevatorManager();
        emplElev.addElevator(new EmployeeElevator());
        for (int i = 0; i < 3; ++i) {
            evenElev.addElevator(new EvenElevator());
            oddElev.addElevator(new OddElevator());
        }
        Call call1 = new Call(1);
        Call call2 = new Call(5);
        Call call3 = new Call(4);
        Call call4 = new Call(3, ElevatorType.EMPLOYEE);
        Call call5 = new Call(2);

        oddElev.free().call(call1);

    }
}
