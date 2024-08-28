import java.util.Scanner;

public class WestminsterSkinConsultationManager implements SkinConsultationManager
{
  Scanner scanner = new Scanner(System.in);
  Doctor doctor = new Doctor();
  public void AddDoctor(){
    System.out.println("Enter the doctor name:");
    String docName =scanner.next();
    doctor.setName(docName);

    System.out.println("Enter the doctor surname:");
    String docSurName =scanner.next();
    doctor.setName(docSurName);

    System.out.println("Enter the doctor DOB:");
    String dateOfBirth =scanner.next();
    doctor.setName(dateOfBirth);

    System.out.println("Enter the doctor Mobile Number:");
    String MobNo =scanner.next();
    doctor.setName(MobNo);
  }
  public void DeleteDoctor(){

  }
  public void PrintDoctorList(){

  }
}
