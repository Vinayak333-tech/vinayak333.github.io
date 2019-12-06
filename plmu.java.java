import java.util.*;




class plmu{
public static void main(String args[]){ 
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n,temp;
n=sc.nextInt();
long czero,ctwo;
czero=ctwo=0;
for(int i=0;i<n;i++){
temp=sc.nextInt();
if(temp==2)
ctwo++;
else if(temp==0)
czero++;
}
ctwo=ctwo*(ctwo-1);
ctwo/=2;
czero=czero*(czero-1);
czero/=2;
long result=0;
result=ctwo+czero;
System.out.println(result);
}
}
}


