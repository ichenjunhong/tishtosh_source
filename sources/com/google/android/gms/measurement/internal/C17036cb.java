package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.cb */
public final class C17036cb {

    /* renamed from: a */
    final Context f48066a;

    /* renamed from: b */
    String f48067b;

    /* renamed from: c */
    String f48068c;

    /* renamed from: d */
    String f48069d;

    /* renamed from: e */
    boolean f48070e = true;

    /* renamed from: f */
    Boolean f48071f;

    /* renamed from: g */
    C17128m f48072g;

    public C17036cb(Context context, C17128m mVar) {
        C15464q.m32123a(context);
        Context applicationContext = context.getApplicationContext();
        C15464q.m32123a(applicationContext);
        this.f48066a = applicationContext;
        if (mVar != null) {
            this.f48072g = mVar;
            this.f48067b = mVar.f48436f;
            this.f48068c = mVar.f48435e;
            this.f48069d = mVar.f48434d;
            this.f48070e = mVar.f48433c;
            if (mVar.f48437g != null) {
                this.f48071f = Boolean.valueOf(mVar.f48437g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
