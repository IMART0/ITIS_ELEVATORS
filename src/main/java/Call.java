public class Call {
    public Call(int floor, ElevatorType type) throws ElevatorCallException {
        if (floor < 1) {
            throw new ElevatorCallException("Некорректно введён этаж");
        }
        if (((floor % 2) == 0) && ((type == ElevatorType.ODD))) {
            throw new ElevatorCallException("Некорректно введён тип лифта");
        }
        if (((floor % 2) != 0) && ((type == ElevatorType.EVEN))) {
            throw new ElevatorCallException("Некорректно введён тип лифта");
        }
        this.floor = floor;
        this.type = type;
    }
    public Call(int floor) throws ElevatorCallException {
        if (floor < 1) {
            throw new ElevatorCallException("Некорректно введён этаж");
        }
        this.floor = floor;
        if (floor % 2 == 0) {
            type = ElevatorType.EVEN;
        }
        else {
            type = ElevatorType.ODD;
        }
    }
    int floor;
    ElevatorType type;
}
