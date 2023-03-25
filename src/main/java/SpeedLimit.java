/*
 * The police have placed radars that will detect those vehicles that exceed the speed limit on that road.
 * If the driver's speed is 10km/h to 19km/h above the speed limit, the fine will be 100 dollars,
 * if it is exceeded by 20km/h to 29km/h the fine will be 250 dollars and if it is exceeded by more than
 * 30km/h the fine will be 500 dollars.
 * You will be provided with the speed limits of those roads with radar as a collection
 * of speedlimits [90,100,110,120,....] and the speed of the driver will be the same on all
 * roads and can never be negative and the amount of the fine will be accumulated example 95km/h.
 * Example (Speed=100, Signals=[110,100,80]-> 250)
 * */
public class SpeedLimit {

    public static void main(String[] args) {
        System.out.println(speedLimit(60, new int[] {80,70,60 }));//0
        System.out.println(speedLimit(90, new int[] {80}));//100
        System.out.println(speedLimit(100, new int[]{110,100,80}));//250
        System.out.println(speedLimit(130, new int[]{140,130,100}));//500
        System.out.println(speedLimit(110, new int[]{120,110,100}));//100
        System.out.println(speedLimit(220, new int[]{120,110,100}));//1500
        System.out.println(speedLimit(100, new int[]{70,80,90,100}));//850
    }

    public static int speedLimit(final int speed, final int[] signals) {
        int result = 0;
        for (int signal : signals) {
            int exceed = speed - signal;
            if (exceed >= 10) {
                if (exceed <= 19) {
                    result += 100;
                } else if (exceed <= 29) {
                    result += 250;
                } else {
                    result += 500;
                }
            }
        }
        return result;
    }
}
