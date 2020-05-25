package com.p683ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.arch.C23470g;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.C39830d;
import com.p683ss.android.ugc.aweme.profile.adapter.C39771q.C39772a;
import com.p683ss.android.ugc.aweme.profile.adapter.MediaMixViewHolder;
import com.p683ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi;
import com.p683ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi.C39889a;
import com.p683ss.android.ugc.aweme.profile.model.MediaMixList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
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

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel */
public final class MediaMixListViewModel extends JediBaseViewModel<MediaMixListState> {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f103530d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaMixListViewModel.class), "awemeListApi", "getAwemeListApi()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/AwemeListApi;"))};

    /* renamed from: h */
    public static AwemeListApi f103531h;

    /* renamed from: i */
    public static final C40584a f103532i = new C40584a(null);

    /* renamed from: e */
    final C52668f f103533e = C52732g.m112285a(C40586b.f103538a);

    /* renamed from: f */
    public final Set<String> f103534f = new LinkedHashSet();

    /* renamed from: g */
    public final ListMiddleware<MediaMixListState, MixStruct, C23470g> f103535g = new ListMiddleware<>(C40587c.f103539a, new C40589d(this), C40591e.f103543a, C40592f.f103544a);

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$a */
    public static final class C40584a {

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$a$a */
        static final class C40585a<T, R> implements C1711f<T, C2206z<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ String f103536a;

            /* renamed from: b */
            final /* synthetic */ String f103537b;

            C40585a(String str, String str2) {
                this.f103536a = str;
                this.f103537b = str2;
            }

            public final /* synthetic */ Object apply(Object obj) {
                boolean z;
                MediaMixList mediaMixList = (MediaMixList) obj;
                C52711k.m112240b(mediaMixList, "it");
                Collection collection = mediaMixList.mixInfos;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && mediaMixList.hasMore == 1) {
                    return C40584a.m90018a(MediaMixListViewModel.f103532i, this.f103536a, this.f103537b, 0, mediaMixList.cursor, 4, null);
                }
                C2201v b = C2201v.m6614b(mediaMixList);
                C52711k.m112236a((Object) b, "Observable.just(it)");
                return b;
            }
        }

        private C40584a() {
        }

        public /* synthetic */ C40584a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private C2201v<MediaMixList> m90019a(String str, String str2, int i, long j) {
            String str3;
            C52711k.m112240b(str, "uid");
            C40584a aVar = this;
            if (MediaMixListViewModel.f103531h == null) {
                MediaMixListViewModel.f103531h = C39889a.m88658a();
            }
            if (str2 == null) {
                StringBuilder sb = new StringBuilder("sec_uid == null, uid = ");
                sb.append(str);
                C32458a.m75144a(sb.toString());
            }
            AwemeListApi awemeListApi = MediaMixListViewModel.f103531h;
            if (awemeListApi == null) {
                C52711k.m112237a("mAwemeListApi");
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            C2201v<MediaMixList> a = awemeListApi.getMediaMixList(str, str3, i, j).mo6529b(C2168a.m6521b()).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C40585a<Object,Object>(str, str2));
            C52711k.m112236a((Object) a, "mAwemeListApi.getMediaMi…it)\n                    }");
            return a;
        }

        /* renamed from: a */
        public static /* synthetic */ C2201v m90018a(C40584a aVar, String str, String str2, int i, long j, int i2, Object obj) {
            int i3;
            if ((i2 & 4) != 0) {
                i3 = 15;
            } else {
                i3 = i;
            }
            if ((i2 & 8) != 0) {
                j = 0;
            }
            return aVar.m90019a(str, str2, i3, j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$b */
    static final class C40586b extends C52712l implements C52670a<AwemeListApi> {

        /* renamed from: a */
        public static final C40586b f103538a = new C40586b();

        C40586b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C39889a.m88658a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$c */
    static final class C40587c extends C52712l implements C52671b<MediaMixListState, C2201v<C52847n<? extends List<? extends MixStruct>, ? extends C23470g>>> {

        /* renamed from: a */
        public static final C40587c f103539a = new C40587c();

        C40587c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MediaMixListState mediaMixListState = (MediaMixListState) obj;
            C52711k.m112240b(mediaMixListState, "it");
            C2201v d = C2201v.m6614b(mediaMixListState.getMediaMixOfFirstPage()).mo6541d((C1711f<? super T, ? extends R>) new C40614b<Object,Object>(C39830d.m88578a((C52671b<? super T, ? extends R>) C405881.f103540a)));
            C52711k.m112236a((Object) d, "Observable.just(it.media…\n            }\n        })");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$d */
    static final class C40589d extends C52712l implements C52671b<MediaMixListState, C2201v<C52847n<? extends List<? extends MixStruct>, ? extends C23470g>>> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f103541a;

        C40589d(MediaMixListViewModel mediaMixListViewModel) {
            this.f103541a = mediaMixListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MediaMixListState mediaMixListState = (MediaMixListState) obj;
            C52711k.m112240b(mediaMixListState, "it");
            C2201v d = ((AwemeListApi) this.f103541a.f103533e.getValue()).getMediaMixList(mediaMixListState.getUid(), mediaMixListState.getSuid(), 15, ((C23470g) mediaMixListState.getListState().getPayload()).f62539c).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C40614b<Object,Object>(C39830d.m88578a((C52671b<? super T, ? extends R>) C405901.f103542a)));
            C52711k.m112236a((Object) d, "awemeListApi.getMediaMix…     }\n                })");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$e */
    static final class C40591e extends C52712l implements C52682m<List<? extends MixStruct>, List<? extends MixStruct>, List<MixStruct>> {

        /* renamed from: a */
        public static final C40591e f103543a = new C40591e();

        C40591e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((List) obj, "list");
            C52711k.m112240b(list, "refresh");
            List arrayList = new ArrayList();
            if (!list.isEmpty()) {
                float f = 0.0f;
                int a = C9432q.m18670a(C11010c.m22280a());
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    MixStruct mixStruct = (MixStruct) next;
                    if (f <= ((float) a) * 1.5f) {
                        f += C9432q.m18687b(C11010c.m22280a(), (MediaMixViewHolder.f101414j * ((float) (mixStruct.mixName.length() + 2))) + 26.0f);
                        arrayList.add(mixStruct);
                    }
                    i = i2;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$f */
    static final class C40592f extends C52712l implements C52682m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a */
        public static final C40592f f103544a = new C40592f();

        C40592f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            if (((MixStruct) C52575l.m112144h(list)) == C39772a.m88483a()) {
                return C52575l.m112133c(list.subList(0, list.size() - 1), list2);
            }
            return C52575l.m112133c(list, list2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$g */
    static final class C40593g extends C52712l implements C52671b<MediaMixListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f103545a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f103546b;

        C40593g(MediaMixListViewModel mediaMixListViewModel, MixStruct mixStruct) {
            this.f103545a = mediaMixListViewModel;
            this.f103546b = mixStruct;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MediaMixListState mediaMixListState = (MediaMixListState) obj;
            C52711k.m112240b(mediaMixListState, "it");
            if (!this.f103545a.f103534f.contains(this.f103546b.mixId)) {
                C26890h.m65011a("show_compilation_entrance", C23089d.m56640a().mo47829a("enter_from", mediaMixListState.getEnterFrom()).mo47829a("compilation_id", this.f103546b.mixId).mo47829a("author_id", mediaMixListState.getUid()).f61491a);
                Set<String> set = this.f103545a.f103534f;
                String str = this.f103546b.mixId;
                C52711k.m112236a((Object) str, "item.mixId");
                set.add(str);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$h */
    static final class C40594h extends C52712l implements C52682m<MediaMixListState, ListState<MixStruct, C23470g>, MediaMixListState> {

        /* renamed from: a */
        public static final C40594h f103547a = new C40594h();

        C40594h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            MediaMixListState mediaMixListState = (MediaMixListState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(mediaMixListState, "$receiver");
            C52711k.m112240b(listState, "it");
            return MediaMixListState.copy$default(mediaMixListState, null, null, null, null, listState, 15, null);
        }
    }

    /* renamed from: a */
    public static final C2201v<MediaMixList> m90014a(String str, String str2) {
        return C40584a.m90018a(f103532i, str, str2, 0, 0, 12, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        MediaMixListState mediaMixListState = new MediaMixListState(null, null, null, null, null, 31, null);
        return mediaMixListState;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        this.f103535g.mo22635a(C40613a.f103571a, (C52682m<? super S, ? super PROP, ? extends S>) C40594h.f103547a);
        mo22525a(this.f103535g);
    }

    /* renamed from: a */
    public final void mo82863a(MixStruct mixStruct) {
        C52711k.m112240b(mixStruct, "item");
        mo22527b(new C40593g(this, mixStruct));
    }
}
