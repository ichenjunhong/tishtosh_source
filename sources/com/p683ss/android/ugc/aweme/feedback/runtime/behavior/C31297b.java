package com.p683ss.android.ugc.aweme.feedback.runtime.behavior;

import android.arch.p011c.p014b.C0141e;
import android.arch.p011c.p014b.C0142f;
import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b */
public final class C31297b {

    /* renamed from: b */
    public static C31297b f82047b = C31299b.f82050a;

    /* renamed from: c */
    public static final C31298a f82048c = new C31298a(null);

    /* renamed from: a */
    final RuntimeBehaviorDataBase f82049a;

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b$a */
    public static final class C31298a {
        private C31298a() {
        }

        public /* synthetic */ C31298a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b$b */
    static final class C31299b {

        /* renamed from: a */
        static final C31297b f82050a = new C31297b(C11010c.m22280a(), null);

        /* renamed from: b */
        public static final C31299b f82051b = new C31299b();

        private C31299b() {
        }
    }

    private C31297b(Context context) {
        C0142f b = C0141e.m302a(context, RuntimeBehaviorDataBase.class, "runtimeBehavior").mo252b();
        C52711k.m112236a((Object) b, "Room.databaseBuilder(con…runtimeBehavior\").build()");
        this.f82049a = (RuntimeBehaviorDataBase) b;
    }

    public /* synthetic */ C31297b(Context context, C52707g gVar) {
        this(context);
    }
}
