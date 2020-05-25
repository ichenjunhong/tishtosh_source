package com.p683ss.android.ugc.aweme.checkprofile;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.checkprofile.a */
final /* synthetic */ class C24789a implements OnClickListener {

    /* renamed from: a */
    private final CheckProfileActivity f65615a;

    C24789a(CheckProfileActivity checkProfileActivity) {
        this.f65615a = checkProfileActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65615a.mo50664a(view);
    }
}
