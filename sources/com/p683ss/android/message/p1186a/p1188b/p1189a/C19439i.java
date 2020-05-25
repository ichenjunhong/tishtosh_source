package com.p683ss.android.message.p1186a.p1188b.p1189a;

import com.p683ss.android.pushmanager.p1204a.C19659a;
import com.p683ss.android.pushmanager.setting.C19710b;

/* renamed from: com.ss.android.message.a.b.a.i */
public class C19439i {

    /* renamed from: b */
    private static volatile C19439i f53755b;

    /* renamed from: a */
    public C19659a f53756a = new C19659a(10);

    private C19439i() {
        this.f53756a.mo40999a(C19710b.m48173a().f54262b.mo41081a("self_push_message_ids", ""));
    }

    /* renamed from: a */
    public static C19439i m47582a() {
        if (f53755b == null) {
            synchronized (C19439i.class) {
                if (f53755b == null) {
                    f53755b = new C19439i();
                }
            }
        }
        return f53755b;
    }
}
