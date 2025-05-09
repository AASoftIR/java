public static void main(String[] args) {
    Time[] times = new Time[5];
    
    for (int i = 0; i < 5; i++) {
        Time t = new Time();
        t.readTime();
        times[i] = t;
    }
    
    for (int i = 0; i < 5; i++) {
        times[i].displayTime();
    }
}
