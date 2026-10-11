/**
 *
 *
 * @author Sergio Leonel Mijares Carrasco
 * @version 10/8/26
 */
public class Clock implements Comparable<Clock>
{
    private static final int MAX_SECOND_MINUTE_VALUE = 60;
    private static final int MAX_HOUR_VALUE = 24;

    private static final int DEFAULT_HOUR = 23;
    private static final int DEFAULT_MINUTE = 58;

    private int myHour;
    private int myMinute;
    private int mySecond;

    public Clock(final int theHour, final int theMinute, final int theSecond)
    {
        myHour = theHour;
        myMinute = theMinute;
        mySecond = theSecond;
    }

    public Clock()
    {
        this(DEFAULT_HOUR, DEFAULT_MINUTE, 0);
    }

    @Override
    public int compareTo(final Clock clock)
    {
        return 0;
    }

    public void advanceMinute(final int i)
    {

    }

    public int getMinute()
    {
        return myMinute;
    }

    public void setMinute(final int minute)
    {
        if (isInvalidTimeValue(minute, TimeType.Minute))
            throw new IllegalArgumentException();

        myMinute = minute;
    }

    public int getHour()
    {
        return myHour;
    }

    public void setHour(final int newHour)
    {
        if (isInvalidTimeValue(newHour, TimeType.Hour))
        {
            throw new IllegalArgumentException();
        }

        myHour = newHour;
    }

    public void advanceHour(final int time)
    {
        if (time < 0)
        {
            throw new IllegalArgumentException();
        }

        if ((myHour + time) % 24 > 0)
        {

        }
    }

    public void setSecond(final int newSecond)
    {
        if (isInvalidTimeValue(newSecond, TimeType.Second))
        {
            throw new IllegalArgumentException();
        }

        mySecond = newSecond;
    }

    public int getSecond()
    {
        return mySecond;
    }

    @Override
    public String toString()
    {
        return myHour + ":" + myMinute + ":" + mySecond;
    }

    private boolean isInvalidTimeValue(final int value, final TimeType timeType)
    {
        int min = 0;
        int max = timeType == TimeType.Hour ? MAX_HOUR_VALUE : MAX_SECOND_MINUTE_VALUE;

        return value < min || value > max;
    }

    private enum TimeType
    {
        Hour,
        Minute,
        Second
    }

}
