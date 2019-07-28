package Inloop.Lesson.Garage_Door;

public class GarageDoor {

    private DoorState currentState;
    private Motor motor;

    public GarageDoor() {

        this.currentState = new Closed();

    }

    public void openDoor() {currentState.openDoor();}

    public void stopper() {currentState.stopper();}

    public void closeDoor() {currentState.closeDoor();}

    private void setState(DoorState ds) {currentState = ds;}

    public abstract class DoorState {

        public void openDoor() {

            if (currentState instanceof Open) {throw new IllegalStateException();}
            if (currentState instanceof Opening) {throw new IllegalStateException();}

        }
        public void closeDoor() {

            if (currentState instanceof Closed) {throw new IllegalStateException();}
            if (currentState instanceof Closing) {throw new IllegalStateException();}

        }
        public void stopper() {

            if (currentState instanceof Open) {throw new IllegalStateException();}
            if (currentState instanceof Closed) {throw new IllegalStateException();}

        }

    }

    public class Closed extends DoorState {

        @Override
        public void openDoor() {setState(new Opening());}

    }

    public class Opening extends DoorState {

        @Override
        public void closeDoor() {setState(new Closing());}

        @Override
        public void stopper() {setState(new Open());}

    }

    public class Open extends DoorState {

        @Override
        public void closeDoor() {setState(new Closing());}

    }

    public class Closing extends DoorState {

        @Override
        public void openDoor() {setState(new Opening());}

        @Override
        public void stopper() {setState(new Closed());}

    }
}
