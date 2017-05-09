package cn.pso.nspsofs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Test_NSPSOFS {
	public static void main(String[] args) throws IOException {
		Process_NSPSOFS pso = new Process_NSPSOFS();
		List<Particle_NSPSOFS> list = new ArrayList<Particle_NSPSOFS>();
		
		for(int i=0;i<30;i++){
			pso.init(30,"german");
			pso.run(500,i);
			pso.showresult(list);
			System.out.println("NSPSOFS:"+Process_NSPSOFS.name+"第"+(i+1)+"次测试完成");
		}
		SortBest_NSPSOFS sb = new SortBest_NSPSOFS();
		sb.getNSResult(Process_NSPSOFS.name,list,"All");
	}
}
