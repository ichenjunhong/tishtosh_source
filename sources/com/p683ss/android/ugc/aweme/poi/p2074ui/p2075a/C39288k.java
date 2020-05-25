package com.p683ss.android.ugc.aweme.poi.p2074ui.p2075a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37860c;
import com.p683ss.android.ugc.aweme.poi.C39065f;
import com.p683ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.p683ss.android.ugc.aweme.poi.model.C39085a;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38960e;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38964i;
import com.p683ss.android.ugc.aweme.poi.utils.C39456o;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a.k */
public final class C39288k extends C26832a<C39291m> {

    /* renamed from: a */
    static final PoiFeedApi f100434a = ((PoiFeedApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiFeedApi.class));

    /* renamed from: b */
    private int f100435b;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.a.k$a */
    static class C39289a implements C0011g<Object, Void> {

        /* renamed from: a */
        Handler f100436a;

        /* renamed from: b */
        int f100437b = 0;

        /* renamed from: c */
        int f100438c;

        /* renamed from: d */
        long f100439d;

        /* renamed from: a */
        private static void m87360a(PoiDetail poiDetail) {
            if (poiDetail.getPoiActivityInfo() != null && poiDetail.getPoiActivityInfo().getAdCard() != null) {
                C39085a adCard = poiDetail.getPoiActivityInfo().getAdCard();
                if (!C9376b.m18558a((Collection<T>) adCard.getRawDatas())) {
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
                    poiDetail.parseAdRawData();
                    if (!C9376b.m18558a((Collection<T>) arrayList)) {
                        poiDetail.setAwemeRawAds(arrayList);
                    }
                }
            }
        }

        public final /* synthetic */ Object then(C0013i iVar) throws Exception {
            C38964i iVar2;
            if (this.f100436a == null) {
                return null;
            }
            Message obtainMessage = this.f100436a.obtainMessage(this.f100437b);
            if (!iVar.mo31c() && !iVar.mo33d()) {
                obtainMessage.obj = null;
                Object e = iVar.mo34e();
                if (e != null && (e instanceof PoiDetail)) {
                    PoiDetail poiDetail = (PoiDetail) e;
                    if (poiDetail == null || C9431p.m18664a(poiDetail.getPoiId())) {
                        obtainMessage.obj = null;
                        C39456o.m87754a();
                        this.f100436a.sendMessage(obtainMessage);
                        return null;
                    }
                    if (poiDetail != null) {
                        C37860c cVar = new C37860c();
                        ArrayList arrayList = new ArrayList();
                        new ArrayList();
                        poiDetail.setFeedType(this.f100438c);
                        arrayList.add(0, poiDetail);
                        if (poiDetail.hasValidProduct()) {
                            arrayList.add(new C38960e(poiDetail.productInfo, poiDetail.getPoiId()));
                        }
                        if (!C9376b.m18558a((Collection<T>) poiDetail.getRecommendPhoto())) {
                            iVar2 = new C38964i(poiDetail.getPoiType());
                            iVar2.f99240d = poiDetail.getRecommendTitle();
                            iVar2.f99238b = poiDetail.getRecommendPhoto();
                            iVar2.f99242f = poiDetail.getPoiId();
                        } else {
                            iVar2 = null;
                        }
                        if (poiDetail.isUseNewDetailStyle()) {
                            if (iVar2 != null) {
                                iVar2.f99241e = false;
                                arrayList.add(iVar2);
                            }
                        } else if (iVar2 != null) {
                            arrayList.add(iVar2);
                        }
                        if (this.f100439d > 0) {
                            poiDetail.setDuration(System.currentTimeMillis() - this.f100439d);
                        }
                        m87360a(poiDetail);
                        cVar.f96380a = arrayList;
                        obtainMessage.obj = new C39291m(cVar.f96380a);
                    } else {
                        obtainMessage.obj = null;
                        C39456o.m87754a();
                    }
                    this.f100436a.sendMessage(obtainMessage);
                    return null;
                }
            }
            obtainMessage.obj = null;
            C39456o.m87754a();
            this.f100436a.sendMessage(obtainMessage);
            return null;
        }

        C39289a(Handler handler, int i, int i2, long j) {
            this.f100436a = handler;
            this.f100438c = i2;
            this.f100439d = j;
        }
    }

    public C39288k(int i) {
        this.f100435b = i;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        int i;
        int i2;
        C39065f fVar = objArr[0];
        String str = fVar.f99618a;
        String str2 = fVar.f99621d;
        String str3 = fVar.f99622e;
        int i3 = fVar.f99623f;
        String str4 = fVar.f99620c;
        Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(str4);
        long currentTimeMillis = System.currentTimeMillis();
        PoiFeedApi poiFeedApi = f100434a;
        String str5 = "all";
        switch (this.f100435b) {
            case 65440:
                i = 1;
                break;
            case 65441:
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        if (rawAdAwemeById == null || !rawAdAwemeById.isAd()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        C0013i poiDetail = poiFeedApi.getPoiDetail(str, str2, str3, str5, i, i3, i2, str4, 0);
        C39289a aVar = new C39289a(this.mHandler, 0, this.f100435b, currentTimeMillis);
        poiDetail.mo20a((C0011g<TResult, TContinuationResult>) aVar, (Executor) C0013i.f24a);
        return true;
    }
}
