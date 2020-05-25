package com.p683ss.android.ugc.aweme.photomovie;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.photomovie.c */
final /* synthetic */ class C38745c implements OnClickListener {

    /* renamed from: a */
    private final PhotoMovieEditActivity f98570a;

    /* renamed from: b */
    private final PhotoMovieContext f98571b;

    C38745c(PhotoMovieEditActivity photoMovieEditActivity, PhotoMovieContext photoMovieContext) {
        this.f98570a = photoMovieEditActivity;
        this.f98571b = photoMovieContext;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PhotoMovieEditActivity photoMovieEditActivity = this.f98570a;
        PhotoMovieContext photoMovieContext = this.f98571b;
        C26890h.m65011a("click_modify_entrance", C23089d.m56640a().mo47829a("creation_id", photoMovieContext.creationId).mo47829a("shoot_way", photoMovieContext.mShootWay).mo47829a("enter_from", "video_edit_page").mo47829a("content_source", "upload").mo47829a("content_type", "slideshow").mo47829a("scene_id", "1004").f61491a);
        if (!photoMovieEditActivity.f98519d.mo78707a()) {
            photoMovieEditActivity.f98524i.mo78704b();
        }
    }
}
