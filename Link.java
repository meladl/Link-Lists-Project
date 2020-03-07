//Mohamed Eladl
//ID:1203261
//CSCI 260
class Link{
    public int iData;                        
    public Link next;            

    public Link(int id){
        iData = id;                               
    }                          

    public void displayLink(){
        System.out.print("{" + iData + "} ");
    }
}  
