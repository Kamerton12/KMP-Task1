package maxim.drozd.maximdrozd_task1.welcome_pages

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class WelcomeActivityFragmentPageAdaptor(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            1 -> WelcomePageSecondFragment()
            4 -> WelcomePageThirdFragment()
            2 -> WelcomePageFifthFragment()
            3 -> WelcomePageSixFragment()
            5 -> WelcomePageFourthFragment()
            else -> WelcomePageFirstFragment()
        }
    }

    override fun getCount(): Int = 6
}