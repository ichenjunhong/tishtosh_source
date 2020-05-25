package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22401a;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1318d.C22403c;
import com.p683ss.android.ugc.aweme.utils.GsonHolder;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.br */
public final class C26434br {

    /* renamed from: a */
    public static final C26434br f69695a = new C26434br();

    private C26434br() {
    }

    /* renamed from: a */
    public static C26110ae m63918a(AwemeRawAd awemeRawAd) {
        C26110ae aeVar = new C26110ae();
        if (awemeRawAd != null) {
            aeVar.logExtra = awemeRawAd.getLogExtra();
            Long creativeId = awemeRawAd.getCreativeId();
            C52711k.m112236a((Object) creativeId, "rawAd.creativeId");
            aeVar.f68945id = creativeId.longValue();
            Long adId = awemeRawAd.getAdId();
            C52711k.m112236a((Object) adId, "rawAd.adId");
            aeVar.adId = adId.longValue();
        }
        return aeVar;
    }

    /* renamed from: a */
    public static final void m63919a(C28333l lVar, List<String> list) {
        boolean z;
        if (lVar != null) {
            boolean z2 = false;
            if (lVar.getFeedType() == 65280) {
                Aweme aweme = lVar.getAweme();
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        String eAdInfo = awemeRawAd.getEAdInfo();
                        if (eAdInfo != null) {
                            if (eAdInfo.length() > 0) {
                                z2 = true;
                            }
                            if (!z2) {
                                eAdInfo = null;
                            }
                            if (eAdInfo != null) {
                                list.add(eAdInfo);
                            }
                        }
                    }
                }
            } else if (lVar.getFeedType() == 65469) {
                C22403c cVar = lVar.f74336B;
                if (cVar != null) {
                    List<String> list2 = cVar.f60341b;
                    if (list2 == null || list2.size() <= 1) {
                        C22401a aVar = cVar.f60340a;
                        if (aVar != null) {
                            AwemeRawAd awemeRawAd2 = aVar.f60338a;
                            if (awemeRawAd2 != null) {
                                String eAdInfo2 = awemeRawAd2.getEAdInfo();
                                if (eAdInfo2 != null) {
                                    if (eAdInfo2.length() > 0) {
                                        z2 = true;
                                    }
                                    if (!z2) {
                                        eAdInfo2 = null;
                                    }
                                    if (eAdInfo2 != null) {
                                        list.add(eAdInfo2);
                                    }
                                }
                            }
                        }
                    } else {
                        GsonProvider createGsonProviderbyMonsterPlugin = GsonHolder.createGsonProviderbyMonsterPlugin();
                        C52711k.m112236a((Object) createGsonProviderbyMonsterPlugin, "ServiceManager.get().get…GsonProvider::class.java)");
                        C17971f gson = createGsonProviderbyMonsterPlugin.getGson();
                        for (String str : list2) {
                            if (gson != null) {
                                AwemeRawAd awemeRawAd3 = (AwemeRawAd) gson.mo34884a(str, AwemeRawAd.class);
                                if (awemeRawAd3 != null) {
                                    String eAdInfo3 = awemeRawAd3.getEAdInfo();
                                    if (eAdInfo3 != null) {
                                        if (eAdInfo3.length() > 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z) {
                                            eAdInfo3 = null;
                                        }
                                        if (eAdInfo3 != null) {
                                            list.add(eAdInfo3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
