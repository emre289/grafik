package com.emre.grafik

import android.graphics.Color
import android.graphics.Color.green
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.size
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setPieChart()

        }

    fun setPieChart()
    {

        // xvalues

        val xvalues = ArrayList<String >()
        xvalues.add("ISI")
        xvalues.add("NEM")
        xvalues.add("PİL DURUMU")
        xvalues.add("BÖCEK SAYISI")
        xvalues.add("TOPRAK DURUMU")



        // yvalues
        val yvalues =ArrayList<Float>()
        yvalues.add(22.5f)
        yvalues.add(38.4f)
        yvalues.add(8.25f)
        yvalues.add(10.21f)
        yvalues.add(6.74f)


        val piechartentry =ArrayList<Entry>()
        for ((i,item) in yvalues.withIndex())
        {
            piechartentry.add(Entry(item,i))


        }


        //colar

        val colors=ArrayList<Int>()
        colors.add(Color.RED)
        colors.add(Color.GREEN)
        colors.add(Color.BLUE)
        colors.add(Color.MAGENTA)
        colors.add(Color.YELLOW)



        // fill the chart
        val piedataset = PieDataSet(piechartentry," GRAFİK")

        piedataset.colors=colors
        piedataset.sliceSpace=3f
        val data = PieData( xvalues,piedataset)
        piechart.data = data
        piechart.holeRadius = 5f

        piechart.setBackgroundColor(resources.getColor(R.color.purple_200))

        piechart.setDescription("AKILLI SERA SİSTEMİ")
        piechart.animateY(3000)

        val legend:Legend=piechart.legend
        legend.position=Legend.LegendPosition.LEFT_OF_CHART
        legend.textColor=resources.getColor(R.color.white)


    }

}








