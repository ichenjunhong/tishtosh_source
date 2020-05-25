package com.p683ss.android.ugc.aweme.services.photomovie;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.photomovie.IPhotoMovieService */
public interface IPhotoMovieService {
    public static final String EXTRA_DATA_PHOTO_MOVIE = "photo_movie_context";
    public static final String EXTRA_DATA_PHOTO_MOVIE_MUSIC_LIST = "photo_movie_context_music_list";
    public static final String EXTRA_VIDEO_PUBLISH_ARGS = "photo_movie_publish_args";

    void startPhotoMovieChooseCoverActivity(Activity activity, PhotoMovieContext photoMovieContext, int i);

    void startPhotoMovieEditActivity(Context context, PhotoMovieContext photoMovieContext, List<C42482c> list, String str, long j);

    void startPhotoMovieEditDraftActivity(Context context, C29059c cVar, List<MusicModel> list);

    void startPhotoMoviePreviewActivity(Activity activity, ImageView imageView, PhotoMovieContext photoMovieContext, String str);
}
