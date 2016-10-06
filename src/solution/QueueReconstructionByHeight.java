public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
           @Override
           public int compare(int[] o1, int[] o2){
               return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
               //return o1[0]>o2[0]?-1:o1[0]==o2[0]?0:1;
           }
        });
        
        for(int[] person : people){
            System.out.println("["+person[0]+","+person[1]+"]");
        }
        
        List<int[]> res = new LinkedList();
        for(int[] curr : people){
            if(curr[1]>res.size()){
                res.add(curr);
            }else{
                res.add(curr[1],curr);
            }
        }
        return res.toArray(new int[people.length][]);
    }
}