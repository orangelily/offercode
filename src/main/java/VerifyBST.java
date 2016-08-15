/**
 * Created by orange on 16/8/15.
 */
public class VerifyBST {
        public boolean VerifySquenceOfBST(int [] sequence) {
            int length = sequence.length;
            if(sequence==null||sequence.length<=0)
                return false;
            return isSquenceOfBST(sequence,0,length-1);
        }
        public boolean isSquenceOfBST(int [] sequence,int start,int end) {
            if(end<=start) return true;
            int root = sequence[end];
            int i=start;
            for(;i<end-1;i++){
                if(sequence[i]>root)
                    break;
            }
            int j=i;
            for(;j<end-1;j++){
                if(sequence[j]<root)
                    return false;
            }
            boolean left = true;
            if(i>start){
                left = isSquenceOfBST(sequence,start,i-1);
            }
            boolean right = true;
            if(i<end-1){
                right = isSquenceOfBST(sequence,i+1,end-1);
            }
            return (left&&right);

        }
    }