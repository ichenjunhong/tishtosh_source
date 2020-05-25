package com.p683ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListMiddleware.C11817g;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.arch.C23470g;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p683ss.android.ugc.aweme.favorites.api.MixCollectionApi;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29695c;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.mix.C37030h;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel */
public final class MediaMixListViewModel extends JediBaseViewModel<MediaMixState> {

    /* renamed from: m */
    public static final C29769a f77766m = new C29769a(null);

    /* renamed from: d */
    public ArrayList<Long> f77767d;

    /* renamed from: e */
    public ArrayList<String> f77768e;

    /* renamed from: f */
    public int f77769f;

    /* renamed from: g */
    public String f77770g;

    /* renamed from: h */
    public String f77771h;

    /* renamed from: i */
    public final MixCollectionApi f77772i;

    /* renamed from: j */
    public final Set<String> f77773j = new LinkedHashSet();

    /* renamed from: k */
    public final List<String> f77774k = new ArrayList();

    /* renamed from: l */
    public final ListMiddleware<MediaMixState, MixStruct, C23470g> f77775l = new ListMiddleware<>(new C29770b(this), new C29774c(this), C29778d.f77784a, C29779e.f77785a);

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$a */
    public static final class C29769a {
        private C29769a() {
        }

        public /* synthetic */ C29769a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$b */
    static final class C29770b extends C52712l implements C52671b<MediaMixState, C2201v<C52847n<? extends List<? extends MixStruct>, ? extends C23470g>>> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f77776a;

        C29770b(MediaMixListViewModel mediaMixListViewModel) {
            this.f77776a = mediaMixListViewModel;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x008b, code lost:
            if (r3 == null) goto L_0x008d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r7 = (com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixState) r7
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r7 = r6.f77776a
                int r7 = r7.f77769f
                r0 = 1
                if (r7 != r0) goto L_0x003b
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r7 = r6.f77776a
                com.ss.android.ugc.aweme.favorites.api.MixCollectionApi r7 = r7.f77772i
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r0 = r6.f77776a
                java.util.ArrayList<java.lang.Long> r0 = r0.f77767d
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r0.toString()
                goto L_0x001e
            L_0x001d:
                r0 = 0
            L_0x001e:
                c.a.v r7 = r7.getSearchMixCollection(r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$b$1 r0 = com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C29770b.C297711.f77777a
                d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
                d.f.a.b r0 = com.p683ss.android.ugc.aweme.favorites.p1704d.C29695c.m69745a(r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.b r1 = new com.ss.android.ugc.aweme.favorites.viewmodel.b
                r1.<init>(r0)
                c.a.d.f r1 = (p064c.p065a.p071d.C1711f) r1
                c.a.v r7 = r7.mo6541d(r1)
                java.lang.String r0 = "api.getSearchMixCollecti…r)\n                    })"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
                return r7
            L_0x003b:
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r7 = r6.f77776a
                int r7 = r7.f77769f
                r0 = 2
                if (r7 != r0) goto L_0x0079
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r7 = r6.f77776a
                com.ss.android.ugc.aweme.favorites.api.MixCollectionApi r0 = r7.f77772i
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r7 = r6.f77776a
                java.lang.String r7 = r7.f77770g
                if (r7 != 0) goto L_0x004e
                java.lang.String r7 = ""
            L_0x004e:
                r1 = r7
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r7 = r6.f77776a
                java.lang.String r7 = r7.f77771h
                if (r7 != 0) goto L_0x0057
                java.lang.String r7 = ""
            L_0x0057:
                r2 = r7
                r3 = 15
                r4 = 0
                c.a.v r7 = r0.getProfileVideoMixList(r1, r2, r3, r4)
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$b$2 r0 = com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C29770b.C297722.f77778a
                d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
                d.f.a.b r0 = com.p683ss.android.ugc.aweme.favorites.p1704d.C29695c.m69745a(r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.b r1 = new com.ss.android.ugc.aweme.favorites.viewmodel.b
                r1.<init>(r0)
                c.a.d.f r1 = (p064c.p065a.p071d.C1711f) r1
                c.a.v r7 = r7.mo6541d(r1)
                java.lang.String r0 = "api.getProfileVideoMixLi…r)\n                    })"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
                return r7
            L_0x0079:
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r7 = r6.f77776a
                com.ss.android.ugc.aweme.favorites.api.MixCollectionApi r7 = r7.f77772i
                r0 = 15
                r1 = 0
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r3 = r6.f77776a
                java.util.ArrayList<java.lang.String> r3 = r3.f77768e
                if (r3 == 0) goto L_0x008d
                java.lang.String r3 = r3.toString()
                if (r3 != 0) goto L_0x008f
            L_0x008d:
                java.lang.String r3 = ""
            L_0x008f:
                c.a.v r7 = r7.getMixCollection(r0, r1, r3)
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$b$3 r0 = com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C29770b.C297733.f77779a
                d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
                d.f.a.b r0 = com.p683ss.android.ugc.aweme.favorites.p1704d.C29695c.m69745a(r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.b r1 = new com.ss.android.ugc.aweme.favorites.viewmodel.b
                r1.<init>(r0)
                c.a.d.f r1 = (p064c.p065a.p071d.C1711f) r1
                c.a.v r7 = r7.mo6541d(r1)
                java.lang.String r0 = "api.getMixCollection(DEF…r)\n                    })"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C29770b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$c */
    static final class C29774c extends C52712l implements C52671b<MediaMixState, C2201v<C52847n<? extends List<? extends MixStruct>, ? extends C23470g>>> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f77780a;

        C29774c(MediaMixListViewModel mediaMixListViewModel) {
            this.f77780a = mediaMixListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            MediaMixState mediaMixState = (MediaMixState) obj;
            C52711k.m112240b(mediaMixState, "it");
            if (this.f77780a.f77769f == 1) {
                MixCollectionApi mixCollectionApi = this.f77780a.f77772i;
                ArrayList<Long> arrayList = this.f77780a.f77767d;
                if (arrayList != null) {
                    str = arrayList.toString();
                } else {
                    str = null;
                }
                C2201v d = mixCollectionApi.getSearchMixCollection(str).mo6541d((C1711f<? super T, ? extends R>) new C29784b<Object,Object>(C29695c.m69745a(C297751.f77781a)));
                C52711k.m112236a((Object) d, "api.getSearchMixCollecti…r)\n                    })");
                return d;
            } else if (this.f77780a.f77769f == 2) {
                MixCollectionApi mixCollectionApi2 = this.f77780a.f77772i;
                String str2 = this.f77780a.f77770g;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                String str4 = this.f77780a.f77771h;
                if (str4 == null) {
                    str4 = "";
                }
                C2201v d2 = mixCollectionApi2.getProfileVideoMixList(str3, str4, 15, ((C23470g) mediaMixState.getListState().getPayload()).f62539c).mo6541d((C1711f<? super T, ? extends R>) new C29784b<Object,Object>(C29695c.m69745a(C297762.f77782a)));
                C52711k.m112236a((Object) d2, "api.getProfileVideoMixLi…r)\n                    })");
                return d2;
            } else {
                C2201v d3 = this.f77780a.f77772i.getMixCollection(15, ((C23470g) mediaMixState.getListState().getPayload()).f62539c, "").mo6541d((C1711f<? super T, ? extends R>) new C29784b<Object,Object>(C29695c.m69745a(C297773.f77783a)));
                C52711k.m112236a((Object) d3, "api.getMixCollection(DEF…r)\n                    })");
                return d3;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$d */
    static final class C29778d extends C52712l implements C52682m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a */
        public static final C29778d f77784a = new C29778d();

        C29778d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((List) obj, "list");
            C52711k.m112240b(list, "refresh");
            Iterable iterable = list;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable) {
                if (hashSet.add(((MixStruct) next).mixId)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$e */
    static final class C29779e extends C52712l implements C52682m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a */
        public static final C29779e f77785a = new C29779e();

        C29779e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            Iterable c = C52575l.m112133c(list, list2);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : c) {
                if (hashSet.add(((MixStruct) next).mixId)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$f */
    public static final class C29780f extends C52712l implements C52671b<MediaMixState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f77786a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f77787b;

        public C29780f(MediaMixListViewModel mediaMixListViewModel, MixStruct mixStruct) {
            this.f77786a = mediaMixListViewModel;
            this.f77787b = mixStruct;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
            if (r4 == null) goto L_0x009a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00db, code lost:
            if (r4 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0094  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r7 = (com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixState) r7
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r0 = r6.f77786a
                java.util.Set<java.lang.String> r0 = r0.f77773j
                com.ss.android.ugc.aweme.feed.model.MixStruct r1 = r6.f77787b
                java.lang.String r1 = r1.mixId
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L_0x014b
                java.lang.String r0 = "general_search"
                java.lang.String r1 = r7.getEnterFrom()
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x002f
                java.lang.String r0 = "general_search_aladdin_more"
                java.lang.String r1 = r7.getEnterMethod()
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x002f
                r0 = 1
                goto L_0x0030
            L_0x002f:
                r0 = 0
            L_0x0030:
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r1 = r6.f77786a
                int r1 = r1.f77769f
                r2 = 2
                if (r1 != r2) goto L_0x00a6
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r2 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
                java.lang.String r2 = "AccountProxyService.userService().curUser"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.String r1 = r1.getUid()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L_0x006c
                com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r6.f77787b
                com.ss.android.ugc.aweme.profile.model.User r2 = r2.author
                if (r2 == 0) goto L_0x0060
                java.lang.String r2 = r2.getUid()
                goto L_0x0061
            L_0x0060:
                r2 = 0
            L_0x0061:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x006c
                java.lang.String r1 = "personal_homepage"
                goto L_0x006e
            L_0x006c:
                java.lang.String r1 = "others_homepage"
            L_0x006e:
                java.lang.String r2 = "show_compilation_entrance"
                com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r4 = "enter_from"
                com.ss.android.ugc.aweme.app.f.d r1 = r3.mo47829a(r4, r1)
                java.lang.String r3 = "enter_method"
                java.lang.String r4 = "homepage_compilation_list"
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
                java.lang.String r3 = "compilation_id"
                com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r6.f77787b
                java.lang.String r4 = r4.mixId
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
                java.lang.String r3 = "author_id"
                com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r6.f77787b
                com.ss.android.ugc.aweme.profile.model.User r4 = r4.author
                if (r4 == 0) goto L_0x009a
                java.lang.String r4 = r4.getUid()
                if (r4 != 0) goto L_0x009c
            L_0x009a:
                java.lang.String r4 = ""
            L_0x009c:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r1)
                goto L_0x00e8
            L_0x00a6:
                java.lang.String r1 = "show_compilation_entrance"
                com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r3 = "enter_from"
                if (r0 == 0) goto L_0x00b5
                java.lang.String r4 = r7.getEnterFrom()
                goto L_0x00b7
            L_0x00b5:
                java.lang.String r4 = "favourite"
            L_0x00b7:
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "enter_method"
                java.lang.String r4 = r7.getEnterMethod()
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "compilation_id"
                com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r6.f77787b
                java.lang.String r4 = r4.mixId
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.lang.String r3 = "author_id"
                com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r6.f77787b
                com.ss.android.ugc.aweme.profile.model.User r4 = r4.author
                if (r4 == 0) goto L_0x00dd
                java.lang.String r4 = r4.getUid()
                if (r4 != 0) goto L_0x00df
            L_0x00dd:
                java.lang.String r4 = ""
            L_0x00df:
                com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r2)
            L_0x00e8:
                if (r0 == 0) goto L_0x013b
                com.ss.android.ugc.aweme.search.ISearchService r0 = com.p683ss.android.ugc.aweme.search.C41432l.m91251a()
                com.ss.android.ugc.aweme.search.ISearchService r0 = (com.p683ss.android.ugc.aweme.search.ISearchService) r0
                com.ss.android.ugc.aweme.discover.mob.y r0 = r0.provideSearchContext()
                r1 = 3
                java.lang.String r0 = r0.mo56813a(r1)
                com.ss.android.ugc.aweme.feed.aa r1 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
                java.lang.String r1 = r1.mo60161a(r0)
                java.lang.String r2 = "search_result_show"
                com.ss.android.ugc.aweme.app.f.d r3 = new com.ss.android.ugc.aweme.app.f.d
                r3.<init>()
                java.lang.String r4 = "enter_from"
                java.lang.String r5 = "search_compilation_page"
                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                java.lang.String r4 = "token_type"
                java.lang.String r5 = "video_compilation"
                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                java.lang.String r4 = "search_id"
                com.ss.android.ugc.aweme.app.f.d r0 = r3.mo47829a(r4, r0)
                java.lang.String r3 = "search_keyword"
                java.lang.String r7 = r7.getSearchKeyword()
                com.ss.android.ugc.aweme.app.f.d r7 = r0.mo47829a(r3, r7)
                java.lang.String r0 = "log_pb"
                com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r0, r1)
                java.lang.String r0 = "is_aladdin"
                java.lang.String r1 = "1"
                com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r0, r1)
                java.util.Map<java.lang.String, java.lang.String> r7 = r7.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r7)
            L_0x013b:
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r7 = r6.f77786a
                java.util.Set<java.lang.String> r7 = r7.f77773j
                com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r6.f77787b
                java.lang.String r0 = r0.mixId
                java.lang.String r1 = "mix.mixId"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r7.add(r0)
            L_0x014b:
                d.x r7 = p2628d.C52860x.f131107a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C29780f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$g */
    static final class C29781g extends C52712l implements C52682m<MediaMixState, ListState<MixStruct, C23470g>, MediaMixState> {

        /* renamed from: a */
        public static final C29781g f77788a = new C29781g();

        C29781g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            MediaMixState mediaMixState = (MediaMixState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(mediaMixState, "$receiver");
            C52711k.m112240b(listState, "it");
            return MediaMixState.copy$default(mediaMixState, null, null, null, listState, 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$h */
    public static final class C29782h extends C52712l implements C52671b<MediaMixState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f77789a;

        public C29782h(MediaMixListViewModel mediaMixListViewModel) {
            this.f77789a = mediaMixListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MediaMixState mediaMixState = (MediaMixState) obj;
            C52711k.m112240b(mediaMixState, "state");
            for (String str : this.f77789a.f77774k) {
                int i = 0;
                for (Object next : mediaMixState.getListState().getList()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    if (C52711k.m112239a((Object) ((MixStruct) next).mixId, (Object) str)) {
                        ListMiddleware<MediaMixState, MixStruct, C23470g> listMiddleware = this.f77789a.f77775l;
                        listMiddleware.mo22633a((C52671b<? super PROP, C52860x>) new C11817g<Object,C52860x>(listMiddleware, i));
                    }
                    i = i2;
                }
            }
            return C52860x.f131107a;
        }
    }

    public final void onCleared() {
        super.onCleared();
        C47718bf.m103291d(this);
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        MediaMixState mediaMixState = new MediaMixState(null, null, null, null, 15, null);
        return mediaMixState;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        this.f77775l.mo22635a(C29783a.f77790a, (C52682m<? super S, ? super PROP, ? extends S>) C29781g.f77788a);
        mo22525a(this.f77775l);
        C47718bf.m103290c(this);
    }

    public MediaMixListViewModel() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(MixCollectionApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…ollectionApi::class.java)");
        this.f77772i = (MixCollectionApi) create;
    }

    @C53771m
    public final void updateCollectStatus(C37030h hVar) {
        C52711k.m112240b(hVar, "mixAddCollectEvent");
        if (hVar.f94571b != 0) {
            Collection collection = this.f77774k;
            String str = hVar.f94570a;
            if (collection != null) {
                C52731z.m112266b(collection).remove(str);
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
        } else if (!C52575l.m112125a((Iterable<? extends T>) this.f77774k, hVar.f94570a)) {
            List<String> list = this.f77774k;
            String str2 = hVar.f94570a;
            if (str2 != null) {
                list.add(str2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.String");
        }
    }
}
