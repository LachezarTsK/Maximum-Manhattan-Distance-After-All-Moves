
class Solution {

    private companion object {
        const val UP = 'U'
        const val DOWN = 'D'
        const val LEFT = 'L'
        const val RIGHT = 'R'
        const val FREE_TO_CHOOSE_MOVE = '_'
    }

    fun maxDistance(moves: String): Int {
        var verticalDistance = 0
        var horizontalDistance = 0
        var numberOfFreeToChooseMoves = 0

        for (move in moves) {

            when (move) {
                UP -> {
                    ++verticalDistance
                }

                DOWN -> {
                    --verticalDistance
                }

                LEFT -> {
                    --horizontalDistance
                }

                RIGHT -> {
                    ++horizontalDistance
                }

                FREE_TO_CHOOSE_MOVE -> {
                    ++numberOfFreeToChooseMoves
                }
            }
        }
        return abs(verticalDistance) + abs(horizontalDistance) + numberOfFreeToChooseMoves
    }
}
