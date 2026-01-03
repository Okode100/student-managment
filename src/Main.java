import util.StudentController;

 public  class Main{
    public static void main(String[] args){
        StudentController controller = new StudentController();
        controller.createStudent("Moses Okode", 22, 101, "mosesokode76@gmail.com");

        System.out.println(controller);

    }


}