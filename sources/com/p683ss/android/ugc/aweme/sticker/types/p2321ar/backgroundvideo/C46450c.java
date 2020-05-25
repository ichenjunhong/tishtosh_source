package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo;

import android.arch.lifecycle.C0184k;
import com.p683ss.android.ugc.aweme.services.ISDKService.SplitCallback;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.File;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c */
public final class C46450c {

    /* renamed from: f */
    public static final C46451a f117176f = new C46451a(null);

    /* renamed from: a */
    final String f117177a;

    /* renamed from: b */
    public final String f117178b;

    /* renamed from: c */
    public final String f117179c;

    /* renamed from: d */
    public final String f117180d;

    /* renamed from: e */
    public final String f117181e;

    /* renamed from: g */
    private final C0184k f117182g;

    /* renamed from: h */
    private final Effect f117183h;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c$a */
    public static final class C46451a {
        private C46451a() {
        }

        public /* synthetic */ C46451a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c$b */
    public static final class C46452b implements SplitCallback {

        /* renamed from: a */
        final /* synthetic */ C46450c f117184a;

        /* renamed from: b */
        final /* synthetic */ C52686q f117185b;

        public final void onFail() {
            this.f117185b.invoke(Boolean.valueOf(false), this.f117184a.f117180d, this.f117184a.f117181e);
        }

        C46452b(C46450c cVar, C52686q qVar) {
            this.f117184a = cVar;
            this.f117185b = qVar;
        }

        public final void onSuccess(int i, int i2) {
            C50200d.m108347a(this.f117184a.f117178b, this.f117184a.f117180d);
            C50200d.m108347a(this.f117184a.f117179c, this.f117184a.f117181e);
            this.f117185b.invoke(Boolean.valueOf(true), this.f117184a.f117180d, this.f117184a.f117181e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo93185a() {
        try {
            JSONObject optJSONObject = new JSONObject(this.f117183h.getSdkExtra()).optJSONObject("vl");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f117183h.getUnzipPath());
            sb.append(optJSONObject.optString("vPath"));
            return sb.toString();
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder("BackgroundVideo, parse sticker extra fail, ");
            sb2.append(this.f117183h);
            sb2.append(".sdkExtra");
            C50203g.m108361b(sb2.toString());
            return "";
        }
    }

    public C46450c(C0184k kVar, Effect effect) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(effect, "faceSticker");
        this.f117182g = kVar;
        this.f117183h = effect;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f117183h.getUnzipPath());
        sb.append(File.separator);
        sb.append("res_split");
        this.f117177a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f117177a);
        sb2.append(File.separator);
        sb2.append("background_v");
        this.f117178b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f117177a);
        sb3.append(File.separator);
        sb3.append("background_a");
        this.f117179c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C43308eb.f109495h);
        sb4.append("background_v");
        this.f117180d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C43308eb.f109495h);
        sb5.append("background_a");
        this.f117181e = sb5.toString();
    }
}
