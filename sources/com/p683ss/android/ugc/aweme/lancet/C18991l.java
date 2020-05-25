package com.p683ss.android.ugc.aweme.lancet;

import android.os.Looper;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.host.HostApplication;

/* renamed from: com.ss.android.ugc.aweme.lancet.l */
public class C18991l {

    /* renamed from: a */
    public static boolean f52294a;

    /* renamed from: b */
    public static volatile boolean f52295b;

    /* renamed from: c */
    public static HostApplication f52296c;

    public static void setupGraph() {
        C18992m.setupGraph();
    }

    /* renamed from: a */
    public static boolean m46167a() {
        return C18920g.m46048a(C11010c.m22280a());
    }

    /* renamed from: b */
    public static boolean m46168b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
