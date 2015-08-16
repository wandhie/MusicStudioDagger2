package perso.android.musicstudiodagger2;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import perso.android.musicstudiodagger2.project.ProjectActivity;
import perso.android.musicstudiodagger2.project.track.TrackFragment;

/**
 * Created by Nicolas Telera on 15/08/2015.
 */
@Singleton
@Component(
        modules = {
                MusicStudioModule.class,
        }
)
public interface MusicStudioComponent {
    void inject(Application application);
    void inject(ProjectActivity activity);
}
