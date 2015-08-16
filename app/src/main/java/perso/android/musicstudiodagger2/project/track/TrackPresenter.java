package perso.android.musicstudiodagger2.project.track;

import javax.inject.Inject;

/**
 * Created by Nicolas Telera on 16/08/2015.
 */
public class TrackPresenter {

    private final TrackFragment fragment;

    @Inject
    public TrackPresenter(final TrackFragment fragment) {
        this.fragment = fragment;
    }

}
