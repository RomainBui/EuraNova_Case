package euranova;

import org.apache.flink.api.common.functions.FlatMapFunction;

public class euranova {
	
	// Note that L = 1/lambda
	public double poissonRandomInterarrivalDelay(double L) {
	    return (Math.log(1.0-Math.random())/-L);
	}	

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("EuraNova Project");
		
		euranova romain = new euranova();
		double a = romain.poissonRandomInterarrivalDelay(0.5);
		System.out.print(a);
	}
	
	
}


