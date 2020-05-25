package com.p683ss.android.ugc.aweme.profile.edit;

import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.profile.edit.api.C39839a;
import com.p683ss.android.ugc.aweme.profile.edit.api.C39839a.C39841a;
import com.p683ss.android.ugc.aweme.profile.edit.api.TwitterApi;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.i */
final /* synthetic */ class C39855i implements Runnable {

    /* renamed from: a */
    private final C39852h f101691a;

    /* renamed from: b */
    private final String f101692b;

    /* renamed from: c */
    private final String f101693c;

    /* renamed from: d */
    private final String f101694d;

    /* renamed from: e */
    private final String f101695e;

    C39855i(C39852h hVar, String str, String str2, String str3, String str4) {
        this.f101691a = hVar;
        this.f101692b = str;
        this.f101693c = str2;
        this.f101694d = str3;
        this.f101695e = str4;
    }

    public final void run() {
        C39852h hVar = this.f101691a;
        String str = this.f101692b;
        String str2 = this.f101693c;
        String str3 = this.f101694d;
        String str4 = this.f101695e;
        hVar.f101684d = true;
        C398531 r0 = new C39841a(str, str2, str3, str4) {

            /* renamed from: a */
            final /* synthetic */ String f101685a;

            /* renamed from: b */
            final /* synthetic */ String f101686b;

            /* renamed from: c */
            final /* synthetic */ String f101687c;

            /* renamed from: d */
            final /* synthetic */ String f101688d;

            /* renamed from: a */
            public final String mo80942a() throws Exception {
                return TwitterApi.m88593a(this.f101685a, this.f101686b, this.f101687c, this.f101688d);
            }

            /* renamed from: b */
            public final void mo80943b() {
                C20854a.m53167g().queryUser(C39852h.this.f101683c);
            }

            /* renamed from: c */
            public final void mo80944c() {
                C39852h.this.mo80955a("Failed to store data to TikTok server");
                C39852h.this.f101682b.runOnUiThread(new C39856j(this));
            }

            {
                this.f101685a = r2;
                this.f101686b = r3;
                this.f101687c = r4;
                this.f101688d = r5;
            }
        };
        C39839a.m88597a(r0);
    }
}
