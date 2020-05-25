package com.p683ss.android.ugc.aweme.util;

import android.text.TextUtils;
import com.bytedance.business.base.IBusinessToolsService;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jirafast.p749b.C11997a;
import com.bytedance.jirafast.p749b.C12003g;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;

/* renamed from: com.ss.android.ugc.aweme.util.e */
public final class C47621e {

    /* renamed from: a */
    static IBusinessToolsService f120087a;

    /* renamed from: b */
    public static C12003g f120088b = C47623g.f120091a;

    /* renamed from: c */
    public static C11997a f120089c = C47624h.f120092a;

    /* renamed from: b */
    public static boolean m103099b() {
        IBusinessToolsService a = m103098a();
        if (!m103100c() || a == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m103100c() {
        if (TextUtils.equals(C11010c.m22295p(), "business") || TextUtils.equals(C11010c.m22295p(), "release_outer_test")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static IBusinessToolsService m103098a() {
        IBusinessToolsService iBusinessToolsService;
        if (f120087a == null) {
            try {
                Object a = C27991b.m66756a(IBusinessToolsService.class);
                if (a != null) {
                    iBusinessToolsService = (IBusinessToolsService) a;
                } else {
                    iBusinessToolsService = (IBusinessToolsService) C20302a.m50070a(IBusinessToolsService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
                }
                f120087a = iBusinessToolsService;
            } catch (IllegalArgumentException unused) {
                f120087a = null;
            }
        }
        return f120087a;
    }
}
