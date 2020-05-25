package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.p521a.C9373b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29976e;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.utils.C47738bv;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest */
public final class GeckoHighPriorityCheckInRequest implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest$a */
    static final class C41248a implements Runnable {

        /* renamed from: a */
        public static final C41248a f104693a = new C41248a();

        C41248a() {
        }

        public final void run() {
            boolean z;
            String i = C11010c.m22288i();
            CharSequence charSequence = i;
            boolean z2 = true;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Context a = C11010c.m22280a();
                if (a != null) {
                    try {
                        i = C9373b.m18553a(a, "SS_VERSION_NAME");
                    } catch (Throwable unused) {
                    }
                    CharSequence charSequence2 = i;
                    if (!(charSequence2 == null || charSequence2.length() == 0)) {
                        z2 = false;
                    }
                    if (z2) {
                        try {
                            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
                            i = packageInfo != null ? packageInfo.versionName : null;
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(TeaAgent.getServerDeviceId())) {
                if (((Set) SharePrefCache.inst().getGeckoInitialHighPriorityChannels().mo47782d()).isEmpty()) {
                    C23794bh.m58383I().addSettingChangeListener(new C47738bv(i));
                } else {
                    C47731bq.m103351f(i);
                }
                C47731bq.m103347d();
            }
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        try {
            new Handler(Looper.getMainLooper()).post(C41248a.f104693a);
        } catch (Exception e) {
            C29976e.f78229a.mo60155a(e);
        }
    }
}
