/**
 * Created by Tarun on 7/23/2017.
 */
public class ExcelSheetColumn {
    public String convertToTitle(int n) {

        StringBuilder str=new StringBuilder();

        while (n>0)
        {
            n--;
            int result=n%26;
            str.append( (char) ('A'+result));
            n=n/26;
        }
        return str.reverse().toString();


    }




}
