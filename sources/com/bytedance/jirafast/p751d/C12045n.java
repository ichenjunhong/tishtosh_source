package com.bytedance.jirafast.p751d;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.jirafast.C11991a;
import com.bytedance.jirafast.models.C12052b;
import com.bytedance.jirafast.models.C12054d;
import com.bytedance.jirafast.models.C12055e;
import com.bytedance.jirafast.net.C12058a;
import com.bytedance.jirafast.net.C12059b;
import com.bytedance.jirafast.net.JIRAApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.bytedance.jirafast.d.n */
public final class C12045n {

    /* renamed from: a */
    protected C9381g f31842a;

    /* renamed from: b */
    protected OkHttpClient f31843b;

    /* renamed from: com.bytedance.jirafast.d.n$a */
    public static class C12047a {

        /* renamed from: a */
        public static C12045n f31845a = new C12045n();
    }

    private C12045n() {
        this.f31843b = new OkHttpClient();
        this.f31842a = new C9381g(new C9382a() {
            public final void handleMsg(Message message) {
            }
        });
    }

    /* renamed from: a */
    private static String m24501a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo22790a(C12055e eVar) {
        C12054d dVar;
        C12058a aVar = new C12058a(this.f31843b);
        StringBuilder sb = new StringBuilder("");
        String str = "";
        if (eVar.f31877e != null && eVar.f31877e.size() > 0) {
            List a = aVar.mo22829a(eVar.f31877e);
            for (int i = 0; i < eVar.f31877e.size(); i++) {
                if (((C12052b) a.get(i)).f31857b != null) {
                    StringBuilder sb2 = new StringBuilder(",\"");
                    sb2.append(new File((String) eVar.f31877e.get(i)).getName());
                    sb2.append("\":\"");
                    sb2.append((String) ((C12052b) a.get(i)).f31857b.getUrlList().get(0));
                    sb2.append("\"");
                    sb.append(sb2.toString());
                }
            }
        }
        C12059b bVar = new C12059b(this.f31843b);
        if (eVar.f31876d != null && eVar.f31876d.size() > 0) {
            List a2 = bVar.mo22830a(eVar.f31876d);
            String str2 = str;
            for (int i2 = 0; i2 < eVar.f31876d.size(); i2++) {
                if (((C12052b) a2.get(i2)).f31857b != null) {
                    StringBuilder sb3 = new StringBuilder(",\"");
                    sb3.append(new File((String) eVar.f31876d.get(i2)).getName());
                    sb3.append("\":\"");
                    sb3.append((String) ((C12052b) a2.get(i2)).f31857b.getUrlList().get(0));
                    sb3.append("\"");
                    sb.append(sb3.toString());
                    str2 = ((C12052b) a2.get(i2)).f31857b.getUri();
                }
            }
            str = str2;
        }
        String sb4 = sb.toString();
        if (!sb4.equals("")) {
            sb4 = sb4.substring(1);
        }
        StringBuilder sb5 = new StringBuilder("{");
        sb5.append(sb4);
        sb5.append("}");
        try {
            dVar = (C12054d) ((JIRAApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C12015a.m24416a().mo22755a(C12015a.f31783x)).create(JIRAApi.class)).fastback(eVar.f31873a, 1, URLEncoder.encode(eVar.f31874b, "UTF-8"), URLEncoder.encode(eVar.f31875c, "UTF-8"), URLEncoder.encode(sb5.toString(), "UTF-8"), URLEncoder.encode(str, "UTF-8"), C12019c.m24431a(), "Android", m24501a(C11991a.m24390a())).get();
        } catch (Throwable unused) {
            dVar = null;
        }
        if (dVar == null) {
            return "Failure to submit, please try again.";
        }
        if (dVar.f31871a == 0) {
            return "";
        }
        if (TextUtils.isEmpty(dVar.f31872b)) {
            return "Failure to submit, please try again.";
        }
        return dVar.f31872b;
    }
}
