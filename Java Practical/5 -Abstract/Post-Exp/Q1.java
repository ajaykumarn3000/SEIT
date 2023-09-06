// Consider a hierarchy, where a sportsperson can either be an athlete or a hockey player. Every
// sportsperson has a unique name. An athlete is characterized by the event in which he/she participates;
// where as a hockey player is characterised by the number of goals scored by him/her.


class SportsPerson {
  String name;
}

class Athlete extends SportsPerson {
  int eventsParticipated;
  Athlete (String name) {
    this.name = name;
    eventsParticipated = 0;
  }
  Athlete (String name, int participated) {
    this.name = name;
    this.eventsParticipated = participated;
  }
  void participate() {
    this.eventsParticipated ++;
  }
  void displayAll() {
    System.out.println("Name: "+this.name);
    
  }
}

class Hockey extends SportsPerson {
  int noOfGoals;
  Hockey (String name) {
    this.name = name;
    this.noOfGoals = 0;
  }
  Hockey (String name, int goals) {
    this.name = name;
    this.noOfGoals = goals;
  }
  void goal() {
    this.noOfGoals ++;
  }
}

class Q1 {
  public static void main(String[] args) {
    Hockey hockey = new Hockey("Ajaykumar", 4);
    hockey.goal();

    Athlete athlete = new Athlete("Kevin");
    athlete.participate();
  }
}