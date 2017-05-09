package cn.pso.nspsofs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import cn.knn.TestKNN;

public class AllDataSet {
	
	public void getResult(String name) throws IOException{
//		List<String> choose = new ArrayList<String>();
//		for(int i=1;i<=ReadFile.getFeatureNum();i++){
//			choose.add(String.valueOf(i));
//		}
//		ReadFile rf = new ReadFile();
//		rf.getFile(choose, "TESTED\\Alltra--"+name, "Alltra--"+name);
//		rf.getFile(choose, "TESTED\\Alltest--"+name, "Alltest--"+name);
		
		
		
		PrintWriter pw = new PrintWriter(new FileOutputStream("testfile\\all.dat",true));
		Double accuracy = new TestKNN().runKnn("TESTED\\Alltra--"+name, "TESTED\\Alltest--"+name);
		Double errorRate = 1-accuracy;
		pw.write(name+":"+errorRate);
		pw.write("\n");
		pw.flush();
		pw.close();
	}

	public static void main(String[] args) throws IOException {
//		new AllDataSet().getResult("BC");
//		new AllDataSet().getResult("german");
//		new AllDataSet().getResult("Hill_Valley");
//		new AllDataSet().getResult("ionosphere");
//		new AllDataSet().getResult("vehicle");
		new AllDataSet().getResult("wine");
//		new AllDataSet().getResult("zoo");
//		new AllDataSet().getResult("australian");
	}

}
