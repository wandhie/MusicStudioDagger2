package perso.android.musicstudiodagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Nicolas Telera on 15/08/2015.
 */
public abstract class MusicStudioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent(MusicStudioApplication.get(this).getDagger2Component());
    }

    protected void setupComponent(MusicStudioComponent musicStudioComponent) {

    }
}
