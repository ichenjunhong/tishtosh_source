package com.p683ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as.C23214a;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.g */
public final class C39446g {

    /* renamed from: a */
    public long f100865a = -1;

    /* renamed from: com.ss.android.ugc.aweme.poi.utils.g$a */
    public static final class C39447a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f100866a;

        /* renamed from: b */
        final /* synthetic */ String f100867b;

        /* renamed from: c */
        final /* synthetic */ long f100868c;

        /* renamed from: d */
        final /* synthetic */ C23214a f100869d;

        public C39447a(Context context, String str, long j, C23214a aVar) {
            this.f100866a = context;
            this.f100867b = str;
            this.f100868c = j;
            this.f100869d = aVar;
        }

        public final void run() {
            if (this.f100866a != null) {
                C26890h.m65004a(this.f100866a, "stay_time", this.f100867b, this.f100868c, 0);
            }
            if (this.f100869d != null) {
                new C23213as().mo48005a(String.valueOf(this.f100868c)).mo48006b(this.f100867b).mo48003a(this.f100869d).mo48076e();
            }
        }
    }
}
