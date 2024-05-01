package net.lightglitch.carStatsViewer.utils

import android.app.Activity
import net.lightglitch.carStatsViewer.CarStatsViewer
import net.lightglitch.carStatsViewer.R

fun setContentViewAndTheme(context: Activity, resId: Int) {
    if (CarStatsViewer.appPreferences.colorTheme > 0) context.setTheme(R.style.ColorTestTheme)
    context.setContentView(resId)
}