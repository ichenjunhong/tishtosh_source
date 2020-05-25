package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.services.C23165l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.w */
final /* synthetic */ class C24950w implements OnClickListener {

    /* renamed from: a */
    private final C24948v f66048a;

    C24950w(C24948v vVar) {
        this.f66048a = vVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C24948v vVar = this.f66048a;
        if (C37249a.m83514e() != 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "change_music_page");
            hashMap.put("category_name", vVar.f66040l);
            C26890h.m65011a("click_ad_sticker", (Map<String, String>) hashMap);
            if (!C23165l.m56764c().mo47880a(vVar.getContext(), vVar.f66041m.f69027b.f69041c, false)) {
                C23165l.m56764c().mo47879a(vVar.getContext(), vVar.f66041m.f69027b.f69042d, vVar.f66041m.f69027b.f69043e);
            }
        }
    }
}
