package com.p683ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import com.bytedance.scene.group.C12896b;
import com.p683ss.android.ugc.asve.p1241e.C20393d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.gamora.editor.p2460b.C49231a;
import com.p683ss.android.ugc.gamora.editor.p2460b.C49231a.C49242b;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.VEListener.C50552p;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52904aa;
import dmt.p2652av.video.C53031z;
import dmt.p2652av.video.CompileProbeViewModel;
import dmt.p2652av.video.VEEditorAutoStartStopArbiter;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import p064c.p065a.p069b.C1690c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.at */
public final class C49143at extends C12896b implements C49548a {

    /* renamed from: q */
    public static final C49144a f123464q = new C49144a(null);

    /* renamed from: k */
    public C49231a f123465k;

    /* renamed from: l */
    public EditPreviewViewModel f123466l;

    /* renamed from: m */
    public FrameLayout f123467m;

    /* renamed from: n */
    public VideoPublishEditModel f123468n;

    /* renamed from: o */
    public CompileProbeViewModel f123469o;

    /* renamed from: p */
    public C49413cy f123470p;

    /* renamed from: r */
    private VEVideoPublishEditViewModel f123471r;

    /* renamed from: s */
    private EditViewModel f123472s;

    /* renamed from: t */
    private EditTextStickerViewModel f123473t;

    /* renamed from: u */
    private EditInfoStickerViewModel f123474u;

    /* renamed from: v */
    private EditPoiStickerViewModel f123475v;

    /* renamed from: w */
    private EditVoteStickerViewModel f123476w;

    /* renamed from: x */
    private EditStickerViewModel f123477x;

    /* renamed from: com.ss.android.ugc.gamora.editor.at$a */
    public static final class C49144a {
        private C49144a() {
        }

        public /* synthetic */ C49144a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$b */
    static final class C49145b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49143at f123478a;

        C49145b(C49143at atVar) {
            this.f123478a = atVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo97158a();
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo97158a() {
            String str;
            String str2;
            C45412b.m98979a().end("av_video_edit", "firstFrame");
            Activity activity = this.f123478a.f33840g_;
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            long longExtra = activity.getIntent().getLongExtra("extra_start_enter_edit_page", 0);
            Activity activity2 = this.f123478a.f33840g_;
            if (activity2 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity2, "activity!!");
            long longExtra2 = activity2.getIntent().getLongExtra("extra_import_compile_cost_time", 0);
            long currentTimeMillis = System.currentTimeMillis() - longExtra;
            if (longExtra > 0) {
                C47702b bVar = C47702b.f120193a;
                String str3 = "tool_performance_edit_first_frame";
                C23089d a = C23089d.m56640a().mo47827a("first_frame_duration", currentTimeMillis).mo47828a("is_fast_import", (Object) Boolean.valueOf(C49143at.m106094c(this.f123478a).isFastImport)).mo47829a("content_type", C43434az.m95202a(C49143at.m106094c(this.f123478a))).mo47829a("content_source", C43434az.m95207b(C49143at.m106094c(this.f123478a)));
                String str4 = "is_hardcode";
                if (C40797m.m90243a()) {
                    str = "1";
                } else {
                    str = "0";
                }
                bVar.mo94984a(str3, a.mo47829a(str4, str).mo47829a("resolution", C49143at.m106094c(this.f123478a).getVideoResolution()).mo47827a("compile_time", longExtra2).mo47829a("bite_rate", String.valueOf(C40797m.m90249d())).mo47826a("video_quality", C40797m.m90251f()).mo47826a("record_mode", C49143at.m106094c(this.f123478a).recordMode).mo47828a("reshoot", (Object) Boolean.valueOf(C49143at.m106094c(this.f123478a).isRetakeVideo())).mo47829a("shoot_way", C49143at.m106094c(this.f123478a).mShootWay).mo47829a("creation_id", C49143at.m106094c(this.f123478a).creationId).f61491a);
                C47702b bVar2 = C47702b.f120193a;
                String str5 = "first_frame_display_on_edit_page";
                C23089d a2 = C23089d.m56640a().mo47829a("content_type", C43434az.m95202a(C49143at.m106094c(this.f123478a))).mo47829a("filter_list", C49143at.m106094c(this.f123478a).mCurFilterLabels).mo47829a("filter_id_list", C49143at.m106094c(this.f123478a).mCurFilterIds).mo47829a("prop_list", C49143at.m106094c(this.f123478a).mStickerID);
                String str6 = "is_hardcode";
                if (C40797m.m90243a()) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                bVar2.mo94984a(str5, a2.mo47829a(str6, str2).mo47829a("bite_rate", String.valueOf(C40797m.m90249d())).mo47826a("video_quality", C40797m.m90251f()).mo47829a("resolution", C49143at.m106094c(this.f123478a).getVideoResolution()).mo47829a("content_source", C43434az.m95207b(C49143at.m106094c(this.f123478a))).mo47827a("total_time", currentTimeMillis).mo47827a("compile_time", longExtra2).mo47828a("is_fast_import", (Object) Boolean.valueOf(C49143at.m106094c(this.f123478a).isFastImport)).mo47826a("segment_count", C49143at.m106094c(this.f123478a).segmentCounts()).f61491a);
                if (TextUtils.equals(C43434az.m95207b(C49143at.m106094c(this.f123478a)), "upload")) {
                    C23569o.m57779a("aweme_publish_edit_page_render_time", C23088c.m56631a().mo47823a("totaltime", Long.valueOf(currentTimeMillis)).mo47823a("process_time", Long.valueOf(longExtra2)).mo47819a("is_fast_import", Boolean.valueOf(C49143at.m106094c(this.f123478a).isFastImport)).mo47822a("segment_count", Integer.valueOf(C49143at.m106094c(this.f123478a).segmentCounts())).mo47825b());
                }
                StringBuilder sb = new StringBuilder("firstFrameRender in VEVideoPublishEditActivity,compile usage:");
                sb.append(longExtra2);
                sb.append(",total usage:");
                sb.append(currentTimeMillis);
                sb.append(", lazyInit:");
                sb.append(C20393d.m50598a());
                C50203g.m108358a(sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$c */
    static final class C49146c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49143at f123479a;

        C49146c(C49143at atVar) {
            this.f123479a = atVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo97159a();
            return C52860x.f131107a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo97159a() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.at r0 = r2.f123479a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p683ss.android.ugc.gamora.editor.C49143at.m106094c(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r0 = r0.compileProbeResult
                if (r0 == 0) goto L_0x0024
                com.ss.android.ugc.gamora.editor.at r0 = r2.f123479a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p683ss.android.ugc.gamora.editor.C49143at.m106094c(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r0 = r0.compileProbeResult
                if (r0 == 0) goto L_0x001f
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus r0 = r0.getStatus()
                if (r0 == 0) goto L_0x001f
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State r0 = r0.getState()
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State r1 = com.p683ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State.CANCEL
                if (r0 != r1) goto L_0x0037
            L_0x0024:
                com.ss.android.ugc.gamora.editor.at r0 = r2.f123479a
                dmt.av.video.CompileProbeViewModel r0 = com.p683ss.android.ugc.gamora.editor.C49143at.m106095d(r0)
                com.ss.android.ugc.gamora.editor.a r0 = r0.mo110430a()
                com.ss.android.ugc.gamora.editor.at r1 = r2.f123479a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = com.p683ss.android.ugc.gamora.editor.C49143at.m106094c(r1)
                r0.mo97081a(r1)
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49143at.C49146c.mo97159a():void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$d */
    static final class C49147d implements C50552p {

        /* renamed from: a */
        final /* synthetic */ C49143at f123480a;

        /* renamed from: b */
        final /* synthetic */ C49145b f123481b;

        /* renamed from: c */
        final /* synthetic */ C49146c f123482c;

        C49147d(C49143at atVar, C49145b bVar, C49146c cVar) {
            this.f123480a = atVar;
            this.f123481b = bVar;
            this.f123482c = cVar;
        }

        /* renamed from: a */
        public final void mo43097a() {
            this.f123481b.mo97158a();
            this.f123482c.mo97159a();
            C49143at.m106092a(this.f123480a).mo96924e().postValue(null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$e */
    public static final class C49148e implements C31406ai {

        /* renamed from: a */
        final /* synthetic */ C49143at f123483a;

        C49148e(C49143at atVar) {
            this.f123483a = atVar;
        }

        /* renamed from: a */
        public final float mo49450a(String str) {
            C52711k.m112240b(str, "filterPath");
            return C49143at.m106093b(this.f123483a).mo97215c().mo110480a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$f */
    public static final class C49149f implements C49242b {

        /* renamed from: a */
        final /* synthetic */ C49143at f123484a;

        C49149f(C49143at atVar) {
            this.f123484a = atVar;
        }

        /* renamed from: a */
        public final void mo97160a(C52904aa aaVar) {
            boolean z;
            if (aaVar != null) {
                C49143at atVar = this.f123484a;
                if (aaVar.f131237h == 0) {
                    z = true;
                } else {
                    z = false;
                }
                atVar.mo97157a(z, aaVar.f131236g);
            }
        }

        /* renamed from: a */
        public final void mo97161a(C53031z zVar) {
            boolean z;
            if (zVar != null) {
                C49143at atVar = this.f123484a;
                if (zVar.f131509a == 0) {
                    z = true;
                } else {
                    z = false;
                }
                atVar.mo97157a(z, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$g */
    static final class C49150g extends C52712l implements C52682m<C49548a, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49143at f123485a;

        C49150g(C49143at atVar) {
            this.f123485a = atVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C49548a aVar = (C49548a) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(aVar, "$receiver");
            FrameLayout frameLayout = this.f123485a.f123467m;
            if (frameLayout == null) {
                C52711k.m112237a("videoContainer");
            }
            frameLayout.setBackgroundColor(intValue);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$h */
    static final class C49151h<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C49143at f123486a;

        C49151h(C49143at atVar) {
            this.f123486a = atVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C49143at.m106092a(this.f123486a).mo22530c(C48979f.f123180a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$i */
    static final class C49152i<T> implements C0199s<Void> {

        /* renamed from: a */
        final /* synthetic */ C49143at f123487a;

        C49152i(C49143at atVar) {
            this.f123487a = atVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Void voidR = (Void) obj;
            C49143at.m106092a(this.f123487a).mo96927h().setValue(null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$j */
    static final class C49153j<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49143at f123488a;

        C49153j(C49143at atVar) {
            this.f123488a = atVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                ImageView imageView = C49143at.m106093b(this.f123488a).f123648n;
                C52711k.m112236a((Object) imageView, "publishEditScene.firstFrameView");
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$k */
    static final class C49154k<T> implements C0199s<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ C49143at f123489a;

        C49154k(C49143at atVar) {
            this.f123489a = atVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C49143at.m106093b(this.f123489a).f123648n.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$l */
    static final class C49155l extends C52712l implements C52682m<C49548a, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49143at f123490a;

        C49155l(C49143at atVar) {
            this.f123490a = atVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
            C49548a aVar = (C49548a) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(aVar, "$receiver");
            C49231a aVar2 = (C49231a) this.f123490a.mo24388a("VEVideoPublishEditScene");
            if (aVar2 != null) {
                vEEditorAutoStartStopArbiter = aVar2.mo97218d();
            } else {
                vEEditorAutoStartStopArbiter = null;
            }
            if (vEEditorAutoStartStopArbiter != null) {
                vEEditorAutoStartStopArbiter.mo110432a(booleanValue);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.at$m */
    static final class C49156m<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49143at f123491a;

        C49156m(C49143at atVar) {
            this.f123491a = atVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C49143at.m106092a(this.f123491a).mo96928i().setValue((Boolean) obj);
        }
    }

    /* renamed from: a */
    public final void mo97157a(boolean z, boolean z2) {
        if (z2) {
            EditStickerViewModel editStickerViewModel = this.f123477x;
            if (editStickerViewModel == null) {
                C52711k.m112237a("stickerViewModel");
            }
            editStickerViewModel.mo96967f().setValue(Boolean.valueOf(z));
        } else {
            EditStickerViewModel editStickerViewModel2 = this.f123477x;
            if (editStickerViewModel2 == null) {
                C52711k.m112237a("stickerViewModel");
            }
            editStickerViewModel2.mo96966e().setValue(Boolean.valueOf(z));
        }
        if (z) {
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f123471r;
            if (vEVideoPublishEditViewModel == null) {
                C52711k.m112237a("publishEditViewModel");
            }
            C0198r r = vEVideoPublishEditViewModel.mo110473r();
            C52711k.m112236a((Object) r, "publishEditViewModel.inTimeEditView");
            r.setValue(Boolean.valueOf(false));
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f123471r;
            if (vEVideoPublishEditViewModel2 == null) {
                C52711k.m112237a("publishEditViewModel");
            }
            C0198r s = vEVideoPublishEditViewModel2.mo110474s();
            C52711k.m112236a((Object) s, "publishEditViewModel.inPinEditView");
            s.setValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: c */
    public final C11910j mo86790c() {
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

    /* renamed from: I */
    public final int mo97155I() {
        C49231a aVar = this.f123465k;
        if (aVar == null) {
            C52711k.m112237a("publishEditScene");
        }
        SurfaceView surfaceView = aVar.f123647m;
        C52711k.m112236a((Object) surfaceView, "publishEditScene.surfaceView");
        return surfaceView.getWidth();
    }

    /* renamed from: J */
    public final int mo97156J() {
        C49231a aVar = this.f123465k;
        if (aVar == null) {
            C52711k.m112237a("publishEditScene");
        }
        SurfaceView surfaceView = aVar.f123647m;
        C52711k.m112236a((Object) surfaceView, "publishEditScene.surfaceView");
        return surfaceView.getHeight();
    }

    /* renamed from: a */
    public static final /* synthetic */ EditPreviewViewModel m106092a(C49143at atVar) {
        EditPreviewViewModel editPreviewViewModel = atVar.f123466l;
        if (editPreviewViewModel == null) {
            C52711k.m112237a("previewViewModel");
        }
        return editPreviewViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ C49231a m106093b(C49143at atVar) {
        C49231a aVar = atVar.f123465k;
        if (aVar == null) {
            C52711k.m112237a("publishEditScene");
        }
        return aVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ VideoPublishEditModel m106094c(C49143at atVar) {
        VideoPublishEditModel videoPublishEditModel = atVar.f123468n;
        if (videoPublishEditModel == null) {
            C52711k.m112237a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ CompileProbeViewModel m106095d(C49143at atVar) {
        CompileProbeViewModel compileProbeViewModel = atVar.f123469o;
        if (compileProbeViewModel == null) {
            C52711k.m112237a("compileProbeViewModel");
        }
        return compileProbeViewModel;
    }

    /* renamed from: d */
    public final void mo24408d(Bundle bundle) {
        super.mo24408d(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(VEVideoPublishEditViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f123471r = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33840g_;
            if (activity2 != null) {
                JediViewModel a2 = C48927d.m105736a((FragmentActivity) activity2).mo96760a(EditPreviewViewModel.class);
                C52711k.m112236a((Object) a2, "JediViewModelProviders.o…iewViewModel::class.java)");
                this.f123466l = (EditPreviewViewModel) a2;
                Activity activity3 = this.f33840g_;
                if (activity3 != null) {
                    JediViewModel a3 = C48927d.m105736a((FragmentActivity) activity3).mo96760a(EditViewModel.class);
                    C52711k.m112236a((Object) a3, "JediViewModelProviders.o…ditViewModel::class.java)");
                    this.f123472s = (EditViewModel) a3;
                    Activity activity4 = this.f33840g_;
                    if (activity4 != null) {
                        JediViewModel a4 = C48927d.m105736a((FragmentActivity) activity4).mo96760a(EditTextStickerViewModel.class);
                        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java)");
                        this.f123473t = (EditTextStickerViewModel) a4;
                        Activity activity5 = this.f33840g_;
                        if (activity5 != null) {
                            JediViewModel a5 = C48927d.m105736a((FragmentActivity) activity5).mo96760a(EditInfoStickerViewModel.class);
                            C52711k.m112236a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java)");
                            this.f123474u = (EditInfoStickerViewModel) a5;
                            Activity activity6 = this.f33840g_;
                            if (activity6 != null) {
                                JediViewModel a6 = C48927d.m105736a((FragmentActivity) activity6).mo96760a(EditPoiStickerViewModel.class);
                                C52711k.m112236a((Object) a6, "JediViewModelProviders.o…kerViewModel::class.java)");
                                this.f123475v = (EditPoiStickerViewModel) a6;
                                Activity activity7 = this.f33840g_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C48927d.m105736a((FragmentActivity) activity7).mo96760a(EditVoteStickerViewModel.class);
                                    C52711k.m112236a((Object) a7, "JediViewModelProviders.o…kerViewModel::class.java)");
                                    this.f123476w = (EditVoteStickerViewModel) a7;
                                    Activity activity8 = this.f33840g_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C48927d.m105736a((FragmentActivity) activity8).mo96760a(EditStickerViewModel.class);
                                        C52711k.m112236a((Object) a8, "JediViewModelProviders.o…kerViewModel::class.java)");
                                        this.f123477x = (EditStickerViewModel) a8;
                                        Activity activity9 = this.f33840g_;
                                        if (activity9 != null) {
                                            C0209x a9 = C0214z.m440a((FragmentActivity) activity9).mo359a(CompileProbeViewModel.class);
                                            C52711k.m112236a((Object) a9, "ViewModelProviders.of(ac…obeViewModel::class.java)");
                                            this.f123469o = (CompileProbeViewModel) a9;
                                            EditViewModel editViewModel = this.f123472s;
                                            if (editViewModel == null) {
                                                C52711k.m112237a("editViewModel");
                                            }
                                            this.f123468n = editViewModel.mo97035e();
                                            return;
                                        }
                                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                    }
                                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                                throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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

    /* JADX WARNING: Code restructure failed: missing block: B:273:0x051f, code lost:
        if (r10.mIsFromDraft != false) goto L_0x0521;
     */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x06bd  */
    /* JADX WARNING: Removed duplicated region for block: B:374:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24463a(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            super.mo24463a(r10, r11)
            r10 = 2132018742(0x7f140636, float:1.96758E38)
            android.view.View r11 = r9.mo24467j_(r10)
            java.lang.String r0 = "requireViewById(R.id.edit_preview_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r9.f123467m = r11
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r11 = r9.f123466l
            if (r11 != 0) goto L_0x0021
            java.lang.String r0 = "previewViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0021:
            r2 = r11
            com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            d.k.j r3 = com.p683ss.android.ugc.gamora.editor.C49157au.f123492a
            r4 = 0
            com.ss.android.ugc.gamora.editor.at$g r11 = new com.ss.android.ugc.gamora.editor.at$g
            r11.<init>(r9)
            r5 = r11
            d.f.a.m r5 = (p2628d.p2639f.p2640a.C52682m) r5
            r6 = 2
            r7 = 0
            r1 = r9
            r1.mo49443b(r2, r3, new com.bytedance.jedi.arch.C11934u(), r5)
            java.lang.String r11 = "VEVideoPublishEditScene"
            com.bytedance.scene.i r11 = r9.mo24388a(r11)
            com.ss.android.ugc.gamora.editor.b.a r11 = (com.p683ss.android.ugc.gamora.editor.p2460b.C49231a) r11
            r0 = 0
            if (r11 == 0) goto L_0x0043
            r9.f123465k = r11
            goto L_0x005e
        L_0x0043:
            com.ss.android.ugc.gamora.editor.b.a r11 = com.p683ss.android.ugc.gamora.editor.p2460b.C49231a.m106230a(r0)
            java.lang.String r1 = "VEVideoPublishEditScene.newInstance(null)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
            r9.f123465k = r11
            com.ss.android.ugc.gamora.editor.b.a r11 = r9.f123465k
            if (r11 != 0) goto L_0x0057
            java.lang.String r1 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0057:
            com.bytedance.scene.i r11 = (com.bytedance.scene.C12924i) r11
            java.lang.String r1 = "VEVideoPublishEditScene"
            r9.mo24389a(r10, r11, r1)
        L_0x005e:
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0067
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0067:
            com.ss.android.ugc.gamora.editor.cy r11 = r9.f123470p
            if (r11 != 0) goto L_0x0070
            java.lang.String r1 = "veLifecycleOwner"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0070:
            r10.f123649o = r11
            com.ss.android.ugc.gamora.editor.at$b r10 = new com.ss.android.ugc.gamora.editor.at$b
            r10.<init>(r9)
            com.ss.android.ugc.gamora.editor.at$c r11 = new com.ss.android.ugc.gamora.editor.at$c
            r11.<init>(r9)
            com.ss.android.ugc.gamora.editor.b.a r1 = r9.f123465k
            if (r1 != 0) goto L_0x0085
            java.lang.String r2 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0085:
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r9.f123472s
            if (r2 != 0) goto L_0x008e
            java.lang.String r3 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x008e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r2.mo97035e()
            int r2 = r2.videoEditorType
            com.ss.android.ugc.gamora.editor.at$d r3 = new com.ss.android.ugc.gamora.editor.at$d
            r3.<init>(r9, r10, r11)
            com.ss.android.vesdk.VEListener$p r3 = (com.p683ss.android.vesdk.VEListener.C50552p) r3
            r1.mo97206a(r2, r3)
            com.ss.android.ugc.gamora.editor.EditViewModel r10 = r9.f123472s
            if (r10 != 0) goto L_0x00a7
            java.lang.String r11 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x00a7:
            android.arch.lifecycle.r r10 = r10.mo97027I()
            com.ss.android.ugc.gamora.editor.at$e r11 = new com.ss.android.ugc.gamora.editor.at$e
            r11.<init>(r9)
            r10.setValue(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x00bc
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x00bc:
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r9.f123472s
            if (r11 != 0) goto L_0x00c5
            java.lang.String r1 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00c5:
            android.arch.lifecycle.r r11 = r11.mo97038h()
            r10.mo97208a(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x00d5
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x00d5:
            com.ss.android.ugc.gamora.editor.at$f r11 = new com.ss.android.ugc.gamora.editor.at$f
            r11.<init>(r9)
            com.ss.android.ugc.gamora.editor.b.a$b r11 = (com.p683ss.android.ugc.gamora.editor.p2460b.C49231a.C49242b) r11
            r10.f123646l = r11
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x00e7
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x00e7:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x00f0
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00f0:
            android.arch.lifecycle.r r11 = r11.mo110455a()
            android.arch.lifecycle.LiveData r11 = (android.arch.lifecycle.LiveData) r11
            r10.mo97207a(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0102
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0102:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x010b
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x010b:
            android.arch.lifecycle.r r11 = r11.mo110460e()
            android.arch.lifecycle.LiveData r11 = (android.arch.lifecycle.LiveData) r11
            r10.mo97212b(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x011d
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x011d:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x0126
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0126:
            android.arch.lifecycle.r r11 = r11.mo110461f()
            android.arch.lifecycle.LiveData r11 = (android.arch.lifecycle.LiveData) r11
            r10.f123643i = r11
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0137
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0137:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x0140
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0140:
            android.arch.lifecycle.r r11 = r11.mo110462g()
            android.arch.lifecycle.LiveData r11 = (android.arch.lifecycle.LiveData) r11
            r10.f123644j = r11
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0151
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0151:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x015a
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x015a:
            android.arch.lifecycle.r r11 = r11.mo110459d()
            r10.mo97213b(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x016a
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x016a:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x0173
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0173:
            android.arch.lifecycle.r r11 = r11.mo110457b()
            r10.mo97220d(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0183
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0183:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x018c
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x018c:
            dmt.av.video.h r11 = r11.mo110458c()
            r10.mo97209a(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x019c
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x019c:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x01a5
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01a5:
            android.arch.lifecycle.LiveData r11 = r11.mo110464i()
            r10.mo97216c(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x01b5
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x01b5:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x01be
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01be:
            dmt.av.video.f r11 = r11.mo110465j()
            android.arch.lifecycle.LiveData r11 = (android.arch.lifecycle.LiveData) r11
            r10.mo97221e(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x01d0
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x01d0:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x01d9
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01d9:
            android.arch.lifecycle.r r11 = r11.mo110466k()
            android.arch.lifecycle.LiveData r11 = (android.arch.lifecycle.LiveData) r11
            r10.mo97219d(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x01eb
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x01eb:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x01f4
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01f4:
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r11 = r11.f131145a
            r10.mo97210a(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0202
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0202:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x020b
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x020b:
            dmt.av.video.h r11 = r11.mo110467l()
            r10.mo97214b(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x021b
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x021b:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x0224
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0224:
            android.arch.lifecycle.r r11 = r11.mo110468m()
            r10.mo97222e(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0234
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0234:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x023d
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x023d:
            android.arch.lifecycle.r r11 = r11.mo110469n()
            android.arch.lifecycle.LiveData r11 = (android.arch.lifecycle.LiveData) r11
            r10.mo97224f(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x024f
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x024f:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x0258
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0258:
            android.arch.lifecycle.r r11 = r11.mo110470o()
            r10.mo97225f(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0268
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0268:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x0271
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0271:
            android.arch.lifecycle.r r11 = r11.mo110475t()
            r10.mo97217c(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0281
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0281:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x028a
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x028a:
            android.arch.lifecycle.r r11 = r11.mo110471p()
            r10.mo97226g(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x029a
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x029a:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x02a3
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02a3:
            android.arch.lifecycle.r r11 = r11.mo110472q()
            r10.mo97228h(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x02b3
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x02b3:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x02bc
            java.lang.String r1 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02bc:
            android.arch.lifecycle.r r11 = r11.mo110476u()
            r10.mo97230i(r11)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x02cc
            java.lang.String r11 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x02cc:
            android.arch.lifecycle.r r10 = r10.mo97223f()
            r11 = r9
            android.arch.lifecycle.k r11 = (android.arch.lifecycle.C0184k) r11
            com.ss.android.ugc.gamora.editor.at$h r1 = new com.ss.android.ugc.gamora.editor.at$h
            r1.<init>(r9)
            android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
            r10.observe(r11, r1)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x02e6
            java.lang.String r1 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02e6:
            android.arch.lifecycle.r r10 = r10.mo97227h()
            com.ss.android.ugc.gamora.editor.at$i r1 = new com.ss.android.ugc.gamora.editor.at$i
            r1.<init>(r9)
            android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
            r10.observe(r11, r1)
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r10 = r9.f123466l
            if (r10 != 0) goto L_0x02fd
            java.lang.String r1 = "previewViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x02fd:
            android.arch.lifecycle.r r10 = r10.mo96925f()
            com.ss.android.ugc.gamora.editor.at$j r1 = new com.ss.android.ugc.gamora.editor.at$j
            r1.<init>(r9)
            android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
            r10.observe(r11, r1)
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r10 = r9.f123466l
            if (r10 != 0) goto L_0x0314
            java.lang.String r1 = "previewViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0314:
            android.arch.lifecycle.r r10 = r10.mo96926g()
            com.ss.android.ugc.gamora.editor.at$k r1 = new com.ss.android.ugc.gamora.editor.at$k
            r1.<init>(r9)
            android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
            r10.observe(r11, r1)
            com.ss.android.ugc.gamora.editor.EditPreviewViewModel r10 = r9.f123466l
            if (r10 != 0) goto L_0x032b
            java.lang.String r1 = "previewViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x032b:
            r3 = r10
            com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3
            d.k.j r4 = com.p683ss.android.ugc.gamora.editor.C49158av.f123493a
            r5 = 0
            com.ss.android.ugc.gamora.editor.at$l r10 = new com.ss.android.ugc.gamora.editor.at$l
            r10.<init>(r9)
            r6 = r10
            d.f.a.m r6 = (p2628d.p2639f.p2640a.C52682m) r6
            r7 = 2
            r8 = 0
            r2 = r9
            r2.mo49444c(r3, r4, new com.bytedance.jedi.arch.C11934u(), r6)
            com.ss.android.ugc.gamora.editor.b.a r10 = r9.f123465k
            if (r10 != 0) goto L_0x0348
            java.lang.String r1 = "publishEditScene"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0348:
            android.arch.lifecycle.r r10 = r10.mo97229i()
            com.ss.android.ugc.gamora.editor.at$m r1 = new com.ss.android.ugc.gamora.editor.at$m
            r1.<init>(r9)
            android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
            r10.observe(r11, r1)
            int r10 = com.p683ss.android.ugc.aweme.shortvideo.C42447bc.m93239a()
            r11 = 30
            if (r10 <= 0) goto L_0x038b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r9.f123468n
            if (r1 != 0) goto L_0x0367
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0367:
            int r1 = r1.videoFps()
            if (r1 <= r10) goto L_0x036e
            goto L_0x038d
        L_0x036e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x0377
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0377:
            int r10 = r10.videoFps()
            if (r10 <= r11) goto L_0x038b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x0386
            java.lang.String r11 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0386:
            int r10 = r10.videoFps()
            goto L_0x038d
        L_0x038b:
            r10 = 30
        L_0x038d:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r9.f123468n
            if (r11 != 0) goto L_0x0396
            java.lang.String r1 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0396:
            r1 = 1
            dmt.av.video.VEPreviewParams r10 = com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b.m95935a(r11, r1, r10)
            android.app.Activity r11 = r9.f33840g_
            if (r11 != 0) goto L_0x03a2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x03a2:
            java.lang.String r2 = "activity!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r2)
            android.content.Intent r11 = r11.getIntent()
            java.lang.String r2 = "extra_editor_model"
            android.os.Parcelable r11 = r11.getParcelableExtra(r2)
            com.ss.android.vesdk.VEEditorModel r11 = (com.p683ss.android.vesdk.VEEditorModel) r11
            r10.editorModel = r11
            long r2 = com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.f108182z
            r10.editorHandler = r2
            r2 = -1
            com.p683ss.android.ugc.aweme.shortvideo.cut.scene.C42781ao.f108182z = r2
            long r2 = r10.editorHandler
            r4 = 0
            r11 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0493
            com.ss.android.vesdk.VEEditorModel r2 = r10.editorModel
            if (r2 != 0) goto L_0x03cc
            goto L_0x0493
        L_0x03cc:
            boolean r2 = r10.isFastImport
            if (r2 == 0) goto L_0x040e
            java.lang.String[] r2 = r10.mVideoPaths
            int r2 = r2.length
            if (r2 != r1) goto L_0x040e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x03de
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x03de:
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r2 = r2.getPreviewInfo()
            java.util.List r2 = r2.getVideoList()
            java.lang.Object r2 = r2.get(r11)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r2 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r2
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r3 = r2.getVideoCutInfo()
            if (r3 == 0) goto L_0x0493
            long r4 = r3.getEnd()
            long r6 = r3.getStart()
            long r4 = r4 - r6
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r2 = r2.getVideoFileInfo()
            long r2 = r2.getDuration()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x040e
            java.lang.String r2 = "single video import without cut"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r2)
            goto L_0x0493
        L_0x040e:
            com.ss.android.vesdk.an r2 = new com.ss.android.vesdk.an
            java.lang.String[] r3 = r10.mVideoPaths
            r2.<init>(r3)
            int[] r3 = r10.mVTrimIn
            r2.f126932e = r3
            int[] r3 = r10.mVTrimOut
            r2.f126933f = r3
            float[] r3 = r10.speedArray
            if (r3 == 0) goto L_0x0451
            int r4 = r3.length
            if (r4 != 0) goto L_0x0426
            r4 = 1
            goto L_0x0427
        L_0x0426:
            r4 = 0
        L_0x0427:
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x042b
            goto L_0x042c
        L_0x042b:
            r3 = r0
        L_0x042c:
            if (r3 == 0) goto L_0x0451
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.length
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            int r5 = r3.length
            r6 = 0
        L_0x0438:
            if (r6 >= r5) goto L_0x0447
            r7 = r3[r6]
            double r7 = (double) r7
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r4.add(r7)
            int r6 = r6 + 1
            goto L_0x0438
        L_0x0447:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            double[] r3 = p2628d.p2629a.C52575l.m112131b(r4)
            r2.f126936i = r3
        L_0x0451:
            int[] r3 = r10.rotateArray
            if (r3 == 0) goto L_0x0494
            int r4 = r3.length
            if (r4 != 0) goto L_0x045a
            r4 = 1
            goto L_0x045b
        L_0x045a:
            r4 = 0
        L_0x045b:
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x045f
            goto L_0x0460
        L_0x045f:
            r3 = r0
        L_0x0460:
            if (r3 == 0) goto L_0x0494
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.length
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            int r5 = r3.length
            r6 = 0
        L_0x046c:
            if (r6 >= r5) goto L_0x047a
            r7 = r3[r6]
            com.ss.android.vesdk.c r7 = com.p683ss.android.ugc.aweme.shortvideo.cut.C42669p.C42670a.m93643a(r7)
            r4.add(r7)
            int r6 = r6 + 1
            goto L_0x046c
        L_0x047a:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            com.ss.android.vesdk.c[] r3 = new com.p683ss.android.vesdk.C50657c[r11]
            java.lang.Object[] r3 = r4.toArray(r3)
            if (r3 == 0) goto L_0x048b
            com.ss.android.vesdk.c[] r3 = (com.p683ss.android.vesdk.C50657c[]) r3
            r2.f126938k = r3
            goto L_0x0494
        L_0x048b:
            d.u r10 = new d.u
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<T>"
            r10.<init>(r11)
            throw r10
        L_0x0493:
            r2 = r0
        L_0x0494:
            r10.timelineParams = r2
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r9.f123472s
            if (r2 != 0) goto L_0x049f
            java.lang.String r3 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x049f:
            com.ss.android.ugc.aweme.shortvideo.edit.bd r2 = r2.mo97036f()
            int r2 = r2.mo88379a()
            r10.canvasWidth = r2
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r9.f123472s
            if (r2 != 0) goto L_0x04b2
            java.lang.String r3 = "editViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x04b2:
            com.ss.android.ugc.aweme.shortvideo.edit.bd r2 = r2.mo97036f()
            int r2 = r2.mo88380b()
            r10.canvasHeight = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x04c5
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x04c5:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r2 = r2.veAudioRecorderParam
            r10.veAudioRecordParam = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x04d2
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x04d2:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r2 = r2.veAudioEffectParam
            if (r2 == 0) goto L_0x04e3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x04df
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x04df:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r2 = r2.veAudioEffectParam
            r10.veAudioEffectParam = r2
        L_0x04e3:
            dmt.av.video.VEVideoPublishEditViewModel r2 = r9.f123471r
            if (r2 != 0) goto L_0x04ec
            java.lang.String r3 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x04ec:
            android.arch.lifecycle.r r2 = r2.mo110455a()
            java.lang.String r3 = "publishEditViewModel.previewParams"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setValue(r10)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x0501
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0501:
            int r10 = r10.isMusic()
            if (r10 != r1) goto L_0x0639
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x0510
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0510:
            int r10 = r10.recordMode
            if (r10 == 0) goto L_0x0521
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x051d
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x051d:
            boolean r10 = r10.mIsFromDraft
            if (r10 == 0) goto L_0x0639
        L_0x0521:
            dmt.av.video.VEPreviewMusicParams r10 = new dmt.av.video.VEPreviewMusicParams
            r10.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x052f
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x052f:
            java.lang.String r2 = r2.mMusicPath
            r10.f131134a = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x053c
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x053c:
            int r2 = r2.mMusicStart
            r10.f131135b = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x0549
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0549:
            java.lang.String r2 = r2.mMusicPath
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f123468n
            if (r3 != 0) goto L_0x0554
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0554:
            boolean r3 = com.p683ss.android.ugc.aweme.utils.C47807de.m103445a(r3)
            int r2 = com.p683ss.android.ugc.aweme.utils.C47807de.m103443a(r2, r3)
            r10.f131136c = r2
            com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
            if (r2 == 0) goto L_0x05ab
            com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
            if (r2 != 0) goto L_0x0575
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0575:
            int r2 = r2.getShootDuration()
            if (r2 <= 0) goto L_0x05ab
            int r2 = r10.f131136c
            com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
            if (r3 != 0) goto L_0x058a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x058a:
            int r3 = r3.getShootDuration()
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L_0x05ab
            com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
            if (r2 != 0) goto L_0x05a4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x05a4:
            int r2 = r2.getShootDuration()
            r10.f131137d = r2
            goto L_0x05af
        L_0x05ab:
            int r2 = r10.f131136c
            r10.f131137d = r2
        L_0x05af:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x05b8
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x05b8:
            float r2 = r2.musicVolume
            r10.f131138e = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x05c5
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x05c5:
            java.lang.String r2 = r2.musicId
            r10.f131139f = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x05d2
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x05d2:
            float r2 = r2.previewStartTime
            r10.f131140g = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x05df
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x05df:
            boolean r2 = r2.isFastImport
            r10.f131142i = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x05ec
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x05ec:
            boolean r2 = r2.isFastImport
            r10.f131142i = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x05f9
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x05f9:
            boolean r2 = r2.isStitchMode()
            if (r2 == 0) goto L_0x0623
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r9.f123468n
            if (r2 != 0) goto L_0x0608
            java.lang.String r3 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0608:
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r2 = r2.getStitchParams()
            if (r2 == 0) goto L_0x0623
            boolean r3 = r2.isPGCMusic()
            if (r3 == 0) goto L_0x0623
            int r3 = r2.getMusicStart()
            if (r3 < 0) goto L_0x0623
            long r2 = r2.getDuration()
            r10.f131143j = r11
            int r11 = (int) r2
            r10.f131144k = r11
        L_0x0623:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r9.f123471r
            if (r11 != 0) goto L_0x062c
            java.lang.String r2 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x062c:
            android.arch.lifecycle.r r11 = r11.mo110460e()
            java.lang.String r2 = "publishEditViewModel.previewMusicParams"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r2)
            r11.setValue(r10)
            goto L_0x06ae
        L_0x0639:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x0642
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0642:
            boolean r10 = r10.isStatusVideoType()
            if (r10 == 0) goto L_0x06ae
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x0651
            java.lang.String r2 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0651:
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r10 = r10.statusCreateVideoData
            java.lang.String r2 = r10.getMusicPath()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x06ae
            dmt.av.video.VEPreviewMusicParams r2 = new dmt.av.video.VEPreviewMusicParams
            r2.<init>()
            java.lang.String r3 = r10.getMusicPath()
            r2.f131134a = r3
            r2.f131135b = r11
            r3 = 10000(0x2710, float:1.4013E-41)
            r2.f131136c = r3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f123468n
            if (r3 != 0) goto L_0x0679
            java.lang.String r4 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0679:
            float r3 = r3.musicVolume
            r2.f131138e = r3
            java.util.List r10 = r10.getMusicIds()
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            r2.f131139f = r10
            r10 = 0
            r2.f131140g = r10
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x0695
            java.lang.String r11 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x0695:
            boolean r10 = r10.isFastImport
            r2.f131142i = r10
            dmt.av.video.VEVideoPublishEditViewModel r10 = r9.f123471r
            if (r10 != 0) goto L_0x06a2
            java.lang.String r11 = "publishEditViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x06a2:
            android.arch.lifecycle.r r10 = r10.mo110460e()
            java.lang.String r11 = "publishEditViewModel.previewMusicParams"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            r10.setValue(r2)
        L_0x06ae:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x06b7
            java.lang.String r11 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x06b7:
            int r10 = r10.isMusic()
            if (r10 != r1) goto L_0x06d5
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x06c6
            java.lang.String r11 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x06c6:
            int r10 = r10.recordMode
            if (r10 != r1) goto L_0x06d5
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10 = r9.f123468n
            if (r10 != 0) goto L_0x06d3
            java.lang.String r11 = "mModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x06d3:
            r10.mMusicPath = r0
        L_0x06d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49143at.mo24463a(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ae7, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
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

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
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
