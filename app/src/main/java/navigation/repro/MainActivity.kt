package navigation.repro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.FragmentActivity
import navigation.repro.ui.theme.NavigationReproTheme

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main) // doesn't work on FragmentTwo
        // setContent { ExperimentalAnimationNav() } // works
        // setContent { BasicNav() } // works
        // supportFragmentManager.beginTransaction().add(android.R.id.content, FragmentTwo(), "fragment_two").commitNow() // works
    }
}