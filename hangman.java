/** 
 *  hangman.java
 *  Careers hangman game
 *  Bryan Zhang
 *  v 1.0
 *  4 October 2018
 */

import java.util.Scanner;
import java.util.Random;
public class hangman {
  public static void main(String[] args) { 
    Scanner myScanner = new Scanner(System.in);
    Random myRandom = new Random();
    
    //Create arrays for possible careers and the hints
    String careers[] = {"Video Game Developer", "Web Developer", "Application Developer", "Database Administrator", "System Analyst", "SEO Specialist", "Cyber Security Analyst", "Information Systems Manager", "Machine Learning Engineer", "Computer Science Teacher", "Computer Hardware Engineer", "Forensic Computer Analyst", "Cloud Architect", "Help Desk Technician", "Multimedia Programmer"};
    String hints[][] = {
      {"Usually work in a team", "Average annual salary of 60 000 CAD", "Works closely with designers and artists", "Typically work in an office, studio, or production home, but freelancers can work from home", "Relevant degrees include: Computer science, mathematics, physics, software engineering, games technology", "Creates games"}, 
      {"Remote work and self-employment are common as the only equipment needed is a good quality computer and internet connection", "Responsibilities include: testing sites and application in different browsers and environments, writing code as well as optimization of existing code, and designing the architecture of the components of an application", "Average annual salary of 50 000 CAD", "Could work on the front end or back end or both", "Relevant degrees include: computer science, informatics, software engineering, web design and development", "Creates websites"},
      {"Responsibilities include: establishing a detailed program specification through discussion with clients, conducting user-acceptance testing to ensure the program can be used easily, quickly and accurately, and clarifying what actions the program is intended to perform", "Most work in an office environment in one location, although remote working is also common. Self-employment through contracting is possible with experience.", "Average annual salary of 60 000 CAD", "Usually works as a part of a team", "Usually requires one of the following degrees: Computer science, mathematics, business, physical/mathematical/applied science.", "Creates applications"}, 
      {"Responsibilities include: consider both back-end organisation of data and front-end accessibility for end-users, map out the conceptual design for a planned database, and ensure that storage and archiving procedures are functioning correctly", "The working environment is informal and it's possible for work to be carried out from home or from other remote locations. There's an increasing trend towards working from home", "Average annual salary of 65 000 CAD", "work closely with IT project managers, database programmers and multimedia programmers", "Relevant degrees include: computer science, computer software/computer systems engineering, mathematics, or information technology", "Involved in the planning and development of the database, as well as in troubleshooting any issues on behalf of the users"}, 
      {"Responsibilities include: working closely with colleagues, developers, testers and a variety of end users to ensure technical compatibility and user satisfaction, conducting requirements analysis and preparing specific proposals for modified or replacement systems, understanding software development lifecycle", "You may be able to work flexibly or from home, but usually office based", "Average salary of about 65 000 CAD", "Relevant degree ares: computer science, business information systems, information management system", "You don't need a degree for entry-level positions that include training and development opportunities, but most are graduates in IT and business subjects", "Use computers and related systems to design new IT solutions, modify, enhance or adapt existing systems"}, 
      {"Responsibilities include: program in HTML, CSS and JavaScript to ensure the site is accessible and easy to follow and for increased interaction with visitors, run pay-per-click (PPC) campaigns to increase revenue through sponsored online advertising", "Average annual salary of 47 000 CAD", "You'll need to be flexible as it's likely your workload will be diverse, you could be programming one day and writing original content another", "Usually work in an office setting", "Relevant degrees include: IT, business technology, or digital marketing", "Identify strategies, techniques and tactics to increase the number of visitors to a website"},
      {"Responsibilities include: keep up to date with the latest security and technology developments, use advanced analytic tools to determine emerging threat patterns and vulnerabilities, and plan for disaster recovery in the event of any security breaches", "Work is likely to be office-based", "Average annual salary of about 65 000 CAD", "Relevant degrees include: cyber/information/network security, computer science, software engineering", "Some roles will require you to be security cleared, particularly if they're for a government agency or private organisation which handles highly-sensitive information", "help to protect an organisation by employing a range of technologies and processes to prevent, detect and manage cyber threats"},
      {"Responsibilities include: guarantee the smooth running of all IT systems, including anti-virus software, print services and email provision, organise the purchase of hardware and software, and mentor and train new IT support staff", "Average annual salary of 89 000 CAD", "Relevant degrees include: Information science, business management, computer science, or software engineering", "Expect to work many hours without social interaction, and many overtime hours", "Also known as a functional manager or service delivery manager", "Responsible for the computer systems within a company"},
      {"Average annual salary of 111 000 CAD", "Requires master’s or doctoral degree", "Requires exceptional mathematical skills, communication skills,  analytical skills", "Applications of work that this job does ranges from youtube recommendations to self driving cars", "Usually work in teams", "Create programs that will enable machines to take actions without being specifically directed to perform those tasks"},
      {"Requires good communications skills and works with groups of people daily", "Average annual salary of 68 000 CAD", "Responsibilities include: Preparing learning material, grading and providing feedback on assignments, and communicating effectively", "Relevant degrees include: Education, computer science, software engineering", "Depending on the job, could require up to a doctorate degree", "Teach students about computer science"},
      {"Often work closely with software developers", "Key skills include: exceptional math, experience with circuit testing, network analysis, and signal generation", "Average salary of 70 000 CAD", "Usually work in a team", "Relevant degrees include: computer engineering, computer science, and electrical engineering", "Design, implement and test hardware and systems that optimize computer performance"},
      {"Responsibilities include: recover damaged, deleted or access hidden, protected or encrypted files, keep up to date with evolving cyber-crime methods and developments within the digital forensics field, and secure a system or device so it cannot be tampered with", "Average annual salary of 70 000 CAD", "Hours usually range between 35 to 40 a week, however, you will need to be flexible depending on your assignment", "Most of the work will be office or computer lab based", "Relevant degrees include: computer forensics, cyber security, and computer science", "Use a range of forensic tools and software to extract and analyze data"},
      {"Average annual salary of 128 000 CAD", "Key skills include: Computer programming, networking skills, computer security, creativity, and planning skills", "Usually work in teams", "Recommended to get AWS Certified Solutions Architect certification", "projected to experience 9% growth in their field from 2014 to 2024", "responsible for setting up all of the components required for successful cloud computing"},
      {"Average annual salary of 40 000 CAD", "Usually requires technical diploma or certificate", "Skills required include: Knowledge about computer systems, excellent customer service skills", "CompTIA A+ Computer Troubleshooting Certification would be helpful", "Talk to customers through email or phone to help address computer problems", "projected to experience 12% growth in their field from 2014 to 2024"},
      {"Responsibilities include: writing HTML or similar input and use authoring packages where appropriate to create content and effects and writing efficient computer code or script to make the various features work, ensuring that sound, graphics, animations and timings work as intended and making good use of processing and data storage capacity", "Average salary of 57 000 CAD", "Usually 35 to 40 hours per week, but likely work longer hours as deadlines approach", "Usually work in team with designers and other creative specialists", "Relevant degrees include: computer science, fine/visual arts, graphic design, and 3D design", "Works with different multimedia features such as text, sound, graphics, digital photography, 2D/3D modelling, animation and video, to create products such as websites or computer programs"}
    };

    boolean playAgain = true;                                                             //boolean to check if the player wants to play again
    while (playAgain) {
      
      //set up new game
      int currentCareerIndex = myRandom.nextInt(15);                                      //get random career
      int wrongGuesses = 0;                                                               //count number of wrong guesses
      boolean[] guessed = new boolean[careers[currentCareerIndex].length()];              //stores true or false value for each letter in the career
      char[] lettersGuessed = new char[26];                                               //stores guessed letters
      int lettersGuessedIndex = 0;                                                        //index for storing guessed letter in character array
      
      boolean win = false;
      
      while ((wrongGuesses < 6) && (!win)) {
        
        //Print hangman ASCII art
        System.out.println("       _____");
        System.out.println("      |     |");
        if(wrongGuesses > 0) {
          System.out.println("      O     |");
        } else {
          System.out.println("            |");
        }
        if (wrongGuesses > 3) {
          System.out.println("     /|\\    |");
        } else if (wrongGuesses > 2) {
          System.out.println("     /|     |");
        } else if (wrongGuesses > 1) {
          System.out.println("      |     |");
        } else {
          System.out.println("            |");
        }
        if (wrongGuesses > 4) {
          System.out.println("     /      |");
        } else {
          System.out.println("            |");
        }
        System.out.println("            |");
        System.out.println("          -----\n");
        
        //Print missing letters
        for (int i = 0; i < careers[currentCareerIndex].length(); i++) {
          if (careers[currentCareerIndex].charAt(i) == ' ') {
            System.out.print(" ");
          } else if (guessed[i]) {
            System.out.print(careers[currentCareerIndex].charAt(i));
          } else {
            System.out.print("-");
          }
        }
        
        //Print used letters
        System.out.println("\nLetters used: ");
        for (int i = 0; i < lettersGuessed.length; i++) {
          System.out.print(lettersGuessed[i] + " ");
        }
        
        //Print hints
        System.out.println("\nHints");
        for (int i = 0; i <= wrongGuesses; i++) {
          System.out.println((i + 1) + ". " + hints[currentCareerIndex][i]);
        }

        //Take guess and repeat if already guessed letter
        boolean letterCheck;                                                              //used to check if letter has already been guessed                       
        String guess;
        do {
          letterCheck = true;
          System.out.println("\n" + "Guess a letter or the career: ");
          guess = myScanner.nextLine();
          
          //check if letter has already been guessed or if user entered nothing
          if (guess.length() == 1) {
            char letter = guess.toLowerCase().charAt(0);
            for (int i = 0; i < lettersGuessed.length; i++) {
              if (letter == lettersGuessed[i]) {
                letterCheck = false;
              }
            }
            if (!letterCheck) {
              System.out.println("You already guessed that letter!");
            }
          } else if (guess.length() == 0) {
            System.out.println("Enter something!");
          }
        }  while (!letterCheck || guess.length() == 0);
        
        //check if the guess was a word or just a single letter
        if (guess.length() > 1) {
          //Take word guess and check if correct
          guess = guess.toLowerCase();
          if (guess.equals(careers[currentCareerIndex].toLowerCase())) {
            win = true;
          } else {
            wrongGuesses++;
          }
        } else {
          //Check if correct and if not, add 1 to wrong guesses
          boolean correct = true;
          char letter = guess.toLowerCase().charAt(0);
          lettersGuessed[lettersGuessedIndex] = letter;
          lettersGuessedIndex++;
          for (int i = 0; i < careers[currentCareerIndex].length(); i++) {
            if (letter == careers[currentCareerIndex].toLowerCase().charAt(i)) {
              guessed[i] = true;
              correct = false;
            }
          }
          if (correct) {
            wrongGuesses++;
          }
        }
        
        //Check if all letters been guessed
        boolean winCheck = true;
        for (int i = 0; i < careers[currentCareerIndex].length(); i++) {
          if (!(careers[currentCareerIndex].charAt(i) == ' ') && (guessed[i] == false)) {
            winCheck = false;
          }
        }
        if (winCheck) {
          win = true;
        }
      }
      
      //Print game results
      if (win) {
        System.out.println("You Win!");
      } else {
        System.out.println("You Lose!");
      }
      System.out.println("The career was: " + careers[currentCareerIndex]);
      
      //Check if user wants to play again
      System.out.println("Play Again(yes or no)? ");
      String playRequest = myScanner.next();
      playRequest = playRequest.toLowerCase();
      if(playRequest.equals("no")) {
        playAgain = false;
      }
      playRequest = myScanner.nextLine();                                                 //resolve next line blues problem stemming from line 172
    }
    System.out.println("Thanks for playing!");
  }
}