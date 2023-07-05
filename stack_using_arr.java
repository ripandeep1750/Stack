// IMPLEMENTING STACK USING ARRAY.
class Stack{
    static final int MAX = 1000;
    int a[] = new int[MAX];
    int top;
    
    boolean isEmpty(){
      return (top<0);
    }
    Stack(){
        top=-1;
    }
    
    boolean push(int x){
        if(top>=MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println(x + " pushed into the stack.");
            return true;
        }
    }
    
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top--];
            System.out.println(x + " poped out of stack.");
            return x;
        }
    }
    
    int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top];
            System.out.println(x + " top element in array.");
            return x;
        }
    }
    
    void printArray(){
        for(int i=top;i>-1;i--){
            System.out.print(a[i] + " ");
        }
    }
}

class Main{
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.peek();
        System.out.println("Remaining stack elements ");
        s.printArray();
    }
}
