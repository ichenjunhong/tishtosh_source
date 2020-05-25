package com.p888c.p889a.p890a.p891a;

import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;
import com.p888c.p889a.p890a.p891a.p892a.C13384a;
import com.p888c.p889a.p890a.p891a.p892a.C13387d;
import com.p888c.p889a.p890a.p891a.p895c.C13407b;
import com.p888c.p889a.p890a.p891a.p895c.C13411d;
import com.p888c.p889a.p890a.p891a.p895c.C13415g;
import com.p888c.p889a.p890a.p891a.p897e.C13422b;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;

/* renamed from: com.c.a.a.a.a */
public final class C13383a {

    /* renamed from: a */
    private static C13405c f34893a = new C13405c();

    /* renamed from: a */
    public static boolean m26982a() {
        return f34893a.f34946a;
    }

    /* renamed from: a */
    public static void m26981a(Context context) {
        C13405c cVar = f34893a;
        Context applicationContext = context.getApplicationContext();
        C13426e.m27071a((Object) applicationContext, "Application Context cannot be null");
        if (!cVar.f34946a) {
            cVar.f34946a = true;
            C13415g a = C13415g.m27045a();
            a.f34969b = new C13387d(new Handler(), applicationContext, new C13384a(), a);
            C13407b.m27027a().f34951a = applicationContext.getApplicationContext();
            if (applicationContext != null) {
                C13422b.f34978b = applicationContext.getResources().getDisplayMetrics().density;
                C13422b.f34977a = (WindowManager) applicationContext.getSystemService("window");
            }
            C13411d.m27033a().f34962a = applicationContext != null ? applicationContext.getApplicationContext() : null;
        }
    }
}
