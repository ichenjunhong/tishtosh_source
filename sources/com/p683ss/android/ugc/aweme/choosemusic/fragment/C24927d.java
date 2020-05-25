package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.d */
final /* synthetic */ class C24927d implements OnClickListener {

    /* renamed from: a */
    private final C24923c f66015a;

    C24927d(C24923c cVar) {
        this.f66015a = cVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f66015a.dismiss();
    }
}
