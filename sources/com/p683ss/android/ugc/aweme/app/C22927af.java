package com.p683ss.android.ugc.aweme.app;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.util.EventsSender;

/* renamed from: com.ss.android.ugc.aweme.app.af */
public final class C22927af {

    /* renamed from: a */
    public String f61254a = "";

    /* renamed from: b */
    public long f61255b;

    /* renamed from: com.ss.android.ugc.aweme.app.af$a */
    static final class C22928a {

        /* renamed from: a */
        static final C22927af f61256a = new C22927af();
    }

    /* renamed from: a */
    public static C22927af m56377a() {
        return C22928a.f61256a;
    }

    /* renamed from: a */
    public final void mo47702a(String str) {
        if (str != null && !str.equals(this.f61254a)) {
            this.f61254a = str;
            this.f61255b = System.currentTimeMillis();
        }
        if (C9431p.m18664a(str)) {
            EventsSender.inst().setHost(this.f61254a);
            EventsSender.inst().setSenderEnable(false);
            return;
        }
        EventsSender.inst().setHost(this.f61254a);
        EventsSender.inst().setSenderEnable(true);
    }
}
