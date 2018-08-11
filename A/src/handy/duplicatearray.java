package handy;

public class duplicatearray {
public static void main(String[] args) {
	

	int i, j;
	int[] nums = new int[6];
	nums[0]=50;
			nums[1]=100;
			nums[2]=100;
			nums[3]=6;
			nums[4]=7;
					nums[5]=7;

	for(i=0;i<nums.length;i++) {
		for(j=i+1;j<nums.length;j++)
			if(nums[i]==nums[j])
System.out.println(nums[i]);
	}
}}
