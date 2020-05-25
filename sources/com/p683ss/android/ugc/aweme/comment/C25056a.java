package com.p683ss.android.ugc.aweme.comment;

import android.text.Editable;
import com.p683ss.android.ugc.aweme.comment.adapter.C25104b;
import com.p683ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.p683ss.android.ugc.aweme.comment.model.CommentAtSummonFriendList;
import com.p683ss.android.ugc.aweme.comment.model.CommentAtUser;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25244o;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25244o.C25245a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25244o.C25246b;
import com.p683ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p683ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p093k.C2168a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.a */
public final class C25056a {

    /* renamed from: h */
    public static final C25057a f66376h = new C25057a(null);

    /* renamed from: a */
    public C25058b f66377a;

    /* renamed from: b */
    public C25104b f66378b;

    /* renamed from: c */
    public final HashMap<String, CommentAtSummonFriendList> f66379c = new HashMap<>();

    /* renamed from: d */
    public CommentAtSummonFriendList f66380d;

    /* renamed from: e */
    public CommentAtSummonFriendList f66381e;

    /* renamed from: f */
    public CommentAtSummonFriendList f66382f;

    /* renamed from: g */
    public final C25244o f66383g;

    /* renamed from: com.ss.android.ugc.aweme.comment.a$a */
    public static final class C25057a {
        private C25057a() {
        }

        public /* synthetic */ C25057a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$b */
    public interface C25058b {
        /* renamed from: a */
        void mo51124a();

        /* renamed from: a */
        void mo51125a(boolean z);

        /* renamed from: a */
        boolean mo51126a(String str);

        /* renamed from: b */
        void mo51127b();

        void dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$c */
    public static final class C25059c implements C25245a {

        /* renamed from: a */
        final /* synthetic */ C25056a f66384a;

        public C25059c(C25056a aVar) {
            this.f66384a = aVar;
        }

        /* renamed from: a */
        public final void mo51129a(String str) {
            C52711k.m112240b(str, "s");
            this.f66384a.mo51120a(str, 0, 10, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$d */
    static final class C25060d<T1, T2, R> implements C1707b<RecentFriendModel, RecentFriendModel, SummonFriendList> {

        /* renamed from: a */
        final /* synthetic */ C25056a f66385a;

        C25060d(C25056a aVar) {
            this.f66385a = aVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo6200a(Object obj, Object obj2) {
            RecentFriendModel recentFriendModel = (RecentFriendModel) obj;
            RecentFriendModel recentFriendModel2 = (RecentFriendModel) obj2;
            C52711k.m112240b(recentFriendModel, "t1");
            C52711k.m112240b(recentFriendModel2, "t2");
            SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), 0, false, "");
            this.f66385a.f66381e.items.clear();
            List<User> list = recentFriendModel.users;
            if (list != null) {
                for (User user : list) {
                    List<User> list2 = recentFriendModel2.users;
                    if (list2 != null) {
                        Iterable iterable = list2;
                        Collection arrayList = new ArrayList();
                        for (Object next : iterable) {
                            User user2 = (User) next;
                            C52711k.m112236a((Object) user, "t1User");
                            String uid = user.getUid();
                            C52711k.m112236a((Object) user2, "it");
                            if (C52711k.m112239a((Object) uid, (Object) user2.getUid())) {
                                arrayList.add(next);
                            }
                        }
                        for (User user3 : (List) arrayList) {
                            List<User> list3 = recentFriendModel2.users;
                            if (list3 != null) {
                                list3.remove(user3);
                            }
                        }
                    }
                    SummonFriendItem summonFriendItem = new SummonFriendItem();
                    summonFriendItem.mUser = user;
                    summonFriendItem.type = 4;
                    summonFriendList.items.add(summonFriendItem);
                    this.f66385a.f66381e.items.add(CommentAtSummonFriendItem.toCommentAtSummonFriendItem(summonFriendItem));
                }
            }
            List<User> list4 = recentFriendModel2.users;
            if (list4 != null) {
                for (User user4 : list4) {
                    SummonFriendItem summonFriendItem2 = new SummonFriendItem();
                    summonFriendItem2.mUser = user4;
                    summonFriendItem2.type = 3;
                    summonFriendList.items.add(summonFriendItem2);
                }
            }
            summonFriendList.cursor = recentFriendModel2.cursor;
            summonFriendList.hasMore = recentFriendModel2.hasMore;
            return summonFriendList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$e */
    public static final class C25061e implements C1674ab<SummonFriendList> {

        /* renamed from: a */
        final /* synthetic */ C25056a f66386a;

        /* renamed from: b */
        final /* synthetic */ int f66387b;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f66386a.mo51122b().ao_();
            this.f66386a.mo51122b().mo54793i();
            this.f66386a.mo51117a().mo51125a(true);
            if (this.f66387b == 0) {
                this.f66386a.mo51117a().mo51127b();
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            SummonFriendList summonFriendList = (SummonFriendList) obj;
            C52711k.m112240b(summonFriendList, "data");
            this.f66386a.mo51122b().ao_();
            C25056a aVar = this.f66386a;
            CommentAtSummonFriendList commonAtSummonFriendList = CommentAtSummonFriendList.toCommonAtSummonFriendList(summonFriendList);
            C52711k.m112236a((Object) commonAtSummonFriendList, "CommentAtSummonFriendLis…nAtSummonFriendList(data)");
            aVar.mo51119a(commonAtSummonFriendList, this.f66387b);
        }

        C25061e(C25056a aVar, int i) {
            this.f66386a = aVar;
            this.f66387b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$f */
    public static final class C25062f implements C1674ab<RecentFriendModel> {

        /* renamed from: a */
        final /* synthetic */ C25056a f66388a;

        /* renamed from: b */
        final /* synthetic */ int f66389b;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f66388a.mo51122b().ao_();
            this.f66388a.mo51122b().co_();
            this.f66388a.mo51117a().mo51125a(true);
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str;
            RecentFriendModel recentFriendModel = (RecentFriendModel) obj;
            C52711k.m112240b(recentFriendModel, "t");
            this.f66388a.mo51122b().ao_();
            SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), recentFriendModel.cursor, recentFriendModel.hasMore, "");
            List<User> list = recentFriendModel.users;
            if (list != null) {
                for (User user : list) {
                    boolean z = false;
                    List<CommentAtSummonFriendItem> list2 = this.f66388a.f66381e.items;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            CommentAtSummonFriendItem commentAtSummonFriendItem = (CommentAtSummonFriendItem) it.next();
                            C52711k.m112236a((Object) commentAtSummonFriendItem, "it2");
                            CommentAtUser commentAtUser = commentAtSummonFriendItem.mUser;
                            if (commentAtUser != null) {
                                str = commentAtUser.uid;
                            } else {
                                str = null;
                            }
                            C52711k.m112236a((Object) user, "it");
                            if (C52711k.m112239a((Object) str, (Object) user.getUid())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (!z) {
                        SummonFriendItem summonFriendItem = new SummonFriendItem();
                        summonFriendItem.mUser = user;
                        summonFriendList.items.add(summonFriendItem);
                    }
                }
            }
            C25056a aVar = this.f66388a;
            CommentAtSummonFriendList commonAtSummonFriendList = CommentAtSummonFriendList.toCommonAtSummonFriendList(summonFriendList);
            C52711k.m112236a((Object) commonAtSummonFriendList, "CommentAtSummonFriendLis…endList(summonFriendList)");
            aVar.mo51119a(commonAtSummonFriendList, this.f66389b);
        }

        C25062f(C25056a aVar, int i) {
            this.f66388a = aVar;
            this.f66389b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$g */
    public static final class C25063g implements C1674ab<SummonFriendList> {

        /* renamed from: a */
        final /* synthetic */ C25056a f66390a;

        /* renamed from: b */
        final /* synthetic */ String f66391b;

        /* renamed from: c */
        final /* synthetic */ int f66392c;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "p0");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "p0");
            this.f66390a.mo51122b().ao_();
            this.f66390a.mo51122b().co_();
            this.f66390a.mo51117a().mo51125a(true);
            if (this.f66392c == 0) {
                this.f66390a.mo51117a().mo51127b();
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean z;
            boolean z2;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            SummonFriendList summonFriendList = (SummonFriendList) obj;
            C52711k.m112240b(summonFriendList, "data");
            this.f66390a.mo51122b().ao_();
            SummonFriendList summonFriendList2 = new SummonFriendList(new ArrayList(), summonFriendList.cursor, summonFriendList.hasMore, this.f66391b);
            SummonFriendList summonFriendList3 = new SummonFriendList(new ArrayList(), summonFriendList.cursor, summonFriendList.hasMore, this.f66391b);
            List a = this.f66390a.mo51122b().mo50673a();
            if (a == null) {
                a = C52575l.m112097a();
            }
            List<SummonFriendItem> list = summonFriendList.items;
            boolean z3 = true;
            if (list != null) {
                for (SummonFriendItem summonFriendItem : list) {
                    Iterable iterable = a;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            CommentAtSummonFriendItem commentAtSummonFriendItem = (CommentAtSummonFriendItem) it.next();
                            C52711k.m112236a((Object) commentAtSummonFriendItem, "it");
                            CommentAtUser commentAtUser = commentAtSummonFriendItem.mUser;
                            if (commentAtUser != null) {
                                obj4 = commentAtUser.uid;
                            } else {
                                obj4 = null;
                            }
                            C52711k.m112236a((Object) summonFriendItem, "item");
                            User user = summonFriendItem.mUser;
                            if (user != null) {
                                obj5 = user.getUid();
                            } else {
                                obj5 = null;
                            }
                            if (C52711k.m112239a(obj4, obj5)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        List<CommentAtSummonFriendItem> list2 = this.f66390a.f66380d.items;
                        if (list2 != null) {
                            Iterable iterable2 = list2;
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it2 = iterable2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    CommentAtSummonFriendItem commentAtSummonFriendItem2 = (CommentAtSummonFriendItem) it2.next();
                                    C52711k.m112236a((Object) commentAtSummonFriendItem2, "it");
                                    CommentAtUser commentAtUser2 = commentAtSummonFriendItem2.mUser;
                                    if (commentAtUser2 != null) {
                                        obj2 = commentAtUser2.uid;
                                    } else {
                                        obj2 = null;
                                    }
                                    C52711k.m112236a((Object) summonFriendItem, "item");
                                    User user2 = summonFriendItem.mUser;
                                    if (user2 != null) {
                                        obj3 = user2.getUid();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (C52711k.m112239a(obj2, obj3)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                            summonFriendList2.items.add(summonFriendItem);
                        } else {
                            summonFriendList3.items.add(summonFriendItem);
                        }
                    }
                }
            }
            List<SummonFriendItem> list3 = summonFriendList2.items;
            List<SummonFriendItem> list4 = summonFriendList3.items;
            C52711k.m112236a((Object) list4, "summonFriendList.items");
            list3.addAll(list4);
            C25056a aVar = this.f66390a;
            String str = this.f66391b;
            CommentAtSummonFriendList commonAtSummonFriendList = CommentAtSummonFriendList.toCommonAtSummonFriendList(summonFriendList2);
            C52711k.m112236a((Object) commonAtSummonFriendList, "CommentAtSummonFriendLis…List(summonTopFriendList)");
            aVar.mo51121a(str, commonAtSummonFriendList, this.f66392c);
            C25058b bVar = aVar.f66377a;
            if (bVar == null) {
                C52711k.m112237a("listener");
            }
            if (bVar.mo51126a(str)) {
                C25104b bVar2 = aVar.f66378b;
                if (bVar2 == null) {
                    C52711k.m112237a("adapter");
                }
                bVar2.f66522b = 1;
                C25058b bVar3 = aVar.f66377a;
                if (bVar3 == null) {
                    C52711k.m112237a("listener");
                }
                bVar3.mo51125a(true);
                C25104b bVar4 = aVar.f66378b;
                if (bVar4 == null) {
                    C52711k.m112237a("adapter");
                }
                bVar4.mo54798c(commonAtSummonFriendList.hasMore);
                CommentAtSummonFriendList commentAtSummonFriendList = (CommentAtSummonFriendList) aVar.f66379c.get(str);
                if (commentAtSummonFriendList != null) {
                    aVar.f66382f = commentAtSummonFriendList;
                    C25104b bVar5 = aVar.f66378b;
                    if (bVar5 == null) {
                        C52711k.m112237a("adapter");
                    }
                    bVar5.mo50303a(aVar.f66382f.items);
                    Collection collection = aVar.f66382f.items;
                    if (collection != null && !collection.isEmpty()) {
                        z3 = false;
                    }
                    if (z3) {
                        aVar.dismiss();
                    }
                }
            }
        }

        C25063g(C25056a aVar, String str, int i) {
            this.f66390a = aVar;
            this.f66391b = str;
            this.f66392c = i;
        }
    }

    /* renamed from: b */
    public final C25104b mo51122b() {
        C25104b bVar = this.f66378b;
        if (bVar == null) {
            C52711k.m112237a("adapter");
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    public final void dismiss() {
        C25058b bVar = this.f66377a;
        if (bVar == null) {
            C52711k.m112237a("listener");
        }
        bVar.dismiss();
    }

    /* renamed from: a */
    public final C25058b mo51117a() {
        C25058b bVar = this.f66377a;
        if (bVar == null) {
            C52711k.m112237a("listener");
        }
        return bVar;
    }

    /* renamed from: c */
    private final void m60906c() {
        CommentAtSummonFriendList commentAtSummonFriendList = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");
        this.f66382f = commentAtSummonFriendList;
        C25104b bVar = this.f66378b;
        if (bVar == null) {
            C52711k.m112237a("adapter");
        }
        bVar.mo50303a(this.f66382f.items);
        C25104b bVar2 = this.f66378b;
        if (bVar2 == null) {
            C52711k.m112237a("adapter");
        }
        bVar2.notifyDataSetChanged();
    }

    public C25056a() {
        CommentAtSummonFriendList commentAtSummonFriendList = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");
        this.f66380d = commentAtSummonFriendList;
        CommentAtSummonFriendList commentAtSummonFriendList2 = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");
        this.f66381e = commentAtSummonFriendList2;
        CommentAtSummonFriendList commentAtSummonFriendList3 = new CommentAtSummonFriendList(new ArrayList(), 0, false, "");
        this.f66382f = commentAtSummonFriendList3;
        this.f66383g = new C25244o();
    }

    /* renamed from: a */
    public final void mo51118a(int i, Editable editable) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        String a = m60903a(i, editable, true);
        if (a == null) {
            dismiss();
            return;
        }
        C25058b bVar = this.f66377a;
        if (bVar == null) {
            C52711k.m112237a("listener");
        }
        bVar.mo51124a();
        this.f66382f.keyword = a;
        if (this.f66379c.containsKey(a)) {
            CommentAtSummonFriendList commentAtSummonFriendList = (CommentAtSummonFriendList) this.f66379c.get(a);
            if (commentAtSummonFriendList != null) {
                Collection collection = commentAtSummonFriendList.items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (a.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C25104b bVar2 = this.f66378b;
                        if (bVar2 == null) {
                            C52711k.m112237a("adapter");
                        }
                        bVar2.f66522b = 0;
                    } else {
                        C25104b bVar3 = this.f66378b;
                        if (bVar3 == null) {
                            C52711k.m112237a("adapter");
                        }
                        bVar3.f66522b = 1;
                    }
                    C25058b bVar4 = this.f66377a;
                    if (bVar4 == null) {
                        C52711k.m112237a("listener");
                    }
                    bVar4.mo51125a(true);
                    this.f66382f = commentAtSummonFriendList;
                    this.f66382f.keyword = a;
                    C25104b bVar5 = this.f66378b;
                    if (bVar5 == null) {
                        C52711k.m112237a("adapter");
                    }
                    bVar5.mo50303a(commentAtSummonFriendList.items);
                    C25104b bVar6 = this.f66378b;
                    if (bVar6 == null) {
                        C52711k.m112237a("adapter");
                    }
                    bVar6.mo54798c(commentAtSummonFriendList.hasMore);
                    return;
                }
            }
            dismiss();
            return;
        }
        if (a.length() != 0) {
            z3 = false;
        }
        if (z3) {
            m60906c();
            C25058b bVar7 = this.f66377a;
            if (bVar7 == null) {
                C52711k.m112237a("listener");
            }
            bVar7.mo51125a(false);
            m60904a(0, 0, 50);
            return;
        }
        m60906c();
        C25058b bVar8 = this.f66377a;
        if (bVar8 == null) {
            C52711k.m112237a("listener");
        }
        bVar8.mo51125a(false);
        C25244o oVar = this.f66383g;
        C52711k.m112240b(a, "msg");
        C25246b bVar9 = oVar.f66850a;
        if (bVar9 != null) {
            bVar9.mo51529a(a);
        }
    }

    /* renamed from: a */
    public final void mo51119a(CommentAtSummonFriendList commentAtSummonFriendList, int i) {
        mo51121a("", commentAtSummonFriendList, i);
        C25058b bVar = this.f66377a;
        if (bVar == null) {
            C52711k.m112237a("listener");
        }
        if (bVar.mo51126a("")) {
            C25104b bVar2 = this.f66378b;
            if (bVar2 == null) {
                C52711k.m112237a("adapter");
            }
            boolean z = false;
            bVar2.f66522b = 0;
            C25058b bVar3 = this.f66377a;
            if (bVar3 == null) {
                C52711k.m112237a("listener");
            }
            bVar3.mo51125a(true);
            C25104b bVar4 = this.f66378b;
            if (bVar4 == null) {
                C52711k.m112237a("adapter");
            }
            bVar4.mo54798c(commentAtSummonFriendList.hasMore);
            CommentAtSummonFriendList commentAtSummonFriendList2 = (CommentAtSummonFriendList) this.f66379c.get("");
            if (commentAtSummonFriendList2 != null) {
                this.f66380d = commentAtSummonFriendList2;
                if (i == 0) {
                    C25104b bVar5 = this.f66378b;
                    if (bVar5 == null) {
                        C52711k.m112237a("adapter");
                    }
                    bVar5.mo50303a(this.f66380d.items);
                    this.f66382f = this.f66380d;
                } else {
                    this.f66382f = this.f66380d;
                    C25104b bVar6 = this.f66378b;
                    if (bVar6 == null) {
                        C52711k.m112237a("adapter");
                    }
                    bVar6.mo50303a(this.f66382f.items);
                }
                Collection collection = this.f66382f.items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m60904a(long j, int i, long j2) {
        if (i == 0) {
            C2201v.m6603a((C2206z<? extends T1>) SummonFriendApi.f84783a.queryRecentFriends4At(), (C2206z<? extends T2>) SummonFriendApi.m75331a((int) j2, (int) j), (C1707b<? super T1, ? super T2, ? extends R>) new C25060d<Object,Object,Object>(this)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C25061e<Object>(this, i));
            return;
        }
        SummonFriendApi.m75331a((int) j2, (int) j).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C25062f<Object>(this, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m60903a(int r9, android.text.Editable r10, boolean r11) {
        /*
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            int r3 = r0.length()
            if (r3 != 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r3 = 0
            goto L_0x0011
        L_0x0010:
            r3 = 1
        L_0x0011:
            r4 = 0
            if (r3 != 0) goto L_0x00a5
            if (r9 != 0) goto L_0x0018
            goto L_0x00a5
        L_0x0018:
            d.j.c r3 = p2628d.p2647j.C52753d.m112320b(r2, r9)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r5 = r4
        L_0x0023:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0043
            java.lang.Object r6 = r3.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            char r7 = r10.charAt(r7)
            r8 = 64
            if (r7 != r8) goto L_0x003e
            r7 = 1
            goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            if (r7 == 0) goto L_0x0023
            r5 = r6
            goto L_0x0023
        L_0x0043:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x00a4
            int r3 = r5.intValue()
            java.lang.Class<com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan> r5 = com.p683ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan.class
            java.lang.Object[] r10 = r10.getSpans(r3, r9, r5)
            com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan[] r10 = (com.p683ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan[]) r10
            if (r10 == 0) goto L_0x0060
            int r10 = r10.length
            if (r10 != 0) goto L_0x005a
            r10 = 1
            goto L_0x005b
        L_0x005a:
            r10 = 0
        L_0x005b:
            if (r10 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r10 = 0
            goto L_0x0061
        L_0x0060:
            r10 = 1
        L_0x0061:
            if (r10 != 0) goto L_0x0064
            return r4
        L_0x0064:
            int r3 = r3 + r1
            java.lang.CharSequence r9 = r0.subSequence(r3, r9)
            java.lang.String r9 = r9.toString()
            r10 = r9
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r0 = "  "
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 2
            boolean r0 = p2628d.p2650m.C52830p.m112456b(r10, r0, r2, r1, r4)
            if (r0 == 0) goto L_0x007c
            return r4
        L_0x007c:
            r0 = 10
            boolean r0 = p2628d.p2650m.C52830p.m112454b(r10, r0, r2, r1, r4)
            if (r0 == 0) goto L_0x0085
            return r4
        L_0x0085:
            if (r11 == 0) goto L_0x009a
            if (r9 == 0) goto L_0x0092
            java.lang.CharSequence r9 = p2628d.p2650m.C52830p.m112447b(r10)
            java.lang.String r9 = r9.toString()
            goto L_0x009a
        L_0x0092:
            d.u r9 = new d.u
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.CharSequence"
            r9.<init>(r10)
            throw r9
        L_0x009a:
            int r10 = r9.length()
            r11 = 24
            if (r10 <= r11) goto L_0x00a3
            return r4
        L_0x00a3:
            return r9
        L_0x00a4:
            return r4
        L_0x00a5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25056a.m60903a(int, android.text.Editable, boolean):java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51121a(String str, CommentAtSummonFriendList commentAtSummonFriendList, int i) {
        List<CommentAtSummonFriendItem> list;
        switch (i) {
            case 0:
                this.f66379c.put(str, commentAtSummonFriendList);
                CommentAtSummonFriendList commentAtSummonFriendList2 = (CommentAtSummonFriendList) this.f66379c.get(str);
                if (commentAtSummonFriendList2 != null) {
                    commentAtSummonFriendList2.keyword = str;
                }
                return;
            case 1:
                if (this.f66379c.get(str) != null) {
                    CommentAtSummonFriendList commentAtSummonFriendList3 = (CommentAtSummonFriendList) this.f66379c.get(str);
                    if (commentAtSummonFriendList3 != null) {
                        list = commentAtSummonFriendList3.items;
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        CommentAtSummonFriendList commentAtSummonFriendList4 = (CommentAtSummonFriendList) this.f66379c.get(str);
                        if (commentAtSummonFriendList4 != null) {
                            List<CommentAtSummonFriendItem> list2 = commentAtSummonFriendList4.items;
                            if (list2 != null) {
                                List<CommentAtSummonFriendItem> list3 = commentAtSummonFriendList.items;
                                C52711k.m112236a((Object) list3, "data.items");
                                list2.addAll(list3);
                            }
                        }
                        CommentAtSummonFriendList commentAtSummonFriendList5 = (CommentAtSummonFriendList) this.f66379c.get(str);
                        if (commentAtSummonFriendList5 != null) {
                            commentAtSummonFriendList5.cursor = commentAtSummonFriendList.cursor;
                        }
                        CommentAtSummonFriendList commentAtSummonFriendList6 = (CommentAtSummonFriendList) this.f66379c.get(str);
                        if (commentAtSummonFriendList6 != null) {
                            commentAtSummonFriendList6.keyword = str;
                        }
                        CommentAtSummonFriendList commentAtSummonFriendList7 = (CommentAtSummonFriendList) this.f66379c.get(str);
                        if (commentAtSummonFriendList7 != null) {
                            commentAtSummonFriendList7.hasMore = commentAtSummonFriendList.hasMore;
                        }
                        return;
                    }
                }
                this.f66379c.put(str, commentAtSummonFriendList);
                CommentAtSummonFriendList commentAtSummonFriendList8 = (CommentAtSummonFriendList) this.f66379c.get(str);
                if (commentAtSummonFriendList8 != null) {
                    commentAtSummonFriendList8.keyword = str;
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo51120a(String str, long j, long j2, int i) {
        C52711k.m112240b(str, "searchKey");
        SummonFriendApi.f84783a.searchFriends4At(str, 10, j, 1, "comment_user", 1).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C25063g<Object>(this, str, i));
    }
}
