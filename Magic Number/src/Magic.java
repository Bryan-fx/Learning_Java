public class Magic {


    public static void main(String[] args) {


        //The Variable myNumber could be equal to any number that's less than the limit the INT has, and it will equal the same thing!
        int myNumber = 10;
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        //printing the value of the last step
        System.out.println(magicNumber);







    }
}