
#include <cmath>
#include <string>
using namespace std;

class Solution {

    static const char UP = 'U';
    static const char DOWN = 'D';
    static const char LEFT = 'L';
    static const char RIGHT = 'R';
    static const char FREE_TO_CHOOSE_MOVE = '_';

public:
    int maxDistance(string moves) {
        int verticalDistance = 0;
        int horizontalDistance = 0;
        int numberOfFreeToChooseMoves = 0;

        for (const auto& move : moves) {

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
        return abs(verticalDistance) + abs(horizontalDistance) + numberOfFreeToChooseMoves;
    }
};
