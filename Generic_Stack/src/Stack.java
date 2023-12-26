
public class Stack {
    Node top;
    public <T> void push(T x){
        Node newNode = new Node(x);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }
    
    public void remove(){
        if(top == null){
            System.out.println("-- empty --");
        }else if(top.next == null){
            top = null;
        }else{
            top = top.next;
        }
    }
    
    public Node top(){
        return this.top();
    }
    
    public Node pop(){
        Node tmp = top;
       if(top == null){
           System.out.println("-- empty --");
       }else{
           top = top.next;
       }
       return tmp;
    }
    
    public void print(){
        if(top == null){
            return;
        }else{
            Node tmp = top;
            System.out.println("top --> ");
            while(tmp != null){
                System.out.println(tmp.data + ", ");
                tmp = tmp.next;
            }
        }
        System.out.println("");
    }
}
