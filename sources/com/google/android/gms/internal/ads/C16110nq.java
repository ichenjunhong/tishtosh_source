package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nq */
final class C16110nq implements C15965ig {

    /* renamed from: a */
    private final C16081mo f45262a;

    /* renamed from: b */
    private final agl f45263b;

    /* renamed from: c */
    private final /* synthetic */ C16106nm f45264c;

    public C16110nq(C16106nm nmVar, C16081mo moVar, agl agl) {
        this.f45264c = nmVar;
        this.f45262a = moVar;
        this.f45263b = agl;
    }

    /* renamed from: a */
    public final void mo31093a(JSONObject jSONObject) {
        try {
            this.f45263b.mo28823b(this.f45264c.f45252a.mo31191a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f45263b.mo28823b(e);
        } finally {
            this.f45262a.mo31182a();
        }
    }

    /* renamed from: a */
    public final void mo31092a(String str) {
        if (str == null) {
            try {
                this.f45263b.mo28822a(new C16094na());
            } catch (IllegalStateException unused) {
                this.f45262a.mo31182a();
                return;
            } catch (Throwable th) {
                this.f45262a.mo31182a();
                throw th;
            }
        } else {
            this.f45263b.mo28822a(new C16094na(str));
        }
        this.f45262a.mo31182a();
    }
}
