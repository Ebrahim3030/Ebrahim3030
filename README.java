#include<stdio.h>
void main() {
int data[11];
int dataatrec[11],c,c1,c2,c3,c4,i;
printf("Enter 7 bits of data one by one\n");
scanf("%d",&data[0]);
scanf("%d",&data[1]);
scanf("%d",&data[2]);
scanf("%d",&data[4]);
scanf("%d",&data[5]);
scanf("%d",&data[6]);
scanf("%d",&data[8]);
 //Calculation of even parity
data[10]=data[0]^data[2]^data[4]^data[6]^data[8];
data[9]=data[0]^data[1]^data[4]^data[5]^data[8];
data[7]=data[4]^data[5]^data[6];
data[3]=data[0]^data[1]^data[2];
printf("\nEncoded data is\n");
for(i=0;i<11;i++)
printf("%d",data[i]);
printf("\n\nEnter received data bits one by one\n");
for(i=0;i<11;i++)
scanf("%d",&dataatrec[i]);
 c1=dataatrec[10]^dataatrec[8]^dataatrec[6]^dataatrec[4]^dataatrec[2]^dataatrec[0];
 c2=dataatrec[9]^dataatrec[8]^dataatrec[5]^dataatrec[4]^dataatrec[1]^dataatrec[0];
 c3=dataatrec[7]^dataatrec[6]^dataatrec[5]^dataatrec[4];
 c4=dataatrec[3]^dataatrec[2]^dataatrec[1]^dataatrec[0];
 c=c4*8+c3*4+c2*2+c1 ;
 printf("%d",c);
if(c==0) {
printf("\nNo error while transmission of data\n");
 }
else {
printf("\nError on position %d",c);
printf("\nData sent : ");
for(i=0;i<11;i++)
printf("%d",data[i]);
printf("\nData received : ");
for(i=0;i<11;i++)
printf("%d",dataatrec[i]);
printf("\nCorrect message is\n");
 //if errorneous bit is 0 we complement it else vice versa
if(dataatrec[11-c]==0)
dataatrec[11-c]=1;
else
dataatrec[11-c]=0;
for (i=0;i<11;i++) {
printf("%d",dataatrec[i]);

}

}
}




#include<stdio.h>
#include<string.h>
#define N strlen(g)
  char t[28],cs[28],g[] = "10001000000100001";
  int a,e,c;
  void xor(){
        for(c=1;c<N;c++)
                cs[c] = ((cs[c]==g[c])?'0':'1');

  }

void cRc(){
        for(e=0;e<N;e++)
                cs[e] = t[e];
        do{
                if(cs[0]=='1')
                        xor();
                for(c=0;c<N-1;c++)
                        cs[c]=cs[c+1];
                        cs[c] = t[e++];

        }while(e<=a+N-1);
}

int main(){
  printf("\n enter data : ");
  scanf("%s",t);
  printf("\n ----------------------------");
  printf("\n generate Poly : %s",g);
  a = strlen(t);
  for(e=a;e<a+N-1;e++)
          t[e]='0';
  printf("\n----------------------");
  printf("modified data is  : %s",t);
  printf("\n---------------------------");
  cRc();
  printf("\m cRc CHeckSum is : %s", cs);
  for(e=a;e<a+N-1;e++)
          t[e]=cs[e-a];
 printf("\n----------------------------");
 printf("\n final codeword id  : %s" ,t);
 printf("\n-----------------------------");
 printf("\n test error detection 0(yes) 1(no)  ?  : ");
 scanf("%d",&e);
 if(e==0)
         do{
            printf("\n enter the position where the error to be inserted:");
            scanf("%d",&e);

         }while(e==0||e>a+N-1);

     t[e-1] =((t[e-1]=='0')?'1':'0');
   printf("\n----------------------------");
   printf("\nErrorneous data :  %s\n",t);
   cRc();
   for(e=0;(e<N-1)&&(cs[e]!='1');e++)
           if(e<N-1){
                   printf("\nCrc checksum is : %s",cs);
                printf("\nError detected \n\n");
           }else{
                printf("\ncRC checkSum is %s",cs);
                printf("\n n o error detected ");

           }

-- INSERT --                                                                                                                                                       1,11          Top
