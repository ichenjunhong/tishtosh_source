package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a;

import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2213c.C44015a;
import com.p683ss.android.vesdk.C50711k;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c */
final /* synthetic */ class C44005c implements C50711k {

    /* renamed from: a */
    private final C44002b f111449a;

    /* renamed from: b */
    private final String f111450b;

    /* renamed from: c */
    private final C20347c f111451c;

    /* renamed from: d */
    private final C44015a f111452d;

    C44005c(C44002b bVar, String str, C20347c cVar, C44015a aVar) {
        this.f111449a = bVar;
        this.f111450b = str;
        this.f111451c = cVar;
        this.f111452d = aVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C44002b bVar = this.f111449a;
        String str2 = this.f111450b;
        C20347c cVar = this.f111451c;
        C44015a aVar = this.f111452d;
        if (i == 4101 && !bVar.f111444n) {
            bVar.f111444n = true;
            C0013i.m16a((Callable<TResult>) new C44007e<TResult>(bVar, str2)).mo20a((C0011g<TResult, TContinuationResult>) new C44008f<TResult,TContinuationResult>(bVar, cVar, aVar), C0013i.f25b);
        }
    }
}
