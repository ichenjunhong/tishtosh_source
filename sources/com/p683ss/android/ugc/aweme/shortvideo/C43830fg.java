package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fg */
public final class C43830fg implements C17824h<SynthetiseResult> {

    /* renamed from: a */
    File f110992a;

    /* renamed from: b */
    long f110993b;

    /* renamed from: c */
    C17429o f110994c = C17429o.m42675b();

    public final void onFailure(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        long a = this.f110994c.mo33754a(TimeUnit.MILLISECONDS);
        if (this.f110992a.exists()) {
            C23569o.m57779a("type_av_publish_concat", C23088c.m56631a().mo47821a("speed", Float.valueOf(((float) this.f110993b) / ((float) a))).mo47823a("processTime", Long.valueOf(a)).mo47825b());
        }
    }

    public C43830fg(String str, long j) {
        this.f110992a = new File(str);
        this.f110993b = j;
    }
}
