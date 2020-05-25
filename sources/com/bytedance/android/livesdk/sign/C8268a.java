package com.bytedance.android.livesdk.sign;

import android.os.Bundle;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.browser.p290d.C4720h;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.sign.C8270b.C8271a;
import com.bytedance.android.livesdk.verify.ZhimaVerifyApi;
import com.bytedance.android.livesdk.verify.model.ZhimaStatusResponse;
import com.bytedance.ies.p675g.p676a.C10762d;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.sign.a */
public final class C8268a extends C4720h implements C8271a {

    /* renamed from: L */
    private C8270b f22613L;

    /* renamed from: M */
    private boolean f22614M;

    /* renamed from: N */
    private C1689b f22615N = new C1689b();

    /* renamed from: h */
    public final void mo14457h() {
        this.f22614M = true;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f22615N.mo6180a();
    }

    public final void onResume() {
        super.onResume();
        if (this.f22614M) {
            this.f22615N.mo6181a(((ZhimaVerifyApi) C4514j.m10883j().mo10321b().mo9550a(ZhimaVerifyApi.class)).getCertificationStatus().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C1710e<C4177d<ZhimaStatusResponse>>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    ZhimaStatusResponse zhimaStatusResponse = (ZhimaStatusResponse) ((C4177d) obj).data;
                    if (zhimaStatusResponse.is_verified) {
                        C8268a.this.mo14456b(1);
                    } else if (zhimaStatusResponse.certification_step == 3) {
                        C8268a.this.mo14456b(2);
                    } else {
                        C8268a.this.mo14456b(0);
                    }
                }
            }));
        }
    }

    /* renamed from: b */
    public final void mo14456b(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            this.f12847A.mo10483a().mo19581a("H5_signStatus", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f22613L = new C8270b(getActivity(), this);
        this.f12847A.mo10593c().mo19585a("openHostVerify", (C10762d) this.f22613L);
    }
}
