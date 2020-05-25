package com.p683ss.android.ugc.aweme.shortvideo;

import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bg */
public final /* synthetic */ class C42461bg implements C2205y {

    /* renamed from: a */
    private final GoNextFactoryFactory f107373a;

    /* renamed from: b */
    private final ShortVideoContext f107374b;

    /* renamed from: c */
    private final String f107375c;

    public C42461bg(GoNextFactoryFactory goNextFactoryFactory, ShortVideoContext shortVideoContext, String str) {
        this.f107373a = goNextFactoryFactory;
        this.f107374b = shortVideoContext;
        this.f107375c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01da, code lost:
        if (r6 == null) goto L_0x01fa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void subscribe(p064c.p065a.C2204x r18) {
        /*
            r17 = this;
            r0 = r17
            com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory r1 = r0.f107373a
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f107374b
            java.lang.String r3 = r0.f107375c
            if (r2 == 0) goto L_0x001e
            java.lang.String r4 = r2.f107131x
            com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b.f110608a = r4
            java.lang.String r4 = r2.f107132y
            com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b.f110609b = r4
            java.lang.String r4 = r2.f107133z
            com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b.f110610c = r4
            java.lang.String r4 = "video"
            com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b.f110611d = r4
            java.lang.String r4 = "shoot"
            com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43682b.f110612e = r4
        L_0x001e:
            com.ss.android.ugc.asve.recorder.view.ASCameraView r4 = r1.f106996b
            boolean r4 = r4.mo43642g()
            if (r4 == 0) goto L_0x0038
            com.ss.android.ugc.asve.recorder.view.ASCameraView r1 = r1.f106996b
            com.ss.android.ugc.asve.recorder.b r1 = r1.f56318e
            if (r1 != 0) goto L_0x0031
            java.lang.String r4 = "recorder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0031:
            com.ss.android.ugc.asve.recorder.b.a r1 = r1.mo43257e()
            r1.mo43312e()
        L_0x0038:
            boolean r1 = r2.mo86365f()
            r5 = 1
            if (r1 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.property.h r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r6 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.StudioDuetChangeLayout
            boolean r1 = r1.mo83103a(r6)
            r1 = r1 ^ r5
            goto L_0x005c
        L_0x0049:
            boolean r1 = r2.mo86366g()
            if (r1 != 0) goto L_0x005b
            int r1 = r2.f107095au
            if (r1 == r5) goto L_0x005b
            java.lang.String r1 = r2.mo86371l()
            if (r1 == 0) goto L_0x005b
            r1 = 1
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            com.ss.android.ugc.asve.recorder.m r6 = new com.ss.android.ugc.asve.recorder.m
            dmt.av.video.c.a r7 = new dmt.av.video.c.a
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r8 = r2.f107118k
            r7.<init>(r8)
            r6.<init>(r7)
            com.ss.android.vesdk.VERecordData r1 = com.p683ss.android.vesdk.VERecordData.m108914a(r6, r1)
            com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext r6 = r2.f107124q
            r7 = 0
            if (r6 == 0) goto L_0x00e3
            com.ss.android.vesdk.VERecordData r9 = r6.f107015d
            if (r9 == 0) goto L_0x00e3
            int r9 = r6.f107014c
            com.ss.android.vesdk.VERecordData r6 = r6.f107015d
            java.lang.String r10 = com.p683ss.android.vesdk.VERecordData.f126769a
            java.lang.String r11 = "replaceSegmentData..."
            com.p683ss.android.vesdk.C50792y.m109909a(r10, r11)
            if (r9 < 0) goto L_0x00db
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r10 = r6.f126770b
            int r10 = r10.size()
            if (r9 >= r10) goto L_0x00db
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r10 = r1.f126770b
            if (r10 == 0) goto L_0x00db
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r10 = r1.f126770b
            int r10 = r10.size()
            if (r10 != 0) goto L_0x0098
            goto L_0x00db
        L_0x0098:
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r10 = r6.f126770b
            java.lang.Object r10 = r10.remove(r9)
            com.ss.android.vesdk.VERecordData$VERecordSegmentData r10 = (com.p683ss.android.vesdk.VERecordData.VERecordSegmentData) r10
            long r10 = r10.f126776c
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r1 = r1.f126770b
            java.util.Iterator r1 = r1.iterator()
            r12 = r7
        L_0x00a9:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x00e2
            java.lang.Object r14 = r1.next()
            com.ss.android.vesdk.VERecordData$VERecordSegmentData r14 = (com.p683ss.android.vesdk.VERecordData.VERecordSegmentData) r14
            long r4 = r14.f126776c
            long r4 = r4 + r12
            long r4 = r4 - r10
            int r16 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r16 < 0) goto L_0x00cc
            long r10 = r10 - r12
            r14.f126777d = r10
            r14.f126776c = r10
            r14.f126783j = r10
            r14.f126780g = r10
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r1 = r6.f126770b
            r1.add(r9, r14)
            goto L_0x00e2
        L_0x00cc:
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r4 = r6.f126770b
            int r5 = r9 + 1
            r4.add(r9, r14)
            long r7 = r14.f126776c
            long r12 = r12 + r7
            r9 = r5
            r5 = 1
            r7 = 0
            goto L_0x00a9
        L_0x00db:
            java.lang.String r1 = com.p683ss.android.vesdk.VERecordData.f126769a
            java.lang.String r4 = "参数错误"
            com.p683ss.android.vesdk.C50792y.m109914d(r1, r4)
        L_0x00e2:
            r1 = r6
        L_0x00e3:
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r4 = r2.f107118k
            java.io.File r4 = r4.mo86455c()
            java.lang.String r4 = r4.getAbsolutePath()
            r1.f126772d = r4
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r4 = r2.f107118k
            java.io.File r4 = r4.mo86456d()
            java.lang.String r4 = r4.getAbsolutePath()
            r1.f126773e = r4
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r4 = new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData
            r4.<init>()
            com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext r5 = r2.f107124q
            if (r5 == 0) goto L_0x010e
            com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext r5 = r2.f107124q
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r5 = r5.f107016e
            if (r5 == 0) goto L_0x010e
            com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext r4 = r2.f107124q
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r4 = r4.f107016e
        L_0x010e:
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r2 = r2.f107118k
            java.io.File r2 = r2.mo86460g()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r5 = "dir"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r5)
            r5 = 0
            if (r1 != 0) goto L_0x0123
            r6 = r5
            goto L_0x01ba
        L_0x0123:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r6 = new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData
            r6.<init>()
            boolean r7 = r1.f126771c
            r6.useMusic = r7
            java.lang.String r7 = r1.f126773e
            r6.concatAudio = r7
            java.lang.String r7 = r1.f126772d
            r6.concatVideo = r7
            r7 = 0
            r6.startTime = r7
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r7 = r1.f126770b
            if (r7 == 0) goto L_0x01b8
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r7 = r1.f126770b
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x01b8
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r8 = r1.f126770b
            int r8 = r8.size()
            r7.<init>(r8)
            java.util.List r7 = (java.util.List) r7
            r6.segmentDataList = r7
            java.util.List<com.ss.android.vesdk.VERecordData$VERecordSegmentData> r1 = r1.f126770b
            java.util.Iterator r1 = r1.iterator()
        L_0x0159:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x01b8
            java.lang.Object r7 = r1.next()
            com.ss.android.vesdk.VERecordData$VERecordSegmentData r7 = (com.p683ss.android.vesdk.VERecordData.VERecordSegmentData) r7
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r8 = r6.segmentDataList
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r7 != 0) goto L_0x016d
            r11 = r5
            goto L_0x01ac
        L_0x016d:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r11 = new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData
            r11.<init>()
            java.lang.String r12 = r7.f126774a
            r11.videoPath = r12
            java.lang.String r12 = r7.f126775b
            r11.audioPath = r12
            long r12 = r7.f126779f
            long r12 = r12 / r9
            r11.startTime = r12
            long r12 = r7.f126780g
            long r12 = r12 / r9
            r11.endTime = r12
            java.lang.String r12 = r11.draftVideoPath
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0192
            java.lang.String r12 = r7.f126774a
            r11.draftVideoPath = r12
        L_0x0192:
            java.lang.String r12 = r11.draftAudioPath
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x01a0
            java.lang.String r12 = r7.f126775b
            r11.draftAudioPath = r12
        L_0x01a0:
            long r12 = r7.f126776c
            r11.videoLength = r12
            long r12 = r7.f126777d
            r11.audioLength = r12
            float r12 = r7.f126778e
            r11.speed = r12
        L_0x01ac:
            r8.add(r11)
            long r11 = r6.endTime
            long r7 = r7.f126776c
            long r7 = r7 / r9
            long r11 = r11 + r7
            r6.endTime = r11
            goto L_0x0159
        L_0x01b8:
            r6.curRecordingDir = r2
        L_0x01ba:
            if (r6 != 0) goto L_0x01bd
            goto L_0x01fa
        L_0x01bd:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r4.curMultiEditVideoRecordData
            if (r1 == 0) goto L_0x01dd
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r1 = r6.segmentDataList
            int r1 = r1.size()
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r2 = r4.curMultiEditVideoRecordData
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r2 = r2.segmentDataList
            int r2 = r2.size()
            if (r1 == r2) goto L_0x01d4
            r1 = 1
            r4.segmentSizeChange = r1
        L_0x01d4:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r4.curMultiEditVideoRecordData
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r6 = com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d.m95974b(r6, r1)
            if (r6 != 0) goto L_0x01dd
            goto L_0x01fa
        L_0x01dd:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r4.curMultiEditVideoRecordData
            if (r1 != 0) goto L_0x01f5
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r1 = r6.segmentDataList
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L_0x01ec
            r15 = 1
            goto L_0x01ed
        L_0x01ec:
            r15 = 0
        L_0x01ed:
            r6.isSingleVideo = r15
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r6.cloneData()
            r4.originMultiEditRecordData = r1
        L_0x01f5:
            r4.curMultiEditVideoRecordData = r6
            r4.videoMetaData = r3
            r5 = r4
        L_0x01fa:
            com.google.b.a.j r1 = com.google.p1057b.p1058a.C17418j.fromNullable(r5)
            r2 = r18
            r2.mo6282a(r1)
            r18.mo6273a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.C42461bg.subscribe(c.a.x):void");
    }
}
