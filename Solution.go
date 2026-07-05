
package main
import "math"

const UP = 'U'
const DOWN = 'D'
const LEFT = 'L'
const RIGHT = 'R'
const FREE_TO_CHOOSE_MOVE = '_'

func maxDistance(moves string) int {
    verticalDistance := 0
    horizontalDistance := 0
    numberOfFreeToChooseMoves := 0

    for _, move := range moves {

        switch move {
        case UP:
            verticalDistance++

        case DOWN:
            verticalDistance--

        case LEFT:
            horizontalDistance--

        case RIGHT:
            horizontalDistance++

        case FREE_TO_CHOOSE_MOVE:
            numberOfFreeToChooseMoves++
        }
    }
    return int(math.Abs(float64(verticalDistance)) + math.Abs(float64(horizontalDistance))) + numberOfFreeToChooseMoves
}
