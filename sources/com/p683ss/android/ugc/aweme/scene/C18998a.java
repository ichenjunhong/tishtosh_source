package com.p683ss.android.ugc.aweme.scene;

import android.app.Activity;
import android.content.Context;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.p840b.C12855b;
import com.bytedance.scene.p840b.C12856c;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.utils.C47743c;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.scene.a */
public final class C18998a {

    /* renamed from: com.ss.android.ugc.aweme.scene.a$a */
    public static final class C18999a extends C12855b {

        /* renamed from: a */
        final /* synthetic */ C12942d f52302a;

        /* renamed from: b */
        final /* synthetic */ Class f52303b;

        /* renamed from: c */
        final /* synthetic */ C52670a f52304c;

        /* renamed from: com.ss.android.ugc.aweme.scene.a$a$a */
        static final class C19000a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C18999a f52305a;

            C19000a(C18999a aVar) {
                this.f52305a = aVar;
            }

            public final void run() {
                this.f52305a.f52302a.mo24518a((C12856c) this.f52305a);
            }
        }

        /* renamed from: b */
        public final void mo24320b(C12924i iVar) {
            C52711k.m112240b(iVar, "scene");
            if (C52711k.m112239a((Object) iVar.getClass(), (Object) this.f52303b)) {
                new SafeHandler(this.f52302a).post(new C19000a(this));
                this.f52304c.invoke();
            }
        }

        C18999a(C12942d dVar, Class cls, C52670a aVar) {
            this.f52302a = dVar;
            this.f52303b = cls;
            this.f52304c = aVar;
        }
    }

    /* renamed from: a */
    public static final Activity m46169a(Context context) {
        C52711k.m112240b(context, "$this$getActivity");
        return C47743c.m103371a(context);
    }

    /* renamed from: a */
    public static final boolean m46171a(C12942d dVar, C12924i iVar) {
        Object obj;
        C52711k.m112240b(dVar, "$this$exist");
        C52711k.m112240b(iVar, "scene");
        List c = dVar.mo24528c();
        C52711k.m112236a((Object) c, "sceneList");
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C52711k.m112239a((Object) (C12924i) obj, (Object) iVar)) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m46172a(C12942d dVar, Class<? extends C12924i> cls) {
        Object obj;
        C52711k.m112240b(dVar, "$this$exist");
        C52711k.m112240b(cls, "clazz");
        List c = dVar.mo24528c();
        C52711k.m112236a((Object) c, "sceneList");
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C52711k.m112239a((Object) ((C12924i) obj).getClass(), (Object) cls)) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m46170a(C12942d dVar, Class<? extends C12924i> cls, C52670a<C52860x> aVar) {
        C52711k.m112240b(dVar, "$this$observeChildDestroy");
        C52711k.m112240b(cls, "clazz");
        C52711k.m112240b(aVar, "block");
        dVar.mo24519a((C12856c) new C18999a(dVar, cls, aVar), false);
    }
}
