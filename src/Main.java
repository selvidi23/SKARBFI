import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        int nbtest = 0, nbtips = 0,x =0 ,y = 0,direction = 0,nbsteps = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nbtest = Integer.parseInt(br.readLine());
        int tabx[] = new int[nbtest];
        int taby[] = new int[nbtest];
        for(int i  = 0;i < nbtest; i++)
        {

            nbtips = Integer.parseInt(br.readLine());
            x = 0;
            y = 0;
            for(int j = 0 ;j < nbtips; j++)
            {
                String line = br.readLine();
                String [] tab = line.split(" ");
                direction = Integer.parseInt(tab[0]);
                nbsteps = Integer.parseInt(tab[1]);
                if(direction==0)
                {
                    y=y+nbsteps;
                }
                else if(direction == 1)
                {
                    y=y-nbsteps;
                }
                else if(direction == 2)
                {
                    x=x-nbsteps;
                }
                else if(direction == 3)
                {
                    x=x+nbsteps;
                }
            }
            tab
            if(y<0)
            {
                System.out.println("1 "+y);
            }
            if(y>0)
            {
                System.out.println("0 "+y);
            }
            if(x<0)
            {
                System.out.println("2 "+x);
            }
            if(x>0)
            {
                System.out.println("3 "+x);
            }

            if(y==0 && x==0)
            {
                System.out.println("studnia");
            }

        }
    }
}
