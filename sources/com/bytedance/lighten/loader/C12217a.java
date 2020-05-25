package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.lighten.p766a.C12194h;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p964d.C13960d;
import com.facebook.imagepipeline.p964d.C13971h;
import com.facebook.imagepipeline.p964d.C13977i;
import com.facebook.imagepipeline.p964d.C13987q;
import com.facebook.imagepipeline.p964d.C13993v;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p970j.C14040a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14046g;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.bytedance.lighten.loader.a */
public final class C12217a {

    /* renamed from: a */
    public C13971h<C13619c, C14042c> f32289a;

    /* renamed from: b */
    public int f32290b;

    /* renamed from: c */
    private C12231j f32291c;

    /* renamed from: com.bytedance.lighten.loader.a$a */
    static final class C12221a {

        /* renamed from: a */
        public static final C12217a f32297a = new C12217a();
    }

    /* renamed from: b */
    public static C12217a m24686b() {
        return C12221a.f32297a;
    }

    /* renamed from: a */
    public final void mo23152a() {
        if (this.f32289a != null) {
            try {
                this.f32289a.mo26162a();
            } catch (Exception unused) {
            }
        }
    }

    private C12217a() {
        boolean z;
        int i;
        Context a = C12194h.m24638a();
        ActivityManager activityManager = (ActivityManager) a.getSystemService("activity");
        if ((a.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = activityManager.getLargeMemoryClass();
        } else {
            i = activityManager.getMemoryClass();
        }
        int i2 = (int) ((((long) i) * 1048576) / 10);
        WindowManager windowManager = (WindowManager) a.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i3 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4 * 4;
        if (i2 <= i3) {
            if (i2 < 6291456) {
                i3 = 6291456;
            } else {
                i3 = i2;
            }
        }
        this.f32290b = i3;
        this.f32289a = new C13971h<>(new C13993v<C14042c>() {
            /* renamed from: a */
            public final /* synthetic */ int mo23155a(Object obj) {
                return ((C14042c) obj).mo26251b();
            }
        }, new C13960d(), new C13977i((ActivityManager) C12194h.m24638a().getSystemService("activity")) {
            /* renamed from: a */
            public final C13987q mo23157b() {
                C13987q qVar = new C13987q(C12217a.this.f32290b, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                return qVar;
            }
        });
        this.f32291c = new C12231j(C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("bitmap-cache").mo49847a()), 10);
    }

    /* renamed from: a */
    public final C13715a<Bitmap> mo23151a(String str) {
        C13715a a = this.f32289a.mo26159a(new C13624h(str));
        if (a != null) {
            return m24685a(a);
        }
        return null;
    }

    /* renamed from: a */
    private static C13715a<Bitmap> m24685a(C13715a<C14042c> aVar) {
        try {
            if (C13715a.m27750a(aVar) && (aVar.mo25630a() instanceof C14043d)) {
                C14043d dVar = (C14043d) aVar.mo25630a();
                if (dVar != null) {
                    return dVar.mo26260f();
                }
            }
            C13715a.m27752c(aVar);
            return null;
        } finally {
            C13715a.m27752c(aVar);
        }
    }

    /* renamed from: a */
    public final void mo23153a(final String str, C14040a aVar) {
        if (!(TextUtils.isEmpty(str) || aVar == null || aVar.mo26254d() == null)) {
            final C13715a a = aVar.mo26254d().mo26083a();
            if (a != null && a.mo25635d()) {
                C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        if (a.mo25635d()) {
                            C13715a a = C14017k.m28587a().mo26212f().mo26109a((Bitmap) a.mo25630a());
                            C13715a a2 = C13715a.m27746a(new C14043d(a, C14046g.f36711a, 0));
                            C13715a a3 = C12217a.this.f32289a.mo26160a(new C13624h(str), a2);
                            C13715a.m27752c(a);
                            C13715a.m27752c(a3);
                            C13715a.m27752c(a2);
                        }
                        return null;
                    }
                }, (Executor) this.f32291c);
            }
        }
    }
}
