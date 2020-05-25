package com.p683ss.android.ugc.aweme.user.p2384e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.base.C23566n;

/* renamed from: com.ss.android.ugc.aweme.user.e.a */
public class C47574a implements C9382a {

    /* renamed from: b */
    private static volatile C47574a f120025b;

    /* renamed from: a */
    public C9381g f120026a = new C9381g(Looper.getMainLooper(), this);

    public void handleMsg(Message message) {
    }

    private C47574a() {
    }

    /* renamed from: a */
    public static C47574a m103025a() {
        if (f120025b == null) {
            synchronized (C47574a.class) {
                if (f120025b == null) {
                    f120025b = new C47574a();
                }
            }
        }
        return f120025b;
    }

    /* renamed from: a */
    public static void m103026a(Handler handler, int i) {
        C23566n.m57766a().mo48750a(handler, C47575b.f120027a, 115);
    }
}
