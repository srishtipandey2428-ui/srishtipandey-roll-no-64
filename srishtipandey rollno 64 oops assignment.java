// // 1. Sum of Natural Numbers

// import java.util.Scanner;

// public class as{
//     public static void main(String[]args){
//          Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i=0;i<=n;i++){
//             sum+=i;
//         }
//         System.out.println(sum);
//     }
// }

// 2. Multiplication Table
// import java.util.Scanner;

// public class as{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(n+" * "+i+" = "+(n*i));
//         }
//     }
// }


// 3. Factorial of a Number
// import java.util.Scanner;
// public class as{
//     public static void main(String[]args){
//         Scanner sc =new Scanner(System.in);
//         int n =sc.nextInt();
//         int fact =1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.println(fact);
//         }
//     }


// 4. Count Digits in a Number
// import java.util.Scanner;
// class as{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int count=0;
//         for(int i=0;i<=n;i++){
//             n=n/10;
//             count++;
//         }
//         System.out.println(count);

//     }
// }



// 5. Sum of Digits
// import java.util.Scanner;
// class as{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i=0;i<=n;i++){
//             sum+=n%10;
//             n=n/10;
//         }
//         System.out.println(sum);
//     }
// }



// // 6. Palindrome Number
// import java.util.Scanner;
// class as{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int rev=0;
//         int org =n;

//         while(n>0){
//             rev=rev*10+n%10;
//             n=n/10;
//         }
//         if(org==rev){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }

//     }
// }


// 7. Fibonacci Series      dout

// import java.util.Scanner;
// class as{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a=0;
//         int b=1;
//         int c;
//         for(int i=0;i<n;i++){
//             c=a+b;
//             a=b;
//             b=c;
//         }
//         System.out.println(a);

//     }
// }


// // 8. Prime Number Check

// import java.util.Scanner;
// public class as{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int c=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 c++;
//             }
//         }
//         if(c==2){
//             System.out.println(" prime");
//         }
//         else{
//             System.out.println("not prime");
//         }
//     }
// }

// // 9. Armstrong Number
// import java.util.Scanner;
// public class as{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum=0;
//         int temp=n;
//         while(temp>0){
//             int digit = temp%10;
//             sum+=digit*digit*digit;
//             temp/=10;
//         }
//         if(sum==n){
//             System.out.println("Armstrong");
//         }
//         else{
//             System.out.println("Not Armstrong");
//         }
//     }
// }


// 10 strong number

// import java.util.Scanner;
// public class as{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum=0;
//         int temp=n;
//         while(n>0){
//             int digit = n%10;
//             int fact=1;

//                 for(int j=1;j<=digit;j++){
//                 fact=fact*j;
//             }
//             sum=sum+fact;
//             n/=10;

//         }
//         if(sum==temp){
//             System.out.println("strong");
//         }
//         else{
//             System.out.println("not strong");
//         }
//     }
// }
