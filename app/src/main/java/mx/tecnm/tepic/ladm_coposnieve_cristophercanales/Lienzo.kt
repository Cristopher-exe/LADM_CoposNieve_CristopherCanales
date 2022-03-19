package mx.tecnm.tepic.ladm_coposnieve_cristophercanales

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*


class Lienzo(este:MainActivity): View(este) {
    var este = este

    val copos = Array<Copos>(30,{Copos(this)})

    val corutina = GlobalScope.launch {
        while(true) {
            este.runOnUiThread {
                invalidate()
            }
            delay(20L)
        }
    }


    override fun onDraw(c: Canvas){
        super.onDraw(c);
        este.setTitle("Copos de Nieve")
        var p = Paint()

        for (cop in copos){
            cop.mover()
            cop.pintar(c)
        }

    }
}