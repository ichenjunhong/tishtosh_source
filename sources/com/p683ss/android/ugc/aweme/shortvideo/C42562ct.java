package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.C2756a;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.navigation.C12941c;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.navigation.NavigationScene$1;
import com.bytedance.scene.p841c.C12879k;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42434ax.C42436a;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43244d;
import com.p683ss.android.ugc.aweme.shortvideo.p2177b.C42443a;
import com.p683ss.android.ugc.aweme.shortvideo.p2177b.C42444b;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45098a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45099b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45101d;
import com.p683ss.android.ugc.aweme.shortvideo.transition.C44894b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.tools.C47063h;
import com.p683ss.android.ugc.aweme.tools.C47066k;
import com.p683ss.android.ugc.aweme.tools.C47323n;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.aweme.tools.C47338s;
import com.p683ss.android.ugc.aweme.tools.C47347v;
import com.p683ss.android.ugc.aweme.tools.C47349x;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.gamora.C48922a;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.C49745b;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49596h;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49960h;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.p2656d.C52958c;
import java.util.Collections;
import p2628d.C52668f;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ct */
public class C42562ct extends C43225dr implements C23423b, C42436a {

    /* renamed from: A */
    private C42443a f107644A;

    /* renamed from: k */
    public final C45004a f107645k;

    /* renamed from: l */
    final C49683a f107646l;

    /* renamed from: m */
    public View f107647m;

    /* renamed from: n */
    public ShortVideoContext f107648n;

    /* renamed from: o */
    C49607a f107649o;

    /* renamed from: p */
    RecordStatusViewModel f107650p;

    /* renamed from: q */
    SafeHandler f107651q = new SafeHandler(this);

    /* renamed from: v */
    private final C50048n f107652v;

    /* renamed from: w */
    private final C42451a f107653w;

    /* renamed from: x */
    private FrameLayout f107654x;

    /* renamed from: y */
    private C12361b f107655y;

    /* renamed from: z */
    private ASCameraView f107656z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ct$a */
    class C42571a implements C12941c {
        C42571a() {
        }

        /* renamed from: a */
        public final void mo24516a(C12924i iVar, C12924i iVar2, boolean z) {
            if (z) {
                if (iVar2 instanceof C49960h) {
                    C44894b.f113619a = true;
                    C42562ct.this.mo24464b((int) R.id.c_v).setVisibility(8);
                    C42562ct.this.f107647m.setVisibility(8);
                    C44894b.f113619a = false;
                }
            } else if (iVar instanceof C49960h) {
                C44894b.f113619a = true;
                C42562ct.this.f107647m.setVisibility(0);
                C42562ct.this.mo24464b((int) R.id.c_v).setVisibility(0);
                C44894b.f113619a = false;
            }
        }
    }

    public final boolean bK_() {
        if (!mo86792f()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final C43859a mo86793h() {
        return (C43859a) mo86790c().mo23374b(C43859a.class);
    }

    /* renamed from: c */
    public final C12361b mo86790c() {
        if (this.f107655y == null) {
            C52711k.m112240b(this, "$this$getObjectContainer");
            this.f107655y = C2756a.m7853a((C12896b) this).mo7332a();
        }
        return this.f107655y;
    }

    /* renamed from: d */
    public final C42443a mo86791d() {
        if (this.f107644A == null) {
            this.f107644A = new C42444b(mo87882I(), this, this.f107656z);
        }
        return this.f107644A;
    }

    /* renamed from: q */
    public final void mo24470q() {
        super.mo24470q();
        if (this.f107644A != null) {
            this.f107644A.mo86529a();
        }
        ((VideoRecordNewActivity) mo24477v()).f113779e.remove(this);
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        C45412b.m98979a().end("av_video_record_init", "PlanC onResume");
        C45101d.m98617a(C45099b.RECORD_ON_UI_SHOW);
    }

    /* renamed from: f */
    public final boolean mo86792f() {
        if (!getLifecycle().mo323a().isAtLeast(C0178b.CREATED)) {
            return false;
        }
        C49596h hVar = (C49596h) mo24388a("RecordBottomTabScene");
        if (hVar == null || !TextUtils.equals((CharSequence) hVar.mo97504J(), mo24461a((int) R.string.d5h))) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final void mo24468o() {
        super.mo24468o();
        Context s = mo24473s();
        if (s != null) {
            C22795c.m56157a(s);
            this.f107650p = (RecordStatusViewModel) C0214z.m440a(mo87882I()).mo359a(RecordStatusViewModel.class);
            return;
        }
        StringBuilder sb = new StringBuilder("Scene ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo86789a(boolean z) {
        C43244d dVar = (C43244d) mo86790c().mo23374b(C43244d.class);
        if (dVar != null) {
            dVar.mo87915b(z);
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        C48922a aVar;
        super.mo24448e(bundle);
        mo24479x().mo24460E().mo24561a("owner", this);
        mo24479x().mo24460E().mo24561a("safe_handler", this.f107651q);
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) this.f33840g_;
        C48923a aVar2 = new C48923a();
        C52711k.m112240b(this, "<set-?>");
        aVar2.f123085a = this;
        FragmentActivity I = mo87882I();
        C52711k.m112240b(I, "<set-?>");
        aVar2.f123087c = I;
        ShortVideoContext shortVideoContext = mo87883J().f107134a;
        C52711k.m112240b(shortVideoContext, "<set-?>");
        aVar2.f123088d = shortVideoContext;
        C20426a mediaController = videoRecordNewActivity.f113766E.mo91307M().getMediaController();
        C52711k.m112240b(mediaController, "<set-?>");
        aVar2.f123089e = mediaController;
        C20489b effectController = videoRecordNewActivity.f113766E.mo91307M().getEffectController();
        C52711k.m112240b(effectController, "<set-?>");
        aVar2.f123090f = effectController;
        C45004a aVar3 = videoRecordNewActivity.f113766E;
        C52711k.m112240b(aVar3, "<set-?>");
        aVar2.f123091g = aVar3;
        C432261 r3 = new C52668f<C50048n>(videoRecordNewActivity) {

            /* renamed from: a */
            final /* synthetic */ VideoRecordNewActivity f109320a;

            public final /* synthetic */ Object getValue() {
                return this.f109320a.mo91196f();
            }

            public final boolean isInitialized() {
                if (this.f109320a.mo91196f() != null) {
                    return true;
                }
                return false;
            }

            {
                this.f109320a = r2;
            }
        };
        C52711k.m112240b(r3, "<set-?>");
        aVar2.f123092h = r3;
        C42451a aVar4 = videoRecordNewActivity.f113767F;
        C52711k.m112240b(aVar4, "<set-?>");
        aVar2.f123093i = aVar4;
        videoRecordNewActivity.getClass();
        C43227ds dsVar = new C43227ds(videoRecordNewActivity);
        C52711k.m112240b(dsVar, "<set-?>");
        aVar2.f123094j = dsVar;
        aVar2.f123095k = this.f109317s;
        aVar2.f123096l = this.f109318t;
        C49683a e = videoRecordNewActivity.mo91195e();
        C52711k.m112240b(e, "<set-?>");
        aVar2.f123097m = e;
        C44885g gVar = videoRecordNewActivity.f113782h;
        C52711k.m112240b(gVar, "<set-?>");
        aVar2.f123098n = gVar;
        String str = "VideoRecordNewActivity";
        C52711k.m112240b(str, "<set-?>");
        aVar2.f123099o = str;
        mo24479x().mo24460E().mo24561a("record_env_context", aVar2);
        C12942d x = mo24479x();
        C42571a aVar5 = new C42571a();
        C12879k.m25799a();
        if (getLifecycle().mo323a() != C0178b.DESTROYED) {
            x.f33894p.add(aVar5);
            getLifecycle().mo324a(new NavigationScene$1(x, this, aVar5));
        }
        Object a = C27991b.m66756a(C48922a.class);
        if (a != null) {
            aVar = (C48922a) a;
        } else {
            aVar = (C48922a) C20302a.m50070a(C48922a.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        aVar.mo83693a(this, this);
        if (!C39618d.f101180u.mo74209a() && !this.f107648n.mo86362d()) {
            ((C49577b) mo86790c().mo23372a(C49577b.class)).mo97483a(false);
        }
        ((VideoRecordNewActivity) mo24477v()).cb_();
        this.f107654x.post(new C42572cu(this));
        this.f107645k.mo91373t().mo7349a(this, new C2767k<C47323n>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C42562ct.this.mo86791d().mo86533a((C47323n) obj);
            }
        });
        this.f107645k.mo91300F().mo7349a(this, new C2767k<Boolean>() {
            public final /* synthetic */ void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C42562ct.this.mo86791d().mo86534a(new C47336q(8, true));
                } else {
                    C42562ct.this.mo86791d().mo86534a(new C47336q(0, true));
                }
            }
        });
        this.f107645k.mo91375v().mo7349a(this, new C2767k<C47349x>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C42562ct.this.mo86791d().mo86537a((C47349x) obj);
                C42562ct.this.f107645k.mo91356b(C42562ct.this.mo87883J().f107134a.f107089ao, true);
                C42562ct.this.f107645k.mo91333a(new C47347v(4));
                C42562ct.this.mo86789a(true);
                C42562ct.this.f107650p.mo92167l().setValue(Boolean.valueOf(true));
            }
        });
        this.f107645k.mo91377x().mo7349a(this, new C2767k<C47351z>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C42562ct.this.mo86791d().mo86538a((C47351z) obj);
            }
        });
        this.f107645k.mo91347ag().mo7349a(this, new C2767k<C47063h>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C47063h hVar = (C47063h) obj;
                C42562ct.this.f107645k.mo91331a(C47337r.m102707a(Collections.emptyList(), 0, true));
                C42562ct.this.f107645k.mo91356b(C42562ct.this.f107648n.f107089ao, false);
                C42562ct.this.mo86789a(false);
            }
        });
        this.f107645k.mo91296B().mo7349a(this, new C2767k<C47066k>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C42562ct.this.mo86791d().mo86532a((C47066k) obj);
            }
        });
        this.f107645k.mo91297C().mo7349a(this, new C2767k<C52860x>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C52860x xVar = (C52860x) obj;
                C49850a aVar = (C49850a) C42562ct.this.mo86790c().mo23374b(C49850a.class);
                if (aVar != null) {
                    aVar.mo97680a(!C42562ct.this.f107648n.f107122o);
                }
                C42562ct.this.f107645k.mo91356b(C42562ct.this.f107648n.f107089ao, false);
                C42562ct.this.f107650p.mo92167l().setValue(Boolean.valueOf(false));
            }
        });
        this.f107645k.mo91299E().mo7352a(this, new C2767k<Boolean>() {
            public final /* synthetic */ void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C42562ct.this.mo86791d().mo86535a(new C47338s());
                    return;
                }
                C49860a aVar = (C49860a) ApiCenter.m7844a(C42562ct.this.mo87882I()).mo7341b(C49860a.class);
                if (aVar != null) {
                    aVar.mo97688a(false);
                }
            }
        });
        C50048n nVar = this.f107652v;
        nVar.mo97825y().mo97772a().mo7349a(this, new C43198cv(this));
        nVar.mo97823w().mo97829d().mo7349a(this, new C43199cw(this));
        ((C49745b) mo86790c().mo23372a(C49745b.class)).mo97626a().observe(this, new C43200cx(this));
    }

    /* renamed from: a */
    public final boolean mo48596a(int i, int i2, Intent intent) {
        C43859a h = mo86793h();
        if (h != null) {
            h.mo89396a(i, i2, intent);
        }
        return false;
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C45407ay.m98968a("planC => onCreateView start");
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.q2, viewGroup, false);
        this.f107654x = frameLayout;
        this.f107647m = frameLayout.findViewById(R.id.cfl);
        ((VideoRecordNewActivity) this.f33840g_).f113779e.add(this);
        C45101d.m98616a((C45098a) new C52958c());
        C45412b.m98979a().step("av_video_record_init", "PlanC onCreateView");
        C45407ay.m98968a("planC => onCreateView end");
        return frameLayout;
    }

    public C42562ct(ShortVideoContext shortVideoContext, Intent intent, ASCameraView aSCameraView, C12361b bVar) {
        this.f107648n = shortVideoContext;
        this.f107656z = aSCameraView;
        this.f107645k = (C45004a) bVar.mo23372a(C45004a.class);
        this.f107646l = (C49683a) bVar.mo23372a(C49683a.class);
        this.f107652v = (C50048n) bVar.mo23372a(C50048n.class);
        this.f107653w = (C42451a) bVar.mo23372a(C42451a.class);
    }
}
