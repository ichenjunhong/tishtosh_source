package com.p683ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.utils.C47818dm;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod */
public final class NoticePermissionMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24164a f64094b = new C24164a(null);

    /* renamed from: c */
    private final String f64095c = "noticePermission";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod$a */
    public static final class C24164a {
        private C24164a() {
        }

        public /* synthetic */ C24164a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64095c;
    }

    public NoticePermissionMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        Activity activity;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        Context e = mo18743e();
        if (e != null) {
            if (e instanceof Activity) {
                activity = (Activity) e;
            } else {
                activity = null;
            }
            if (activity != null) {
                if (!(activity instanceof AbsActivity) || ((AbsActivity) activity).isActive()) {
                    boolean optBoolean = jSONObject.optBoolean("toOpen");
                    boolean a = C47818dm.m103457a(e);
                    if (!a && optBoolean) {
                        try {
                            C47818dm.m103459b(e);
                        } catch (Exception unused) {
                            e.startActivity(new Intent("android.settings.SETTINGS"));
                        }
                    }
                    if (a) {
                        aVar.mo49911a((Object) "");
                    } else {
                        aVar.mo49910a(0, "");
                    }
                }
            }
        }
    }
}
