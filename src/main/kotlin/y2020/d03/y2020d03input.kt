package y2020.d03

const val y2020d03testInput = """
..##.......
#...#...#..
.#....#..#.
..#.#...#.#
.#...##..#.
..#.##.....
.#.#.#....#
.#........#
#.##...#...
#...##....#
.#..#...#.#"""

const val y2020d03input = """
..#.......#..##...#...#..#.#...
..##..#..#.....#.........#....#
...#.##..#.#......#.#....#.....
...#.....#......#...#..........
.......#.#..#..#....##....##...
.#......#......#.#..#....#.#...
.#..........#.....###.##..#.#..
....#...##...........#.........
##......#.#...#...#....##.#...#
.....#.....#.#..#....###...#..#
.#....#.........#...#.......#.#
.##......#.#.........#....#.#..
...#........###..#......##....#
.#.....###..........#...#....##
............#......#...#...#..#
.....#.#....#.#.#...........#.#
....#.....#...##.##.....###..#.
.....#.##......#.##.#...#.#.#..
##.....#.##.##....#..##......#.
.....#.....#........#........##
#..#...#.#.#..##....#....##..#.
.#......................##..#..
#.#.#................#.....#...
..#....#.#.#..##..#..#.....##..
.....###..#.............#....##
..#....#.#...#......###..#.....
.......####.....##......#......
..##...#..#...#.#..#......#....
..##..#..#.....#......##.##....
.#......#................#..#.#
...............#....#.......#..
#...........#.#.#........#.#...
...#...#..#.....##..#.##...#.#.
.#.#..#.#.....#...#..##....#.##
.........#...#.#.#....#.......#
............##.#..#.#........#.
#..#..#........#......####.....
..#.#...#...#...#.#...#..#..#..
#....................#.#.#....#
.......#.....#....#....##..#...
.......#.............##.....#..
..##..#.......#..#.........#..#
..##.#........#...#...#..#..#..
..##.#...#................#..#.
..#.....##...##......###.....#.
.....#.....#......#......#.....
....##.#.#....#.....#..........
...#...#.#.....#.###.....#....#
......##....#..##...##.#.......
......................##......#
.##......#...#...#...##.#.##.#.
#.......#...#.....#........#.#.
...............#......#.......#
.#..##...#....#.....###....##..
...#..###...#..#....#.#..#.....
.#...#....#.................#..
.......##....#..##......#.#....
....#.....#.....###...#....#...
..##..#..##........#...........
....#..#.#............#........
####.....##.........#....#.....
........#.....#......#......##.
#..........#........#....#...##
#..#...###.....##.....#.##...#.
......#....##.............#..#.
..#......###...#...#..##.....#.
#.##...#......##.###....#....#.
...............#....#.....###.#
#......#........#.#..##.#.....#
#..............#..##.#....#....
.##....###...#...#.#....#....#.
.......#...#.......#....#..##..
..##.#.....#..#...............#
.##..............#.......#...#.
.....#...#.#..#.........#..#...
........#.#.###......#..#......
..#.......###..#...#...........
............#.#.....#....#...#.
#...#..#......#..#......#......
..##..#......#..#.......#.....#
............#.##.....#.#...#...
....#.#...#.#...#........##....
........##...#...##.....#.#..#.
.#..........#.##...............
###.#..#...###..###..#........#
....#..#............#...#.#.#..
.#....###........#.......#...#.
..........#..#.....#......#....
..##..#.#....#..#.....##....#..
...#...............#......#....
......#.#.#...###.....##.#.....
.#...#.#.#.#....#.....#..#..#.#
..#.....#..##....#......#.#.#..
##.#....#.......#.#.#.......#..
.#.#.#........##.#....#........
...#..#...#.#.........#..#....#
#.#......#.#.#..#.#............
......#.....#.....#.......#..#.
.........#..#.##..#..###....#.#
.......#..........#..#.........
......#.#.##...#.#...##........
...........##..##.##....#......
..#..#...#.###...##.....#..#..#
.#...##.......#.#..........#..#
##......#...........#.#........
..#..#.....##..#.#.......#...#.
.#....#..#.....###.......#...#.
...#..#...#...###.#.###..#.....
.......#...#.##......#.#.#.#...
.#.......#...#...#...##........
...#........#....#..#.#...#.#..
..#............#.....#.#....#..
#.....#.#..#.#....#...#.#.#....
#......#......##.#...........#.
.#..#.........##.#........#....
.#....#.#...#........#......#..
....#..#..#....#..#.#.....#..#.
.##.#.....#..#.#...#.....#..###
#..#......#..##....##..#.......
.......#..##....#.###..........
.#......#..........#........#..
.........#.....#......#.#......
.....#..#.......#...#.#....#...
.#......#...#..#......#.....#.#
#.#.#..#.........#.......##....
...#..#.....#.#..#......#...#..
.##...#...#.#....#.....#.#...#.
..#......##......#....#.#..#...
....#.#.....#..#...........#...
.#........#....#....#...#......
..#.#.....#.......#.#.#.##..##.
...#..#.##.......#...#.........
....##.#.#..#.#..#.#.#..#.#.#.#
......#.......#.....#...##.#...
..#.##.....#....#...#...##.##.#
..##.........##.........#..#...
.....###......####..#.#...#....
...#....#....##.............#.#
.#.........#.......##..#.#.....
...#..#........#...............
........#........##......#.#...
##...#......#.....#.##........#
.............#.#........#......
.......##.........#.......#....
....#.......#......#..###....#.
.#.##........#.....#......#....
#...........##...#..##.........
.....#.#........#........##...#
#.........#..##.....#...#....#.
.........#...####..#....###....
###.#..##.......#....#....#.##.
...........#.....#.#...#..#....
.##......###.#.#.#....#........
....#..................#.###.#.
#..##...#......#...#......###..
.#.....#..##......#.#.#.#......
..##...#..#.......##.#.......#.
...#..#..##..##..##.#..####....
......#..#..............#.#####
....#....#..#...#...#.#........
.###...#.......#..#........#...
........#.#......##...#........
.#..#.......##.......#.....##..
...##..........##...........#..
......................#..#.#.#.
#..#.....#......#.....#....#.##
..#......#.....#....#...#.##.#.
............#...#...#......#.##
........##.......#......##.....
..#.##.....#....#..##...#......
........#.#...##.#..#...#....#.
...##............##.....#..#...
...###.##....#....#.#.#.#..#...
............#..#....#..#.....##
...#......##.......#......##..#
.......#......#........#.....#.
.#....#.##..........#..........
..###.........#..#...##.....#..
##....##..#.......###....#.#.#.
#.......#.#.##.................
..#..........#................#
....#.#....#...###...#......#..
.#..........#..#..##.....#...##
.#.....###....#.#...#.#........
.........##.........#..#.#.....
.#.....##....#......##.#....#..
###..#...#..#.........#......#.
..##.....#....#............#...
.....##.##....#.....#..#..#....
.......###...#..........#......
...#........#....#.##.#........
........###....##........##.#..
....#....#........#.....##.....
.#........#.#........#...#..#..
#..#..#......#....##.#..###....
...........#...#...#....#.#...#
.#..#.....#.##..#......##......
..#.#...............##..##.###.
...#.#...#............##.#..#..
.#.#....#....#................#
...#..#.#.##.#.#....#......#...
.........#..#.......##.##.#....
..............#..##.#.....#....
......#.........#...#...##.#..#
....##.....#.#...#.#.####.#....
#..#.#....#.##.......#....#....
...##....#...................##
##.#.......#....#.#.........#.#
.##.#..###...#.#.........#.....
...#.#.#..#...#...#.##....#..#.
....#.....###...#....##........
.............#....#....#....#..
#...#.....#.#...#.#............
#.#....#...........##.......#..
..#..#.........#....###.......#
....###..................##...#
.#........#.....##...#......#..
#..#......#..#.....#.##..#...#.
....#........#.##.#......#.....
#.#...#...............####...##
#.#.....##..#.####.............
##...##..#.##........#.#...#...
...#...........#............#..
...#..#..#........##...........
..#.##..#.#...#...#..#......#..
.....##......#...##.....##.....
.......##.....##....#..........
..........#.#...............#.#
#.#..........#..#..##..#...#..#
.#.#..#.###................#...
#...#...#....#...#....#.##.##..
.#................###.....##...
.....##.#.....##.#.....#.....##
.......#.......#......#.#......
..#....#......#.....#.....#..#.
#......#..##..####.....#.#..#..
.......#...###..#...#.....#....
#.#.#......#.............#..###
.#.#.......#..#.#..#..#...#.#..
..#.#......#......#.#....#.....
..#..###..#.#.....#....#.......
..........#........#......#..#.
##..........##....##..###.##...
...#....#.......#..##.......#..
##...#............##...#.#.#.#.
...........#...#.#....#.....##.
.#................#.......#...#
....##.#..#.#.........###.###.#
#..#...###..#...#......#..##...
..##........#.#..##.#..........
...#..#...#...............#.#..
##.##....#...#........#...#....
#..#......#.##.................
.....#..##.##.......#..........
...#.....#........#......#.....
.....#..#......#.....##...#....
#......#...###....#....###.....
................###..#..#..#.##
......#.......#..........#.#..#
###..#..#.##.............#.#...
....##.#.......#...#..##.......
..#.....##..#..#..#.#..........
.#.......#.#..#........##......
..............#.........#......
..#........##....#.#.#......##.
.#.#.........#.#...#.#.........
..........#..#.##.#....#...#.#.
............##....#.....###...#
#....#..#...#.#...#.....#....#.
.#...##.....#......#..#........
.#..#...###.#..##........#...#.
#..#...##.####.......#.....#...
#.##..#...#......#.#.......#.#.
#.#.....##...#.#...............
#...........##.##.#.........#..
...#...........#.#.#.#....#..#.
..#......#.#.#....##..#.#.....#
.........#.#.##...##...#.#.#...
...........#..#.####.#..#.#.###
#........#.#......#..#...#.....
...#....#......##...#.#........
......#.#....#.##....#....#..##
.......###......#.#.....#......
#..........##..................
.###.......##..#..##...##......
##.#..............#....#....##.
#....#.....#.##.....#..#....#.#
.......#.......#..#..#..##..#..
......#...........#..##....#...
.....#.......#..#......#..#..##
.##...#......#........#....#...
.....#..#....#...............##
..#.....#....#..#.##....#.#....
#.#......####...#..#.........#.
#.#........#..#........#...#...
..#..............#.......###.#.
...#.#....##.#......#........#.
....###.......##.#.....##.....#
.........#......#.#.......##.##
.......#.#....#.#...#...#....#.
....#....#....#.#.......##.....
#...#.....#..#.....#...........
#...#..#...#.#..#.............#
........###..#........#........
.............#....#..###..#.#.#
#...............#..#.#.........
##.....###..#......#...#....#..
.#...................##.#.##...
#..#........#.#...#..#...#.....
................#.#.........#..
#.....##.#.#...#..#.........##.
...#.....#....#..####.#........
....#.#...........#............
.....#........##..........#....
..#.......#.#.#.####..#......#.
#.......#...##.#.#..#.#.#......
##........#.#...###............
..##........#........#...#.#.#.
#.#..#.#.......#....#........#.
..............#....#.........#.
#....#.#........#.............#
..##...#..........#........#...
..#..#..#....#....#............
"""

