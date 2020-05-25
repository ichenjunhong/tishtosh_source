package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.feedback.C31280i;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1149d.p1150a.C18964a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47792cx;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog */
public class FeedbackUploadALog extends BaseCommonJavaMethod {
    public FeedbackUploadALog() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public JSONObject mo95790c() {
        JSONObject jSONObject = new JSONObject();
        m104611a(jSONObject);
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableFeedbackLog()) {
            try {
                String a = C31280i.m73008a();
                if (!TextUtils.isEmpty(a)) {
                    jSONObject.put("aweme_infra_log", a);
                }
            } catch (Exception unused) {
            }
        }
        String a2 = C47792cx.m103422a();
        if (!TextUtils.isEmpty(a2)) {
            try {
                jSONObject.put("logout_info", a2);
            } catch (JSONException unused2) {
            }
        }
        return jSONObject;
    }

    public FeedbackUploadALog(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static void m104611a(JSONObject jSONObject) {
        if (C31300c.m73019c()) {
            for (Entry entry : C31300c.m73018b().entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        C0013i.m18a((Callable<TResult>) new C48357o<TResult>(this), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C48358p<TResult,TContinuationResult>(aVar), C0013i.f25b);
        C18964a.m46136a();
    }
}
