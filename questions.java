import java.util.*;

public class questions {
	private int question;

	private String[] capitalQuestions = { "What is the capital of Alabama?", "What is the capital of Alaska?",
			"What is the capital of Arizona?", "What is the capital of Arkansas?", "What is the capital of California?",
			"What is the capital of Colorado?", "What is the capital of Connecticut?",
			"What is the capital of Delaware?", "What is the capital of Florida?", "What is the capital of Georgia?",
			"What is the capital of Hawaii?", "What is the capital of Idaho?", "What is the capital of Illinois?",
			"What is the capital of Indiana?", "What is the capital of Iowa?", "What is the capital of Kansas?",
			"What is the capital of Kentucky?", "What is the capital of Louisiana?", "What is the capital of Maine?",
			"What is the capital of Maryland?", "What is the capital of Massachusetts?",
			"What is the capital of Michigan?", "What is the capital of Minnesota?",
			"What is the capital of Mississippi?", "What is the capital of Missouri?",
			"What is the capital of Montana?", "What is the capital of Nebraska?", "What is the capital of Nevada?",
			"What is the capital of New Hampshire?", "What is the capital of New Jersey?",
			"What is the capital of New Mexico?", "What is the capital of New York?",
			"What is the capital of North Carolina?", "What is the capital of North Dakota?",
			"What is the capital of Ohio?", "What is the capital of Oklahoma?", "What is the capital of Oregon?",
			"What is the capital of Pennsylvania?", "What is the capital of Rhode Island?",
			"What is the capital of South Carolina?", "What is the capital of South Dakota?",
			"What is the capital of Tennesee?", "What is the capital of Texas?", "What is the capital of Utah?",
			"What is the capital of Vermont?", "What is the capital of Virginia?", "What is the capital of Washington?",
			"What is the capital of West Virginia?", "What is the capital of Wisconsin?",
			"What is the capital of Wyoming?" };
	private String[] capitalAnswers = { "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver",
			"Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis",
			"Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing",
			"Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton",
			"Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg",
			"Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond",
			"Olympia", "Charleston", "Madison", "Cheyenne" };

	private String[] landmarkQuestions;

	public String generateQuestion() {
		question = (int) (Math.random() * 49);
		landmarkQuestions = new String[50];
		return capitalQuestions[question];
	}

	public int generatePossibleAnswer() {

		int pickrandomQ = (int) (Math.random() * 49);
		return pickrandomQ;

	}

	public String[] returnPossibleAnswers() {
		boolean noPossibleAnswers = true;
		boolean duplicate = false;
		/*
		 * String[] possibleString = { capitalAnswers[generatePossibleAnswer()],
		 * capitalAnswers[generatePossibleAnswer()],
		 * capitalAnswers[generatePossibleAnswer()],
		 * capitalAnswers[generatePossibleAnswer()] };
		 * 
		 * for (int i = 0; i < possibleString.length; i++) { if
		 * (possibleString[i].equals(capitalAnswers[question])) { noPossibleAnswers =
		 * false; } }
		 * 
		 * for (int i = 0; i < possibleString.length; i++) { if
		 * (possibleString[i].equals(possibleString[0]) ||
		 * possibleString[i].equals(possibleString[1])||
		 * possibleString[i].equals(possibleString[2]) ||
		 * possibleString[i].equals(possibleString[3])) { String oldValue =
		 * possibleString[i]; possibleString[i] =
		 * capitalAnswers[generatePossibleAnswer()]; if
		 * (possibleString[i].equals(oldValue) || noPossibleAnswers == true) { if
		 * (possibleString[i].equals(oldValue)) { possibleString[i] =
		 * capitalAnswers[generatePossibleAnswer()]; } else if (noPossibleAnswers ==
		 * true) { int changeValue = (int) (Math.random() * 3);
		 * possibleString[changeValue] = capitalAnswers[question];
		 * 
		 * } }
		 * 
		 * 
		 * }
		 * 
		 */
		String[] possibleString = { capitalAnswers[generatePossibleAnswer()], capitalAnswers[generatePossibleAnswer()],
				capitalAnswers[generatePossibleAnswer()], capitalAnswers[generatePossibleAnswer()] };

		for (int i = 0; i < possibleString.length; i++) {
			if (possibleString[i].equals(capitalAnswers[question])) {
				noPossibleAnswers = false;
			}
		}

		if (noPossibleAnswers == true) {
			int changeValue = (int) (Math.random() * 3);
			possibleString[changeValue] = capitalAnswers[question];
		}

		return possibleString;
	}

	public boolean checkAnswer(String answer, String question) {
		int questionNum = 0; // Auto genereated by eclipse, works well!
		for (int x = 0; x < capitalQuestions.length; x++) {
			if (question == capitalQuestions[x]) {
				questionNum = x;
			}
		}

		if (answer.equals(capitalAnswers[questionNum])) {
		//	System.out.println("hi");
			return true;

		} else {
			return false;
		}

	}
}