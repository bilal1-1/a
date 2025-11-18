# Tortoise and Hare Race Simulation

This Java program simulates the classic race between the Tortoise and the Hare.  
Both animals move along a 70-square race track using random number generation.

## How It Works
- The race track has 70 positions.
- Both animals start at position 1.
- Each tick, a random number (1–10) determines their movement:
  - Tortoise: fast plod (+3), slip (−6), slow plod (+1)
  - Hare: sleep (0), big hop (+9), big slip (−12), small hop (+1), small slip (−2)
- If they land on the same square, the program prints "OUCH".
- The race ends when either reaches position 70.

## Output
The program prints the track each tick, showing the positions of the Tortoise (T) and the Hare (H), or “OUCH” when they collide.

## Requirements
- Java 8 or higher

## Author
A simple project created for practicing loops, arrays, and random number simulation in Java.
