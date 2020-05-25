package com.p683ss.android.ugc.aweme.net.p1991d;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12799u;
import com.facebook.p987k.p988a.C14464d;

/* renamed from: com.ss.android.ugc.aweme.net.d.c */
public final class C37760c implements C37761d {

    /* renamed from: a */
    private boolean f96215a;

    /* renamed from: b */
    private String f96216b;

    /* renamed from: a */
    public final void mo77249a(String str) {
        if (!this.f96215a) {
            C14464d.m29590a().mo26627b();
            this.f96216b = str;
            this.f96215a = true;
        }
    }

    /* renamed from: a */
    public final void mo77250a(String str, C12799u<String> uVar) {
        if (this.f96215a && TextUtils.equals(this.f96216b, str)) {
            C14464d.m29590a().mo26628c();
            this.f96215a = false;
        }
    }
}
