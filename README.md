
# 🎯 Number Guessing Game

## 👾 Description

This is a simple console-based number guessing game in Java where the player has to guess a randomly chosen number within a given range and a limited number of tries. The game provides different difficulty levels: Easy, Medium, and Hard.

## 🛠️ Features

- **Username Prompt**: Players enter their username at the beginning of the game.
- **Difficulty Levels**: Three levels to choose from:
  - Easy (1-10, 5 tries)
  - Medium (1-50, 4 tries)
  - Hard (1-100, 3 tries)
- **Guessing Game**: Players input their guesses, and the program gives feedback on whether the guess is too high or too low.
- **Timer**: The game tracks the time taken to guess the number correctly.
- **High Score**: The program can store and display the high score (best time).
  
## 🎮 How to Play

1. **Start the Game**: Choose a difficulty level.
2. **Make Guesses**: Input your guesses and see if you can find the correct number.
3. **Feedback**: The game will tell you if your guess is too high or too low.
4. **Timer**: The game tracks the time taken to complete the guessing process.
5. **End Game**: If you guess the correct number or run out of tries, the game ends and shows the total time taken.

## 🔧 Installation & Running

1. **Clone the repository** or download the source code.
2. Make sure you have Java installed (preferably Java 8 or above).
3. **Compile** the code:
   ```bash
   javac Main.java Player.java
   ```
4. **Run** the program:
   ```bash
   java Main
   ```

## 📚 Technologies Used

- **Java**: The game is written in Java, using standard Java libraries (`java.util.Scanner`, `java.util.Random`).
- **IDE**: You can use any Java-compatible IDE, such as IntelliJ IDEA or Eclipse.

## 📄 License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).

## 👥 Contributing

Feel free to contribute to this project by forking it and submitting a pull request.

---

## Example Output:

```
Enter username:
John
Hey there! Welcome to the number guessing game!
1. Easy: I'll pick a number between 1 to 10, you get 5 tries
2. Medium: I'll pick a number between 1 to 50, you get 4 tries
3. Hard: I'll pick a number between 1 to 100, you get 3 tries
Choose a difficulty level: 1
Awesome! Let's get started. Choose a Number: 

3
Too low.

5
Too high.

4
Congrats, you've guessed!
⏱ You took 5 seconds to finish the game.
Best Player: John with 5 seconds.
```
