package net.mullvad.mullvadvpn

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import org.joda.time.DateTime

class ProblemReportFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.problem_report, container, false)

        view.findViewById<View>(R.id.back).setOnClickListener {
            activity?.onBackPressed()
        }

        return view
    }
}
