package VectotrAndStacksAndQueue;

public class ActivitySelection {
	public static void selection(int[] s, int[] f, int n) {
		int i,j;
		System.out.println("Followin activity are selected");
		i=0;
		System.out.println(i+"");
		for(j=1;j<n;j++) {
			if(s[j]>=f[i]) {
				System.out.println(j+"");
				i=j;
			}
		}
		
	}
	public static void main(String[] argu) {
		 int s[] =  {1, 9, 0, 5, 8, 5}; 
		    int f[] =  {2, 4, 6, 7, 9, 9}; 
		    int n = s.length; 
		         
		    selection(s, f, n); 
	}

}
