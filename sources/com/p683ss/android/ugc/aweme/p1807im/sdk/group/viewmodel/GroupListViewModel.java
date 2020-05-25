package com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel;

import android.arch.lifecycle.C0198r;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34008d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel */
public final class GroupListViewModel extends BaseMemberListViewModel<IMContact> {

    /* renamed from: i */
    public static final C34345a f88679i = new C34345a(null);

    /* renamed from: a */
    public int f88680a = 1;

    /* renamed from: b */
    public long f88681b;

    /* renamed from: c */
    public boolean f88682c;

    /* renamed from: d */
    public boolean f88683d;

    /* renamed from: f */
    public SharePackage f88684f;

    /* renamed from: g */
    public BaseContent f88685g;

    /* renamed from: h */
    public int f88686h = 10;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel$a */
    public static final class C34345a {
        private C34345a() {
        }

        public /* synthetic */ C34345a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel$b */
    static final class C34346b extends C52712l implements C52687r<List<C11180b>, Long, Boolean, C11202k, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupListViewModel f88687a;

        /* renamed from: b */
        final /* synthetic */ long f88688b;

        C34346b(GroupListViewModel groupListViewModel, long j) {
            this.f88687a = groupListViewModel;
            this.f88688b = j;
            super(4);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
            String str;
            String str2;
            Object obj5;
            String str3;
            Collection collection;
            List list;
            List list2;
            List list3;
            List list4 = (List) obj;
            long longValue = ((Number) obj2).longValue();
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            C11202k kVar = (C11202k) obj4;
            this.f88687a.f88682c = false;
            StringBuilder sb = new StringBuilder("loadDataFromNet: cursor ");
            sb.append(longValue);
            sb.append(", hasMore ");
            sb.append(booleanValue);
            sb.append(", result is ");
            List list5 = null;
            if (list4 != null) {
                str = list4.toString();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", error is ");
            if (kVar != null) {
                str2 = kVar.f30205c;
            } else {
                str2 = null;
            }
            sb.append(str2);
            sb.append(", errorCode is ");
            if (kVar != null) {
                obj5 = Integer.valueOf(kVar.f30203a);
            } else {
                obj5 = null;
            }
            sb.append(obj5);
            sb.append(", checkMsg is ");
            if (kVar != null) {
                str3 = kVar.f30207e;
            } else {
                str3 = null;
            }
            sb.append(str3);
            if (list4 != null) {
                Iterable<C11180b> iterable = list4;
                Collection arrayList = new ArrayList();
                for (C11180b a : iterable) {
                    IMContact a2 = C34008d.m77742a(a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                collection = (List) arrayList;
            } else {
                collection = null;
            }
            Collection collection2 = collection;
            if (!C9376b.m18558a(collection2)) {
                if (this.f88688b == 0) {
                    C0198r<List<IMContact>> rVar = this.f88687a.f90194k;
                    if (collection != null) {
                        list2 = C52575l.m112139e(collection2);
                    } else {
                        list2 = null;
                    }
                    rVar.setValue(GroupListViewModel.m78242a(list2));
                    GroupListViewModel groupListViewModel = this.f88687a;
                    List list6 = (List) this.f88687a.f90194k.getValue();
                    if (list6 != null) {
                        list3 = C52575l.m112139e((Collection<? extends T>) list6);
                    } else {
                        list3 = null;
                    }
                    groupListViewModel.mo71926d(list3, booleanValue);
                }
                if (this.f88688b > 0 && this.f88687a.f88683d) {
                    List list7 = (List) this.f88687a.f90194k.getValue();
                    if (list7 != null) {
                        list = C52575l.m112139e((Collection<? extends T>) list7);
                    } else {
                        list = new ArrayList();
                    }
                    if (collection == null) {
                        collection2 = new ArrayList();
                    }
                    list.addAll(collection2);
                    this.f88687a.f90194k.setValue(GroupListViewModel.m78242a(list));
                    GroupListViewModel groupListViewModel2 = this.f88687a;
                    List list8 = (List) this.f88687a.f90194k.getValue();
                    if (list8 != null) {
                        list5 = C52575l.m112139e((Collection<? extends T>) list8);
                    }
                    groupListViewModel2.mo71927e(list5, booleanValue);
                }
                this.f88687a.f88683d = booleanValue;
                this.f88687a.f88681b = longValue;
            } else if (kVar == null && this.f88688b == 0) {
                this.f88687a.mo71926d(new ArrayList(), false);
                this.f88687a.f88681b = 0;
                this.f88687a.f88683d = false;
            } else if (kVar == null && this.f88688b > 0) {
                this.f88687a.mo71927e(new ArrayList(), false);
                this.f88687a.f88681b = longValue;
                this.f88687a.f88683d = false;
            } else if (kVar != null && this.f88688b == 0) {
                this.f88687a.mo71921a_(null);
                StringBuilder sb2 = new StringBuilder("GroupListViewModel getGroupListFromNet failed: ");
                sb2.append(kVar.f30203a);
                sb2.append(", ");
                sb2.append(kVar.f30204b);
                sb2.append(", ");
                sb2.append(kVar.f30205c);
                sb2.append(", ");
                sb2.append(kVar.f30206d);
                sb2.append(", ");
                sb2.append(kVar.f30207e);
                C32458a.m75144a(sb2.toString());
            } else if (kVar != null && this.f88688b > 0) {
                this.f88687a.mo71923b_(null);
                StringBuilder sb3 = new StringBuilder("GroupListViewModel getGroupListFromNet failed: ");
                sb3.append(kVar.f30203a);
                sb3.append(", ");
                sb3.append(kVar.f30204b);
                sb3.append(", ");
                sb3.append(kVar.f30205c);
                sb3.append(", ");
                sb3.append(kVar.f30206d);
                sb3.append(", ");
                sb3.append(kVar.f30207e);
                C32458a.m75144a(sb3.toString());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel$c */
    static final class C34347c<T> implements Comparator<C11180b> {

        /* renamed from: a */
        public static final C34347c f88689a = new C34347c();

        C34347c() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str;
            C11180b bVar = (C11180b) obj;
            C11180b bVar2 = (C11180b) obj2;
            if (bVar.compareTo(bVar2) != 0) {
                return bVar.compareTo(bVar2);
            }
            C52711k.m112236a((Object) bVar, "o1");
            C11181c coreInfo = bVar.getCoreInfo();
            String str2 = null;
            if (coreInfo != null) {
                str = coreInfo.getName();
            } else {
                str = null;
            }
            String d = C34839a.m78910d(C34839a.m78908c(str));
            C52711k.m112236a((Object) bVar2, "o2");
            C11181c coreInfo2 = bVar2.getCoreInfo();
            if (coreInfo2 != null) {
                str2 = coreInfo2.getName();
            }
            String d2 = C34839a.m78910d(C34839a.m78908c(str2));
            C52711k.m112236a((Object) d2, "CharacterUtil.hashCode(C…inyin(o2.coreInfo?.name))");
            return d.compareTo(d2);
        }
    }

    /* renamed from: a */
    public final void mo72358a(String str) {
    }

    public final void onCleared() {
        super.onCleared();
        this.f88681b = 0;
        this.f88683d = false;
        this.f88682c = false;
    }

    /* renamed from: a */
    public final void mo72357a() {
        boolean z;
        List list;
        switch (this.f88680a) {
            case 0:
                C34238a.m78110a();
                C11182d a = C11182d.m22641a();
                C52711k.m112236a((Object) a, "ConversationListModel.inst()");
                List c = a.mo20672c();
                C52711k.m112236a((Object) c, "ConversationListModel.inst().groupConversationSync");
                Iterable iterable = c;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    C11180b bVar = (C11180b) next;
                    C52711k.m112236a((Object) bVar, "it");
                    if (bVar.isMember()) {
                        arrayList.add(next);
                    }
                }
                List a2 = C52575l.m112122a((Iterable<? extends T>) (List) arrayList, (Comparator<? super T>) C34347c.f88689a);
                C0198r<List<IMContact>> rVar = this.f90194k;
                Iterable<C11180b> iterable2 = a2;
                Collection arrayList2 = new ArrayList();
                for (C11180b a3 : iterable2) {
                    IMContact a4 = C34008d.m77742a(a3);
                    if (a4 != null) {
                        arrayList2.add(a4);
                    }
                }
                rVar.postValue((List) arrayList2);
                return;
            case 1:
                Collection collection = (Collection) this.f90194k.getValue();
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f90194k.postValue(this.f90194k.getValue());
                    List list2 = (List) this.f90194k.getValue();
                    if (list2 != null) {
                        list = C52575l.m112139e((Collection<? extends T>) list2);
                    } else {
                        list = null;
                    }
                    mo71926d(list, this.f88683d);
                    break;
                } else {
                    mo72360a(0);
                    return;
                }
        }
    }

    /* renamed from: a */
    public static List<IMContact> m78242a(List<IMContact> list) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return new ArrayList<>();
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        List<IMContact> arrayList = new ArrayList<>();
        for (IMContact iMContact : list) {
            if (!arrayList.contains(iMContact)) {
                arrayList.add(iMContact);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo72360a(long j) {
        if (!this.f88682c) {
            this.f88682c = true;
            if (j <= 0) {
                mo71930j();
            } else if (j > 0 && this.f88683d) {
                mo71931k();
            }
            C34238a.m78110a();
            C34237d.m78085a(j, (C52687r<? super List<C11180b>, ? super Long, ? super Boolean, ? super C11202k, C52860x>) new C34346b<Object,Object,Object,Object,C52860x>(this, j));
        }
    }
}
