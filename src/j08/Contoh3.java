package j08;

public class Contoh3 {
    public static void main(String[] args) 
    {
        //Cara Pertama
        //Menampilkan 10 bilangan ganjil pertama
        int x = 1;
        
        for(x = 1; x <= 20; x+=2)
        {
            System.out.print(x + " ");
        }
        
        System.out.println();
        
        //Menampilkan 10 bilangan genap pertama
        for(x = 2; x <= 20; x+=2)
        {
            System.out.print(x + " ");
        }    
        
        //Cara Kedua
        for(x = 1; x <20; x++)
        {
            if(x % 2 == 1)
            {
                System.out.print(x + " ");
            }
        for(x = 1; x <=20; x++)
        {
            System.out.print(x + " ");   
        }
    }
}
}
    

