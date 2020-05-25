package com.p683ss.android.ugc.aweme.tools.draft.p2355a;

import android.util.Log;
import com.p683ss.android.ugc.asve.p1239c.C20346b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53200af;
import kotlinx.coroutines.C53263bl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p2628d.C52860x;
import p2628d.p2631c.C52599a;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.a.c */
public final class C46968c {

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a.c$a */
    public static final class C46969a extends C52599a implements CoroutineExceptionHandler {
        public C46969a(C52633c cVar) {
            super(cVar);
        }

        public final void handleException(C52628e eVar, Throwable th) {
            C52711k.m112240b(eVar, "context");
            C52711k.m112240b(th, "exception");
            C32458a.m75148a(th);
        }
    }

    @C52618f(mo110254b = "DraftStickerDownloadMgr.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.tools.draft.download.DraftStickerDownloadMgrKt$unzipDraftStickerRes$2")
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a.c$b */
    public static final class C46970b extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        int f118672a;

        /* renamed from: b */
        final /* synthetic */ Effect f118673b;

        /* renamed from: c */
        private C53199ae f118674c;

        public C46970b(Effect effect, C52625c cVar) {
            this.f118673b = effect;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C46970b bVar = new C46970b(this.f118673b, cVar);
            bVar.f118674c = (C53199ae) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C46970b) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f118672a == 0) {
                File file = new File(this.f118673b.getZipPath());
                try {
                    C48671i.f122310a.mo96264e(this.f118673b.getUnzipPath());
                    C48671i.f122310a.mo96258b(this.f118673b.getZipPath(), this.f118673b.getUnzipPath());
                } catch (IOException e) {
                    C45407ay.m98971b(Log.getStackTraceString(e));
                } catch (Throwable th) {
                    file.delete();
                    throw th;
                }
                file.delete();
                return C52860x.f131107a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final C53199ae m102019a() {
        C53263bl a = C53270bq.m113187a(null, 1, null);
        return C53200af.m113027a(C20346b.m50242a().plus(a).plus(new C46969a(CoroutineExceptionHandler.f131765b)));
    }
}
