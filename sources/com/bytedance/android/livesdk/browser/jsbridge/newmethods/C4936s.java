package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import java.io.File;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.s */
final /* synthetic */ class C4936s implements C2205y {

    /* renamed from: a */
    private final C49287 f13268a;

    /* renamed from: b */
    private final File f13269b;

    /* renamed from: c */
    private final String f13270c;

    C4936s(C49287 r1, File file, String str) {
        this.f13268a = r1;
        this.f13269b = file;
        this.f13270c = str;
    }

    public final void subscribe(C2204x xVar) {
        C49287 r0 = this.f13268a;
        xVar.mo6282a(new C4933c(this.f13270c, C4921p.this.mo10652a(C4921p.this.f13231i, this.f13269b, C4921p.this.f13232j)));
    }
}
