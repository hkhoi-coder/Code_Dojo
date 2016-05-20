package ctci.chap11;



/**
 *
 * @author hkhoi
 */
public class Q11_1 {
    
    public void merge(int[] root, int[] branch) {
        int index = root.length - 1;
        
        int i = root.length - branch.length - 1;
        int j = branch.length - 1;
        
        while (j >= 0) {
            if (root[i] < branch[j]) {
                root[index] = branch[j];
                index -= 1;
                j -= 1;
            } else {
                root[index] = root[i];
                index -= 1;
                i -= 1;
            }
        }
    }
}
