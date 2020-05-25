package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.p2618b.C52109e;
import java.lang.reflect.Type;

/* renamed from: com.twitter.sdk.android.core.d */
public class C52070d extends C52188j<GuestAuthToken> {

    /* renamed from: com.twitter.sdk.android.core.d$a */
    public static class C52071a implements C52109e<C52070d> {

        /* renamed from: a */
        private final C17971f f129653a = new C17978g().mo34896a((Type) GuestAuthToken.class, (Object) new AuthTokenAdapter()).mo34900d();

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String mo108765a(C52070d dVar) {
            if (!(dVar == null || dVar.f129901a == null)) {
                try {
                    return this.f129653a.mo34889b(dVar);
                } catch (Exception e) {
                    new StringBuilder("Failed to serialize session ").append(e.getMessage());
                }
            }
            return "";
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C52070d mo108764a(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (C52070d) this.f129653a.mo34884a(str, C52070d.class);
                } catch (Exception e) {
                    new StringBuilder("Failed to deserialize session ").append(e.getMessage());
                }
            }
            return null;
        }
    }

    public C52070d(GuestAuthToken guestAuthToken) {
        super(guestAuthToken, 0);
    }
}
