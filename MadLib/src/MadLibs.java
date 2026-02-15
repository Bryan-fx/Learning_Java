import module java.base;

public class MadLibs {
    /*
    This program generates a mad libbed story.
  Author: BryanFX
  Date: 2/14/2026

    */
    public static void main(String[] args){
        String name1 = "Bob";
        String adjective1 = "Super Great!";
        String adjective2 = "Great";
        String noun1 = "Customers";
        String noun2 = "Food";
        String verb1 = "Punch Each Other";
        String noun3 = "Beat";
        String noun4 = "Worker";
        String adjective3 = "Annoyed";
        String name2 = "Nerp";
        String place1 = "florida";
        String noun5 = "rain";
        int number = 3030;
        String noun6 = "AI";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!'" +
                " Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+"" +
                " to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+"" +
                " texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+"." +
                " "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Created By BryanFX");
    }
}
