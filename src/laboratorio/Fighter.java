package laboratorio;

public interface Fighter {
    void run(LaboRobot r);
    void onScannedRobot(LaboRobot r);
    void onHitByBullet(LaboRobot r);
    void onHitWall(LaboRobot r);
}
