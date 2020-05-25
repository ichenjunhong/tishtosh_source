package com.p683ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29167c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39567as;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.C43134r;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a.C44001a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a.C44002b;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45617m;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C45564a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.at */
final /* synthetic */ class C29118at implements Runnable {

    /* renamed from: a */
    private final C29094ad f76346a;

    C29118at(C29094ad adVar) {
        this.f76346a = adVar;
    }

    public final void run() {
        C29094ad adVar = this.f76346a;
        int frameHeight = adVar.f76309p.getFrameHeight();
        int frameWidth = adVar.f76309p.getFrameWidth();
        int ceil = (int) Math.ceil((double) (((float) (C9432q.m18670a((Context) adVar.f76269E) - (Math.round(C9432q.m18687b((Context) adVar.f76269E, 24.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
        if (adVar.f76295b.isMultiVideoEdit()) {
            ceil += 2;
        }
        adVar.f76309p.setCoverSize(ceil);
        adVar.f76312s = new VEVideoCoverGeneratorImpl(adVar.f76313t, adVar.f76269E, adVar.f76309p.getCoverSize(), "special_effects");
        adVar.f76315v = new C45617m(adVar.f76312s, frameWidth, frameHeight, ceil);
        if (adVar.f76295b.isMvThemeVideoType()) {
            C44001a aVar = new C44001a(frameWidth, frameHeight);
            adVar.f76309p.setAdapter(aVar);
            C44002b a = new C44002b().mo89835b(adVar.f76278N).mo89833a(adVar.f76277M).mo89832a(frameWidth, frameHeight);
            FragmentActivity fragmentActivity = adVar.f76269E;
            C20347c cVar = adVar.f76313t;
            aVar.getClass();
            a.mo89834a(fragmentActivity, cVar, ceil, new C29141ba(aVar));
            adVar.f76309p.setAdapter(aVar);
        } else {
            adVar.f76309p.setAdapter(new C45564a(adVar.f76315v, frameWidth, frameHeight));
        }
        if (adVar.f76313t == null) {
            C39567as E = C39629l.m88232a().mo58567E();
            StringBuilder sb = new StringBuilder("VEEffectHelper activity is finishing ");
            sb.append(adVar.f76269E.isFinishing());
            E.mo49425a(sb.toString());
            return;
        }
        int A = adVar.f76313t.mo42966A();
        adVar.f76311r = (CutMultiVideoViewModel) C0214z.m440a(adVar.f76269E).mo359a(CutMultiVideoViewModel.class);
        adVar.f76310q.setCanEdit(false);
        adVar.f76310q.setMinVideoLength(1000);
        adVar.f76310q.setMaxVideoLength((long) A);
        adVar.f76311r.f107677k = adVar.f76295b.isMvThemeVideoType();
        adVar.f76311r.f107678l = A;
        StringBuilder sb2 = new StringBuilder("initCutTimeView video duration is ");
        sb2.append(adVar.f76313t.mo43071k());
        C50203g.m108362c(sb2.toString());
        adVar.f76310q.setVeEditor(adVar.f76313t);
        List mediaModelList = adVar.f76295b.getMediaModelList();
        C43134r rVar = new C43134r();
        rVar.f108973b = false;
        C29167c cVar2 = new C29167c(adVar.f76269E, new C29114ap(adVar), new C29116ar(adVar), new C29117as(adVar));
        C52711k.m112240b(cVar2, "interceptor");
        rVar.f108972a.add(cVar2);
        adVar.f76310q.setViewConfig(rVar);
        adVar.f76310q.mo87550a(adVar.f76269E, adVar.f76311r, adVar.f76315v, mediaModelList);
        adVar.f76310q.setPointerType(2);
        adVar.f76310q.getVideoEditViewModel().f108911f.observe(adVar.f76301h, new C29106ah(adVar));
        adVar.f76310q.getVideoEditViewModel().f108916k.observe(adVar.f76301h, new C29107ai(adVar));
        adVar.f76310q.getVideoEditViewModel().f108914i.observe(adVar.f76301h, new C29108aj(adVar));
        adVar.f76310q.getVideoEditViewModel().f108915j.observe(adVar.f76301h, new C29109ak(adVar));
        adVar.f76310q.getVideoEditViewModel().f108912g.observe(adVar.f76301h, new C29110al(adVar));
        adVar.f76310q.getVideoEditViewModel().f108913h.observe(adVar.f76301h, new C29111am(adVar));
        adVar.f76310q.getVideoEditViewModel().f108908c.observe(adVar.f76301h, new C29112an(adVar));
        adVar.f76310q.getVideoEditViewModel().f108910e.observe(adVar.f76301h, new C29113ao(adVar));
        adVar.f76272H.mo59037a(A);
    }
}
