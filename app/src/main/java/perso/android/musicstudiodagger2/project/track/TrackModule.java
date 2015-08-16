package perso.android.musicstudiodagger2.project.track;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nicolas Telera on 16/08/2015.
 */
@Module
public class TrackModule {

    private final TrackFragment fragment;

    public TrackModule(final TrackFragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    public TrackFragment providesTrackFragment() {
        return fragment;
    }
}
