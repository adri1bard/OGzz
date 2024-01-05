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
}
