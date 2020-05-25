package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a;

import android.content.Context;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2767k;
import com.p683ss.android.ugc.aweme.beauty.C23777a;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46352j;
import com.p683ss.android.ugc.aweme.tools.C47093m;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.p2467d.C49648a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50002h;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.i */
public final class C49993i implements C46352j {

    /* renamed from: a */
    final C50048n f125270a;

    /* renamed from: b */
    final C50002h f125271b;

    /* renamed from: c */
    private final ApiCenter f125272c = C2755a.m7851a(this.f125274e);

    /* renamed from: d */
    private boolean f125273d;

    /* renamed from: e */
    private final AppCompatActivity f125274e;

    /* renamed from: f */
    private final C45004a f125275f;

    /* renamed from: g */
    private final C42451a f125276g;

    /* renamed from: h */
    private final C49683a f125277h;

    /* renamed from: i */
    private final ShortVideoContext f125278i;

    /* renamed from: e */
    public final void mo93077e(FaceStickerBean faceStickerBean) {
        C52711k.m112240b(faceStickerBean, "sticker");
    }

    /* renamed from: b */
    private final CameraModule m107876b() {
        return this.f125275f.mo91303I();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo97789a() {
        C49648a aVar = (C49648a) this.f125272c.mo7341b(C49648a.class);
        if (aVar != null) {
            aVar.mo97553c();
        }
    }

    /* renamed from: b */
    public final void mo93074b(FaceStickerBean faceStickerBean) {
        C52711k.m112240b(faceStickerBean, "sticker");
        if (C23777a.m58348a()) {
            this.f125276g.mo86558a(this.f125278i.f107128u, true);
        }
        if (m107876b().mo90316f() != 0) {
            C45004a aVar = this.f125275f;
            C47093m b = C47093m.m102239b();
            C52711k.m112236a((Object) b, "FrontRearChangeEvent.toRear()");
            aVar.mo91321a(b);
        }
        if (!C23780d.m58365a()) {
            this.f125276g.mo86583h(false);
        }
        if (this.f125278i.f107128u && !C23780d.m58365a()) {
            this.f125276g.mo86556a(false);
            this.f125278i.f107128u = false;
        }
    }

    /* renamed from: c */
    public final void mo93075c(FaceStickerBean faceStickerBean) {
        C52711k.m112240b(faceStickerBean, "sticker");
        if (C23777a.m58348a()) {
            this.f125276g.mo86558a(this.f125278i.f107128u, true);
        }
        if (!this.f125278i.f107128u && !C23780d.m58365a()) {
            this.f125276g.mo86556a(true);
            this.f125278i.f107128u = true;
        }
        if (!C23780d.m58365a()) {
            this.f125276g.mo86579e(!faceStickerBean.getTags().contains("disable_reshape"));
            this.f125276g.mo86577d(!faceStickerBean.getTags().contains("disable_smooth"));
        }
    }

    /* renamed from: d */
    public final void mo93076d(FaceStickerBean faceStickerBean) {
        C52711k.m112240b(faceStickerBean, "sticker");
        if (faceStickerBean.getTags() != null) {
            if (C23777a.m58348a() && !C23780d.m58365a()) {
                this.f125276g.mo86558a(false, false);
            }
            if (!C23780d.m58365a()) {
                this.f125276g.mo86579e(!faceStickerBean.getTags().contains("disable_reshape"));
                this.f125276g.mo86577d(!faceStickerBean.getTags().contains("disable_smooth"));
            }
            faceStickerBean.getTags().contains("disable_beautify_filter");
        }
    }

    /* renamed from: a */
    public final void mo93073a(FaceStickerBean faceStickerBean) {
        boolean z;
        C52711k.m112240b(faceStickerBean, "sticker");
        if (!this.f125273d) {
            mo97789a();
            this.f125273d = true;
        }
        if (C46059g.m100071a("camera_front", faceStickerBean)) {
            if (m107876b().mo90316f() != 1) {
                C45004a aVar = this.f125275f;
                C47093m a = C47093m.m102238a();
                C52711k.m112236a((Object) a, "FrontRearChangeEvent.toFront()");
                aVar.mo91321a(a);
            }
        } else if (C46059g.m100071a("camera_back", faceStickerBean) && m107876b().mo90316f() != 0) {
            C45004a aVar2 = this.f125275f;
            C47093m b = C47093m.m102239b();
            C52711k.m112236a((Object) b, "FrontRearChangeEvent.toRear()");
            aVar2.mo91321a(b);
        }
        if (faceStickerBean == FaceStickerBean.NONE || !faceStickerBean.getTypes().contains("AR")) {
            z = false;
        } else {
            z = true;
        }
        this.f125275f.mo91355b(!z);
        if (faceStickerBean == FaceStickerBean.NONE || !faceStickerBean.getTypes().contains("StabilizationOff")) {
            if (!m107876b().f112404e.f56088b) {
                m107876b().f112404e.mo43401b(this.f125274e);
                this.f125275f.mo91323a(0);
            }
            this.f125270a.mo97826z().mo91269a(faceStickerBean, C45861d.m99711c(this.f125270a));
        } else if (m107876b().f112404e.f56088b) {
            m107876b().f112404e.mo43398a((Context) this.f125274e);
            this.f125275f.mo91323a(0);
        }
    }

    public C49993i(AppCompatActivity appCompatActivity, C45004a aVar, C42451a aVar2, C50048n nVar, C49683a aVar3, ShortVideoContext shortVideoContext, C50002h hVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(aVar, "cameraApi");
        C52711k.m112240b(aVar2, "beautyApi");
        C52711k.m112240b(nVar, "stickerApiComponent");
        C52711k.m112240b(aVar3, "filterApiComponent");
        C52711k.m112240b(shortVideoContext, "mVideoContext");
        C52711k.m112240b(hVar, "stickerHandledEventState");
        this.f125274e = appCompatActivity;
        this.f125275f = aVar;
        this.f125276g = aVar2;
        this.f125270a = nVar;
        this.f125277h = aVar3;
        this.f125278i = shortVideoContext;
        this.f125271b = hVar;
        this.f125270a.mo97822v().mo7349a(this.f125274e, new C2767k<Boolean>(this) {

            /* renamed from: a */
            final /* synthetic */ C49993i f125279a;

            {
                this.f125279a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    C49993i iVar = this.f125279a;
                    iVar.mo97789a();
                    C2765i b = iVar.f125271b.mo97792b();
                    C47336q qVar = new C47336q(0);
                    qVar.f119490b = false;
                    b.mo7350a(qVar);
                    return;
                }
                C49993i iVar2 = this.f125279a;
                iVar2.mo97789a();
                iVar2.f125270a.mo97826z().mo91268a(iVar2.f125270a.mo97798C());
                C2765i b2 = iVar2.f125271b.mo97792b();
                C47336q qVar2 = new C47336q(4);
                qVar2.f119490b = false;
                b2.mo7350a(qVar2);
                C43214dh a = C43214dh.m94817a();
                C52711k.m112236a((Object) a, "PublishManager.inst()");
                C43804f fVar = a.f109289d;
                if (fVar != null && !fVar.f110926c) {
                    FaceStickerBean C = iVar2.f125270a.mo97798C();
                    if (C == null || !TextUtils.equals(String.valueOf(C.getStickerId()), fVar.f110925b)) {
                        fVar.f110926c = true;
                    }
                }
            }
        });
    }
}
