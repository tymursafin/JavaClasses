package repls;

public class Repl221FindMaxLenEven {

//    input ["find MaxLen Even"]
//
//    output ["MaxLen"]
//
//    input["I am very Good at Java"]
//
//    output ["very"]
//
//    input["I was"]
//
//    output ["-1"]

    public static void main(String[] args) {

        String sentence = "find MaxLen Even";
        System.out.println(findMaxLenEven(sentence));

    }

    public static String findMaxLenEven(String str){

        String[] strArr = str.split(" ");
        String MaxLenEven = "-1";
        for(String word:strArr){
            if((word.length() % 2 == 0) && (word.length() > MaxLenEven.length())){
                MaxLenEven = word;
            }
        }
        return MaxLenEven;
    }
}
