package com.p683ss.android.ugc.gamora.recorder.p2465b;

import android.text.TextUtils;
import com.bytedance.als.C2765i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44450b;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TabHost.C45588b;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j.C49606a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.e */
public final class C49580e {

    /* renamed from: a */
    public final List<C49582f> f124364a = new ArrayList();

    /* renamed from: b */
    public Object f124365b;

    /* renamed from: c */
    public C49582f f124366c;

    /* renamed from: d */
    public C2765i<C49578c> f124367d;

    /* renamed from: e */
    C44450b f124368e;

    /* renamed from: f */
    public TabHost f124369f;

    /* renamed from: g */
    ShortVideoContext f124370g;

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.e$a */
    static final class C49581a implements C45588b {

        /* renamed from: a */
        final /* synthetic */ C49580e f124371a;

        C49581a(C49580e eVar) {
            this.f124371a = eVar;
        }

        /* renamed from: a */
        public final void mo91953a(int i, int i2) {
            Object a = C49580e.m106986a(this.f124371a).mo91934a(i2);
            Object a2 = C49580e.m106986a(this.f124371a).mo91934a(i);
            if (a == null) {
                C52711k.m112234a();
            }
            C49578c cVar = new C49578c(a2, a);
            this.f124371a.f124365b = a;
            this.f124371a.mo97497a(cVar);
            C2765i<C49578c> iVar = this.f124371a.f124367d;
            if (iVar == null) {
                C52711k.m112237a("bottomTabIndexChangeEvent");
            }
            iVar.mo7350a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo97496a() {
        C50203g.m108358a("BottomTabPresenter dispatchEvent BottomTabIndexChangeEvent");
        String string = C39618d.f101160a.getString(R.string.d5a);
        C52711k.m112236a((Object) string, "AVEnv.application.getStr…cord_mode_combine_15_tag)");
        for (C49582f fVar : this.f124364a) {
            if (fVar.f124373b.f124362e) {
                string = fVar.f124373b.f124360c;
                this.f124365b = string;
            }
        }
        C49578c cVar = new C49578c(null, string);
        cVar.f124355a = true;
        mo97497a(cVar);
        C2765i<C49578c> iVar = this.f124367d;
        if (iVar == null) {
            C52711k.m112237a("bottomTabIndexChangeEvent");
        }
        iVar.mo7350a(cVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ TabHost m106986a(C49580e eVar) {
        TabHost tabHost = eVar.f124369f;
        if (tabHost == null) {
            C52711k.m112237a("bottomTabHost");
        }
        return tabHost;
    }

    /* renamed from: a */
    public final void mo97497a(C49578c cVar) {
        C49606a aVar = new C49606a(cVar.f124355a);
        for (C49582f fVar : this.f124364a) {
            C49579d dVar = fVar.f124373b;
            if (TextUtils.equals((CharSequence) cVar.f124356b, dVar.f124360c)) {
                fVar.f124372a.setValue(Boolean.valueOf(false));
                if (dVar.f124363f != null) {
                    dVar.f124363f.mo49420b(dVar, aVar);
                }
            }
            Object obj = cVar.f124357c;
            if (obj == null) {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            } else if (TextUtils.equals((CharSequence) obj, dVar.f124360c)) {
                fVar.f124372a.setValue(Boolean.valueOf(true));
                if (dVar.f124363f != null) {
                    dVar.f124363f.mo49419a(dVar, aVar);
                }
            }
        }
    }
}
