/*
 * ѡ������
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={5,2,4,9,1};
		//����ѡ����
		selectSort(a);
	}
	public static void selectSort(int[] source){
		for(int i=0;i<source.length;i++)
			for(int j=i+1;j<source.length;j++){
				if(source[i]>source[j]){
					//����λ��
					int temp=source[i];
					source[i]=source[j];
					source[j]=temp;
				}
			}	
		
		//�������
		for( int i=0;i<source.length;i++)
			System.out.print(source[i]);	
	}

}
