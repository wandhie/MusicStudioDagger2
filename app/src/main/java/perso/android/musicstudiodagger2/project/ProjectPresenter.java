package perso.android.musicstudiodagger2.project;

import javax.inject.Inject;

/**
 * Created by Nicolas Telera on 15/08/2015.
 */
public class ProjectPresenter {

    private final ProjectActivity activity;

    @Inject
    public ProjectPresenter(final ProjectActivity activity) {
        this.activity = activity;
    }
}
