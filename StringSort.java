public class StringSort {
    static String states[] = {"Jharkhand","West Bengal", "Utter Pradesh", "New Delhi", "Bihar"};
    public static void main(String args[]){
        int i,j;
        int n = states.length;
        String t = null;
        for(i =0; i<n; i++){
            for(j = 0; j<n;j++){
                if (states[i].compareTo(states[j])<0){
                    t = states[i];
                    states[i] = states[j];
                    states[j] = t;
                }
            }
        }
        for(i=0; i<n; i++){
            System.out.println(states[i]);
        }
    }
}
