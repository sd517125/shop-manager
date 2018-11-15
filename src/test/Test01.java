package test;

import dao.CommodityDB;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommodityDB cdb = new CommodityDB();
		
		
		cdb.add();
		cdb.add();
		cdb.show();
		cdb.shop();
		cdb.show();
		
	}

}
