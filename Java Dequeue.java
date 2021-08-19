    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            Deque<Integer> dq = new ArrayDeque<Integer>();
            HashSet<Integer> set = new HashSet<Integer>();
            int max =  Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                dq.add(num);
                set.add(num);
                if(dq.size()==m){
                    int current_answer=Math.min(dq.size(),set.size());
                    max=Math.max(current_answer, max);
                    dq.removeFirst();
                }
            }
            System.out.println(max);
        }
    }


//https://www.hackerrank.com/challenges/java-dequeue/problem
