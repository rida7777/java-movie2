package main.java.domain;

import static main.java.utils.DateTimeUtils.format;
import java.time.LocalDateTime;

public class PlaySchedule {
    private final LocalDateTime startDateTime;
    private int capacity;

    public PlaySchedule(LocalDateTime startDateTime, int capacity) {
        this.startDateTime = startDateTime;
        this.capacity = capacity;
    }

    public void buyTicket(int buyCount) {
    	if (capacity - buyCount < 0) {
    		throw new IllegalArgumentException("인원초과");
    	}
    	this.capacity -= buyCount;
    }
    
    @Override
    public String toString() {
        return "시작시간: " + format(startDateTime) + " 예약가능인원: " + capacity + "\n";
    }
}