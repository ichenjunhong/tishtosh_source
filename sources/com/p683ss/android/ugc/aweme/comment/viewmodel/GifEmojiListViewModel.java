package com.p683ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11853b;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p683ss.android.ugc.aweme.comment.p1523h.C25201c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel */
public final class GifEmojiListViewModel extends JediViewModel<GifEmojiListState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f67176d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GifEmojiListViewModel.class), "mSearchTask", "getMSearchTask()Lio/reactivex/Observable;"))};

    /* renamed from: i */
    public static final C25394a f67177i = new C25394a(null);

    /* renamed from: e */
    public final C25201c f67178e = new C25201c();

    /* renamed from: f */
    final C52668f f67179f = C52732g.m112286a(C52757k.NONE, C25395b.f67182a);

    /* renamed from: g */
    public C1690c f67180g;

    /* renamed from: h */
    public final ListMiddleware<GifEmojiListState, GifEmoji, C11865l> f67181h;

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$a */
    public static final class C25394a {
        private C25394a() {
        }

        public /* synthetic */ C25394a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$b */
    static final class C25395b extends C52712l implements C52670a<C2201v<Long>> {

        /* renamed from: a */
        public static final C25395b f67182a = new C25395b();

        C25395b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C2201v.m6592a(200, TimeUnit.MILLISECONDS).mo6529b(C2168a.m6521b()).mo6514a(C2168a.m6521b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$c */
    static final class C25396c extends C52712l implements C52671b<GifEmojiListState, C2201v<C52847n<? extends List<? extends GifEmoji>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiListViewModel f67183a;

        C25396c(GifEmojiListViewModel gifEmojiListViewModel) {
            this.f67183a = gifEmojiListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GifEmojiListState gifEmojiListState = (GifEmojiListState) obj;
            C52711k.m112240b(gifEmojiListState, "state");
            C2201v d = this.f67183a.f67178e.mo51453a(gifEmojiListState.getKeyword(), 0, gifEmojiListState.getAwemeId()).mo6541d((C1711f<? super T, ? extends R>) C253971.f67184a);
            C52711k.m112236a((Object) d, "mRepo.searchGifList(stat…or = 0)\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$d */
    static final class C25398d extends C52712l implements C52671b<GifEmojiListState, C2201v<C52847n<? extends List<? extends GifEmoji>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiListViewModel f67185a;

        C25398d(GifEmojiListViewModel gifEmojiListViewModel) {
            this.f67185a = gifEmojiListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GifEmojiListState gifEmojiListState = (GifEmojiListState) obj;
            C52711k.m112240b(gifEmojiListState, "state");
            C2201v d = this.f67185a.f67178e.mo51453a(gifEmojiListState.getKeyword(), gifEmojiListState.getListState().getPayload().f31450b, gifEmojiListState.getAwemeId()).mo6541d((C1711f<? super T, ? extends R>) C253991.f67186a);
            C52711k.m112236a((Object) d, "mRepo.searchGifList(stat…      }\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$e */
    static final class C25400e extends C52712l implements C52682m<GifEmojiListState, ListState<GifEmoji, C11865l>, GifEmojiListState> {

        /* renamed from: a */
        public static final C25400e f67187a = new C25400e();

        C25400e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            GifEmojiListState gifEmojiListState = (GifEmojiListState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(gifEmojiListState, "$receiver");
            C52711k.m112240b(listState, "it");
            return GifEmojiListState.copy$default(gifEmojiListState, null, null, listState, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$f */
    public static final class C25401f extends C52712l implements C52671b<GifEmojiListState, GifEmojiListState> {

        /* renamed from: a */
        final /* synthetic */ String f67188a;

        public C25401f(String str) {
            this.f67188a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GifEmojiListState gifEmojiListState = (GifEmojiListState) obj;
            C52711k.m112240b(gifEmojiListState, "$receiver");
            return GifEmojiListState.copy$default(gifEmojiListState, null, this.f67188a, null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$g */
    public static final class C25402g extends C52712l implements C52671b<GifEmojiListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiListViewModel f67189a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f67190b;

        public C25402g(GifEmojiListViewModel gifEmojiListViewModel, CharSequence charSequence) {
            this.f67189a = gifEmojiListViewModel;
            this.f67190b = charSequence;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GifEmojiListState gifEmojiListState = (GifEmojiListState) obj;
            C52711k.m112240b(gifEmojiListState, "it");
            if (!C52711k.m112239a((Object) this.f67190b, (Object) gifEmojiListState.getKeyword())) {
                this.f67189a.mo22530c(new C52671b<GifEmojiListState, GifEmojiListState>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C25402g f67191a;

                    {
                        this.f67191a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        GifEmojiListState gifEmojiListState = (GifEmojiListState) obj;
                        C52711k.m112240b(gifEmojiListState, "$receiver");
                        return GifEmojiListState.copy$default(gifEmojiListState, String.valueOf(this.f67191a.f67190b), null, null, 6, null);
                    }
                });
                C1690c cVar = this.f67189a.f67180g;
                if (cVar != null && !cVar.isDisposed()) {
                    cVar.dispose();
                }
                this.f67189a.f67180g = ((C2201v) this.f67189a.f67179f.getValue()).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C25402g f67192a;

                    {
                        this.f67192a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        Long l = (Long) obj;
                        this.f67192a.f67189a.f67181h.mo22565b();
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$h */
    static final class C25405h extends C52712l implements C52671b<GifEmojiListState, GifEmojiListState> {

        /* renamed from: a */
        public static final C25405h f67193a = new C25405h();

        C25405h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GifEmojiListState gifEmojiListState = (GifEmojiListState) obj;
            C52711k.m112240b(gifEmojiListState, "$receiver");
            return GifEmojiListState.copy$default(gifEmojiListState, null, null, ListState.copy$default(gifEmojiListState.getListState(), null, C52575l.m112097a(), null, null, new C11853b(true), 13, null), 3, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        GifEmojiListState gifEmojiListState = new GifEmojiListState(null, null, null, 7, null);
        return gifEmojiListState;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        ListMiddleware<GifEmojiListState, GifEmoji, C11865l> listMiddleware = this.f67181h;
        listMiddleware.mo22635a(C25407a.f67195a, (C52682m<? super S, ? super PROP, ? extends S>) C25400e.f67187a);
        mo22525a(listMiddleware);
    }

    /* renamed from: e */
    public final void mo51980e() {
        C1690c cVar = this.f67180g;
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
        mo22530c(C25405h.f67193a);
    }

    public GifEmojiListViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C25396c(this), new C25398d(this), null, null, 12, null);
        this.f67181h = listMiddleware;
    }
}
