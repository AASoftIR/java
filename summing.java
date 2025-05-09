public static void main(String[] args) {
    Time[] times = new Time[4];
    int totalSeconds = 0;
    
    for (int i = 0; i < 4; i++) {
        Time t = new Time();
        t.readTime();
        times[i] = t;
        totalSeconds += t.hour * 3600 + t.minute * 60 + t.second;
    }
    
    int hours = totalSeconds / 3600;
    int minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;
    
    Time sum = new Time(hours, minutes, seconds);
    sum.displayTime();
}
