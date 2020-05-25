package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo;

import android.arch.lifecycle.C0184k;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.services.ISDKService.SplitCallback;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2645i.C52744c;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.d */
public final class C46453d {

    /* renamed from: f */
    public static final C46454a f117186f = new C46454a(null);

    /* renamed from: a */
    final String f117187a;

    /* renamed from: b */
    public String f117188b;

    /* renamed from: c */
    public String f117189c;

    /* renamed from: d */
    public final String f117190d;

    /* renamed from: e */
    public final String f117191e;

    /* renamed from: g */
    private final C0184k f117192g;

    /* renamed from: h */
    private final Effect f117193h;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.d$a */
    public static final class C46454a {
        private C46454a() {
        }

        public /* synthetic */ C46454a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.d$b */
    public static final class C46455b implements SplitCallback {

        /* renamed from: a */
        final /* synthetic */ C46453d f117194a;

        /* renamed from: b */
        final /* synthetic */ C52686q f117195b;

        public final void onFail() {
            this.f117195b.invoke(Boolean.valueOf(false), this.f117194a.f117190d, this.f117194a.f117191e);
        }

        C46455b(C46453d dVar, C52686q qVar) {
            this.f117194a = dVar;
            this.f117195b = qVar;
        }

        public final void onSuccess(int i, int i2) {
            C50200d.m108347a(this.f117194a.f117188b, this.f117194a.f117190d);
            C50200d.m108347a(this.f117194a.f117189c, this.f117194a.f117191e);
            this.f117195b.invoke(Boolean.valueOf(true), this.f117194a.f117190d, this.f117194a.f117191e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String[] mo93186a() {
        String[] strArr = {"", ""};
        if (TextUtils.isEmpty(this.f117193h.getSdkExtra())) {
            return strArr;
        }
        try {
            JSONObject optJSONObject = new JSONObject(this.f117193h.getSdkExtra()).optJSONObject("vl");
            if (optJSONObject == null) {
                return strArr;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("multi_vPath");
            if (optJSONArray != null) {
                if (optJSONArray.length() > 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("multi_aPath");
                    int a = C52753d.m112316a(C52753d.m112320b(0, optJSONArray.length()), (C52744c) C52744c.f130992c);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f117193h.getUnzipPath());
                    sb.append(optJSONArray.getString(a));
                    strArr[0] = sb.toString();
                    if (optJSONArray2 != null && a < optJSONArray2.length()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f117193h.getUnzipPath());
                        sb2.append(optJSONArray2.getString(a));
                        strArr[1] = sb2.toString();
                    }
                    return strArr;
                }
            }
            return strArr;
        } catch (Exception unused) {
            StringBuilder sb3 = new StringBuilder("BackgroundVideo, parse sticker extra fail, ");
            sb3.append(this.f117193h);
            sb3.append(".sdkExtra");
            C50203g.m108361b(sb3.toString());
            return strArr;
        }
    }

    public C46453d(C0184k kVar, Effect effect) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(effect, "faceSticker");
        this.f117192g = kVar;
        this.f117193h = effect;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f117193h.getUnzipPath());
        sb.append(File.separator);
        sb.append("res_split");
        this.f117187a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f117187a);
        sb2.append(File.separator);
        sb2.append("background_v");
        this.f117188b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f117187a);
        sb3.append(File.separator);
        sb3.append("background_a");
        this.f117189c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C43308eb.f109495h);
        sb4.append("background_v");
        this.f117190d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C43308eb.f109495h);
        sb5.append("background_a");
        this.f117191e = sb5.toString();
    }
}
