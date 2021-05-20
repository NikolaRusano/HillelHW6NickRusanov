public class Task2GetPhoneBill {
    private double basicInternetPackagePrice, callsAroundUkraineMinutes, callsAbroadZone1, callsAbroadZone2;
    private int usedGB, quantitySentSms;

    public Task2GetPhoneBill(double basicInternetPackagePrice, double callsAroundUkraineMinutes, double callsAbroadZone1, double callsAbroadZone2, int usedGB, int quantitySentSms) {
        this.basicInternetPackagePrice = basicInternetPackagePrice;
        this.callsAroundUkraineMinutes = callsAroundUkraineMinutes;
        this.callsAbroadZone1 = callsAbroadZone1;
        this.callsAbroadZone2 = callsAbroadZone2;
        this.usedGB = usedGB;
        this.quantitySentSms = quantitySentSms;
    }

    static double CountPriceGBQuantity(double usedGB){
        double pricecount;
        if(usedGB<=8){
            return pricecount = (usedGB - 8) * 100;
        }else{
            return 0;
        }

    }

    static double CountPricePhoneAroundUkraine(double minutesPhoneTalkUKR){
        double phoneTalkUKRPrice;
        if(minutesPhoneTalkUKR <= 500){
            return phoneTalkUKRPrice = minutesPhoneTalkUKR * 0.5;

        }else{
            return phoneTalkUKRPrice = (500 * 0.5) + ((minutesPhoneTalkUKR -500) * 0.5);
        }
    }
    static double CountPriceSMSmessage(int quantitySentSms){
        double sentSmsPrice;
        if(quantitySentSms <= 50){
            return sentSmsPrice = quantitySentSms*1;

        }else {
            return sentSmsPrice = (50*1) + ((quantitySentSms-50)*1.5);
        }
    }

    static double CounrPriceCallsAbroadZone1(double abroadCallsZone1){
        double priceCallsAbroadZone1;
        return priceCallsAbroadZone1 = abroadCallsZone1 * 1.5;
    }
    static double CounrPriceCallsAbroadZone2(double abroadCallsZone2){
        double priceCallsAbroadZone2;
        return priceCallsAbroadZone2 = abroadCallsZone2 * 2;
    }
    public double CountTotalPhoneBill
    double total = (basicInternetPrice+ CountPriceGBQuantity(usedGB)+ CountPricePhoneAroundUkraine(minutesPhoneTalkUKR) +
            CountPriceSMSmessage(quantitySentSms) + CounrPriceCallsAbroadZone1(abroadCallsZone1) + CounrPriceCallsAbroadZone2(abroadCallsZone2));
    total = total - (total *0.07);

}
