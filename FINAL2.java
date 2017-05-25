import java.util.*;
class HelloWorld{

    public static void main(String []args){

        Scanner in=new Scanner(System.in);
        String s=in.next();
        char prev='a';
        int res=0,i=0,j=0;
        for(int p=0;p<s.length();p++){
            char curr=s.charAt(p);
            if(curr<'n' && prev<'n'){res+=Math.abs(curr-prev);}
            else if(curr>'m' && prev>'m'){res+=Math.abs(curr-prev);}
            else if(curr>'m' && prev<'n'){res+=Math.min(Math.abs('n'-curr)+Math.abs('m'-prev),Math.abs('z'-curr)+Math.abs('a'-prev));res+=1;}
            else if(curr<'n' && prev>'m'){res+=Math.min(Math.abs('m'-curr)+Math.abs('n'-prev),Math.abs('a'-curr)+Math.abs('z'-prev));res+=1;}

            prev=curr;
        }
        System.out.println(res);

    }
}
