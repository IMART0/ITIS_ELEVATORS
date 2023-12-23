public class ElevatorManager implements FreeElevator {
    Elevator elevator;
    public void call(Call call) {
        if (call.type == ElevatorType.EMPLOYEE) {

        }
    }
    public void addElevator(Elevator elevator) {
        if (this.elevator == null) {
            this.elevator = elevator;
            this.elevator.next = elevator;
        }
        else {
            Elevator temp = this.elevator;
            while (temp.next != this.elevator) {
                temp = temp.next;
            }
            temp.next = elevator;
            temp = temp.next;
            temp.next = this.elevator;
        }

    }
    @Override
    public Elevator free() throws ElevatorCallException {
        Elevator temp = elevator;
        while (temp.status != Status.FREE) {
            temp = temp.next;
            if (temp == elevator) {
                throw new ElevatorCallException("Свободных лифтов нет");
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        String result = "";
        result += elevator + "\n";
        Elevator temp = elevator;
        while (temp.next != elevator) {
            result += temp.next.toString() + "\n";
            temp = temp.next;
        }
        return result;
    }
}
