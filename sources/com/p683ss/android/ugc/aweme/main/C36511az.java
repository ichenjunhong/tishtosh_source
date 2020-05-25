package com.p683ss.android.ugc.aweme.main;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.christmas.C31361b;
import com.p683ss.android.ugc.aweme.p684l.C10912c;

/* renamed from: com.ss.android.ugc.aweme.main.az */
final /* synthetic */ class C36511az implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f93582a;

    C36511az(MainFragment mainFragment) {
        this.f93582a = mainFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        Context context = this.f93582a.getContext();
        C10912c e = C31357a.m73104e();
        if (e != null && !TextUtils.isEmpty(e.f29302c)) {
            C31361b.m73110a(context, e.f29302c);
        }
        C26890h.m65011a("enter_activity_page", new C23089d().mo47829a("enter_from", C22858c.f61207c).f61491a);
        C26890h.m65011a("xmas_plugin_click", new C23089d().mo47829a("enter_from", C22858c.f61207c).f61491a);
    }
}
