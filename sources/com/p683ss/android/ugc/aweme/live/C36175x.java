package com.p683ss.android.ugc.aweme.live;

import com.bytedance.android.live.base.p192sp.TTLiveSettingUtil;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.live.settings.C36165a;
import com.p683ss.android.ugc.aweme.live.settings.C36167c;

/* renamed from: com.ss.android.ugc.aweme.live.x */
public final class C36175x implements C36095h {
    /* renamed from: a */
    public final C36097j mo74816a() {
        return C36165a.f92604a;
    }

    /* renamed from: a */
    public final void mo74817a(C36167c cVar) {
        if (cVar != null && cVar.status_code == 0) {
            C18085o oVar = cVar.f92607a;
            if (oVar != null) {
                TTLiveSettingUtil.updateSettings(C11010c.m22280a(), oVar);
            }
        }
    }
}
