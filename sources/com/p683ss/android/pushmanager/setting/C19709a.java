package com.p683ss.android.pushmanager.setting;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.message.C19408a;
import com.p683ss.android.pushmanager.C19703i;
import com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.C19708b;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.setting.a */
public class C19709a {

    /* renamed from: b */
    private static C19709a f54257b;

    /* renamed from: a */
    public SharedPreferences f54258a;

    /* renamed from: c */
    private C19708b f54259c;

    /* renamed from: c */
    public final boolean mo41087c() {
        return this.f54259c.mo41083b();
    }

    /* renamed from: d */
    private String m48168d() {
        return this.f54259c.mo41081a("ssids", "");
    }

    private C19709a() {
        Application a = C19408a.m47500a();
        this.f54259c = PushMultiProcessSharedProvider.m48146a(a);
        this.f54258a = C35807d.m80935a(a, "push_multi_process_config", 4);
    }

    /* renamed from: b */
    public final String mo41085b() {
        HashMap hashMap = new HashMap();
        mo41086b(hashMap);
        return (String) hashMap.get(C19703i.f54232a);
    }

    /* renamed from: a */
    public static synchronized C19709a m48167a() {
        C19709a aVar;
        synchronized (C19709a.class) {
            if (f54257b == null) {
                synchronized (C19709a.class) {
                    if (f54257b == null) {
                        f54257b = new C19709a();
                    }
                }
            }
            aVar = f54257b;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo41084a(Map<String, String> map) {
        if (map != null) {
            try {
                this.f54259c.mo41080a().mo41074a("ssids", C9431p.m18662a(map)).mo41076a();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo41086b(Map<String, String> map) {
        if (map != null) {
            try {
                String d = m48168d();
                if (!C9431p.m18664a(d)) {
                    C9431p.m18663a(d, map);
                }
            } catch (Exception unused) {
            }
        }
    }
}
