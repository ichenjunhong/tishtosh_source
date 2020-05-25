package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.setting.C41626j;
import com.ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ah */
final /* synthetic */ class C44970ah implements OnClickListener {

    /* renamed from: a */
    private final C44969ag f113898a;

    C44970ah(C44969ag agVar) {
        this.f113898a = agVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C44969ag agVar = this.f113898a;
        if (agVar.f113896c == null || agVar.f113896c.f105499o != C41626j.f105361d) {
            agVar.f113894a.setChecked(!agVar.f113894a.mo19040c());
            if (agVar.f113895b != null && agVar.f113894a != null) {
                agVar.f113895b.put("to_status", agVar.f113894a.mo19040c() ? "off" : "on");
                C26890h.m65011a("disable_comment", (Map<String, String>) agVar.f113895b);
                return;
            }
            return;
        }
        C10691a.m21551c(agVar.f113894a.getContext(), agVar.f113894a.getContext().getString(R.string.hq)).mo19066a();
    }
}
