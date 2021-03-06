import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercises {

  public int findMe(int[] list, int target) {
    if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
      return -1;
    }
    int i = 0;
    for(int number : list){
      if(number == target){
        return i;
      } else {
        i++;
      }
    }

    return -1;
  }

  public int findMe(ArrayList<String> list, String target) {
    if (list == null ||  list.size() == 0 || target == null) {
      return -1;
    }
    for(int i = 0; i < list.size(); i++){
      if(list.get(i).equals(target)){
        return i;
      }
    }
    return -1;
  }

  public int findMeFaster(ArrayList<Integer> list, int target) {
    if (list == null ||  list.size() == 0) {
      return -1;
    }
    int binary = Collections.binarySearch(list, target);
    if(binary < 0){
      return -1;
    } else {
      return binary;
    }
  }

  public int findMeFaster(String[] list, String target) {
    if (Arrays.asList(list).contains(null) || Arrays.asList(list) == null) {
      return -1;
    }
    int binary = Arrays.binarySearch(list, target);
    if(binary < 0){
      return -1;
    } else {
      return binary;
    }
  }

  public int[] bubble(int[] list, boolean ascending) {
    int n = list.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        if(ascending == false){
          Collections.reverse(Arrays.asList(list));
          return list;
        } else {
          return list;
        }
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    int n = list.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    if(ascending == false){
      Collections.reverse(list);
      return list;
    } else {
      return list;
    }
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    for(int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            for(int j = i - 1; j >= 0; j--){
                if(key < list.get(j)) {
                    list.set(j+1, list.get(j));
                    if(j==0) {
                        list.set(0, key);
                    }
                } else {
                    list.set(j+1,key);
                    break;
                }
            }
        }
        if(ascending == false){
          Collections.reverse(list);
          return list;
        } else {
          return list;
        }
  }

  public String[] insertion(String[] list, boolean ascending) {
    String temp = "";
    for(int i =  0; i < list.length; i++) {
      for(int j = i + 1; j < list.length; j++) {
        if(list[i].compareToIgnoreCase(list[j])>0) {
          temp = list[i];
          list[i] = list[j];
          list[j] = temp;
        }
      }
    }
    if(ascending == false){
      Collections.reverse(Arrays.asList(list));
      return list;
    } else {
      return list;
    }
  }

  public int[] selection(int[] list, boolean ascending) {
    int n = list.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            if(ascending){
              for (int j = i + 1; j < n; j++) {
                  if (list[j] < list[min]){
                      min = j;
                  }
              }
              int temp = list[min];
              list[min] = list[i];
              list[i] = temp;
            } else {
              for (int j = i + 1; j < n; j++) {
                if (list[j] > list[min]) {
                  min = j;
                }
              }
              int temp = list[i];
              list[i] = list[min];
              list[min] = temp;
            }
        }
      return list;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    int n = list.size();
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if(ascending){
          if (list.get(i).compareTo(list.get(j)) > 0) {
            String temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
          }
        }else{
          if (list.get(i).compareTo(list.get(j)) < 0) {
            String temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
          }
        }
      }
    }
    return list;
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return list;
  }

  public String[] merge(String[] list, boolean ascending) {
    return list;
  }
}
