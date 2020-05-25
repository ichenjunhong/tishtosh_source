package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f;

import android.view.View;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11182d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35468e;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f.a */
public final class C33453a {

    /* renamed from: a */
    public static String f86701a = "";

    /* renamed from: b */
    public static final C33453a f86702b = new C33453a();

    /* renamed from: c */
    private static final int f86703c;

    /* renamed from: d */
    private static final int f86704d;

    private C33453a() {
    }

    /* renamed from: a */
    public static final boolean m76675a() {
        if ((f86703c & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m76679b() {
        if ((f86703c & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m76680c() {
        if ((f86703c & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m76681d() {
        if ((f86703c & 8) == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m76682e() {
        if ((f86704d & 16) == 16) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m76683f() {
        if ((f86704d & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m76684g() {
        if ((f86704d & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m76685h() {
        if ((f86704d & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m76686i() {
        if ((f86704d & 8) == 8) {
            return true;
        }
        return false;
    }

    static {
        int i;
        int i2;
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
        C35468e iMSetting = f.getIMSetting();
        if (iMSetting != null) {
            i = iMSetting.f91155m;
        } else {
            i = 5;
        }
        f86703c = i;
        if (iMSetting != null) {
            i2 = iMSetting.f91156n;
        } else {
            i2 = 3;
        }
        f86704d = i2;
    }

    /* renamed from: a */
    public static final boolean m76678a(String str) {
        if (str != null) {
            return m76677a(C11182d.m22641a().mo20658a(str));
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m76677a(C11180b bVar) {
        if (bVar != null) {
            C11181c coreInfo = bVar.getCoreInfo();
            if (coreInfo != null) {
                Map ext = coreInfo.getExt();
                if (ext != null && C52711k.m112239a((Object) "1", (Object) (String) ext.get("a:s_author_im_supporter"))) {
                    return true;
                }
            }
            Map localExt = bVar.getLocalExt();
            if (localExt != null && C52711k.m112239a((Object) "1", (Object) (String) localExt.get("a:s_author_im_supporter"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m76676a(View view, View view2, View view3, View view4) {
        boolean z;
        if (!m76683f()) {
            if (view != null) {
                view.setVisibility(8);
            }
            z = true;
        } else {
            z = false;
        }
        if (m76684g()) {
            z = false;
        } else if (view2 != null) {
            view2.setVisibility(8);
        }
        if (m76685h()) {
            z = false;
        } else if (view3 != null) {
            view3.setVisibility(8);
        }
        if (m76686i()) {
            return false;
        }
        if (view4 == null) {
            return z;
        }
        view4.setVisibility(8);
        return z;
    }
}
