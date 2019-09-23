package com.example.protocolprototype

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_protocol.*
import android.util.Log.d

class Protocol : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_protocol)

        var absoluteArrow = 0
        var seriesNo = 0
        var Series = Array(3) {0}
        var Total = Array(60) {0}

        fun writeTotalPoint() {
            d("Guava", "the calculateTotal function has been called, SeriesNo = " + seriesNo)
            when (seriesNo) {
                0  -> Total1.text  = Total.sum().toString()
                1  -> Total2.text  = Total.sum().toString()
                2  -> Total3.text  = Total.sum().toString()
                3  -> Total4.text  = Total.sum().toString()
                4  -> Total5.text  = Total.sum().toString()
                5  -> Total6.text  = Total.sum().toString()
                6  -> Total7.text  = Total.sum().toString()
                7  -> Total8.text  = Total.sum().toString()
                8  -> Total9.text  = Total.sum().toString()
                9  -> Total10.text = Total.sum().toString()
                10 -> Total11.text = Total.sum().toString()
                11 -> Total12.text = Total.sum().toString()
                12 -> Total13.text = Total.sum().toString()
                13 -> Total14.text = Total.sum().toString()
                14 -> Total15.text = Total.sum().toString()
                15 -> Total16.text = Total.sum().toString()
                16 -> Total17.text = Total.sum().toString()
                17 -> Total18.text = Total.sum().toString()
                18 -> Total19.text = Total.sum().toString()
                19 -> Total20.text = Total.sum().toString()
            }
        }

        fun writeSeriesPoint() {
            d("Guava", "the calculatePoint function has been called, SeriesNo = " + seriesNo)
            for (arrow in 0..2) {
                Series[arrow] = Total[seriesNo * 3 + arrow]
            }

            when (seriesNo) {
                0  -> Points1.text  = Series.sum().toString()
                1  -> Points2.text  = Series.sum().toString()
                2  -> Points3.text  = Series.sum().toString()
                3  -> Points4.text  = Series.sum().toString()
                4  -> Points5.text  = Series.sum().toString()
                5  -> Points6.text  = Series.sum().toString()
                6  -> Points7.text  = Series.sum().toString()
                7  -> Points8.text  = Series.sum().toString()
                8  -> Points9.text  = Series.sum().toString()
                9  -> Points10.text = Series.sum().toString()
                10 -> Points11.text = Series.sum().toString()
                11 -> Points12.text = Series.sum().toString()
                12 -> Points13.text = Series.sum().toString()
                13 -> Points14.text = Series.sum().toString()
                14 -> Points15.text = Series.sum().toString()
                15 -> Points16.text = Series.sum().toString()
                16 -> Points17.text = Series.sum().toString()
                17 -> Points18.text = Series.sum().toString()
                18 -> Points19.text = Series.sum().toString()
                19 -> Points20.text = Series.sum().toString()
            }
        }

        fun writeArrowPoint(Point: String, Arrow: Int) {
            d("Guava", "The writeArrowPoint function has been accessed with parameters: " + Point)

            when (Arrow) {
                0  -> Series1Arrow1.text = Point
                1  -> Series1Arrow2.text = Point
                2  -> Series1Arrow3.text = Point

                3  -> Series2Arrow1.text = Point
                4  -> Series2Arrow2.text = Point
                5  -> Series2Arrow3.text = Point

                6  -> Series3Arrow1.text = Point
                7  -> Series3Arrow2.text = Point
                8  -> Series3Arrow3.text = Point

                9 -> Series4Arrow1.text = Point
                10 -> Series4Arrow2.text = Point
                11 -> Series4Arrow3.text = Point

                12 -> Series5Arrow1.text = Point
                13 -> Series5Arrow2.text = Point
                14 -> Series5Arrow3.text = Point

                15 -> Series6Arrow1.text = Point
                16 -> Series6Arrow2.text = Point
                17 -> Series6Arrow3.text = Point

                18 -> Series7Arrow1.text = Point
                19 -> Series7Arrow2.text = Point
                20 -> Series7Arrow3.text = Point

                21 -> Series8Arrow1.text = Point
                22 -> Series8Arrow2.text = Point
                23 -> Series8Arrow3.text = Point

                24 -> Series9Arrow1.text = Point
                25 -> Series9Arrow2.text = Point
                26 -> Series9Arrow3.text = Point

                27 -> Series10Arrow1.text = Point
                28 -> Series10Arrow2.text = Point
                29 -> Series10Arrow3.text = Point

                30 -> Series11Arrow1.text = Point
                31 -> Series11Arrow2.text = Point
                32 -> Series11Arrow3.text = Point

                33 -> Series12Arrow1.text = Point
                34 -> Series12Arrow2.text = Point
                35 -> Series12Arrow3.text = Point

                36 -> Series13Arrow1.text = Point
                37 -> Series13Arrow2.text = Point
                38 -> Series13Arrow3.text = Point

                39 -> Series14Arrow1.text = Point
                40 -> Series14Arrow2.text = Point
                41 -> Series14Arrow3.text = Point

                42 -> Series15Arrow1.text = Point
                43 -> Series15Arrow2.text = Point
                44 -> Series15Arrow3.text = Point

                45 -> Series16Arrow1.text = Point
                46 -> Series16Arrow2.text = Point
                47 -> Series16Arrow3.text = Point

                48 -> Series17Arrow1.text = Point
                49 -> Series17Arrow2.text = Point
                50 -> Series17Arrow3.text = Point

                51 -> Series18Arrow1.text = Point
                52 -> Series18Arrow2.text = Point
                53 -> Series18Arrow3.text = Point

                54 -> Series19Arrow1.text = Point
                55 -> Series19Arrow2.text = Point
                56 -> Series19Arrow3.text = Point

                57 -> Series20Arrow1.text = Point
                58 -> Series20Arrow2.text = Point
                59 -> Series20Arrow3.text = Point
            }

        }

        fun determineSeries(Arrow: Int) {
            seriesNo = Arrow / 3
        }

        One.setOnClickListener {
            d("Guava", "The 'One' button has been pressed.")
            writeArrowPoint("1", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 1
            writeSeriesPoint()
            writeTotalPoint()
        }
        Two.setOnClickListener {
            d("Guava", "The 'Two' button has been pressed.")
            writeArrowPoint("2", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 2
            writeSeriesPoint()
            writeTotalPoint()
        }
        Three.setOnClickListener {
            d("Guava", "The 'Three' button has been pressed.")
            writeArrowPoint("3", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 3
            writeSeriesPoint()
            writeTotalPoint()
        }
        Four.setOnClickListener {
            d("Guava", "The 'Four' button has been pressed.")
            writeArrowPoint("4", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 4
            writeSeriesPoint()
            writeTotalPoint()
        }
        Five.setOnClickListener {
            d("Guava", "The 'Five' button has been pressed.")
            writeArrowPoint("5", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 5
            writeSeriesPoint()
            writeTotalPoint()
        }
        Six.setOnClickListener {
            d("Guava", "The 'Six' button has been pressed.")
            writeArrowPoint("6", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 6
            writeSeriesPoint()
            writeTotalPoint()
        }
        Seven.setOnClickListener {
            d("Guava", "The 'Seven' button has been pressed.")
            writeArrowPoint("7", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 7
            writeSeriesPoint()
            writeTotalPoint()
        }
        Eight.setOnClickListener {
            d("Guava", "The 'Eight' button has been pressed.")
            writeArrowPoint("8", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 8
            writeSeriesPoint()
            writeTotalPoint()
        }
        Nine.setOnClickListener {
            d("Guava", "The 'Nine' button has been pressed.")
            writeArrowPoint("9", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 9
            writeSeriesPoint()
            writeTotalPoint()
        }
        Ten.setOnClickListener {
            d("Guava", "The 'Ten' button has been pressed.")
            writeArrowPoint("10", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 10
            writeSeriesPoint()
            writeTotalPoint()
        }
        Cross.setOnClickListener {
            d("Guava", "The 'Cross' button has been pressed.")
            writeArrowPoint("X", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 10
            writeSeriesPoint()
            writeTotalPoint()
        }
        Miss.setOnClickListener {
            d("Guava", "The 'Miss' button has been pressed.")
            writeArrowPoint("M", absoluteArrow)
            determineSeries(absoluteArrow)
            Total[absoluteArrow] = 0
            writeSeriesPoint()
            writeTotalPoint()
        }
        Next.setOnClickListener {
            d("Guava", "The 'Next' button has been pressed.")
            absoluteArrow += 1 % 59
            d("Guava", "Variable 'Arrow' is now: " + absoluteArrow)
        }
        Privious.setOnClickListener {
            d("Guava", "The 'Previous' button has been pressed.")
            if (absoluteArrow > 0) {
                absoluteArrow -= 1
            }
            d("Guava", "Variable 'Arrow' is now: " + absoluteArrow)
        }
        Clear.setOnClickListener {
            d("Guava", "The 'Clear' Button has been pressed.")
            for (Index in 0..59) {
                writeArrowPoint(" ", Index)
                Total[Index] = 0
                writeSeriesPoint()
                writeTotalPoint()
            }
        }
    }
}

