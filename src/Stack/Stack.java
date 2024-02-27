package Stack;

public class Stack {

    int stack[] = new int[5];
    int top = 0;
    public void push(int data){
        if(top==4){
            System.out.println("Stack is full");
        }
        stack[top] = data;
        top++;
    }

    public void show(){
        for(int n: stack){
            System.out.print(n + " ");
        }
    }
    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }
    public int pop(){
        top--;
        int data;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek(){
        int data;
        data = stack[top--];
        return data;
    }

}
