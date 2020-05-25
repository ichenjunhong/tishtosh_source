package com.p683ss.android.ugc.awemepushlib.interaction;

import com.p683ss.android.pushmanager.C19681c;
import com.p683ss.android.pushmanager.client.MessageAppManager;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.u */
public final class C48470u {
    /* renamed from: a */
    public static void m104868a() {
        MessageAppManager.inst().setDefaultChannelName(false, "");
        MessageAppManager.inst().setIExtraMessageDepend(new C19681c() {
            /* renamed from: a */
            public final String mo41022a() {
                return "payload";
            }

            /* renamed from: b */
            public final String mo41023b() {
                return "http://api.hypstar.com";
            }
        });
    }
}
