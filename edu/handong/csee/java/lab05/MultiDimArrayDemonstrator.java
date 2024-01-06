public class MultiDimArrayDemonstrator {

    private String[] peopleInfo;

    public MultiDimArrayDemonstrator() {
        peopleInfo = new String[]{
            "Mr. Barack Obama 1961-08-04",
            "Mr. Bergoglio Sivori 1936-12-17",
            "Ms. Angela Merkel 1954-07-17",
            "Mr. Donald Trump 1946-06-14",
            "Ms. Greta Thunberg 2003-01-03",
            "Mr. Joseph Biden 1942-11-20",
            "Ms. Kamala Harris 1964-10-20"
        };
    }

    public void run() {
        System.out.println("People Info with Birthdays:");
        for (String info : peopleInfo) {
            String[] parts = info.split(" ");
            String title = parts[0];
            String name = parts[1] + " " + parts[2];
            String birthday = parts[3];
            System.out.println(title + " " + name + " " + birthday);
        }
    }

    public static void main(String[] args) {
        MultiDimArrayDemonstrator demonstrator = new MultiDimArrayDemonstrator();
        demonstrator.run();
  class MultiDimArrayDemonstrator {
    public static void main(String[] args) {
            String[][] names = {
                                                {"Mr. ", "Mrs. ", "Ms. "},
                                                {"Smith", "Jones"}
             };

  
             System.out.println(names[0][0] + names[1][0]);
      
             System.out.println(names[0][2] + names[1][1]);
      output
             System.out.println(names.length + " " + names[0].length);
    }
}
  }
}

