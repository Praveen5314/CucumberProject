package TestProject.Sample;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
public static void main(String[] args) {
	List<Integer> lst=new ArrayList<Integer>();
	lst.add(10);
	lst.add(10);
	lst.add(90);
	lst.add(30);
	lst.add(40);
	lst.add(100);
	lst.add(10);
	
	for(int i=0;i<lst.size();i++)
	{
		if(lst.get(i)==10)
		{
			lst.set(i, 200);
		}
	}
	System.out.println(lst);
	if(lst.get(2)==90)
	{
		System.out.println("90");
	}
	
}

}
