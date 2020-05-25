package com.bytedance.android.live.wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.C2944a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.api.C4303i;
import com.bytedance.android.live.wallet.api.C4303i.C4305b;
import com.bytedance.android.live.wallet.api.C4310j;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C4469h;
import com.bytedance.android.live.wallet.p263f.C4423a.C4424a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;

/* renamed from: com.bytedance.android.live.wallet.e */
public final class C4399e implements C4311b {

    /* renamed from: a */
    public C4469h f12038a;

    /* renamed from: b */
    public C2189f<Long> f12039b;

    /* renamed from: com.bytedance.android.live.wallet.e$a */
    static class C4405a {

        /* renamed from: a */
        public static final C4399e f12050a = new C4399e();
    }

    /* renamed from: f */
    public final String mo10098f() {
        return this.f12038a.f12217g;
    }

    /* renamed from: a */
    public final C2201v<Long> mo10089a() {
        return this.f12039b.mo6514a(C1667a.m5940a());
    }

    /* renamed from: b */
    public final long mo10092b() {
        if (!m10699h()) {
            return 0;
        }
        return this.f12038a.f12211a;
    }

    /* renamed from: c */
    public final long mo10094c() {
        if (!m10699h()) {
            return 0;
        }
        return this.f12038a.f12213c;
    }

    /* renamed from: d */
    public final long mo10096d() {
        if (!m10699h()) {
            return 0;
        }
        return this.f12038a.f12213c;
    }

    /* renamed from: g */
    public final int mo10099g() {
        if (!m10699h()) {
            return 0;
        }
        return this.f12038a.f12212b;
    }

    /* renamed from: h */
    private static boolean m10699h() {
        return ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c();
    }

    private C4399e() {
        this.f12038a = new C4469h();
        this.f12039b = C2180b.m6534l();
        if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            IWalletService iWalletService = (IWalletService) C4116c.m10249a(IWalletService.class);
            if (((Integer) LiveSettingKeys.TTLIVE_PAY_TYPE.mo9431a()).intValue() == 1 && ((C4310j) C4285a.m10552a(C4310j.class)) != null) {
                C3922z.m9915e();
                iWalletService.getCJAppId();
                iWalletService.getCJMerchantId();
                String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b());
            }
        }
        final C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
        if (iVar != null) {
            iVar.mo10080a((C4305b) new C4305b() {
                /* renamed from: a */
                public final void mo10087a(final String str, String str2) {
                    String str3;
                    final String str4 = "";
                    try {
                        String[] split = new JSONObject(str).getString("developerPayload").split(",");
                        if (split.length > 2) {
                            str3 = split[2];
                        } else {
                            str3 = "";
                        }
                        str4 = str3;
                    } catch (JSONException unused) {
                    }
                    ((WalletApi) C4157e.m10322a().mo9550a(WalletApi.class)).mtVerify(str4, str).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C1710e<C4177d<Object>>() {
                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            C4177d dVar = (C4177d) obj;
                            String string = new JSONObject(str).getString("purchaseToken");
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(string);
                            if (!TextUtils.isEmpty(string)) {
                                iVar.mo10078a(C3922z.m9915e(), arrayList, null);
                            }
                        }
                    }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            int i;
                            Throwable th = (Throwable) obj;
                            if (th instanceof C2944a) {
                                i = ((C2944a) th).getErrorCode();
                            } else {
                                i = -13;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("order_id", str4);
                            hashMap.put("error_code", Integer.valueOf(i));
                            hashMap.put("error_msg", th.getMessage());
                            hashMap.put("errorDomain", C4424a.VERIFY);
                            C4627a.m11091a(10, 1, 0, hashMap);
                            C4627a.m11093b(10, 1, 0, hashMap);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo10097e() {
        if (m10699h()) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            ((WalletApi) C4157e.m10322a().mo9550a(WalletApi.class)).getWalletInfo(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a().getSecUid()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C1710e<C4177d<C4469h>>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    C4469h hVar = (C4469h) ((C4177d) obj).data;
                    if (hVar != null) {
                        C4399e.this.f12038a = hVar;
                    }
                    C4399e.this.f12039b.onNext(Long.valueOf(C4399e.this.mo10092b()));
                    C4627a.m11098f(0, SystemClock.uptimeMillis() - uptimeMillis, null);
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    int i;
                    Throwable th = (Throwable) obj;
                    HashMap hashMap = new HashMap();
                    hashMap.put("error_msg", th.getMessage());
                    String str = "error_code";
                    if (th instanceof C2944a) {
                        i = ((C2944a) th).getErrorCode();
                    } else {
                        i = -16;
                    }
                    hashMap.put(str, Integer.valueOf(i));
                    C3837e.m9741a(C3836d.m9735b("ttlive_charge_current_diamond_status"), 1, SystemClock.uptimeMillis() - uptimeMillis, (Map<String, Object>) hashMap);
                    C4627a.m11098f(1, SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo10090a(int i) {
        if (m10699h()) {
            this.f12038a.f12212b = i;
            this.f12039b.onNext(Long.valueOf(mo10092b()));
        }
    }

    /* renamed from: b */
    public final boolean mo10093b(long j) {
        if (m10699h() && this.f12038a.f12211a >= j) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo10095c(long j) {
        if (m10699h() && ((long) this.f12038a.f12212b) >= j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10091a(long j) {
        if (m10699h()) {
            this.f12038a.f12211a = j;
            this.f12039b.onNext(Long.valueOf(mo10092b()));
        }
    }
}
