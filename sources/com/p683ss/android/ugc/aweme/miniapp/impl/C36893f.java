package com.p683ss.android.ugc.aweme.miniapp.impl;

import android.content.Context;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36923e;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.f */
public class C36893f implements C36923e {

    /* renamed from: a */
    public static final String f94273a = "f";

    /* renamed from: a */
    public final void mo76121a(String str) {
        AppLog.onActivityCreate(str);
    }

    /* renamed from: b */
    public final void mo76125b(String str, JSONObject jSONObject) {
        C18894a.m46006a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo76123a(String str, JSONObject jSONObject) {
        C23131p.m57779a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo76119a(Context context, String str, int i) {
        AppLog.onPause(context, str, i);
    }

    /* renamed from: b */
    public final void mo76124b(Context context, String str, int i) {
        AppLog.onResume(context, str, i);
    }

    /* renamed from: a */
    public final void mo76122a(String str, int i, JSONObject jSONObject) {
        C9951d.m19996a(str, i, jSONObject);
    }

    /* renamed from: a */
    public final void mo76120a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        try {
            TeaAgent.onEvent((Context) null, str, str2, str3, j, j2, jSONObject);
        } catch (Exception unused) {
        }
    }
}
