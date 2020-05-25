package com.p683ss.android.ugc.aweme.p2100q.p2101a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23248r;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;

/* renamed from: com.ss.android.ugc.aweme.q.a.c */
final /* synthetic */ class C40912c implements OnClickListener {

    /* renamed from: a */
    private final C40909a f104121a;

    C40912c(C40909a aVar) {
        this.f104121a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40909a aVar = this.f104121a;
        if (aVar.f70665k != null && ((Aweme) aVar.f70665k).getAuthor() != null) {
            C26890h.onEvent(MobClick.obtain().setEventName("head").setLabelName(aVar.f104110a).setValue(((Aweme) aVar.f70665k).getAuthorUid()).setJsonObject(new C23088c().mo47824a("group_id", ((Aweme) aVar.f70665k).getAid()).mo47824a("to_user_id", C23198ae.m56846a((Aweme) aVar.f70665k)).mo47824a("author_id", C23198ae.m56846a((Aweme) aVar.f70665k)).mo47824a("request_id", C23198ae.m56847a((Aweme) aVar.f70665k, 12)).mo47824a("city_info", C23198ae.m56845a()).mo47824a("distance_info", C23198ae.m56869i((Aweme) aVar.f70665k)).mo47824a("poi_id", C23198ae.m56861e((Aweme) aVar.f70665k)).mo47824a("poi_type", C23198ae.m56867h((Aweme) aVar.f70665k)).mo47824a("enterMethod", "click_head").mo47825b()));
            ((C23249s) new C23249s().mo48136c((Aweme) aVar.f70665k, 12).mo48137c(aVar.f104110a).mo48144s(((Aweme) aVar.f70665k).getAuthorUid()).mo47941a("click_head")).mo48076e();
            new C23248r().mo48132a(((Aweme) aVar.f70665k).getAid()).mo48134c(aVar.f104110a).mo48133b(((Aweme) aVar.f70665k).getAuthorUid()).mo48076e();
            C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(C23198ae.m56846a((Aweme) aVar.f70665k)).setJsonObject(new C23088c().mo47824a("group_id", ((Aweme) aVar.f70665k).getAid()).mo47824a("request_id", C23198ae.m56847a((Aweme) aVar.f70665k, 12)).mo47824a("is_photo", ((Aweme) aVar.f70665k).isImage() ? "1" : "0").mo47824a("enter_from", aVar.f104110a).mo47825b()));
            C23794bh.m58403q().mo77206a(view.getContext(), ((Aweme) aVar.f70665k).getAuthor());
        }
    }
}
