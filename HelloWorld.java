class HelloWorld{
  String name;
  
  public void setName(){
    this.name = name;
  }
  
  public String getName(){
    return name;
  }
  
  public static void main(String [] args){
    HelloWorld hw = new HelloWorld();
    hw.setName("Rahul");
    System.out.println("Hello " + hw.getName() + " !!!");
  }
}  
