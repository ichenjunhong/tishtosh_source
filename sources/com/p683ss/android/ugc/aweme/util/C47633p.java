package com.p683ss.android.ugc.aweme.util;

import android.app.Activity;
import android.app.Application;
import com.bytedance.debugbox.base.C9732a;
import com.bytedance.debugbox.base.IDebugBoxService;
import com.bytedance.jirafast.p749b.C11997a;
import com.bytedance.jirafast.p749b.C12000d;
import com.bytedance.jirafast.p749b.C12003g;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.p1632di.C27610ax;

/* renamed from: com.ss.android.ugc.aweme.util.p */
public class C47633p implements IDebugBoxService {
    /* renamed from: c */
    public static IDebugBoxService m103120c() {
        if (C27991b.f73523s == null) {
            synchronized (IDebugBoxService.class) {
                if (C27991b.f73523s == null) {
                    C27991b.f73523s = C27610ax.m66286a();
                }
            }
        }
        return (IDebugBoxService) C27991b.f73523s;
    }

    /* renamed from: a */
    public final void mo22735a() {
    }

    /* renamed from: a */
    public final void mo22736a(Activity activity) {
    }

    /* renamed from: a */
    public final void mo22737a(C11997a aVar) {
    }

    /* renamed from: a */
    public final void mo22738a(C12000d dVar) {
    }

    /* renamed from: a */
    public final void mo22739a(C12003g gVar) {
    }

    /* renamed from: a */
    public final void mo22740a(String str) {
    }

    /* renamed from: b */
    public final void mo22741b() {
    }

    public void disableFloating() {
    }

    public void forceShowFloatingButton(Activity activity) {
    }

    public void initialize(Application application, C9732a aVar) {
    }
}
