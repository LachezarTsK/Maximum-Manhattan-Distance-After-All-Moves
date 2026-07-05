
using System;

public class Solution
{
    private const char UP = 'U';
    private const char DOWN = 'D';
    private const char LEFT = 'L';
    private const char RIGHT = 'R';
    private const char FREE_TO_CHOOSE_MOVE = '_';

    public int MaxDistance(string moves)
    {
        int verticalDistance = 0;
        int horizontalDistance = 0;
        int numberOfFreeToChooseMoves = 0;

        foreach (char move in moves)
        {
            switch (move)
            {
                case UP:
                    ++verticalDistance;
                    break;
                case DOWN:
                    --verticalDistance;
                    break;
                case LEFT:
                    --horizontalDistance;
                    break;
                case RIGHT:
                    ++horizontalDistance;
                    break;
                case FREE_TO_CHOOSE_MOVE:
                    ++numberOfFreeToChooseMoves;
                    break;
            }
        }
        return Math.Abs(verticalDistance) + Math.Abs(horizontalDistance) + numberOfFreeToChooseMoves;
    }
}
