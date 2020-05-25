package com.p683ss.android.ugc.aweme.photomovie;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;

/* renamed from: com.ss.android.ugc.aweme.photomovie.q */
final /* synthetic */ class C38815q implements OnClickListener {

    /* renamed from: a */
    private final C38805m f98781a;

    C38815q(C38805m mVar) {
        this.f98781a = mVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C38805m mVar = this.f98781a;
        if (!C39618d.f101183x.mo74282b()) {
            C39618d.f101183x.mo74277a((Fragment) mVar, "photo_movie_post_page", "click_post", (Bundle) null, (C39528a) new C39528a() {
                /* renamed from: b */
                public final void mo64372b() {
                }

                /* renamed from: a */
                public final void mo64371a() {
                    if (C39618d.f101152P.mo83103a(C40790a.EnableAutoProcessAfterLogin)) {
                        C38805m.this.mo78778b();
                    }
                }
            });
        } else {
            mVar.mo78778b();
        }
    }
}
