public class Time {
    private String time;
    private int minuteLeft;
    public Time(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public int getMinuteLeft(){
        return minuteLeft;
    }

    public boolean compareTime(String time1) {
        String[] datetimes1 = time.split(" ");
        String[] times1 = datetimes1[1].split(":");
        String[] datetimes2 = time1.split(" ");
        String[] times2 = datetimes2[1].split(":");
       
        if (datetimes1[0].compareTo(datetimes2[0]) >= 0) {
            if ((Integer.parseInt(times1[0]) ) < Integer.parseInt(times2[0])) {
                return true;
            } else if ((Integer.parseInt(times1[0]) ) == Integer.parseInt(times2[0])) {
                if (Integer.parseInt(times1[1]) >= Integer.parseInt(times2[1]))
                    return true;
                minuteLeft=Integer.parseInt(times2[1])-Integer.parseInt(times1[1]);
                return false;
            }
            minuteLeft=10;
            return false;
        }
        minuteLeft=10;
        return false;
    }
}