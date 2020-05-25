package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.twitter.sdk.android.core.internal.p2618b.C52109e;

/* renamed from: com.twitter.sdk.android.core.v */
public class C52231v extends C52188j<TwitterAuthToken> {
    @C17952c(mo34828a = "user_name")

    /* renamed from: c */
    public final String f130066c;

    /* renamed from: com.twitter.sdk.android.core.v$a */
    static class C52232a implements C52109e<C52231v> {

        /* renamed from: a */
        private final C17971f f130067a = new C17971f();

        C52232a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String mo108765a(C52231v vVar) {
            if (!(vVar == null || vVar.f129901a == null)) {
                try {
                    return this.f130067a.mo34889b(vVar);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return "";
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C52231v mo108764a(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (C52231v) this.f130067a.mo34884a(str, C52231v.class);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return null;
        }
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        if (this.f130066c != null) {
            i = this.f130066c.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C52231v vVar = (C52231v) obj;
        if (this.f130066c != null) {
            return this.f130066c.equals(vVar.f130066c);
        }
        if (vVar.f130066c == null) {
            return true;
        }
        return false;
    }

    public C52231v(TwitterAuthToken twitterAuthToken, long j, String str) {
        super(twitterAuthToken, j);
        this.f130066c = str;
    }
}
