class Paper
{
     String thickness="medium";
	 int size;
     int quality;
	 String color;
	 public Paper(int size)
	 {
		 this.size=size;
	 }
	 public void setColor(String color)
	 {
		 this.color=color;
	 }
	 public void display()
	 {
		 System.out.println("thickness:"+this.thickness);
		 System.out.println("size:"+this.size);
		 System.out.println("quality:"+this.quality);
		 System.out.println("color:"+this.color);
	}
}