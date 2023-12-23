public class EvenElevator extends Elevator {
    @Override
    public void call(Call call) throws ElevatorCallException {
        if (call.type == ElevatorType.EVEN) {
            status = Status.BUSY;
            System.out.println("Чётный лифт ушёл на этаж "+ call.floor);
            status = Status.FREE;
        }
        else if (call.type == ElevatorType.ODD) throw new ElevatorCallException("Вы вызвали чётный лифт для нечётного этажа");
        else if (call.type == ElevatorType.EMPLOYEE) throw new ElevatorCallException("Нет лифтов для сотрудников");

    }

    @Override
    public String toString() {
        return "Чётный лифт";
    }
}
