package com.p683ss.android.ugc.aweme.discover.p1635a;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p879t.p882c.C13241a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.discover.abtest.GeneralRelatedSearchCardStyle;
import com.p683ss.android.ugc.aweme.discover.alading.C28047l;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28327i;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1655b.C28306a.C28307a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.Commodity;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.p1765d.C31871a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.discover.a.i */
public final class C27735i {

    /* renamed from: a */
    public static final C27735i f72792a = new C27735i();

    /* renamed from: b */
    private static final IAwemeService f72793b = C23324d.m57378a();

    /* renamed from: c */
    private static final IRequestIdService f72794c = C23325e.m57379a();

    /* renamed from: com.ss.android.ugc.aweme.discover.a.i$a */
    static final class C27736a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27735i f72795a;

        /* renamed from: b */
        final /* synthetic */ C52727e f72796b;

        /* renamed from: c */
        final /* synthetic */ C52727e f72797c;

        C27736a(C27735i iVar, C52727e eVar, C52727e eVar2) {
            this.f72795a = iVar;
            this.f72796b = eVar;
            this.f72797c = eVar2;
        }

        public final void run() {
            for (Aweme updateAweme : (List) this.f72796b.element) {
                C27735i.m66399a().updateAweme(updateAweme);
            }
            for (Aweme updateAweme2 : (List) this.f72797c.element) {
                C27735i.m66399a().updateAweme(updateAweme2);
            }
        }
    }

    private C27735i() {
    }

    /* renamed from: a */
    public static IAwemeService m66399a() {
        return f72793b;
    }

    /* renamed from: b */
    public static List<C28333l> m66404b(List<? extends C28333l> list) {
        C52711k.m112240b(list, "searchMixFeedList");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C28333l lVar = (C28333l) list.get(i);
            int feedType = lVar.getFeedType();
            if (feedType != 65280) {
                if (feedType == 65458) {
                    List<SearchUser> list2 = lVar.f74349b;
                    if (list2 != null) {
                        for (SearchUser searchUser : list2) {
                            searchUser.rank = i;
                        }
                    }
                }
            } else if (lVar.getAweme() != null) {
                Aweme aweme = lVar.getAweme();
                if (aweme == null) {
                    C52711k.m112234a();
                }
                aweme.setAwemePosition(i);
            }
        }
        return list;
    }

    /* renamed from: a */
    public static List<C28333l> m66402a(List<? extends C28333l> list) {
        int i;
        C52711k.m112240b(list, "searchMixFeedList");
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z = true;
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C28333l) next).getFeedType() == 65465) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<C28333l> e = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
        int a = C10181b.m20511a().mo18168a(GeneralRelatedSearchCardStyle.class, true, "general_related_search_style", 31744, 0);
        List<Number> arrayList2 = new ArrayList<>();
        boolean z2 = false;
        int i2 = 0;
        for (C28333l lVar : e) {
            if (!z2 && lVar.mo56735a()) {
                C13241a.m26627a(arrayList2, Integer.valueOf(i2));
            }
            if (lVar.mo56735a() || (a == 1 && lVar.getFeedType() == 65459)) {
                z2 = true;
            } else {
                z2 = false;
            }
            i2++;
        }
        for (Number intValue : arrayList2) {
            int intValue2 = intValue.intValue();
            C28333l lVar2 = new C28333l();
            lVar2.setFeedType(65465);
            lVar2.f74348a = C11010c.m22280a().getString(R.string.fau);
            e.add(intValue2 + i, lVar2);
            i++;
        }
        return e;
    }

    /* renamed from: a */
    public final void mo56165a(C28334m mVar) {
        int i;
        C52711k.m112240b(mVar, "data");
        C27735i iVar = this;
        List<C28333l> list = mVar.f74376d;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C52727e eVar = new C52727e();
        eVar.element = (List) new ArrayList();
        C52727e eVar2 = new C52727e();
        eVar2.element = (List) new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C28333l lVar = (C28333l) mVar.f74376d.get(i2);
            if (lVar == null) {
                C52711k.m112234a();
            }
            lVar.f74342H = mVar.logPb;
            C28307a.m67239a().mo56708a(lVar);
            if (lVar.getFeedType() == 65280) {
                ((List) eVar2.element).addAll(m66400a(lVar, mVar, i2));
            }
            if (lVar.getFeedType() == 65458) {
                for (SearchUser searchUser : lVar.f74349b) {
                    C52711k.m112236a((Object) searchUser, "user");
                    if (searchUser.user != null) {
                        User user = searchUser.user;
                        C52711k.m112236a((Object) user, "user.user");
                        user.setRequestId(mVar.getRequestId());
                        List a = m66401a(searchUser, mVar.getRequestId());
                        if (a != null) {
                            ((List) eVar.element).addAll(a);
                        }
                    }
                }
            }
            if (lVar.getFeedType() == 65456) {
                for (SearchChallenge searchChallenge : lVar.f74354g) {
                    if (searchChallenge != null) {
                        searchChallenge.setRequestId(mVar.getRequestId());
                        if (searchChallenge.getChallenge() != null) {
                            Challenge challenge = searchChallenge.getChallenge();
                            C52711k.m112236a((Object) challenge, "challenge.challenge");
                            challenge.setRequestId(mVar.getRequestId());
                        }
                    }
                }
            }
            if (lVar.getFeedType() == 65457) {
                for (Music music : lVar.f74353f) {
                    if (music != null) {
                        music.setRequestId(mVar.getRequestId());
                    }
                }
            }
            if (lVar.getFeedType() == 65463) {
                for (SearchCommodity searchCommodity : lVar.f74360m) {
                    if (searchCommodity != null) {
                        Commodity commodity = searchCommodity.getCommodity();
                        if (commodity != null) {
                            commodity.setLogPb(mVar.logPb);
                        }
                    }
                }
            }
            if (lVar.getFeedType() == 65470) {
                m66403a(lVar.f74372y, mVar.getRequestId(), i2);
            }
        }
        C24076h.m58906g().submit(new C27736a(iVar, eVar, eVar2));
    }

    /* renamed from: a */
    private static List<Aweme> m66401a(SearchUser searchUser, String str) {
        if (searchUser == null || C9376b.m18558a((Collection<T>) searchUser.awemeCards)) {
            return null;
        }
        List<Aweme> arrayList = new ArrayList<>();
        List<Aweme> list = searchUser.awemeCards;
        C52711k.m112236a((Object) list, "searchUser.awemeCards");
        int i = 0;
        int i2 = 0;
        for (Aweme aweme : list) {
            if (aweme != null) {
                aweme.setRequestId(str);
                IRequestIdService iRequestIdService = f72794c;
                StringBuilder sb = new StringBuilder();
                sb.append(aweme.getAid());
                sb.append(9);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), str, i2);
                arrayList.add(aweme);
            }
            i2++;
        }
        C28047l lVar = searchUser.hotSpot;
        if (lVar != null) {
            List<? extends Aweme> list2 = lVar.f73677a;
            if (list2 != null) {
                for (Object next : list2) {
                    int i3 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    Aweme aweme2 = (Aweme) next;
                    aweme2.setRequestId(str);
                    IRequestIdService iRequestIdService2 = f72794c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(aweme2.getAid());
                    sb2.append(9);
                    iRequestIdService2.setRequestIdAndIndex(sb2.toString(), str, i);
                    i = i3;
                }
            }
        }
        searchUser.awemeCards = arrayList;
        return arrayList;
    }

    /* renamed from: a */
    private static void m66403a(C28327i iVar, String str, int i) {
        if (iVar != null && !C9376b.m18558a((Collection<T>) iVar.mixItems)) {
            ArrayList arrayList = new ArrayList();
            for (Aweme updateAweme : iVar.mixItems) {
                arrayList.add(C23324d.m57378a().updateAweme(updateAweme));
            }
            iVar.mixItems = arrayList;
            for (Aweme aweme : iVar.mixItems) {
                if (aweme != null) {
                    aweme.setRequestId(str);
                    IRequestIdService iRequestIdService = f72794c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(aweme.getAid());
                    sb.append(9);
                    iRequestIdService.setRequestIdAndIndex(sb.toString(), str, i);
                }
            }
        }
    }

    /* renamed from: a */
    private static List<Aweme> m66400a(C28333l lVar, C28334m mVar, int i) {
        Aweme aweme = lVar.getAweme();
        List<Aweme> arrayList = new ArrayList<>();
        if (C31871a.m74288a(aweme)) {
            C52711k.m112236a((Object) aweme, "aweme");
            arrayList.add(aweme);
            IRequestIdService iRequestIdService = f72794c;
            StringBuilder sb = new StringBuilder();
            sb.append(aweme.getAid());
            sb.append(9);
            iRequestIdService.setRequestIdAndIndex(sb.toString(), mVar.getRequestId(), i);
            lVar.setAweme(aweme);
            mVar.f74376d.set(i, lVar);
            aweme.setRequestId(mVar.getRequestId());
            if (aweme.getAwemeType() == 13) {
                Aweme forwardItem = aweme.getForwardItem();
                if (forwardItem != null) {
                    forwardItem.setRepostFromGroupId(aweme.getAid());
                    forwardItem.setRepostFromUserId(aweme.getAuthorUid());
                    arrayList.add(forwardItem);
                    IRequestIdService iRequestIdService2 = f72794c;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(forwardItem.getAid());
                    sb2.append(1);
                    iRequestIdService2.setRequestIdAndIndex(sb2.toString(), mVar.getRequestId(), i);
                    forwardItem.setRequestId(mVar.getRequestId());
                }
            }
        }
        return arrayList;
    }
}
