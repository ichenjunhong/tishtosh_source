package com.p683ss.android.ugc.aweme.photomovie;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.services.photomovie.PhotoMovieServiceLoadCallback;

/* renamed from: com.ss.android.ugc.aweme.photomovie.o */
final /* synthetic */ class C38813o implements OnClickListener {

    /* renamed from: a */
    private final C38805m f98778a;

    C38813o(C38805m mVar) {
        this.f98778a = mVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C38805m mVar = this.f98778a;
        C39618d.m88208a(mVar.getActivity(), "from_publish_thumb_click", new PhotoMovieServiceLoadCallback() {
            public final void onPhotoMovieServiceLoadFailed(int i, String str) {
            }

            public final void onPhotoMovieServiceLoadSuccess(IPhotoMovieService iPhotoMovieService) {
                iPhotoMovieService.startPhotoMoviePreviewActivity(C38805m.this.getActivity(), C38805m.this.f98752h, C38805m.this.f98745a, "edit_page");
            }
        });
    }
}
