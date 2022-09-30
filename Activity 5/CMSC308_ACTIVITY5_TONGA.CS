using System;

namespace BoardMarker
{
	class Program
	{
		struct boardmarker
		{
			public int inkContent;
			public string inkColor;
		}
		
		public static void Main(string[] args)
		{
			char input;
			boardmarker bm;
			
			bm.inkColor = "White";
			bm.inkContent = 20;
			
			while (true) {
				Console.WriteLine("==MENU==");
				Console.WriteLine("1. Display Info");
				Console.WriteLine("2. Change Color");
				Console.WriteLine("3. Refill");
				Console.WriteLine("4. Write");
				Console.WriteLine();
				Console.Write("Enter your choice: ");
				input = Convert.ToChar(Console.ReadLine());
				Console.WriteLine();
				switch (input) {
					case '1':
						{
							Console.WriteLine();
							Console.WriteLine("The InkColor is: " + bm.inkColor);
							Console.WriteLine("The InkContent is: " + bm.inkContent + "ml");
							Console.ReadKey(true);
							Console.Clear();
							break;
						}
					case '2':
						{
							if (bm.inkContent != 0) {
								Console.WriteLine("Choose the Color that you want: [White, Red, Blue]\n");
								bm.inkColor = Console.ReadLine();
			
								switch (bm.inkColor) {
									case "White":
										Console.Write("\nThe Color you chose is " + bm.inkColor);
										break;
									case "Red":
										Console.Write("\nThe Color you chose is " + bm.inkColor);
										break;
									case "Blue":
										Console.Write("\nThe Color you chose is " + bm.inkColor);
										break;
									default:
										Console.WriteLine("\nInvalid Input");
										break;
								}
				
							} else if (bm.inkContent == 0) {
								Console.WriteLine("Please Refill Your Ink Supply");
							}
							Console.ReadKey(true);
							Console.Clear();
							break;
						}
					case '3':
						{
							if (bm.inkContent == 0) 
							{
								bm.inkContent = bm.inkContent + 20;
								Console.WriteLine("WELL DONE! ");
								Console.WriteLine("The Ink Supply is now " + bm.inkContent + "mL");
							}
							else if (bm.inkContent == 20)
							{
								Console.WriteLine("NO NEED TO WORRY! :) ");
								Console.WriteLine("The Ink Content is: " + bm.inkContent + "mL");
							}
							Console.ReadKey(true);
							Console.Clear();
							break;
						}
					case '4':
						{
							if (bm.inkContent != 0) {
								Console.WriteLine("\nMessage: ");
								bm.inkContent = bm.inkContent - 10;
								switch (bm.inkColor) {
									case "Blue": 
										Console.ForegroundColor = ConsoleColor.Blue;
										break;
									case "Red":
										Console.ForegroundColor = ConsoleColor.Red;
										break;
								}
								string written = Console.ReadLine();
							} else if (bm.inkContent == 0) {
								Console.WriteLine("Please Refill your Ink Supply");
							}
							Console.ReadKey(true);
							Console.ForegroundColor = ConsoleColor.White;
							Console.Clear();
							break;
							
						}
					default:
					
						Console.WriteLine("Invalid Command...");
						Console.ReadKey();
						Console.Clear();
						break;
				}
			}
		}
	}
}
