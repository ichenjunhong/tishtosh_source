package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2201e;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43691c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43692d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43698c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43699d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43702a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43703b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43704c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43705d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43706e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43707f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43708g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43709h;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43710i;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43711j;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43712k;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43713l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43714m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43715n;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43716o;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43701e.C43717p;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43719f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43719f.C43722c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43719f.C43723d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d.C43731g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C43744a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C52904aa.C52905a;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.e.a */
public final class C43740a extends C12924i {

    /* renamed from: j */
    public static final C43741a f110742j = new C43741a(null);

    /* renamed from: i */
    public C43719f f110743i = new C43719f();

    /* renamed from: k */
    private VEVideoPublishEditViewModel f110744k;

    /* renamed from: l */
    private final int f110745l = 52;

    /* renamed from: m */
    private final int f110746m = 242;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.e.a$a */
    public static final class C43741a {
        private C43741a() {
        }

        public /* synthetic */ C43741a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.e.a$b */
    static final class C43742b implements OnClickListener {

        /* renamed from: a */
        public static final C43742b f110747a = new C43742b();

        C43742b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: d */
    private final int m96064d() {
        return (int) C9432q.m18687b((Context) this.f33840g_, (float) this.f110745l);
    }

    /* renamed from: f */
    private final int m96065f() {
        return (int) C9432q.m18687b((Context) this.f33840g_, (float) this.f110746m);
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        this.f110743i.mo89159b(true);
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        this.f110743i.mo89159b(false);
    }

    /* renamed from: c */
    public final void mo89204c() {
        C43719f fVar = this.f110743i;
        if (fVar.f110696l) {
            C43744a aVar = fVar.f110691g;
            if (aVar == null) {
                C52711k.m112237a("viewManager");
            }
            aVar.mo89222b(true);
        }
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        C43719f fVar = this.f110743i;
        if (fVar.f110696l) {
            C43744a aVar = fVar.f110691g;
            if (aVar == null) {
                C52711k.m112237a("viewManager");
            }
            aVar.mo89233l();
            fVar.f110693i.f110725c.mo89131a();
        }
        fVar.f110696l = false;
    }

    /* renamed from: h */
    private final int m96066h() {
        return (((C43303dy.m94974e(this.f33840g_) - m96064d()) - m96065f()) - C43303dy.m94972c(this.f33840g_)) - C43303dy.m94973d(this.f33840g_);
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f110744k = (VEVideoPublishEditViewModel) a;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo89202a(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        if (videoPublishEditModel != null) {
            multiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        } else {
            multiEditVideoRecordData = null;
        }
        if (multiEditVideoRecordData != null && !C9190h.m18253a(videoPublishEditModel.getCurMultiEditVideoRecordData().segmentDataList)) {
            videoPublishEditModel.copyMultiEditMusicInfo();
            C43719f fVar = this.f110743i;
            C52711k.m112240b(videoPublishEditModel, "model");
            if (!fVar.f110696l) {
                fVar.f110697m = videoPublishEditModel;
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                if (multiEditVideoStatusRecordData != null) {
                    multiEditVideoRecordData2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                } else {
                    multiEditVideoRecordData2 = null;
                }
                if (multiEditVideoRecordData2 != null && !C9190h.m18253a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
                    if (multiEditVideoStatusRecordData.originalSegments != null) {
                        ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.originalSegments;
                        C52711k.m112236a((Object) arrayList, "recordData.originalSegments");
                        fVar.f110704t = arrayList;
                        ArrayList<TimeSpeedModelExtension> arrayList2 = multiEditVideoStatusRecordData.restoreSegments;
                        if (arrayList2 == null) {
                            ArrayList<TimeSpeedModelExtension> arrayList3 = fVar.f110704t;
                            if (arrayList3 == null) {
                                C52711k.m112237a("originalRecordSegments");
                            }
                            arrayList2 = new ArrayList<>(arrayList3);
                        }
                        fVar.f110705u = arrayList2;
                        ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoStatusRecordData.editSegments;
                        if (arrayList4 == null) {
                            ArrayList<TimeSpeedModelExtension> arrayList5 = fVar.f110705u;
                            if (arrayList5 == null) {
                                C52711k.m112237a("restoreRecordSegments");
                            }
                            arrayList4 = new ArrayList<>(arrayList5);
                        }
                        fVar.f110706v = arrayList4;
                        ArrayList<TimeSpeedModelExtension> arrayList6 = multiEditVideoStatusRecordData.singleRestoreSegments;
                        if (arrayList6 == null) {
                            ArrayList<TimeSpeedModelExtension> arrayList7 = fVar.f110705u;
                            if (arrayList7 == null) {
                                C52711k.m112237a("restoreRecordSegments");
                            }
                            arrayList6 = new ArrayList<>(arrayList7);
                        }
                        fVar.f110707w = arrayList6;
                        if (multiEditVideoStatusRecordData.segmentSizeChange) {
                            ArrayList<TimeSpeedModelExtension> arrayList8 = fVar.f110706v;
                            if (arrayList8 == null) {
                                C52711k.m112237a("editSegments");
                            }
                            fVar.f110707w = arrayList8;
                        }
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData3 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                    C52711k.m112236a((Object) multiEditVideoRecordData3, "recordData.curMultiEditVideoRecordData");
                    fVar.f110698n = multiEditVideoRecordData3;
                    fVar.f110702r = multiEditVideoStatusRecordData.recordMusic;
                    fVar.f110703s = multiEditVideoStatusRecordData.originalMusicStart;
                    if (multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData == null) {
                        fVar.f110699o = C43684d.m95970a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, null);
                    } else {
                        MultiEditVideoRecordData multiEditVideoRecordData4 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
                        C52711k.m112236a((Object) multiEditVideoRecordData4, "recordData.restoreMultiEditVideoRecordData");
                        fVar.f110699o = multiEditVideoRecordData4;
                    }
                    if (multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData == null) {
                        fVar.f110701q = C43684d.m95970a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, null);
                    } else {
                        fVar.f110701q = multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData;
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData5 = fVar.f110698n;
                    if (multiEditVideoRecordData5 == null) {
                        C52711k.m112237a("curRecordData");
                    }
                    fVar.f110700p = C43684d.m95970a(multiEditVideoRecordData5, null);
                    MultiEditVideoRecordData multiEditVideoRecordData6 = fVar.f110700p;
                    if (multiEditVideoRecordData6 == null) {
                        C52711k.m112237a("originRecordData");
                    }
                    multiEditVideoRecordData6.resetTimeData();
                    C43698c cVar = fVar.f110678A;
                    MultiEditVideoRecordData multiEditVideoRecordData7 = fVar.f110698n;
                    if (multiEditVideoRecordData7 == null) {
                        C52711k.m112237a("curRecordData");
                    }
                    cVar.mo89136a(multiEditVideoRecordData7);
                    fVar.f110678A.f110641g = multiEditVideoStatusRecordData.isMultiEditRetake;
                    fVar.f110678A.f110642h = multiEditVideoStatusRecordData.segmentSizeChange;
                    fVar.f110678A.f110643i = multiEditVideoStatusRecordData.currentEditIndex;
                    fVar.mo89160c();
                    fVar.mo89158b();
                    C43731g gVar = fVar.f110693i;
                    C43744a aVar = fVar.f110691g;
                    if (aVar == null) {
                        C52711k.m112237a("viewManager");
                    }
                    C52711k.m112240b(aVar, "viewManager");
                    gVar.f110723a = aVar;
                    C43731g gVar2 = fVar.f110693i;
                    C43692d dVar = new C43723d(fVar);
                    C52711k.m112240b(dVar, "listener");
                    gVar2.f110724b = dVar;
                    C43701e eVar = fVar.f110694j;
                    VEVideoCutterViewModel vEVideoCutterViewModel = fVar.f110687c;
                    if (vEVideoCutterViewModel == null) {
                        C52711k.m112237a("veVideoCutterViewModel");
                    }
                    CutMultiVideoViewModel cutMultiVideoViewModel = fVar.f110685a;
                    if (cutMultiVideoViewModel == null) {
                        C52711k.m112237a("cutMultiVideoViewModel");
                    }
                    VideoEditViewModel videoEditViewModel = fVar.f110686b;
                    if (videoEditViewModel == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    C43699d dVar2 = fVar.f110692h;
                    C43744a aVar2 = fVar.f110691g;
                    if (aVar2 == null) {
                        C52711k.m112237a("viewManager");
                    }
                    C52711k.m112240b(vEVideoCutterViewModel, "veVideoCutterViewModel");
                    C52711k.m112240b(cutMultiVideoViewModel, "cutterViewModel");
                    C52711k.m112240b(videoEditViewModel, "videoEditViewModel");
                    C52711k.m112240b(dVar2, "editorPresenter");
                    C52711k.m112240b(aVar2, "viewManager");
                    eVar.f110649a = vEVideoCutterViewModel;
                    eVar.f110651c = cutMultiVideoViewModel;
                    eVar.f110652d = videoEditViewModel;
                    eVar.f110650b = dVar2;
                    eVar.f110654f = aVar2;
                    C43701e eVar2 = fVar.f110694j;
                    C43691c cVar2 = new C43722c(fVar);
                    C52711k.m112240b(cVar2, "listener");
                    eVar2.f110653e = cVar2;
                    C43701e eVar3 = fVar.f110694j;
                    FragmentActivity fragmentActivity = fVar.f110689e;
                    if (fragmentActivity == null) {
                        C52711k.m112237a("activity");
                    }
                    C52711k.m112240b(fragmentActivity, "activity");
                    VEVideoCutterViewModel vEVideoCutterViewModel2 = eVar3.f110649a;
                    if (vEVideoCutterViewModel2 == null) {
                        C52711k.m112237a("veVideoCutterViewModel");
                    }
                    C0184k kVar = fragmentActivity;
                    vEVideoCutterViewModel2.mo87730a().observe(kVar, new C43702a(eVar3));
                    CutMultiVideoViewModel cutMultiVideoViewModel2 = eVar3.f110651c;
                    if (cutMultiVideoViewModel2 == null) {
                        C52711k.m112237a("cutMultiVideoViewModel");
                    }
                    cutMultiVideoViewModel2.f107667a.observe(kVar, new C43710i(eVar3));
                    CutMultiVideoViewModel cutMultiVideoViewModel3 = eVar3.f110651c;
                    if (cutMultiVideoViewModel3 == null) {
                        C52711k.m112237a("cutMultiVideoViewModel");
                    }
                    cutMultiVideoViewModel3.f107676j.observe(kVar, new C43711j(eVar3));
                    VideoEditViewModel videoEditViewModel2 = eVar3.f110652d;
                    if (videoEditViewModel2 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel2.f108927v = new C43712k(eVar3);
                    VideoEditViewModel videoEditViewModel3 = eVar3.f110652d;
                    if (videoEditViewModel3 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel3.f108920o.observe(kVar, new C43713l(eVar3));
                    VideoEditViewModel videoEditViewModel4 = eVar3.f110652d;
                    if (videoEditViewModel4 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel4.f108921p.observe(kVar, new C43714m(eVar3));
                    VideoEditViewModel videoEditViewModel5 = eVar3.f110652d;
                    if (videoEditViewModel5 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel5.f108922q.observe(kVar, new C43715n(eVar3));
                    VideoEditViewModel videoEditViewModel6 = eVar3.f110652d;
                    if (videoEditViewModel6 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel6.f108923r.observe(kVar, new C43716o(eVar3));
                    VideoEditViewModel videoEditViewModel7 = eVar3.f110652d;
                    if (videoEditViewModel7 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel7.f108907b.observe(kVar, new C43717p(eVar3));
                    VideoEditViewModel videoEditViewModel8 = eVar3.f110652d;
                    if (videoEditViewModel8 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel8.f108908c.observe(kVar, new C43703b(eVar3));
                    VideoEditViewModel videoEditViewModel9 = eVar3.f110652d;
                    if (videoEditViewModel9 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel9.f108910e.observe(kVar, new C43704c(eVar3));
                    VideoEditViewModel videoEditViewModel10 = eVar3.f110652d;
                    if (videoEditViewModel10 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel10.f108912g.observe(kVar, new C43705d(eVar3));
                    VideoEditViewModel videoEditViewModel11 = eVar3.f110652d;
                    if (videoEditViewModel11 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel11.f108911f.observe(kVar, new C43706e(eVar3));
                    VideoEditViewModel videoEditViewModel12 = eVar3.f110652d;
                    if (videoEditViewModel12 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel12.f108913h.observe(kVar, new C43707f(eVar3));
                    VideoEditViewModel videoEditViewModel13 = eVar3.f110652d;
                    if (videoEditViewModel13 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel13.f108916k.observe(kVar, new C43708g(eVar3));
                    VideoEditViewModel videoEditViewModel14 = eVar3.f110652d;
                    if (videoEditViewModel14 == null) {
                        C52711k.m112237a("videoEditViewModel");
                    }
                    videoEditViewModel14.f108917l.observe(kVar, new C43709h(eVar3));
                    if (multiEditVideoStatusRecordData.currentEditIndex >= 0 && !multiEditVideoStatusRecordData.segmentSizeChange) {
                        C43731g gVar3 = fVar.f110693i;
                        FragmentActivity fragmentActivity2 = fVar.f110689e;
                        if (fragmentActivity2 == null) {
                            C52711k.m112237a("activity");
                        }
                        VideoEditViewModel videoEditViewModel15 = fVar.f110686b;
                        if (videoEditViewModel15 == null) {
                            C52711k.m112237a("videoEditViewModel");
                        }
                        gVar3.mo89173a(fragmentActivity2, (VideoSegment) videoEditViewModel15.mo87634l().get(multiEditVideoStatusRecordData.currentEditIndex), multiEditVideoStatusRecordData.currentEditIndex);
                        fVar.mo89154a(multiEditVideoStatusRecordData.currentEditIndex);
                    }
                    fVar.f110696l = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C23441t tVar;
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.bjr, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.etx);
        C43719f fVar = this.f110743i;
        Activity activity = this.f33840g_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            C52711k.m112236a((Object) frameLayout, "contentView");
            View view = frameLayout;
            C52711k.m112240b(fragmentActivity, "activity");
            C52711k.m112240b(view, "rootView");
            fVar.f110689e = fragmentActivity;
            fVar.f110690f = view;
            JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            fVar.f110688d = (EditViewModel) a;
            C0209x a2 = C0214z.m440a(fragmentActivity).mo359a(VideoEditViewModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            fVar.f110686b = (VideoEditViewModel) a2;
            C0209x a3 = C0214z.m440a(fragmentActivity).mo359a(CutMultiVideoViewModel.class);
            C52711k.m112236a((Object) a3, "ViewModelProviders.of(ac…deoViewModel::class.java)");
            fVar.f110685a = (CutMultiVideoViewModel) a3;
            C0209x a4 = C0214z.m440a(fragmentActivity).mo359a(VEVideoCutterViewModel.class);
            C52711k.m112236a((Object) a4, "ViewModelProviders.of(ac…terViewModel::class.java)");
            fVar.f110687c = (VEVideoCutterViewModel) a4;
            if (fragmentActivity instanceof C23441t) {
                tVar = (C23441t) fragmentActivity;
            } else {
                tVar = null;
            }
            fVar.f110679B = tVar;
            frameLayout.setVisibility(8);
            frameLayout.setOnClickListener(C43742b.f110747a);
            C52711k.m112236a((Object) inflate, "rootView");
            return inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo89203a(boolean z, boolean z2, VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        boolean z3 = z2;
        if (videoPublishEditModel != null) {
            videoPublishEditModel.copyMultiEditMusicInfo();
        }
        if (z3) {
            C43682b bVar = C43682b.f110613f;
            boolean a = this.f110743i.mo89157a();
            String str3 = "enter_trim_page";
            C23089d c = C43682b.m95953c();
            String str4 = "is_warn_shown";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            C23089d a2 = c.mo47829a(str4, str);
            String str5 = "segment_type";
            if (a) {
                str2 = "single";
            } else {
                str2 = "multiple";
            }
            C26890h.m65011a(str3, a2.mo47829a(str5, str2).f61491a);
        }
        if (this.f110743i.mo89157a()) {
            this.f110743i.mo89156a(z3);
            return;
        }
        if (z3) {
            if (videoPublishEditModel == null) {
                C52711k.m112234a();
            }
            if (videoPublishEditModel.isRetakeVideo()) {
                this.f110743i.mo89156a(z3);
                return;
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f110744k;
            if (vEVideoPublishEditViewModel == null) {
                C52711k.m112237a("publishEditViewModel");
            }
            C0198r g = vEVideoPublishEditViewModel.mo110462g();
            C52711k.m112236a((Object) g, "publishEditViewModel.videoPreviewScaleOpChangeV2");
            g.setValue(C52905a.m112589a(C52904aa.f131229l, C46788b.f118235d.mo94007a(true, false, false, false, false), C43303dy.m94972c(this.f33840g_) + m96064d(), m96065f(), m96066h(), C22452a.m55498d(), 0, false, false, false, false, 960, null));
        } else {
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f110744k;
            if (vEVideoPublishEditViewModel2 == null) {
                C52711k.m112237a("publishEditViewModel");
            }
            C0198r g2 = vEVideoPublishEditViewModel2.mo110462g();
            C52711k.m112236a((Object) g2, "publishEditViewModel.videoPreviewScaleOpChangeV2");
            g2.setValue(C52905a.m112586a(mo24478w().getColor(R.color.ip), m96064d() + C43303dy.m94972c(this.f33840g_), m96065f(), m96066h(), C22452a.m55498d(), 0));
        }
        this.f110743i.mo89156a(z3);
    }
}
