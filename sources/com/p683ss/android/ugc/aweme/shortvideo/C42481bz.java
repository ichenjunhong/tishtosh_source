package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46448b;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bz */
public final class C42481bz {
    /* renamed from: a */
    static void m93332a(C29059c cVar, Object obj) {
        if (cVar != null) {
            C29061d.m68499d(cVar);
            C46448b.m100837a((List<TimeSpeedModelExtension>) ShortVideoContext.m93017a(cVar.f76130H));
            return;
        }
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            C43668b.m95939a(videoPublishEditModel.getPreviewInfo(), videoPublishEditModel.isFastImport);
            if (videoPublishEditModel.publishFromLive()) {
                C50200d.m108350b(videoPublishEditModel.livePublishModel.getFilePath());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86608a(android.content.Context r11, java.lang.Object r12, com.p683ss.android.ugc.aweme.draft.model.C29059c r13, java.lang.String r14, java.lang.String r15) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
            r1 = 1
            if (r0 == 0) goto L_0x0013
            r2 = r12
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = (com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r2
            int r2 = r2.videoType
            boolean r2 = com.p683ss.android.ugc.aweme.photo.publish.C38704c.m86062c(r2)
            if (r2 == 0) goto L_0x0013
            r2 = 2
            r7 = 2
            goto L_0x0014
        L_0x0013:
            r7 = 1
        L_0x0014:
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r4 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.CloseUploadExtractFrames
            int r2 = r2.mo83118b(r4)
            if (r2 != 0) goto L_0x0040
            boolean r2 = r12 instanceof com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext
            if (r2 == 0) goto L_0x0023
            goto L_0x0041
        L_0x0023:
            if (r0 == 0) goto L_0x0040
            r2 = r12
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = (com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r2
            boolean r4 = r2.isMvThemeVideoType()
            if (r4 != 0) goto L_0x0041
            boolean r4 = r2.isStatusVideoType()
            if (r4 != 0) goto L_0x0041
            boolean r4 = r2.isCutSameVideoType()
            if (r4 == 0) goto L_0x003b
            goto L_0x0041
        L_0x003b:
            boolean r1 = r2.shouldUploadExtractFrames()
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            if (r1 != 0) goto L_0x0058
            m93332a(r13, r12)
            if (r0 == 0) goto L_0x0057
            r0 = r12
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel r0 = r0.extractFramesModel
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.shortvideo.ca r0 = new com.ss.android.ugc.aweme.shortvideo.ca
            r0.<init>(r12)
            p001a.C0013i.m16a(r0)
        L_0x0057:
            return
        L_0x0058:
            a.j r1 = new a.j
            r1.<init>()
            boolean r4 = r12 instanceof com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext
            r5 = 0
            if (r4 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.shortvideo.cg r0 = new com.ss.android.ugc.aweme.shortvideo.cg
            r0.<init>(r12, r1)
            p001a.C0013i.m22b(r0)
            goto L_0x00df
        L_0x006c:
            if (r0 == 0) goto L_0x00e3
            r0 = r12
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            boolean r4 = r0.isMvThemeVideoType()
            if (r4 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.shortvideo.ch r0 = new com.ss.android.ugc.aweme.shortvideo.ch
            r0.<init>(r12, r1)
            p001a.C0013i.m22b(r0)
            goto L_0x00df
        L_0x0080:
            boolean r4 = r0.isStatusVideoType()
            if (r4 == 0) goto L_0x009d
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r4 = r0.statusCreateVideoData
            java.lang.String r4 = r4.getBgFrom()
            java.lang.String r6 = "upload"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x009d
            com.ss.android.ugc.aweme.shortvideo.ci r0 = new com.ss.android.ugc.aweme.shortvideo.ci
            r0.<init>(r12, r1)
            p001a.C0013i.m22b(r0)
            goto L_0x00df
        L_0x009d:
            boolean r4 = r0.mFromCut
            if (r4 != 0) goto L_0x00d7
            boolean r4 = r0.mFromMultiCut
            if (r4 != 0) goto L_0x00d7
            boolean r4 = com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b.m95940a(r0)
            if (r4 == 0) goto L_0x00ac
            goto L_0x00d7
        L_0x00ac:
            boolean r4 = r0.containBackgroundVideo
            if (r4 == 0) goto L_0x00b9
            com.ss.android.ugc.aweme.shortvideo.ck r0 = new com.ss.android.ugc.aweme.shortvideo.ck
            r0.<init>(r12, r1)
            p001a.C0013i.m22b(r0)
            goto L_0x00df
        L_0x00b9:
            boolean r4 = r0.isCutSameVideoType()
            if (r4 == 0) goto L_0x00d3
            com.ss.android.ugc.aweme.draft.model.CutSameEditData r0 = r0.cutSameEditData
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r0 = r0.f76014g
            boolean r4 = com.p683ss.android.ugc.tools.utils.C50201e.m108355a(r0)
            if (r4 == 0) goto L_0x00ca
            goto L_0x00e1
        L_0x00ca:
            com.ss.android.ugc.aweme.shortvideo.cl r4 = new com.ss.android.ugc.aweme.shortvideo.cl
            r4.<init>(r0, r12, r1)
            p001a.C0013i.m22b(r4)
            goto L_0x00df
        L_0x00d3:
            r1.mo47b(r5)
            goto L_0x00df
        L_0x00d7:
            com.ss.android.ugc.aweme.shortvideo.cj r0 = new com.ss.android.ugc.aweme.shortvideo.cj
            r0.<init>(r12, r1)
            p001a.C0013i.m22b(r0)
        L_0x00df:
            a.i<TResult> r5 = r1.f77a
        L_0x00e1:
            r8 = r5
            goto L_0x00e8
        L_0x00e3:
            a.i r5 = p001a.C0013i.m25h()
            goto L_0x00e1
        L_0x00e8:
            com.ss.android.ugc.aweme.shortvideo.cb r9 = new com.ss.android.ugc.aweme.shortvideo.cb
            r0 = r9
            r1 = r10
            r2 = r13
            r3 = r12
            r4 = r14
            r5 = r15
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo19a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.C42481bz.mo86608a(android.content.Context, java.lang.Object, com.ss.android.ugc.aweme.draft.model.c, java.lang.String, java.lang.String):void");
    }
}
