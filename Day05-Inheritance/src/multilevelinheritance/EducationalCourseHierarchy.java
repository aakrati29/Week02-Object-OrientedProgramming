package multilevelinheritance;

class Course {
    String courseName ;
    int duration;

    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    public String getInfo(){
        return "Course name : "+courseName+", Duration is : " +duration;
    }
}

class OnlineCourse extends Course{
    String platform;
    String isRecorded;

    OnlineCourse(String courseName, int duration, String platform, String isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+", platform is "+platform+", is recorded "+isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, String isRecorded, double fee, double discount){
        super(courseName, duration, platform,isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+ ", fee is : " + fee + ", discount " + discount;
    }

}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Java FullStack", 6);
        System.out.println(course.getInfo());

        OnlineCourse oc = new OnlineCourse("Java FullStack", 6 , "Youtube", "Yes");
        System.out.println(oc.getInfo());

        PaidOnlineCourse pc = new PaidOnlineCourse("Java FullStack", 6, "Youtube", "yes", 4000, 5);
        System.out.println(pc.getInfo());

    }
}

