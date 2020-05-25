package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy;

import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33605c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1824a.C33593a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a */
public final class C33600a {

    /* renamed from: a */
    public static final C33600a f87087a = new C33600a();

    /* renamed from: b */
    private static GiphyGifApi f87088b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a$a */
    static final class C33601a<TTaskResult, TContinuationResult> implements C0011g<C33605c, Void> {

        /* renamed from: a */
        final /* synthetic */ int f87089a;

        /* renamed from: b */
        final /* synthetic */ C33593a f87090b;

        C33601a(int i, C33593a aVar) {
            this.f87089a = i;
            this.f87090b = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C33600a.m76996a(this.f87089a, this.f87090b, iVar, false);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a$b */
    static final class C33602b<TTaskResult, TContinuationResult> implements C0011g<C33605c, Void> {

        /* renamed from: a */
        final /* synthetic */ int f87091a;

        /* renamed from: b */
        final /* synthetic */ C33593a f87092b;

        C33602b(int i, C33593a aVar) {
            this.f87091a = i;
            this.f87092b = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C33600a.m76996a(this.f87091a, this.f87092b, iVar, true);
            return null;
        }
    }

    private C33600a() {
    }

    static {
        GiphyGifApi giphyGifApi;
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        if (createIRetrofitServicebyMonsterPlugin != null) {
            IRetrofit createNewRetrofit = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C35268h.f90601b);
            if (createNewRetrofit != null) {
                giphyGifApi = (GiphyGifApi) createNewRetrofit.create(GiphyGifApi.class);
                f87088b = giphyGifApi;
            }
        }
        giphyGifApi = null;
        f87088b = giphyGifApi;
    }

    /* renamed from: a */
    public static final void m76995a(int i, C33593a<C33605c> aVar) {
        C52711k.m112240b(aVar, "giphyGifCallback");
        GiphyGifApi giphyGifApi = f87088b;
        if (giphyGifApi != null) {
            C0013i trendingGiphy = giphyGifApi.getTrendingGiphy(i);
            if (trendingGiphy != null) {
                trendingGiphy.mo20a((C0011g<TResult, TContinuationResult>) new C33602b<TResult,TContinuationResult>(i, aVar), C0013i.f25b);
            }
        }
    }

    /* renamed from: a */
    public static final void m76997a(int i, String str, C33593a<C33605c> aVar) {
        C52711k.m112240b(str, "queryKey");
        C52711k.m112240b(aVar, "giphyGifCallback");
        GiphyGifApi giphyGifApi = f87088b;
        if (giphyGifApi != null) {
            C0013i searchingGiphy = giphyGifApi.getSearchingGiphy(i, str);
            if (searchingGiphy != null) {
                searchingGiphy.mo20a((C0011g<TResult, TContinuationResult>) new C33601a<TResult,TContinuationResult>(i, aVar), C0013i.f25b);
            }
        }
    }

    /* renamed from: a */
    public static void m76996a(int i, C33593a<C33605c> aVar, C0013i<C33605c> iVar, boolean z) {
        if (iVar == null || !iVar.mo26b() || iVar.mo34e() == null) {
            if (iVar == null || iVar.mo33d() || iVar.mo34e() == null) {
                aVar.mo70990a();
            }
        } else if (i > 0) {
            Object e = iVar.mo34e();
            C52711k.m112236a(e, "task.result");
            aVar.mo70991a(e);
        } else if (z) {
            Object e2 = iVar.mo34e();
            C52711k.m112236a(e2, "task.result");
            aVar.mo70993c(e2);
        } else {
            Object e3 = iVar.mo34e();
            C52711k.m112236a(e3, "task.result");
            aVar.mo70992b(e3);
        }
    }
}
