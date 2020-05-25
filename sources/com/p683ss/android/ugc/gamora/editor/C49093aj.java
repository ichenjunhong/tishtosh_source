package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24431b;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24434d;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24437f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43439b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C53030y;
import dmt.p2652av.video.VEPreviewMusicParams;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.Collection;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.gamora.editor.aj */
public class C49093aj implements C49390ct {

    /* renamed from: a */
    public final EditViewModel f123359a;

    /* renamed from: b */
    public final VideoPublishEditModel f123360b = this.f123359a.mo97035e();

    /* renamed from: c */
    public final C43439b f123361c = new C43439b();

    /* renamed from: d */
    public final VEVideoPublishEditViewModel f123362d;

    /* renamed from: e */
    public String f123363e;

    /* renamed from: f */
    public final EditToolbarViewModel f123364f;

    /* renamed from: g */
    public final EditVolumeViewModel f123365g;

    /* renamed from: h */
    public final EditMusicCutViewModel f123366h;

    /* renamed from: i */
    public final EditMusicViewModel f123367i;

    /* renamed from: j */
    public final FragmentActivity f123368j;

    /* renamed from: k */
    public final C49098ak f123369k;

    /* renamed from: com.ss.android.ugc.gamora.editor.aj$a */
    static final class C49094a implements C24431b {

        /* renamed from: a */
        final /* synthetic */ C49093aj f123370a;

        C49094a(C49093aj ajVar) {
            this.f123370a = ajVar;
        }

        /* renamed from: a */
        public final void mo50188a(C42482c cVar, boolean z) {
            this.f123370a.mo97113a(cVar, z, "mv_default");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aj$b */
    static final class C49095b implements C24431b {

        /* renamed from: a */
        final /* synthetic */ C49093aj f123371a;

        C49095b(C49093aj ajVar) {
            this.f123371a = ajVar;
        }

        /* renamed from: a */
        public final void mo50188a(C42482c cVar, boolean z) {
            this.f123371a.mo97113a(cVar, z, "status_default");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aj$c */
    static final class C49096c extends C52712l implements C52671b<C24434d, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49093aj f123372a;

        C49096c(C49093aj ajVar) {
            this.f123372a = ajVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C24434d dVar = (C24434d) obj;
            C52711k.m112240b(dVar, "result");
            JediViewModel a = C48927d.m105736a(this.f123372a.f123368j).mo96760a(EditLyricStickerViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java)");
            ((EditLyricStickerViewModel) a).mo96880g();
            this.f123372a.mo97112a(dVar);
            if (EditViewModel.m105818D()) {
                this.f123372a.f123369k.mo97123a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.aj$d */
    static final class C49097d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C49093aj f123373a;

        C49097d(C49093aj ajVar) {
            this.f123373a = ajVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f123373a.mo97120d();
            if (EditViewModel.m105818D()) {
                this.f123373a.f123369k.mo97123a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public void mo97114a(String str, C42482c cVar, boolean z) {
    }

    /* renamed from: b */
    public int mo97117b() {
        return -1;
    }

    /* renamed from: e */
    public final String mo97121e() {
        return this.f123363e;
    }

    /* renamed from: d */
    public final void mo97120d() {
        C0198r k = this.f123362d.mo110466k();
        C52711k.m112236a((Object) k, "mViewModel.previewControlLiveData");
        k.setValue(C53030y.m112772a());
    }

    /* renamed from: a */
    public void mo97111a() {
        C0198r e = this.f123362d.mo110460e();
        C52711k.m112236a((Object) e, "mViewModel.previewMusicParams");
        e.setValue(new VEPreviewMusicParams());
        this.f123363e = this.f123360b.mMusicPath;
        this.f123360b.mMusicPath = null;
        this.f123360b.musicId = "";
        this.f123360b.previewStartTime = 0.0f;
        this.f123360b.isOriginalSound = false;
        this.f123360b.isCommerceMusic = false;
        this.f123360b.mMusicStart = 0;
        this.f123360b.mMusicOrigin = "";
        mo97116a(false);
        mo97118b(true);
        this.f123360b.musicVolume = 0.5f;
        C0198r k = this.f123362d.mo110466k();
        C52711k.m112236a((Object) k, "mViewModel.previewControlLiveData");
        k.setValue(C53030y.m112775b(0));
        k.setValue(C53030y.m112772a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97119c() {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f123360b
            java.lang.String r0 = r0.mStickerID
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0024
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = ","
            r4[r2] = r0
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            java.util.List r0 = p2628d.p2650m.C52830p.m112452b(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112118a(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            goto L_0x0025
        L_0x0024:
            r7 = r1
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f123360b
            java.util.List r0 = r0.challenges
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112118a(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r0 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r0
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = r0.cid
        L_0x0035:
            r8 = r1
            com.ss.android.ugc.aweme.shortvideo.edit.b r3 = r14.f123361c
            android.support.v4.app.FragmentActivity r0 = r14.f123368j
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            r5 = 110(0x6e, float:1.54E-43)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f123360b
            java.lang.String r6 = r0.mFirstStickerMusicIdsJson
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f123360b
            boolean r9 = r0.isAllowClearMusic()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f123360b
            java.lang.String r10 = r0.mShootWay
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f123360b
            java.lang.String r11 = r0.creationId
            com.ss.android.ugc.gamora.editor.aj$c r0 = new com.ss.android.ugc.gamora.editor.aj$c
            r0.<init>(r14)
            r12 = r0
            d.f.a.b r12 = (p2628d.p2639f.p2640a.C52671b) r12
            com.ss.android.ugc.gamora.editor.aj$d r0 = new com.ss.android.ugc.gamora.editor.aj$d
            r0.<init>(r14)
            r13 = r0
            d.f.a.a r13 = (p2628d.p2639f.p2640a.C52670a) r13
            r3.mo88373a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49093aj.mo97119c():void");
    }

    /* renamed from: f */
    public final void mo97122f() {
        if (this.f123360b.isMvThemeVideoType()) {
            if (!C23715d.m58202a((Collection<T>) this.f123360b.mvCreateVideoData.musicIds)) {
                C39630m.m88234a().mo58604b().mo80563a((C24437f) C43214dh.m94817a()).mo80633a((C24431b) new C49094a(this)).mo80634a(this.f123360b.mvCreateVideoData.musicIds);
            }
        } else if (this.f123360b.isStatusVideoType() && !C23715d.m58202a((Collection<T>) this.f123360b.statusCreateVideoData.getMusicIds())) {
            C39630m.m88234a().mo58604b().mo80563a((C24437f) C43214dh.m94817a()).mo80633a((C24431b) new C49095b(this)).mo80634a(this.f123360b.statusCreateVideoData.getMusicIds());
        }
    }

    /* renamed from: a */
    public void mo97116a(boolean z) {
        this.f123364f.mo97008a(8, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo97118b(boolean z) {
        C42482c b = C43214dh.m94817a().mo50201b();
        if (z) {
            b = null;
        }
        m105955a(b);
    }

    /* renamed from: a */
    private final void m105955a(C42482c cVar) {
        if (cVar != null || this.f123360b.isReviewVideo()) {
            EditToolbarViewModel editToolbarViewModel = this.f123364f;
            Drawable a = C0726c.m2091a((Context) this.f123368j, (int) R.drawable.ak3);
            if (a == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) a, "ContextCompat.getDrawabl…edit_addmusic_complete)!!");
            editToolbarViewModel.mo97009a(a);
            return;
        }
        EditToolbarViewModel editToolbarViewModel2 = this.f123364f;
        Drawable a2 = C0726c.m2091a((Context) this.f123368j, (int) R.drawable.a_d);
        if (a2 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) a2, "ContextCompat.getDrawabl….drawable.ic_music_add)!!");
        editToolbarViewModel2.mo97009a(a2);
    }

    /* renamed from: a */
    public final void mo97112a(C24434d dVar) {
        C52711k.m112240b(dVar, "result");
        if (dVar.f64818a) {
            mo97111a();
            return;
        }
        if (!TextUtils.isEmpty(dVar.f64821d)) {
            mo97115a(dVar.f64821d, dVar.f64819b);
            if (dVar.f64820c != null) {
                C43203d a = C43191e.m94741a(dVar.f64820c);
                EditMusicCutViewModel editMusicCutViewModel = this.f123366h;
                C42482c cVar = dVar.f64820c;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                editMusicCutViewModel.mo96891a(a, cVar.getDuration(), 0);
            }
        }
    }

    public C49093aj(FragmentActivity fragmentActivity, C49098ak akVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(akVar, "musicCallback");
        this.f123368j = fragmentActivity;
        this.f123369k = akVar;
        JediViewModel a = C48927d.m105736a(this.f123368j).mo96760a(EditViewModel.class);
        C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
        this.f123359a = (EditViewModel) a;
        C0209x a2 = C0214z.m440a(this.f123368j).mo359a(VEVideoPublishEditViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java)");
        this.f123362d = (VEVideoPublishEditViewModel) a2;
        JediViewModel a3 = C48927d.m105736a(this.f123368j).mo96760a(EditToolbarViewModel.class);
        C52711k.m112236a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
        this.f123364f = (EditToolbarViewModel) a3;
        JediViewModel a4 = C48927d.m105736a(this.f123368j).mo96760a(EditVolumeViewModel.class);
        C52711k.m112236a((Object) a4, "JediViewModelProviders.o…umeViewModel::class.java)");
        this.f123365g = (EditVolumeViewModel) a4;
        JediViewModel a5 = C48927d.m105736a(this.f123368j).mo96760a(EditMusicCutViewModel.class);
        C52711k.m112236a((Object) a5, "JediViewModelProviders.o…CutViewModel::class.java)");
        this.f123366h = (EditMusicCutViewModel) a5;
        JediViewModel a6 = C48927d.m105736a(this.f123368j).mo96760a(EditMusicViewModel.class);
        C52711k.m112236a((Object) a6, "JediViewModelProviders.o…sicViewModel::class.java)");
        this.f123367i = (EditMusicViewModel) a6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ea  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97115a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.imported.C35523d.m80266a(r0)
            java.lang.String r1 = "MusicModelUtils.getMusic…ger.inst().getCurMusic())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            dmt.av.video.VEPreviewMusicParams r1 = new dmt.av.video.VEPreviewMusicParams
            r1.<init>()
            r1.f131134a = r11
            r2 = 0
            r1.f131135b = r2
            r1.f131139f = r0
            com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
            if (r3 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
            if (r3 != 0) goto L_0x0034
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0034:
            java.lang.String r4 = "PublishManager.inst().getCurMusic()!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            float r3 = r3.getPreviewStartTime()
            r1.f131140g = r3
        L_0x003f:
            int r8 = com.p683ss.android.ugc.aweme.utils.C47807de.m103443a(r11, r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f123360b
            boolean r3 = com.p683ss.android.ugc.aweme.utils.C47807de.m103445a(r3)
            int r3 = com.p683ss.android.ugc.aweme.utils.C47807de.m103443a(r11, r3)
            r1.f131136c = r3
            com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
            if (r3 != 0) goto L_0x0068
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0068:
            int r3 = r3.getShootDuration()
            if (r3 <= 0) goto L_0x009c
            int r3 = r1.f131136c
            com.ss.android.ugc.aweme.shortvideo.dh r5 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r5 = r5.mo50201b()
            if (r5 != 0) goto L_0x007d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007d:
            int r5 = r5.getShootDuration()
            int r3 = r3 - r5
            int r3 = java.lang.Math.abs(r3)
            if (r3 < r4) goto L_0x009c
            com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
            if (r3 != 0) goto L_0x0095
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0095:
            int r3 = r3.getShootDuration()
            r1.f131137d = r3
            goto L_0x00a0
        L_0x009c:
            int r3 = r1.f131136c
            r1.f131137d = r3
        L_0x00a0:
            dmt.av.video.VEVideoPublishEditViewModel r3 = r10.f123362d
            android.arch.lifecycle.r r3 = r3.mo110460e()
            java.lang.String r5 = "mViewModel.previewMusicParams"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            r3.setValue(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f123360b
            java.lang.String r3 = r3.mMusicPath
            r10.f123363e = r3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f123360b
            r3.mMusicPath = r11
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f123360b
            r3.musicId = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f123360b
            r3.mMusicStart = r2
            com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r3 = r3.mo50201b()
            if (r3 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r10.f123360b
            boolean r6 = r3.isCommerceMusic()
            r5.isCommerceMusic = r6
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r10.f123360b
            boolean r3 = r3.isOriginalSound()
            r5.isOriginalSound = r3
        L_0x00da:
            int r3 = r1.f131137d
            r5 = 60000(0xea60, float:8.4078E-41)
            if (r3 <= 0) goto L_0x00ec
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f123360b
            int r6 = r1.f131137d
            int r5 = java.lang.Math.min(r6, r5)
            r3.mMusicEnd = r5
            goto L_0x00f6
        L_0x00ec:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f123360b
            int r6 = r1.f131136c
            int r5 = java.lang.Math.min(r6, r5)
            r3.mMusicEnd = r5
        L_0x00f6:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f123360b
            r3.mMusicOrigin = r12
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123359a
            boolean r12 = r12.mo97049t()
            r3 = 1
            if (r12 != 0) goto L_0x0119
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123359a
            boolean r12 = r12.mo97050u()
            if (r12 != 0) goto L_0x0119
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            java.lang.String r12 = r12.mMusicPath
            if (r12 == 0) goto L_0x0119
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            boolean r12 = r12.isStickPointMode
            if (r12 != 0) goto L_0x0119
            r12 = 1
            goto L_0x011a
        L_0x0119:
            r12 = 0
        L_0x011a:
            r10.mo97116a(r12)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            boolean r12 = r12.isMvThemeVideoType()
            if (r12 == 0) goto L_0x0142
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            com.ss.android.ugc.aweme.at.b r12 = r12.mvCreateVideoData
            java.util.List<java.lang.String> r12 = r12.musicIds
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r12)
            if (r12 != 0) goto L_0x0142
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            com.ss.android.ugc.aweme.at.b r12 = r12.mvCreateVideoData
            java.util.List<java.lang.String> r12 = r12.musicIds
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L_0x0142
            r10.mo97116a(r2)
        L_0x0142:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            boolean r12 = r12.isStatusVideoType()
            if (r12 == 0) goto L_0x016b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r12 = r12.statusCreateVideoData
            java.util.List r12 = r12.getMusicIds()
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r12)
            if (r12 != 0) goto L_0x016b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r12 = r12.statusCreateVideoData
            java.util.List r12 = r12.getMusicIds()
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L_0x016b
            r10.mo97116a(r2)
        L_0x016b:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            r12.mCurMusicLength = r8
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123359a
            int r12 = r12.mo97026H()
            if (r12 <= r8) goto L_0x017e
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r12 = r10.f123364f
            r0 = 8
            r12.mo97017d(r0, r2)
        L_0x017e:
            r10.mo97118b(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            r0 = 1056964608(0x3f000000, float:0.5)
            r12.musicVolume = r0
            com.ss.android.ugc.gamora.editor.EditVolumeViewModel r12 = r10.f123365g
            r2 = 50
            r12.mo97066a(r2)
            dmt.av.video.VEVideoPublishEditViewModel r12 = r10.f123362d
            android.arch.lifecycle.r r12 = r12.mo110468m()
            java.lang.String r2 = "mViewModel.volumeChangeOpLiveData"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r2)
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r0 = com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r0)
            r12.setValue(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            boolean r12 = r12.isMvThemeVideoType()
            if (r12 == 0) goto L_0x01c5
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            com.ss.android.ugc.aweme.at.b r12 = r12.mvCreateVideoData
            int r12 = r12.mvType
            if (r12 != r3) goto L_0x01c5
            com.ss.android.ugc.gamora.editor.ak r4 = r10.f123369k
            if (r11 != 0) goto L_0x01b7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01b7:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            int r6 = r12.mMusicStart
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f123360b
            int r7 = r12.mMusicEnd
            r9 = 1
            r5 = r11
            r4.mo97124a(r5, r6, r7, r8, r9)
            return
        L_0x01c5:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r10.f123362d
            android.arch.lifecycle.r r11 = r11.mo110466k()
            java.lang.String r12 = "mViewModel.previewControlLiveData"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r2 = 0
            dmt.av.video.y r12 = dmt.p2652av.video.C53030y.m112775b(r2)
            r11.setValue(r12)
            dmt.av.video.y r12 = dmt.p2652av.video.C53030y.m112772a()
            r11.setValue(r12)
            com.ss.android.ugc.aweme.shortvideo.dh r11 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r11 = r11.mo50201b()
            if (r11 == 0) goto L_0x0243
            com.ss.android.ugc.aweme.shortvideo.dh r11 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r11 = r11.mo50201b()
            if (r11 != 0) goto L_0x01f7
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01f7:
            int r11 = r11.getShootDuration()
            if (r11 <= 0) goto L_0x0243
            int r11 = r1.f131136c
            com.ss.android.ugc.aweme.shortvideo.dh r12 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r12 = r12.mo50201b()
            if (r12 != 0) goto L_0x020c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x020c:
            int r12 = r12.getShootDuration()
            int r11 = r11 - r12
            int r11 = java.lang.Math.abs(r11)
            if (r11 < r4) goto L_0x0238
            com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r11 = r10.f123366h
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123359a
            int r12 = r12.mo97026H()
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            if (r0 != 0) goto L_0x022c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x022c:
            int r0 = r0.getShootDuration()
            int r12 = java.lang.Math.min(r12, r0)
            r11.mo96890a(r12)
            return
        L_0x0238:
            com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r11 = r10.f123366h
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f123359a
            int r12 = r12.mo97026H()
            r11.mo96890a(r12)
        L_0x0243:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49093aj.mo97115a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo97113a(C42482c cVar, boolean z, String str) {
        VEMVAudioInfo vEMVAudioInfo;
        if (cVar != null && z) {
            this.f123360b.musicId = cVar.getMusicId();
            this.f123360b.previewStartTime = cVar.getPreviewStartTime();
            this.f123360b.isCommerceMusic = cVar.isCommerceMusic();
            this.f123360b.isOriginalSound = cVar.isOriginalSound();
            C20347c cVar2 = (C20347c) this.f123359a.mo97038h().getValue();
            if (cVar2 != null) {
                vEMVAudioInfo = cVar2.mo43060f();
            } else {
                vEMVAudioInfo = null;
            }
            if (vEMVAudioInfo != null) {
                this.f123360b.mMusicStart = vEMVAudioInfo.trimIn;
                this.f123360b.mMusicEnd = vEMVAudioInfo.trimOut;
            } else {
                this.f123360b.mMusicStart = 0;
                this.f123360b.mMusicEnd = Math.min(cVar.getPresenterDuration(), 60000);
            }
            this.f123360b.mMusicOrigin = str;
        }
    }
}
