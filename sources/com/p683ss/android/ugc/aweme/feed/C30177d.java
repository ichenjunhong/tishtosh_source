package com.p683ss.android.ugc.aweme.feed;

import com.p683ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.feed.d */
public final /* synthetic */ class C30177d implements C2205y {

    /* renamed from: a */
    private final int f78754a;

    /* renamed from: b */
    private final String f78755b;

    /* renamed from: c */
    private final int f78756c;

    public C30177d(int i, String str, int i2) {
        this.f78754a = i;
        this.f78755b = str;
        this.f78756c = i2;
    }

    public final void subscribe(C2204x xVar) {
        int i = this.f78754a;
        String str = this.f78755b;
        int i2 = this.f78756c;
        char c = 65535;
        if (i == 14000) {
            c = 21;
        }
        if (c < 0) {
            try {
                C32458a.m75143a((Exception) new IllegalArgumentException("wrong pageType argument"));
            } catch (Exception unused) {
            } finally {
                xVar.mo6273a();
            }
        } else {
            AwemeStatsApi.f78666a.awemeFastStatsReport(str, 21, i2, "").get();
            xVar.mo6273a();
        }
    }
}
