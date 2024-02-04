package watek_interfejs_Runnable;
import java.io.*;

class mojWatek implements Runnable
{
    int licznik;
    String nazwa_watku;

    mojWatek(String nazwa)
    {
        licznik = 0;
        nazwa_watku = nazwa;
    }

    //Punkt wejscia watku
    @Override
    public void run() //Stad watek rozpoczyna wykonanie
    {
        System.out.println(nazwa_watku + " startuje.");
        try
        {
            do
            {
                Thread.sleep(500); //Zawieszenie watku na 50 milisekund
                System.out.println(nazwa_watku + " , licznik =" + licznik);
            }
            while(licznik < 10);
        }
        catch (InterruptedException exc)
        {
            System.out.println(nazwa_watku + "przerwany.");
        }
        System.out.println(nazwa_watku + " zakonczony.");
    }
}
public class Main {
}
