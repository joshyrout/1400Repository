// Joshua Routledge
import java.util.Scanner;
import java.lang.Math;

public class Joshua_Routledge_Week7Assignment {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int highestTotal = 0;
		int highestTeam = -1;
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Football Team Randomized Season Scores");
		System.out.println("---------------------------------------------------------------------");
		System.out.print("Enter the number of teams: ");
		int teams = input.nextInt();
		if(teams<1) {
			System.out.println("You need atleast one team");
			System.out.print("Enter the number of teams: ");
			teams = input.nextInt();
		}
		
		System.out.print("Enter the number of games: ");
		int games = input.nextInt();
		if(games<1) {
			System.out.println("You need atleast one game");
			System.out.print("Enter the number of game: ");
			games = input.nextInt();
		}
		
		
		int[][] allScores = new int[teams][games];
		int[][] totalScores = new int[teams][2];
		
		for(int i = 0; i < teams; i++){
			int total = 0;
			int average;
			for(int j = 0; j < games; j++){
				int generatedNumber = (int)((Math.random() * ((99 - 0) + 1)) + 0);
				allScores[i][j] = generatedNumber;
				total = total + generatedNumber;
				if(total > highestTotal) {highestTotal = total; highestTeam = i+1;}
			}
			average = total / games;
			totalScores[i][0] = total;
			totalScores[i][1] = average;
		}
		
		int teamSpacing = 7;
		if (String.valueOf(teams).length() > 4) {
			teamSpacing = 4 + String.valueOf(teams).length();
		}
		
		// Creates a variable length dashes line to always be 3 dashes longer then the average while being a minimum of the length above
		String dashLine = generateDashLine(games);
		
		System.out.println(dashLine);
		System.out.println("Football Scores Report");
		System.out.println(dashLine);
		//Calculates the amount of spacing needed between Scores and Tot and between Tot and Avg
		int scoresSpacing = totalLength(9,(3*(games) + 3));
		int totalSpacing = totalLength(6,(String.valueOf(highestTotal).length() + 3));
		System.out.println("Team   Scores" + spacesNeeded(scoresSpacing,6) + "Tot" + spacesNeeded(totalSpacing,3) + "Avg");
		System.out.println(dashLine); 
		
		String generatedString = "";
		
		for(int i = 0; i < teams; i++){
			
			generatedString = i+1 + ":" + spacesNeeded(teamSpacing,1,i+1);
			for(int j = 0; j < games; j++){
				
				generatedString = generatedString + allScores[i][j];
				if(allScores[i][j] < 10) {
					generatedString = generatedString + "  ";
				} else {
					generatedString = generatedString + " ";
				}
			}
			generatedString = generatedString + spacesNeeded(scoresSpacing,(3*games)) + totalScores[i][0] + spacesNeeded(totalSpacing,String.valueOf(totalScores[i][0]).length()) + totalScores[i][1];
			System.out.println(generatedString);
		}
		
		System.out.println(dashLine);
		System.out.println("Top Team: Team " + highestTeam);
		System.out.println(dashLine);
		
		input.close();
	}
	
	// Both spacesNeeded methods are used to calculate the spaces needed and return a string of that many spaces
	public static String spacesNeeded(int totalLength, int staticRemovedLength, int numberRemoved) {
		int spacesNeeded = totalLength-staticRemovedLength-String.valueOf(numberRemoved).length();
		String spaces = String.format("%" + spacesNeeded + "s", "");
		return spaces;
	}
	
	public static String spacesNeeded(int totalLength, int staticRemovedLength) {
		int spacesNeeded = totalLength-staticRemovedLength;
		String spaces = String.format("%" + spacesNeeded + "s", "");
		return spaces;
	}
	
	public static int totalLength(int min, int spaces) {
		
		if(min>=spaces) {
			return min;
		} else {
			return spaces;
		}
	}
	
	public static String generateDashLine(int games) {
			
		String dashes = "---------------------------------------------------------------------";
		int dashesNeeded = (games*3) - 46
				;
		
			for(int i = 0; i < dashesNeeded; i++) {
				dashes = dashes + "-";
			}
		
		return dashes;
		}
	}
	
	