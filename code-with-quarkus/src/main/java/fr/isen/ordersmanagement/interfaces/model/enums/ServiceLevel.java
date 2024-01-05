package fr.isen.ordersmanagement.interfaces.model.enums;


//begin of modifiable zone(Javadoc).......C/72b60a55-0356-4235-9b16-52056a6713b1

//end of modifiable zone(Javadoc).........E/72b60a55-0356-4235-9b16-52056a6713b1
public enum ServiceLevel {
//begin of modifiable zone(Javadoc).......C/24e261d1-6680-4721-a922-4cc9758e3604

//end of modifiable zone(Javadoc).........E/24e261d1-6680-4721-a922-4cc9758e3604
    Essential,
//begin of modifiable zone(Javadoc).......C/983b3427-e120-477e-b6f2-5d5533eb3795

//end of modifiable zone(Javadoc).........E/983b3427-e120-477e-b6f2-5d5533eb3795
    Premium,
//begin of modifiable zone(Javadoc).......C/0f506846-0497-4396-9d12-2a924ac3ba39

//end of modifiable zone(Javadoc).........E/0f506846-0497-4396-9d12-2a924ac3ba39
    Advanced;

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
                retour = Premium;
                break;
        }
        return retour;
    }

    public static int convertEnumToInt(ServiceLevel level){
        int retour = 0;
        switch (level){
            case Essential:
                retour = 1;
                break;
            case Advanced:
                retour = 2;
                break;
            case Premium:
                retour = 3;
                break;
        }

        return retour;
    }
}
