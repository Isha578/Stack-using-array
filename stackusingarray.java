public class stackusingarray {
    public int[] arr;
    public int top;


//    ublic  stackusingarray()
//    {
//
//        this.size(default_Capacity);
//    }
    public stackusingarray(int capacity) throws Exception
    {
        arr= new int[capacity];
        this.top=-1;
        if(capacity<1)
        {
            throw new Exception("invalid input size");
        }

    }
    public int size()
    {
        return top+1;

    }
    public boolean isempty()
    {
        return  this.size()==0;

    }
    public void push(int value) throws Exception
    {
        if(this.size()==this. arr.length)
        {
          throw new Exception("array is full");

        }
        this. top++;
       this. arr[this.top]=value;
    }

    public int pop()throws Exception
    {
        if(this.size()==0)
        {
            throw new Exception("array is empty");
        }
        int rv=arr[top];
        arr[top]=0;
        top--;
        return rv;
    }
    public int top()throws Exception
    {
        if(this.size()==0)
        {
            throw new Exception("array is empty");
        }
        int rv=arr[top];
        return rv;
    }
    public void display()
    {
        int i;
        for(i = this.top; i>=0; i--)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println("end ");


    }
}
