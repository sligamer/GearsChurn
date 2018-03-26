package com.lab55.sligamer.gearschurn

/**
 * Created by Justin Freres on 3/24/2018.
 * Lab 5-5 Gears Churn Application
 * Plugin Support with kotlin_version = '1.2.21'
 */
class Gear {

    private var mStartDegree: Int = 0
    private var mEndDegree: Int = 0


    constructor()
    {
        mStartDegree = 0
        mEndDegree = 0
    }

    fun setStartDegree(startDegree: Int)
    {
        mStartDegree = startDegree
    }

    fun getStartDegree(): Int {
        return mStartDegree
    }

    fun setEndDegree(endDegree: Int)
    {
        mEndDegree = endDegree
    }

    fun getEndDegree(): Int {
        return mEndDegree
    }

}