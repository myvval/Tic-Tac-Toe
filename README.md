# Tic-Tac-Toe in Java

A simple, interactive console-based Tic-Tac-Toe game built with Java. 

## Features
* **Two-Player Gameplay:** Play locally against a friend (X vs O).
* **Robust Input Handling:** Catches invalid inputs, out-of-bound numbers, and occupied cells without crashing.
* **Automatic Game State Detection:** Instantly detects wins across rows, columns, diagonals, and draws.

## How to Play
1. Run the `Main.java` file to start the game.
2. Players take turns entering the coordinates for their move.
3. Coordinates are entered as two numbers separated by a space (e.g., `1 1` for the top-left corner, `3 3` for the bottom-right).
4. The first player to align three of their marks horizontally, vertically, or diagonally wins!

## Project Structure
* `Main.java` - The entry point of the application.
* `Game.java` - Contains the main game loop, input validation, and win/draw logic.
* `displayBoard.java` - Handles rendering the 3x3 grid in the console.
