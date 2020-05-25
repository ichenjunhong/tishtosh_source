package com.p683ss.android.ugc.aweme.account.login.twostep;

import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g */
public class C21516g {

    /* renamed from: a */
    private final WeakReference<AppCompatActivity> f58343a;

    /* renamed from: h */
    public JSONObject f58344h;

    /* renamed from: i */
    public String f58345i;

    /* renamed from: j */
    public String f58346j = "";

    /* renamed from: k */
    public final ViewStub f58347k;

    /* renamed from: l */
    public C21517a f58348l;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$a */
    public interface C21517a {
        /* renamed from: a */
        void mo45655a(String str);
    }

    /* renamed from: a */
    public View mo45685a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AppCompatActivity mo45715d() {
        return (AppCompatActivity) this.f58343a.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo45716d(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f58346j = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo45717e(String str) {
        C21517a aVar = this.f58348l;
        if (aVar != null) {
            aVar.mo45655a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 == null) goto L_0x0013;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo45714b(java.lang.Integer r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.ref.WeakReference<android.support.v7.app.AppCompatActivity> r0 = r2.f58343a
            java.lang.Object r0 = r0.get()
            android.support.v7.app.AppCompatActivity r0 = (android.support.p043v7.app.AppCompatActivity) r0
            if (r0 == 0) goto L_0x0013
            r1 = 2132544483(0x7f1c0be3, float:2.0742129E38)
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            java.lang.String r0 = "Sorry, error occurred"
        L_0x0015:
            if (r4 != 0) goto L_0x0018
            return r0
        L_0x0018:
            if (r3 == 0) goto L_0x0027
            r3.intValue()
            int r3 = r3.intValue()
            r1 = 1066(0x42a, float:1.494E-42)
            if (r3 != r1) goto L_0x0026
            return r0
        L_0x0026:
            return r4
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.twostep.C21516g.mo45714b(java.lang.Integer, java.lang.String):java.lang.String");
    }

    public C21516g(AppCompatActivity appCompatActivity, ViewStub viewStub, C21517a aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(viewStub, "viewStub");
        this.f58347k = viewStub;
        this.f58348l = aVar;
        this.f58343a = new WeakReference<>(appCompatActivity);
    }
}
