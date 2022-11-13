using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace bananacue
{
    class Program
    {
        static void Main(string[] args)
        {
            Queue<string>myq = new Queue<string>();
            
            int option;
            string input;
            
            do{
            Console.WriteLine("===QUEUE MENU===");
            Console.WriteLine("1. Add Element");
            Console.WriteLine("2. Remove Front Element");
            Console.WriteLine("3. Search Element");
            Console.WriteLine("4. Display All Element");
            Console.WriteLine("5. Exit");
            Console.WriteLine("Choose an option: ");
            option = int.Parse(Console.ReadLine());
            
            switch(option){
                case 1:
                    Console.WriteLine ("Enter element to be added on Queue: ");
                    input =     Console.ReadLine();
                    myq.Enqueue(input);
                    if(myq.Count > 5){
                        myq.Dequeue();
                    }
                    break;
                    
                case 2:
                    Console.WriteLine ("Removing the First Element...");
                    myq.Dequeue();
                    break;
                    
                case 3:
                    Console.WriteLine ("Search Element u want");
                    string search = Console.ReadLine();
                    Console.WriteLine(myq.Contains(search));
                    break;
                    
                case 4:
                    foreach(string element in myq){
               Console.WriteLine(element);
                    }
                    break;
                    
                case 5:
                Environment.Exit(0);
                break;
                
                default:
                Console.WriteLine("Invalid Input!");
                break;
            }
            }while(option != 5);
        }
    }
}
