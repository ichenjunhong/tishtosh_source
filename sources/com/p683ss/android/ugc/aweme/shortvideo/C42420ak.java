package com.p683ss.android.ugc.aweme.shortvideo;

import com.facebook.common.p920d.C13696m;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.property.C40797m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ak */
public final class C42420ak implements C17824h<C42421al> {
    public final void onFailure(Throwable th) {
        C23569o.m57776a("aweme_movie_publish_error_rate_sdk", C42477bv.m93326a(13, th), C23088c.m56631a().mo47824a("exception", C13696m.m27668c(th)).mo47825b());
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        C42421al alVar = (C42421al) obj;
        StringBuilder sb = new StringBuilder();
        sb.append(C40797m.m90243a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C40797m.m90247b());
        C23569o.m57776a("aweme_movie_publish_error_rate_sdk", 0, new C26898j().mo54849a("enableHardRecord", sb.toString()).mo54849a("enableHardSynthetic", sb2.toString()).mo54850a());
    }
}
