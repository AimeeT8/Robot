public class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction x = Direction.LEFT;
        Direction y = Direction.DOWN;

        if (toX > robot.getX()) {
            x = Direction.RIGHT;
        }
        while (x != robot.getDirection()) {
            robot.turnLeft();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
       
        if (toY > robot.getY()) {
            y = Direction.UP;
        }
        while (y != robot.getDirection()) {
            robot.turnLeft();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}





















