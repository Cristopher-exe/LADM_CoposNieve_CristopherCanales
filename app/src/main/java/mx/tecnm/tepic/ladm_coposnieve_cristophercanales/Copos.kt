package mx.tecnm.tepic.ladm_coposnieve_cristophercanales

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import java.util.*

 class Copos(l:Lienzo) {
    val l = l
    var x = 0f
    var y = 0f
    var movX = 0f
    var movY = 0f
    var color = Color.WHITE


    init {

        y = rand(2400)
        movX = rand(8)+1
        movY = rand(8)+1

        color = Color.rgb(234,236,238)
    }

    private fun rand(hasta:Int) : Float {
        return Random().nextInt(hasta).toFloat()
    }

    fun mover(){
        x = x+rand(13)+2
        //y = y+1

    }


    fun pintar(c : Canvas){
        var p = Paint()
        p.color = color

        c.drawCircle(x,y,10f,p)

        //Calle
        p.color = Color.rgb(78,59,49)
        c.drawRect(800f,0f,1090f,1900f,p)

        //fachada
        p.color = Color.rgb(155,89,182)
        c.drawRect(900f,100f,500f,600f,p)

        //puerta
        p.color = Color.rgb(24,24,24)
        c.drawRect(900f,300f,700f,400f,p)
        //ventanas
        c.drawRect(800f,450f,700f,550f,p)
        c.drawRect(800f,150f,700f,250f,p)

        //techo
        p.color = Color.rgb(110,44,0)
        c.drawRect(600f,50f,400f,650f,p)

        //chimenea
        p.color = Color.rgb(50,44,90)
        c.drawRect(510f,500f,310f,590f,p)

        //humo
        p.color = Color.rgb(86,101,115)
        c.drawOval(200f,490f,280f,600f,p)
        c.drawOval(150f,400f,240f,510f,p)
        c.drawOval(120f,320f,220f,420f,p)

        //ARBOLES
        //TRONCO
        p.color = Color.rgb(205,97,85)
        c.drawRect(900f,800f,600f,900f,p)
        c.drawRect(900f,1300f,600f,1400f,p)

        //HOJAS
        p.color = Color.rgb(30,132,73)
        c.drawOval(500f,700f,700f,1000f,p)
        c.drawOval(400f,700f,600f,1000f,p)
        //SEGUNDO ARBOL HOJAS
        c.drawOval(500f,1200f,700f,1500f,p)
        c.drawOval(400f,1200f,600f,1500f,p)

        //LUNA
        p.color = Color.rgb(204,209,209)
        c.drawOval(50f,1550f,300f,1790f,p)
    }

 }