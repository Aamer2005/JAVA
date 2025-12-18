public class Pattern
{
    public Integer size=3;
    public Character symbol='*';

    Pattern(){}
    
    Pattern(Integer size,Character symbol)
    {
        this.size = size;
        this.symbol = symbol;
    }


    public void leftTriangle()
    {

        for(int line=1;line<=size;line++)
        {
            for(int star=line;star>0;star--)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

     public static void main(String[] args)
    {
        Pattern p = new Pattern(3,'*');
        p.leftTriangle();
    }
}
