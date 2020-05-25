package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a;

import android.content.Context;
import android.content.Intent;
import android.support.p030v4.content.C0732g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.StrangerListActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.h */
public final class C34595h extends C34597i {
    /* renamed from: b */
    public final int mo72634b() {
        return 2;
    }

    public final String bm_() {
        return "stranger_1";
    }

    /* renamed from: a */
    public final C35457c mo72633a() {
        return new C35457c() {
            /* renamed from: a */
            public final void mo72636a(Context context, C35456b bVar, int i) {
                if (i == 1) {
                    context.startActivity(new Intent(context, StrangerListActivity.class));
                    C0732g.m2130a(C11010c.m22280a()).mo2404a(new Intent("message_stranger_mark_read_action"));
                    C35190af.m79442a();
                    C26890h.onEvent(MobClick.obtain().setEventName("message_click").setLabelName("stranger").setValue(null));
                }
            }
        };
    }

    /* renamed from: a */
    public static C34595h m78547a(C34597i iVar) {
        C34595h hVar = new C34595h();
        hVar.f91117h = iVar.f91117h;
        hVar.f91116g = iVar.f91116g;
        hVar.mo73751a(iVar.f91118i);
        return hVar;
    }
}
