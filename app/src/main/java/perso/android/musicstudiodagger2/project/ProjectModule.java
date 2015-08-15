package perso.android.musicstudiodagger2.project;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nicolas on 15/08/2015.
 */
@Module
class ProjectModule {

    private final ProjectActivity activity;

    public ProjectModule(final ProjectActivity activity) {
        this.activity = activity;
    }

    @Provides
    public ProjectActivity providesMusicStudioActivity() {
        return activity;
    }
}
