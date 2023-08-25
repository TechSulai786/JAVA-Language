public class Main {
    private String s;
    public void setstr(String sname)
    {
        s=sname;
    }
    public String getstr()
    {
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main obj=new Main();
        obj.setstr("Tech sulai");
       String ss=obj.getstr();
        System.out.println(ss);
        System.out.println(obj.getstr());


    }
}