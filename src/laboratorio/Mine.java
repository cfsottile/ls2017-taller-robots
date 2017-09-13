package laboratorio;

public class Mine implements Fighter {
    @Override
    public void run(LaboRobot r) {
        r.setColors(r.orange, r.orange, r.orange, r.orange, r.orange);
        while(true) {
            r.turnAheadLeft(400, 180);
            r.turnGunRight(180);
            r.turnAheadLeft(400, 180);
            r.turnGunLeft(180);
        }
    }

    @Override
    public void onScannedRobot(LaboRobot r) {
        r.fire(5);
    }

    @Override
    public void onHitByBullet(LaboRobot r) {

    }

    @Override
    public void onHitWall(LaboRobot r) {
        r.turnLeft(90);
        r.ahead(200);
    }
}
