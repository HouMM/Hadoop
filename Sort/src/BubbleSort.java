
public class BubbleSort {
	/*
	 * 冒泡排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int []a={5,2,1};
		//调用冒泡函数
		Bubble(a);
	}
	public  static void Bubble(int[] a) {
		//System.out.print("&&&&&&&");
		// TODO Auto-generated method stub
		for(int i=a.length-1;i>0;i--){
			//外圈控制循环次数7788
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					//位置交换，逆序排序
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
			}				
		
		}
		
		
		//输出最终排序的数组
		
		for( int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}

}
