package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48756l;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.u */
public final class C48880u extends C48656j {

    /* renamed from: a */
    private C48565a f122917a;

    /* renamed from: b */
    private C48890g f122918b = this.f122917a.f122047a;

    /* renamed from: f */
    private int f122919f = this.f122918b.f122973s;

    /* renamed from: g */
    private C48620c f122920g = this.f122918b.f122972r;

    /* renamed from: h */
    private C48641b f122921h = this.f122918b.f122976v;

    /* renamed from: i */
    private String f122922i;

    /* renamed from: j */
    private String f122923j;

    /* renamed from: k */
    private String f122924k;

    /* renamed from: l */
    private String f122925l;

    /* renamed from: m */
    private String f122926m;

    /* renamed from: n */
    private int f122927n;

    /* renamed from: o */
    private int f122928o;

    /* renamed from: a */
    public final void mo96139a() {
        C48605b b = m105626b();
        while (true) {
            int i = this.f122919f;
            this.f122919f = i - 1;
            if (i != 0) {
                try {
                    if (this.f122291c) {
                        C48649d dVar = new C48649d(10001);
                        dVar.mo96230a(this.f122924k, this.f122925l, this.f122926m);
                        mo96238a(18, new C48756l(new ProviderEffectModel(), dVar));
                        return;
                    }
                    ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) this.f122918b.f122977w.mo96220a(b, this.f122921h, ProviderEffectListResponse.class);
                    if (providerEffectListResponse.checkValue()) {
                        ProviderEffectModel data = providerEffectListResponse.getData();
                        if (data != null) {
                            if (data.getStickerList() != null) {
                                for (ProviderEffect providerEffect : data.getStickerList()) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(this.f122918b.f122964j);
                                    sb.append(File.separator);
                                    sb.append(providerEffect.getId());
                                    sb.append(".gif");
                                    providerEffect.setPath(sb.toString());
                                }
                            }
                        }
                        mo96238a(18, new C48756l(data, null));
                        return;
                    } else if (this.f122919f == 0) {
                        C48649d dVar2 = new C48649d(10002);
                        dVar2.mo96230a(this.f122924k, this.f122925l, this.f122926m);
                        mo96238a(18, new C48756l(new ProviderEffectModel(), dVar2));
                        return;
                    }
                } catch (Exception e) {
                    if (this.f122919f == 0 || (e instanceof C48636c)) {
                        mo96238a(18, new C48756l(new ProviderEffectModel(), new C48649d(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo96238a(18, new C48756l(new ProviderEffectModel(), new C48649d(e)));
    }

    /* renamed from: b */
    private C48605b m105626b() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f122918b.f122956b)) {
            hashMap.put("access_key", this.f122918b.f122956b);
        }
        if (!TextUtils.isEmpty(this.f122918b.f122958d)) {
            hashMap.put("app_version", this.f122918b.f122958d);
        }
        if (!TextUtils.isEmpty(this.f122918b.f122957c)) {
            hashMap.put("sdk_version", this.f122918b.f122957c);
        }
        if (!TextUtils.isEmpty(this.f122918b.f122960f)) {
            hashMap.put("channel", this.f122918b.f122960f);
        }
        if (!TextUtils.isEmpty(this.f122922i)) {
            hashMap.put("library", this.f122922i);
        }
        if (!TextUtils.isEmpty(this.f122918b.f122961g)) {
            hashMap.put("device_platform", this.f122918b.f122961g);
        }
        if (!TextUtils.isEmpty(this.f122918b.f122959e)) {
            hashMap.put("device_id", this.f122918b.f122959e);
        }
        if (!TextUtils.isEmpty(this.f122918b.f122965k)) {
            hashMap.put("region", this.f122918b.f122965k);
        }
        if (!TextUtils.isEmpty(this.f122918b.f122962h)) {
            hashMap.put("device_type", this.f122918b.f122962h);
        }
        if (!TextUtils.isEmpty(this.f122918b.f122966l)) {
            hashMap.put("aid", this.f122918b.f122966l);
        }
        if (!TextUtils.isEmpty(this.f122918b.f122967m)) {
            hashMap.put("app_language", this.f122918b.f122967m);
        }
        if (!TextUtils.isEmpty(this.f122923j)) {
            hashMap.put("word", this.f122923j);
        }
        hashMap.put("cursor", String.valueOf(this.f122927n));
        hashMap.put("count", String.valueOf(this.f122928o));
        this.f122925l = this.f122917a.mo96084a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122925l);
        sb.append(this.f122918b.f122955a);
        sb.append("/stickers/search");
        String a = C48676l.m105346a(hashMap, sb.toString());
        this.f122924k = a;
        try {
            this.f122926m = InetAddress.getByName(new URL(a).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C48605b("GET", a);
    }

    public C48880u(C48565a aVar, String str, String str2, String str3, int i, int i2, Handler handler) {
        super(handler, str);
        this.f122922i = str3;
        this.f122927n = i;
        this.f122928o = i2;
        this.f122923j = str2;
        this.f122917a = aVar;
    }
}
