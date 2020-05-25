package com.p683ss.android.ugc.aweme.p2377ug.amplify;

import android.app.Activity;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.p2377ug.amplify.p2379ui.C47432a;
import com.p683ss.android.ugc.aweme.setting.PopupSettingManager;
import com.p683ss.android.ugc.aweme.setting.model.PopupSetting;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.a */
public final class C47425a implements C9382a {

    /* renamed from: a */
    public static WeakReference<Activity> f119653a;

    /* renamed from: b */
    public static C9381g f119654b;

    /* renamed from: c */
    public static final C47425a f119655c;

    private C47425a() {
    }

    static {
        C47425a aVar = new C47425a();
        f119655c = aVar;
        f119654b = new C9381g(aVar);
    }

    public final void handleMsg(Message message) {
        C52711k.m112240b(message, "msg");
        WeakReference<Activity> weakReference = f119653a;
        if (weakReference == null) {
            C52711k.m112237a("activityRef");
        }
        Activity activity = (Activity) weakReference.get();
        if (activity != null && !activity.isFinishing() && message.what == 3) {
            PopupSetting a = PopupSettingManager.m91328a().mo85285a("ugc_permission_v2");
            if (a != null) {
                new C47432a(activity, a).show();
            }
        }
    }
}
