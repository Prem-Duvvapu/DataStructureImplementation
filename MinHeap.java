
public class MinHeap {
    int[] arr;
    int size;
    int maxSize;
    int front;

    public MinHeap(int maxSize) {
        size=0;
        this.maxSize=maxSize;
        arr=new int[maxSize+1];
        front=1;
    }

    public int getLeftChildPos(int pos) {
        return 2*pos;
    }

    public int getRightChild(int pos) {
        return 2*pos+1;
    }

    public int getParent(int pos) {
        return pos/2;
    }

    public void swap(int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public void insert(int value) {
        if (size>=maxSize)
            return;

        arr[++size]=value;

        int currPos=size;
        while (arr[currPos] < arr[getParent(currPos)]) {
            swap(currPos,getParent(currPos));
            currPos=getParent(currPos);
        }
    }
}