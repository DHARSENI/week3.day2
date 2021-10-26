package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Missing {

	public static void main(String[] args) {
       int[] n= {1,2,3,4,7,6,8};
		
		List<Integer> dup=new ArrayList<Integer>();
		for(int i=0;i<n.length;i++)
		{
			dup.add(n[i]);	
			
		}
		 Collections.sort(dup);//sorting
		 for(int i=0;i<n.length;i++)
			{
				if((i+1)!=dup.get(i))
				{
					System.out.println(i+1);
					break;
				}
				}

	}

}
