# HomeWork
  public static void revertArray() {
    int[] arr1 = {5,4,3,2,1};
    int i = arr1.length;
    int[] arr2 = new int[i];

    for (int a : arr1) {
      arr2[i -1] = a;
      i--;
    }
    for (int a : arr2) {
      System.out.println(a);
    }
  }
