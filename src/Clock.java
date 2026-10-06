/**
 *
 */
public class Clock implements Comparable<Clock> {

    private int myHour;
    private int myMinute;
    private int mySecond;

    public Clock(final int theHour, final int theMinute, final int theSecond) {
        myHour = theHour;
        myMinute = theMinute;
        mySecond = theSecond;
    }

    public Clock() {
        setHour(23);
        setMinute(58);
        setSecond(0);
    }

    @Override
    public int compareTo(Clock clock) {
        return 0;
    }

    public void advanceMinute(int i)
    {

    }

    public int getMinute()
    {
        return myMinute;
    }

    public void setMinute(int i) {

    }

    public int getHour() {
        return myHour;
    }

    public void setHour(int i)
    {
    }

    public void advanceHour(int i)
    {
    }

    public void setSecond(int i)
    {

    }

    public int getSecond() {
        return mySecond;
    }

    @Override
    public String toString() {
        return myHour + ":" + myMinute + ":" + mySecond;
    }

    private boolean isValidTimeValue(int value, TimeType timeType)
    {
        int min = 0;
        int max = timeType == TimeType.Hour ? 24 : 60;

        return value >= min && value <= max;
    }

    private enum TimeType {
        Hour,
        Minute,
        Second
    }

}
