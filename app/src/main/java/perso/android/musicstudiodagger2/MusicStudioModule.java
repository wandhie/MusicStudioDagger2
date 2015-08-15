package perso.android.musicstudiodagger2;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nicolas on 15/08/2015.
 */
@Module
final class MusicStudioModule {

    private final MusicStudioApplication app;

    public MusicStudioModule(final MusicStudioApplication app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Application providesApplication() {
        return app;
    }

}
