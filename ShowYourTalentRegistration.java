class EventRegistration {
    String name;
    String nameOfEvent;
    double registrationFee;

    public EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public void registerEvent() {
        System.out.println("Please choose a valid event");
    }
}

class SingleEventRegistration extends EventRegistration {
    int participantNo;

    public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent() {
        switch (nameOfEvent) {
            case "ShakeALeg":
                registrationFee = 100.0;
                break;
            case "Sing&Win":
                registrationFee = 150.0;
                break;
            case "PlayAway":
                registrationFee = 130.0;
                break;
            default:
                super.registerEvent();
                return;
        }
        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
        System.out.println("You are participant no: " + participantNo);
    }
}

class TeamEventRegistration extends EventRegistration {
    int teamNo;
    int noOfParticipants;

    public TeamEventRegistration(String name, String nameOfEvent, int teamNo, int noOfParticipants) {
        super(name, nameOfEvent);
        this.teamNo = teamNo;
        this.noOfParticipants = noOfParticipants;
    }

    @Override
    public void registerEvent() {
        double baseFee;
        switch (nameOfEvent) {
            case "ShakeALeg":
                baseFee = 50.0;
                break;
            case "Sing&Win":
                baseFee = 60.0;
                break;
            case "Actathon":
                baseFee = 80.0;
                break;
            case "PlayAway":
                baseFee = 100.0;
                break;
            default:
                super.registerEvent();
                return;
        }
        registrationFee = baseFee * noOfParticipants;
        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
        System.out.println("You are participant no: " + teamNo);
    }
}

public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        // Create an instance of SingleEventRegistration with reference of EventRegistration
        // as participant1, and initialize the same with values given
        SingleEventRegistration participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        // Invoke the method registerEvent using participant1
        participant1.registerEvent();

        // Create an instance of TeamEventRegistration with reference of EventRegistration
        // as team1, and initialize the same with values given
        TeamEventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 1, 5);
        // Invoke the method registerEvent using team1
        team1.registerEvent();

        // Create an instance of SingleEventRegistration with reference of EventRegistration
        // as participant2, and initialize the same with values given
        SingleEventRegistration participant2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        // Invoke the method registerEvent using participant2
        participant2.registerEvent();
    }
}
