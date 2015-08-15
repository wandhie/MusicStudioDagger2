package perso.android.musicstudiodagger2;

import android.app.Application;
import android.content.Context;

/**
 * Created by nicolas on 15/08/2015.
 */
public class MusicStudioApplication extends Application {

    private MusicStudioComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDagger();
    }

    private void setupDagger() {
        component = DaggerMusicStudioComponent.builder()
                .musicStudioModule(new MusicStudioModule(this))
                .build();
        component.inject(this);
    }

    public MusicStudioComponent getDagger2Component() {
        return component;
    }

    public static MusicStudioApplication get(Context context) {
        return (MusicStudioApplication) context.getApplicationContext();
    }

}
