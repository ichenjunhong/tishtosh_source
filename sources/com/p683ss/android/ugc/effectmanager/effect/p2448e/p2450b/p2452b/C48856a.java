package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel;
import com.p683ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48747c;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.a */
public final class C48856a extends C48656j {

    /* renamed from: a */
    private C48565a f122756a;

    /* renamed from: b */
    private C48890g f122757b = this.f122756a.f122047a;

    /* renamed from: f */
    private String f122758f;

    /* renamed from: g */
    private String f122759g;

    /* renamed from: h */
    private String f122760h;

    /* renamed from: i */
    private int f122761i;

    /* renamed from: j */
    private Map<String, String> f122762j;

    /* renamed from: b */
    private boolean m105583b() {
        String str;
        switch (this.f122761i) {
            case 1:
                str = C48667e.m105302c(this.f122758f, this.f122759g);
                break;
            case 2:
                str = C48667e.m105297a(this.f122758f);
                break;
            default:
                StringBuilder sb = new StringBuilder("effect_version");
                sb.append(this.f122758f);
                str = sb.toString();
                break;
        }
        InputStream b = this.f122757b.f122972r.mo96152b(str);
        if (b == null) {
            return false;
        }
        CheckUpdateVersionModel checkUpdateVersionModel = null;
        try {
            checkUpdateVersionModel = (CheckUpdateVersionModel) this.f122757b.f122976v.mo59189a(b, CheckUpdateVersionModel.class);
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
        C48660a.m105288a(b);
        if (checkUpdateVersionModel == null) {
            return false;
        }
        this.f122760h = checkUpdateVersionModel.version;
        return true;
    }

    /* renamed from: a */
    public final void mo96139a() {
        String str;
        if (m105583b()) {
            SharedPreferences a = C35807d.m80935a(this.f122756a.mo96085b(), C42311c.f106863g, 0);
            boolean equals = true ^ a.getString("app_version", "").equals(this.f122757b.f122958d);
            if (equals) {
                Editor edit = a.edit();
                edit.putString("app_version", this.f122757b.f122958d);
                edit.commit();
            }
            HashMap a2 = C48668f.f122308a.mo96252a(this.f122757b);
            a2.put("panel", this.f122758f);
            switch (this.f122761i) {
                case 1:
                    str = "/category/check";
                    a2.put("category", this.f122759g);
                    break;
                case 2:
                    str = "/panel/check";
                    break;
                default:
                    str = "/panel/check";
                    break;
            }
            if (equals) {
                a2.put(C42311c.f106863g, "");
            } else {
                a2.put(C42311c.f106863g, this.f122760h);
            }
            if (this.f122762j != null) {
                a2.putAll(this.f122762j);
            }
            String str2 = this.f122757b.f122980z;
            if (!TextUtils.isEmpty(str2)) {
                a2.put("test_status", str2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f122756a.mo96084a());
            sb.append(this.f122757b.f122955a);
            sb.append(str);
            C48605b bVar = new C48605b("GET", C48676l.m105346a(a2, sb.toString()));
            if (this.f122291c) {
                mo96238a(13, new C48747c(false, new C48649d(10001)));
            }
            try {
                EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) this.f122757b.f122977w.mo96220a(bVar, this.f122757b.f122976v, EffectCheckUpdateResponse.class);
                if (effectCheckUpdateResponse != null) {
                    mo96238a(13, new C48747c(effectCheckUpdateResponse.isUpdated(), null));
                    return;
                }
                mo96238a(13, new C48747c(false, new C48649d(10002)));
            } catch (Exception e) {
                mo96238a(13, new C48747c(false, new C48649d(e)));
            }
        } else {
            mo96238a(13, new C48747c(true, null));
        }
    }

    public C48856a(C48565a aVar, String str, Handler handler, String str2, String str3, int i, Map<String, String> map) {
        super(handler, str);
        this.f122756a = aVar;
        this.f122758f = str2;
        this.f122759g = str3;
        this.f122761i = i;
        this.f122762j = map;
    }
}
