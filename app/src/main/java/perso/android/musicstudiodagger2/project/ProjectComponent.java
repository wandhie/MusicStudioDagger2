package perso.android.musicstudiodagger2.project;

import dagger.Component;
import perso.android.musicstudiodagger2.ActivityScope;
import perso.android.musicstudiodagger2.MusicStudioComponent;

/**
 * Created by Nicolas Telera on 15/08/2015.
 */
@ActivityScope
@Component(
        dependencies = MusicStudioComponent.class,
        modules = ProjectModule.class
)
@SuppressWarnings("ununsed")
public interface ProjectComponent {

    void inject(ProjectActivity activity);

    ProjectPresenter getMusicStudioPresenter();
}
