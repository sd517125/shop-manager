package dao;

import entity.Commodity;
import java.util.Scanner;

/**
 *存放商品信息
 */
 public class CommodityDB
 {
	static Scanner scan = new Scanner(System.in);	//用于接收输入数据

	private final int MAXSIZE = 10;					//货架最大存储量
	Commodity[] commodityDB = new Commodity[MAXSIZE];//创建货架

	/**
	 *添加商品
	 */
	int count = 0;									//货架索引
	public void add() {
		if(count < MAXSIZE-1) {
			Commodity commodity = new Commodity();
			System.out.println("请输入商品名称:");
			commodity.setName(scan.next());
			System.out.println("请输入商品价格:");
			commodity.setPrice(scan.nextDouble());
			System.out.println("请输入商品数量:");
			commodity.setNum(scan.nextInt());
			commodityDB[count++] = commodity;
		}else {
			System.out.println("货架已满");
		}
		
	}

	/**
	 *展示商品
	 */
	public void show() {
		System.out.println("商品\t单价\t存货");
		for(Commodity com : commodityDB) {
			if(com != null) {
				System.out.println(com.getName()+"\t"+com.getPrice()+"\t"+com.getNum());
			}else {
				break;
			}
			
		}
	}
	 /**
	  *购买商品
	  *转账系统尚未完成
	  */
	public void shop() {
		String shopName;
		int shopNum;
		int index = 0;
		
		System.out.println("请输入要购买的商品：");
		shopName = scan.next();
		for(index=0;index<commodityDB.length;index++) {
			if(shopName.equals(commodityDB[index].getName())) {
				break;
			}else {
				System.out.println("该货物尚未上架");
				return;
			}
		}
		System.out.println("请输入要买的数量：");
		shopNum = scan.nextInt();
		if(shopNum<=commodityDB[index].getNum()) {
			commodityDB[index].setNum(commodityDB[index].getNum()-shopNum);
		}else {
			System.out.println("抱歉,存货不够");
		}
	}


 }