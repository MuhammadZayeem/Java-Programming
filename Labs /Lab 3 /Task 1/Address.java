public class Address{

private int House;
private int Street;
private String Town;

public Address(int House,int Street,String Town)
{
     this.House=House;
     this.Street=Street;
     this.Town=Town;
}
public String getTown(){
     return Town;
}
public int getHouse(){
     return House;
}
public int getStreet(){
     return Street;
}
public void setHouse( int House){
     this.House=House;
}
public void setStreet( int Street){
     this.Street=Street;
}
public void setAddress( String Town){
     this.Town=Town;
}
public String toString(){
		return String.format("House no:%d, Street no:%d, %s",House,Street,Town);
	}




}