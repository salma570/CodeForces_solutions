import java.util.*;

public class sort{
	//SORINGS WORK IN ACENDING ORDER
	
	
//o(n log(n))         max n: n^5/n^6
//o(n)                max n: n^7/n^6
public static void main (String[] args){
		 int[] a = new int[] {38,27,43,3,9,82,10};
		 TreeSet<Integer> set = new TreeSet<>();
		 
		 for (int i = 0; i < a.length; i++) {
			set.add(a[i]); // sort array in n log(n)
		}
		 for (int i = 0; i < a.length; i++) {
			a[i] = set.pollFirst(); //O(q)
		}
		 //total complexity: O(n logn)
		 
		 Arrays.sort(a); //quicck sort>> WORST CASE N^2
		 
		 //sorting techniques
		 
		 // arraylist and sort 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 Collections.sort(list); // tim sort > mergesort like algorithm
		 
		 // shuffle and sort 
		 
		 // sort obects objects
		 Monster [] arr = new Monster[3]; // use tim sort or merge sort
		 arr[0] = new Monster(5, 0);
		 arr[1] = new Monster(4, 0);
		 arr[2] = new Monster(3, 0);
		 
		 Arrays.sort(arr); // tim sort
		 System.out.println(Arrays.toString(arr)); // will give indexes 
		 System.out.println(arr[0].height +" " +arr[1].height +" "+ arr[2].height);
		 
		 
		 
		 // Integer is an int bs mi4 primitiive datat type
		//Integer aa= new Integer(1);
		
		 int [] arr2 = new int [5];
		Integer [] arr3 = new Integer [3];
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr2[i];
			// gets sorted with merge sort 
		}
		
}

public static class Monster implements Comparable<Monster>{
	int height, width;
	Monster(int h, int w){
		height=h;
		width = w;
	}
	public int compareTo(Monster m) {
		
		/* option 1
		// < 0, this, <m
		// 0, this = m
		// >0, this >m
		  
		  
		// >> insatnce methiodn.compareTo(m)
		
		
		
		if(this.height< m.height) {
			return -1;
		}else if (this.height< m.height) {
			return 0;
		}else {
			return 1;
		}
		*/
		
		//option 2
		/*
		return this.height-m.height;
		*/
		
		// MODEFICATION 
		
		if (this.height==  m.height)
			return this.width-m.width;
		return this.height-m.height;
		
		// fix double return 
		//Double.compare(a, b);
		//will return a negative number if a>b etc 
		
	}
}
public static void shuffle(int [] a) {
	int n = a.length;
	Random rand = new Random();
	
	for (int i = 0; i < n; i++) {
		int tempIndex = rand.nextInt();
		int temp = a[i];
		a[tempIndex] = temp;
	}
}
//merge sort O(n+m) >> O(nlog(n))
public static void mergeSort1 (int [] a, int [] b){
		int n = a.length, m = b.length;
	int[] res = new int[n+m];
	int i=0, j=0;
								for(int k=0; k<res.length;k++){
									if(i==n){ //a done
										res[k] = b[j];
										j++;
									}else if(j==m){ // b done
										res[k] = a[i];
										i++;
									}else {if(a[i]<=b[j]){ // a smaller
										res[k] = a[i];
										i++;
									}else{if(a[i]>b[j]){ // b smaller
										res[k] = b[j];
										j++;
									}
									}
								}
							} //for

}
public static void mergeSort2 (int [] a, int start, int end){
	if(start == end) return;
	int mid = (start +end )/2;
	mergeSort2(a, start , mid);
	mergeSort2(a, mid+1,end);
	merge(a, start, mid, end)	;
}
static int steps;
public static void merge(int [] array, int start, int mid, int end){
	int u = start, ue = mid+1, v = mid+1, ve= end+1;
	int n = end-start +1;
	
	int [] sort = new int[n];
	for(int i=0;i<n;i++){
		if(u == ue)
			sort[i] = array[v++];
		else if (v == ve)
			sort[i] = array[u++];
		else if (array[u]<= array[v])
			sort[i] = array[u++];
		else {
			sort[i] = array[v++];
			steps+= ue=u;
		}
	}
	for (int i = 0; i < n; i++) {
		array[start +i] = sort[i];
		
	}
	
}
 //O(n^2)
public static void bubbleSort (int [] array){
/* type 1 bubble sort algorithm > swap each 2 adjacent cells 

o(n^2)             max n: n^3
traverse once (n operations) : 5 4 3 2 1 6
traverse 2nd time (n operations) : 4 3 2 1 5 6
*/   
    int n = array.length;
    boolean flag = false;  
    for(int i =0; i<n ; i++){
      flag = true;
      
      for(int j =0; j<n-1;j++){
        if(array[j+1]<array[j]){
          int temp = array[j+1];
          array[j+1] = array[j];
          array[j] = temp;
          flag = false;
        }
      }
      if(flag) break;
    }
  }
public static void selectionSort (int [] array){
   /*  2 selection sort algorithm > gets the smallest and sorts accordingly 
n + (n-1)+ (n-2)+..
o(n^2/2) = o(n^2)             max n: n^3
traverse once (n operations) : 1 5 4 3 2 6
traverse 2nd time (n operations) : 1 2 4 3 5 6
*/ 
   int n = array.length;
   for(int i =0; i<n;i++){
     int minval = array[i], minindex=i;
     for(int j=0; j<n;j++){
       if(array[j]<minval){
         minval = array[j];
         minindex = j;
       }
     }
     int temp = array[i];
     array[i] = minval;
     array[minindex] = temp;
   }
   
 }
public static void InsertionSort (int [] array){
/*  2 selection sort algorithm > sorts tracversed array : select  
the current elememnnt an dswitches it to the suitablel place  
1 + 2+4+ ... +(n-1)
o(n^2/2) = o(n^2)             max n: n^3
traverse once (n operations) : 5 6 4 3 2 1
traverse 2nd time (n operations) : 4 5 6 3 2 1
*/ 
 int n = array.length ;
 
 for(int i=0; i<n;i++){
  int temp = array[i], j=i;
  while(j>0&& array[j-1]>array[j]){
      array[j] = array[j-1];
      array[j-1] = temp;
      j--; 
  }
 }
}
}
