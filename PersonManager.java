
import java.util.ArrayList;
import java.util.Scanner;


public class PersonManager {
    
   static ArrayList<Person> persons=new ArrayList<>();
    
    public static void personelListesiGoster()
    {
        if (persons.size()>0) 
        {
             for (Person person : persons)
             {
            
            System.out.println("Id:"+person.getId()+" "
                             + "İsim:"+person.getFirstName()+" "
                             + "Soyisim:"+person.getLastName()+" "
                             + "Departman:"+person.getDepartment()+" "
                             + "Maaş:"+person.getSalary());
            System.out.println("*******************************************   ");
             }

        }
        else
        {
            System.out.println("Gösterebilecek çalışan bulunmuyor!!!");
        
        }
  
    }
    
    public static void personelEkle(Person person)
    {
     
        persons.add(person);
         
         System.out.println("Personel Başarıyla eklendi...");
    
    }
    public static void personelSil(int i)
    {
      
         persons.remove(i);
         
         System.out.println("Personel Başarıyla silindi.");
         
         personelListesiGoster();
    
    }
    public static void personelGuncelle(int i,int yeniId,String yeniFisrtname,String yeniLastname,String yeniDepartman,int yeniMaas)
    {
       
      persons.add(i, new Person(yeniId, yeniLastname, yeniLastname, yeniDepartman, yeniId));
    
        System.out.println("Personel Başarıyla silindi.");
        
        personelListesiGoster();
    }
   
  
}
