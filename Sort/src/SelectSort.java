/*
 * 选择排序
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={5,2,4,9,1};
		//调用选择函数
		selectSort(a);
	}
	public static void selectSort(int[] source){
		for(int i=0;i<source.length;i++)
			for(int j=i+1;j<source.length;j++){
				if(source[i]>source[j]){
					//交换位置
					int temp=source[i];
					source[i]=source[j];
					source[j]=temp;
				}
			}	
		
		//输出数组
		for( int i=0;i<source.length;i++)
			System.out.print(source[i]);	
	}

}
