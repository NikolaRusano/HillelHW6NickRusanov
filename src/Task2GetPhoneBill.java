public class Task2GetPhoneBill<total> {
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

    public double CountPriceGBQuantity(int usedGB){
        double pricecount;
        if(usedGB<=8){
            return pricecount = (usedGB - 8) * 100;
        }else{
            return 0;
        }

    }

    public double CountPricePhoneAroundUkraine(double minutesPhoneTalkUKR){
        double phoneTalkUKRPrice;
        if(minutesPhoneTalkUKR <= 500){
            return phoneTalkUKRPrice = minutesPhoneTalkUKR * 0.5;

        }else{
            return phoneTalkUKRPrice = (500 * 0.5) + ((minutesPhoneTalkUKR -500) * 0.5);
        }
    }
    public double CountPriceSMSmessage(int quantitySentSms){
        double sentSmsPrice;
        if(quantitySentSms <= 50){
            return sentSmsPrice = quantitySentSms*1;

        }else {
            return sentSmsPrice = (50*1) + ((quantitySentSms-50)*1.5);
        }
    }

    public double CounrPriceCallsAbroadZone1(double abroadCallsZone1){
        double priceCallsAbroadZone1;
        return priceCallsAbroadZone1 = abroadCallsZone1 * 1.5;
    }
    public double CounrPriceCallsAbroadZone2(double abroadCallsZone2){
        double priceCallsAbroadZone2;
        return priceCallsAbroadZone2 = abroadCallsZone2 * 2;
    }
    public double CountTotalPhoneBill(double basicInternetPackagePrice, double callsAroundUkraineMinutes, double callsAbroadZone1, double callsAbroadZone2, int usedGB, int quantitySentSms) {
        double total = (basicInternetPackagePrice + CountPriceGBQuantity(usedGB) + CountPricePhoneAroundUkraine(callsAroundUkraineMinutes) +
                CountPriceSMSmessage(quantitySentSms) + CounrPriceCallsAbroadZone1(callsAbroadZone1) + CounrPriceCallsAbroadZone2(callsAbroadZone2));
        return total = total - (total * 0.07);
    }
}
