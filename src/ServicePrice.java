/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */
public class ServicePrice implements Serviceitem{
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
        
    }
    public void setPriceService(float priceService) {
        this.priceService = priceService;        
    }

    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.println("Choose (1/2/3):");
    }

    public float getPrice(int serviceitem) {
        return priceService;

    }

    public boolean checkMemberStatus(String statusMember) {
       
        return false;

    }

    public float getSale(boolean isMember, float parServicePrice) {
        /**
         * 
                if (isMember) {
                    parServicePrice = priceService-(0.1 * priceService);
                }
         */
        return parServicePrice;

    }

    public float getTotalPay(float priceService, float discount) {
        return priceService-discount;

    }

    @Override
    public float petPrice(int serviceitem) {
        int haircut = 45000;
        int haircutwash = 55000;
        int hairwash = 15000;
        return 0;
    }
}
