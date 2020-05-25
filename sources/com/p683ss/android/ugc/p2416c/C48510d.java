package com.p683ss.android.ugc.p2416c;

import com.p683ss.android.ugc.p2416c.C48514f.C48518c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.c.d */
public final class C48510d {

    /* renamed from: a */
    Map<String, C48518c> f121951a;

    /* renamed from: com.ss.android.ugc.c.d$a */
    enum C48512a {
        INSTANCE;
        

        /* renamed from: b */
        C48510d f121954b;

        /* renamed from: c */
        private C48507a f121955c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C48507a mo96008a() {
            if (this.f121955c == null) {
                try {
                    this.f121955c = (C48507a) Class.forName("com.ss.android.ugc.c.b").newInstance();
                } catch (Exception unused) {
                }
            }
            return this.f121955c;
        }
    }

    private C48510d() {
        this.f121951a = new HashMap();
        C48507a a = C48512a.INSTANCE.mo96008a();
        if (a != null) {
            this.f121951a.putAll(a.f121950a);
        }
    }
}
