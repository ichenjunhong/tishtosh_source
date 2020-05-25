package com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel;

import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel */
public final class GroupMemberListViewModel extends BaseMemberListViewModel<Object> {

    /* renamed from: a */
    public String f88727a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$a */
    static final class C34363a extends C52712l implements C52671b<List<? extends C33367a>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberListViewModel f88728a;

        C34363a(GroupMemberListViewModel groupMemberListViewModel) {
            this.f88728a = groupMemberListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object obj2;
            List list = (List) obj;
            if (list != null) {
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
                Iterable iterable2 = (List) arrayList;
                Collection arrayList2 = new ArrayList();
                for (Object next : iterable2) {
                    if (!C52711k.m112239a((Object) ((IMUser) next).getUid(), (Object) C35265e.m79730b())) {
                        arrayList2.add(next);
                    }
                }
                List a = C52575l.m112122a((Iterable<? extends T>) (List) arrayList2, (Comparator<? super T>) new Comparator<T>() {
                    public final int compare(T t, T t2) {
                        return C52594a.m112153a(((IMUser) t).getSortWeight(), ((IMUser) t2).getSortWeight());
                    }
                });
                this.f88728a.f90194k.postValue(a);
                this.f88728a.f90196m.postValue(C34848e.m78926a(a));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$b */
    static final class C34365b extends C52712l implements C52671b<List<? extends C33367a>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberListViewModel f88729a;

        C34365b(GroupMemberListViewModel groupMemberListViewModel) {
            this.f88729a = groupMemberListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object obj2;
            List<C33367a> list = (List) obj;
            if (list != null) {
                List arrayList = new ArrayList();
                for (C33367a aVar : list) {
                    IMUser user = aVar.getUser();
                    if (user == null || !user.equals(IMUser.fromUser(C35265e.m79732c()))) {
                        IMUser user2 = aVar.getUser();
                        if (user2 == null) {
                            user2 = new IMUser();
                            C11206o member = aVar.getMember();
                            String str = null;
                            if (member != null) {
                                obj2 = Long.valueOf(member.getUid());
                            } else {
                                obj2 = null;
                            }
                            user2.setUid(String.valueOf(obj2));
                            C11206o member2 = aVar.getMember();
                            if (member2 != null) {
                                str = member2.getAlias();
                            }
                            user2.setNickName(str);
                        }
                        arrayList.add(user2);
                    }
                }
                if (arrayList.size() > 1) {
                    C52575l.m112105a(arrayList, new Comparator<T>() {
                        public final int compare(T t, T t2) {
                            return C52594a.m112153a(((IMUser) t).getSortWeight(), ((IMUser) t2).getSortWeight());
                        }
                    });
                }
                this.f88729a.f90194k.postValue(arrayList);
                this.f88729a.f90196m.postValue(C34848e.m78926a(arrayList));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$c */
    static final class C34367c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f88730a;

        /* renamed from: b */
        final /* synthetic */ GroupMemberListViewModel f88731b;

        /* renamed from: c */
        final /* synthetic */ String f88732c;

        C34367c(List list, GroupMemberListViewModel groupMemberListViewModel, String str) {
            this.f88730a = list;
            this.f88731b = groupMemberListViewModel;
            this.f88732c = str;
        }

        public final /* synthetic */ Object call() {
            return C34010e.m77748a().mo71958a(this.f88730a, this.f88732c, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel$d */
    static final class C34368d<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberListViewModel f88733a;

        /* renamed from: b */
        final /* synthetic */ String f88734b;

        C34368d(GroupMemberListViewModel groupMemberListViewModel, String str) {
            this.f88733a = groupMemberListViewModel;
            this.f88734b = str;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (!iVar.mo26b() || iVar.mo34e() == null) {
                this.f88733a.f90195l.postValue(C52575l.m112097a());
            } else {
                this.f88733a.f90195l.postValue(iVar.mo34e());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo72357a() {
        switch (this.f90193j) {
            case 5:
                String str = this.f88727a;
                if (str != null) {
                    C34238a.m78110a().mo72224a(str, (C52671b<? super List<C33367a>, C52860x>) new C34365b<Object,C52860x>(this));
                    break;
                } else {
                    return;
                }
            case 6:
                String str2 = this.f88727a;
                if (str2 != null) {
                    C34238a.m78110a().mo72224a(str2, (C52671b<? super List<C33367a>, C52860x>) new C34363a<Object,C52860x>(this));
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo72358a(String str) {
        List list;
        if (str != null) {
            this.f90200q.postValue(str);
            List list2 = (List) this.f90194k.getValue();
            if (list2 != null) {
                Iterable<IMContact> iterable = list2;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (IMContact iMContact : iterable) {
                    if (iMContact != null) {
                        arrayList.add((IMUser) iMContact);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    }
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            if (list != null) {
                C0013i.m16a((Callable<TResult>) new C34367c<TResult>(list, this, str)).mo19a((C0011g<TResult, TContinuationResult>) new C34368d<TResult,TContinuationResult>(this, str));
            }
            if (str != null) {
                return;
            }
        }
        GroupMemberListViewModel groupMemberListViewModel = this;
        groupMemberListViewModel.f90200q.postValue("");
        groupMemberListViewModel.f90195l.postValue(C52575l.m112097a());
    }
}
