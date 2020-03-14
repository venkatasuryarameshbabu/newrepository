package Assessment;

import java.util.*;
import java.util.ArrayList;

public class Usercode 
{
	public static ArrayList<Integer> performSetOperations(ArrayList<Integer> a1,ArrayList<Integer> a2, char c)
	{
	ArrayList<Integer> op1 = new ArrayList<Integer>();
    int k = 0;
    switch (c) 
    {
    	case '+':
    		a1.removeAll(a2);
    		a1.addAll(a2);
    		op1 = a1;
    		break;
    	case '*':
    		a1.retainAll(a2);
    		op1 = a1;
    		break;
    	case '-':
      for (int i = 0; i < a1.size(); i++) 
      {
        k = 0;
        for (int j = 0; j < a2.size(); j++) 
        {
          if (a1.get(i) == a2.get(j))
            k = 1;
        }
        if (k == 0)
          op1.add(a1.get(i));
      }
      break;
    }
    return op1;
	}
}
