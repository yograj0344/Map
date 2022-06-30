import java.util.*;
class map1  // map is an interface 
            // map is contain element  key and valuse
            // map is con not contain  duplicate key but valuse is duplicate
            //  one key contain only one valuse not multiple valuse
            // map is three type 1:-HashMap 2:-LinkedHashMap 3:-TreeMap 
            //  map use in methode 
            // put ( put methode use in add element)
            //
{
   public static void main(String[] args)
   {
       Map<Integer,String>list=new HashMap<Integer,String>();
       list.put(99,"yograj");
       list.put(90,"dak");
       list.put(18,"amar");
       list.put(40," maske");
       System.out.println(list);

       Map<Integer,String> list1=new LinkedHashMap<Integer,String>();
       list1.put(10,"yograj");
       list1.put(26,"dak");
       list1.put(3,"amar");
       list1.put(14," maske");
       System.out.println(list1);

       Map<Integer,String> list2=new TreeMap<Integer,String>();
       list2.put(9,"yograj");   //  treemap is follow bt sorting in key valuse
       list2.put(6,"dak");
       list2.put(4,"amar");
       list2.put(2," maske");
       System.out.println(list2);




   }
}