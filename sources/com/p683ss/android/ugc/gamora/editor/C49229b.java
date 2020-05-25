package com.p683ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0198r;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.imported.C35523d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43192a;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import dmt.p2652av.video.VEPreviewMusicParams;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.b */
public final class C49229b extends C49093aj {

    /* renamed from: l */
    private C42482c f123636l;

    /* renamed from: m */
    private boolean f123637m;

    /* renamed from: n */
    private String f123638n = this.f123360b.musicId;

    /* renamed from: o */
    private String f123639o = this.f123360b.mMusicOrigin;

    /* renamed from: p */
    private final EditMusicViewModel f123640p;

    /* renamed from: com.ss.android.ugc.gamora.editor.b$a */
    public static final class C49230a implements C43192a {

        /* renamed from: a */
        final /* synthetic */ C49229b f123641a;

        /* renamed from: b */
        final /* synthetic */ C42482c f123642b;

        /* renamed from: a */
        public final void mo86593a(C43203d dVar) {
            this.f123641a.f123366h.mo96891a(dVar, this.f123642b.duration, 0);
        }

        C49230a(C49229b bVar, C42482c cVar) {
            this.f123641a = bVar;
            this.f123642b = cVar;
        }
    }

    /* renamed from: a */
    public final void mo97111a() {
        super.mo97111a();
        m106221g();
        this.f123638n = "";
        this.f123639o = "";
        this.f123637m = false;
    }

    /* renamed from: b */
    public final int mo97117b() {
        if (this.f123637m) {
            Integer b = C39630m.m88234a().mo58604b().mo80585g().mo80587a().mo50197b();
            if (b != null) {
                return b.intValue();
            }
        }
        return -1;
    }

    /* renamed from: g */
    private final void m106221g() {
        String a = C35523d.m80266a(C43214dh.m94817a().mo50201b());
        C52711k.m112236a((Object) a, "MusicModelUtils.getMusic…ger.inst().getCurMusic())");
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f131134a = null;
        vEPreviewMusicParams.f131135b = 0;
        vEPreviewMusicParams.f131139f = a;
        vEPreviewMusicParams.f131136c = 0;
        vEPreviewMusicParams.f131137d = 0;
        if (C43214dh.m94817a().mo50201b() != null) {
            C42482c b = C43214dh.m94817a().mo50201b();
            if (b == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) b, "PublishManager.inst().getCurMusic()!!");
            vEPreviewMusicParams.f131140g = b.getPreviewStartTime();
        }
        C0198r e = this.f123362d.mo110460e();
        C52711k.m112236a((Object) e, "mViewModel.previewMusicParams");
        e.setValue(vEPreviewMusicParams);
        this.f123363e = this.f123360b.mMusicPath;
        this.f123360b.mMusicPath = null;
        this.f123360b.musicId = a;
        this.f123360b.mMusicStart = 0;
        mo97116a(this.f123359a.mo97034a(this.f123360b.mMusicPath));
        mo97118b(false);
        this.f123360b.musicVolume = 0.5f;
        this.f123636l = null;
    }

    /* renamed from: a */
    public final void mo97116a(boolean z) {
        this.f123640p.mo96902a(z);
    }

    public C49229b(FragmentActivity fragmentActivity, C49098ak akVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(akVar, "musicCallback");
        super(fragmentActivity, akVar);
        JediViewModel a = C48927d.m105736a(fragmentActivity).mo96760a(EditMusicViewModel.class);
        C52711k.m112236a((Object) a, "JediViewModelProviders.o…sicViewModel::class.java)");
        this.f123640p = (EditMusicViewModel) a;
    }

    /* renamed from: a */
    public final void mo97115a(String str, String str2) {
        super.mo97115a(str, str2);
        this.f123638n = C35523d.m80266a(C43214dh.m94817a().mo50201b());
        this.f123639o = str2;
        this.f123637m = false;
        this.f123636l = C43214dh.m94817a().mo50201b();
    }

    /* renamed from: a */
    public final void mo97113a(C42482c cVar, boolean z, String str) {
        super.mo97113a(cVar, z, str);
        if (z) {
            EditMusicViewModel editMusicViewModel = this.f123640p;
            if (cVar == null) {
                C52711k.m112234a();
            }
            C52711k.m112240b(cVar, "model");
            editMusicViewModel.mo22530c(new C48971e(cVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0290  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97114a(java.lang.String r12, com.p683ss.android.ugc.aweme.shortvideo.C42482c r13, boolean r14) {
        /*
            r11 = this;
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r11.f123359a
            boolean r0 = r0.mo97034a(r12)
            r11.mo97116a(r0)
            r0 = 0
            r1 = 0
            if (r13 != 0) goto L_0x001c
            com.ss.android.ugc.aweme.shortvideo.dh r12 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            r12.mo50200a(r0)
            r11.m106221g()
            r11.f123636l = r0
            r11.f123637m = r1
            return
        L_0x001c:
            long r2 = r13.f107429id
            com.ss.android.ugc.aweme.shortvideo.c r4 = r11.f123636l
            if (r4 == 0) goto L_0x0029
            long r4 = r4.f107429id
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0029
            return
        L_0x0029:
            com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            r2.mo50200a(r13)
            android.support.v4.app.FragmentActivity r2 = r11.f123368j
            com.ss.android.ugc.gamora.b.c r2 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r2)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel> r3 = com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel.class
            com.bytedance.jedi.arch.JediViewModel r2 = r2.mo96760a(r3)
            java.lang.String r3 = "JediViewModelProviders.o…kerViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r2 = (com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel) r2
            r2.mo96880g()
            com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r2 = r2.mo50201b()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.imported.C35523d.m80266a(r2)
            java.lang.String r3 = "MusicModelUtils.getMusic…ger.inst().getCurMusic())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            dmt.av.video.VEPreviewMusicParams r3 = new dmt.av.video.VEPreviewMusicParams
            r3.<init>()
            r3.f131134a = r12
            r3.f131135b = r1
            r3.f131139f = r2
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
            if (r4 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
            if (r4 != 0) goto L_0x0079
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0079:
            java.lang.String r5 = "PublishManager.inst().getCurMusic()!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            float r4 = r4.getPreviewStartTime()
            r3.f131140g = r4
        L_0x0084:
            int r9 = com.p683ss.android.ugc.aweme.utils.C47807de.m103443a(r12, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r11.f123360b
            boolean r4 = com.p683ss.android.ugc.aweme.utils.C47807de.m103445a(r4)
            int r4 = com.p683ss.android.ugc.aweme.utils.C47807de.m103443a(r12, r4)
            r3.f131136c = r4
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
            if (r4 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
            if (r4 != 0) goto L_0x00ab
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ab:
            int r4 = r4.getShootDuration()
            if (r4 <= 0) goto L_0x00e1
            int r4 = r3.f131136c
            com.ss.android.ugc.aweme.shortvideo.dh r5 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r5 = r5.mo50201b()
            if (r5 != 0) goto L_0x00c0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c0:
            int r5 = r5.getShootDuration()
            int r4 = r4 - r5
            int r4 = java.lang.Math.abs(r4)
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r5) goto L_0x00e1
            com.ss.android.ugc.aweme.shortvideo.dh r4 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.mo50201b()
            if (r4 != 0) goto L_0x00da
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00da:
            int r4 = r4.getShootDuration()
            r3.f131137d = r4
            goto L_0x00e5
        L_0x00e1:
            int r4 = r3.f131136c
            r3.f131137d = r4
        L_0x00e5:
            dmt.av.video.VEVideoPublishEditViewModel r4 = r11.f123362d
            android.arch.lifecycle.r r4 = r4.mo110460e()
            java.lang.String r5 = "mViewModel.previewMusicParams"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            r4.setValue(r3)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r11.f123360b
            java.lang.String r4 = r4.mMusicPath
            r11.f123363e = r4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r11.f123360b
            r4.mMusicPath = r12
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r11.f123360b
            r4.musicId = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r11.f123360b
            r4.mMusicStart = r1
            int r4 = r3.f131137d
            r5 = 60000(0xea60, float:8.4078E-41)
            if (r4 <= 0) goto L_0x0117
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r11.f123360b
            int r3 = r3.f131137d
            int r3 = java.lang.Math.min(r3, r5)
            r4.mMusicEnd = r3
            goto L_0x0121
        L_0x0117:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r11.f123360b
            int r3 = r3.f131136c
            int r3 = java.lang.Math.min(r3, r5)
            r4.mMusicEnd = r3
        L_0x0121:
            java.lang.String r3 = r11.f123638n
            r4 = 1
            if (r3 == 0) goto L_0x0133
            boolean r3 = r3.equals(r2)
            if (r3 != r4) goto L_0x0133
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            java.lang.String r3 = r11.f123639o
            r14.mMusicOrigin = r3
            goto L_0x015a
        L_0x0133:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r11.f123360b
            if (r14 == 0) goto L_0x013a
            java.lang.String r6 = "edit_page_recommend"
            goto L_0x013c
        L_0x013a:
            java.lang.String r6 = "edit_page_recommend_favorite"
        L_0x013c:
            r3.mMusicOrigin = r6
            if (r14 == 0) goto L_0x015a
            if (r13 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            com.ss.android.ugc.aweme.common.LogPbBean r3 = r13.getLogPb()
            if (r3 == 0) goto L_0x014f
            java.lang.String r3 = r3.getImprId()
            goto L_0x0150
        L_0x014f:
            r3 = r0
        L_0x0150:
            r14.aiMusicLogPbImprId = r3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            int r3 = r13.getComeFromForMod()
            r14.comFrom = r3
        L_0x015a:
            com.ss.android.ugc.gamora.editor.EditViewModel r14 = r11.f123359a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r11.f123360b
            java.lang.String r3 = r3.mMusicPath
            boolean r14 = r14.mo97034a(r3)
            r11.mo97116a(r14)
            r11.mo97118b(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            r14.mCurMusicLength = r9
            com.ss.android.ugc.gamora.editor.EditViewModel r14 = r11.f123359a
            int r14 = r14.mo97026H()
            if (r14 <= r9) goto L_0x0179
            r11.mo97116a(r1)
        L_0x0179:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            r3 = 1056964608(0x3f000000, float:0.5)
            r14.musicVolume = r3
            com.ss.android.ugc.gamora.editor.EditVolumeViewModel r14 = r11.f123365g
            r6 = 50
            r14.mo97066a(r6)
            dmt.av.video.VEVideoPublishEditViewModel r14 = r11.f123362d
            android.arch.lifecycle.r r14 = r14.mo110468m()
            java.lang.String r6 = "mViewModel.volumeChangeOpLiveData"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r6)
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r3 = com.p683ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r3)
            r14.setValue(r3)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            boolean r14 = r14.isMvThemeVideoType()
            if (r14 == 0) goto L_0x01ff
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            com.ss.android.ugc.aweme.at.b r14 = r14.mvCreateVideoData
            int r14 = r14.mvType
            if (r14 != r4) goto L_0x01ff
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            com.ss.android.ugc.aweme.at.b r14 = r14.mvCreateVideoData
            java.util.List<java.lang.String> r14 = r14.musicIds
            boolean r14 = r14.contains(r2)
            if (r14 == 0) goto L_0x01ea
            com.ss.android.ugc.gamora.editor.EditViewModel r14 = r11.f123359a
            android.arch.lifecycle.r r14 = r14.mo97038h()
            java.lang.Object r14 = r14.getValue()
            com.ss.android.ugc.asve.c.c r14 = (com.p683ss.android.ugc.asve.p1239c.C20347c) r14
            if (r14 == 0) goto L_0x01c6
            com.ss.android.vesdk.VEMVAudioInfo r0 = r14.mo43060f()
        L_0x01c6:
            if (r0 == 0) goto L_0x0234
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            int r2 = r0.trimIn
            r14.mMusicStart = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            int r2 = r0.trimOut
            int r2 = java.lang.Math.min(r2, r5)
            r14.mMusicEnd = r2
            com.ss.android.ugc.gamora.editor.ak r5 = r11.f123369k
            java.lang.String r6 = r0.path
            java.lang.String r14 = "it.path"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r14)
            int r7 = r0.trimIn
            int r8 = r0.trimOut
            r10 = 1
            r5.mo97124a(r6, r7, r8, r9, r10)
            goto L_0x0234
        L_0x01ea:
            com.ss.android.ugc.gamora.editor.ak r5 = r11.f123369k
            if (r12 != 0) goto L_0x01f1
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01f1:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            int r7 = r14.mMusicStart
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14 = r11.f123360b
            int r8 = r14.mMusicEnd
            r10 = 1
            r6 = r12
            r5.mo97124a(r6, r7, r8, r9, r10)
            goto L_0x0234
        L_0x01ff:
            android.support.v4.app.FragmentActivity r14 = r11.f123368j
            android.arch.lifecycle.h r14 = r14.getLifecycle()
            java.lang.String r0 = "activity.lifecycle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r0)
            android.arch.lifecycle.h$b r14 = r14.mo323a()
            android.arch.lifecycle.h$b r0 = android.arch.lifecycle.C0176h.C0178b.RESUMED
            if (r14 != r0) goto L_0x0234
            dmt.av.video.VEVideoPublishEditViewModel r14 = r11.f123362d
            android.arch.lifecycle.r r14 = r14.mo110466k()
            java.lang.String r0 = "mViewModel.previewControlLiveData"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r0)
            dmt.av.video.y r0 = dmt.p2652av.video.C53030y.m112774b()
            r14.setValue(r0)
            r2 = 0
            dmt.av.video.y r0 = dmt.p2652av.video.C53030y.m112775b(r2)
            r14.setValue(r0)
            dmt.av.video.y r0 = dmt.p2652av.video.C53030y.m112772a()
            r14.setValue(r0)
        L_0x0234:
            com.ss.android.ugc.aweme.shortvideo.dh r14 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r14 = r14.mo50201b()
            r11.f123636l = r14
            r11.f123637m = r4
            com.ss.android.ugc.aweme.shortvideo.dh r14 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r14 = r14.mo50201b()
            if (r14 == 0) goto L_0x0279
            com.ss.android.ugc.aweme.shortvideo.dh r14 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r14 = r14.mo50201b()
            if (r14 != 0) goto L_0x0257
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0257:
            int r14 = r14.shootDuration
            if (r14 <= 0) goto L_0x0279
            com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r14 = r11.f123366h
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.mo50201b()
            if (r0 != 0) goto L_0x026a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x026a:
            int r0 = r0.shootDuration
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r11.f123359a
            int r2 = r2.mo97026H()
            int r0 = java.lang.Math.min(r0, r2)
            r14.mo96890a(r0)
        L_0x0279:
            float[] r14 = r13.getMusicWaveData()
            if (r14 == 0) goto L_0x0290
            com.ss.android.ugc.aweme.shortvideo.d r12 = com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.m94741a(r13)
            com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r14 = r11.f123366h
            if (r12 != 0) goto L_0x028a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x028a:
            int r13 = r13.duration
            r14.mo96891a(r12, r13, r1)
            return
        L_0x0290:
            if (r12 == 0) goto L_0x02a0
            com.ss.android.ugc.aweme.shortvideo.cutmusic.e r14 = com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b.m94753a()
            com.ss.android.ugc.gamora.editor.b$a r0 = new com.ss.android.ugc.gamora.editor.b$a
            r0.<init>(r11, r13)
            com.ss.android.ugc.aweme.shortvideo.cutmusic.e$a r0 = (com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43192a) r0
            r14.mo87800a(r12, r0)
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.C49229b.mo97114a(java.lang.String, com.ss.android.ugc.aweme.shortvideo.c, boolean):void");
    }
}
