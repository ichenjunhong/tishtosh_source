package com.p683ss.android.pushmanager.client;

import android.content.Context;
import com.p683ss.android.pushmanager.setting.C19710b;

/* renamed from: com.ss.android.pushmanager.client.g */
public class C19697g {

    /* renamed from: a */
    private static volatile C19697g f54209a;

    /* renamed from: a */
    public static C19697g m48105a() {
        if (f54209a == null) {
            synchronized (C19697g.class) {
                if (f54209a == null) {
                    f54209a = new C19697g();
                }
            }
        }
        return f54209a;
    }

    /* renamed from: b */
    public static void m48108b(Context context, boolean z) {
        C19710b.m48173a().f54262b.mo41080a().mo41075a("shut_push_on_stop_service", z).mo41076a();
    }

    /* renamed from: a */
    public static void m48106a(Context context, String str) {
        C19710b.m48173a().f54262b.mo41080a().mo41074a("uninstall_question_url", str).mo41076a();
    }

    /* renamed from: a */
    public static void m48107a(Context context, boolean z) {
        C19710b.m48173a().f54262b.mo41080a().mo41075a("allow_network", z).mo41076a();
    }
}
