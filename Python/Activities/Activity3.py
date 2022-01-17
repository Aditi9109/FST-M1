	
player1_input = input("Player1 input [rock/paper/scissors]- ").lower()
player2_input = input("Player2 input [rock/paper/scissors]- ").lower()

	
if player1_input == player2_input:
    print("It's a tie!")
elif player1_input == "rock":
    if player2_input == "scissors":
        print("Player1 wins!!!")
    elif player2_input == "paper":
        print("Player2 wins!!!") 
elif player1_input == "scissors":
    if player2_input == "rock":
        print("Player2 wins!!!")
    elif player2_input == "paper":
        print("Player1 wins!!!")
elif player1_input == "paper":
    if player2_input == "rock":
        print("Player1 wins!!!")
    elif player2_input == "scissors":
        print("Player2 wins!!!")                 
