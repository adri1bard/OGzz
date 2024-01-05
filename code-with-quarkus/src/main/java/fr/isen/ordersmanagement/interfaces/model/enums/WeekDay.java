package fr.isen.ordersmanagement.interfaces.model.enums;

public enum WeekDay {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public static WeekDay convertIntToEnum(int num) {
        WeekDay retour = null;
        switch (num){
            case 1:
                retour =  Monday;
                break;
            case 2:
                retour = Tuesday;
                break;
            case 3:
                retour = Wednesday;
                break;
            case 4:
                retour = Thursday;
                break;
            case 5:
                retour = Friday;
                break;
            case 6:
                retour = Saturday;
                break;
            case 7:
                retour = Sunday;
                break;

        }
        return retour;
    }

    public static int convertEnumToInt(WeekDay day) {
        int retour = -1;
        switch (day){
            case Monday:
                retour = 1;
                break;
            case Tuesday:
                retour = 2;
                break;
            case Wednesday:
                retour = 3;
                break;
            case Thursday:
                retour = 4;
                break;
            case Friday:
                retour = 5;
                break;
            case Saturday:
                retour = 6;
                break;
            case Sunday:
                retour = 7;
                break;
        }
        return retour;
    }
}
