/**
 * Created by Tarun on 7/15/2017.
 */
public class CompareVersions {

    public int compareVersion(String version1, String version2) {

        String[] ver1=version1.split("\\.");
        String[] ver2=version2.split("\\.");
        int length=Math.max(ver1.length,ver2.length);
        for(int i=0;i<length;i++)
        {
            int num1=  i<ver1.length? Integer.parseInt(ver1[i]):0;
            int num2=  i<ver2.length?Integer.parseInt(ver2[i]):0;
            if(num1<num2)
                return -1;
            if(num1>num2)
                return 1;

        }
        return 0;

    }


}
