package dao;

import entity.Commodity;
import java.util.Scanner;

/**
 *�����Ʒ��Ϣ
 */
 public class CommodityDB
 {
	static Scanner scan = new Scanner(System.in);	//���ڽ�����������

	private final int MAXSIZE = 10;					//�������洢��
	Commodity[] commodityDB = new Commodity[MAXSIZE];//��������

	/**
	 *�����Ʒ
	 */
	int count = 0;									//��������
	public void add() {
		if(count < MAXSIZE-1) {
			Commodity commodity = new Commodity();
			System.out.println("��������Ʒ����:");
			commodity.setName(scan.next());
			System.out.println("��������Ʒ�۸�:");
			commodity.setPrice(scan.nextDouble());
			System.out.println("��������Ʒ����:");
			commodity.setNum(scan.nextInt());
			commodityDB[count++] = commodity;
		}else {
			System.out.println("��������");
		}
		
	}

	/**
	 *չʾ��Ʒ
	 */
	public void show() {
		System.out.println("��Ʒ\t����\t���");
		for(Commodity com : commodityDB) {
			if(com != null) {
				System.out.println(com.getName()+"\t"+com.getPrice()+"\t"+com.getNum());
			}else {
				break;
			}
			
		}
	}
	 /**
	  *������Ʒ
	  *ת��ϵͳ��δ���
	  */
	public void shop() {
		String shopName;
		int shopNum;
		int index = 0;
		
		System.out.println("������Ҫ�������Ʒ��");
		shopName = scan.next();
		for(index=0;index<commodityDB.length;index++) {
			if(shopName.equals(commodityDB[index].getName())) {
				break;
			}else {
				System.out.println("�û�����δ�ϼ�");
				return;
			}
		}
		System.out.println("������Ҫ���������");
		shopNum = scan.nextInt();
		if(shopNum<=commodityDB[index].getNum()) {
			commodityDB[index].setNum(commodityDB[index].getNum()-shopNum);
		}else {
			System.out.println("��Ǹ,�������");
		}
	}


 }