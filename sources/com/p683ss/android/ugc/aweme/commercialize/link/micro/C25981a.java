package com.p683ss.android.ugc.aweme.commercialize.link.micro;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.link.video.C25982a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.micro.a */
final class C25981a extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    private C25982a f68574a;

    /* renamed from: a */
    public final void mo53341a() {
        if (this.f68574a != null) {
            this.f68574a.mo53092a();
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f68574a != null) {
            this.f68574a.mo53093b();
        }
    }
}
