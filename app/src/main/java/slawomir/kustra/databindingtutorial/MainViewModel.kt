package slawomir.kustra.databindingtutorial

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.view.View
import slawomir.kustra.databindingtutorial.utils.Numbers

class MainViewModel : ViewModel() {

    private var equation = MutableLiveData<String>()

    init {
        equation.value = ""
    }

    internal fun expandEquation(v: View) {
        when (v.id) {
            R.id.one -> equation.value = formatEquation(Numbers.ONE)
            R.id.two -> equation.value = formatEquation(Numbers.TWO)
            R.id.three -> equation.value = formatEquation(Numbers.THREE)
            R.id.four -> equation.value = formatEquation(Numbers.FOUR)
            R.id.five -> equation.value = formatEquation(Numbers.FIVE)
            R.id.six -> equation.value = formatEquation(Numbers.SIX)
            R.id.seven -> equation.value = formatEquation(Numbers.SEVEN)
            R.id.eight -> equation.value = formatEquation(Numbers.EIGHT)
            R.id.nine -> equation.value = formatEquation(Numbers.NINE)
        }
    }

    private fun formatEquation(value: String): String {
        if (value.contains(".") && value == ".")
            return equation.value ?: value
        return "${equation.value}$value"
    }
}