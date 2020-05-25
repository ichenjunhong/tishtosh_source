package com.p683ss.android.ugc.aweme.main;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.language.C35837h.C35838a;

/* renamed from: com.ss.android.ugc.aweme.main.ax */
final /* synthetic */ class C36509ax implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f93579a;

    /* renamed from: b */
    private final TextView f93580b;

    C36509ax(MainFragment mainFragment, TextView textView) {
        this.f93579a = mainFragment;
        this.f93580b = textView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        MainFragment mainFragment = this.f93579a;
        C35837h.m80975a((Activity) mainFragment.getActivity(), C35837h.m80980e(), (C35838a) new C36523bd(mainFragment, this.f93580b));
    }
}
