/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */
public interface Serviceitem {
    public void displayService();
    public float petPrice(int serviceitem);
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);
}
