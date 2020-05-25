package com.p683ss.android.ugc.aweme.miniapp.impl;

import com.p683ss.android.ugc.aweme.miniapp_api.model.p1961a.C36952a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1961a.C36952a.C36953a;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36935a;
import com.p683ss.android.ugc.aweme.p1426bb.p1427a.C23764a;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.g */
public class C36894g {

    /* renamed from: a */
    Map<String, C36935a> f94274a;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.g$a */
    static class C36896a {

        /* renamed from: a */
        public static final C36894g f94275a = new C36894g();
    }

    /* renamed from: a */
    public static C36894g m83007a() {
        return C36896a.f94275a;
    }

    private C36894g() {
        this.f94274a = new HashMap();
    }

    @C53771m
    public void onEvent(C23764a aVar) {
        C36952a a = new C36953a().mo76203a(aVar.f63351a).mo76204a();
        C36935a aVar2 = (C36935a) this.f94274a.get("video_publish");
        if (aVar2 != null) {
            aVar2.onEvent(a);
        }
    }

    @C53771m
    public void onEvent(C36952a aVar) {
        C36935a aVar2 = (C36935a) this.f94274a.get(aVar.getType());
        if (aVar2 != null) {
            aVar2.onEvent(aVar);
        }
    }
}
