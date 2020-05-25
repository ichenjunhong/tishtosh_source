package com.p683ss.android.ugc.aweme.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.debugbox.base.C9732a;
import com.bytedance.debugbox.base.C9733b;
import com.bytedance.debugbox.base.IDebugBoxService;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jirafast.p749b.C11997a;
import com.bytedance.jirafast.p749b.C11999c;
import com.bytedance.jirafast.p749b.C12003g;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.app.p1380j.C23110b;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.util.crony.C47616a;
import com.p683ss.android.ugc.aweme.util.crony.C47618b;
import com.p683ss.android.ugc.aweme.util.crony.C47619c;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.util.j */
public final class C47626j {

    /* renamed from: a */
    private static C12003g f120093a = C47628k.f120096a;

    /* renamed from: b */
    private static C11997a f120094b = C47629l.f120097a;

    /* renamed from: a */
    public static IDebugBoxService m103105a() {
        return C47633p.m103120c();
    }

    /* renamed from: i */
    private static List<String> m103115i() {
        return new ArrayList();
    }

    /* renamed from: b */
    public static boolean m103108b() {
        if (!m103112f() || C23110b.m56677b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m103109c() {
        if (C35837h.m80977b()) {
            return "tiktok";
        }
        return "musical.ly";
    }

    /* renamed from: d */
    private static String m103110d() {
        return "16.0.41".substring(0, "16.0.41".lastIndexOf(ClassUtils.PACKAGE_SEPARATOR));
    }

    /* renamed from: e */
    private static String m103111e() {
        if (C35837h.m80977b()) {
            return "[Android][T]";
        }
        return "[Android][M]";
    }

    /* renamed from: f */
    private static boolean m103112f() {
        return TextUtils.equals(C11010c.m22295p(), "lark_inhouse");
    }

    /* renamed from: g */
    private static boolean m103113g() {
        return TextUtils.equals(C11010c.m22295p(), "local_test");
    }

    /* renamed from: h */
    private static List<String> m103114h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity");
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
        arrayList.add("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity");
        arrayList.add("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity");
        arrayList.add("com.ss.android.ugc.aweme.live.LiveFeedActivity");
        return arrayList;
    }

    /* renamed from: a */
    public static void m103106a(Activity activity) {
        if (m103108b()) {
            m103105a().forceShowFloatingButton(activity);
        }
    }

    /* renamed from: a */
    public static void m103107a(final Application application) {
        String str;
        if (C18920g.m46048a(application)) {
            if (m103108b()) {
                String p = C11010c.m22295p();
                if (C35837h.m80977b()) {
                    str = "http://api21-h2.tiktokv.com/aweme/v1/";
                } else {
                    str = "http://api2-19-h2.musical.ly/aweme/v1/";
                }
                String str2 = str;
                int i = C23018b.f61359a;
                String c = m103109c();
                String d = m103110d();
                String e = m103111e();
                StringBuilder sb = new StringBuilder("\nDeviceId:");
                sb.append(AppLog.getServerDeviceId());
                sb.append("\nVersion Name:16.0.41");
                sb.append("\nVersion Code:160041");
                C11999c cVar = new C11999c("https://jira.bytedance.com/rest/api/2", "AME", "feedback2", "feedback2", i, c, d, e, sb.toString(), p, true, str2);
                C9732a a = C9732a.m19502a(cVar, 1, C23018b.f61359a, "16.0.41", 160041, C23859b.m58575b().mo49472b((Context) application, "aweme_commerce_anywheredoor", false), false);
                a.f26493h = !m103113g();
                a.f26494i = false;
                a.f26496k = false;
                a.f26497l = true;
                a.f26498m = m103114h();
                a.f26499n = m103115i();
                a.f26495j = false;
                a.f26500o = new C9733b() {
                };
                m103105a().initialize(application, a);
                m103105a().mo22739a(f120093a);
                m103105a().mo22737a(f120094b);
            }
            if (m103113g()) {
                C47616a.m103092a(application);
                C47616a.m103093a((C47619c) new C47618b());
            }
        }
    }
}
