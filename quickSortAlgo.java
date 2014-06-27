class quickSortAlgo{

	public static void main(String[]args){

		 System.out.println(" Quick Sort");

		  int [] f = new int[100];

  		  for (int j = 0; j < f.length; j++){
  			 f[j]=(int) (Math.random()*100);
  		  }

		  long start=System.nanoTime();

		  quickSort(f,0,f.length);
		  System.out.print("Values after the sort:\n");
for(int i = 0; i <f.length; i++)  System.out.print(f[i]+"  ");
		  	long end=System.nanoTime();




		  long time=end-start;
		  System.out.println("time taken "+time);

	}

	static void quickSort(int f[],int p, int q){
		if(q-p<=1);//skip

		else{
			int x;
			int i,j,k;//let x = middle element in f[p....q-1]
			x=f[(p+q)/2];
			i=p;j=p;k=q;

			while(j!=k){
				if(f[j]==x){
					j=j+1;
				}
				else if(f[j]<x){
					//swapf[j] with f[i]
					int temp =f[j];
					f[j]=f[i];f[i]=temp;
					j=j+1;
					i=i+1;
					}
				else{//f[j]>x
				//swap f[j] with f[k-1]
				int temp=f[j];
				f[j]=f[k-1];
				f[k-1]=temp;
				k=k-1;
				}
			}
			quickSort(f,p,i);
			quickSort(f,j,q);
		}
	}
}