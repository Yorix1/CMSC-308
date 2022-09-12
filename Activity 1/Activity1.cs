using System;

namespace PairingArray
{

    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[3] ;
            string[] email = new string[3];
            string[] username = new string[3];
            string[] password = new string[3];

            email[0] = "john.tonga@gmail.com";
            username[0] = "john";
            password[0] = "tonga123";

            email[1] = "james.dingdong@gmail.com";
            username[1] = "james";
            password[1] = "jamespogi";

            email[2] = "ana.maganda@gmail.com";
            username[2] = "damatands";
            password[2] = "ananglamig";

            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write("\nChoose an index from 0-2: ");
                arr[i] = Convert.ToInt32(Console.ReadLine());

                if (arr[i] == 0)
                {
                     Console.WriteLine("Email: " + email[0]);
                     Console.WriteLine("Username: " + username[0]);
                     Console.WriteLine("Password: " + password[0]);
                }else if(arr[i] == 1)
                {
                    Console.WriteLine("Email: " + email[1]);
                     Console.WriteLine("Username: " + username[1]);
                     Console.WriteLine("Password: " + password[1]);
                }else if (arr[i] == 2)
                {
                    Console.WriteLine("Email: " + email[2]);
                     Console.WriteLine("Username: " + username[2]);
                     Console.WriteLine("Password: " + password[2]);
                }else
                {
                    break;
                }
            }
        }
    }
}
