package perso.android.musicstudiodagger2.project.track;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import perso.android.musicstudiodagger2.MusicStudioComponent;
import perso.android.musicstudiodagger2.R;

/**
 * Created by Nicolas Telera on 16/08/2015.
 */
public class TrackFragment extends Fragment {

    /***********************************************************************************************
     * ATTRIBUTES
     ***********************************************************************************************/

    @Inject
    TrackPresenter presenter;

    @InjectView(R.id.track_button_delete)
    Button buttonDeleteTrack;

    /***********************************************************************************************
     * LIFECYCLE
     ***********************************************************************************************/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View toReturn = inflater.inflate(R.layout.fragment_track, container, false);
        ButterKnife.inject(this, toReturn);
        return toReturn;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    protected void setupComponent(MusicStudioComponent musicStudioComponent) {
        DaggerTrackComponent.builder()
                .musicStudioComponent(musicStudioComponent)
                .trackModule(new TrackModule(this))
                .build()
                .inject(this);
    }

    /***********************************************************************************************
     * CLICK CALLBACKS
     ***********************************************************************************************/

    @OnClick(R.id.track_button_delete)
    void deleteTrack() {
        if (getActivity() != null) {
            getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
        }
    }
}
