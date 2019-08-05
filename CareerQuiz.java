/* [CareerQuiz.java]
 * ICS3U6 Unit 1 Summative: A brief quiz on careers pathways computer science.
 * @author Matthew Ao
 * @version 1.0
 * February 28, 2019
 */

/* import statements */
import java.util.Scanner;

class CareerQuiz{
  
  /* *** main method *** */
  public static void main(String[] args){
    
    /* printing header and quiz description */
    System.out.printf("%80s", "Computer Science Career Pathway Quiz\n");
    System.out.println("\nWelcome to the Computer Science Career Pathway Quiz! Here, you will briefly test your knowledge");
    System.out.println("on various careers and career pathways in computer science. There are 10 multiple choice questions;");
    System.out.println("simply enter the letter you believe to be the correct answer to move on to the next question. Good luck!\n");
    
    /* initiating scanner and variables */
    Scanner input = new Scanner(System.in);
    String answer = "";
    int pointCount = 0;
    boolean playAgain = true, repeatPlayRequest = false, repeatQuestion = false;
    
    /* appending questions and answers to arrays */
    String[] questions = {"1. Of the following computer science skills among freelancers, which one was the fastest-growing in Quarter 2 of 2018?", 
      "2. What is the average annual salary of a machine learning engineer in Canada?", 
      "3. This career path requires proficiency in both front-end and back-end web development, and extensive experience in building applications from start to finish. ", 
      "4. According to the 2018 worldwide Kaggle Machine Learning and Data Science Survey, which programming language is most commonly used by data professionals?", 
      "5. According to Maclean’s, what is the ranking of Canadian computer science programs in 2018, from best to worst?", 
      "6. This career path requires expertise and knowledge in regulating access to computer files, developing firewalls, and testing data processing systems to verify security measures.", 
      "7. A full-stack developer is an engineer who is apt in handling all the work of databases, systems engineering, servers, and databases needed to complete a project. What are the disadvantages to being a full-stack developer?", 
      "8. This career’s responsibilities include programming in HTML, CSS and JavaScript to ensure accessibility and increased interaction in web applications, as well as running pay-per-click campaigns to increase revenue through sponsored online advertising.", 
      "9. What are the career requirements for becoming a software engineer?", 
      "10. Which of the following computer science jobs has the highest paying salary in Canada as of 2018?"};
    String[][] answers = {
      {"Tensorflow", "Blockchain", "Node.js", "Apple UIKit"}, 
      {"$100,400", "$131,000", "$220,300", "$95,800"}, 
      {"Software Engineer", "Mobile Application Developer", "Full Stack Developer", "Blockchain Developer"}, 
      {"R", "SQL", "Python", "C/C++"}, 
      {"Waterloo, UBC, Toronto, McGill", "Waterloo, Toronto, Montreal, UBC", "Toronto, UBC, Waterloo, Montreal", "UBC, Waterloo, Toronto, McGill"}, 
      {"Cybersecurity Engineer", "Network Engineer", "Cybersecurity Analyst", "Software Developer"}, 
      {"Narrow skillset", "Reduced horizontal familiarity with technological requirements", "Lack of specialization", "Poor communication skills"}, 
      {"SEO Specialist", "Full Stack Developer", "Cloud Architect", "Multimedia Programmer"}, 
      {"Bachelor’s degree in relevant computer science or engineering field", "Strong communication skills", "The ability to work with high-level abstract concepts", "All of the above"}, 
      {"Machine Learning Engineer", "Front End Web Developer", "Blockchain Developer", "Software Architect"}
    };
    String[] correctAnswers = {"B", "A", "C", "C", "C", "C", "C", "A", "D", "C"};
    
    /* game loop */
    do{
      pointCount = 0;
      for(int i = 0; i < 10; i++){
        /* printing question and multiple choice options */
        System.out.println("\n" + questions[i]);
        System.out.println("a. " + answers[i][0] + "\nb. " + answers[i][1] + "\nc. " + answers[i][2] + "\nd. " + answers[i][3]);
        
        /* receiving answer from user */
        System.out.println("\nAnswer:");
        do{
          do{
            answer = input.next(); // requesting input
            if(answer.length() != 1){ 
              System.out.println("Please enter a valid answer."); // retype answer if > 1 character
            }
          }while(answer.length() != 1); // question loop
          
          /* if answer is correct, add 1 point and move to next question */
          if(answer.compareToIgnoreCase(correctAnswers[i]) == 0){
            pointCount += 1;
            System.out.println("Correct. " + pointCount + "/10.");
            repeatQuestion = false;
          
          /* if answer is incorrect and belonging to {a, b, c, d}, move on to next question */
          }else if((answer.compareToIgnoreCase("a") == 0) || (answer.compareToIgnoreCase("b") == 0) || 
                   (answer.compareToIgnoreCase("c") == 0) || (answer.compareToIgnoreCase("d") == 0)){
            System.out.println("Incorrect. " + pointCount + "/10.");
            repeatQuestion = false;
            
          /* if answer is not an option, retype answer */
          }else{
            System.out.println("Please enter a valid answer.");
            repeatQuestion = true;
          }
        }while(repeatQuestion); // end of question loop
      } // end of for loop
      
      // print score
      System.out.println("\nYou answered " + pointCount + "/10 questions correctly.");
      
      // loop to request playing again
      do{
        System.out.println("Would you like to play again? (Y/N)");
        String playRequest = input.next();
        
        // if user says no ("N"), exit game loop
        if(playRequest.compareToIgnoreCase("N") == 0){
          playAgain = false;
          repeatPlayRequest = false;
        
        // if user says something aside from "N" or "Y", retype response
        }else if(playRequest.compareToIgnoreCase("Y") != 0){
          System.out.println("Please enter a valid response.\n");
          repeatPlayRequest = true;
          
        // says yes, exit current loop and return to start of game loop
        }else{
          repeatPlayRequest = false;
        }
      }while(repeatPlayRequest); // end of request play again loop
      
    }while(playAgain); // end of game loop
    
    System.out.println("\nThank you for playing! Have a good day.");
  } // end of main
} // end of class