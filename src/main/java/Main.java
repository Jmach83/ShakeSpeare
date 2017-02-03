
import java.io.IOException;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jmach
 */
public class Main
{

    public static void main(String[] args) throws IOException
    {
        String[] wordArr = Reader.toStringArray("C:/Users/Jmach/Dropbox/4. semester/algoritmer/netbeans/ShakeSpeare/shakespearetext.txt", "[^A-Za-z]");
        System.out.println(Arrays.toString(wordArr));       
    }
}
