package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p180b.p181a.p182a.C2945a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.C4297c;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p264g.p265a.C4425a;
import com.bytedance.android.live.wallet.p264g.p266b.C4450a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4571ak;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.f */
public final class C4781f implements C10762d {

    /* renamed from: a */
    public final WeakReference<Context> f12997a;

    /* renamed from: b */
    public C8685b f12998b;

    /* renamed from: c */
    public ProgressDialog f12999c;

    /* renamed from: d */
    private IWalletService f13000d = ((IWalletService) C4116c.m10249a(IWalletService.class));

    /* renamed from: e */
    private C4425a f13001e;

    public C4781f(WeakReference<Context> weakReference) {
        this.f12997a = weakReference;
    }

    /* renamed from: a */
    private int m11344a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        Pair pair = null;
        if (jSONObject != null) {
            try {
                if (((IWalletService) C4116c.m10249a(IWalletService.class)) != null) {
                    String optString = jSONObject.optString("type");
                    JSONObject optJSONObject = jSONObject.optJSONObject("args");
                    if (optJSONObject != null) {
                        C8685b bVar = new C8685b();
                        bVar.f23718a = optJSONObject.optString("order_id");
                        bVar.f23724g = optJSONObject.optString("channel_id");
                        bVar.f23721d = optJSONObject.optString("product_id");
                        bVar.f23722e = optJSONObject.optInt("real_count");
                        if (TextUtils.equals(optString, "alipay")) {
                            bVar.f23720c = C8807k.ALIPAY;
                            String optString2 = optJSONObject.optString("order_info");
                            String optString3 = optJSONObject.optString("sign");
                            String optString4 = optJSONObject.optString("sign_type");
                            if (!TextUtils.isEmpty(optString3)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(optString2);
                                sb.append("&sign=\"");
                                sb.append(optString3);
                                sb.append("\"");
                                optString2 = sb.toString();
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(optString2);
                                sb2.append("&sign_type=\"");
                                sb2.append(optString4);
                                sb2.append("\"");
                                optString2 = sb2.toString();
                            }
                            bVar.f23725h = optString2;
                        } else if (TextUtils.equals(optString, "wxpay")) {
                            bVar.f23720c = C8807k.WEIXIN;
                            bVar.f23726i = optJSONObject.optString("app_id");
                            bVar.f23727j = optJSONObject.optString("partner_id");
                            bVar.f23729l = optJSONObject.optString("nonce_str");
                            bVar.f23728k = optJSONObject.optString("prepay_id");
                            bVar.f23730m = optJSONObject.optString("timestamp");
                            bVar.f23731n = optJSONObject.optString("sign");
                        }
                        pair = new Pair(optString, bVar);
                    }
                }
            } catch (NullPointerException unused) {
                return 0;
            }
        }
        if (pair == null) {
            return 0;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("args");
        String str = "live_detail";
        String str2 = "";
        if (optJSONObject2 != null) {
            str = optJSONObject2.optString("request_page");
            str2 = optJSONObject2.optString("charge_reason");
        }
        return m11343a((C8685b) pair.second, (String) pair.first, str, str2);
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (hVar != null && hVar.f28947d != null) {
            jSONObject.put("code", m11344a(hVar.f28947d));
        }
    }

    /* renamed from: a */
    public static JSONObject m11345a(C8685b bVar, int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "pay");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("order_id", bVar.f23718a);
            jSONObject2.put("channel_param", i);
            String str2 = "channel";
            if (bVar.f23720c == C8807k.ALIPAY) {
                str = "alipay";
            } else {
                str = "wxpay";
            }
            jSONObject2.put(str2, str);
            jSONObject2.put("channel_id", bVar.f23724g);
            jSONObject.put("args", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private int m11343a(C8685b bVar, String str, String str2, String str3) {
        if (this.f12997a == null || this.f12997a.get() == null || this.f13000d == null) {
            return 1;
        }
        ChargeDeal chargeDeal = new ChargeDeal();
        chargeDeal.f23695i = bVar.f23722e;
        try {
            chargeDeal.f23687a = Long.parseLong(bVar.f23721d);
        } catch (Exception e) {
            C3831a.m9714b("LivePayMethod", (Throwable) e);
        }
        if (!TextUtils.equals(str, "wxpay")) {
            TextUtils.equals(str, "alipay");
        }
        if (C3889d.m9831a((Context) this.f12997a.get()) == null) {
            C3831a.m9716d("LivePayMethod", "No activity was attached while paying");
            return 1;
        }
        this.f12998b = bVar;
        Activity activity = (Activity) this.f12997a.get();
        if (this.f13001e == null) {
            this.f13001e = ((IWalletService) C4116c.m10249a(IWalletService.class)).getBasePayPresenter(activity, new C4297c() {
            }, str3, str2, 0, new C4450a() {
                /* renamed from: a */
                public final void mo10126a(C8685b bVar) {
                }

                /* renamed from: a */
                public final void mo10127a(Exception exc) {
                }

                /* renamed from: c */
                public final void mo10131c() {
                    if (C4781f.this.f12999c != null) {
                        if (C4781f.this.f12999c.isShowing()) {
                            C4781f.this.f12999c.dismiss();
                        }
                        C4781f.this.f12999c = null;
                    }
                }

                /* renamed from: d */
                public final void mo10132d() {
                    C4575an.m10981a((int) R.string.exs);
                    C4514j.m10883j().mo10322c().mo10498a("H5_payStatusChange", C4781f.m11345a(C4781f.this.f12998b, -1));
                }

                /* renamed from: a */
                public final void mo10122a(int i) {
                    if ((C4781f.this.f12997a.get() != null && C4781f.this.f12999c == null) || !C4781f.this.f12999c.isShowing()) {
                        C4781f.this.f12999c = C4571ak.m10972a((Context) C4781f.this.f12997a.get(), C3922z.m9903a((int) R.string.exz));
                    }
                }

                /* renamed from: a */
                public final void mo10123a(int i, CheckOrderOriginalResult checkOrderOriginalResult) {
                    C4575an.m10981a((int) R.string.ey1);
                    C4514j.m10883j().mo10322c().mo10498a("H5_payStatusChange", C4781f.m11345a(C4781f.this.f12998b, 1));
                    C7713e eVar = new C7713e(C4781f.this.f12998b.f23722e);
                    eVar.f21217a = 0;
                    C4495a.m10823a().mo10301a((Object) eVar);
                }

                /* renamed from: a */
                public final void mo10128a(Exception exc, int i) {
                    C4514j.m10883j().mo10322c().mo10498a("H5_payStatusChange", C4781f.m11345a(C4781f.this.f12998b, 2));
                    if (exc instanceof C2945a) {
                        int errorCode = ((C2945a) exc).getErrorCode();
                        if (errorCode == 0) {
                            C4575an.m10981a((int) R.string.ey2);
                        } else if (errorCode == 1 || errorCode == 2) {
                            C4575an.m10981a((int) R.string.ey3);
                        } else {
                            C4575an.m10981a((int) R.string.exv);
                        }
                    } else {
                        C4575an.m10981a((int) R.string.exu);
                    }
                }
            });
        }
        C4425a aVar = this.f13001e;
        return 1;
    }
}
