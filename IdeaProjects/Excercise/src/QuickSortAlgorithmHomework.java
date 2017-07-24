import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Tarun on 7/24/2017.
 */
public class QuickSortAlgorithmHomework {

    int  QuickSort(int a[],int l, int r)
    {
        if(l>=r)
            return 0;
        int pivot=a[l];
        int i=l+1;
        for(int j=l+1;j<=r;j++)
        {
            if(a[j]<pivot)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }

        }
        int temp=a[i-1];
        a[i-1]=pivot;
        a[l]=temp;
        int totalComparison=r-l;
        return  totalComparison +  QuickSort(a,l,i-2) + QuickSort(a,i,r);
    }


    int  QuickSort2(int a[],int l, int r)
    {
        if(l>=r)
            return 0;
        int tmp=a[r];
        a[r]=a[l];
        a[l]=tmp;
        int pivot=a[l];
        int i=l+1;
        for(int j=l+1;j<=r;j++)
        {
            if(a[j]<pivot)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }

        }
        int temp=a[i-1];
        a[i-1]=pivot;
        a[l]=temp;
        int totalComparison=r-l;
        return  totalComparison +  QuickSort2(a,l,i-2) + QuickSort2(a,i,r);
    }

    void swap(int a[],int p,int q)
    {
        int temp=a[p];
        a[p]=a[q];
        a[q]=temp;
    }

    int  QuickSort4(int a[],int l, int r)
    {
        if(l>=r)
            return 0;

        if((a[l]<a[r] && a[l+((r-l)/2)]>a[l] && a[(l+(r-l)/2)] <a[r]) || ((a[l]>a[r] && a[l+((r-l)/2)]<a[l] && a[(l+(r-l)/2)] >a[r])))
            swap(a,l,(l+(r-l)/2));

        else if((a[l]<a[r] && a[(l+((r-l)/2))] > a[r]   ) || (a[l]>a[r] && a[(l+((r-l)/2))] < a[r]) )
            swap(a,l,r);


        int pivot=a[l];
        int i=l+1;
        for(int j=l+1;j<=r;j++)
        {
            if(a[j]<pivot)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }

        }
        int temp=a[i-1];
        a[i-1]=pivot;
        a[l]=temp;
        int totalComparison=r-l;
        return  totalComparison +  QuickSort4(a,l,i-2) + QuickSort4(a,i,r);
    }




    int  QuickSort1(int a[],int l, int r)
    {
        if(l>=r)
            return 0;
        int pivot=a[r];
        int i=l;
        for(int j=r-1;j>i;j--)
        {
           while(a[i]<=pivot && i<j)
               i++;
           while (a[j]>pivot && i<j)
               j--;
            if(j>i)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;

            }

        }
        int totalComparison=r-l+1;


        if(a[i]>pivot)
        {
            int temp=a[i];
            a[i]=pivot;
            a[r]=temp;
            return  totalComparison +  QuickSort(a,l,i-1) + QuickSort(a,i,r);

        }

        return totalComparison + QuickSort(a,l,r-1);

    }




    public static void main(String[] args) {


        ArrayList<Integer> ar= new ArrayList<Integer>();
        int[] v={5,2,8,6,-5,-5,3,5,56};

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader("C:\\Users\\CUSTOMER\\IdeaProjects\\Excercise\\Data\\Data1.txt");
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader("C:\\Users\\CUSTOMER\\IdeaProjects\\Excercise\\Data\\Data1.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                ar.add(Integer.parseInt(sCurrentLine));
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }


        QuickSortAlgorithmHomework q = new QuickSortAlgorithmHomework();
        int comparisos = q.QuickSort2(ar.stream().mapToInt(p->p).toArray(),0,ar.size()-1);

       // int comparisos = q.QuickSort4(v,0,v.length-1);


        //for(int i=0;i<=2;i++)
            System.out.println("Comparisons:" +comparisos );

     //   int   comparisos= q.QuickSort4(v,0,8);
      //  System.out.println("Compar" + q);
    }

    }
