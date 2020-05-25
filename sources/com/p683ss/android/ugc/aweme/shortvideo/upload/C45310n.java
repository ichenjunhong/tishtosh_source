package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.google.p1057b.p1058a.C17437s;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C42477bv;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44332b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45292c;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.n */
public final class C45310n implements C17824h<VideoCreation> {

    /* renamed from: a */
    private String f114564a;

    /* renamed from: b */
    private int f114565b;

    /* renamed from: c */
    private boolean f114566c;

    /* renamed from: d */
    private boolean f114567d;

    /* renamed from: e */
    private boolean f114568e;

    /* renamed from: f */
    private C45292c f114569f;

    /* renamed from: a */
    public final synchronized boolean mo91583a() {
        this.f114566c = true;
        if (!this.f114567d) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (r5 == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onSuccess(java.lang.Object r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.shortvideo.model.VideoCreation r5 = (com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation) r5
            java.lang.String r0 = "fetch_upload_parameters_error_parallel"
            r1 = 0
            r2 = 0
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r0, r1, r2)
            java.lang.String r0 = "parallel_publish_result"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "mob_lost_assist"
            r3 = 1
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r3)
            java.lang.String r2 = "retry_publish"
            boolean r3 = r4.f114568e
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "1"
            goto L_0x0021
        L_0x001f:
            java.lang.String r3 = "0"
        L_0x0021:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "status"
            r3 = 81
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r3)
            java.lang.String r2 = "publish_step"
            r3 = 21
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47826a(r2, r3)
            java.lang.String r2 = "auth_key"
            com.ss.android.ugc.aweme.shortvideo.fu r5 = com.p683ss.android.ugc.aweme.shortvideo.util.C45419be.m98989b(r5)
            if (r5 == 0) goto L_0x0043
            java.lang.String r5 = r5.toString()
            if (r5 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r5 = ""
        L_0x0045:
            com.ss.android.ugc.aweme.app.f.d r5 = r1.mo47829a(r2, r5)
            java.lang.String r1 = "publish_id"
            java.lang.String r2 = r4.f114564a
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.upload.C45310n.onSuccess(java.lang.Object):void");
    }

    public final synchronized void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int a = C42477bv.m93326a(11, th);
        String b = C17437s.m42688b(th);
        String b2 = C42477bv.m93328b(th);
        String str6 = "fetch_upload_parameters_error_parallel";
        C42437ay a2 = C42437ay.m93202a().mo86521a("exception", b).mo86519a("videoLength", Integer.valueOf(this.f114565b));
        String str7 = "click_publish";
        if (this.f114569f.f114536h) {
            str = "1";
        } else {
            str = "0";
        }
        C23569o.m57776a(str6, 1, a2.mo86521a(str7, str).mo86521a("server_log_id", b2).mo86522b());
        this.f114567d = true;
        if (!this.f114566c) {
            String str8 = "aweme_movie_publish_error_rate_parallel";
            C42437ay a3 = C42437ay.m93202a();
            String str9 = "click_publish";
            if (this.f114569f.f114536h) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            C23569o.m57776a(str8, a, a3.mo86521a(str9, str2).mo86521a("exception", b).mo86522b());
            String str10 = "parallel_publish_result";
            C23089d a4 = C23089d.m56640a().mo47826a("status", a);
            String str11 = "retry_publish";
            if (this.f114568e) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C23089d a5 = a4.mo47829a(str11, str3).mo47826a("publish_step", 21).mo47826a("error_code", C42477bv.m93327a(th)).mo47829a("server_log_id", b2);
            String str12 = "click_publish";
            if (this.f114569f.f114536h) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            C23089d a6 = a5.mo47829a(str12, str4);
            String str13 = "network_available";
            if (C44332b.m97107a(C39629l.m88233b())) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            C26890h.m65011a(str10, a6.mo47829a(str13, str5).mo47829a("publish_id", this.f114564a).f61491a);
        }
    }

    public C45310n(String str, int i, boolean z, boolean z2, C45292c cVar) {
        String str2;
        this.f114564a = str;
        this.f114565b = i;
        this.f114566c = z;
        this.f114568e = z2;
        this.f114569f = cVar;
        C23569o.m57776a("aweme_movie_publish_error_rate_parallel", -1, (JSONObject) null);
        String str3 = "parallel_publish_result";
        C23089d a = C23089d.m56640a().mo47826a("status", -1);
        String str4 = "retry_publish";
        if (z2) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str2).mo47826a("publish_step", 20).mo47829a("publish_id", str).f61491a);
    }
}
