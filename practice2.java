
public class practice2 {
public static void main(String[] args) {
int num = 99;
String out = " ";

if (num < 20)
out = "Too low";
else if (num > 99)
out = "Too high";
else
spellNum(num, out);

System.out.println(out);

}
public static void spellNum(int num, String out) {
//System.out.print(num % 10);
String[] tenArray = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty",
"Seventy", "Eighty", "Ninety"};
String[] unitArray = {"-one", "-two", "-three", "-four", "-five",
"-six", "-seven", "-eight", "-nine"};

int tens = num / 10;
int units = num % 10;

if (units == 0)
System.out.print(tenArray[tens - 2]);
else {
System.out.print(tenArray[tens - 2] + unitArray[units - 1]);
//System.out.print(unitArray[units - 1]);


}
}
}