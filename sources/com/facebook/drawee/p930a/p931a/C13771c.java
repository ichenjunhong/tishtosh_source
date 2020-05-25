package com.facebook.drawee.p930a.p931a;

import android.content.Context;
import com.facebook.common.p921e.C13697a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p965e.C14001h;
import com.facebook.imagepipeline.p965e.C14008i;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.imageutils.C14252b;
import java.io.IOException;

/* renamed from: com.facebook.drawee.a.a.c */
public class C13771c {

    /* renamed from: a */
    public static volatile boolean f35832a = false;

    /* renamed from: b */
    public static boolean f35833b = true;

    /* renamed from: c */
    private static final Class<?> f35834c = C13771c.class;

    /* renamed from: d */
    private static C13775f f35835d;

    private C13771c() {
    }

    /* renamed from: a */
    public static C13773e m27870a() {
        return f35835d.mo23157b();
    }

    /* renamed from: b */
    public static C14017k m27874b() {
        return C14017k.m28587a();
    }

    /* renamed from: c */
    public static C14001h m27875c() {
        return m27874b().mo26211e();
    }

    /* renamed from: a */
    public static void m27872a(Context context, C14008i iVar) {
        m27873a(context, iVar, null);
    }

    /* renamed from: a */
    private static void m27871a(Context context, C13759b bVar) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("Fresco.initializeDrawee");
        }
        C13775f fVar = new C13775f(context, bVar);
        f35835d = fVar;
        SimpleDraweeView.initialize(fVar);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    /* renamed from: a */
    private static void m27873a(Context context, C14008i iVar, C13759b bVar) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("Fresco#initialize");
        }
        if (f35832a) {
            C13697a.m27692c(f35834c, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            if (!f35833b) {
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
                return;
            }
        } else {
            f35832a = true;
        }
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("Fresco.initialize->SoLoader.init");
            }
            C14252b.m29207a(context);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        } catch (IOException e) {
            C13697a.m27679a(f35834c, (Throwable) e, "Could not initialize SoLoader", new Object[0]);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (iVar == null) {
            C14017k.m28589a(applicationContext);
        } else {
            C14017k.m28590a(iVar);
        }
        m27871a(applicationContext, (C13759b) null);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }
}
