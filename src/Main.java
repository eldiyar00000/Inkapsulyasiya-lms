public class Main {
    public static void main(String[] args) {
        University university = new University("Matem","edi baha",37);
        University university1 = new University("fizika","beka adi bekish",72);
        University university2 = new University("fizra","ertyu tyuj fghj",36);
        University[] univer = {university,university1,university2};

////////////////
        School school = new School((byte) 72, (byte) 8, (byte) 5);
        School school1 = new School((byte) 36, (byte) 23, (byte) 2);
        School school2 = new School((byte) 32, (byte) 12, (byte) 7);
        School[] schools = {school, school1, school2};

////////////////
        Car car = new Car(210,"Mers", (short) 2020);
        Car car1 = new Car(34,"BMW", (short) 2023);
        Car car2 = new Car(123,"DFGH", (short) 2024);
        Car[] cars = {car, car1, car2};
//////////////
        Person person = new Person("Edi","bash",23);
        Person person1 = new Person("Adi","kol",34);
        Person person2 = new Person("Baha","mee",654);
        Person[] people = {person,person1,person2};

        for (University univer6 : univer){
            System.out.println(univer6.getUnivInfo());

        for (School school3 : schools)   {
            System.out.println(school3.getIndoNumber());

        for (Car car3 : cars) {
            System.out.println(car3.getInfoCar());

        for (Person person3 : people)   {
            System.out.println(person3.getInfoJava());
                 }
              }
            }
         }
      }
   }