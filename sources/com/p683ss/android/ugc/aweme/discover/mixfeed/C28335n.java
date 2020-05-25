package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.commercialize.model.C26112af;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26434br;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27379l;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28338q.C28339a;
import com.p683ss.android.ugc.aweme.discover.model.SearchMovie;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27735i;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28127h;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28136n;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2124d.C41412a;
import com.p683ss.android.ugc.aweme.search.p2124d.C41413b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.n */
public final class C28335n extends C28127h<C28333l, C28334m> implements C27379l {

    /* renamed from: b */
    public String f74380b;

    /* renamed from: c */
    public C26112af f74381c;

    /* renamed from: d */
    public C41440e f74382d;

    /* renamed from: e */
    public boolean f74383e;

    /* renamed from: l */
    private double f74384l;

    /* renamed from: m */
    private double f74385m;

    /* renamed from: n */
    private int f74386n;

    /* renamed from: o */
    private String f74387o;

    public final int aK_() {
        return 3;
    }

    /* renamed from: a */
    public final List<Aweme> mo55861a() {
        return m67260a(getItems());
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C28334m) this.mData).f74375c) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        if (C9376b.m18558a((Collection<T>) getItems())) {
            i = 0;
        } else {
            i = ((C28334m) this.mData).f74374b;
        }
        if (objArr.length == 1) {
            m67263a(this.f74380b, i, 10, this.f73864k);
            return;
        }
        m67262a(this.f74380b, i, 10, 0, objArr[3].doubleValue(), objArr[4].doubleValue(), this.f73864k, objArr[5].intValue(), (C41412a) objArr[6]);
    }

    public final void refreshList(Object... objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length == 2) {
            m67263a((String) objArr2[1], 0, 10, "");
            return;
        }
        m67262a((String) objArr2[1], 0, C28343s.m67288c(), ((Integer) objArr2[2]).intValue(), ((Double) objArr2[3]).doubleValue(), ((Double) objArr2[4]).doubleValue(), "", ((Integer) objArr2[5]).intValue(), (C41412a) objArr2[6]);
    }

    /* renamed from: a */
    public static List<Aweme> m67260a(List<C28333l> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C28333l lVar : list) {
            if (lVar.getFeedType() == 65280) {
                arrayList.add(lVar.getAweme());
            } else if (lVar.getFeedType() == 100) {
                if (lVar.getAweme() != null) {
                    arrayList.add(lVar.getAweme());
                }
            } else if (lVar.getFeedType() == 65466) {
                if (!(lVar.f74361n == null || lVar.f74361n.getAweme() == null)) {
                    arrayList.add(lVar.f74361n.getAweme());
                }
            } else if (lVar.getFeedType() == 65470 && lVar.f74372y != null && !C9376b.m18558a((Collection<T>) lVar.f74372y.mixItems)) {
                arrayList.add(lVar.f74372y.mixItems.get(0));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C28334m mVar) {
        boolean z;
        super.handleData(mVar);
        if (mVar != null) {
            this.f74381c = mVar.adInfo;
        }
        try {
            ListIterator listIterator = mVar.f74376d.listIterator();
            int i = 0;
            while (listIterator.hasNext()) {
                C28333l lVar = (C28333l) listIterator.next();
                switch (lVar.getFeedType()) {
                    case 30:
                    case 31:
                    case 65510:
                    case 65511:
                    case 65512:
                        listIterator.remove();
                        C28328j jVar = lVar.f74362o;
                        if (jVar != null) {
                            if (jVar.mo56732a() != null) {
                                jVar.f74324n = lVar.getFeedType();
                                jVar.f74325o = i;
                                for (C28323f fVar : jVar.mo56732a()) {
                                    C28333l lVar2 = new C28333l();
                                    switch (fVar.f74298a) {
                                        case 1:
                                            lVar2.setFeedType(11);
                                            SearchMovie searchMovie = fVar.f74302e;
                                            if (searchMovie != null) {
                                                searchMovie.setFeedType(fVar.f74299b);
                                            }
                                            SearchMovie searchMovie2 = fVar.f74302e;
                                            if (searchMovie2 != null) {
                                                searchMovie2.setDocId(fVar.f74300c);
                                            }
                                            SearchMovie searchMovie3 = fVar.f74302e;
                                            if (searchMovie3 != null) {
                                                searchMovie3.setRank(fVar.f74301d);
                                            }
                                            SearchMovie searchMovie4 = fVar.f74302e;
                                            searchMovie4.getMovie().setNewStyleCard(true);
                                            lVar2.f74361n = searchMovie4;
                                            lVar2.f74362o = jVar;
                                            listIterator.add(lVar2);
                                            break;
                                        case 2:
                                            lVar2.setFeedType(102);
                                            C28344t tVar = fVar.f74304g;
                                            if (tVar != null) {
                                                tVar.f74431c = fVar.f74299b;
                                            }
                                            C28344t tVar2 = fVar.f74304g;
                                            if (tVar2 != null) {
                                                String str = fVar.f74300c;
                                                C52711k.m112240b(str, "<set-?>");
                                                tVar2.f74432d = str;
                                            }
                                            C28344t tVar3 = fVar.f74304g;
                                            if (tVar3 != null) {
                                                tVar3.f74433e = fVar.f74301d;
                                            }
                                            lVar2.f74351d = fVar.f74304g;
                                            lVar2.f74362o = jVar;
                                            listIterator.add(lVar2);
                                            break;
                                        case 3:
                                            C28371y yVar = fVar.f74303f;
                                            if (yVar != null) {
                                                yVar.f74478e = fVar.f74299b;
                                            }
                                            C28371y yVar2 = fVar.f74303f;
                                            if (yVar2 != null) {
                                                String str2 = fVar.f74300c;
                                                C52711k.m112240b(str2, "<set-?>");
                                                yVar2.f74479f = str2;
                                            }
                                            C28371y yVar3 = fVar.f74303f;
                                            if (yVar3 != null) {
                                                yVar3.f74480g = fVar.f74301d;
                                            }
                                            C28371y yVar4 = fVar.f74303f;
                                            if (yVar4 != null) {
                                                lVar2.setFeedType(998);
                                                jVar.f74326p = yVar4;
                                                lVar2.f74362o = jVar;
                                            }
                                            listIterator.add(lVar2);
                                            break;
                                        case 4:
                                            lVar2.setFeedType(106);
                                            jVar.f74327q = fVar;
                                            lVar2.f74362o = jVar;
                                            listIterator.add(lVar2);
                                            break;
                                    }
                                }
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                        break;
                    case 40:
                        if (!(lVar.f74341G == null || lVar.f74341G.f105063a == null || lVar.f74341G.f105063a.size() != 1)) {
                            listIterator.remove();
                            C28333l lVar3 = new C28333l();
                            lVar3.setFeedType(100);
                            lVar3.setAweme((Aweme) lVar.f74341G.f105063a.get(0));
                            listIterator.add(lVar3);
                            break;
                        }
                    case 65458:
                        String requestId = mVar.getRequestId();
                        C52711k.m112240b(listIterator, "iterator");
                        C52711k.m112240b(lVar, "mixFeed");
                        C52711k.m112240b(requestId, "requestId");
                        if (lVar.f74335A == null) {
                            break;
                        } else {
                            switch (lVar.f74335A.adType) {
                                case 3:
                                    C26434br brVar = C26434br.f69695a;
                                    if (!C9376b.m18558a((Collection<T>) lVar.f74349b) && lVar.f74349b.get(0) != null) {
                                        Object obj = lVar.f74349b.get(0);
                                        C52711k.m112236a(obj, "mixFeed.users[0]");
                                        if (((SearchUser) obj).adItem != null) {
                                            SearchUser searchUser = (SearchUser) lVar.f74349b.get(0);
                                            C52711k.m112236a((Object) searchUser, "user");
                                            Aweme aweme = searchUser.adItem;
                                            C52711k.m112236a((Object) aweme, "user.adItem");
                                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                            C26110ae aeVar = lVar.f74335A;
                                            if (awemeRawAd != null) {
                                                aeVar.logExtra = awemeRawAd.getLogExtra();
                                                Long creativeId = awemeRawAd.getCreativeId();
                                                C52711k.m112236a((Object) creativeId, "rawAd.creativeId");
                                                aeVar.f68945id = creativeId.longValue();
                                                Long adId = awemeRawAd.getAdId();
                                                C52711k.m112236a((Object) adId, "rawAd.adId");
                                                aeVar.adId = adId.longValue();
                                            }
                                            C28333l lVar4 = new C28333l();
                                            lVar4.setFeedType(1048081);
                                            lVar4.setAweme(searchUser.adItem);
                                            Aweme aweme2 = lVar4.getAweme();
                                            C52711k.m112236a((Object) aweme2, "newFeed.aweme");
                                            aweme2.setRequestId(requestId);
                                            lVar4.f74335A = C26434br.m63918a(awemeRawAd);
                                            lVar4.f74335A.adType = aeVar.adType;
                                            lVar4.f74335A.challengeList = searchUser.challengeList;
                                            listIterator.set(lVar4);
                                            listIterator.add(lVar);
                                            searchUser.adItem = null;
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                case 4:
                                    C26434br brVar2 = C26434br.f69695a;
                                    if (!C9376b.m18558a((Collection<T>) lVar.f74349b) && lVar.f74349b.get(0) != null) {
                                        Object obj2 = lVar.f74349b.get(0);
                                        C52711k.m112236a(obj2, "mixFeed.users[0]");
                                        if (((SearchUser) obj2).adItem != null) {
                                            SearchUser searchUser2 = (SearchUser) lVar.f74349b.get(0);
                                            C52711k.m112236a((Object) searchUser2, "user");
                                            Aweme aweme3 = searchUser2.adItem;
                                            C52711k.m112236a((Object) aweme3, "user.adItem");
                                            AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                                            C26110ae aeVar2 = lVar.f74335A;
                                            if (awemeRawAd2 != null) {
                                                aeVar2.logExtra = awemeRawAd2.getLogExtra();
                                                Long creativeId2 = awemeRawAd2.getCreativeId();
                                                C52711k.m112236a((Object) creativeId2, "rawAd.creativeId");
                                                aeVar2.f68945id = creativeId2.longValue();
                                                Long adId2 = awemeRawAd2.getAdId();
                                                C52711k.m112236a((Object) adId2, "rawAd.adId");
                                                aeVar2.adId = adId2.longValue();
                                            }
                                            C28333l lVar5 = new C28333l();
                                            lVar5.setFeedType(1048081);
                                            lVar5.setAweme(searchUser2.adItem);
                                            Aweme aweme4 = lVar5.getAweme();
                                            C52711k.m112236a((Object) aweme4, "videoFeed.aweme");
                                            aweme4.setRequestId(requestId);
                                            lVar5.f74335A = C26434br.m63918a(awemeRawAd2);
                                            lVar5.f74335A.adType = aeVar2.adType;
                                            listIterator.add(lVar5);
                                            searchUser2.adItem = null;
                                            if (searchUser2.cardType() == 0) {
                                                break;
                                            } else {
                                                C28333l lVar6 = new C28333l();
                                                lVar6.setFeedType(1048082);
                                                lVar6.f74335A = C26434br.m63918a(awemeRawAd2);
                                                lVar6.f74335A.adType = aeVar2.adType;
                                                lVar6.f74349b = C52575l.m112092a(searchUser2);
                                                listIterator.add(lVar6);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                            }
                        }
                        break;
                }
                i++;
            }
        } catch (Exception unused) {
        }
        if (mVar != null) {
            this.f73863j = mVar.getRequestId();
        }
        if (mVar == null || C9376b.m18558a((Collection<T>) mVar.f74376d)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 1) {
                this.f74387o = C29981aa.m70153a().mo60160a(mVar.logPb);
            }
            C27735i.f72792a.mo56165a(mVar);
            ArrayList arrayList = new ArrayList();
            for (C28333l lVar7 : mVar.f74376d) {
                if (lVar7.getFeedType() == 65460) {
                    lVar7.mo56734a(this.f74387o);
                }
                C26434br.m63919a(lVar7, arrayList);
            }
            C9376b.m18558a((Collection<T>) arrayList);
            if (this.mListQueryType != 1) {
                Iterator it = mVar.f74376d.iterator();
                while (it.hasNext()) {
                    C28333l lVar8 = (C28333l) it.next();
                    if (!isDataEmpty() && ((C28334m) this.mData).f74376d.indexOf(lVar8) >= 0) {
                        it.remove();
                    }
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = mVar;
                mo56532a_(mVar.f74376d);
            } else if (i2 == 4) {
                mo56535b(mVar.f74376d);
                ((C28334m) this.mData).f74375c &= mVar.f74375c;
            }
            if (((C28334m) this.mData).f74374b != 0) {
                ((C28334m) this.mData).f74374b = mVar.f74374b;
            }
            C29981aa.m70153a().mo60162a(mVar.getRequestId(), ((C28334m) this.mData).logPb);
            C27735i.m66404b(((C28334m) this.mData).f74376d);
        } else {
            if (this.mListQueryType == 1) {
                this.mData = mVar;
                mo56536c();
                if (this.mData != null) {
                    ((C28334m) this.mData).f74375c = false;
                }
            }
            if (!(this.mData == null || this.mListQueryType == 2)) {
                ((C28334m) this.mData).f74375c = false;
            }
        }
        this.f73861h = null;
    }

    /* renamed from: a */
    private void m67263a(String str, int i, int i2, String str2) {
        m67262a(str, i, 10, 0, this.f74384l, this.f74385m, str2, this.f74386n, this.f73859f);
    }

    /* renamed from: a */
    private void m67262a(String str, int i, int i2, int i3, double d, double d2, String str2, int i4, C41412a aVar) {
        C0013i iVar = null;
        if (this.mData != null) {
            C0013i<C28334m> iVar2 = ((C28334m) this.mData).f74379g;
            ((C28334m) this.mData).f74379g = null;
            if (iVar2 != null) {
                iVar2.mo19a((C0011g<TResult, TContinuationResult>) new C28324g<TResult,TContinuationResult>(this.mHandler, 0));
                return;
            }
        }
        this.f74380b = str;
        this.f74384l = d;
        this.f74385m = d2;
        this.f74386n = i4;
        this.f73859f = C41413b.m91227b(aVar);
        C28339a a = new C28339a().mo56750a(str).mo56747a(i).mo56753b(i2).mo56756c(i3).mo56746a(d).mo56752b(d2).mo56754b(str2).mo56758d(i4).mo56748a(this.f73859f).mo56757c(mo56537d()).mo56759e(this.f73862i).mo56749a(this.f74382d);
        if (this.f74383e) {
            a.mo56751a();
        }
        C28338q b = a.mo56755b();
        if (i == 0 && C28136n.m66997a()) {
            C52847n a2 = C28136n.f73888f.mo56561a(b);
            if (a2 != null) {
                b = (C28338q) a2.getFirst();
            }
            if (a2 != null) {
                iVar = (C0013i) a2.getSecond();
            }
        }
        this.mIsLoading = true;
        if (iVar == null) {
            iVar = b.mo56742b();
        }
        this.f73861h = b;
        iVar.mo23b(C28336o.f74388a).mo23b(C28337p.f74389a).mo19a((C0011g<TResult, TContinuationResult>) new C28324g<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
