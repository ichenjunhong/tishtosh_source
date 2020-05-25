package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.EnterUserPostFeedsMethod */
public class EnterUserPostFeedsMethod extends BaseCommonJavaMethod {
    public EnterUserPostFeedsMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) throws JSONException {
        Context context;
        String str;
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
                String optString = jSONObject.optString("user_id");
                int optInt = jSONObject.optInt("task");
                C41302w a = C41302w.m91042a();
                C41311y a2 = C41311y.m91065a("aweme://aweme/detail/0");
                String str2 = "video_from";
                if (TextUtils.equals(C20902b.m53242a().getCurUserId(), optString)) {
                    str = "from_profile_self";
                } else {
                    str = "from_profile_other";
                }
                a.mo83858a(activity, a2.mo83870a(str2, str).mo83868a("video_type", 0).mo83870a("userid", optString).mo83868a("task_type", optInt).mo83871a());
            }
        }
    }
}
