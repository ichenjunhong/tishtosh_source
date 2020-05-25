package com.p683ss.android.ugc.rhea.p2500b;

import android.content.Context;
import com.p683ss.android.ugc.rhea.C50164a;
import com.p683ss.android.ugc.rhea.C50173b;
import com.p683ss.android.ugc.rhea.p2499a.C50165a;
import com.p683ss.android.ugc.rhea.p2499a.C50165a.C50167a;
import com.p683ss.android.ugc.rhea.p2499a.C50168b;
import com.p683ss.android.ugc.rhea.p2499a.C50171c;
import com.p683ss.android.ugc.rhea.p2501c.C50176a;
import com.p683ss.android.ugc.rhea.p2502d.C50177a;
import java.util.List;
import java.util.Stack;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.rhea.b.b */
public final class C50175b extends C50174a {

    /* renamed from: a */
    public static volatile boolean f125706a;

    /* renamed from: b */
    public static final C50175b f125707b = new C50175b();

    private C50175b() {
    }

    /* renamed from: a */
    public static boolean m108281a() {
        return f125706a;
    }

    /* renamed from: a */
    public static void m108280a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        if (z) {
            C50177a.f125711b.cancel(C50177a.f125710a.hashCode());
        }
        f125706a = false;
        if (C50173b.f125704b) {
            C50168b.m108278a();
        } else {
            synchronized (C50176a.f125708a) {
                if (!C50176a.f125708a.isEmpty()) {
                    List<C50171c> list = C50176a.f125708a;
                    if ("component".equals(C50173b.m108279a())) {
                        if (list.size() > 100) {
                            C50165a.f125684a.clear();
                        }
                        C50165a.f125684a.addAll(list);
                    } else {
                        C50164a.m108277b().execute(new C50167a(list));
                    }
                    C50176a.f125708a.clear();
                }
            }
            Stack stack = (Stack) C50176a.f125709b.get();
            if (stack == null) {
                stack = new Stack();
                C50176a.f125709b.set(stack);
            }
            stack.clear();
        }
        C50168b.m108278a();
        if (!z) {
            C50177a.m108282a();
        }
    }
}
