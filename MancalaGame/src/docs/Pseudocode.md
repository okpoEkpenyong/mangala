Function initializeGame():
Create a board with 14 pits (6 for each player) and 2 big pits.
Initialize each of the 14 pits with 6 stones.
Set the current player to Player 1.
Set the game as active.
Display the initial board to the players.

Function registerUser(email, password):
Try to create a Firebase user account with the provided email and password.
Handle registration errors and provide user feedback.

Function loginUser(email, password):
Try to sign in to the Firebase user account with the provided email and password.
Handle login errors and provide user feedback.

Function makeMove(player, pitIndex):
If the game is not active, return an error.
If the selected pit is empty or belongs to the other player, return an error.

    Pick up all the stones from the selected pit.
    Sow the stones in a counterclockwise direction, placing one stone in each pit, including the player's big pit.
    Check for conditions like capturing stones.

    If the last stone lands in the current player's big pit:
        Allow the current player to take another turn.
    Else:
        Switch to the other player.

    Display the updated board to the players.

Function checkWin(player):
Check if the game is over by determining if one player has no stones in their pits.
Count the stones in each player's big pit to determine the winner.
Display the game result.

Function captureStones(player, pitIndex):
If the last stone lands in an empty pit owned by the current player and the opposite pit contains stones:
Capture all the stones in both pits and place them in the current player's big pit.
Display the captured stones.

Function isBoardEmpty(player):
Check if all pits on one side of the board (one player's side) are empty.
If true, the game is over, and the other player collects the remaining stones.

Function switchPlayer(player):
Change the current player to the other player.

Function displayBoard():
Display the current state of the game board, including the number of stones in each pit and big pit.

Function main():
Initialize the game.
Display game instructions.

    While the game is active:
        Get the current player's move (pit selection).
        Call makeMove(current player, selected pit).

    Determine and display the final game result.

    If the players want to play again, reset the game and start a new round.
