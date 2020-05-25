package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43944p;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43944p.C43948a;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43944p.C43949b;
import com.p683ss.android.ugc.gamora.editor.p2461c.C49339a;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.ck */
public final class C49368ck extends C12924i implements C49548a {

    /* renamed from: n */
    public static final C49369a f123929n = new C49369a(null);

    /* renamed from: i */
    public EditViewModel f123930i;

    /* renamed from: j */
    public VEVideoPublishEditViewModel f123931j;

    /* renamed from: k */
    public VideoPublishEditModel f123932k;

    /* renamed from: l */
    public EditStickerViewModel f123933l;

    /* renamed from: m */
    public C43944p f123934m;

    /* renamed from: o */
    private EditVolumeViewModel f123935o;

    /* renamed from: p */
    private ViewGroup f123936p;

    /* renamed from: com.ss.android.ugc.gamora.editor.ck$a */
    public static final class C49369a {
        private C49369a() {
        }

        public /* synthetic */ C49369a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ck$b */
    static final class C49370b extends C52712l implements C52682m<C49548a, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49368ck f123937a;

        C49370b(C49368ck ckVar) {
            this.f123937a = ckVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(str, "it");
            TextView textView = C49368ck.m106459c(this.f123937a).f111269c;
            C52711k.m112236a((Object) textView, "volumeHelper.mMusicTv");
            textView.setText(str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ck$c */
    static final class C49371c extends C52712l implements C52682m<C49548a, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49368ck f123938a;

        C49371c(C49368ck ckVar) {
            this.f123938a = ckVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj2;
            C52711k.m112240b((C49548a) obj, "$receiver");
            C52711k.m112240b(str, "it");
            TextView textView = C49368ck.m106459c(this.f123938a).f111268b;
            C52711k.m112236a((Object) textView, "volumeHelper.mPeopleVoiceTv");
            textView.setText(str);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ck$d */
    static final class C49372d extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49368ck f123939a;

        C49372d(C49368ck ckVar) {
            this.f123939a = ckVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            C49368ck.m106459c(this.f123939a).mo89498a(intValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ck$e */
    static final class C49373e implements C43948a {

        /* renamed from: a */
        final /* synthetic */ C49368ck f123940a;

        C49373e(C49368ck ckVar) {
            this.f123940a = ckVar;
        }

        /* renamed from: a */
        public final void mo89514a(float f, float f2) {
            if ((!C49368ck.m106457a(this.f123940a).isFastImport && !C49368ck.m106457a(this.f123940a).isCutSameVideoType() && !C49368ck.m106457a(this.f123940a).hasOriginalSound()) || C49368ck.m106457a(this.f123940a).isMuted) {
                C49368ck.m106458b(this.f123940a).mo110468m().setValue(VEVolumeChangeOp.ofMusic(f2));
            } else if (C49368ck.m106457a(this.f123940a).isStitchMode()) {
                C49339a.m106426a(f, f2, C49368ck.m106457a(this.f123940a), C49368ck.m106458b(this.f123940a));
            } else {
                C49368ck.m106458b(this.f123940a).mo110468m().setValue(VEVolumeChangeOp.ofVoice(f));
                if (C49368ck.m106457a(this.f123940a).mMusicPath != null) {
                    C49368ck.m106458b(this.f123940a).mo110468m().setValue(VEVolumeChangeOp.ofMusic(f2));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ck$f */
    static final class C49374f implements C43949b {

        /* renamed from: a */
        final /* synthetic */ C49368ck f123941a;

        C49374f(C49368ck ckVar) {
            this.f123941a = ckVar;
        }

        /* renamed from: a */
        public final void mo89515a() {
            C49368ck.m106457a(this.f123941a).voiceVolume = ((float) C49368ck.m106459c(this.f123941a).f111271e) / 100.0f;
            C49368ck.m106457a(this.f123941a).musicVolume = ((float) C49368ck.m106459c(this.f123941a).f111270d) / 100.0f;
            C49368ck.m106459c(this.f123941a).mo89506d(false);
            EditViewModel editViewModel = this.f123941a.f123930i;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            editViewModel.mo97033a(true, false, true);
            EditStickerViewModel editStickerViewModel = this.f123941a.f123933l;
            if (editStickerViewModel == null) {
                C52711k.m112237a("stickerViewModel");
            }
            editStickerViewModel.mo96968g().setValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0.hasOriginalSound() != false) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e2  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97301F() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123932k
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            boolean r0 = r0.isFastImport
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x002d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123932k
            if (r0 != 0) goto L_0x0018
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0018:
            boolean r0 = r0.isCutSameVideoType()
            if (r0 != 0) goto L_0x002d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123932k
            if (r0 != 0) goto L_0x0027
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0027:
            boolean r0 = r0.hasOriginalSound()
            if (r0 == 0) goto L_0x003a
        L_0x002d:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123932k
            if (r0 != 0) goto L_0x0036
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0036:
            boolean r0 = r0.isMuted
            if (r0 == 0) goto L_0x004b
        L_0x003a:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r9.f123934m
            if (r0 != 0) goto L_0x0043
            java.lang.String r3 = "volumeHelper"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0043:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r0.mo89505c(r2)
            r0.mo89504b(r1)
            goto L_0x009c
        L_0x004b:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f123932k
            if (r0 != 0) goto L_0x0054
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0054:
            boolean r0 = r0.isStitchMode()
            if (r0 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r9.f123934m
            if (r0 != 0) goto L_0x0063
            java.lang.String r1 = "volumeHelper"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0063:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r0.mo89505c(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f123932k
            if (r1 != 0) goto L_0x0070
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0070:
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r1 = r1.stitchParams
            if (r1 == 0) goto L_0x0079
            boolean r1 = r1.getEnableMic()
            goto L_0x007a
        L_0x0079:
            r1 = 1
        L_0x007a:
            r0.mo89504b(r1)
            goto L_0x009c
        L_0x007e:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r9.f123934m
            if (r0 != 0) goto L_0x0087
            java.lang.String r3 = "volumeHelper"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0087:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f123932k
            if (r3 != 0) goto L_0x0090
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0090:
            java.lang.String r3 = r3.mMusicPath
            if (r3 == 0) goto L_0x0095
            r1 = 1
        L_0x0095:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r0.mo89505c(r1)
            r0.mo89504b(r2)
        L_0x009c:
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r9.f123934m
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = "volumeHelper"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00a5:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f123932k
            if (r1 != 0) goto L_0x00ae
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00ae:
            float r1 = r1.musicVolume
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            r0.mo89498a(r1)
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r9.f123934m
            if (r0 != 0) goto L_0x00c1
            java.lang.String r1 = "volumeHelper"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00c1:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f123932k
            if (r1 != 0) goto L_0x00ca
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00ca:
            float r1 = r1.voiceVolume
            float r1 = r1 * r3
            int r1 = (int) r1
            r0.mo89503b(r1)
            com.ss.android.ugc.aweme.shortvideo.k.p r0 = r9.f123934m
            if (r0 != 0) goto L_0x00db
            java.lang.String r1 = "volumeHelper"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00db:
            r0.mo89506d(r2)
            com.ss.android.ugc.gamora.editor.EditViewModel r3 = r9.f123930i
            if (r3 != 0) goto L_0x00e7
            java.lang.String r0 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00e7:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 4
            r8 = 0
            r3.mo97033a(r4, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49368ck.mo97301F():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m106457a(C49368ck ckVar) {
        VideoPublishEditModel videoPublishEditModel = ckVar.f123932k;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoPublishEditViewModel m106458b(C49368ck ckVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = ckVar.f123931j;
        if (vEVideoPublishEditViewModel == null) {
            C52711k.m112237a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ C43944p m106459c(C49368ck ckVar) {
        C43944p pVar = ckVar.f123934m;
        if (pVar == null) {
            C52711k.m112237a("volumeHelper");
        }
        return pVar;
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        String str;
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f123930i = (EditViewModel) a;
            C0209x a2 = C0214z.m440a(fragmentActivity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a2, "ViewModelProviders.of(fr…ditViewModel::class.java)");
            this.f123931j = (VEVideoPublishEditViewModel) a2;
            JediViewModel a3 = C48927d.m105736a(fragmentActivity).mo96760a(EditVolumeViewModel.class);
            C52711k.m112236a((Object) a3, "JediViewModelProviders.o…umeViewModel::class.java)");
            this.f123935o = (EditVolumeViewModel) a3;
            EditViewModel editViewModel = this.f123930i;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            this.f123932k = editViewModel.mo97035e();
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditStickerViewModel.class);
                C52711k.m112236a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java)");
                this.f123933l = (EditStickerViewModel) a4;
                this.f123934m = new C43944p();
                C23441t tVar = null;
                if (this.f33840g_ instanceof C23441t) {
                    Activity activity3 = this.f33840g_;
                    if (activity3 != null) {
                        tVar = (C23441t) activity3;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
                    }
                }
                C43944p pVar = this.f123934m;
                if (pVar == null) {
                    C52711k.m112237a("volumeHelper");
                }
                Activity activity4 = this.f33840g_;
                if (activity4 != null) {
                    pVar.mo89500a((FragmentActivity) activity4, tVar);
                    C43944p pVar2 = this.f123934m;
                    if (pVar2 == null) {
                        C52711k.m112237a("volumeHelper");
                    }
                    ViewGroup viewGroup = this.f123936p;
                    if (viewGroup == null) {
                        C52711k.m112237a("volumeLayout");
                    }
                    pVar2.f111267a = viewGroup;
                    C43944p pVar3 = this.f123934m;
                    if (pVar3 == null) {
                        C52711k.m112237a("volumeHelper");
                    }
                    VideoPublishEditModel videoPublishEditModel = this.f123932k;
                    if (videoPublishEditModel == null) {
                        C52711k.m112237a("mModel");
                    }
                    pVar3.mo89501a(videoPublishEditModel.isMuted);
                    C43944p pVar4 = this.f123934m;
                    if (pVar4 == null) {
                        C52711k.m112237a("volumeHelper");
                    }
                    pVar4.mo89499a();
                    C43944p pVar5 = this.f123934m;
                    if (pVar5 == null) {
                        C52711k.m112237a("volumeHelper");
                    }
                    pVar5.f111273g = new C49373e(this);
                    C43944p pVar6 = this.f123934m;
                    if (pVar6 == null) {
                        C52711k.m112237a("volumeHelper");
                    }
                    pVar6.f111274h = new C49374f(this);
                    EditVolumeViewModel editVolumeViewModel = this.f123935o;
                    if (editVolumeViewModel == null) {
                        C52711k.m112237a("mVolumeViewModel");
                    }
                    mo49443b(editVolumeViewModel, C49375cl.f123942a, new C11934u(), new C49370b(this));
                    EditVolumeViewModel editVolumeViewModel2 = this.f123935o;
                    if (editVolumeViewModel2 == null) {
                        C52711k.m112237a("mVolumeViewModel");
                    }
                    mo49443b(editVolumeViewModel2, C49376cm.f123943a, new C11934u(), new C49371c(this));
                    EditVolumeViewModel editVolumeViewModel3 = this.f123935o;
                    if (editVolumeViewModel3 == null) {
                        C52711k.m112237a("mVolumeViewModel");
                    }
                    mo49443b(editVolumeViewModel3, C49377cn.f123944a, new C11934u(), new C49372d(this));
                    EditVolumeViewModel editVolumeViewModel4 = this.f123935o;
                    if (editVolumeViewModel4 == null) {
                        C52711k.m112237a("mVolumeViewModel");
                    }
                    String a5 = mo24461a((int) R.string.c5);
                    C52711k.m112236a((Object) a5, "getString(R.string.accompany)");
                    editVolumeViewModel4.mo97067a(a5);
                    EditVolumeViewModel editVolumeViewModel5 = this.f123935o;
                    if (editVolumeViewModel5 == null) {
                        C52711k.m112237a("mVolumeViewModel");
                    }
                    VideoPublishEditModel videoPublishEditModel2 = this.f123932k;
                    if (videoPublishEditModel2 == null) {
                        C52711k.m112237a("mModel");
                    }
                    if (videoPublishEditModel2.isReaction()) {
                        str = mo24461a((int) R.string.d43);
                        C52711k.m112236a((Object) str, "getString(R.string.reaction_man_voice)");
                    } else {
                        VideoPublishEditModel videoPublishEditModel3 = this.f123932k;
                        if (videoPublishEditModel3 == null) {
                            C52711k.m112237a("mModel");
                        }
                        if (videoPublishEditModel3.isStitchMode()) {
                            str = mo24461a((int) R.string.gb3);
                            C52711k.m112236a((Object) str, "getString(R.string.edit_stitch_your_audio)");
                        } else {
                            str = mo24461a((int) R.string.c40);
                            C52711k.m112236a((Object) str, "getString(R.string.man_voice)");
                        }
                    }
                    editVolumeViewModel5.mo97068b(str);
                    mo97301F();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aec, viewGroup, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            View findViewById = frameLayout.findViewById(R.id.bew);
            C52711k.m112236a((Object) findViewById, "parentLayout.findViewById(R.id.ll_change_volume)");
            this.f123936p = (ViewGroup) findViewById;
            return frameLayout;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
