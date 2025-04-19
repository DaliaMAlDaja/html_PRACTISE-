package eng_lec16_4.eng_lec16_4;

import java.util.Random;

public class test_Date_this_is_for_reading {
//
//	String[] Test_input = { "Hello word", "automation JAVA", "HTU" };
//	String[] Email = { "Sulaiman@gmail,com", "dalia@gmail.com", "Ahmad@gmail.com" };
//	String[] Password = { "P@ssw0rd ", "asdQ15", "Htd8" };
//	String[] Number = { "26546", "26565", "2225" };
//	String[] Date = { "09/11/2001","08/30/2001","07/5/1995","02/4/2011"};
//
//	
//	
//	Random rand = new Random();
//	int random_index = rand.nextInt(3);
//	int Random_index_for_the_date = rand.nextInt(Date.length);
//
//	String Random_text_input = Test_input[random_index];
//
//	String Random_Email = Email[random_index];
//	String Random_Password = Password[random_index];
//	String Random_Number = Number[random_index];
//	String Random_Date = Date[Random_index_for_the_date];
//}

	String[] TextInput = { "hello world", "automation java", "Hussain HTU Students" };
	String[] Email = { "ahmad@Gmail.com", "Anas@gmail.com", "omar@Gamil.com" };
	String[] Password = { "ASD!@#R", "P@$$w0rd", "ILoveMyMom123" };
	String[] Number = { "9"
			+ "62797700235", "962797700236", "962797700237" };
	String[] Date = { "01/01/2025", "05/04/2023", "02/10/1993", "01/25/2002" };
	// String [] Gender = {"male","female"};

	Random rand = new Random();

	int RandomIndexForTheDate = rand.nextInt(Date.length);
	int RandomIndex = rand.nextInt(3);
	// int RandomIndexForGender = rand.nextInt(Gender.length);
	int RandomGender = rand.nextInt(2);

	int RandomHoppy = rand.nextInt(2);

	String RandomText = TextInput[RandomIndex];
	String RandomEmail = Email[RandomIndex];
	String RandomPassword = Password[RandomIndex];
	String RandomNumber = Number[RandomIndex];
	String RandomDate = Date[RandomIndexForTheDate];
	// String RandomGender = Gender[RandomIndexForGender];

	// don't forget to change the path this is on my pc
	String FilePath = "C:\\Users\\pc\\Documents\\Desktop\\lec16_4 mavan project\\index.html";

}