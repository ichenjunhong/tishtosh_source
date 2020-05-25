package com.p683ss.android.ugc.aweme.freeflowcard.strategy;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.strategy.f */
public class C32497f implements C32495d {

    /* renamed from: a */
    public static volatile boolean f84596a = true;

    /* renamed from: b */
    private static volatile C32497f f84597b;

    /* renamed from: c */
    private boolean f84598c;

    protected C32497f() {
    }

    /* renamed from: b */
    public boolean mo65808b() {
        return C23718g.m58207b().mo49152c();
    }

    /* renamed from: a */
    public static C32497f m75248a() {
        if (f84597b == null) {
            synchronized (C32497f.class) {
                if (f84597b == null) {
                    f84597b = new C32497f();
                }
            }
        }
        return f84597b;
    }

    /* renamed from: a */
    public boolean mo65807a(boolean z) {
        if (C10181b.m20511a().mo18168a(EnableWifiToastExperiment.class, false, "is_wifi_toast", 31744, 0) == 0) {
            return true;
        }
        C32474a.m75189a();
        if (C32474a.m75190c()) {
            return true;
        }
        if (f84596a) {
            return f84596a;
        }
        if (this.f84598c) {
            return true;
        }
        this.f84598c = true;
        return false;
    }
}
