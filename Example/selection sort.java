printlist
for (int i=0;)


int size =10;
int[] Array= new int [size];
int k=0;
for(int n=0;n<10;n++){
    Array[n]=k;
    k++;}
    
    // selec sort
    int min=-99999999;
    int index=0;
    for (int i=0;i<array.length;i++){
        min=array[i];
        index=i;
        // find the smallest
        for (int j=i; j<array.length;j++){
            if (array[j]<=min){
                min=array[j];
                index=j;
            }
        }
        // swap
        int temp=array[i];
        array[i]=array[index];
        array[index]=temp;
    }