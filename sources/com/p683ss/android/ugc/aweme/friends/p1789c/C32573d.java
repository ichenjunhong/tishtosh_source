package com.p683ss.android.ugc.aweme.friends.p1789c;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32570c.C32572b;

/* renamed from: com.ss.android.ugc.aweme.friends.c.d */
final /* synthetic */ class C32573d implements Runnable {

    /* renamed from: a */
    private final C32570c f84798a;

    /* renamed from: b */
    private final String f84799b;

    /* renamed from: c */
    private final C32572b f84800c;

    C32573d(C32570c cVar, String str, C32572b bVar) {
        this.f84798a = cVar;
        this.f84799b = str;
        this.f84800c = bVar;
    }

    public final void run() {
        String str;
        C32570c cVar = this.f84798a;
        String str2 = this.f84799b;
        C32572b bVar = this.f84800c;
        try {
            str = cVar.f84795a.shortenUrl(str2).getUrl();
        } catch (Exception unused) {
            str = null;
        }
        if (C9431p.m18664a(str)) {
            str = str2;
        }
        C18842a.m45934b(new C32574e(bVar, str));
    }
}
