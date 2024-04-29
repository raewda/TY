package com.example.tsitatyyarika.ui.theme

import com.example.tsitatyyarika.R

open class TY(
    val id: Int,
    val ts: Int
) {

    object one : TY(0, R.string.onetsitata)
    object two : TY(1, R.string.twotsitata)
    object three : TY(2, R.string.threetsiata)
    object four : TY(3, R.string.fourtsitata)
    object five : TY(4, R.string.fivetsitata)
    object six : TY(5, R.string.sixtsitata)
    object seven : TY(6, R.string.seventsitata)
    object eight : TY(7, R.string.eighttsitata)
    object nine : TY(8, R.string.ninetsitata)
    object ten : TY(9, R.string.tentsitata)
    object eleven : TY(10, R.string.eleventsitata)
    object twelve : TY(11, R.string.twelvetsitata)
    object thirteen : TY(12, R.string.thirteentsitata)
    object fourteen : TY(13, R.string.fourteentsitata)
    object fifteen : TY(14, R.string.fifteentsitata)
    object sixteen : TY(15, R.string.sixteentsitata)
    object seventeen : TY(16, R.string.seventeentsitata)
    object eighteen : TY(17, R.string.eighteentsitata)
    object nineteen : TY(18, R.string.nineteentsitata)
    object twenty : TY(19, R.string.twentytsitata)
    object twentyone : TY(20, R.string.twentyonetsitata)
    object twentytwo : TY(21, R.string.twentytwotsitata)
    object twentythree : TY(22, R.string.twentythreetsitata)
    object twentyfour : TY(23, R.string.twentyfourtsitata)
    object twentyfive : TY(24, R.string.twentyfivetsitata)
    object twentysix : TY(25, R.string.twentysixtsitata)
    object twentyseven : TY(26, R.string.twentyseventsitata)
    object twentyeight : TY(27, R.string.twentyeighttsitata)
    object twentynine : TY(28, R.string.twentyninetsitata)
    object thirty : TY(29, R.string.thirtytsitata)
    object thirtyone : TY(30, R.string.thirtyonetsitata)
    object thirtytwo : TY(31, R.string.thirtytwotsitata)
    object thirtythree : TY(32, R.string.thirtythreetsitata)
    object thirtyfour : TY(33, R.string.thirtyfourtsitata)
    object thirtyfive : TY(34, R.string.thirtyfivetsitata)
    object thirtysix : TY(35, R.string.thirtysixtsitata)
    object thirtyseven : TY(36, R.string.thirtyseventsitata)
    object thirtyeight : TY(37, R.string.thirtyeighttsitata)
    object thirtynine : TY(38, R.string.thirtyninetsitata)
    object forty : TY(39, R.string.fortytsitata)
    object fortyone : TY(40, R.string.fortyonetsitata)
    object fortytwo : TY(41, R.string.fortytwotsitata)
    object fortythree : TY(42, R.string.fortythreetsitata)
    object fortyfour : TY(43, R.string.fortyfourtsitata)
    object fortyfive : TY(44, R.string.fortyfivetsitata)
    object fortysix : TY(45, R.string.fortysixtsitata)
    object fortyseven : TY(46, R.string.fortyseventsitata)
    object fortyeight : TY(47, R.string.fortyeighttsitata)
    object fortynine : TY(48, R.string.fortyninetsitata)
    object fifty : TY(49, R.string.fiftytsitata)
    object fiftyone : TY(50, R.string.fiftyonetsitata)
    object fiftytwo : TY(51, R.string.fiftytwotsitata)
    object fiftythree : TY(52, R.string.fiftythreetsitata)
    object fiftyfour : TY(53, R.string.fiftyfourtsitata)
    object fiftyfive : TY(54, R.string.fiftyfivetsitata)
    object fiftysix : TY(55, R.string.fiftysixtsitata)
    object fiftyseven : TY(56, R.string.fiftyseventsitata)
    object fiftyeight : TY(57, R.string.fiftyeighttsitata)
    object fiftynine : TY(58, R.string.fiftyninetsitata)
    object sixty : TY(59, R.string.sixtytsitata)
    object sixtyone : TY(60, R.string.sixtyonetsitata)
    object sixtytwo : TY(61, R.string.sixtytwotsitata)
    object sixtythree : TY(62, R.string.sixtythreetsitata)







    companion object {
        fun getById(id: Int): TY {
            listOf(
                one, two, three, four, five, six, seven, eight, nine, ten, eleven,
                twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, 
                nineteen, twenty,  twentyone, twentytwo, twentythree, twentyfour, twentyfive,
                twentysix, twentyseven, twentyeight, twentynine, thirty, thirtyone,
                thirtytwo, thirtythree, thirtyfour, thirtyfive, thirtysix, thirtyseven,
                thirtyeight, thirtynine, forty, fortyone, fortytwo, fortythree, fortyfour,
                fortyfive, fortysix, fortyseven, fortyeight, fortynine, fifty, fiftyone,
                fiftytwo, fiftythree, fiftyfour, fiftyfive, fiftysix, fiftyseven, fiftyeight,
                fiftynine, sixty, sixtyone, sixtytwo, sixtythree
            ).forEach {
                if (it.id == id) return it
            }
            return one
        }
    }

}