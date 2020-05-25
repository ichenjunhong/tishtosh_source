package com.p683ss.android.ugc.aweme.shortvideo.cover;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.C1056u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45615l;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.C45568a;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.e */
public final class C42545e extends Fragment implements C45568a {

    /* renamed from: a */
    public ChooseVideoCoverViewV2 f107595a;

    /* renamed from: b */
    View f107596b;

    /* renamed from: c */
    View f107597c;

    /* renamed from: d */
    public ViewGroup f107598d;

    /* renamed from: e */
    public ViewGroup f107599e;

    /* renamed from: f */
    public ViewGroup f107600f;

    /* renamed from: g */
    C42542c f107601g;

    /* renamed from: h */
    SafeHandler f107602h;

    /* renamed from: i */
    public C42549a f107603i;

    /* renamed from: j */
    public float f107604j;

    /* renamed from: k */
    public boolean f107605k;

    /* renamed from: l */
    public C45547d f107606l;

    /* renamed from: m */
    public C0198r<Bitmap> f107607m;

    /* renamed from: n */
    public C0198r<Boolean> f107608n;

    /* renamed from: o */
    private boolean f107609o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.e$a */
    public interface C42549a {
        /* renamed from: a */
        C20347c mo86772a();

        /* renamed from: b */
        C0198r<C53030y> mo86773b();

        /* renamed from: c */
        VideoPublishEditModel mo86774c();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final void onDestroy() {
        if (this.f107595a.getAdapter() instanceof C45615l) {
            C45615l lVar = (C45615l) this.f107595a.getAdapter();
            if (lVar != null) {
                lVar.f115380a.dispose();
            }
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public final boolean mo86767a() {
        if (this.f107606l != null) {
            this.f107606l.dismiss();
        }
        this.f107602h.removeCallbacksAndMessages(null);
        this.f107603i.mo86773b().setValue(C53030y.m112774b());
        this.f107603i.mo86772a().mo43019a(true);
        this.f107603i.mo86773b().setValue(C53030y.m112772a());
        if (getFragmentManager() == null) {
            return false;
        }
        requireFragmentManager().mo2225a().mo2177a((Fragment) this).mo2195c();
        return true;
    }

    /* renamed from: d */
    private int m93438d(float f) {
        return (int) (((float) this.f107603i.mo86772a().mo43071k()) * f);
    }

    /* renamed from: a */
    public final void mo86765a(float f) {
        this.f107602h.removeCallbacksAndMessages(null);
        this.f107603i.mo86773b().setValue(C53030y.m112774b());
    }

    /* renamed from: b */
    public final void mo86769b(float f) {
        this.f107605k = true;
        this.f107603i.mo86773b().setValue(C53030y.m112773a((long) m93438d(f)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo86766a(long j) {
        this.f107603i.mo86773b().setValue(C53030y.m112774b());
        this.f107603i.mo86773b().setValue(C53030y.m112772a());
        this.f107602h.postDelayed(new C42551g(this, j), 1000);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C42549a) {
            this.f107603i = (C42549a) context;
            this.f107609o = C39618d.f101151O.mo83117a(C40796a.IsLowMemoryMachine);
            C23729p.m58263b((Activity) context);
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    /* renamed from: c */
    public final void mo86770c(float f) {
        this.f107605k = true;
        C53030y b = C53030y.m112775b((long) m93438d(f));
        this.f107603i.mo86773b().setValue(b);
        C26890h.m65011a("cover_click", C23089d.m56640a().mo47829a("creation_id", this.f107603i.mo86774c().creationId).mo47829a("shoot_way", this.f107603i.mo86774c().mShootWay).mo47826a("draft_id", this.f107603i.mo86774c().draftId).f61491a);
        if (this.f107601g != null) {
            mo86766a(b.f131508b);
        }
    }

    /* renamed from: a */
    public final boolean mo86768a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isMvThemeVideoType() || this.f107609o || videoPublishEditModel.isStatusVideoType()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.shortvideo.cover.c] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl] */
    /* JADX WARNING: type inference failed for: r1v9, types: [com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl] */
    /* JADX WARNING: type inference failed for: r1v12, types: [com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl] */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.shortvideo.cover.MvEffectVideoCoverGeneratorImpl] */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r1v20, types: [com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl] */
    /* JADX WARNING: type inference failed for: r1v21, types: [com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl] */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v16
      assigns: [com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl, com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl]
      uses: [com.ss.android.ugc.aweme.shortvideo.cover.c, com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl, com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl]
      mth insns count: 71
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onActivityCreated(r10)
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2 r10 = r9.f107595a
            r10.setOnScrollListener(r9)
            com.ss.android.ugc.aweme.shortvideo.cover.e$a r10 = r9.f107603i
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r10.mo86774c()
            boolean r0 = r9.mo86768a(r10)
            if (r0 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.shortvideo.cover.MvEffectVideoCoverGeneratorImpl r0 = new com.ss.android.ugc.aweme.shortvideo.cover.MvEffectVideoCoverGeneratorImpl
            com.ss.android.ugc.aweme.shortvideo.cover.e$a r1 = r9.f107603i
            com.ss.android.ugc.asve.c.c r1 = r1.mo86772a()
            if (r1 != 0) goto L_0x0020
            r1 = 0
            goto L_0x002a
        L_0x0020:
            com.ss.android.ugc.aweme.shortvideo.cover.e$a r1 = r9.f107603i
            com.ss.android.ugc.asve.c.c r1 = r1.mo86772a()
            int r1 = r1.mo43071k()
        L_0x002a:
            r0.<init>(r1)
            goto L_0x00aa
        L_0x002f:
            boolean r0 = r10.isMultiVideoEdit()
            if (r0 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.shortvideo.cover.e$a r0 = r9.f107603i
            com.ss.android.ugc.asve.c.c r0 = r0.mo86772a()
            int r5 = r0.mo43071k()
            com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl r0 = new com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl
            com.ss.android.ugc.aweme.shortvideo.cover.e$a r1 = r9.f107603i
            com.ss.android.ugc.asve.c.c r2 = r1.mo86772a()
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2 r1 = r9.f107595a
            int r4 = r1.getCoverSize()
            r6 = 0
            r1 = r0
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x00aa
        L_0x0054:
            com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.l r0 = r0.mo58574e()
            com.ss.android.ugc.aweme.property.l$a r1 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableUseVeCover
            boolean r0 = r0.mo83117a(r1)
            if (r0 != 0) goto L_0x0097
            boolean r0 = r10.isFastImport
            if (r0 == 0) goto L_0x0069
            goto L_0x0097
        L_0x0069:
            com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl r0 = new com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r3 = r10.mEffectList
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101144H
            com.ss.android.ugc.aweme.filter.c.a r1 = r1.mo58584o()
            com.ss.android.ugc.aweme.filter.c.c r1 = r1.mo64333c()
            int r2 = r10.mSelectedId
            com.ss.android.ugc.aweme.filter.g r1 = r1.mo64346b(r2)
            java.lang.String r4 = com.p683ss.android.ugc.aweme.filter.C31460h.m73281a(r1)
            float r5 = r10.mSelectedFilterIntensity
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2 r1 = r9.f107595a
            int r6 = r1.getCoverSize()
            boolean r7 = r10.isReverse()
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r8 = r10.getPreviewInfo()
            r1 = r0
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00aa
        L_0x0097:
            com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl r0 = new com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl
            com.ss.android.ugc.aweme.shortvideo.cover.e$a r1 = r9.f107603i
            com.ss.android.ugc.asve.c.c r1 = r1.mo86772a()
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2 r2 = r9.f107595a
            int r2 = r2.getCoverSize()
            java.lang.String r3 = "choose_cover"
            r0.<init>(r1, r9, r2, r3)
        L_0x00aa:
            r9.f107601g = r0
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2 r0 = r9.f107595a
            com.ss.android.ugc.aweme.shortvideo.cover.e$1 r1 = new com.ss.android.ugc.aweme.shortvideo.cover.e$1
            r1.<init>(r10)
            r0.post(r1)
            android.view.View r10 = r9.f107596b
            com.ss.android.ugc.aweme.shortvideo.cover.e$2 r0 = new com.ss.android.ugc.aweme.shortvideo.cover.e$2
            r0.<init>()
            r10.setOnClickListener(r0)
            android.view.View r10 = r9.f107597c
            com.ss.android.ugc.aweme.shortvideo.cover.e$3 r0 = new com.ss.android.ugc.aweme.shortvideo.cover.e$3
            r0.<init>()
            r10.setOnClickListener(r0)
            com.ss.android.ugc.aweme.shortvideo.SafeHandler r10 = new com.ss.android.ugc.aweme.shortvideo.SafeHandler
            r10.<init>(r9)
            r9.f107602h = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cover.C42545e.onActivityCreated(android.os.Bundle):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f107595a = (ChooseVideoCoverViewV2) C1056u.m3051d(view, R.id.tc);
        this.f107596b = C1056u.m3051d(view, R.id.d7w);
        this.f107597c = C1056u.m3051d(view, R.id.d7v);
        this.f107599e = (ViewGroup) C1056u.m3051d(view, R.id.dqc);
        this.f107598d = (ViewGroup) C1056u.m3051d(view, R.id.ao4);
        this.f107600f = (ViewGroup) C1056u.m3051d(view, R.id.ca9);
        C1056u.m3051d(view, R.id.drq).setOnTouchListener(C42550f.f107614a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fd, viewGroup, false);
    }
}
