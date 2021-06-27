package com.bridgelabz.linecomparisonproblem;

public class LineComparisonProblem {

	public static void main(String[] args) {
		
        int x1=0;
        int y1=0;
        
        int x2=0;
        int y2=8;
        
        double LengthOfLine  = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("The lenght of line is :"+ LengthOfLine );

	}

}
