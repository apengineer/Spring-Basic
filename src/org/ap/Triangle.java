package org.ap;

public class Triangle {
	private String type;
	private int height;
	
	
	// constructor injection
	public Triangle(String type){
		this.type = type;
	}
	public Triangle(String type, int height){
		this.height = height;
		this.type = type;
	}
	
	public Triangle(String type, String height){	
		this.type = type;
	}
	
	public String getType() {
		return type;
	}



	/*public void setType(String type) {
		this.type = type;
	}*/



	public int getHeight() {
		return height;
	}
	/*public void setHeight(int height) {
		this.height = height;
	}*/
	public void draw(){
		System.out.println(this.getType()+ " Triangle with height " + this.getHeight());
	}
}
