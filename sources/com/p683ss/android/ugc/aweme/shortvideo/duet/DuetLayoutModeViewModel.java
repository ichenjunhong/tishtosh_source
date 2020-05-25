package com.p683ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.als.C2762f;
import com.bytedance.als.C2765i;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.ui_component.C13359a;
import com.bytedance.ui_component.C13359a.C13360a;
import com.bytedance.ui_component.C13359a.C13361b;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p683ss.android.ugc.aweme.base.C23550k;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel */
public final class DuetLayoutModeViewModel extends LifecycleAwareViewModel<DuetLayoutModeState> implements C43244d {

    /* renamed from: e */
    public final C2765i<Boolean> f109331e = new C2765i<>();

    /* renamed from: f */
    public final C2765i<C23550k> f109332f = new C2765i<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel$a */
    static final class C43233a extends C52712l implements C52671b<DuetLayoutModeState, DuetLayoutModeState> {

        /* renamed from: a */
        final /* synthetic */ int f109333a;

        /* renamed from: b */
        final /* synthetic */ int f109334b;

        /* renamed from: c */
        final /* synthetic */ int f109335c;

        C43233a(int i, int i2, int i3) {
            this.f109333a = i;
            this.f109334b = i2;
            this.f109335c = i3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DuetLayoutModeState duetLayoutModeState = (DuetLayoutModeState) obj;
            C52711k.m112240b(duetLayoutModeState, "$receiver");
            return DuetLayoutModeState.copy$default(duetLayoutModeState, this.f109333a, 0, this.f109334b, this.f109335c, null, 18, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel$b */
    static final class C43234b extends C52712l implements C52671b<DuetLayoutModeState, DuetLayoutModeState> {

        /* renamed from: a */
        final /* synthetic */ int f109336a;

        C43234b(int i) {
            this.f109336a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DuetLayoutModeState duetLayoutModeState = (DuetLayoutModeState) obj;
            C52711k.m112240b(duetLayoutModeState, "$receiver");
            return DuetLayoutModeState.copy$default(duetLayoutModeState, 0, this.f109336a, 0, 0, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel$c */
    static final class C43235c extends C52712l implements C52671b<DuetLayoutModeState, DuetLayoutModeState> {

        /* renamed from: a */
        final /* synthetic */ boolean f109337a;

        C43235c(boolean z) {
            this.f109337a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C13359a aVar;
            DuetLayoutModeState duetLayoutModeState = (DuetLayoutModeState) obj;
            C52711k.m112240b(duetLayoutModeState, "$receiver");
            if (this.f109337a) {
                aVar = new C13361b();
            } else {
                aVar = new C13360a();
            }
            return DuetLayoutModeState.copy$default(duetLayoutModeState, 0, 0, 0, 0, aVar, 15, null);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2762f mo87912a() {
        return this.f109331e;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2762f mo87914b() {
        return this.f109332f;
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        DuetLayoutModeState duetLayoutModeState = new DuetLayoutModeState(0, 0, 0, 0, null, 31, null);
        return duetLayoutModeState;
    }

    /* renamed from: a */
    public final void mo87913a(boolean z) {
        mo22533d(new C43235c(z));
    }

    /* renamed from: b */
    public final void mo87915b(boolean z) {
        this.f109331e.mo7350a(Boolean.valueOf(z));
    }
}
