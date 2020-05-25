package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47818dm;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.NoticePermissionMethod */
public class NoticePermissionMethod extends BaseCommonJavaMethod {
    public NoticePermissionMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) throws JSONException {
        Context context;
        Activity activity = null;
        if (this.f77793e != null) {
            context = (Context) this.f77793e.get();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null) {
            if (!(activity instanceof AbsActivity) || ((AbsActivity) activity).isActive()) {
                Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("toOpen"));
                boolean a = C47818dm.m103457a(context);
                if (!a && valueOf.booleanValue()) {
                    try {
                        C47818dm.m103459b(context);
                    } catch (Exception unused) {
                        context.startActivity(new Intent("android.settings.SETTINGS"));
                    }
                }
                if (a) {
                    aVar.mo60039a((Object) "");
                } else {
                    aVar.mo60038a(0, "");
                }
            }
        }
    }
}
