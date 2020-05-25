package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.app.download.p1374a.C23077b;
import com.p683ss.android.ugc.aweme.app.download.p1374a.C23078c;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.JsAppDownloadMethod */
public class JsAppDownloadMethod extends BaseCommonJavaMethod implements C23078c {

    /* renamed from: a */
    private C23077b f77825a;

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.f77825a != null && this.f77793e != null && this.f77793e.get() != null) {
            this.f77825a = null;
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        if (this.f77825a != null && this.f77793e != null && this.f77793e.get() != null) {
            this.f77793e.get();
        }
    }

    public JsAppDownloadMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final BaseCommonJavaMethod mo60035a(WeakReference<Context> weakReference) {
        Context context = (Context) weakReference.get();
        if (context instanceof C0184k) {
            ((C0184k) context).getLifecycle().mo324a(this);
        }
        return super.mo60035a(weakReference);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (this.f77793e != null && this.f77793e.get() != null) {
            if (this.f77825a == null) {
                this.f77825a = C23077b.m56614a((Context) this.f77793e.get(), (C23078c) this);
            }
            String optString = jSONObject.optString("func");
            if (TextUtils.equals("subscribe_app_ad", optString)) {
                C23077b.m56615a((Context) this.f77793e.get(), jSONObject);
                return;
            }
            if (TextUtils.equals("unsubscribe_app_ad", optString)) {
                if (this.f77825a != null) {
                    C23077b.m56616a(jSONObject);
                }
            } else if (TextUtils.equals("download_app_ad", optString)) {
                if (this.f77825a != null) {
                    C23077b.m56617b((Context) this.f77793e.get(), jSONObject);
                }
            } else if (TextUtils.equals("cancel_download_app_ad", optString)) {
                if (this.f77825a != null) {
                    this.f77825a.mo47813b(jSONObject);
                }
            } else if (TextUtils.equals("get_download_pause_task", optString)) {
                if (this.f77825a != null) {
                }
            } else if (TextUtils.equals("get_downloading_task", optString)) {
                if (this.f77825a != null) {
                }
            } else if (TextUtils.equals("get_install_status", optString) && this.f77825a != null) {
                C23077b.m56618c(jSONObject);
            }
        }
    }
}
