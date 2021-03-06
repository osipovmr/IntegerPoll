/*
       ????? Integer ? ??? ?????-??????? ???????????? ???? int. ?????? ??????? ?????? ?????????? ???????????? ???? ???? int.
       Integer ? ??? ????????? ??? ??????, ? ??? ?????????? ?????? ?????? ?? ????????, ? ?? ???? ???????? (???????).

       ????  ?????????? ?????????, ?? ????????? ?? ??? ?????????? ?? ???? ? ??? ?? ??????, ???? ???????? ?? ????????? ??? ?????????,
       ?? ???????????? ???????? "==".
       ???????? == ?? ?????????? ?? ????????? ?????????? ?????????? ????????, ? ?????? ????????? ????????? ?? ?????? ?? ???? ? ??? ?? ??????.
       ???????? == ?????????? ?????????? ????????? boolean ????? ?????????: ?????? ???? ???? (true / false)
       ????? ???????, ??? ????????? ???????? ? Java ???????? "==" ?????? true ???? ? ??? ??????, ????? ?????? ????????? ?? ???? ? ??? ?? ??????.

       ??? ????? ???????????? ????????????? ?????? ? ??? ????????? ?????????????????? ??? ????????? ????? ?????? ?
       Java ???????????? ??? ?????????? ????: Integer pool, String pool ? ????????? ??????.

       ????? ?? ??????? ??????, ?? ????????? ???????? new, ?????? ?????????? ? ???, ? ? ???????????, ???? ?? ??????? ??????? ????? ?? ??????
       (????? ?? ????????? new), ?? ????? ?????? ?????? ?? ?????, ? ?? ?????? ??????? ?????? ?? ??? ?????? ?? ????.
       ??????????? Integer pool'? ? ???, ??? ?? ?????? ?????? ?????, ??????? ?????????? ? ??? ?????? byte: ?? -128 ?? 127.
       ??? ????????? ????? ?? Integer'? ??? ?? ????????.

       ???? ?????????? ???????? ?????? ?????????? ?????????? ????????,
       ?? ??????? ????????? ?????? ??????????, ?? ????? ??????????????? ??????? ???????????????? ?????? equals() ??? hashCode()).
       ????? ??????????? ????????? ?? ????????? ??? Integer ??????????, ?????????? ???????????? ????? equals.
       https://javarush.ru/groups/posts/2743-rukovodstvo-po-klassu-java-integer
       */


public class IntegerPool {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 5;
        Integer c = 127;
        Integer d = 127;
        Integer e = 128;
        Integer f = 128;
        Integer g = -128;
        Integer h = -128;
        Integer i = -129;
        Integer j = -129;
        Integer k = new Integer(5);


        System.out.println("??????????? Integer pool'? ? ???, ??? ?? ?????? ?????, ??????? ?????????? ? ??? ?????? byte: ?? -128 ?? 127." +
               "\n"+
                "????? ?? ??????? ????? ?????????? ? ??????????? ?? ????????????? ????????, ??????? ? ?????????? ?? -128 ?? 127," +
                " ?? ?? ??????? ????? ??????, ? ??????????? ?????????? ?????? ?? ??? ????????? ?????? ? ????.");
        System.out.print("C????????? ??? ??????????, ??????? ?????? ? ???? ?????? ?? ???? ? ??? ?? ?????? " + a + " ? "+ b + ": ");
        System.out.println(a == b);
        System.out.print("C????????? ??? ??????????, ??????? ?????? ? ???? ?????? ?? ???? ? ??? ?? ?????? " + c + " ? "+ d + ": ");
        System.out.println(c == d);
        System.out.print("C????????? ??? ??????????, ??????? ?????? ? ???? ?????? ?? ???? ? ??? ?? ??????, ?? ?? ????????? pool'? " + e + " ? "+ f + ": ");
        System.out.println(e == f);
        System.out.print("C????????? ??? ??????????, ??????? ?????? ? ???? ?????? ?? ???? ? ??? ?? ?????? " + g + " ? "+ h + ": ");
        System.out.println(g==h);
        System.out.print("C????????? ??? ??????????, ??????? ?????? ? ???? ?????? ?? ???? ? ??? ?? ??????, ?? ?? ????????? pool'? " + i + " ? "+ j + ": ");
        System.out.println(i==j);
        System.out.print("?????????? ??? ??????????, ??????????? ?? ??? ?????? ??????? " + b + " ? "+ k + ": ");
        System.out.println(b==k);
        System.out.print("?????????? ??? ??????????, ??????????? ?? ??? ?????? ??????? ????? equals " + i + " ? "+ j + ": ");
        System.out.println(i.equals(j));

    }
}
