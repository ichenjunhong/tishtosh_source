package com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a;

import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.beauty.C23777a;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.beauty.C23784g;
import com.p683ss.android.ugc.aweme.beauty.C23785h;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44882e;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46896d;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.d */
public final class C46887d implements C46896d {

    /* renamed from: a */
    private int f118446a;

    /* renamed from: b */
    private int f118447b;

    /* renamed from: c */
    private int f118448c;

    /* renamed from: d */
    private int f118449d;

    /* renamed from: e */
    private int f118450e;

    /* renamed from: f */
    private int f118451f;

    /* renamed from: g */
    private boolean f118452g = true;

    /* renamed from: h */
    private boolean f118453h;

    /* renamed from: i */
    private boolean f118454i = true;

    /* renamed from: j */
    private boolean f118455j = true;

    /* renamed from: k */
    private final C44882e f118456k;

    /* renamed from: l */
    private final C20489b f118457l;

    /* renamed from: m */
    private final boolean f118458m;

    /* renamed from: a */
    private boolean m101816a() {
        return this.f118452g;
    }

    /* renamed from: b */
    private boolean m101817b() {
        return this.f118453h;
    }

    /* renamed from: i */
    public final int mo86584i() {
        return this.f118446a;
    }

    /* renamed from: k */
    public final int mo86585k() {
        return this.f118448c;
    }

    /* renamed from: l */
    public final int mo86586l() {
        return this.f118447b;
    }

    /* renamed from: m */
    public final int mo86587m() {
        return this.f118449d;
    }

    /* renamed from: n */
    public final int mo86588n() {
        return this.f118450e;
    }

    /* renamed from: o */
    public final int mo86589o() {
        return this.f118451f;
    }

    /* renamed from: p */
    public final boolean mo86590p() {
        return this.f118455j;
    }

    /* renamed from: q */
    public final boolean mo86591q() {
        return this.f118454i;
    }

    /* renamed from: r */
    public final void mo86592r() {
        boolean z;
        if (C23780d.m58365a() || C23777a.m58348a()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C23784g gVar = new C23784g();
            gVar.mo49368a();
            mo86566a(gVar.f63388c[0]);
            mo86573c(gVar.f63388c[1]);
            mo86571b(gVar.f63388c[2]);
            if (this.f118458m) {
                mo86576d(gVar.f63388c[3]);
                mo86578e(gVar.f63388c[4]);
            }
            if (C39629l.m88232a().mo58574e().mo83117a(C40796a.EnableBeautySharpen)) {
                C39666o oVar = (C39666o) C26888e.m65000a(C39629l.m88233b(), C39666o.class);
                if (!C39629l.m88232a().mo58574e().mo83117a(C40796a.UlikeBeautyDownloadEnable) || oVar.mo48447a(-1.0f) == -1.0f || !C23785h.m58373a("0", "2")) {
                    this.f118456k.mo91000a(C39629l.m88232a().mo58574e().mo83120d(C40796a.UlikeSharpenDefaultValue));
                } else {
                    this.f118456k.mo91000a(oVar.mo48447a(-1.0f));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo86583h(boolean z) {
        mo86579e(z);
        mo86577d(z);
    }

    /* renamed from: a */
    public final void mo86566a(int i) {
        this.f118446a = i;
        if (mo86590p()) {
            this.f118456k.mo91001a(((float) i) / 100.0f, 0.0f);
        }
    }

    /* renamed from: b */
    public final void mo86571b(int i) {
        this.f118448c = i;
        this.f118456k.mo91012b(((float) i) / 100.0f, ((float) mo86586l()) / 100.0f);
    }

    /* renamed from: c */
    public final void mo86573c(int i) {
        this.f118447b = i;
        this.f118456k.mo91012b(((float) mo86585k()) / 100.0f, ((float) i) / 100.0f);
    }

    /* renamed from: d */
    public final void mo86576d(int i) {
        this.f118449d = i;
        if (m101816a() && !m101817b()) {
            float f = ((float) i) / 100.0f;
            this.f118456k.mo91015c(f, ((float) mo86588n()) / 100.0f);
        }
    }

    /* renamed from: e */
    public final void mo86578e(int i) {
        this.f118450e = i;
        if (m101816a() && !m101817b()) {
            float m = ((float) mo86587m()) / 100.0f;
            this.f118456k.mo91015c(m, ((float) i) / 100.0f);
        }
    }

    /* renamed from: f */
    public final void mo86580f(boolean z) {
        this.f118452g = z;
        if (!m101817b() && !this.f118452g) {
            this.f118456k.mo91015c(0.0f, 0.0f);
        }
    }

    /* renamed from: d */
    public final void mo86577d(boolean z) {
        this.f118455j = z;
        if (!this.f118455j || C23777a.m58348a()) {
            this.f118456k.mo91001a(0.0f, 0.0f);
        }
    }

    /* renamed from: e */
    public final void mo86579e(boolean z) {
        this.f118454i = z;
        if (!this.f118454i || C23777a.m58348a()) {
            this.f118456k.mo91012b(0.0f, 0.0f);
        }
    }

    /* renamed from: g */
    public final void mo86581g(boolean z) {
        this.f118453h = z;
        if (this.f118453h) {
            this.f118456k.mo91015c(0.0f, 0.0f);
            return;
        }
        if (m101816a()) {
            this.f118456k.mo91015c(((float) mo86587m()) / 100.0f, ((float) mo86588n()) / 100.0f);
        }
    }

    /* renamed from: b */
    public final void mo86572b(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f118457l.mo43505c(list, i);
    }

    /* renamed from: c */
    public final void mo86574c(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f118457l.mo43476a(list, i);
    }

    /* renamed from: a */
    public final void mo86568a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f118457l.mo43514d(list, i);
    }

    /* renamed from: a */
    public final int[] mo86570a(String str, String str2) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "nodeKey");
        int[] a = this.f118456k.mo91010a(str, str2);
        C52711k.m112236a((Object) a, "videoRecorder.checkCompo…lusion(nodePath, nodeKey)");
        return a;
    }

    /* renamed from: a */
    public final void mo86567a(String str, String str2, float f) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str2, "nodeTag");
        this.f118456k.mo91007a(str, str2, f);
    }

    public C46887d(C44882e eVar, C20489b bVar, boolean z) {
        C52711k.m112240b(eVar, "videoRecorder");
        C52711k.m112240b(bVar, "effectController");
        this.f118456k = eVar;
        this.f118457l = bVar;
        this.f118458m = z;
    }

    /* renamed from: a */
    public final void mo86569a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldNodes");
        C52711k.m112240b(list2, "newNodes");
        this.f118457l.mo43477a(list, list2, i);
    }
}
