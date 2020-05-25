package com.p683ss.android.ugc.aweme.photomovie;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule;

/* renamed from: com.ss.android.ugc.aweme.photomovie.d */
final /* synthetic */ class C38746d implements OnClickListener {

    /* renamed from: a */
    private final PhotoMovieEditActivity f98572a;

    /* renamed from: b */
    private final PhotoMovieContext f98573b;

    C38746d(PhotoMovieEditActivity photoMovieEditActivity, PhotoMovieContext photoMovieContext) {
        this.f98572a = photoMovieEditActivity;
        this.f98573b = photoMovieContext;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PhotoMovieEditActivity photoMovieEditActivity = this.f98572a;
        PhotoMovieContext photoMovieContext = this.f98573b;
        if (photoMovieEditActivity.f98523h == null) {
            PhotoMovieMusicModule photoMovieMusicModule = new PhotoMovieMusicModule(photoMovieEditActivity, photoMovieEditActivity.f98518c, photoMovieEditActivity.f98520e, photoMovieEditActivity.f98519d, photoMovieEditActivity, photoMovieContext.mShootWay, photoMovieContext.creationId);
            photoMovieEditActivity.f98523h = photoMovieMusicModule;
        }
        photoMovieEditActivity.f98519d.mo78706a(photoMovieEditActivity.f98523h);
    }
}
