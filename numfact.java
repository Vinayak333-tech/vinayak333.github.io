import java.util.*;

class numfact{

    public static void main(String args[]){
        int t;
        
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();

        while(t-->0){
            HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>(100);
        int count,sum;
        boolean hold;
        int n,temp;
            n=sc.nextInt();
        
        while(n-->0){
            temp=sc.nextInt();
        for(int i=2;i*i<=temp;i++){
            if(temp%i==0){
                count=0;
                while(temp%i==0){
                    temp=temp/i;
                    count++;

            }
            hold=hm.containsKey(i);
            if(hold){
                sum=hm.get(i);
                hm.put(i,sum+count);
            }
            else
            hm.put(i,count);

        }
        
    }
    if(temp!=1){
        hold=hm.containsKey(temp);
            if(hold){
                sum=hm.get(temp);
                hm.put(temp,sum+1);
            }
            else
            hm.put(temp,1);

    }
}
int total,result=1;
    for(Map.Entry m:hm.entrySet()){
        total=(int)m.getValue();
        result*=(total+1);

    }
    System.out.println(result);
    }
    
}
}