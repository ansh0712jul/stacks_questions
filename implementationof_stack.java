public class implementationof_stack {
    private int[] arr;
    private int indx;
    public  implementationof_stack(){
        arr=new int[5];
    }
    public  implementationof_stack(int n){
        arr=new int[5];
    }
    public boolean isempty(){
        return indx==0;
    }
    public boolean isfull(){
        return arr.length==indx;
    }
    public int size(){
        return indx;
    }
    public void push(int item) throws Exception{
        if(isfull()){
            throw new Exception("Stack full h bkl!!");
        }
        arr[indx]=item;
        indx++;

    }
    public int pop()throws Exception{
        if(isempty()){
            throw new Exception("stack khaali h bkl!!");
        }
        indx--;
        return arr[indx];
    }
    public int peek(){
        return arr[indx-1];
    }
    public void Display(){
        for(int i=0;i<indx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();   
    }

}
