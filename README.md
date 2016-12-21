# Calopoly
Monopoly : Berkeley Edition                                                                                                   
Features                                                                                                                       
To be added : 
For deciding who goes first, everyone picks a number between 1 and 100, Dirks will pick a number and whoever's guess is closest goes first. In the case of a tie, the first person to guess goes first. 
Game Class
  Initializer with Inputs for number of players, optional time limit, and optional spicy edition.
  Up to 8 players, time limit is infinite by default, spicy edition gives special occurences for doubles similiar to Pokemon     Monopoly and allows for custom money start amounts and bribes of public funds to Dirks the banker.
Player object
  Has a money attribute, name, and property portfolio. Initializer takes in a name and creates an empty property portfolio and   adds start money.
Property Object
  Has a cost attribute, a mortgage value attribute and an owner, initially null. Properties also have color types and status     as an end property. End  properties are the last in the set and generally have higher rent. 
Added:
