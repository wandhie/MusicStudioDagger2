package perso.android.musicstudiodagger2.project.track;

import dagger.Component;
import perso.android.musicstudiodagger2.ActivityScope;
import perso.android.musicstudiodagger2.MusicStudioComponent;

/**
 * Created by Nicolas Telera on 16/08/2015.
 */
@ActivityScope
@Component(
        dependencies = MusicStudioComponent.class,
        modules = TrackModule.class
)
@SuppressWarnings("unused")
public interface TrackComponent {

    void inject(TrackFragment fragment);

    TrackPresenter getTrackPresenter();
}
