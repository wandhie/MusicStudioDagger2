package perso.android.musicstudiodagger2.project;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import perso.android.musicstudiodagger2.MusicStudioActivity;
import perso.android.musicstudiodagger2.MusicStudioComponent;
import perso.android.musicstudiodagger2.R;
import perso.android.musicstudiodagger2.project.track.TrackFragment;

/**
 * Created by Nicolas Telera on 15/08/2015.
 *
 */
public class ProjectActivity extends MusicStudioActivity {

    /***********************************************************************************************
     * ATTRIBUTES
     ***********************************************************************************************/

    /***********************************************************************************************
     * LIFECYCLE
     ***********************************************************************************************/

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        ButterKnife.inject(this);
    }

    @Override
    protected void setupComponent(MusicStudioComponent musicStudioComponent) {
        DaggerProjectComponent.builder()
                .musicStudioComponent(musicStudioComponent)
                .projectModule(new ProjectModule(this))
                .build()
                .inject(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_music_studio, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_add_track:
                addTrack();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    /***********************************************************************************************
     * PRIVATE METHODS
     ***********************************************************************************************/

    private void addTrack() {
        TrackFragment fragment = new TrackFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.project_block_tracks, fragment);
        fragmentTransaction.commit();
    }
}
