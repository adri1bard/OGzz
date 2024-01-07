package fr.isen.ordersmanagement.interfaces.model.enums;


//begin of modifiable zone(Javadoc).......C/9c2fd24c-508c-4995-895d-a3b54e792185

//end of modifiable zone(Javadoc).........E/9c2fd24c-508c-4995-895d-a3b54e792185
public enum State {
    Current,
    Draft,
    Ordered;

    public static State convertIntToEnum(int num) {
        State retour = null;
        switch (num){
            case 1:
                retour =  Current;
                break;
            case 2:
                retour = Draft;
                break;
            case 3:
                retour = Ordered;
                break;
        }
        return retour;
    }

    public static int convertEnumToInt(State s) {
        int num = -1;
        switch (s){
            case Current:
                num = 1;
                break;
            case Draft:
                num = 2;
                break;
            case Ordered:
                num = 3;
                break;

        }
        return num;
    }
}
