
class ForEachDemo {
  public static void main(String[] args) {
      
    // create an array
    int[] numbers = {10 , 20 ,30 ,40 ,50};
    
 // for each loop 
    for (int i : numbers) {
      System.out.println(i);
    }
    
 // create an array to store vowels
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
      
      // print using  for-each loop
      for (char item: vowels) {
        System.out.println(item);
      }
      
      
    
  }
}