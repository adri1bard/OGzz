package fr.isen.ordersmanagement.interfaces.model.enums;

import java.sql.Time;

public enum TimeSlot {
    AM,
    PM;

    public static TimeSlot convert(int num){
        if(num == 1) return AM;
        else if (num == 2) return PM;
        return null;
    }
}
