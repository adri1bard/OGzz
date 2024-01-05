package fr.isen.ordersmanagement.interfaces.model.enums;


//begin of modifiable zone(Javadoc).......C/72b60a55-0356-4235-9b16-52056a6713b1

//end of modifiable zone(Javadoc).........E/72b60a55-0356-4235-9b16-52056a6713b1
public enum ServiceLevel {

    Essential,
    Advanced,
    Prenium;


    public static ServiceLevel convert(int num){
        ServiceLevel retour = null;
        switch (num){
            case 1:
                retour =  Essential;
                break;
            case 2:
                retour = Advanced;
                break;
            case 3:
                retour = Prenium;
                break;
        }
        return retour;
    }
}
