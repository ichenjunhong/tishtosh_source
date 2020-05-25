package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C15986ja;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16417z;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.ada;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.Collections;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.z */
public final class C15039z extends C16417z {

    /* renamed from: b */
    private static final Object f38852b = new Object();

    /* renamed from: c */
    private static C15039z f38853c;

    /* renamed from: a */
    final Context f38854a;

    /* renamed from: d */
    private boolean f38855d;

    /* renamed from: e */
    private zzbgz f38856e;

    /* renamed from: a */
    public static C15039z m31103a(Context context, zzbgz zzbgz) {
        C15039z zVar;
        synchronized (f38852b) {
            if (f38853c == null) {
                f38853c = new C15039z(context.getApplicationContext(), zzbgz);
            }
            zVar = f38853c;
        }
        return zVar;
    }

    /* renamed from: a */
    public final void mo27717a(C15986ja jaVar) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27718a(C16134on onVar) throws RemoteException {
    }

    /* renamed from: b */
    public final void mo27723b(String str) {
    }

    private C15039z(Context context, zzbgz zzbgz) {
        this.f38854a = context;
        this.f38856e = zzbgz;
    }

    /* renamed from: a */
    public final void mo27714a() {
        synchronized (f38852b) {
            if (this.f38855d) {
                abv.m32798e("Mobile ads is initialized already.");
                return;
            }
            this.f38855d = true;
            C15740bx.m36941a(this.f38854a);
            C14963ax.m30834d().mo28586a(this.f38854a, this.f38856e);
            C14963ax.m30836f().mo30847a(this.f38854a);
        }
    }

    /* renamed from: a */
    public final void mo27719a(String str) {
        C15740bx.m36941a(this.f38854a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44291bY)).booleanValue()) {
                C14963ax.m30838h().mo27631a(this.f38854a, this.f38856e, str, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo27720a(String str, C14882b bVar) {
        if (!TextUtils.isEmpty(str)) {
            C15740bx.m36941a(this.f38854a);
            boolean booleanValue = ((Boolean) caf.m37099d().mo30717a(C15740bx.f44291bY)).booleanValue() | ((Boolean) caf.m37099d().mo30717a(C15740bx.f44264ay)).booleanValue();
            C14941ab abVar = null;
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44264ay)).booleanValue()) {
                booleanValue = true;
                abVar = new C14941ab(this, (Runnable) C14886d.m30545a(bVar));
            }
            if (booleanValue) {
                C14963ax.m30838h().mo27631a(this.f38854a, this.f38856e, str, abVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo27715a(float f) {
        C14963ax.m30835e().mo28701a(f);
    }

    /* renamed from: b */
    public final float mo27722b() {
        return C14963ax.m30835e().mo28700a();
    }

    /* renamed from: a */
    public final void mo27721a(boolean z) {
        C14963ax.m30835e().mo28702a(z);
    }

    /* renamed from: c */
    public final boolean mo27724c() {
        return C14963ax.m30835e().mo28703b();
    }

    /* renamed from: d */
    public final String mo27725d() {
        return this.f38856e.f46237a;
    }

    /* renamed from: a */
    public final void mo27716a(C14882b bVar, String str) {
        if (bVar == null) {
            abv.m32794c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C14886d.m30545a(bVar);
        if (context == null) {
            abv.m32794c("Context is null. Failed to open debug menu.");
            return;
        }
        ada ada = new ada(context);
        ada.f40272c = str;
        ada.f40273d = this.f38856e.f46237a;
        ada.mo28704a();
    }

    /* renamed from: e */
    public final List<zzaki> mo27726e() throws RemoteException {
        return Collections.EMPTY_LIST;
    }
}
