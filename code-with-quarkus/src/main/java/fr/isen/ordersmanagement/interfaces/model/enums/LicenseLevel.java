package fr.isen.ordersmanagement.interfaces.model.enums;


//begin of modifiable zone(Javadoc).......C/3227b2de-79d0-4e39-bc33-c963dc966c36

//end of modifiable zone(Javadoc).........E/3227b2de-79d0-4e39-bc33-c963dc966c36
public enum LicenseLevel {
    Dedicated,
    Shared;

    public static LicenseLevel convert(int num){
        if(num == 1) return Dedicated;
        else if (num == 2) return Shared;
        return null;
    }

    public static int convertEnumToInt(LicenseLevel licenseEnum){
        if(licenseEnum == Dedicated) return 1;
        else if (licenseEnum == Shared) return 2;
        return 0;
    }
}
