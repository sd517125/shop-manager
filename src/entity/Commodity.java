package entity;

/**
 *编写实体类（商品）
 *名称
 *价格
 *存货
 */
 public class Commodity
 {
	 private String name;	//名称
	 private double price;	//价格
	 private int num;		//存货

	 public String getName() {
		return name;
	 }
	 public void setName(String name) {
		this.name = name;
	 }
	 public double getPrice() {
		return price;
	 }
	 public void setPrice(double price) {
		this.price = price;
	 }
	 public int getNum() {
		return num;
	 }
	 public void setNum(int num) {
		this.num = num;
	 }
 }