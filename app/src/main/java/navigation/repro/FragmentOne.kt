package navigation.repro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentOne : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LinearLayout(requireContext()).apply {
            addView(Button(requireContext()).apply {
                text = "Open"
                setOnClickListener {
                    findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)
                }
            })
        }
    }
}