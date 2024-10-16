import first.Students;
import second.CreditCard;
import second.TransferService;

public class Main {
    public static void main(String[] args) {
        Students[] students = new Students[5];

        students[0] = new Students("Kirill", "Monich", "MC1231231", "C32-onl", 20);
        students[1] = new Students("Nikita", "Pupkin", "BH5341345", "C32-onl", 15);
        students[2] = new Students("Oleg", "Savitskii", "AB1023523", "C32-onl", 18);
        students[3] = new Students("Kate", "Rublevskaya", "BC5345311", "C32-onl", 20);
        students[4] = new Students("Dmitry", "Hmara", "KM4098736", "C32-onl", 22);

        for (Students student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("Surname: " + student.surname);
            System.out.println("Passport number: " + student.passportNumber);
            System.out.println("Group name: " + student.groupName);
            System.out.println("Age: " + student.age);
            System.out.println();
        }

        System.out.println("------------------------------------------------------------");
        System.out.println();

        CreditCard card1 = new CreditCard("1234-5678-9023-1522", 1000);
        CreditCard card2 = new CreditCard("6754-4234-6335-9821", 500);
        CreditCard card3 = new CreditCard("9812-2411-5431-7742", 1500);

        TransferService transferService = new TransferService();

        transferService.deposit(card1, 2500);
        transferService.deposit(card2, 10000);
        transferService.withdraw(card3, 1000);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}