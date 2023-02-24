package corsiPak;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class BlockPos {
	ArrayList<int[]>posDistrib;
	ArrayList<ArrayList<Integer>>relation;
	ArrayList<Double[]>posBr;
	final  static int[] BLOCK = new int [] {1,2,3,4,5,6,7,8,9,10};
	final static double[][]DISTANCE=new double[][] {
		{0.5,2,1.5,3.5,4,3,5,1.5,4,3},
		{2,0.5,2,3.5,5.5,2.5,6,1.5,5.5,4.5},
		{1.5,2,0.5,2,3.5,1.5,4,1.5,3,3},
		{3.5,3.5,2,0.5,2.5,1.75,1.75,2.5,2,3},
		{4,5.5,3.5,2.5,0.5,3,2.5,4,0.75,1.5},
		{3,2.5,1.5,1.75,3,0.5,3,2,3.5,3.5},
		{5,6,4,1.75,2.5,3,0.5,4,1.5,3},
		{1.5,1.5,1.5,2.5,4,2,4,0.5,4,3.5},
		{4,5.5,3,2,0.75,3.5,1.5,4,0.5,1.5},
		{3,4.5,3,3,1.5,3.5,3,3.5,1.5,0.5}
	};

	public BlockPos() {
		posDistrib=new ArrayList<int[]>();
		relation=new ArrayList<ArrayList<Integer>>(10);
		int i=0;
		while(i<10) {
			relation.add(new ArrayList<Integer>());
			i++;
		}
		posBr=new ArrayList<Double[]>();
	}
	public void addSelect(int val) {
		int i1=0,i2=0,i3=0;
		do {

			while(i1==i2||i1==i3||i2==i3){
				i1=(int)(Math.random()*30);
				i2=(int)(Math.random()*30);
				i3=(int)(Math.random()*30);
			}



		}while(posDistrib.contains(new int[] {i1,i2,i3}));
		posDistrib.add(new int[] {i1,i2,i3});
		int j=0;
		while(j<10) {
			if(BLOCK[j]==val) {
				relation.get(j).add(i1);
				relation.get(j).add(i2);
				relation.get(j).add(i3);
			}
			j++;
		}
		Random r=new Random();
		Double[]res=new Double[10];
		double[] dist=DISTANCE[val-1];
		int[]tour =posDistrib.get(posDistrib.size()-1);
		int i=0;
		while(i<10) {
			res[i]=0.0;
			for(int t=0;t<3;t++) {
				if(relation.get(i).contains(tour[t])) {
				res[i]+=1.9;
				}
				t++;
			}
			res[i]+=r.nextGaussian()+(0.5/dist[i]);
			i++;

		}
		posBr.add(res);





	}
	public void reset() {
		posDistrib=new ArrayList<int[]>();
		relation=new ArrayList<ArrayList<Integer>>(10);
		int i=0;
		while(i<10) {
			relation.add(new ArrayList<Integer>());
			i++;
		}
		posBr=new ArrayList<Double[]>();
	}

	public String reponse() {
		String res="";
		int i=0;
		while(i<posBr.size()) {
			double max=Double.MIN_VALUE;
			int imax=0;
			int j=0;
			while(j<posBr.get(i).length) {
				if(posBr.get(i)[j]>max) {
					max=posBr.get(i)[j];
					imax=j;

				}
				j++;
			}
			res+=(imax+1)+" ";
			i++;
		}
		reset();
		return res;
	}
	public static void main (String[]args) {
		Random r=new Random();
		for(int i=0;i<10;i++) {
			System.out.println(r.nextGaussian());
		}
		Scanner s=new Scanner (System.in);
		int compt=0;
		BlockPos b=new BlockPos();
		while( compt<2) {
		int i= s.nextInt();
		b.addSelect(i);
		compt++;
	}
		System.out.println(b.reponse());
		 compt=0;
		while( compt<2) {
		int i= s.nextInt();
		b.addSelect(i);
		compt++;
	}
		System.out.println(b.reponse());
		s.close();
		
	}

}
