package fr.isen.ordersmanagement.interfaces.model.enums;


//begin of modifiable zone(Javadoc).......C/ccc18fb3-55a0-44a2-a73a-5711ef09e14b

//end of modifiable zone(Javadoc).........E/ccc18fb3-55a0-44a2-a73a-5711ef09e14b
public enum Area{
    NorthAmerica,
    Europe,
    Asia;


    public static Area convertIntToEnum(int num) {
        Area retour = null;
        switch (num){
            case 1:
                retour =  NorthAmerica;
                break;
            case 2:
                retour = Europe;
                break;
            case 3:
                retour = Asia;
                break;
        }
        return retour;
    }

    public static int convertEnumToInt(Area area) {
        int num = -1;
        switch (area){
            case NorthAmerica:
                num = 1;
                break;
            case Europe:
                num = 2;
                break;
            case Asia:
                num = 3;
                break;
        }
        return num;
    }
}
