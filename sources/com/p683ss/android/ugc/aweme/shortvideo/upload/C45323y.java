package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.facebook.common.p920d.C13696m;
import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C43213dg;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45292c;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.y */
public final class C45323y implements C17824h<SynthetiseResult> {

    /* renamed from: a */
    private File f114590a;

    /* renamed from: b */
    private long f114591b;

    /* renamed from: c */
    private C17429o f114592c = C17429o.m42675b();

    /* renamed from: d */
    private boolean f114593d;

    /* renamed from: e */
    private String f114594e;

    /* renamed from: f */
    private boolean f114595f;

    /* renamed from: g */
    private int f114596g;

    /* renamed from: h */
    private C45292c f114597h;

    public final void onFailure(Throwable th) {
        SynthetiseResult synthetiseResult;
        String str;
        String str2;
        String str3;
        C50203g.m108358a("PublishDurationMonitor Synthetise end failed");
        int resolveErrorCode = C43809fd.resolveErrorCode(th);
        if (th instanceof C43809fd) {
            synthetiseResult = ((C43809fd) th).getResult();
            String synthetiseResult2 = synthetiseResult.toString();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fileInfo", synthetiseResult2);
            } catch (JSONException unused) {
            }
            C23569o.m57783b("aweme_movie_publish_log", "synthesis_error", jSONObject);
        } else {
            synthetiseResult = null;
        }
        C42437ay a = C43213dg.m94816a(synthetiseResult).mo86521a("exception", C13696m.m27668c(th));
        String str4 = "click_publish";
        if (this.f114597h.f114536h) {
            str = "1";
        } else {
            str = "0";
        }
        JSONObject b = a.mo86521a(str4, str).mo86521a("event", C45324z.m98803a().mo91603b().toString()).mo86522b();
        if (this.f114593d) {
            C23569o.m57776a("aweme_mv_edit_error_rate", resolveErrorCode, b);
        }
        C23569o.m57776a("aweme_synthesis_error_rate_parallel", resolveErrorCode, b);
        C47702b bVar = C47702b.f120193a;
        String str5 = "parallel_publish_result";
        C23089d a2 = C23089d.m56640a();
        String str6 = "retry_publish";
        if (this.f114595f) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C23089d a3 = a2.mo47829a(str6, str2).mo47826a("publish_step", 11).mo47826a("error_code", resolveErrorCode);
        String str7 = "click_publish";
        if (this.f114597h.f114536h) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        bVar.mo94984a(str5, a3.mo47829a(str7, str3).mo47826a("video_editor_type", this.f114596g).mo47829a("publish_id", this.f114594e).f61491a);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        long a = this.f114592c.mo33754a(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder("PublishDurationMonitor Synthetise end success durationMs:");
        sb.append(a);
        C50203g.m108358a(sb.toString());
        C42437ay a2 = C42437ay.m93202a();
        String str3 = "click_publish";
        if (this.f114597h.f114536h) {
            str = "1";
        } else {
            str = "0";
        }
        C42437ay a3 = a2.mo86521a(str3, str);
        if (this.f114590a.exists()) {
            a3.mo86518a("speed", Float.valueOf(((float) this.f114591b) / ((float) a))).mo86520a("duration", Long.valueOf(a));
        }
        if (synthetiseResult != null) {
            a3.mo86517a("is_fast_import", Boolean.valueOf(synthetiseResult.isFastImport)).mo86521a("support_max_resolution", synthetiseResult.fastImportResolution).mo86517a("is_new_framework", Boolean.valueOf(synthetiseResult.isNewFramework)).mo86517a("has_subtitle", Boolean.valueOf(synthetiseResult.hasSubtitle));
        }
        JSONObject b = a3.mo86522b();
        if (this.f114593d) {
            C23569o.m57776a("aweme_mv_edit_error_rate", 0, b);
        }
        C23569o.m57776a("aweme_synthesis_error_rate_parallel", 0, b);
        C23089d a4 = C23089d.m56640a();
        C47702b bVar = C47702b.f120193a;
        String str4 = "parallel_publish_result";
        String str5 = "retry_publish";
        if (this.f114595f) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        bVar.mo94984a(str4, a4.mo47829a(str5, str2).mo47826a("publish_step", 11).mo47826a("video_editor_type", this.f114596g).mo47829a("publish_id", this.f114594e).f61491a);
    }

    public C45323y(String str, long j, boolean z, String str2, boolean z2, int i, C45292c cVar) {
        String str3;
        this.f114590a = new File(str);
        this.f114591b = j;
        this.f114593d = z;
        this.f114594e = str2;
        this.f114595f = z2;
        this.f114596g = i;
        this.f114597h = cVar;
        C23569o.m57776a("aweme_synthesis_error_rate_parallel", -1, (JSONObject) null);
        C47702b bVar = C47702b.f120193a;
        String str4 = "parallel_publish_result";
        C23089d a = C23089d.m56640a();
        String str5 = "retry_publish";
        if (z2) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        bVar.mo94984a(str4, a.mo47829a(str5, str3).mo47826a("publish_step", 10).mo47826a("video_editor_type", i).mo47829a("publish_id", str2).f61491a);
    }
}
