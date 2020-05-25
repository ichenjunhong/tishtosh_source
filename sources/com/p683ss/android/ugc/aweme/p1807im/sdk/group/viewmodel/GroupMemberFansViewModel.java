package com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel;

import android.os.Handler;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.following.p1768a.C31995c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34276a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34284h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel */
public final class GroupMemberFansViewModel extends BaseMemberListViewModel<IMContact> implements C34369a<User> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88690a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupMemberFansViewModel.class), "searchTask", "getSearchTask()Ljava/lang/Runnable;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupMemberFansViewModel.class), "searchHandler", "getSearchHandler()Landroid/os/Handler;"))};

    /* renamed from: g */
    public static final C34348a f88691g = new C34348a(null);

    /* renamed from: b */
    public String f88692b;

    /* renamed from: c */
    public List<? extends IMContact> f88693c = C52575l.m112097a();

    /* renamed from: d */
    public boolean f88694d;

    /* renamed from: f */
    public final C34370b f88695f = new C34370b();

    /* renamed from: h */
    private C26876b<C26875a<User, C31995c>> f88696h;

    /* renamed from: i */
    private final C52668f f88697i = C52732g.m112285a(new C34358k(this));

    /* renamed from: t */
    private final C52668f f88698t = C52732g.m112285a(C34357j.f88719a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$a */
    public static final class C34348a {
        private C34348a() {
        }

        public /* synthetic */ C34348a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$b */
    static final class C34349b extends C52712l implements C52671b<List<? extends C33367a>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88699a;

        C34349b(GroupMemberFansViewModel groupMemberFansViewModel) {
            this.f88699a = groupMemberFansViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object obj2;
            List list = (List) obj;
            if (list != null) {
                GroupMemberFansViewModel groupMemberFansViewModel = this.f88699a;
                Iterable<C33367a> iterable = list;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (C33367a aVar : iterable) {
                    IMUser user = aVar.getUser();
                    if (user == null) {
                        user = new IMUser();
                        C11206o member = aVar.getMember();
                        String str = null;
                        if (member != null) {
                            obj2 = Long.valueOf(member.getUid());
                        } else {
                            obj2 = null;
                        }
                        user.setUid(String.valueOf(obj2));
                        C11206o member2 = aVar.getMember();
                        if (member2 != null) {
                            str = member2.getAlias();
                        }
                        user.setNickName(str);
                    }
                    arrayList.add(user);
                }
                List<? extends IMContact> list2 = (List) arrayList;
                C52711k.m112240b(list2, "<set-?>");
                groupMemberFansViewModel.f88693c = list2;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$c */
    static final class C34350c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88700a;

        /* renamed from: b */
        final /* synthetic */ boolean f88701b;

        /* renamed from: c */
        final /* synthetic */ List f88702c;

        C34350c(GroupMemberFansViewModel groupMemberFansViewModel, boolean z, List list) {
            this.f88700a = groupMemberFansViewModel;
            this.f88701b = z;
            this.f88702c = list;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            List list;
            this.f88700a.f88694d = this.f88701b;
            List list2 = this.f88702c;
            if (list2 != null) {
                Iterable<User> iterable = list2;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (User fromUser : iterable) {
                    IMUser fromUser2 = IMUser.fromUser(fromUser);
                    if (fromUser2 != null) {
                        arrayList.add(fromUser2);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMContact");
                    }
                }
                list = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
            } else {
                list = new ArrayList();
            }
            this.f88700a.f90194k.setValue(list);
            this.f88700a.mo71927e(list, this.f88701b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$d */
    static final class C34351d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88703a;

        /* renamed from: b */
        final /* synthetic */ boolean f88704b;

        /* renamed from: c */
        final /* synthetic */ List f88705c;

        C34351d(GroupMemberFansViewModel groupMemberFansViewModel, boolean z, List list) {
            this.f88703a = groupMemberFansViewModel;
            this.f88704b = z;
            this.f88705c = list;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            List list;
            this.f88703a.f88694d = this.f88704b;
            List list2 = this.f88705c;
            if (list2 != null) {
                Iterable<User> iterable = list2;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (User fromUser : iterable) {
                    IMUser fromUser2 = IMUser.fromUser(fromUser);
                    if (fromUser2 != null) {
                        arrayList.add(fromUser2);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMContact");
                    }
                }
                list = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
            } else {
                list = null;
            }
            this.f88703a.f90194k.setValue(list);
            this.f88703a.mo71926d(list, this.f88704b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$e */
    static final class C34352e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88706a;

        /* renamed from: b */
        final /* synthetic */ Throwable f88707b;

        C34352e(GroupMemberFansViewModel groupMemberFansViewModel, Throwable th) {
            this.f88706a = groupMemberFansViewModel;
            this.f88707b = th;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88706a.mo71921a_(this.f88707b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$f */
    static final class C34353f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88708a;

        /* renamed from: b */
        final /* synthetic */ Throwable f88709b;

        C34353f(GroupMemberFansViewModel groupMemberFansViewModel, Throwable th) {
            this.f88708a = groupMemberFansViewModel;
            this.f88709b = th;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88708a.mo71923b_(this.f88709b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$g */
    static final class C34354g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88710a;

        /* renamed from: b */
        final /* synthetic */ List f88711b;

        /* renamed from: c */
        final /* synthetic */ boolean f88712c;

        C34354g(GroupMemberFansViewModel groupMemberFansViewModel, List list, boolean z) {
            this.f88710a = groupMemberFansViewModel;
            this.f88711b = list;
            this.f88712c = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            List list;
            List list2 = (List) this.f88710a.f90195l.getValue();
            if (list2 != null) {
                list = C52575l.m112139e((Collection<? extends T>) list2);
            } else {
                list = new ArrayList();
            }
            List list3 = this.f88711b;
            if (list3 == null) {
                list3 = new ArrayList();
            }
            list.addAll(list3);
            this.f88710a.f90195l.setValue(list);
            this.f88710a.mo71927e(list, this.f88712c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$h */
    static final class C34355h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88713a;

        /* renamed from: b */
        final /* synthetic */ List f88714b;

        /* renamed from: c */
        final /* synthetic */ boolean f88715c;

        C34355h(GroupMemberFansViewModel groupMemberFansViewModel, List list, boolean z) {
            this.f88713a = groupMemberFansViewModel;
            this.f88714b = list;
            this.f88715c = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88713a.f90195l.setValue(this.f88714b);
            this.f88713a.mo71926d(this.f88714b, this.f88715c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$i */
    public static final class C34356i implements C1683ag<C34276a> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88716a;

        /* renamed from: b */
        final /* synthetic */ String f88717b;

        /* renamed from: c */
        final /* synthetic */ int f88718c;

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            C32458a.m75148a(th);
            if (!(!C52711k.m112239a((Object) this.f88717b, (Object) this.f88716a.f88695f.f88735a))) {
                if (this.f88718c > 0) {
                    GroupMemberFansViewModel groupMemberFansViewModel = this.f88716a;
                    groupMemberFansViewModel.mo72362a((C52670a<C52860x>) new C34353f<C52860x>(groupMemberFansViewModel, th));
                    return;
                }
                GroupMemberFansViewModel groupMemberFansViewModel2 = this.f88716a;
                groupMemberFansViewModel2.mo72362a((C52670a<C52860x>) new C34352e<C52860x>(groupMemberFansViewModel2, th));
            }
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            List list;
            boolean z;
            C34276a aVar = (C34276a) obj;
            C52711k.m112240b(aVar, "response");
            if (!(!C52711k.m112239a((Object) this.f88717b, (Object) this.f88716a.f88695f.f88735a))) {
                this.f88716a.f88695f.f88736b = aVar.f88497b;
                List<C34284h> list2 = aVar.f88496a;
                if (list2 != null) {
                    Iterable iterable = list2;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (((C34284h) next).getUser() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<C34284h> iterable2 = (List) arrayList;
                    Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
                    for (C34284h user : iterable2) {
                        User user2 = user.getUser();
                        if (user2 == null) {
                            C52711k.m112234a();
                        }
                        IMUser fromUser = IMUser.fromUser(user2);
                        if (fromUser != null) {
                            arrayList2.add(fromUser);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMContact");
                        }
                    }
                    list = C52575l.m112139e((Collection<? extends T>) (List) arrayList2);
                } else {
                    list = null;
                }
                if (this.f88718c > 0) {
                    GroupMemberFansViewModel groupMemberFansViewModel = this.f88716a;
                    groupMemberFansViewModel.mo72362a((C52670a<C52860x>) new C34354g<C52860x>(groupMemberFansViewModel, list, aVar.f88498c));
                    return;
                }
                GroupMemberFansViewModel groupMemberFansViewModel2 = this.f88716a;
                groupMemberFansViewModel2.mo72362a((C52670a<C52860x>) new C34355h<C52860x>(groupMemberFansViewModel2, list, aVar.f88498c));
            }
        }

        C34356i(GroupMemberFansViewModel groupMemberFansViewModel, String str, int i) {
            this.f88716a = groupMemberFansViewModel;
            this.f88717b = str;
            this.f88718c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$j */
    static final class C34357j extends C52712l implements C52670a<Handler> {

        /* renamed from: a */
        public static final C34357j f88719a = new C34357j();

        C34357j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Handler();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$k */
    static final class C34358k extends C52712l implements C52670a<Runnable> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88720a;

        C34358k(GroupMemberFansViewModel groupMemberFansViewModel) {
            this.f88720a = groupMemberFansViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C34358k f88721a;

                {
                    this.f88721a = r1;
                }

                public final void run() {
                    this.f88721a.f88720a.mo72363a(this.f88721a.f88720a.f88695f.f88735a, this.f88721a.f88720a.f88695f.f88736b);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$l */
    static final class C34360l extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88722a;

        C34360l(GroupMemberFansViewModel groupMemberFansViewModel) {
            this.f88722a = groupMemberFansViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88722a.mo71926d(new ArrayList(), false);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$m */
    static final class C34361m extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88723a;

        /* renamed from: b */
        final /* synthetic */ Exception f88724b;

        C34361m(GroupMemberFansViewModel groupMemberFansViewModel, Exception exc) {
            this.f88723a = groupMemberFansViewModel;
            this.f88724b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88723a.mo71921a_(this.f88724b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$n */
    static final class C34362n extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f88725a;

        /* renamed from: b */
        final /* synthetic */ Exception f88726b;

        C34362n(GroupMemberFansViewModel groupMemberFansViewModel, Exception exc) {
            this.f88725a = groupMemberFansViewModel;
            this.f88726b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f88725a.mo71923b_(this.f88726b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: t */
    private final Runnable m78248t() {
        return (Runnable) this.f88697i.getValue();
    }

    /* renamed from: u */
    private final Handler m78249u() {
        return (Handler) this.f88698t.getValue();
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        mo71930j();
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<User> list, boolean z) {
    }

    /* renamed from: e */
    public final void mo47031e() {
        mo71931k();
    }

    public final void aJ_() {
        m78247b((C52670a<C52860x>) new C34360l<C52860x>(this));
    }

    /* renamed from: a */
    public final void mo72357a() {
        boolean z;
        List list;
        Collection collection = (Collection) this.f90194k.getValue();
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str = this.f88692b;
            if (str != null) {
                C34238a.m78110a().mo72224a(str, (C52671b<? super List<C33367a>, C52860x>) new C34349b<Object,C52860x>(this));
            }
            C26876b l = mo72364l();
            if (l != null) {
                l.mo44934a_(Integer.valueOf(1));
            }
        } else {
            this.f90194k.postValue(this.f90194k.getValue());
            List list2 = (List) this.f90194k.getValue();
            if (list2 != null) {
                list = C52575l.m112139e((Collection<? extends T>) list2);
            } else {
                list = null;
            }
            mo71926d(list, this.f88694d);
        }
    }

    /* renamed from: l */
    public final C26876b<C26875a<User, C31995c>> mo72364l() {
        String str;
        String str2;
        boolean z;
        if (this.f88696h != null) {
            return this.f88696h;
        }
        User c = C35265e.m79732c();
        if (c != null) {
            CharSequence uid = c.getUid();
            boolean z2 = false;
            if (uid == null || uid.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                CharSequence secUid = c.getSecUid();
                if (secUid == null || secUid.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    C34004b a = C34004b.m77717a();
                    C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                    C26875a followerFetchModel = a.mo71949f().getFollowerFetchModel(c.getUid(), c.getSecUid());
                    if (followerFetchModel == null) {
                        C32458a.m75144a("GroupFansViewModel validateFollowPresenter model null");
                        return null;
                    }
                    this.f88696h = new C26876b<>();
                    C26876b<C26875a<User, C31995c>> bVar = this.f88696h;
                    if (bVar == null) {
                        C52711k.m112234a();
                    }
                    bVar.mo54799a(followerFetchModel);
                    C26876b<C26875a<User, C31995c>> bVar2 = this.f88696h;
                    if (bVar2 == null) {
                        C52711k.m112234a();
                    }
                    bVar2.mo54800a(this);
                    return this.f88696h;
                }
            }
        }
        StringBuilder sb = new StringBuilder("GroupFansViewModel validateFollowPresenter uid or secUid null: ");
        if (c != null) {
            str = c.getUid();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", ");
        if (c != null) {
            str2 = c.getSecUid();
        } else {
            str2 = null;
        }
        sb.append(str2);
        C32458a.m75144a(sb.toString());
        return null;
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        m78247b((C52670a<C52860x>) new C34361m<C52860x>(this, exc));
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        m78247b((C52670a<C52860x>) new C34362n<C52860x>(this, exc));
    }

    /* renamed from: b */
    private final void m78247b(C52670a<C52860x> aVar) {
        Integer num = (Integer) this.f90198o.getValue();
        if (num != null && num.intValue() == 0) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo72362a(C52670a<C52860x> aVar) {
        Integer num = (Integer) this.f90198o.getValue();
        if (num != null && 1 == num.intValue()) {
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public final void mo72358a(String str) {
        boolean z;
        GroupMemberFansViewModel groupMemberFansViewModel;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            groupMemberFansViewModel = this;
        } else {
            groupMemberFansViewModel = null;
        }
        if (groupMemberFansViewModel == null) {
            this.f90200q.setValue(str);
            C34370b bVar = this.f88695f;
            if (str == null) {
                C52711k.m112234a();
            }
            C52711k.m112240b(str, "<set-?>");
            bVar.f88735a = str;
            this.f88695f.f88736b = 0;
            mo71930j();
            m78249u().removeCallbacks(m78248t());
            m78249u().postDelayed(m78248t(), 150);
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<User> list, boolean z) {
        m78247b((C52670a<C52860x>) new C34351d<C52860x>(this, z, list));
    }

    /* renamed from: a */
    public final void mo72363a(String str, int i) {
        C1680ad.m5960a((C2206z<? extends T>) C35286u.m79862a(str, i)).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C34356i<Object>(this, str, i));
    }

    /* renamed from: b */
    public final void mo47026b(List<User> list, boolean z) {
        m78247b((C52670a<C52860x>) new C34350c<C52860x>(this, z, list));
    }
}
