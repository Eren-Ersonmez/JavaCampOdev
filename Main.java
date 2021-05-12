
public class Main {
    
      public static void main(String[] args) {
      
        
        Person person1=new Person(1,"Eren","Ersönmez","Bilişim",7200);
        
        Person person2=new Person(2, "Muhlis","Buluş","Pazarlama",5650);
        
        Person person3=new Person(3, "Umut", "Doymaz", "İnsan Kaynakları",4200);
        
        PersonManager.personelEkle(person1);
        
        PersonManager.personelEkle(person2);
        
        PersonManager.personelListesiGoster();
        
        PersonManager.personelSil(2);

        PersonManager.personelGuncelle(3, 2, "Muhlis","Buluş","Bilişim", 6000);
    }
}
