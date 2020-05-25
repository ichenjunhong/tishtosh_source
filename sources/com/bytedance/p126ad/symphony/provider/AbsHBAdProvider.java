package com.bytedance.p126ad.symphony.provider;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.bytedance.p126ad.symphony.C2715d;
import com.bytedance.p126ad.symphony.p127a.p128a.C2675b;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.bytedance.p126ad.symphony.p129b.C2699d;
import com.bytedance.p126ad.symphony.p131c.C2702b;
import com.bytedance.p126ad.symphony.p131c.C2702b.C2703a;
import com.bytedance.p126ad.symphony.p131c.C2702b.C2704b;
import com.bytedance.p126ad.symphony.p131c.C2702b.C2705c;
import com.bytedance.p126ad.symphony.p131c.C2702b.C2706d;
import com.bytedance.p126ad.symphony.p131c.C2702b.C2707e;
import com.bytedance.p126ad.symphony.p131c.C2702b.C2708f;
import com.bytedance.p126ad.symphony.p131c.C2713g;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2724b;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.HashMap;

/* renamed from: com.bytedance.ad.symphony.provider.AbsHBAdProvider */
public abstract class AbsHBAdProvider extends AbsNativeAdProvider implements C2754c {
    /* access modifiers changed from: protected */
    public void sendBidRequestEvent(String str) {
        sendEvent(new C2703a(str));
    }

    public String getBidId(String str) {
        C2676c cVar = (C2676c) this.mAdPool.get(str);
        if (cVar instanceof C2675b) {
            return ((C2675b) cVar).mo7242k();
        }
        return "";
    }

    public double getMaxPrice(String str) {
        C2676c cVar = (C2676c) this.mAdPool.get(str);
        if (!(cVar instanceof C2675b) || cVar.mo7233b()) {
            return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
        return ((C2675b) cVar).mo7241j();
    }

    private void sendEvent(C2702b bVar) {
        bVar.mo7270a();
        bVar.f8197e = getProviderId();
        bVar.f8195c = getPlacementId(bVar.f8196d);
        if (C2713g.f8210a != null && (C2715d.m7771b() == null || C2715d.m7771b().f8245a)) {
            HashMap hashMap = new HashMap();
            if (!C9431p.m18664a(bVar.f8193a)) {
                hashMap.put("request_status", bVar.f8193a);
            }
            if (!C9431p.m18664a(bVar.f8194b)) {
                hashMap.put("error_message", bVar.f8194b);
            }
            if (!C9431p.m18664a(bVar.f8195c)) {
                hashMap.put("ad_placement_id", bVar.f8195c);
            }
            if (!C9431p.m18664a(bVar.f8196d)) {
                hashMap.put("ad_placement_type_prefix", C2724b.m7786a(bVar.f8196d));
                hashMap.put("ad_placement_type", bVar.f8196d);
            }
            if (bVar.f8197e != 0) {
                hashMap.put("ad_provider_id", Integer.valueOf(bVar.f8197e));
            }
            if (!C9431p.m18664a(bVar.f8198f)) {
                hashMap.put("bid_id", bVar.f8198f);
            }
            C2713g.m7766a(bVar.mo7270a(), "sdk_ad", 0, null, hashMap, true);
        }
    }

    /* access modifiers changed from: protected */
    public void sendCreativeRequestEvent(String str, String str2) {
        C2705c cVar = new C2705c(str);
        cVar.f8198f = str2;
        sendEvent(cVar);
    }

    /* access modifiers changed from: protected */
    public void sendLossNoticeEvent(String str, String str2) {
        C2707e eVar = new C2707e(str);
        eVar.f8198f = str2;
        sendEvent(eVar);
    }

    /* access modifiers changed from: protected */
    public void sendWinNoticeEvent(String str, String str2) {
        C2708f fVar = new C2708f(str);
        fVar.f8198f = str2;
        sendEvent(fVar);
    }

    public AbsHBAdProvider(Context context, C2723a aVar, C2699d dVar) {
        super(context, aVar, dVar);
    }

    /* access modifiers changed from: protected */
    public void sendBidResponseEvent(String str, String str2, String str3) {
        C2704b bVar = new C2704b(str);
        if (str2 != null) {
            bVar.f8194b = str2;
            bVar.f8193a = "failed";
        } else {
            bVar.f8193a = "succeed";
            bVar.f8198f = str3;
        }
        sendEvent(bVar);
    }

    /* access modifiers changed from: protected */
    public void sendCreativeResponseEvent(String str, String str2, String str3) {
        C2706d dVar = new C2706d(str);
        if (str2 != null) {
            dVar.f8194b = str2;
            dVar.f8193a = "failed";
        } else {
            dVar.f8193a = "succeed";
        }
        dVar.f8198f = str3;
        sendEvent(dVar);
    }
}
