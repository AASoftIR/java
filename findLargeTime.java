public static void main(String[] args) {
    Time[] times = new Time[4];
    
    for (int i = 0; i < 4; i++) {
        Time t = new Time();
        t.readTime();
        times[i] = t;
    }
    
    Time largest = times[0];
    for (int i = 1; i < 4; i++) {
        if (times[i].hour > largest.hour) {
            largest = times[i];
        } else if (times[i].hour == largest.hour && times[i].minute > largest.minute) {
            largest = times[i];
        } else if (times[i].hour == largest.hour && times[i].minute == largest.minute && times[i].second > largest.second) {
            largest = times[i];
        }
    }
    
    System
