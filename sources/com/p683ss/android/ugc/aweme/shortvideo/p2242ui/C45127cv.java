package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cv */
final /* synthetic */ class C45127cv implements Runnable {

    /* renamed from: a */
    private final VideoRecordNewActivity f114247a;

    C45127cv(VideoRecordNewActivity videoRecordNewActivity) {
        this.f114247a = videoRecordNewActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x031d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = r14.f114247a
            com.ss.android.ugc.aweme.shortvideo.ct r1 = r0.f113794t
            java.lang.String r2 = "addFragment onFragmentActivityCreated PlanC"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r2)
            android.widget.FrameLayout r2 = r0.f113797w
            if (r2 == 0) goto L_0x0010
            r2.removeAllViews()
        L_0x0010:
            if (r2 == 0) goto L_0x0017
            r3 = 8
            r2.setVisibility(r3)
        L_0x0017:
            r2 = 0
            com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45173f.f114293a = r2
            boolean r1 = r1 instanceof com.p683ss.android.ugc.aweme.shortvideo.C43225dr
            if (r1 == 0) goto L_0x03e7
            r1 = 2132020486(0x7f140d06, float:1.9679336E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.f113786l = r1
            java.lang.String r1 = "addFragment onFragmentActivityCreated initFilterModule"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r1)
            boolean r1 = com.p683ss.android.ugc.aweme.beauty.C23780d.m58365a()
            r3 = 1
            if (r1 != 0) goto L_0x0046
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            com.ss.android.ugc.aweme.property.l r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r5 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.BeautyModel
            int r4 = r4.mo83118b(r5)
            if (r4 <= 0) goto L_0x0043
            r4 = 1
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            r1.f107128u = r4
        L_0x0046:
            android.view.Window r1 = r0.getWindow()
            android.view.View r1 = r1.getDecorView()
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$2 r4 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$2
            r4.<init>()
            r1.addOnGlobalLayoutListener(r4)
            com.ss.android.ugc.gamora.recorder.sticker.a.n r1 = r0.mo91196f()
            r1.mo97807L()
            r1.mo97800E()
            com.ss.android.ugc.aweme.shortvideo.ui.cj r4 = new com.ss.android.ugc.aweme.shortvideo.ui.cj
            r4.<init>(r0, r1)
            com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45101d.m98616a(r4)
            com.ss.android.ugc.gamora.recorder.sticker.a.n r1 = r0.mo91196f()
            com.ss.android.ugc.gamora.recorder.sticker.a.e r1 = r1.mo97797B()
            r1.mo97784a()
            android.content.Intent r1 = r0.getIntent()
            r4 = 0
            if (r1 == 0) goto L_0x00e6
            com.ss.android.ugc.aweme.port.in.ab r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101168i
            android.content.Intent r5 = r0.getIntent()
            java.lang.String r6 = "music_wave_data"
            java.io.Serializable r5 = r5.getSerializableExtra(r6)
            com.ss.android.ugc.aweme.shortvideo.d r1 = r1.mo80568a(r5)
            if (r1 == 0) goto L_0x009b
            float[] r5 = r1.getMusicWavePointArray()
            boolean r5 = com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.m94744a(r5)
            if (r5 == 0) goto L_0x009b
            goto L_0x00e7
        L_0x009b:
            com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r1 = r1.mo50201b()
            if (r1 == 0) goto L_0x00e6
            float[] r5 = r1.getMusicWaveData()
            boolean r5 = com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.m94744a(r5)
            if (r5 == 0) goto L_0x00e6
            if (r1 == 0) goto L_0x00d7
            float[] r5 = r1.getMusicWaveData()
            boolean r5 = com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b.m94756a(r5)
            if (r5 == 0) goto L_0x00d7
            com.ss.android.ugc.aweme.shortvideo.d r5 = new com.ss.android.ugc.aweme.shortvideo.d
            r5.<init>()
            float[] r1 = r1.getMusicWaveData()
            java.lang.String r6 = "music.musicWaveData"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r6)
            int r6 = r1.length
            float[] r1 = java.util.Arrays.copyOf(r1, r6)
            java.lang.String r6 = "java.util.Arrays.copyOf(this, size)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r6)
            r5.setMusicWavePointArray(r1)
            goto L_0x00d8
        L_0x00d7:
            r5 = r4
        L_0x00d8:
            if (r5 == 0) goto L_0x00e6
            float[] r1 = r5.getMusicWavePointArray()
            boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.m94744a(r1)
            if (r1 == 0) goto L_0x00e6
            r1 = r5
            goto L_0x00e7
        L_0x00e6:
            r1 = r4
        L_0x00e7:
            if (r1 == 0) goto L_0x00f2
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.d r1 = com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.m94742a(r1)
            r5.f107070aV = r1
            goto L_0x0108
        L_0x00f2:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            java.lang.String r1 = r1.f107112e
            if (r1 == 0) goto L_0x0108
            com.ss.android.ugc.aweme.shortvideo.cutmusic.e r1 = com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.m94739a()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f113778d
            java.lang.String r5 = r5.f107112e
            com.ss.android.ugc.aweme.shortvideo.ui.ck r6 = new com.ss.android.ugc.aweme.shortvideo.ui.ck
            r6.<init>(r0)
            r1.mo87800a(r5, r6)
        L_0x0108:
            boolean r1 = r0.f113762A
            if (r1 != 0) goto L_0x011b
            r0.f113762A = r3
            com.ss.android.ugc.aweme.services.IInternalAVService r1 = com.p683ss.android.ugc.aweme.out.AVServiceImpl.createIInternalAVServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IInternalAVService r1 = (com.p683ss.android.ugc.aweme.services.IInternalAVService) r1
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r1 = r1.avSettingsService()
            r1.isXsSupport()
        L_0x011b:
            com.ss.android.ugc.aweme.shortvideo.record.c r1 = new com.ss.android.ugc.aweme.shortvideo.record.c
            r1.<init>(r0)
            r0.f113781g = r1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            if (r1 == 0) goto L_0x0277
            com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.m7844a(r0)
            java.lang.Class<com.ss.android.ugc.gamora.recorder.b.b> r5 = com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b.class
            com.bytedance.als.d r1 = r1.mo7341b(r5)
            com.ss.android.ugc.gamora.recorder.b.b r1 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b) r1
            com.ss.android.ugc.aweme.shortvideo.ct r5 = r0.f113794t
            if (r5 == 0) goto L_0x0270
            if (r1 != 0) goto L_0x013a
            goto L_0x0270
        L_0x013a:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f113778d
            boolean r5 = r5.f107056aH
            boolean r1 = r1.mo97488l()
            boolean r1 = com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a.m97076a(r5, r1)
            if (r1 == 0) goto L_0x0268
            java.lang.String r1 = "direct_shoot"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f113778d
            java.lang.String r5 = r5.f107132y
            boolean r1 = r1.equals(r5)
            java.lang.String r5 = "prop_reuse"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f113778d
            java.lang.String r6 = r6.f107132y
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0185
            java.lang.String r5 = "single_song"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f113778d
            java.lang.String r6 = r6.f107132y
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0185
            java.lang.String r5 = "prop_page"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f113778d
            java.lang.String r6 = r6.f107132y
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0185
            java.lang.String r5 = "challenge"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f113778d
            java.lang.String r6 = r6.f107132y
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r5 = 0
            goto L_0x0186
        L_0x0185:
            r5 = 1
        L_0x0186:
            if (r1 == 0) goto L_0x01ba
            com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.m7844a(r0)
            java.lang.Class<com.ss.android.ugc.gamora.recorder.b.b> r6 = com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b.class
            com.bytedance.als.d r1 = r1.mo7339a(r6)
            com.ss.android.ugc.gamora.recorder.b.b r1 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b) r1
            boolean r1 = r1.mo97489m()
            if (r1 == 0) goto L_0x01ba
            com.ss.android.ugc.aweme.shortvideo.n.a r1 = com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a.m97073a()
            android.arch.lifecycle.r r6 = new android.arch.lifecycle.r
            r6.<init>()
            com.ss.android.ugc.aweme.effectplatform.f r7 = com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a.m97072a(r1, r4, r3, r4)
            java.lang.String r8 = "livestreaming"
            r9 = 0
            java.lang.String r10 = ""
            r11 = 0
            r12 = 0
            com.ss.android.ugc.aweme.shortvideo.n.a$c r13 = new com.ss.android.ugc.aweme.shortvideo.n.a$c
            r13.<init>(r1, r6)
            com.ss.android.ugc.effectmanager.effect.c.l r13 = (com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l) r13
            r7.mo59139a(r8, r9, r10, r11, r12, r13)
            android.arch.lifecycle.LiveData r6 = (android.arch.lifecycle.LiveData) r6
        L_0x01ba:
            if (r5 == 0) goto L_0x0268
            com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.m7844a(r0)
            java.lang.Class<com.ss.android.ugc.gamora.recorder.b.b> r5 = com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b.class
            com.bytedance.als.d r1 = r1.mo7339a(r5)
            com.ss.android.ugc.gamora.recorder.b.b r1 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b) r1
            boolean r1 = r1.mo97490n()
            if (r1 != 0) goto L_0x01d7
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            java.lang.String r1 = r1.f107132y
            com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44330b.m97099b(r1)
            goto L_0x0277
        L_0x01d7:
            com.ss.android.ugc.aweme.shortvideo.n.a r1 = com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a.m97073a()
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r0.f113788n
            if (r5 != 0) goto L_0x01f5
            android.arch.lifecycle.r r1 = new android.arch.lifecycle.r
            r1.<init>()
            com.ss.android.ugc.aweme.mvp.b.a$a r5 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.ERROR
            com.ss.android.ugc.aweme.mvp.b.a r5 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.m84218a(r5, r4)
            r1.setValue(r5)
            android.arch.lifecycle.r r1 = new android.arch.lifecycle.r
            r1.<init>()
            android.arch.lifecycle.LiveData r1 = (android.arch.lifecycle.LiveData) r1
            goto L_0x025f
        L_0x01f5:
            java.lang.String r6 = r5.getExtra()
            java.lang.String r6 = com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a.m97074a(r6)
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x0237
            java.lang.String r5 = r5.getResourceId()
            android.arch.lifecycle.r r6 = new android.arch.lifecycle.r
            r6.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r8 = "panel"
            java.lang.String r9 = "livestreaming"
            r7.put(r8, r9)
            com.ss.android.ugc.aweme.effectplatform.f r8 = com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a.m97072a(r1, r4, r3, r4)
            java.lang.String[] r9 = new java.lang.String[r3]
            r9[r2] = r5
            java.util.List r5 = p2628d.p2629a.C52575l.m112101c(r9)
            com.ss.android.ugc.aweme.shortvideo.n.a$e r9 = new com.ss.android.ugc.aweme.shortvideo.n.a$e
            r9.<init>(r1, r6)
            com.ss.android.ugc.effectmanager.effect.c.h r9 = (com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h) r9
            r8.mo59144b(r5, r7, r9)
            r1 = r6
            android.arch.lifecycle.LiveData r1 = (android.arch.lifecycle.LiveData) r1
            goto L_0x025f
        L_0x0237:
            android.arch.lifecycle.r r5 = new android.arch.lifecycle.r
            r5.<init>()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0246
            r1 = r5
            android.arch.lifecycle.LiveData r1 = (android.arch.lifecycle.LiveData) r1
            goto L_0x025f
        L_0x0246:
            com.ss.android.ugc.aweme.effectplatform.f r7 = com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a.m97072a(r1, r4, r3, r4)
            java.lang.String[] r8 = new java.lang.String[r3]
            r8[r2] = r6
            java.util.List r6 = p2628d.p2629a.C52575l.m112101c(r8)
            com.ss.android.ugc.aweme.shortvideo.n.a$d r8 = new com.ss.android.ugc.aweme.shortvideo.n.a$d
            r8.<init>(r1, r5)
            com.ss.android.ugc.effectmanager.effect.c.i r8 = (com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i) r8
            r7.mo59141a(r6, r4, r2, r8)
            r1 = r5
            android.arch.lifecycle.LiveData r1 = (android.arch.lifecycle.LiveData) r1
        L_0x025f:
            com.ss.android.ugc.aweme.shortvideo.ui.cu r5 = new com.ss.android.ugc.aweme.shortvideo.ui.cu
            r5.<init>(r0)
            r1.observe(r0, r5)
            goto L_0x0277
        L_0x0268:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            java.lang.String r1 = r1.f107132y
            com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44330b.m97099b(r1)
            goto L_0x0277
        L_0x0270:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            java.lang.String r1 = r1.f107132y
            com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44330b.m97099b(r1)
        L_0x0277:
            com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.m7844a(r0)
            java.lang.Class<com.ss.android.ugc.gamora.recorder.b.b> r5 = com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b.class
            com.bytedance.als.d r1 = r1.mo7339a(r5)
            com.ss.android.ugc.gamora.recorder.b.b r1 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b) r1
            com.bytedance.als.f r1 = r1.mo97485e()
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$3 r5 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$3
            r5.<init>()
            r1.mo7349a(r0, r5)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            boolean r1 = r1.f107122o
            if (r1 == 0) goto L_0x02ae
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext r1 = r1.f107124q
            if (r1 == 0) goto L_0x02ae
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext r1 = r1.f107124q
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r1 = r1.f107018g
            if (r1 == 0) goto L_0x02ae
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext r5 = r5.f107124q
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r5 = r5.f107018g
            r1.mo86358a(r5)
        L_0x02ae:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            boolean r1 = r1.mo86362d()
            if (r1 == 0) goto L_0x02d1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r1 = r1.f107037P
            if (r1 == 0) goto L_0x02d1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.em r1 = r1.mo86375p()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f113778d
            long r5 = r5.mo86372m()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r7 = r7.f107037P
            com.ss.android.ugc.aweme.tools.r r1 = com.p683ss.android.ugc.aweme.tools.C47337r.m102706a(r1, r5, r7)
            goto L_0x02f8
        L_0x02d1:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            boolean r1 = r1.f107058aJ
            if (r1 == 0) goto L_0x02e8
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.em r1 = r1.mo86375p()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f113778d
            long r5 = r5.mo86372m()
            com.ss.android.ugc.aweme.tools.r r1 = com.p683ss.android.ugc.aweme.tools.C47337r.m102707a(r1, r5, r2)
            goto L_0x02f8
        L_0x02e8:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.em r1 = r1.mo86375p()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f113778d
            long r5 = r5.mo86372m()
            com.ss.android.ugc.aweme.tools.r r1 = com.p683ss.android.ugc.aweme.tools.C47337r.m102707a(r1, r5, r3)
        L_0x02f8:
            com.ss.android.ugc.aweme.shortvideo.ui.b.a r5 = r0.f113766E
            r5.mo91331a(r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            boolean r1 = r1.mo86362d()
            if (r1 == 0) goto L_0x031d
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            long r5 = r1.f107110c
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r1 = r1.f107036O
            long r7 = r1.getDuration()
            long r5 = r5 + r7
            com.ss.android.ugc.aweme.shortvideo.ui.b.a r1 = r0.f113766E
            com.ss.android.ugc.aweme.tools.o r7 = new com.ss.android.ugc.aweme.tools.o
            r7.<init>(r5)
            r1.mo91330a(r7)
            goto L_0x032b
        L_0x031d:
            com.ss.android.ugc.aweme.shortvideo.ui.b.a r1 = r0.f113766E
            com.ss.android.ugc.aweme.tools.o r5 = new com.ss.android.ugc.aweme.tools.o
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r0.f113778d
            long r6 = r6.f107110c
            r5.<init>(r6)
            r1.mo91330a(r5)
        L_0x032b:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            boolean r1 = r1.f107122o
            if (r1 == 0) goto L_0x0355
            com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.m7844a(r0)
            java.lang.Class<com.ss.android.ugc.gamora.recorder.l.a> r5 = com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a.class
            com.bytedance.als.d r1 = r1.mo7339a(r5)
            com.ss.android.ugc.gamora.recorder.l.a r1 = (com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a) r1
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext r5 = r5.f107124q
            r1.mo97687a(r5)
            r1.mo97684a(r2)
            com.ss.android.ugc.aweme.tools.u r1 = new com.ss.android.ugc.aweme.tools.u
            r1.<init>()
            com.ss.android.ugc.aweme.shortvideo.ct r5 = r0.f113794t
            com.ss.android.ugc.aweme.shortvideo.b.a r5 = r5.mo86791d()
            r5.mo86536a(r1)
        L_0x0355:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            boolean r1 = r1.mo86365f()
            if (r1 != 0) goto L_0x0365
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            boolean r1 = r1.mo86366g()
            if (r1 == 0) goto L_0x0374
        L_0x0365:
            com.bytedance.als.ApiCenter r1 = com.bytedance.als.ApiCenter.m7844a(r0)
            java.lang.Class<com.ss.android.ugc.gamora.recorder.k.a> r5 = com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a.class
            com.bytedance.als.d r1 = r1.mo7339a(r5)
            com.ss.android.ugc.gamora.recorder.k.a r1 = (com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a) r1
            r1.mo97680a(r2)
        L_0x0374:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r0.f113778d
            boolean r1 = r1.mo86362d()
            if (r1 == 0) goto L_0x03c1
            com.ss.android.ugc.gamora.recorder.c.a r1 = com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a.C49608a.m107072a(r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r2 = r2.f107036O
            boolean r2 = com.p683ss.android.ugc.aweme.shortvideo.record.p2224b.C44451a.m97278a(r2)
            if (r2 == 0) goto L_0x03b7
            com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r4 = r4.f107036O
            com.ss.android.ugc.aweme.shortvideo.c r4 = r4.getMusic()
            r2.mo50200a(r4)
            com.ss.android.ugc.aweme.bw.a.d r2 = new com.ss.android.ugc.aweme.bw.a.d
            r6 = 0
            java.lang.String r7 = ""
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r4 = r4.f107036O
            com.ss.android.ugc.aweme.shortvideo.c r8 = r4.getMusic()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r0.f113778d
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r4 = r4.f107036O
            java.lang.String r9 = r4.getMusicPath()
            r10 = 1
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r1.mo97514a(r2)
            goto L_0x03be
        L_0x03b7:
            com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            r2.mo50200a(r4)
        L_0x03be:
            r1.mo97525m()
        L_0x03c1:
            boolean r1 = r0.f113790p
            if (r1 == 0) goto L_0x03cf
            com.ss.android.ugc.aweme.base.SafeHandler r1 = r0.f113780f
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$4 r2 = new com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$4
            r2.<init>()
            r1.post(r2)
        L_0x03cf:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = r0.mo91199i()
            android.arch.lifecycle.r<java.lang.Boolean> r1 = r0.f107136c
            if (r1 != 0) goto L_0x03de
            android.arch.lifecycle.r r1 = new android.arch.lifecycle.r
            r1.<init>()
            r0.f107136c = r1
        L_0x03de:
            android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f107136c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r1)
        L_0x03e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45127cv.run():void");
    }
}
