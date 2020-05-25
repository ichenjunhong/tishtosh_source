package com.bytedance.p126ad.symphony.p129b.p130a;

import com.bytedance.common.utility.C9431p;
import com.bytedance.p126ad.symphony.C2715d;
import com.bytedance.p126ad.symphony.p127a.C2673a;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.bytedance.p126ad.symphony.p129b.C2699d;
import com.bytedance.p126ad.symphony.p131c.C2701a;
import com.bytedance.p126ad.symphony.p131c.C2713g;
import com.bytedance.p126ad.symphony.p134e.C2722a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2727e;
import com.bytedance.p126ad.symphony.p138h.C2739a;
import com.bytedance.p126ad.symphony.p139i.C2745d;
import com.bytedance.p126ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.p126ad.symphony.provider.C2749a;
import com.bytedance.p126ad.symphony.provider.C2752b;
import com.bytedance.p126ad.symphony.provider.C2754c;
import com.bytedance.p126ad.symphony.provider.InhouseAdProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.b.a.g */
public final class C2695g extends C2683a<C2676c> implements C2699d {

    /* renamed from: j */
    public boolean f8178j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7249a() {
        return "NativeAdManager";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo7255c() {
        this.f8153c.put(Integer.valueOf(AbsNativeAdProvider.INHOUSE_PROVIDER_ID * 1000), new InhouseAdProvider(this.f8156f, new C2727e(), this));
    }

    /* renamed from: b */
    public final void mo7269b(List<C2723a> list) {
        mo7252a(list, AbsNativeAdProvider.SUPPORT_NATIVE_AD_PROVIDERS, C2699d.class);
    }

    public C2695g(C2696h hVar) {
        super(hVar, "sp_native_fill_strategy", "{\"display_sort\":[9000,1000,2000],\"preload_sort\":[[9000],[1000],[2000]]}");
        this.f8178j = hVar.f8179e;
    }

    /* renamed from: f */
    private void m7746f(String str) {
        C2739a a = this.f8157g.mo7299a(str);
        if (a != null && a.mo7294b() != null) {
            for (Integer intValue : a.mo7294b()) {
                C2752b bVar = (C2752b) this.f8153c.get(Integer.valueOf(intValue.intValue()));
                if (bVar instanceof AbsNativeAdProvider) {
                    ((AbsNativeAdProvider) bVar).markBidLoss(str);
                }
            }
        }
    }

    /* renamed from: e */
    private List<Integer> m7745e(String str) {
        C2739a a = this.f8157g.mo7299a(str);
        if (a == null || a.mo7294b() == null) {
            return new ArrayList();
        }
        List<Integer> b = a.mo7294b();
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : b) {
            int intValue2 = intValue.intValue();
            if (AbsNativeAdProvider.isHeaderBiddingProvider(intValue2)) {
                arrayList.add(Integer.valueOf(intValue2));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private String m7744c(List<String> list) {
        Iterator it;
        mo7256c("get header bidding info：");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            C2701a aVar = new C2701a();
            if (!C2745d.m7836a(list)) {
                for (String str : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("placement_type", str);
                    C2752b bVar = (C2752b) this.f8153c.get(Integer.valueOf(mo7248a(this.f8157g.mo7299a(str), str, true)));
                    if (bVar != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("placement_id", bVar.getPlacementId(str));
                        jSONObject3.put("provider_id", bVar.getProviderId());
                        m7743a(bVar, jSONObject3, str);
                        jSONObject2.put("preloaded_ad_info", jSONObject3);
                        aVar.f8192b = 1;
                    }
                    List e = m7745e(str);
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = e.iterator();
                    while (it2.hasNext()) {
                        C2752b bVar2 = (C2752b) this.f8153c.get(Integer.valueOf(((Integer) it2.next()).intValue()));
                        if (!(bVar2 instanceof C2754c) || !bVar2.hasValidAd(str)) {
                            it = it2;
                        } else {
                            C2754c cVar = (C2754c) bVar2;
                            JSONObject jSONObject4 = new JSONObject();
                            it = it2;
                            jSONObject4.put("ad_price", cVar.getMaxPrice(str));
                            jSONObject4.put("provider_id", bVar2.getProviderId());
                            jSONObject4.put("placement_id", bVar2.getPlacementId(str));
                            jSONObject4.put("bid_id", cVar.getBidId(str));
                            m7743a(bVar, jSONObject4, str);
                            jSONArray2.put(jSONObject4);
                            aVar.f8191a = 1;
                        }
                        it2 = it;
                    }
                    if (jSONArray2.length() > 0) {
                        jSONObject2.put("header_bidding_info", jSONArray2);
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("ad_info_upload", jSONArray);
            HashMap hashMap = new HashMap();
            hashMap.put("hb_ad", Integer.valueOf(aVar.f8191a));
            hashMap.put("non_hb_ad", Integer.valueOf(aVar.f8192b));
            C2713g.m7765a("ad_sdk_bid_upload", "sdk_ad", 0, null, hashMap);
        } catch (Exception e2) {
            C2715d.m7770a(e2);
        }
        new StringBuilder("header bidding info:").append(jSONObject.toString());
        return jSONObject.toString();
    }

    /* renamed from: a */
    public final String mo7267a(String str, boolean z) {
        if (C2745d.m7837a(this.f8159i)) {
            return "";
        }
        List list = (List) this.f8159i.get(str);
        mo7251a(list);
        return m7744c(list);
    }

    /* renamed from: a */
    public final void mo7268a(String str, List<C2722a> list) {
        List<String> d = mo7257d(str);
        if (!C2745d.m7836a(d)) {
            for (String str2 : d) {
                C2722a aVar = null;
                if (!C2745d.m7836a(list) && !C9431p.m18664a(str2)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C2722a aVar2 = (C2722a) it.next();
                        List<String> list2 = aVar2.f8224b;
                        if (!C2745d.m7836a(list2)) {
                            for (String equals : list2) {
                                if (str2.equals(equals)) {
                                    aVar = aVar2;
                                    break;
                                }
                            }
                            continue;
                        }
                    }
                }
                if (aVar == null) {
                    m7746f(str2);
                } else if (!AbsNativeAdProvider.isHeaderBiddingProvider(mo7247a(aVar))) {
                    m7746f(str2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m7743a(C2752b bVar, JSONObject jSONObject, String str) {
        if ((bVar instanceof C2749a) && C2715d.m7771b() != null && C2715d.m7771b().f8247c) {
            C2673a nextAdWithoutFill = ((C2749a) bVar).getNextAdWithoutFill(str);
            if (nextAdWithoutFill instanceof C2676c) {
                try {
                    jSONObject.put("headline", ((C2676c) nextAdWithoutFill).mo7234c());
                    jSONObject.put("body", ((C2676c) nextAdWithoutFill).mo7235d());
                } catch (JSONException unused) {
                }
            }
        }
    }
}
