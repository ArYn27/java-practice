// Base class
class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Aggregated class
class Team {
    String teamName;

    Team(String teamName) {
        this.teamName = teamName;
    }

    void showTeam() {
        System.out.println("Team: " + teamName);
    }
}

// Derived classes
class Manager extends Employee {
    Manager(String name, int id) {
        super(name, id);
    }

    void manage() {
        System.out.println(name + " is managing the team.");
    }
}

class Developer extends Employee {
    Developer(String name, int id) {
        super(name, id);
    }

    void develop() {
        System.out.println(name + " is writing code.");
    }
}

class Intern extends Employee {
    Intern(String name, int id) {
        super(name, id);
    }

    void learn() {
        System.out.println(name + " is learning new skills.");
    }
}

// Main class
public class Company {
    public static void main(String[] args) {
        Team teamA = new Team("Alpha");
        Team teamB = new Team("Beta");

        Manager m = new Manager("Alice", 101);
        Developer d = new Developer("Bob", 102);
        Intern i = new Intern("Charlie", 103);

        m.displayInfo();
        m.manage();
        teamA.showTeam();

        d.displayInfo();
        d.develop();
        teamB.showTeam();

        i.displayInfo();
        i.learn();
        teamA.showTeam();
    }
}
