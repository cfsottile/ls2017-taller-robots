package laboratorio;

public class Suicidal implements Fighter {
    @Override
    public void run(LaboRobot r) {
        r.setColors(r.black, r.black, r.black, r.black, r.black);
        while(true) {
            r.turnGunRight(10);
        }
    }

    @Override
    public void onScannedRobot(LaboRobot r) {
        r.fire(1);
    }

    @Override
    public void onHitByBullet(LaboRobot r) { }

    @Override
    public void onHitWall(LaboRobot r) { }
}
