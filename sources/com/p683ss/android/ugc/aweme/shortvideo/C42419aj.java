package com.p683ss.android.ugc.aweme.shortvideo;

import com.facebook.common.p920d.C13696m;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44332b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45314q;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aj */
public final class C42419aj implements C17824h<C42421al> {

    /* renamed from: a */
    private C45314q f107303a;

    /* renamed from: b */
    private String f107304b;

    /* renamed from: c */
    private boolean f107305c;

    /* renamed from: d */
    private boolean f107306d;

    /* renamed from: e */
    private String f107307e;

    /* renamed from: f */
    private int f107308f;

    /* renamed from: g */
    private boolean f107309g;

    public final void onFailure(Throwable th) {
        String str;
        String str2;
        C50203g.m108358a("PublishDurationMonitor CreateAweme End failed");
        int a = C42477bv.m93326a(13, th);
        String b = C42477bv.m93328b(th);
        JSONObject b2 = C23088c.m56631a().mo47824a("exception", C13696m.m27668c(th)).mo47822a("videoLength", Integer.valueOf(this.f107308f)).mo47824a("server_log_id", b).mo47825b();
        if (this.f107306d) {
            C23569o.m57776a("aweme_review_video_fast_publish_error_rate", a, b2);
        }
        if (this.f107305c) {
            C23569o.m57776a("aweme_mv_publish_error_rate", a, b2);
        }
        C23569o.m57776a("aweme_movie_publish_error_rate_parallel", a, b2);
        String str3 = "parallel_publish_result";
        C23089d a2 = C23089d.m56640a().mo47826a("status", a);
        String str4 = "retry_publish";
        if (this.f107309g) {
            str = "1";
        } else {
            str = "0";
        }
        C23089d a3 = a2.mo47829a(str4, str).mo47829a("publish_id", this.f107307e).mo47826a("publish_step", 41).mo47826a("error_code", C42477bv.m93327a(th)).mo47829a("server_log_id", b);
        String str5 = "network_available";
        if (C44332b.m97107a(C39629l.m88233b())) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C26890h.m65011a(str3, a3.mo47829a(str5, str2).f61491a);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        String str;
        C42421al alVar = (C42421al) obj;
        C50203g.m108358a("PublishDurationMonitor CreateAweme End success");
        StringBuilder sb = new StringBuilder();
        sb.append(C40797m.m90243a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C40797m.m90247b());
        JSONObject b = C23088c.m56631a().mo47824a("enableHardRecord", sb.toString()).mo47824a("enableHardSynthetic", sb2.toString()).mo47822a("videoLength", Integer.valueOf(this.f107308f)).mo47825b();
        if (this.f107306d) {
            C23569o.m57776a("aweme_review_video_fast_publish_error_rate", 0, b);
        }
        if (this.f107305c) {
            C23569o.m57776a("aweme_mv_publish_error_rate", 0, b);
        }
        C23569o.m57776a("aweme_movie_publish_error_rate_parallel", 0, b);
        String str2 = "parallel_publish_result";
        C23089d a = C23089d.m56640a().mo47826a("status", 0);
        String str3 = "retry_publish";
        if (this.f107309g) {
            str = "1";
        } else {
            str = "0";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("publish_id", this.f107307e).mo47826a("publish_step", 41).f61491a);
        C45314q qVar = this.f107303a;
        long length = new File(this.f107304b).length();
        if (qVar.f114570a.f48964a) {
            C23569o.m57779a("publish_log_parallel", C42437ay.m93202a().mo86520a("duration", Long.valueOf(qVar.f114570a.mo33754a(TimeUnit.MILLISECONDS))).mo86518a("upload_speed", Float.valueOf((((float) length) * 1.0f) / ((float) qVar.f114570a.mo33754a(TimeUnit.MILLISECONDS)))).mo86522b());
            qVar.f114570a.mo33756d();
        }
    }

    C42419aj(C45314q qVar, String str, boolean z, boolean z2, String str2, int i, boolean z3) {
        String str3;
        this.f107303a = qVar;
        this.f107304b = str;
        this.f107305c = z;
        this.f107306d = z2;
        this.f107307e = str2;
        this.f107308f = i;
        this.f107309g = z3;
        String str4 = "parallel_publish_result";
        C23089d a = C23089d.m56640a();
        String str5 = "retry_publish";
        if (z3) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        C26890h.m65011a(str4, a.mo47829a(str5, str3).mo47826a("publish_step", 40).mo47829a("publish_id", str2).f61491a);
    }
}
