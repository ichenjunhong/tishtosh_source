package com.p683ss.android.ugc.aweme.browserecord.model;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel */
public final class BrowseRecordViewModel extends C0209x {

    /* renamed from: g */
    public static final C24037a f63796g = new C24037a(null);

    /* renamed from: a */
    final boolean f63797a = false;

    /* renamed from: b */
    final HashSet<String> f63798b = new HashSet<>();

    /* renamed from: c */
    public final ConcurrentHashMap<String, C24043b> f63799c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public RecommendList f63800d;

    /* renamed from: e */
    public List<C24045d> f63801e = new ArrayList();

    /* renamed from: f */
    public C1690c f63802f;

    /* renamed from: com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel$a */
    public static final class C24037a {
        private C24037a() {
        }

        public /* synthetic */ C24037a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static BrowseRecordViewModel m58865a(FragmentActivity fragmentActivity, C24045d dVar) {
            C52711k.m112240b(fragmentActivity, "activity");
            C52711k.m112240b(dVar, "view");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(BrowseRecordViewModel.class);
            BrowseRecordViewModel browseRecordViewModel = (BrowseRecordViewModel) a;
            if (!browseRecordViewModel.f63801e.contains(dVar)) {
                browseRecordViewModel.f63801e.add(dVar);
            }
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…      }\n                }");
            return browseRecordViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel$b */
    static final class C24038b<T> implements C1710e<C24043b> {

        /* renamed from: a */
        final /* synthetic */ BrowseRecordViewModel f63803a;

        /* renamed from: b */
        final /* synthetic */ String f63804b;

        /* renamed from: c */
        final /* synthetic */ boolean f63805c;

        C24038b(BrowseRecordViewModel browseRecordViewModel, String str, boolean z) {
            this.f63803a = browseRecordViewModel;
            this.f63804b = str;
            this.f63805c = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            List list;
            boolean z2;
            BrowseRecordViewModel browseRecordViewModel;
            List list2;
            boolean z3;
            C24043b bVar = (C24043b) obj;
            BrowseRecordViewModel browseRecordViewModel2 = this.f63803a;
            String str = this.f63804b;
            boolean z4 = this.f63805c;
            if (bVar != null) {
                C24043b bVar2 = (C24043b) browseRecordViewModel2.f63799c.get(str);
                List<C24042a> list3 = bVar.f63814a;
                Collection collection = list3;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list = C52575l.m112097a();
                } else {
                    List arrayList = new ArrayList();
                    for (C24042a aVar : list3) {
                        User user = aVar.getUser();
                        if (user != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(user.getUid());
                            String sb2 = sb.toString();
                            if (!browseRecordViewModel2.f63798b.contains(sb2)) {
                                browseRecordViewModel2.f63798b.add(sb2);
                                arrayList.add(aVar);
                            }
                        }
                    }
                    list = arrayList;
                }
                List<C24042a> list4 = bVar.f63815b;
                if (list4 == null) {
                    list4 = C52575l.m112097a();
                }
                if (z4) {
                    if (bVar2 == null) {
                        Map map = browseRecordViewModel2.f63799c;
                        browseRecordViewModel = browseRecordViewModel2;
                        String str2 = str;
                        C24043b bVar3 = new C24043b(C52575l.m112138e((Iterable<? extends T>) list), C52575l.m112138e((Iterable<? extends T>) list4), bVar.f63816c, bVar.f63817d, bVar.f63818e, bVar.f63819f);
                        map.put(str2, bVar3);
                    } else {
                        browseRecordViewModel = browseRecordViewModel2;
                        List<C24042a> list5 = bVar2.f63814a;
                        if (list5 != null) {
                            list2 = C52575l.m112139e((Collection<? extends T>) list5);
                        } else {
                            list2 = new ArrayList();
                        }
                        bVar2.f63814a = C52575l.m112133c(list2, list);
                        bVar2.f63816c = bVar.f63816c;
                        bVar2.f63817d = bVar.f63817d;
                        bVar2.f63818e = bVar.f63818e;
                        bVar2.f63819f = bVar.f63819f;
                    }
                    BrowseRecordViewModel browseRecordViewModel3 = browseRecordViewModel;
                    for (C24045d dVar : browseRecordViewModel3.f63801e) {
                        if (browseRecordViewModel3.f63797a || bVar.f63818e) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        dVar.mo49748a(list, z3);
                    }
                    return;
                }
                String str3 = str;
                BrowseRecordViewModel browseRecordViewModel4 = browseRecordViewModel2;
                String str4 = str3;
                Map map2 = browseRecordViewModel4.f63799c;
                C24043b bVar4 = new C24043b(C52575l.m112138e((Iterable<? extends T>) list), C52575l.m112138e((Iterable<? extends T>) list4), bVar.f63816c, bVar.f63817d, bVar.f63818e, bVar.f63819f);
                map2.put(str4, bVar4);
                for (C24045d dVar2 : browseRecordViewModel4.f63801e) {
                    long j = bVar.f63819f;
                    if (browseRecordViewModel4.f63797a || bVar.f63818e) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dVar2.mo49747a(list, j, z2, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel$c */
    static final class C24039c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BrowseRecordViewModel f63806a;

        /* renamed from: b */
        final /* synthetic */ boolean f63807b;

        C24039c(BrowseRecordViewModel browseRecordViewModel, boolean z) {
            this.f63806a = browseRecordViewModel;
            this.f63807b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            BrowseRecordViewModel browseRecordViewModel = this.f63806a;
            C52711k.m112236a((Object) th, "it");
            if (this.f63807b) {
                for (C24045d b : browseRecordViewModel.f63801e) {
                    b.mo49750b(th);
                }
                return;
            }
            for (C24045d a : browseRecordViewModel.f63801e) {
                a.mo49746a(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel$d */
    public static final class C24040d<T> implements C1710e<RecommendList> {

        /* renamed from: a */
        final /* synthetic */ BrowseRecordViewModel f63808a;

        /* renamed from: b */
        final /* synthetic */ int f63809b;

        public C24040d(BrowseRecordViewModel browseRecordViewModel, int i) {
            this.f63808a = browseRecordViewModel;
            this.f63809b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            RecommendList recommendList = (RecommendList) obj;
            BrowseRecordViewModel browseRecordViewModel = this.f63808a;
            C52711k.m112236a((Object) recommendList, "it");
            if (this.f63809b > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || browseRecordViewModel.f63800d == null) {
                browseRecordViewModel.f63800d = recommendList;
            } else {
                RecommendList recommendList2 = browseRecordViewModel.f63800d;
                if (recommendList2 != null) {
                    List userList = recommendList2.getUserList();
                    C52711k.m112236a((Object) userList, "userList");
                    Collection collection = userList;
                    List userList2 = recommendList.getUserList();
                    C52711k.m112236a((Object) userList2, "recommendList.userList");
                    recommendList2.setUserList(C52575l.m112133c(collection, userList2));
                    recommendList2.setHasMore(recommendList.hasMore());
                    recommendList2.setLogPb(recommendList.getLogPb());
                    recommendList2.setCursor(recommendList.getCursor());
                    recommendList2.setRid(recommendList.getRid());
                }
            }
            for (C24045d dVar : browseRecordViewModel.f63801e) {
                List userList3 = recommendList.getUserList();
                C52711k.m112236a((Object) userList3, "recommendList.userList");
                dVar.mo49751b(userList3, recommendList.hasMore());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel$e */
    public static final class C24041e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BrowseRecordViewModel f63810a;

        public C24041e(BrowseRecordViewModel browseRecordViewModel) {
            this.f63810a = browseRecordViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            BrowseRecordViewModel browseRecordViewModel = this.f63810a;
            C52711k.m112236a((Object) th, "it");
            for (C24045d c : browseRecordViewModel.f63801e) {
                c.mo49753c(th);
            }
        }
    }

    /* renamed from: a */
    public final String mo49790a() {
        RecommendList recommendList = this.f63800d;
        if (recommendList != null) {
            String rid = recommendList.getRid();
            if (rid != null) {
                return rid;
            }
        }
        return "";
    }

    public final void onCleared() {
        super.onCleared();
        this.f63801e.clear();
        C1690c cVar = this.f63802f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f63802f = null;
    }

    /* renamed from: a */
    public final List<User> mo49791a(String str) {
        C52711k.m112240b(str, "aid");
        C24043b bVar = (C24043b) this.f63799c.get(str);
        if (bVar != null) {
            List<C24042a> list = bVar.f63815b;
            if (list != null) {
                Iterable<C24042a> iterable = list;
                Collection arrayList = new ArrayList();
                for (C24042a user : iterable) {
                    User user2 = user.getUser();
                    if (user2 != null) {
                        arrayList.add(user2);
                    }
                }
                return (List) arrayList;
            }
        }
        return C52575l.m112097a();
    }

    /* renamed from: b */
    public final void mo49793b(String str) {
        boolean z;
        C52711k.m112240b(str, "aid");
        for (C24045d d : this.f63801e) {
            d.mo49754d();
        }
        C24043b bVar = (C24043b) this.f63799c.get(str);
        if (bVar != null) {
            for (C24045d dVar : this.f63801e) {
                List<C24042a> list = bVar.f63814a;
                if (list == null) {
                    list = C52575l.m112097a();
                }
                List<C24042a> list2 = list;
                long j = bVar.f63819f;
                if (this.f63797a || bVar.f63818e) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.mo49747a(list2, j, z, true);
            }
            return;
        }
        mo49792a(str, 3, 0, 0);
    }

    /* renamed from: a */
    public final void mo49792a(String str, int i, long j, long j2) {
        boolean z;
        if (j > 0 || j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f63802f = C24044c.m58866a(str, i, C47945d.m103731a(), j, j2).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C24038b<Object>(this, str, z), (C1710e<? super Throwable>) new C24039c<Object>(this, z));
    }
}
