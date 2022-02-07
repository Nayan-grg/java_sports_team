package pojos;

public class Player {


    //toString method obtain the default from the Object class therefore you need to override it, in order to get
    //readable version of the class 
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number=" + number +
                ", contractLength=" + contractLength +
                '}';
    }

    //properties
    private String name;
    private String position;
    private int number;
    private int contractLength;

    //constructor
    public Player(String name , String position,int number,int contractLength){
        this.name=name;
        this.position=position;
        this.number=number;
        this.contractLength=contractLength;
    }
    //default constructor
    public Player(){
    }

    //getter and setters -> every property need to have getters and setters
    //Encapsulation - properties of the class is only accessible through the class via its methods
    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }
    public int getNumber(){
        return number;
    }
    public int getContractLength(){
        return contractLength;
    }


    public void setName(String name){
        this.name=name;
    }

    public void setPosition(String position){
        this.position=position;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public void setContractLength(int contractLength){
        this.contractLength=contractLength;
    }

}
