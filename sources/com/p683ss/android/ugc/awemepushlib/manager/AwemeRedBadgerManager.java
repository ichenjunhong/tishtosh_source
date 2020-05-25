package com.p683ss.android.ugc.awemepushlib.manager;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0201u;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.statisticlogger.C11049a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.newmedia.redbadge.C19610g;
import com.p683ss.android.newmedia.redbadge.C19611h;
import com.p683ss.android.newmedia.redbadge.p1200b.C19598a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.pushmanager.C19700f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.awemepushlib.interaction.C48445d;
import com.p683ss.android.ugc.awemepushlib.p2406a.C48428b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager */
public class AwemeRedBadgerManager implements GenericLifecycleObserver {

    /* renamed from: b */
    private static AwemeRedBadgerManager f121850b = new AwemeRedBadgerManager();

    /* renamed from: a */
    C19611h f121851a = C19611h.m47955a();

    /* renamed from: c */
    private boolean f121852c = "oppo".equalsIgnoreCase(Build.BRAND);

    /* renamed from: d */
    private boolean f121853d = "vivo".equalsIgnoreCase(Build.BRAND);

    /* renamed from: e */
    private boolean f121854e;

    /* renamed from: a */
    public static AwemeRedBadgerManager m104871a() {
        return f121850b;
    }

    /* renamed from: b */
    public final void mo95928b() {
        C0201u.m422a().getLifecycle().mo324a(this);
    }

    public AwemeRedBadgerManager() {
        boolean z;
        if (this.f121852c || this.f121853d) {
            z = true;
        } else {
            z = false;
        }
        this.f121854e = z;
    }

    /* renamed from: b */
    public final void mo95929b(Context context) {
        if (C48445d.f121813b == 0 || C48445d.f121813b == 2) {
            this.f121851a.mo40865a(context);
        }
    }

    /* renamed from: a */
    public static void m104872a(Context context) {
        try {
            if (!C9431p.m18664a(C11049a.m22366b()) && !C9431p.m18664a(C11049a.m22367c())) {
                C19598a.m47924a(context).mo40847c(AppLog.getSessionKey());
                C19598a.m47924a(context).mo40849d(C48482d.m104915a());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static String m104876c(Context context) {
        ResolveInfo resolveInfo;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        try {
            resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null || resolveInfo.activityInfo == null) {
            return "";
        }
        return resolveInfo.activityInfo.packageName;
    }

    /* renamed from: a */
    private void m104873a(Context context, int i) throws C19610g {
        this.f121851a.mo40867b(context, i);
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        if (aVar == C0177a.ON_START) {
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    AwemeRedBadgerManager.this.mo95929b(C32463a.m75161a());
                }
            });
        }
    }

    /* renamed from: a */
    public final boolean mo95927a(Context context, C48428b bVar) {
        String str;
        boolean z;
        try {
            boolean z2 = true;
            if (1 != bVar.extra.redBadgeOnly || bVar.extra.badgeCount < 0) {
                if (bVar.extra.badgeCount >= 0) {
                    String str2 = "";
                    try {
                        m104873a(context, bVar.extra.badgeCount);
                    } catch (C19610g e) {
                        str2 = Log.getStackTraceString(e);
                        z2 = false;
                    }
                    m104874a(context, bVar.extra.badgeCount, z2, str2, bVar);
                    m104875b(context, bVar.extra.badgeCount, z2, str2, bVar);
                }
                return false;
            }
            String str3 = "";
            m104873a(context, bVar.extra.badgeCount);
            str = str3;
            z = true;
            m104874a(context, bVar.extra.badgeCount, z, str, bVar);
            m104875b(context, bVar.extra.badgeCount, z, str, bVar);
            return true;
        } catch (C19610g e2) {
            str = Log.getStackTraceString(e2);
            z = false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m104874a(Context context, int i, boolean z, String str, C48428b bVar) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putInt("success", z ? 1 : 0);
        if (!z) {
            String str3 = "stack_info";
            if (str == null) {
                str = "";
            }
            bundle.putString(str3, str);
        }
        String c = m104876c(context);
        String str4 = "launcher_package";
        if (c == null) {
            c = "";
        }
        bundle.putString(str4, c);
        long j = (long) bVar.f121792id;
        try {
            if (!C9431p.m18664a(bVar.openUrl)) {
                Uri parse = Uri.parse(bVar.openUrl);
                if (parse != null) {
                    long parseLong = Long.parseLong(parse.getQueryParameter("push_id"));
                    if (parseLong > 0) {
                        j = parseLong;
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        bundle.putLong("rule_id", j);
        String str5 = "show_type";
        if (1 == bVar.extra.redBadgeOnly) {
            str2 = "receive";
        } else {
            str2 = "with_artical";
        }
        bundle.putString(str5, str2);
        C26890h.m65009a("red_badge_receive", bundle);
    }

    /* renamed from: b */
    private static void m104875b(Context context, int i, boolean z, String str, C48428b bVar) {
        String str2;
        if (context != null) {
            try {
                C19700f.m48124a().mo41056a(context, "umeng", "red_badge", "destop_red_badge", (long) i, 0, new JSONObject());
            } catch (Throwable unused) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("badge_number", i);
        bundle.putInt("success", z ? 1 : 0);
        if (!z) {
            String str3 = "stack_info";
            if (str == null) {
                str = "";
            }
            bundle.putString(str3, str);
        }
        String c = m104876c(context);
        String str4 = "launcher_package";
        if (c == null) {
            c = "";
        }
        bundle.putString(str4, c);
        String str5 = "show_type";
        if (1 == bVar.extra.redBadgeOnly) {
            str2 = "receive";
        } else {
            str2 = "with_artical";
        }
        bundle.putString(str5, str2);
        long j = (long) bVar.f121792id;
        try {
            if (!C9431p.m18664a(bVar.openUrl)) {
                Uri parse = Uri.parse(bVar.openUrl);
                if (parse != null) {
                    long parseLong = Long.parseLong(parse.getQueryParameter("push_id"));
                    if (parseLong > 0) {
                        j = parseLong;
                    }
                }
            }
        } catch (NumberFormatException unused2) {
        }
        bundle.putLong("rule_id", j);
        C26890h.m65009a("red_badge_show", bundle);
    }
}
