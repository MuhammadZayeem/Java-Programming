package sp25_bcs_112;
public class Seat{

	 private String seatID;
	 private SeatType type;
         private double price;
         private boolean isAvailable;
//--------------------------------------------------------------------------Constructor
	Seat(String seatID,SeatType type,double price,boolean isAvailable){
		this.seatID=seatID;
		this.type=type;
                this.price=price;
                this.isAvailable=isAvailable;
	}
             Seat(){}

//--------------------------------------------------------------------------To String

@Override
public String toString(){
		return String.format("\t%-15s  %-15s  %7.2f \t %-20s",getseatID(),gettype(),getprice(),display_availability(getisAvailable()));
}

//--------------------------------------------------------------------------Display Headings

public String display(){

         {
               return"\n\tSEAT ID \t SEAT TYPE \t TICKET PRICE \t AVAILABILITY";
}
}
//--------------------------------------------------------------------------Getters & Setters

    public String getseatID(){
          return this.seatID;
}

public SeatType gettype(){
          return this.type;
}

public double getprice(){
          return this.price;
}

public boolean getisAvailable(){
          return this.isAvailable;
}

public void setSeatType(SeatType type){
           this.type=type;
}
public void setprice(double price){
           this.price=price;
}

public double setprice(SeatType t){
      if(t==SeatType.REGULAR)
            return 500;
      else if(t==SeatType.PREMIUM)
            return 750;
      else if(t==SeatType.VIP)
            return 1000;
      else if(t==SeatType.RECLINER)
            return 1200;
      else 
            return 0;
}

//--------------------------------------------------------------------------Book & Cancel Method


public boolean bookSeat(){
      return isAvailable=false;
}

public boolean cancelBooking(){
      return isAvailable=true;
}

//--------------------------------------------------------------------------Display availability Method

   public String display_availability(boolean isAvailable){
               if(isAvailable==true){
                  return "Available";}
               else
                  return "Booked";
}

   public String display_availabilitysymbol(){
               if(getisAvailable()==true){
                  return "A";}
               else
                  return "B";
}
}