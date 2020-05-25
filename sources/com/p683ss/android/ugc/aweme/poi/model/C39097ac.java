package com.p683ss.android.ugc.aweme.poi.model;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37860c;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38957b;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38959d;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38960e;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38964i;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38968l;
import com.p683ss.android.ugc.aweme.poi.utils.C39456o;
import com.p683ss.android.ugc.aweme.poi.utils.C39456o.C39459a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ac */
public final class C39097ac implements C0011g<List<Object>, Void> {

    /* renamed from: a */
    Handler f99730a;

    /* renamed from: b */
    int f99731b = TextExtraStruct.TYPE_CUSTOM;

    /* renamed from: c */
    int f99732c;

    public final /* synthetic */ Object then(C0013i iVar) throws Exception {
        C38964i iVar2;
        if (this.f99730a == null) {
            return null;
        }
        Message obtainMessage = this.f99730a.obtainMessage(this.f99731b);
        if (!iVar.mo31c()) {
            if (iVar.mo33d()) {
                obtainMessage.obj = iVar.mo35f();
                C39456o.m87754a();
            } else {
                obtainMessage.obj = null;
                List list = (List) iVar.mo34e();
                if (list != null && list.size() == 4) {
                    PoiDetail poiDetail = null;
                    C39105ak akVar = null;
                    C39135s sVar = null;
                    C39126j jVar = null;
                    for (Object next : list) {
                        if (next instanceof PoiDetail) {
                            poiDetail = (PoiDetail) next;
                        } else if (next instanceof C39126j) {
                            jVar = (C39126j) next;
                        } else if (next instanceof C39105ak) {
                            akVar = (C39105ak) next;
                        } else if (next instanceof C39135s) {
                            sVar = (C39135s) next;
                        }
                    }
                    if (poiDetail == null || C9431p.m18664a(poiDetail.getPoiId())) {
                        obtainMessage.obj = null;
                        C39456o.m87754a();
                        this.f99730a.sendMessage(obtainMessage);
                        return null;
                    } else if (poiDetail != null) {
                        C37860c cVar = new C37860c();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        boolean isDestination = poiDetail.isDestination();
                        poiDetail.isCertificated();
                        poiDetail.setPoiActivityResponse(akVar);
                        poiDetail.setFeedType(this.f99732c);
                        boolean z = false;
                        arrayList.add(0, poiDetail);
                        if (poiDetail.hasValidProduct()) {
                            arrayList.add(new C38960e(poiDetail.productInfo, poiDetail.getPoiId()));
                        }
                        if (isDestination || C9376b.m18558a((Collection<T>) poiDetail.getRecommendPhoto())) {
                            iVar2 = null;
                        } else {
                            iVar2 = new C38964i(poiDetail.getPoiType());
                            iVar2.f99240d = poiDetail.getRecommendTitle();
                            iVar2.f99238b = poiDetail.getRecommendPhoto();
                            iVar2.f99242f = poiDetail.getPoiId();
                        }
                        boolean z2 = true;
                        if (!isDestination && poiDetail.isUseNewDetailStyle()) {
                            if (iVar2 != null) {
                                iVar2.f99241e = false;
                                arrayList.add(iVar2);
                            }
                            if (sVar != null && sVar.mo79765a() > 0) {
                                poiDetail.setActs(new C38957b(sVar.f99868a).setPoiId(poiDetail.getPoiId()));
                            }
                            List list2 = poiDetail.get3rdCommentList();
                            if (!C9376b.m18558a((Collection<T>) list2)) {
                                list2.size();
                                arrayList.add(new C38959d(false, true));
                                C39133q qVar = (C39133q) list2.get(0);
                                qVar.setCommentId("1");
                                qVar.setHasDivider(true);
                                arrayList.add(qVar);
                            }
                        } else if (iVar2 != null) {
                            arrayList.add(iVar2);
                        }
                        C39459a aVar = new C39459a();
                        aVar.f100882b = poiDetail.getDuration();
                        aVar.f100883c = poiDetail.getRequestId();
                        aVar.f100881a = "poi_detail";
                        arrayList2.add(aVar);
                        if (sVar != null && sVar.mo79765a() > 0) {
                            poiDetail.setActs(new C38957b(sVar.f99868a).setPoiId(poiDetail.getPoiId()));
                        }
                        if (jVar != null) {
                            ArrayList arrayList3 = new ArrayList();
                            cVar.f96383d = jVar.f99820b;
                            cVar.f96381b = (long) jVar.f99821c;
                            cVar.f96382c = (long) jVar.f99821c;
                            if (!C9376b.m18558a((Collection<T>) jVar.f99819a)) {
                                int i = 0;
                                for (Aweme aweme : jVar.f99819a) {
                                    if (C31753a.m73748h(aweme)) {
                                        FollowFeed followFeed = new FollowFeed(aweme);
                                        followFeed.setRequestId(jVar.getRequestId());
                                        arrayList3.add(followFeed);
                                        if (!z && i == 2) {
                                            C38968l a = m86938a(poiDetail, true);
                                            if (a != null) {
                                                arrayList3.add(a);
                                                z = true;
                                            }
                                        }
                                        i++;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else {
                                z2 = false;
                            }
                            C39459a aVar2 = new C39459a();
                            aVar2.f100882b = jVar.f99823e;
                            aVar2.f100883c = jVar.getRequestId();
                            aVar2.f100881a = "poi_aweme";
                            arrayList2.add(aVar2);
                        } else {
                            z2 = false;
                        }
                        if (!z) {
                            C38968l a2 = m86938a(poiDetail, z2);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        poiDetail.parseAdRawData();
                        C39456o.m87756a((List<C39459a>) arrayList2);
                        cVar.f96380a = arrayList;
                        obtainMessage.obj = cVar;
                    } else {
                        obtainMessage.obj = null;
                        C39456o.m87754a();
                    }
                }
            }
            this.f99730a.sendMessage(obtainMessage);
            return null;
        }
        obtainMessage.obj = null;
        C39456o.m87754a();
        this.f99730a.sendMessage(obtainMessage);
        return null;
    }

    /* renamed from: a */
    private static C38968l m86938a(PoiDetail poiDetail, boolean z) {
        if (poiDetail.getPoiActivityInfo() == null || poiDetail.getPoiActivityInfo().getAdCard() == null) {
            return null;
        }
        C39085a adCard = poiDetail.getPoiActivityInfo().getAdCard();
        if (C9376b.m18558a((Collection<T>) adCard.getRawDatas())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : adCard.getRawDatas()) {
            AwemeRawAd awemeRawAd = C39085a.getAwemeRawAd(str);
            if (awemeRawAd != null) {
                if (awemeRawAd.isNewStyleAd()) {
                    arrayList.add(awemeRawAd);
                } else {
                    adCard.setRawData(str);
                }
            }
        }
        if (C9376b.m18558a((Collection<T>) arrayList)) {
            return null;
        }
        C38968l lVar = new C38968l(arrayList, adCard.getTitle(), z);
        lVar.f99253a = arrayList;
        return lVar;
    }

    public C39097ac(Handler handler, int i, int i2) {
        this.f99730a = handler;
        this.f99732c = i2;
    }
}
