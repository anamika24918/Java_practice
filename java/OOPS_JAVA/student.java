public class student{
    // private int sid;
    // private String name;

    // public void setDetails(int s,String n){
    //     System.out.println("inside setter method");
    //     this.sid=s;
    //     this.name=n;
    // }

    //GETTER SETTER METHOD
    // student(int s,String n){
    //     this.sid=s;
    //     this.name=n;
    // }
    // public int getsid(){
    //     return sid;
    // }
    // public String getname(){
    //     return name;
    // }
    public static void main(String args[]){
        // int number[]={11,22,33,44,55};
        // String names[]=new String[5];
        int arr[][]={{11,22,33},{44,55,66}};
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // for(int i=0;i<names.length;i++){
        //     System.out.println("names["+i+"]:" +names[i]);
        // }
        // student st=new student(12,"annu");
        //  student st=new student();
        //  st.setDetails(15,"annu");
        // System.out.println("student id-"+st.getsid());
        // System.out.println("student name -"+st.getname());
        

    }
}