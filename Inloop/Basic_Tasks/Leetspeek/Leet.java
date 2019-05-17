class Leet
{
    private static String[] normals = {"elite", "cool", "!", "ck", "ers", "er", "en", "e", "t", "o", "a"};
        

    private static String[] leets = {"1337", "k3wl", "!!!11", "xx", "0rz", "0rz", "n", "3", "7", "0", "@"};
        
   
    public static String toLeet(String normals1)
    {
        for(int i = 0; i < normals.length; i++)
        {

        normals1 = normals1.replaceAll(normals[i], leets[i]);

        }

        return normals1;
    }

    public static String[] allToLeet(String[] normals1)
    {
        String[] transformed= new String[normals1.length];
        for(int i = 0; i<normals1.length; i++)
        {
            transformed[i] = toLeet(normals1[i]);
        }
        return transformed;
    }
    


}