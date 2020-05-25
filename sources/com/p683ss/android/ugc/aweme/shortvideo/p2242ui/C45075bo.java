package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import p001a.C0011g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bo */
final /* synthetic */ class C45075bo implements C0011g {

    /* renamed from: a */
    private final C45054bg f114167a;

    C45075bo(C45054bg bgVar) {
        this.f114167a = bgVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(p001a.C0013i r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.ui.bg r6 = r5.f114167a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            boolean r0 = r0.hasRecord()
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            java.lang.String r0 = r0.getAudioUrl()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f114131q
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r1.veAudioRecorderParam
            java.lang.String r1 = com.p683ss.android.ugc.tools.utils.C50197a.m108326a(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            java.lang.String r0 = r0.getAudioUrl()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f114131q
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r1.veAudioRecorderParam
            java.lang.String r1 = com.p683ss.android.ugc.tools.utils.C50197a.m108326a(r1)
            com.p683ss.android.ugc.aweme.video.C48016e.m103948c(r0, r1)
        L_0x003b:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            if (r0 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            java.lang.String r0 = r0.getExtraUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x005a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            java.lang.String r0 = r0.getExtraUrl()
            com.p683ss.android.ugc.aweme.video.C48016e.m103947c(r0)
        L_0x005a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            boolean r0 = r0.containBackgroundVideo
            if (r0 == 0) goto L_0x0075
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            java.lang.String r1 = "publishModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            java.lang.String r0 = com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46448b.m100834a(r0)
            java.lang.String r1 = com.p683ss.android.ugc.aweme.shortvideo.C43308eb.f109495h
            com.p683ss.android.ugc.aweme.video.C48016e.m103943b(r1, r0)
            java.lang.String r0 = com.p683ss.android.ugc.aweme.shortvideo.C43308eb.f109495h
            com.p683ss.android.ugc.aweme.video.C48016e.m103954e(r0)
        L_0x0075:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            int r0 = r0.mShootMode
            r1 = 13
            if (r0 != r1) goto L_0x00ac
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            java.lang.String r0 = r0.greenScreenDefaultImage
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f114131q
            java.lang.String r1 = r1.draftDir()
            java.lang.String r2 = "draftDir"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00ac
            java.lang.String r2 = com.p683ss.android.ugc.aweme.greenscreen.C32893h.m75781a(r0)
            java.lang.String r0 = com.p683ss.android.ugc.aweme.greenscreen.C32893h.m75782a(r0, r1)
            boolean r1 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r2)
            if (r1 == 0) goto L_0x00ac
            boolean r1 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r0)
            if (r1 != 0) goto L_0x00ac
            com.p683ss.android.ugc.aweme.video.C48016e.m103948c(r2, r0)
        L_0x00ac:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.f114131q
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r0 = r0.infoStickerModel
            java.lang.String r0 = r0.infoStickerDraftDir
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f114131q
            boolean r1 = r1.hasInfoStickers()
            if (r1 == 0) goto L_0x0124
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = r6.f114131q
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r6 = r6.infoStickerModel
            java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r6 = r6.stickers
            java.util.Iterator r6 = r6.iterator()
        L_0x00c4:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0124
            java.lang.Object r1 = r6.next()
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r1 = (com.p683ss.android.ugc.aweme.infosticker.StickerItemModel) r1
            boolean r2 = r1.isSubtitle()
            if (r2 != 0) goto L_0x00c4
            boolean r2 = r1.isSubtitleRule()
            if (r2 != 0) goto L_0x00c4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r1.path
            r3.<init>(r4)
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r3 = r1.isInfoSticker()
            if (r3 != 0) goto L_0x0107
            java.lang.String r1 = r1.path
            com.p683ss.android.ugc.aweme.video.C48016e.m103948c(r1, r2)
            goto L_0x00c4
        L_0x0107:
            boolean r3 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r2)
            if (r3 != 0) goto L_0x00c4
            java.lang.String r1 = r1.path
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = java.io.File.separator
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.p683ss.android.ugc.aweme.video.C48016e.m103943b(r1, r2)
            goto L_0x00c4
        L_0x0124:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45075bo.then(a.i):java.lang.Object");
    }
}
