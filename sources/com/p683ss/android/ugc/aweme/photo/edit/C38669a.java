package com.p683ss.android.ugc.aweme.photo.edit;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.photo.edit.a */
final /* synthetic */ class C38669a implements OnClickListener {

    /* renamed from: a */
    private final PhotoEditActivity f98356a;

    C38669a(PhotoEditActivity photoEditActivity) {
        this.f98356a = photoEditActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f98356a.mo78589a(view);
    }
}
