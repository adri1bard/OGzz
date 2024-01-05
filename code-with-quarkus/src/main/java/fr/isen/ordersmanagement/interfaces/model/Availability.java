package fr.isen.ordersmanagement.interfaces.model;

import fr.isen.ordersmanagement.interfaces.model.enums.TimeSlot;
import fr.isen.ordersmanagement.interfaces.model.enums.WeekDay;

//begin of modifiable zone(Javadoc).......C/9f8e42f4-adb0-47f0-ae10-be12de18e358

//end of modifiable zone(Javadoc).........E/9f8e42f4-adb0-47f0-ae10-be12de18e358
public class Availability {
//begin of modifiable zone(Javadoc).......C/a222bfba-f5cc-430a-a9bb-3b08d7339e52

//end of modifiable zone(Javadoc).........E/a222bfba-f5cc-430a-a9bb-3b08d7339e52
    private boolean morning;

    public boolean isMorning() {
        // Automatically generated method. Please do not modify this code.
        return this.morning;
    }

    public void setMorning(final boolean value) {
        // Automatically generated method. Please do not modify this code.
        this.morning = value;
    }

//begin of modifiable zone(Javadoc).......C/9296587a-27dd-4208-9fb5-116edf50b827

//end of modifiable zone(Javadoc).........E/9296587a-27dd-4208-9fb5-116edf50b827
    private boolean afternoon;

    public boolean isAfternoon() {
        // Automatically generated method. Please do not modify this code.
        return this.afternoon;
    }

    public void setAfternoon(final boolean value) {
        // Automatically generated method. Please do not modify this code.
        this.afternoon = value;
    }

//begin of modifiable zone(Javadoc).......C/ffeee4bb-03e0-43cc-ae1b-511f261d31e0

//end of modifiable zone(Javadoc).........E/ffeee4bb-03e0-43cc-ae1b-511f261d31e0
    private WeekDay Day;

    public WeekDay getDay() {
        // Automatically generated method. Please do not modify this code.
        return this.Day;
    }

    public void setDay(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.Day = WeekDay.convertIntToEnum(value);

    }

//begin of modifiable zone(Javadoc).......C/c358dfd0-bd83-445c-83c4-e6ddd6343ec6

//end of modifiable zone(Javadoc).........E/c358dfd0-bd83-445c-83c4-e6ddd6343ec6
    private int idAvailability;

    public int getIdAvailability() {
        // Automatically generated method. Please do not modify this code.
        return this.idAvailability;
    }

    public void setIdAvailability(final int value) {
        // Automatically generated method. Please do not modify this code.
        this.idAvailability = value;
    }

//begin of modifiable zone(Javadoc).......C/e457c8d3-da3a-40e2-9470-0c7dae1d91d5

//end of modifiable zone(Javadoc).........E/e457c8d3-da3a-40e2-9470-0c7dae1d91d5
    public void setAvailability(final TimeSlot slot, final WeekDay Day) {
//begin of modifiable zone(JavaCode)......C/e457c8d3-da3a-40e2-9470-0c7dae1d91d5

//end of modifiable zone(JavaCode)........E/e457c8d3-da3a-40e2-9470-0c7dae1d91d5
    }

}
