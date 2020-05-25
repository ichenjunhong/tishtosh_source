package com.bytedance.ies.dmt.p664ui.p668d;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10679d;
import com.bytedance.ies.dmt.p664ui.p669e.C10703a;
import com.p683ss.android.ugc.aweme.utils.C47904fx;
import java.util.List;

/* renamed from: com.bytedance.ies.dmt.ui.d.a */
public final class C10691a {

    /* renamed from: a */
    private int f28476a;

    /* renamed from: b */
    private int f28477b;

    /* renamed from: c */
    private int f28478c;

    /* renamed from: d */
    private int f28479d;

    /* renamed from: e */
    private String f28480e;

    /* renamed from: f */
    private Context f28481f;

    /* renamed from: c */
    public static C10691a m21551c(Context context, String str) {
        return C10692b.m21557a(context, str);
    }

    /* renamed from: a */
    public final void mo19066a() {
        try {
            if (this.f28481f == null || TextUtils.isEmpty(this.f28480e) || !m21555e(this.f28481f, this.f28481f.getPackageName())) {
                return;
            }
            if (C10679d.m21506a().f28436a) {
                C10693c.m21558a(this.f28481f).mo19067a(this.f28480e, this.f28476a, this.f28477b, this.f28478c);
            } else {
                C9432q.m18676a(this.f28481f, this.f28480e);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static int m21541b() {
        if (C10703a.m21576a()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: d */
    public static C10691a m21554d(Context context, String str) {
        return m21553c(context, str, 1, m21541b());
    }

    /* renamed from: a */
    public static C10691a m21533a(Context context, int i) {
        if (C47904fx.m103628a(context)) {
            Context context2 = context;
            C10691a aVar = new C10691a(context2, context.getString(i), 1, 1, 2, (int) C9432q.m18687b(context, 12.0f));
            return aVar;
        } else if (C47904fx.m103629b(context)) {
            return m21535a(context, i, 1, 2);
        } else {
            return m21539a(context, context.getString(i), 1, m21541b());
        }
    }

    /* renamed from: b */
    public static C10691a m21542b(Context context, int i) {
        if (C47904fx.m103628a(context)) {
            return m21536a(context, i, 1, 2, (int) C9432q.m18687b(context, 12.0f));
        }
        if (C47904fx.m103629b(context)) {
            return m21544b(context, i, 1, 2);
        }
        return m21547b(context, context.getString(i), 1, m21541b());
    }

    /* renamed from: c */
    public static C10691a m21548c(Context context, int i) {
        if (C47904fx.m103628a(context)) {
            Context context2 = context;
            C10691a aVar = new C10691a(context2, context.getString(i), 1, 3, 2, (int) C9432q.m18687b(context, 12.0f));
            return aVar;
        } else if (C47904fx.m103629b(context)) {
            return m21550c(context, i, 1, 2);
        } else {
            return m21553c(context, context.getString(i), 1, m21541b());
        }
    }

    /* renamed from: e */
    private static boolean m21555e(Context context, String str) {
        if (context == null || C9431p.m18664a(str)) {
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (VERSION.SDK_INT < 21) {
            List runningTasks = activityManager.getRunningTasks(1);
            if (!runningTasks.isEmpty()) {
                ComponentName componentName = ((RunningTaskInfo) runningTasks.get(0)).topActivity;
                if (componentName == null || !str.equals(componentName.getPackageName())) {
                    return false;
                }
                return true;
            }
        } else {
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.processName != null && runningAppProcessInfo.processName.startsWith(str) && runningAppProcessInfo.importance == 100) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C10691a m21537a(Context context, String str) {
        if (C47904fx.m103628a(context)) {
            C10691a aVar = new C10691a(context, str, 1, 1, 2, (int) C9432q.m18687b(context, 12.0f));
            return aVar;
        } else if (C47904fx.m103629b(context)) {
            return m21539a(context, str, 1, 2);
        } else {
            return m21539a(context, str, 1, m21541b());
        }
    }

    /* renamed from: b */
    public static C10691a m21545b(Context context, String str) {
        if (C47904fx.m103628a(context)) {
            C10691a aVar = new C10691a(context, str, 1, 2, 2, (int) C9432q.m18687b(context, 12.0f));
            return aVar;
        } else if (C47904fx.m103629b(context)) {
            return m21547b(context, str, 1, 2);
        } else {
            return m21547b(context, str, 1, m21541b());
        }
    }

    /* renamed from: a */
    public static C10691a m21534a(Context context, int i, int i2) {
        return m21535a(context, i, i2, m21541b());
    }

    /* renamed from: c */
    public static C10691a m21549c(Context context, int i, int i2) {
        return m21550c(context, i, i2, m21541b());
    }

    /* renamed from: b */
    public static C10691a m21543b(Context context, int i, int i2) {
        return m21544b(context, i, i2, m21541b());
    }

    /* renamed from: c */
    public static C10691a m21552c(Context context, String str, int i) {
        return m21553c(context, str, i, m21541b());
    }

    /* renamed from: a */
    public static C10691a m21538a(Context context, String str, int i) {
        return m21539a(context, str, i, m21541b());
    }

    /* renamed from: b */
    public static C10691a m21546b(Context context, String str, int i) {
        return m21547b(context, str, i, m21541b());
    }

    /* renamed from: a */
    public static C10691a m21535a(Context context, int i, int i2, int i3) {
        C10691a aVar = new C10691a(context, context.getString(i), i2, 1, i3, 0);
        return aVar;
    }

    /* renamed from: c */
    public static C10691a m21550c(Context context, int i, int i2, int i3) {
        C10691a aVar = new C10691a(context, context.getString(i), i2, 3, i3, 0);
        return aVar;
    }

    /* renamed from: b */
    public static C10691a m21544b(Context context, int i, int i2, int i3) {
        C10691a aVar = new C10691a(context, context.getString(i), i2, 2, i3, 0);
        return aVar;
    }

    /* renamed from: c */
    public static C10691a m21553c(Context context, String str, int i, int i2) {
        C10691a aVar = new C10691a(context, str, i, 3, i2, 0);
        return aVar;
    }

    /* renamed from: a */
    public static C10691a m21539a(Context context, String str, int i, int i2) {
        C10691a aVar = new C10691a(context, str, i, 1, i2, 0);
        return aVar;
    }

    /* renamed from: b */
    public static C10691a m21547b(Context context, String str, int i, int i2) {
        C10691a aVar = new C10691a(context, str, i, 2, i2, 0);
        return aVar;
    }

    /* renamed from: a */
    public static C10691a m21536a(Context context, int i, int i2, int i3, int i4) {
        C10691a aVar = new C10691a(context, context.getString(i), 1, 2, 2, i4);
        return aVar;
    }

    /* renamed from: a */
    public static C10691a m21540a(Context context, String str, int i, int i2, int i3) {
        C10691a aVar = new C10691a(context, str, 1, 3, 2, i3);
        return aVar;
    }

    private C10691a(Context context, String str, int i, int i2, int i3, int i4) {
        this.f28480e = str;
        this.f28476a = i;
        this.f28479d = i2;
        this.f28481f = context;
        this.f28477b = i3;
        this.f28478c = i4;
    }
}
