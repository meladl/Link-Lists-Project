
class LinkList{
    private Link first;            

    public LinkList(){
        first = null;            
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id){                       
        Link newLink = new Link(id);
        newLink.next = first;       
        first = newLink;            
    }

    public Link deleteFirst(){                        
        Link temp = first;          
        first = first.next;        
        return temp;               
    }

    public void displayList(){
        Link current = first; 
        while(current != null){
            current.displayLink();   
            current = current.next;  
        }
        System.out.println("");
    }

    public void removeAll(int n){
        LinkList temp = new LinkList();
        LinkList temp2 = new LinkList();
        Link current = first;
        

        while(current != null){
            if(current.iData != n) {
               temp.insertFirst(current.iData);
            } 
            current = current.next;  
        }
       Link tempCurrent = temp.first;
        while(tempCurrent != null){
            temp2.insertFirst(tempCurrent.iData);
            tempCurrent = tempCurrent.next;  
        }
        temp2.displayList(); 
    }

    public void removeLast(int n){
        Link current = first;
        int count = 0;
        while(current != null){
            if(current.iData == n) {
                count++;
            } 
            current = current.next;  
        }
        Link previous = null;
        current = first;
        while(current != null){
            if(current.iData == n) {
                count--;
                if(count == 0){
                    previous.next = current.next;
                } 
            } 
            previous = current;
            current = current.next;  
        }   
        this.displayList();
    }   
    ////////////////////////////////////////////////////////////////

    public static void main(String[] args){
        LinkList theList = new LinkList();  

        theList.insertFirst(22);      
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88); 
        theList.insertFirst(22);      
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.insertFirst(22);      
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        System.out.print("The Orginal List: ");
        theList.displayList();
        System.out.println("");
        System.out.print("The List After RemoveAll Method: ");
        theList.removeAll(22);  
        System.out.println("");
        System.out.print("The List After RemoveLast Method: ");
        theList.removeLast(22);

    }  
}
////////////////////////////////////////////////////////////////
