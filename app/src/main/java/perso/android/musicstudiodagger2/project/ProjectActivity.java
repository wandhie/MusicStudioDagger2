package perso.android.musicstudiodagger2.project;

import android.os.Bundle;

import butterknife.ButterKnife;
import perso.android.musicstudiodagger2.MusicStudioActivity;
import perso.android.musicstudiodagger2.MusicStudioComponent;
import perso.android.musicstudiodagger2.R;

/**
 * Created by nicolas on 15/08/2015.
 */
public class ProjectActivity extends MusicStudioActivity {

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
}
