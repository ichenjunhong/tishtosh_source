package com.p683ss.android.common.applog.p1142a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.common.applog.TaskSessionDao;
import com.p683ss.android.common.applog.TeaThread;
import com.p683ss.android.deviceregister.p1154a.C19002a;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.common.applog.a.b */
public final class C18870b {

    /* renamed from: a */
    Context f52050a;

    /* renamed from: a */
    public final void mo38671a() {
        m45958a("");
    }

    /* renamed from: a */
    public final void mo38672a(C18880d dVar) {
        TaskSessionDao.inst(this.f52050a).saveTaskSession(dVar);
    }

    C18870b(Context context) {
        this.f52050a = context.getApplicationContext();
        TaskSessionDao.inst(context);
        TeaThread.getInst().ensureTeaThreadLite(new Runnable() {
            public final void run() {
                C18880d a = C18880d.m45970a(C35807d.m80935a(C18870b.this.f52050a, C19002a.m46175a(), 0).getString("key_task_session", ""));
                if (a != null) {
                    C18870b.this.mo38672a(a);
                }
                C18870b.this.mo38671a();
            }
        });
    }

    /* renamed from: a */
    private void m45958a(String str) {
        if (str == null) {
            str = "";
        }
        try {
            Editor edit = C35807d.m80935a(this.f52050a, C19002a.m46175a(), 0).edit();
            edit.putString("key_task_session", str);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo38673b(C18880d dVar) {
        if (dVar != null) {
            new StringBuilder("saveTaskSessionToSp : ").append(dVar);
            m45958a(dVar.mo38688a());
        }
    }
}
