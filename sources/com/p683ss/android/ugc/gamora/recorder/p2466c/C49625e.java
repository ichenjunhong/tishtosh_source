package com.p683ss.android.ugc.gamora.recorder.p2466c;

import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.recorder.c.e */
public final class C49625e {

    /* renamed from: a */
    final FragmentActivity f124484a;

    /* renamed from: b */
    final C45004a f124485b;

    /* renamed from: c */
    public final C50048n f124486c;

    /* renamed from: d */
    public final C49607a f124487d;

    /* renamed from: e */
    final ShortVideoContext f124488e;

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.e$a */
    static final class C49626a extends C52712l implements C52671b<C24434d, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49625e f124489a;

        C49626a(C49625e eVar) {
            this.f124489a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C24434d dVar = (C24434d) obj;
            C52711k.m112240b(dVar, "resultBean");
            this.f124489a.mo97533a(this.f124489a.f124486c);
            this.f124489a.f124487d.mo97520a(dVar.f64818a, dVar.f64819b, dVar.f64820c, dVar.f64821d);
            this.f124489a.f124487d.mo97514a(dVar);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.e$b */
    static final class C49627b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49625e f124490a;

        C49627b(C49625e eVar) {
            this.f124490a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f124490a.mo97533a(this.f124490a.f124486c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo97533a(C50048n nVar) {
        if (this.f124488e.f107126s != null) {
            nVar.mo97824x().mo93194e();
        }
    }

    /* renamed from: a */
    static C0794k<String, String> m107113a(JSONObject jSONObject) {
        String str;
        String str2;
        String str3 = "";
        String str4 = "";
        try {
            str2 = jSONObject.getString("shoot_way");
            C52711k.m112236a((Object) str2, "shootWayExtra.getString(\"shoot_way\")");
            try {
                str = jSONObject.getString("creation_id");
                C52711k.m112236a((Object) str, "shootWayExtra.getString(…ob.Video.KEY_CREATION_ID)");
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            str2 = str3;
            str = str4;
            return new C0794k<>(str2, str);
        }
        return new C0794k<>(str2, str);
    }

    public C49625e(FragmentActivity fragmentActivity, C45004a aVar, C50048n nVar, C49607a aVar2, ShortVideoContext shortVideoContext) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(aVar, "cameraApi");
        C52711k.m112240b(nVar, "stickerApiComponent");
        C52711k.m112240b(aVar2, "chooseMusicApi");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f124484a = fragmentActivity;
        this.f124485b = aVar;
        this.f124486c = nVar;
        this.f124487d = aVar2;
        this.f124488e = shortVideoContext;
    }
}
