
public class Solution {

    private static final char UP = 'U';
    private static final char DOWN = 'D';
    private static final char LEFT = 'L';
    private static final char RIGHT = 'R';
    private static final char FREE_TO_CHOOSE_MOVE = '_';

    public int maxDistance(String moves) {
        int verticalDistance = 0;
        int horizontalDistance = 0;
        int numberOfFreeToChooseMoves = 0;

        for (char move : moves.toCharArray()) {

            switch (move) {
                case UP -> {
                    ++verticalDistance;
                }
                case DOWN -> {
                    --verticalDistance;
                }
                case LEFT -> {
                    --horizontalDistance;
                }
                case RIGHT -> {
                    ++horizontalDistance;
                }
                case FREE_TO_CHOOSE_MOVE -> {
                    ++numberOfFreeToChooseMoves;
                }
            }
        }
        return Math.abs(verticalDistance) + Math.abs(horizontalDistance) + numberOfFreeToChooseMoves;
    }
}
