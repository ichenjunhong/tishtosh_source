package com.p683ss.android.ugc.aweme.p2377ug.p2378a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.a.b */
public final class C47411b {

    /* renamed from: a */
    public static final C47423f f119628a = new C47423f();

    /* renamed from: b */
    public static final C47411b f119629b = new C47411b();

    /* renamed from: com.ss.android.ugc.aweme.ug.a.b$a */
    static final class C47412a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f119630a;

        /* renamed from: b */
        final /* synthetic */ String f119631b;

        C47412a(String str, String str2) {
            this.f119630a = str;
            this.f119631b = str2;
        }

        public final /* synthetic */ Object call() {
            Context a = C11010c.m22280a();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f119630a);
            sb.append(this.f119631b);
            C10691a.m21537a(a, sb.toString()).mo19066a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.a.b$b */
    public static final class C47413b implements OnClickListener {

        /* renamed from: a */
        public static final C47413b f119632a = new C47413b();

        C47413b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C47411b.f119628a.mo94704c(!C47411b.f119628a.f119651g);
            C10691a.m21537a(C11010c.m22280a(), "debug 开关状态切换成功").mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.a.b$c */
    public static final class C47414c implements OnClickListener {

        /* renamed from: a */
        public static final C47414c f119633a = new C47414c();

        C47414c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            new C47423f().f119645a.clear();
            C10691a.m21537a(C11010c.m22280a(), "清除数据成功").mo19066a();
        }
    }

    private C47411b() {
    }

    /* renamed from: a */
    public static void m102789a(String str) {
        C52711k.m112240b(str, "msg");
        if (f119628a.f119651g) {
            C0013i.m18a((Callable<TResult>) new C47412a<TResult>("点赞后弹窗 ", str), C0013i.f25b);
        }
    }

    /* renamed from: b */
    public final void mo94690b(String str) {
        C52711k.m112240b(str, "msg");
        StringBuilder sb = new StringBuilder("tryShow But:");
        sb.append(str);
        m102789a(sb.toString());
    }
}
