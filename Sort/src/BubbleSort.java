
public class BubbleSort {
	/*
	 * ð������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int []a={5,2,1};
		//����ð�ݺ���
		Bubble(a);
	}
	public  static void Bubble(int[] a) {
		//System.out.print("&&&&&&&");
		// TODO Auto-generated method stub
		for(int i=a.length-1;i>0;i--){
			//��Ȧ����ѭ������7788
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					//λ�ý�������������
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
			}				
		
		}
		
		
		//����������������
		
		for( int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}

}
