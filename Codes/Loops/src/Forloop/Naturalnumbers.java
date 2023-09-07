package Forloop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Naturalnumbers {
    public static void main(String[] args) {

        //wrp to sum of naturals number 1 to 1000
        int sum= 0;
        for (int n=1;n<=1000;n++)
        {
            sum+=n;
        }
        System.out.println("the sum of naturals numbers 1 to 1000 is " +sum);
    }

}
