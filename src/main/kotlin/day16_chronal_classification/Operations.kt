package day16_chronal_classification

import java.lang.Integer.MIN_VALUE

enum class OpCode(val instruction: Int) {
    ADDI(MIN_VALUE),
    ADDR(MIN_VALUE),

    MULI(1),
    MULR(MIN_VALUE),

    BANI(10),
    BANR(MIN_VALUE),

    BORI(2),
    BORR(MIN_VALUE),

    SETI(MIN_VALUE),
    SETR(MIN_VALUE),

    GTIR(MIN_VALUE),
    GRRI(MIN_VALUE),
    GTRR(MIN_VALUE),

    EQIR(MIN_VALUE),
    EQRI(MIN_VALUE),
    EQRR(MIN_VALUE)
}



internal fun performAddImmediate(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = registers[instruction[1]] + instruction[2]
    return registers
}

internal fun performAddRegisters(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = registers[instruction[1]] + registers[instruction[2]]
    return registers
}



internal fun performMultiplyRegisters(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = registers[instruction[1]] * registers[instruction[2]]
    return registers
}

internal fun performMultiplyImmediate(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = registers[instruction[1]] * instruction[2]
    return registers
}



internal fun performBitwiseAndRegister(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = registers[instruction[1]] and registers[instruction[2]]
    return registers
}

internal fun performBitwiseAndImmediate(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = registers[instruction[1]] and instruction[2]
    return registers
}



internal fun performBitwiseOrRegister(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = registers[instruction[1]] or registers[instruction[2]]
    return registers
}

internal fun performBitwiseOrImmediate(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = registers[instruction[1]] or instruction[2]
    return registers
}



internal fun performSetRegister(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = registers[instruction[1]]
    return registers
}

internal fun performSetImmediate(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    registers[instruction[3]] = instruction[1]
    return registers
}



internal fun performGreaterThanImmediateRegister(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    if (instruction[1] > registers[instruction[2]]) {
        registers[instruction[3]] = 1
    } else {
        registers[instruction[3]] = 0

    }
    return registers
}

internal fun performGreaterThanRegisterImmediate(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    if (registers[instruction[1]] > instruction[2]) {
        registers[instruction[3]] = 1
    } else {
        registers[instruction[3]] = 0

    }
    return registers
}


internal fun performGreaterThanRegisterRegister(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    if (registers[instruction[1]] > registers[instruction[2]]) {
        registers[instruction[3]] = 1
    } else {
        registers[instruction[3]] = 0

    }
    return registers
}




internal fun performEqualImmediateRegister(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    if (instruction[1] == registers[instruction[2]]) {
        registers[instruction[3]] = 1
    } else {
        registers[instruction[3]] = 0

    }
    return registers

}
internal fun performEqualRegisterImmediate(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    if (registers[instruction[1]] == instruction[2]) {
        registers[instruction[3]] = 1
    } else {
        registers[instruction[3]] = 0

    }
    return registers
}


internal fun performEqualRegisterRegister(instruction: IntArray, before: IntArray): IntArray {
    val registers = before.clone()
    if (registers[instruction[1]] == registers[instruction[2]]) {
        registers[instruction[3]] = 1
    } else {
        registers[instruction[3]] = 0

    }
    return registers
}

