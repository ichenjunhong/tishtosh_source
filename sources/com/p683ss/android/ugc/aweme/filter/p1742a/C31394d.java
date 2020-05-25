package com.p683ss.android.ugc.aweme.filter.p1742a;

import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.asve.p1239c.C20346b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29190b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29195e;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.tools.draft.p2355a.C46968c;
import com.p683ss.android.ugc.aweme.tools.draft.p2355a.C46968c.C46970b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53225av;
import kotlinx.coroutines.C53299e;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.a.d */
public final class C31394d extends AbsDownloadListener {

    /* renamed from: d */
    public static final C31395a f82230d = new C31395a(null);

    /* renamed from: a */
    public long f82231a;

    /* renamed from: b */
    public final C29192b<Effect, Void> f82232b;

    /* renamed from: c */
    public final C29190b<Effect, Void> f82233c;

    /* renamed from: e */
    private final C53199ae f82234e = C46968c.m102019a();

    /* renamed from: com.ss.android.ugc.aweme.filter.a.d$a */
    public static final class C31395a {
        private C31395a() {
        }

        public /* synthetic */ C31395a(C52707g gVar) {
            this();
        }
    }

    @C52618f(mo110254b = "DraftStickerDownloadListener.kt", mo110255c = {40}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.filter.downloader.DraftStickerDownloadListener$onSuccessed$1")
    /* renamed from: com.ss.android.ugc.aweme.filter.a.d$b */
    static final class C31396b extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f82235a;

        /* renamed from: b */
        int f82236b;

        /* renamed from: c */
        final /* synthetic */ C31394d f82237c;

        /* renamed from: d */
        private C53199ae f82238d;

        C31396b(C31394d dVar, C52625c cVar) {
            this.f82237c = dVar;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C31396b bVar = new C31396b(this.f82237c, cVar);
            bVar.f82238d = (C53199ae) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C31396b) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C52601b.m112157a();
            switch (this.f82236b) {
                case 0:
                    Effect effect = (Effect) this.f82237c.f82232b.f76498g;
                    this.f82235a = this.f82238d;
                    this.f82236b = 1;
                    if (C53299e.m113284a(C53225av.m113075c(), new C46970b(effect, null), this) == a) {
                        return a;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f82237c.f82232b.mo59080a(3);
            this.f82237c.f82232b.f76495d = null;
            this.f82237c.f82233c.mo59067b(this.f82237c.f82232b);
            C23569o.m57776a("aweme_tool_draft_amazing_infosticker_update_download_error", 0, C23088c.m56631a().mo47824a("duration", String.valueOf(System.currentTimeMillis() - this.f82237c.f82231a)).mo47825b());
            return C52860x.f131107a;
        }
    }

    public final void onProgress(DownloadInfo downloadInfo) {
    }

    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        this.f82231a = System.currentTimeMillis();
    }

    public final void onSuccessed(DownloadInfo downloadInfo) {
        C53301g.m113291a(this.f82234e, C20346b.m50242a(), null, new C31396b(this, null), 2, null);
    }

    public C31394d(C29192b<Effect, Void> bVar, C29190b<Effect, Void> bVar2) {
        C52711k.m112240b(bVar, "task");
        C52711k.m112240b(bVar2, "callback");
        this.f82232b = bVar;
        this.f82233c = bVar2;
    }

    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        int i;
        this.f82232b.mo59080a(4);
        C29192b<Effect, Void> bVar = this.f82232b;
        Integer valueOf = Integer.valueOf(-1);
        if (baseException != null) {
            str = baseException.getMessage();
        } else {
            str = null;
        }
        Exception exc = baseException;
        bVar.f76496e = new C29195e(valueOf, str, exc);
        this.f82233c.mo59072c(this.f82232b);
        String str2 = "aweme_tool_draft_amazing_infosticker_update_download_error";
        String b = C45407ay.m98970b((Throwable) exc);
        C52711k.m112236a((Object) b, "ToolsLogUtil.getStackTraceString(e)");
        C23088c a = C23088c.m56631a().mo47824a("errorDesc", b);
        String str3 = "errorCode";
        if (baseException != null) {
            i = baseException.getErrorCode();
        } else {
            i = 0;
        }
        C23569o.m57776a(str2, 1, a.mo47822a(str3, Integer.valueOf(i)).mo47825b());
    }
}
