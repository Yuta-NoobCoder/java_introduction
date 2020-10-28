public class MySort {
  public static void main(String[] args) {
    String[] countries = {
        "JAPAN", "USA",    "UK",    "FRANCE", "GERMANY",
        "ITALY", "BRASIL", "CHINA", "KOREA",  "THAILAND",
    };

    System.out.print("配列 : [ ");
    for (String country : countries) {
      System.out.print(country + " ");
    }
    System.out.println("]\n"); //改行

    //ソート
    for (int i = 0; i < countries.length - 1; i++) {
      for (int j = countries.length - 1; j > i; j--) {
        if (countries[j].compareTo(countries[j - 1]) < 0) {
          String temp = countries[j];
          countries[j] = countries[j - 1];
          countries[j - 1] = temp;
        }
        //途中経過を表示
        System.out.print("[ ");
        for (String country : countries) {
          System.out.print(country + " ");
        }
        System.out.println("]"); //改行
      }
    }
    //結果を表示
    System.out.print("\nソート結果 : [ ");
    for (String country : countries) {
      System.out.print(country + " ");
    }
    System.out.println("]"); //改行
  }
}