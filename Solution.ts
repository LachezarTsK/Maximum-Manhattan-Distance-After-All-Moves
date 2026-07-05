
function maxDistance(moves: string): number {
    const UP = 'U';
    const DOWN = 'D';
    const LEFT = 'L';
    const RIGHT = 'R';
    const FREE_TO_CHOOSE_MOVE = '_';

    let verticalDistance = 0;
    let horizontalDistance = 0;
    let numberOfFreeToChooseMoves = 0;

    for (let move of moves) {

        switch (move) {
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
        }
    }
    return Math.abs(verticalDistance) + Math.abs(horizontalDistance) + numberOfFreeToChooseMoves;
};
