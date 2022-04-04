/*10. Write the programme that tell you which line pass through particular stations.
        Just use Zone 1 stations name*/
package hwweek9;

import java.util.Scanner;


public class Pro10Zone1Stations1 {
    public static void main(String[] args) {

        {
            String station[] = ("Aldgate East,Aldgate,Angel,Baker Street,Bank,Babican,Battersea,Bayswater,Blackfriars,Bond Street,Cannon Street,Chancery Lane,Charing Cross,Covent Garden,Earl's Court,Edgware Road,Elephant & Castle,Embankment,Euston,Euston Square,Farringdon,Gloucester Road,Goodge Street,Great Portland Street,Green Park,Hyde Park Corner,Holborn,Kennington,Kensington,King's Cross & St Pancras,Knights bridge,Lambeth North,Leicester Square,Lancaster Gate,Liverpool Street,London Bridge"
                    + "Mansion House,Marble Arch,Marylebon,Monument,Moorgate,Nine Elms,Notting Hill Gate"
                    + "Old street,Oxford Circus,Paddington,Piccadilly Circus,Pimlico,Queensway,Regents park,Russell Square"
                    + "Sloane Square,South Kensington,Southwark,St James's Park,St Paul's"
                    + "Temple,Tottenham Court Road,Tower Hill,Vauxhall,Victoria,Warren Street,Waterloo,Westminster").split(",", 200);

            //Multidimensional array of tubelines and station name
            String Alllines[][] = new String[11][28];

            Alllines[0][0] = "Bakerloo Line";
            Alllines[0][1] = "Paddington";
            Alllines[0][2] = "Edgware Road";
            Alllines[0][3] = "Marylebon";
            Alllines[0][4] = "Baker Street";
            Alllines[0][5] = "Regents park";
            Alllines[0][6] = "Oxford Circus";
            Alllines[0][7] = "Piccadilly Circus";
            Alllines[0][8] = "Charing Cross";
            Alllines[0][9] = "Embankment";
            Alllines[0][10] = "Waterloo";
            Alllines[0][11] = "Lambeth North";
            Alllines[0][12] = "Elephant & Castle";

            Alllines[1][0] = "Central Line";
            Alllines[1][1] = "Notting Hill Gate";
            Alllines[1][2] = "Queensway";
            Alllines[1][3] = "Lancaster Gate";
            Alllines[1][4] = "Marble Arch";
            Alllines[1][5] = "Bond Street";
            Alllines[1][6] = "Oxford Circus";
            Alllines[1][7] = "Tottenham Court Road";
            Alllines[1][8] = "Holborn";
            Alllines[1][9] = "Chancery Lane";
            Alllines[1][10] = "St Paul's";
            Alllines[1][11] = "Bank";
            Alllines[1][12] = "Liverpool Street";

            Alllines[2][0] = "Circle Line";
            Alllines[2][1] = "Edgware Road";
            Alllines[2][2] = "Bayswater";
            Alllines[2][3] = "Notting Hill Gate";
            Alllines[2][4] = "Kensington";
            Alllines[2][5] = "Gloucester Road";
            Alllines[2][6] = "South Kensington";
            Alllines[2][7] = "Sloane Square";
            Alllines[2][8] = "Victoria";
            Alllines[2][9] = "St James's Park";
            Alllines[2][10] = "Westminster";
            Alllines[2][11] = "Embankment";
            Alllines[2][12] = "Temple";
            Alllines[2][13] = "Blackfriars";
            Alllines[2][14] = "Mansion House";
            Alllines[2][15] = "Cannon Street";
            Alllines[2][16] = "Monument";
            Alllines[2][17] = "Tower Hill";
            Alllines[2][18] = "Aldgate";
            Alllines[2][19] = "Liverpool Street";
            Alllines[2][20] = "Moorgate";
            Alllines[2][21] = "Babican";
            Alllines[2][22] = "Farringdon";
            Alllines[2][23] = "King's Cross & St Pancras";
            Alllines[2][24] = "Euston Square";
            Alllines[2][25] = "Great Portland Street";
            Alllines[2][26] = "Baker Street";
            Alllines[2][27] = "Paddington";

            Alllines[3][0] = "District line";
            Alllines[3][1] = "Edgware Road";
            Alllines[3][2] = "Bayswater";
            Alllines[3][3] = "Notting Hill Gate";
            Alllines[3][4] = "Kensington";
            Alllines[3][5] = "Gloucester Road";
            Alllines[3][6] = "South Kensington";
            Alllines[3][7] = "Sloane Square";
            Alllines[3][8] = "Victoria";
            Alllines[3][9] = "St James's Park";
            Alllines[3][10] = "Westminster";
            Alllines[3][11] = "Embankment";
            Alllines[3][12] = "Temple";
            Alllines[3][13] = "Blackfriars";
            Alllines[3][14] = "Mansion House";
            Alllines[3][15] = "Cannon Street";
            Alllines[3][16] = "Monument";
            Alllines[3][17] = "Tower Hill";
            Alllines[3][18] = "Aldgate East";

            Alllines[4][0] = "Hammersmith & City line";
            Alllines[4][1] = "Paddington";
            Alllines[4][2] = "Edgware Road";
            Alllines[4][3] = "Baker Street";
            Alllines[4][4] = "Great Portland Street";
            Alllines[4][5] = "Euston Square";
            Alllines[4][6] = "King's Cross & St Pancras";
            Alllines[4][7] = "Farringdon";
            Alllines[4][8] = "Babican";
            Alllines[4][9] = "Moorgate";
            Alllines[4][10] = "Liverpool Street";
            Alllines[4][11] = "Aldgate East";

            Alllines[5][0] = "Jubilee line";
            Alllines[5][1] = "Baker Street";
            Alllines[5][2] = "Bond Street";
            Alllines[5][3] = "Green Park";
            Alllines[5][4] = "Westminster";
            Alllines[5][5] = "Waterloo";
            Alllines[5][6] = "Southwark";
            Alllines[5][7] = "London Bridge";

            Alllines[6][0] = "Metropolitan line";
            Alllines[6][1] = "Baker Street";
            Alllines[6][2] = "Great Portland Street";
            Alllines[6][3] = "Euston Square";
            Alllines[6][4] = "King's Cross & St Pancras";
            Alllines[6][5] = "Farringdon";
            Alllines[6][6] = "Babican";
            Alllines[6][7] = "Moorgate";
            Alllines[6][8] = "Liverpool Street";
            Alllines[6][9] = "Aldgate";

            Alllines[7][0] = "Northern line";
            Alllines[7][1] = "Battersea";
            Alllines[7][2] = "Nine Elms";
            Alllines[7][3] = "Vauxhall";
            Alllines[7][4] = "Kennington";
            Alllines[7][5] = "Waterloo";
            Alllines[7][6] = "Embankment";
            Alllines[7][7] = "Charing Cross";
            Alllines[7][8] = "Leicester Square";
            Alllines[7][9] = "Tottenham Court Road";
            Alllines[7][10] = "Goodge Street";
            Alllines[7][11] = "Euston";
            Alllines[7][12] = "King's Cross & St Pancras";
            Alllines[7][13] = "Angel";
            Alllines[7][14] = "Old street";

            Alllines[8][0] = "Piccadilly line";
            Alllines[8][1] = "Earl's Court";
            Alllines[8][2] = "Gloucester Road";
            Alllines[8][3] = "Knights bridge";
            Alllines[8][4] = "Hyde Park Corner";
            Alllines[8][5] = "Green Park";
            Alllines[8][6] = "Piccadilly Circus";
            Alllines[8][7] = "Leicester Square";
            Alllines[8][8] = "Covent Garden";
            Alllines[8][9] = "Holborn";
            Alllines[8][10] = "Russell Square";
            Alllines[8][11] = "King's Cross & St Pancras";

            Alllines[9][0] = "Victoria line";
            Alllines[9][1] = "King's Cross & St Pancras";
            Alllines[9][2] = "Euston";
            Alllines[9][3] = "Warren Street";
            Alllines[9][4] = "Oxford Circus";
            Alllines[9][5] = "Green Park";
            Alllines[9][6] = "Victoria";
            Alllines[9][7] = "Pimlico";
            Alllines[9][8] = "Vauxhall";

            Alllines[10][0] = "Waterloo & City line";
            Alllines[10][1] = "Waterloo";
            Alllines[10][2] = "Bank";


            String b=" ";
            do {
                Scanner test = new Scanner(System.in);
                System.out.println("Enter station name");
                String str = test.nextLine();
                String s = "";

                for (int i = 0; i < station.length; i++) {
                    if (str.equalsIgnoreCase(station[i])) {
                        s = station[i];
                    }
                }
                if (str.equalsIgnoreCase(s)) {
                    System.out.println(str + " station is in Zone 1 ");
                    System.out.println("The lines passing through at " + str + " station are :");
                    System.out.println("----------------------------------------------------");

                    for (int k = 0; k < Alllines.length; k++) {
                        for (int j = 1; j < Alllines.length; j++) {
                            String a = Alllines[k][j];
                            if (str.equalsIgnoreCase(a)) {
                                System.out.println(Alllines[k][0]);
                            }
                        }
                    }
                } else {
                    System.out.println(str + " station is not in zone 1 or you have entered wrong station name");
                }
                System.out.println("Do you want to try again then please enter y for Yes and n for No");
                String d = test.nextLine();
                b = d;
            } while (b.equals("y"));

        }
    }
}
