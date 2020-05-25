package com.p683ss.android.ugc.aweme.port.p2082in;

import android.content.Context;
import java.io.File;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53256be;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2638e.C52659i;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.port.in.bs */
public final class C39615bs {

    @C52618f(mo110254b = "LegacyEffectModels.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.port.in.LegacyEffectModels$removeLegacyEffectModelFiles$1")
    /* renamed from: com.ss.android.ugc.aweme.port.in.bs$a */
    static final class C39616a extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        int f101133a;

        /* renamed from: b */
        final /* synthetic */ File f101134b;

        /* renamed from: c */
        private C53199ae f101135c;

        C39616a(File file, C52625c cVar) {
            this.f101134b = file;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C39616a aVar = new C39616a(this.f101134b, cVar);
            aVar.f101135c = (C53199ae) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C39616a) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f101133a == 0) {
                C52659i.m112211c(this.f101134b);
                return C52860x.f131107a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final void m88207a(Context context) {
        C52711k.m112240b(context, "context");
        File filesDir = context.getFilesDir();
        C52711k.m112236a((Object) filesDir, "context.filesDir");
        File c = C52659i.m112210c(C52659i.m112210c(filesDir, "vesdk"), "models");
        if (c.exists()) {
            C53301g.m113291a(C53256be.f131885a, null, null, new C39616a(c, null), 3, null);
        }
    }
}
