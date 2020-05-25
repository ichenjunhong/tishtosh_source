package com.p683ss.android.ugc.aweme.photomovie;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule;
import com.p683ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule.C38760a;

/* renamed from: com.ss.android.ugc.aweme.photomovie.e */
final /* synthetic */ class C38747e implements OnClickListener {

    /* renamed from: a */
    private final PhotoMovieEditActivity f98574a;

    C38747e(PhotoMovieEditActivity photoMovieEditActivity) {
        this.f98574a = photoMovieEditActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PhotoMovieEditActivity photoMovieEditActivity = this.f98574a;
        if (photoMovieEditActivity.f98522g == null) {
            PhotoMovieChangeModule photoMovieChangeModule = new PhotoMovieChangeModule(photoMovieEditActivity, photoMovieEditActivity, photoMovieEditActivity.f98518c, photoMovieEditActivity.f98520e, photoMovieEditActivity.f98519d);
            photoMovieEditActivity.f98522g = photoMovieChangeModule;
            photoMovieEditActivity.f98522g.f98594h = new C38760a() {
                /* renamed from: a */
                public final void mo78680a(int i, int i2) {
                    PhotoMovieEditActivity.this.mo78674a(i);
                }
            };
        }
        photoMovieEditActivity.f98519d.mo78706a(photoMovieEditActivity.f98522g);
    }
}
