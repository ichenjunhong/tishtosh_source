package com.p683ss.android.ugc.aweme.feed.guide;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.login.C27965f;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.b */
final /* synthetic */ class C30278b implements OnClickListener {

    /* renamed from: a */
    private final EmptyGuideV2 f79115a;

    C30278b(EmptyGuideV2 emptyGuideV2) {
        this.f79115a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EmptyGuideV2 emptyGuideV2 = this.f79115a;
        C27965f.m66721a(emptyGuideV2.f79064e, "homepage_follow", "click_follow_tab", (Bundle) null, (C23505g) new C23505g() {
            /* renamed from: a */
            public final void mo46280a(Bundle bundle) {
            }

            /* renamed from: a */
            public final void mo46279a() {
                EmptyGuideV2.this.mo60636a(true);
            }
        });
    }
}
