# Mancala Game

![Mancala Game](mancala.png)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [How to Play](#how-to-play)
- [Project Structure](#project-structure)
- [Game Rules](#game-rules)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Welcome to the Mancala Game! This project is a demo of a Java-based implementation of the classic Mancala board game, with a focus on cross-platform compatibility, responsiveness, and accessibility. Mancala is a two-player turn-based strategy game where the objective is to capture as many stones as possible from your opponent's side of the board.

## Features

- Interactive user interface with JavaFX, ensuring a cross-platform and responsive experience.
- Backend game logic implemented in Java.
- Firebase integration for player authentication and real-time database.
- Two-player mode with keyboard navigation for accessibility.
- Easy-to-follow game rules.
- Persistent storage of user data and progress.

## Getting Started

### Prerequisites

Before running the game, make sure you have the following prerequisites:

- Java Development Kit (JDK)
- Git
- Android Studio (for JavaFX UI)

## Setting Up Firebase Configuration

To use Firebase in this project, you'll need to create a `firebase.json` file with your Firebase project's configuration. Follow these steps to set up the configuration:

1. Go to the [Firebase Console](https://console.firebase.google.com/).

2. Create a new Firebase project if you haven't already.

3. Click on your project in the Firebase Console.

4. In the project settings, navigate to the "General" tab.

5. In the "Your apps" section, select the platform you're targeting (e.g., Web).

6. Follow the setup instructions to generate your Firebase configuration.

Once you've obtained the actual configuration values, create a `firebase.json` file in the root directory of your project and replace the placeholder values with your real Firebase credentials. Here's a sample structure for `firebase.json`:

```json
{
  "apiKey": "YOUR_API_KEY",
  "authDomain": "your-project-id.firebaseapp.com",
  "projectId": "your-project-id",
  "storageBucket": "your-project-id.appspot.com",
  "messagingSenderId": "YOUR_MESSAGING_SENDER_ID",
  "appId": "YOUR_APP_ID"
}

### Installation

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/yourusername/mancala-game.git

   ```

1. Open the project in Android Studio or Visual Studio Code if you've configured it for Java Dev.
1. Build and run the project.

**How to Play**

1. Start the game and sign in with your Firebase account.
2. Invite another player to join the game or play against an AI (if implemented).
3. Follow the on-screen instructions to make moves and capture stones.
4. The game ends when one player runs out of stones. The player with the most stones in their Mancala pit wins!

**Project Structure**

The project follows a structured directory layout:

- `src/main/java/com/yourcompany/mancalagame`: Java source code.
- `lib`: External libraries, including JavaFX and Firebase.
- `res/layout`: JavaFX layout files designed for cross-platform compatibility and responsiveness.
- `test`: Test files for unit testing, ensuring accessibility.

**Game Rules**

- The game is played on a board with two rows of six pits, one row for each player.
- Each pit starts with six stones.
- Players take turns picking up all the stones from one of their pits and sowing them in a counterclockwise direction.
- If the last stone is placed in the player's own Mancala pit, they get another turn.
- If the last stone lands in an empty pit on the player's side, they capture that stone and any stones in the opposite pit and place them in their Mancala pit.
- The game ends when one player has no stones left in their pits. The player with the most stones in their Mancala pit wins!

**Contributing**

We welcome contributions! If you'd like to contribute to this project, please follow our [Contributing Guidelines](CONTRIBUTING.md).

**License**

This project is licensed under the MIT License.
