package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.graphics.Bitmap;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29200c;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.gamora.editor.EditPreviewViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C52906ab;
import dmt.p2652av.video.C52967f;
import dmt.p2652av.video.C52970h;
import dmt.p2652av.video.C53026u;
import dmt.p2652av.video.C53030y;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.k */
public final class C29206k implements C29200c {

    /* renamed from: a */
    private final VEVideoPublishEditViewModel f76510a;

    /* renamed from: b */
    private final EditViewModel f76511b;

    /* renamed from: c */
    private final EditPreviewViewModel f76512c;

    /* renamed from: d */
    private final FragmentActivity f76513d;

    /* renamed from: a */
    public final FragmentActivity mo59091a() {
        return this.f76513d;
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo59092b() {
        return this.f76511b.mo97035e();
    }

    /* renamed from: c */
    public final C0198r<Boolean> mo59093c() {
        return this.f76512c.mo96925f();
    }

    /* renamed from: d */
    public final C0198r<Bitmap> mo59094d() {
        return this.f76512c.mo96926g();
    }

    /* renamed from: e */
    public final C0198r<C20347c> mo59095e() {
        return this.f76511b.mo97038h();
    }

    /* renamed from: n */
    public final C0198r<Boolean> mo59104n() {
        return this.f76511b.mo97039i();
    }

    /* renamed from: f */
    public final C0198r<VEVolumeChangeOp> mo59096f() {
        C0198r<VEVolumeChangeOp> m = this.f76510a.mo110468m();
        C52711k.m112236a((Object) m, "publishEditViewModel.volumeChangeOpLiveData");
        return m;
    }

    /* renamed from: g */
    public final C0198r<Boolean> mo59097g() {
        C0198r<Boolean> h = this.f76510a.mo110463h();
        C52711k.m112236a((Object) h, "publishEditViewModel.reverseReadyLiveData");
        return h;
    }

    /* renamed from: h */
    public final ArrayList<EffectPointModel> mo59098h() {
        ArrayList<EffectPointModel> arrayList = this.f76510a.f131145a;
        C52711k.m112236a((Object) arrayList, "publishEditViewModel.effectPointModelStack");
        return arrayList;
    }

    /* renamed from: i */
    public final C52967f<C53026u> mo59099i() {
        C52967f<C53026u> j = this.f76510a.mo110465j();
        C52711k.m112236a((Object) j, "publishEditViewModel.filterEffectOpLiveData");
        return j;
    }

    /* renamed from: j */
    public final C0198r<C53030y> mo59100j() {
        C0198r<C53030y> k = this.f76510a.mo110466k();
        C52711k.m112236a((Object) k, "publishEditViewModel.previewControlLiveData");
        return k;
    }

    /* renamed from: k */
    public final C0198r<Boolean> mo59101k() {
        C0198r<Boolean> o = this.f76510a.mo110470o();
        C52711k.m112236a((Object) o, "publishEditViewModel.reverseLiveData");
        return o;
    }

    /* renamed from: l */
    public final C0198r<C52904aa> mo59102l() {
        C0198r<C52904aa> g = this.f76510a.mo110462g();
        C52711k.m112236a((Object) g, "publishEditViewModel.videoPreviewScaleOpChangeV2");
        return g;
    }

    /* renamed from: m */
    public final C52970h<C52906ab> mo59103m() {
        C52970h<C52906ab> l = this.f76510a.mo110467l();
        C52711k.m112236a((Object) l, "publishEditViewModel.timeEffectOpLiveData");
        return l;
    }

    public C29206k(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f76513d = fragmentActivity;
        C0209x a = C0214z.m440a(this.f76513d).mo359a(VEVideoPublishEditViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
        this.f76510a = (VEVideoPublishEditViewModel) a;
        JediViewModel a2 = C48927d.m105736a(this.f76513d).mo96760a(EditViewModel.class);
        C52711k.m112236a((Object) a2, "JediViewModelProviders.o…ditViewModel::class.java)");
        this.f76511b = (EditViewModel) a2;
        JediViewModel a3 = C48927d.m105736a(this.f76513d).mo96760a(EditPreviewViewModel.class);
        C52711k.m112236a((Object) a3, "JediViewModelProviders.o…iewViewModel::class.java)");
        this.f76512c = (EditPreviewViewModel) a3;
    }
}
