public class OddElevator extends Elevator {
    @Override
    public void call(Call call) throws ElevatorCallException {
        if (call.type == ElevatorType.ODD) {
            status = Status.BUSY;
            System.out.println("Нечётный лифт ушёл на этаж "+ call.floor);
            status = Status.FREE;
        }
        else if (call.type == ElevatorType.EVEN) throw new ElevatorCallException("Вы вызвали нечётный лифт для чётного этажа");
        else if (call.type == ElevatorType.EMPLOYEE) throw new ElevatorCallException("Нет лифтов для сотрудников");
    }
    @Override
    public String toString() {
        return "Нечётный лифт";
    }
}
