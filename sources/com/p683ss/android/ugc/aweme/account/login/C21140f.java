package com.p683ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.f */
public final class C21140f {

    /* renamed from: a */
    public final Context f57434a;

    /* renamed from: b */
    public final int f57435b;

    /* renamed from: c */
    public final JSONObject f57436c;

    /* renamed from: d */
    public BaseLoginMethod f57437d;

    /* renamed from: e */
    public final C21379m f57438e;

    /* renamed from: f */
    public final Bundle f57439f;

    /* renamed from: g */
    public final Runnable f57440g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21140f) {
                C21140f fVar = (C21140f) obj;
                if (C52711k.m112239a((Object) this.f57434a, (Object) fVar.f57434a)) {
                    if (!(this.f57435b == fVar.f57435b) || !C52711k.m112239a((Object) this.f57436c, (Object) fVar.f57436c) || !C52711k.m112239a((Object) this.f57437d, (Object) fVar.f57437d) || !C52711k.m112239a((Object) this.f57438e, (Object) fVar.f57438e) || !C52711k.m112239a((Object) this.f57439f, (Object) fVar.f57439f) || !C52711k.m112239a((Object) this.f57440g, (Object) fVar.f57440g)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Context context = this.f57434a;
        int i = 0;
        int hashCode = (((context != null ? context.hashCode() : 0) * 31) + Integer.hashCode(this.f57435b)) * 31;
        JSONObject jSONObject = this.f57436c;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        BaseLoginMethod baseLoginMethod = this.f57437d;
        int hashCode3 = (hashCode2 + (baseLoginMethod != null ? baseLoginMethod.hashCode() : 0)) * 31;
        C21379m mVar = this.f57438e;
        int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        Bundle bundle = this.f57439f;
        int hashCode5 = (hashCode4 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        Runnable runnable = this.f57440g;
        if (runnable != null) {
            i = runnable.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorInfo(context=");
        sb.append(this.f57434a);
        sb.append(", errorCode=");
        sb.append(this.f57435b);
        sb.append(", json=");
        sb.append(this.f57436c);
        sb.append(", loginMethod=");
        sb.append(this.f57437d);
        sb.append(", loginFinishCallback=");
        sb.append(this.f57438e);
        sb.append(", loginBundle=");
        sb.append(this.f57439f);
        sb.append(", onActionCompleted=");
        sb.append(this.f57440g);
        sb.append(")");
        return sb.toString();
    }

    public C21140f(Context context, int i, JSONObject jSONObject, BaseLoginMethod baseLoginMethod, C21379m mVar, Bundle bundle) {
        C52711k.m112240b(bundle, "loginBundle");
        this(context, i, jSONObject, baseLoginMethod, mVar, bundle, null);
    }

    private C21140f(Context context, int i, JSONObject jSONObject, BaseLoginMethod baseLoginMethod, C21379m mVar, Bundle bundle, Runnable runnable) {
        C52711k.m112240b(bundle, "loginBundle");
        this.f57434a = context;
        this.f57435b = i;
        this.f57436c = jSONObject;
        this.f57437d = baseLoginMethod;
        this.f57438e = mVar;
        this.f57439f = bundle;
        this.f57440g = null;
    }
}
