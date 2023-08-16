// GalacticCoordinates class represents the (x, y, z) coordinates
class GalacticCoordinates {
    int x;
    int y;
    int z;

    public GalacticCoordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

// Spacecraft class represents the spacecraft and its movements
class Spacecraft {
    GalacticCoordinates position;
    char direction; // N, S, E, W, U, D

    public Spacecraft(GalacticCoordinates position, char direction) {
        this.position = position;
        this.direction = direction;
    }

    public void moveForward() {
        switch (direction) {
            case 'N':
                position.y++;
                break;
            case 'S':
                position.y--;
                break;
            case 'E':
                position.x++;
                break;
            case 'W':
                position.x--;
                break;
            case 'U':
                position.z++;
                break;
            case 'D':
                position.z--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case 'N':
                position.y--;
                break;
            case 'S':
                position.y++;
                break;
            case 'E':
                position.x--;
                break;
            case 'W':
                position.x++;
                break;
            case 'U':
                position.z--;
                break;
            case 'D':
                position.z++;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'U':
                direction = 'N';
                break;
        }
    }

    public void turnUp() {
        if (direction == 'N' || direction == 'S'||direction=='E'||direction=='W') {
            direction = 'U';
        }
    }

    public void turnDown() {
        if (direction == 'N' || direction == 'S'||direction=='E'||direction=='W') {
            direction = 'D';
        }
    }

    public void executeCommands(char[] commands) {
        for (char command : commands) {
            switch (command) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
            }
        }
    }

    public String getCurrentPositionAndDirection() {
        return "Position: (" + position.x + ", " + position.y + ", " + position.z + ")\nDirection: " + direction;
    }
}

public class Chandrayaan3 {
    public static void main(String[] args) {
        GalacticCoordinates initialPosition = new GalacticCoordinates(0, 1, -1);
        char initialDirection = 'U';
        char[] commands = {'l'};

        Spacecraft chandrayaan3 = new Spacecraft(initialPosition, initialDirection);
        chandrayaan3.executeCommands(commands);

        System.out.println("Final " + chandrayaan3.getCurrentPositionAndDirection());
    }
}