package com.p683ss.android.ugc.aweme.status;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.p683ss.android.ugc.aweme.comment_sticker.C25465a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49576a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49579d;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49604i;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49605j.C49606a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a.C49608a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.h */
public final class C45788h implements C49576a {

    /* renamed from: a */
    public Activity f115711a;

    /* renamed from: b */
    public ShortVideoContext f115712b;

    /* renamed from: c */
    public RecordStatusViewModel f115713c;

    /* renamed from: d */
    public C45784g f115714d = new C45784g();

    /* renamed from: e */
    private String f115715e;

    /* renamed from: f */
    private final String f115716f;

    /* renamed from: g */
    private final String f115717g;

    /* renamed from: h */
    private final boolean f115718h = false;

    /* renamed from: com.ss.android.ugc.aweme.status.h$a */
    public static final class C45789a implements C49605j {

        /* renamed from: a */
        final /* synthetic */ C45788h f115719a;

        /* renamed from: b */
        final /* synthetic */ C48923a f115720b;

        /* renamed from: b */
        public final boolean mo49420b(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            return false;
        }

        C45789a(C45788h hVar, C48923a aVar) {
            this.f115719a = hVar;
            this.f115720b = aVar;
        }

        /* renamed from: a */
        public final boolean mo49419a(C49579d dVar, C49606a aVar) {
            C52711k.m112240b(dVar, "model");
            C52711k.m112240b(aVar, "extraInfo");
            ApiCenter a = C2755a.m7851a(this.f115720b.mo96751b());
            ((C43859a) a.mo7339a(C43859a.class)).mo89400c(false);
            C49608a.m107072a(this.f115720b.mo96751b()).mo97523k();
            C45788h.m99588a(this.f115719a).mo92168m().setValue(Integer.valueOf(1));
            C45788h.m99588a(this.f115719a).mo92167l().setValue(Boolean.valueOf(true));
            C25465a aVar2 = (C25465a) a.mo7341b(C25465a.class);
            if (aVar2 != null) {
                aVar2.mo52059a(false);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final C49604i mo49416a() {
        return this.f115714d;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordStatusViewModel m99588a(C45788h hVar) {
        RecordStatusViewModel recordStatusViewModel = hVar.f115713c;
        if (recordStatusViewModel == null) {
            C52711k.m112237a("recordStatusViewModel");
        }
        return recordStatusViewModel;
    }

    /* renamed from: a */
    public final void mo49417a(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        this.f115711a = aVar.mo96751b();
        this.f115712b = aVar.mo96752c();
        C0209x a = C0214z.m440a(aVar.mo96751b()).mo359a(RecordStatusViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f115713c = (RecordStatusViewModel) a;
    }

    /* renamed from: b */
    public final C49579d mo49418b(C48923a aVar) {
        C52711k.m112240b(aVar, "tabEnv");
        if (C52711k.m112239a((Object) C39618d.f101151O.mo83121e(C40796a.StatusTabKey), (Object) "creation_shoot_tab_text")) {
            Activity activity = this.f115711a;
            if (activity == null) {
                C52711k.m112237a("mActivity");
            }
            String string = activity.getString(R.string.g1f);
            C52711k.m112236a((Object) string, "mActivity.getString(R.st….creation_shoot_tab_text)");
            this.f115715e = string;
        } else {
            Activity activity2 = this.f115711a;
            if (activity2 == null) {
                C52711k.m112237a("mActivity");
            }
            String string2 = activity2.getString(R.string.g1e);
            C52711k.m112236a((Object) string2, "mActivity.getString(R.st…reation_shoot_tab_status)");
            this.f115715e = string2;
        }
        C49579d dVar = new C49579d(this.f115715e, this.f115716f, this.f115717g, aVar.mo96752c().f107057aI, new C45789a(this, aVar));
        return dVar;
    }

    public C45788h(String str, String str2, String str3, boolean z) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(str3, "shootMode");
        this.f115715e = str;
        this.f115716f = str2;
        this.f115717g = str3;
    }
}
