public class EmployeeElevator extends Elevator {
    @Override
    public void call(Call call) throws ElevatorCallException {
        if (call.type == ElevatorType.EMPLOYEE) {
            status = Status.BUSY;
            System.out.println("Лифт для сотрудников ушёл на этаж "+ call.floor);
            status = Status.FREE;
        }
        else throw new ElevatorCallException("Лифт только для сотрудников");
    }
    @Override
    public String toString() {
        return "Лифт для сотрудников";
    }
}
