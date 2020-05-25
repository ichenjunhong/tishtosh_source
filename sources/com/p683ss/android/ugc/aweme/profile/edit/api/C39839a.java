package com.p683ss.android.ugc.aweme.profile.edit.api;

import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.api.a */
public final class C39839a {

    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.a$a */
    public interface C39841a {
        /* renamed from: a */
        String mo80942a() throws Exception;

        /* renamed from: b */
        void mo80943b();

        /* renamed from: c */
        void mo80944c();
    }

    /* renamed from: a */
    public static void m88597a(final C39841a aVar) {
        C18842a.m45932a(new Runnable() {
            public final void run() {
                boolean z = false;
                try {
                    String a = aVar.mo80942a();
                    if (a != null && a.length() > 0 && new JSONObject(a).getString("status_code").equals("0")) {
                        aVar.mo80943b();
                        z = true;
                    }
                } catch (Exception unused) {
                }
                if (!z) {
                    aVar.mo80944c();
                }
            }
        });
    }
}
