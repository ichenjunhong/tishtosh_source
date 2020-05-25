package com.bytedance.lobby.auth;

import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;

/* renamed from: com.bytedance.lobby.auth.c */
public final class C12318c {

    /* renamed from: a */
    public final FragmentActivity f32472a;

    /* renamed from: b */
    public final String f32473b;

    /* renamed from: c */
    public final C12316a f32474c;

    /* renamed from: d */
    public final Bundle f32475d;

    /* renamed from: com.bytedance.lobby.auth.c$a */
    public static class C12320a {

        /* renamed from: a */
        public String f32476a;

        /* renamed from: b */
        public FragmentActivity f32477b;

        /* renamed from: c */
        public C12316a f32478c;

        /* renamed from: d */
        public Bundle f32479d;

        /* renamed from: a */
        public final C12318c mo23310a() {
            return new C12318c(this);
        }

        /* renamed from: a */
        public final C12320a mo23308a(C12316a aVar) {
            this.f32478c = aVar;
            return this;
        }

        public C12320a(FragmentActivity fragmentActivity) {
            this.f32477b = fragmentActivity;
        }

        /* renamed from: a */
        public final C12320a mo23309a(String str) {
            this.f32476a = str;
            return this;
        }

        /* renamed from: a */
        public final C12320a mo23307a(Bundle bundle) {
            if (this.f32479d == null) {
                this.f32479d = bundle;
            } else {
                this.f32479d.putAll(bundle);
            }
            return this;
        }
    }

    private C12318c(C12320a aVar) {
        this.f32473b = aVar.f32476a;
        this.f32472a = aVar.f32477b;
        this.f32474c = aVar.f32478c;
        this.f32475d = aVar.f32479d;
    }
}
