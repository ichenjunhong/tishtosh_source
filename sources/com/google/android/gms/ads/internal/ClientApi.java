package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C15020q;
import com.google.android.gms.ads.internal.overlay.C15021r;
import com.google.android.gms.ads.internal.overlay.C15022s;
import com.google.android.gms.ads.internal.overlay.C15027x;
import com.google.android.gms.ads.internal.overlay.C15028y;
import com.google.android.gms.internal.ads.C15795c;
import com.google.android.gms.internal.ads.C15855ee;
import com.google.android.gms.internal.ads.C15857eg;
import com.google.android.gms.internal.ads.C15870et;
import com.google.android.gms.internal.ads.C15875ey;
import com.google.android.gms.internal.ads.C15931h;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16222ru;
import com.google.android.gms.internal.ads.C16232sd;
import com.google.android.gms.internal.ads.C16255t;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16381xr;
import com.google.android.gms.internal.ads.C16390y;
import com.google.android.gms.internal.ads.C16391ya;
import com.google.android.gms.internal.ads.C16429zl;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.HashMap;

@C16299uq
public class ClientApi extends C16255t {
    /* renamed from: a */
    public final C16390y mo27437a(C14882b bVar) {
        return null;
    }

    /* renamed from: b */
    public final C16232sd mo27441b(C14882b bVar) {
        return null;
    }

    /* renamed from: b */
    public final C16429zl mo27442b(C14882b bVar, String str, C16134on onVar, int i) {
        return null;
    }

    /* renamed from: a */
    public final C15931h mo27436a(C14882b bVar, zzyz zzyz, String str, C16134on onVar, int i) throws RemoteException {
        Context context = (Context) C14886d.m30545a(bVar);
        C14988bv bvVar = new C14988bv(context, zzyz, str, onVar, new zzbgz(15302000, i, true, acd.m32614j(context)), C14986bt.m30940a(context));
        return bvVar;
    }

    /* renamed from: a */
    public final C15931h mo27435a(C14882b bVar, zzyz zzyz, String str, int i) throws RemoteException {
        Context context = (Context) C14886d.m30545a(bVar);
        return new C14957ar(context, zzyz, str, new zzbgz(15302000, i, true, acd.m32614j(context)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.caf.m37099d().mo30717a(com.google.android.gms.internal.ads.C15740bx.f44226aM)).booleanValue() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.caf.m37099d().mo30717a(com.google.android.gms.internal.ads.C15740bx.f44227aN)).booleanValue() != false) goto L_0x0049;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C15931h mo27440b(com.google.android.gms.p1027a.C14882b r8, com.google.android.gms.internal.ads.zzyz r9, java.lang.String r10, com.google.android.gms.internal.ads.C16134on r11, int r12) throws android.os.RemoteException {
        /*
            r7 = this;
            java.lang.Object r8 = com.google.android.gms.p1027a.C14886d.m30545a(r8)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.C15740bx.m36941a(r1)
            com.google.android.gms.internal.ads.zzbgz r5 = new com.google.android.gms.internal.ads.zzbgz
            boolean r8 = com.google.android.gms.internal.ads.acd.m32614j(r1)
            r0 = 1
            r2 = 15302000(0xe97d70, float:2.1442669E-38)
            r5.<init>(r2, r12, r0, r8)
            java.lang.String r8 = "reward_mb"
            java.lang.String r12 = r9.f46338a
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0033
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.C15740bx.f44226aM
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r12 = r2.mo30717a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0049
        L_0x0033:
            if (r8 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.C15740bx.f44227aN
            com.google.android.gms.internal.ads.bu r12 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r8 = r12.mo30717a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            if (r0 == 0) goto L_0x005a
            com.google.android.gms.internal.ads.kv r8 = new com.google.android.gms.internal.ads.kv
            com.google.android.gms.ads.internal.bt r9 = com.google.android.gms.ads.internal.C14986bt.m30940a(r1)
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L_0x005a:
            com.google.android.gms.ads.internal.n r8 = new com.google.android.gms.ads.internal.n
            com.google.android.gms.ads.internal.bt r6 = com.google.android.gms.ads.internal.C14986bt.m30940a(r1)
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.mo27440b(com.google.android.gms.a.b, com.google.android.gms.internal.ads.zzyz, java.lang.String, com.google.android.gms.internal.ads.on, int):com.google.android.gms.internal.ads.h");
    }

    /* renamed from: a */
    public final C15795c mo27432a(C14882b bVar, String str, C16134on onVar, int i) {
        Context context = (Context) C14886d.m30545a(bVar);
        C15001m mVar = new C15001m(context, str, onVar, new zzbgz(15302000, i, true, acd.m32614j(context)), C14986bt.m30940a(context));
        return mVar;
    }

    /* renamed from: a */
    public final C16390y mo27438a(C14882b bVar, int i) {
        Context context = (Context) C14886d.m30545a(bVar);
        return C15039z.m31103a(context, new zzbgz(15302000, i, true, acd.m32614j(context)));
    }

    /* renamed from: a */
    public final C15870et mo27433a(C14882b bVar, C14882b bVar2) {
        return new C15855ee((FrameLayout) C14886d.m30545a(bVar), (FrameLayout) C14886d.m30545a(bVar2));
    }

    /* renamed from: a */
    public final C15875ey mo27434a(C14882b bVar, C14882b bVar2, C14882b bVar3) {
        return new C15857eg((View) C14886d.m30545a(bVar), (HashMap) C14886d.m30545a(bVar2), (HashMap) C14886d.m30545a(bVar3));
    }

    /* renamed from: a */
    public final C16391ya mo27439a(C14882b bVar, C16134on onVar, int i) {
        Context context = (Context) C14886d.m30545a(bVar);
        return new C16381xr(context, C14986bt.m30940a(context), onVar, new zzbgz(15302000, i, true, acd.m32614j(context)));
    }

    /* renamed from: c */
    public final C16222ru mo27443c(C14882b bVar) {
        Activity activity = (Activity) C14886d.m30545a(bVar);
        AdOverlayInfoParcel a = AdOverlayInfoParcel.m31020a(activity.getIntent());
        if (a == null) {
            return new C15021r(activity);
        }
        switch (a.f38779k) {
            case 1:
                return new C15020q(activity);
            case 2:
                return new C15027x(activity);
            case 3:
                return new C15028y(activity);
            case 4:
                return new C15022s(activity, a);
            default:
                return new C15021r(activity);
        }
    }
}
