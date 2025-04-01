/*

Problem:

A city bus is a ring route bus which runs in circular fashion. That is, bus once starts at the source bus stop, halts at each bus stop in its route and at the end it reaches the source bus stop again.

If there are n number of stops and if the bus starts at bus stop 1, then after nth bus stop, the next stop in the route will be bus stop number 1 always.

If there are n stops, there will be n paths. One path connects two stops. Distances (in meters) for all paths in Ring route is given in array path[] as given below:

Path = [800,600,750,900,1400,1200,1100,1500]


Question:

Fare is determined based on the distance covered from source to destination stop as Distance between Input Source and Destination stops can be measured by looking at values in  array Path[] and fare can be calculated as per following criteria:

If d = 1000 meters, then fare = 5 INR

When calculating fare for others, the calculated fare containing any fraction value should be ceiled. For example, for distance 900 m, when fare initially calculated is 4.5 which must be ceiled to 5)

Path is circular in function. Value at each index indicates distance till current stop from the previous one. And each index position can be mapped with values at same index in bus stops[] array, which is a string array holding abbreviation of names for all stops as -

THANERAILWAYSTN = TH                  NITINCOMPANYJUNCTION = NI

GAONDEVI = GA                         CADBURRYJUNCTION = CA

ICEFACTORY = IC                       LUISWADI = LU

HARINIWASCIRCLE = HA                  TEENHATHNAKA = TE


Given n = 8, where n is number of total bus stops.

BusStops = ["TH","GA","IC","HA","TE","LU","NI","CA"]

Write a code with function getFare(String Source, String Destination) which take input as source and destination stops (in the format containing first two characters of the name of the bus stop) and calculate and return travel fare.

Examples

Input Values :              Input Values:

    ca                           NI
    Ca                           HA

Output Values :             Output Values:

 INVALID OUTPUT               23.0

*/


import java.util.Scanner;

public class CityBus
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String source = in.next();
        String destination = in.next();

        int ans = getFare(source,destination);
        if(ans==-1)
            System.out.println("Invalid Input!");
        else
            System.out.println(ans);

    }

    public static int getFare(String source, String destination)
    {
        String route[] = {"TH","GA","IC","HA","TE","LU","NI","CA"};

        int dis[] = {800,600,750,900,1400,1200,1100,1500};

        // Initial fare
        double fare = 0.0;

        int start = 0, end = 0;

        for(int i=0;i<8;i++)
        {
            if(route[i].equals(source))
                start = i; //6

            if(route[i].equals(destination))
                end = i; //3
        }

        if(start==end)
            return -1;

        int i = start+1;

        while(i!=end+1)
        {
            fare = fare + dis[i];
            i=(i+1)%8;
        }

        return (int)Math.ceil(fare*0.005); // If d = 1000 meters, then fare = 5 INR  => hence multiply with 0.005

    }

}
