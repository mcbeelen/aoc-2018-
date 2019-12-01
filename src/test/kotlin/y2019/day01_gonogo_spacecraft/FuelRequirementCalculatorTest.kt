package y2019.day01_gonogo_spacecraft

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class FuelRequirementCalculatorTest {

    @Test
    fun `examples from the instructions`() {

        assertThat(fuelRequired(12), equalTo(2))
        assertThat(fuelRequired(14), equalTo(2))
        assertThat(fuelRequired(1969), equalTo(654))
        assertThat(fuelRequired(100756), equalTo(33583))
    }

    private fun fuelRequired(mass: Int): Int {
        return mass / 3 - 2

    }
}

