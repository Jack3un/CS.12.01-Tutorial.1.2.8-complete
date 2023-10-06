import java.util.ArrayList;
public class Delimiters
{
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    public String getOpenDel()
    {
        return openDel;
    }
    public String getCloseDel()
    {
        return closeDel;
    }

    public ArrayList<String> getDelimitersList(String[] token)
    {
        ArrayList<String> delims = new ArrayList<>();
        for (String x : token)
        {
            if (x == openDel || x == closeDel)
            {
                delims.add(x);
            }
        }
        return delims;

    }
    public boolean isBalanced(ArrayList delimiters)
    {
        int open = 0, close = 0;
        for (Object obj : delimiters)
        {
            String s = obj.toString();
            if (s.equals(openDel)) open++;
            if (s.equals(closeDel)) close++;
            if (close > open)
            {
                return false;
            }
        }
        if (open != close)
        {
            return false;
        }
        return true;
    }
}