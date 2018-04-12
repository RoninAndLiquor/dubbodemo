
public class MyTest {

	public static void main(String[] args) {
		int flag = 0;
		int[] arr = {1,5,6,8,2,5,4,3,7};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					for(int k=j;k<arr.length-1;k++){
						arr[k] = arr[k+1];
					}
					flag++;
				}
			}
		}
		int[] test =new int[arr.length-flag+1];
		for(int i=0;i<test.length;i++){
			test[i] = arr[i];
		}
		for(int i=0;i<test.length;i++){
			System.out.println(test[i]);
		}
	}
	
}
