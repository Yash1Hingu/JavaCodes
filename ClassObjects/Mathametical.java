/*
    Problem: Suppose you are mathematician and you want to devlop a software to solve mathematical problem so by using OOPs
             devlop a software for calculation of area in following
             1) Reactangle
             2) Triangle
             3) Circle
             4) Cone
             5) Cyclindre

    Solution: VIPO
                V = lenght,width,height,base,radius,choice,area.
                    Objects : a(Area),sc(Scanner)
                I = lenght,width,height,base,radius,choice : user inputs,area = calcultion
                P = class Area
                    {
                        variable : area
                        methodes : rectangle,triangle,circle,cone,cyliner(calculte area,print area)
                    }
                    class Mathametical
                    {
                        variables: choice
                        take user input of choice(1/2/3)
                        switch case
                        (1.rectangle (user input,Area.obj call)
                        ,2.triangle             ""
                        ,3.circle               ""
                        ,4.cone                 ""
                        ,5.Cylinder             ""
                        ,def.print(invaild)
                        )

                    }
                O = user choice based
                    all time give the area resepected to shape.
                
*/


import java.util.Scanner;
class Area
{
	double area;
	
	void rectangle(int lenght,int width)
	{
		area = lenght*width;
		System.out.println("Area of Recatangle is "+area);
	}
	
	void triangle(int base,int height)
	{
		area = 0.5*base*height;
		System.out.println("Area of Triangle is "+area);
	}

	void circle(double radius)
	{
		area = (Math.PI)*radius*radius;
        System.out.println("Area of circle is "+area);
	}

    void cone(double radius,int height)
    {
        area = (Math.PI)*radius*(radius + Math.sqrt((height*height) + (radius*radius)));
        System.out.println("Surface area of cone is :"+area);
    }

    void cylinder(double radius,int height)
    {
        area = (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
        System.out.println("Surface area of cycliner is : "+area);
    }

}

class Mathametical
{
	public static void main(String arg[])
	{
		int choice;
		System.out.println("1.Rectangle \n2.Triangle \n3.Circle \n4.Cone \n5.Cycliner");
		Scanner sc = new Scanner(System.in);
		Area a = new Area();
		
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1: 		
					int lenght,width;
                    System.out.println("Enter Lenght and Width");
                    lenght = sc.nextInt();
                    width = sc.nextInt();
					a.rectangle(lenght,width);
					break;
			case 2:
					int base,height;
                    System.out.println("Enter Base and height");
                    base = sc.nextInt();
                    height = sc.nextInt();
					a.triangle(base,height);
					break;
			case 3:
					double radius;
                    System.out.println("Enter Radius");
                    radius = sc.nextDouble();
					a.circle(radius);
					break;
            case 4:
                    System.out.println("Enter Radius and Height");
                    radius = sc.nextDouble();
                    height = sc.nextInt();
                    a.cone(radius,height);
                    break;
            case 5:
                    System.out.println("Enter Radius and height");
                    radius = sc.nextDouble();
                    height = sc.nextInt();
                    a.cylinder(radius,height);
                    break;
			default:
					System.out.println("Invaild Choice!");
		}
	}
}