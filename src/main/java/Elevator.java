public abstract class Elevator {
    Status status;
    Elevator next;

    public Elevator() {
        this.status = Status.FREE;
    }

    public abstract void call(Call call) throws ElevatorCallException;

}