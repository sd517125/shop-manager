package entity;

/**
 *��дʵ���ࣨ��Ʒ��
 *����
 *�۸�
 *���
 */
 public class Commodity
 {
	 private String name;	//����
	 private double price;	//�۸�
	 private int num;		//���

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