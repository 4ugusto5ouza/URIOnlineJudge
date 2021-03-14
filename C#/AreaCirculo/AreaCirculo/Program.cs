using System;

namespace AreaCirculo
{
    class Program
    {
        static void Main(string[] args)
        {
            double area, raio;
            double n = 3.14159;

            raio = System.Console.Read();

            area = Math.Pow(raio, 2.00) * n;

            System.Console.WriteLine("A = " + area);

        }
    }
}
