package Service;

public class Test31 {
    public static void main(String[] args) {
        int[] ia = {1, 2, 3, 4};
        int n = 3;
        System.out.println("���н�� : ");
        permutation(ia, n);
        System.out.println("��Ͻ�� : ");
        combination(ia, n);
    }
    public static void permutation(int[] ia, int n) {
        permutation("", ia, n);
    }
    public static void permutation(String s, int[] ia, int n) {
        if(n == 1) {
            for(int i = 0; i < ia.length; i++) {
                System.out.println(s+ia[i]);
            }
        } else {
            for(int i = 0; i < ia.length; i++) {
                String ss = "";
                ss = s+ia[i]+", ";
                System.out.println(" "+ss);
                //����û�е�i��Ԫ�ص�������
                int[] ii = new int[ia.length-1];
                int index = 0;
                for(int j = 0; j < ia.length; j++) {
                    if(j != i) {
                        ii[index++] = ia[j];
                        System.out.println(ii[index-1]);
                    }
                }
                 
                permutation(ss, ii, n-1);
            }
        }
    }
    public static void combination(int[] ia, int n) {
        combination("", ia, n);
    }
    public static void combination(String s, int[] ia, int n) {
        if(n == 1) {
            for(int i = 0; i < ia.length; i++) {
                System.out.println(s+ia[i]);
            }
        } else {
            for(int i = 0; i < ia.length-(n-1); i++) {
                String ss = "";
                ss = s+ia[i]+", ";
                System.out.println(" "+ss);
                //������i��ʼ��������
                int[] ii = new int[ia.length-i-1];
                for(int j = 0; j < ia.length-i-1; j++) {
                    ii[j] = ia[i+j+1];
                    System.out.println(ii[j]);
                }
                 
                combination(ss, ii, n-1);
            }
        }
    }
}
