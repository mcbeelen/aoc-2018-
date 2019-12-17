package y2019.day11_emergency_hull_painting_robot

import util.grid.GridTracker
import util.grid.ORIGIN
import util.grid.ScreenCoordinate
import util.grid.Turn.LEFT
import util.grid.Turn.RIGHT
import y2019.computer.Input
import y2019.computer.IntcodeComputer
import y2019.computer.Output
import y2019.computer.Value
import y2019.day11_emergency_hull_painting_robot.PanelColor.BLACK
import y2019.day11_emergency_hull_painting_robot.PanelColor.WHITE
import y2019.day11_emergency_hull_painting_robot.RobotComputerConnector.State.MOVE
import y2019.day11_emergency_hull_painting_robot.RobotComputerConnector.State.PAINT

private const val ZERO = 0L
private const val ONE = 1L

enum class PanelColor {
    BLACK,
    WHITE
}


class EmergencyHullPaintingRobot(colorOfFirstPanelColor: PanelColor = BLACK) : GridTracker<PanelColor>() {

    init {
        grid[ORIGIN] = colorOfFirstPanelColor
    }

    fun scanPanel() = colorAt(currentPosition)

    private fun colorAt(position: ScreenCoordinate) = grid.getOrDefault(position, BLACK)

    fun turnLeft() = turnAndMove(LEFT)

    fun turnRight() = turnAndMove(RIGHT)

    fun paintIt(color: PanelColor) {
        grid[currentPosition] = color
    }

    fun getNumberOfPiantedPanels(): Int {
        return grid.keys.size
    }

    override fun charFor(panelColor: PanelColor): Char {
        return when (panelColor) {
            BLACK -> ' '
            WHITE -> '#'
        }
    }

}

class RobotComputerConnector(private val hullPaintingRobot: EmergencyHullPaintingRobot) : Input, Output {

    enum class State {
        PAINT, MOVE
    }

    private var state = PAINT

    override fun read() = when (hullPaintingRobot.scanPanel()) {
        BLACK -> ZERO
        WHITE -> ONE
    }

    override fun write(value: Value) {
        when (state) {
            PAINT -> paint(value)
            MOVE -> move(value)
        }

    }

    private fun paint(value: Value) {
        when (value) {
            ZERO -> hullPaintingRobot.paintIt(BLACK)
            ONE -> hullPaintingRobot.paintIt(WHITE)
        }
        state = MOVE
    }

    private fun move(value: Value) {
        when (value) {
            ZERO -> hullPaintingRobot.turnLeft()
            ONE -> hullPaintingRobot.turnRight()
        }
        state = PAINT
    }
}

fun main() {
    y2019d11p1()
    y2019d11p2()
}

fun y2019d11p2() {
    val paintHull = paintHull(WHITE)
    println(paintHull.getNumberOfPiantedPanels())
    paintHull.plot('?')
}

private fun y2019d11p1() {
    println("Number of panels painted at least once: ${countNumberOfPaintedPanels()}")
}

fun countNumberOfPaintedPanels(): Int {
    return paintHull(BLACK).getNumberOfPiantedPanels()
}

private fun paintHull(colorOfFirstPanelColor: PanelColor): EmergencyHullPaintingRobot {
    val hullPaintingRobot = EmergencyHullPaintingRobot(colorOfFirstPanelColor)
    val connector = RobotComputerConnector(hullPaintingRobot)
    val boardComputer = IntcodeComputer(input = connector, output = connector, sourceCode = SOURCE_CODE_HULL_PAINTING_PROGRAM)
    boardComputer.runProgram()
    return hullPaintingRobot
}


internal const val SOURCE_CODE_HULL_PAINTING_PROGRAM = "3,8,1005,8,319,1106,0,11,0,0,0,104,1,104,0,3,8,1002,8,-1,10,101,1,10,10,4,10,108,0,8,10,4,10,1002,8,1,28,3,8,1002,8,-1,10,1001,10,1,10,4,10,1008,8,1,10,4,10,102,1,8,51,2,1008,18,10,3,8,1002,8,-1,10,1001,10,1,10,4,10,1008,8,1,10,4,10,101,0,8,77,1,1006,8,10,1006,0,88,3,8,1002,8,-1,10,1001,10,1,10,4,10,1008,8,1,10,4,10,1002,8,1,106,1006,0,47,2,5,0,10,3,8,102,-1,8,10,101,1,10,10,4,10,1008,8,0,10,4,10,101,0,8,135,2,105,3,10,2,1101,6,10,3,8,102,-1,8,10,101,1,10,10,4,10,1008,8,0,10,4,10,1002,8,1,165,3,8,102,-1,8,10,101,1,10,10,4,10,108,0,8,10,4,10,1002,8,1,186,1,1009,11,10,1,9,3,10,2,1003,10,10,1,107,11,10,3,8,1002,8,-1,10,101,1,10,10,4,10,1008,8,1,10,4,10,1002,8,1,225,1006,0,25,1,1009,14,10,1,1008,3,10,3,8,102,-1,8,10,101,1,10,10,4,10,108,1,8,10,4,10,1002,8,1,257,1,1006,2,10,3,8,1002,8,-1,10,1001,10,1,10,4,10,1008,8,0,10,4,10,101,0,8,284,2,1004,7,10,1006,0,41,2,1106,17,10,1,104,3,10,101,1,9,9,1007,9,919,10,1005,10,15,99,109,641,104,0,104,1,21101,0,937108545948,1,21102,1,336,0,1105,1,440,21102,1,386577203612,1,21102,347,1,0,1105,1,440,3,10,104,0,104,1,3,10,104,0,104,0,3,10,104,0,104,1,3,10,104,0,104,1,3,10,104,0,104,0,3,10,104,0,104,1,21102,1,21478178819,1,21102,1,394,0,1106,0,440,21102,21477985447,1,1,21101,405,0,0,1105,1,440,3,10,104,0,104,0,3,10,104,0,104,0,21101,984458351460,0,1,21101,428,0,0,1106,0,440,21101,709048034148,0,1,21102,439,1,0,1106,0,440,99,109,2,21201,-1,0,1,21101,0,40,2,21101,471,0,3,21102,461,1,0,1105,1,504,109,-2,2106,0,0,0,1,0,0,1,109,2,3,10,204,-1,1001,466,467,482,4,0,1001,466,1,466,108,4,466,10,1006,10,498,1101,0,0,466,109,-2,2105,1,0,0,109,4,2101,0,-1,503,1207,-3,0,10,1006,10,521,21101,0,0,-3,22102,1,-3,1,21201,-2,0,2,21102,1,1,3,21102,540,1,0,1106,0,545,109,-4,2105,1,0,109,5,1207,-3,1,10,1006,10,568,2207,-4,-2,10,1006,10,568,22101,0,-4,-4,1105,1,636,21201,-4,0,1,21201,-3,-1,2,21202,-2,2,3,21102,587,1,0,1106,0,545,21202,1,1,-4,21102,1,1,-1,2207,-4,-2,10,1006,10,606,21101,0,0,-1,22202,-2,-1,-2,2107,0,-3,10,1006,10,628,22101,0,-1,1,21101,628,0,0,105,1,503,21202,-2,-1,-2,22201,-4,-2,-4,109,-5,2105,1,0"