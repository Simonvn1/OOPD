void setup() {
  int array1[] = {1,2,3,4,5,6,7,8};
  int array2[] = {2,2,2,2,2,2,2,2};
  println(telElementenOp(array1,array2));
}

int[] telElementenOp(int[] array1,int[] array2){
  int[] array = new int[array1.length];
  for(int i = 0;i<array1.length;i++){
    array[i] = array1[i]+array2[i];
  }
  return array;
}