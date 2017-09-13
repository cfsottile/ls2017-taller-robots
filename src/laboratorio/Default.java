package laboratorio;

import robocode.JuniorRobot;

public class Default implements Fighter {
    @Override
    public void run(LaboRobot r) {
        r.setColors(r.orange, r.blue, r.white, r.yellow, r.black);

        while(true) {

            r.ahead(100);
            r.turnGunRight(360);
            r.back(100);
            r.turnGunRight(360);
        }
    }

    @Override
    public void onScannedRobot(LaboRobot r) {
        r.fire(1);
    }

    @Override
    public void onHitByBullet(LaboRobot r) {
        r.back(10);
    }

    @Override
    public void onHitWall(LaboRobot r) {
        r.back(20);
    }
}
