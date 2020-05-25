package com.p683ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.common.utility.C9395d;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29069g;
import com.p683ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.C23893a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50657c;
import com.p683ss.android.vesdk.VECherEffectParam;
import com.p683ss.android.vesdk.VEUtils;
import com.taobao.android.dexposed.ClassUtils;
import dmt.p2652av.video.VEPreviewParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.b */
public final class C43668b {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.b$a */
    static final class C43669a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ EditPreviewInfo f110576a;

        /* renamed from: b */
        final /* synthetic */ C29059c f110577b;

        /* renamed from: c */
        final /* synthetic */ C52670a f110578c;

        C43669a(EditPreviewInfo editPreviewInfo, C29059c cVar, C52670a aVar) {
            this.f110576a = editPreviewInfo;
            this.f110577b = cVar;
            this.f110578c = aVar;
        }

        public final /* synthetic */ Object call() {
            List arrayList = new ArrayList();
            int i = 0;
            for (Object next : this.f110576a.getVideoList()) {
                int i2 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                EditVideoSegment editVideoSegment = (EditVideoSegment) next;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f110576a.getDraftDir());
                File file = new File(editVideoSegment.getVideoPath());
                C52711k.m112240b(file, "$this$nameWithoutExtension");
                String name = file.getName();
                C52711k.m112236a((Object) name, LeakCanaryFileProvider.f132049i);
                sb.append(C52830p.m112434a(name, ClassUtils.PACKAGE_SEPARATOR, (String) null, 2, (Object) null));
                sb.append("_copy");
                String sb2 = sb.toString();
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo == null) {
                    C52711k.m112234a();
                }
                int start = (int) videoCutInfo.getStart();
                VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo2 == null) {
                    C52711k.m112234a();
                }
                int end = (int) videoCutInfo2.getEnd();
                int[] iArr = {start, end};
                if (editVideoSegment.getVideoFileInfo().getDuration() - ((long) (end - start)) <= 5000) {
                    C50200d.m108347a(editVideoSegment.getVideoPath(), sb2);
                    C50203g.m108358a("draftOpt==>copy full video data");
                } else {
                    File file2 = new File(sb2);
                    if (!file2.exists()) {
                        C50200d.m108339a(sb2, true);
                    } else {
                        file2.delete();
                    }
                    VEUtils.trimToDraft(editVideoSegment.getVideoPath(), new int[]{start, end}, sb2, iArr);
                    C50203g.m108358a("draftOpt==>copy apart video data");
                }
                EditVideoSegment editVideoSegment2 = new EditVideoSegment(sb2, editVideoSegment.getAudioPath(), VideoFileInfo.copy$default(editVideoSegment.getVideoFileInfo(), 0, 0, 0, 0, 0, 31, null));
                VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo3 != null) {
                    VideoCutInfo videoCutInfo4 = new VideoCutInfo((long) iArr[0], (long) iArr[1], videoCutInfo3.getSpeed(), videoCutInfo3.getRotate());
                    editVideoSegment2.setVideoCutInfo(videoCutInfo4);
                }
                arrayList.add(editVideoSegment2);
                i = i2;
            }
            this.f110577b.mo58756a(arrayList);
            this.f110578c.invoke();
            C43668b.m95937a(this.f110577b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public static final void m95939a(EditPreviewInfo editPreviewInfo, boolean z) {
        C52711k.m112240b(editPreviewInfo, "$this$removeRelatedFiles");
        if (z) {
            C50200d.m108342a(new File(editPreviewInfo.getDraftDir()));
        } else {
            for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
                C50200d.m108350b(editVideoSegment.getVideoPath());
                C50200d.m108350b(editVideoSegment.getAudioPath());
                StringBuilder sb = new StringBuilder();
                sb.append(C43308eb.f109493f);
                sb.append(C9395d.m18571a(editVideoSegment.getVideoPath()));
                sb.append(File.separator);
                C50200d.m108352c(sb.toString());
            }
        }
        String[] reverseVideoArray = editPreviewInfo.getReverseVideoArray();
        if (reverseVideoArray != null) {
            for (String b : reverseVideoArray) {
                C50200d.m108350b(b);
            }
        }
        String[] reverseAudioArray = editPreviewInfo.getReverseAudioArray();
        if (reverseAudioArray != null) {
            for (String b2 : reverseAudioArray) {
                C50200d.m108350b(b2);
            }
        }
        String[] tempVideoArray = editPreviewInfo.getTempVideoArray();
        if (tempVideoArray != null) {
            for (String b3 : tempVideoArray) {
                C50200d.m108350b(b3);
            }
        }
    }

    /* renamed from: a */
    public static final void m95938a(EditPreviewInfo editPreviewInfo, C29059c cVar, C52670a<C52860x> aVar) {
        C52711k.m112240b(editPreviewInfo, "$this$copy2Draft");
        C52711k.m112240b(cVar, "draft");
        C52711k.m112240b(aVar, "updateDraft");
        C0013i.m16a((Callable<TResult>) new C43669a<TResult>(editPreviewInfo, cVar, aVar));
    }

    /* renamed from: a */
    public static final void m95937a(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        C23893a aVar = new C23893a();
        aVar.mo49499a(cVar);
        C47702b.f120193a.mo94984a("tool_performance_draft_save", C42438az.m93209a().mo86524a("duration", System.currentTimeMillis() - cVar.f76129G).mo86524a("size", aVar.mo49498a()).f107329a);
    }

    /* renamed from: a */
    public static final boolean m95940a(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "$this$isMiracleGame");
        String str = videoPublishEditModel.mShootWay;
        if (str != null) {
            return C52830p.m112411b(str, "miracle_game", false, 2, null);
        }
        return false;
    }

    /* renamed from: a */
    public static final String m95936a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C43308eb.f109493f);
        sb.append("fast_import/");
        sb.append(System.currentTimeMillis());
        sb.append('/');
        return sb.toString();
    }

    /* renamed from: a */
    public static final EditVideoSegment m95931a(DraftVideoSegment draftVideoSegment) {
        C52711k.m112240b(draftVideoSegment, "$this$toEditVideoSegment");
        EditVideoSegment editVideoSegment = new EditVideoSegment(draftVideoSegment.f76022h, draftVideoSegment.f76023i, m95933a(draftVideoSegment.f76022h));
        VideoCutInfo videoCutInfo = new VideoCutInfo((long) draftVideoSegment.f76017c, (long) draftVideoSegment.f76018d, draftVideoSegment.f76020f, draftVideoSegment.f76021g);
        editVideoSegment.setVideoCutInfo(videoCutInfo);
        return editVideoSegment;
    }

    /* renamed from: a */
    public static final int m95929a(EditPreviewInfo editPreviewInfo) {
        C52711k.m112240b(editPreviewInfo, "$this$videoFps");
        if (((EditVideoSegment) editPreviewInfo.getVideoList().get(0)).getVideoFileInfo().getFps() == -100) {
            editPreviewInfo.getVideoList().set(0, EditVideoSegment.copy$default((EditVideoSegment) editPreviewInfo.getVideoList().get(0), null, null, m95933a(((EditVideoSegment) editPreviewInfo.getVideoList().get(0)).getVideoPath()), null, 11, null));
        }
        return ((EditVideoSegment) editPreviewInfo.getVideoList().get(0)).getVideoFileInfo().getFps();
    }

    /* renamed from: b */
    public static final C50657c[] m95941b(EditPreviewInfo editPreviewInfo) {
        C50657c cVar;
        C52711k.m112240b(editPreviewInfo, "$this$totalRotate");
        Iterable<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        Collection arrayList = new ArrayList(C52575l.m112104a(videoList, 10));
        for (EditVideoSegment videoCutInfo : videoList) {
            VideoCutInfo videoCutInfo2 = videoCutInfo.getVideoCutInfo();
            if (videoCutInfo2 != null) {
                int rotate = videoCutInfo2.getRotate();
                if (rotate == 90) {
                    cVar = C50657c.ROTATE_90;
                } else if (rotate == 180) {
                    cVar = C50657c.ROTATE_180;
                } else if (rotate != 270) {
                    cVar = C50657c.ROTATE_NONE;
                } else {
                    cVar = C50657c.ROTATE_270;
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            cVar = C50657c.ROTATE_NONE;
            arrayList.add(cVar);
        }
        Object[] array = ((List) arrayList).toArray(new C50657c[0]);
        if (array != null) {
            return (C50657c[]) array;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static final EditPreviewInfo m95930a(C29069g gVar) {
        C52711k.m112240b(gVar, "$this$toEditPreviewInfo");
        C43674g gVar2 = new C43674g(gVar.f76183a, gVar.f76184b, 0, 0, 12, null);
        EditPreviewInfo a = gVar2.mo89103a(m95931a((DraftVideoSegment) gVar.f76185c.get(0)));
        String str = ((DraftVideoSegment) gVar.f76185c.get(0)).f76024j;
        if (str != null) {
            a.setReverseVideoArray(new String[]{str});
        }
        String str2 = ((DraftVideoSegment) gVar.f76185c.get(0)).f76023i;
        if (str2 != null) {
            if (!C52830p.m112413c(str2, "reverse.wav", false, 2, null)) {
                str2 = null;
            }
            if (str2 != null) {
                a.setReverseAudioArray(new String[]{str2});
            }
        }
        String str3 = ((DraftVideoSegment) gVar.f76185c.get(0)).f76025k;
        if (str3 != null) {
            a.setTempVideoArray(new String[]{str3});
        }
        return a;
    }

    /* renamed from: a */
    public static final EditVideoSegment m95932a(VideoSegment videoSegment) {
        C52711k.m112240b(videoSegment, "$this$toEditVideoSegment");
        String a = videoSegment.mo86941a(false);
        C52711k.m112236a((Object) a, "getPath(false)");
        VideoFileInfo videoFileInfo = new VideoFileInfo(videoSegment.f107908g, videoSegment.f107909h, videoSegment.f107904c, videoSegment.mo86945b(), 0, 16, null);
        EditVideoSegment editVideoSegment = new EditVideoSegment(a, null, videoFileInfo);
        VideoCutInfo videoCutInfo = new VideoCutInfo(videoSegment.mo86952f(), videoSegment.mo86953g(), videoSegment.mo86954h(), videoSegment.f107912k);
        editVideoSegment.setVideoCutInfo(videoCutInfo);
        return editVideoSegment;
    }

    /* renamed from: a */
    public static final VideoFileInfo m95933a(String str) {
        int i;
        String str2 = str;
        int[] iArr = new int[10];
        if (str2 != null) {
            i = VEUtils.getVideoFileInfo(str2, iArr);
        } else {
            i = -1;
        }
        if (i == 0) {
            VideoFileInfo videoFileInfo = new VideoFileInfo(iArr[0], iArr[1], (long) iArr[3], iArr[7], 0, 16, null);
            return videoFileInfo;
        }
        VideoFileInfo videoFileInfo2 = new VideoFileInfo(0, 0, 0, 0, 0, 16, null);
        return videoFileInfo2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p2628d.C52855s<com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment, java.lang.Long, long[]> m95934a(com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r22, boolean r23, long r24) {
        /*
            java.lang.String r2 = "$this$videoCoverConfigure"
            r3 = r22
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r2)
            r2 = 2
            long[] r2 = new long[r2]
            r2 = {0, -1} // fill-array
            r4 = 1
            r5 = 0
            r6 = 0
            if (r23 == 0) goto L_0x005a
            java.lang.String[] r8 = r22.getReverseVideoArray()
            r9 = 0
            if (r8 == 0) goto L_0x001d
            r8 = r8[r5]
            goto L_0x001e
        L_0x001d:
            r8 = r9
        L_0x001e:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L_0x002b
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r8 = 0
            goto L_0x002c
        L_0x002b:
            r8 = 1
        L_0x002c:
            if (r8 != 0) goto L_0x005a
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r8 = new com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment
            java.lang.String[] r3 = r22.getReverseVideoArray()
            if (r3 == 0) goto L_0x0038
            r9 = r3[r5]
        L_0x0038:
            r11 = r9
            if (r11 != 0) goto L_0x003e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x003e:
            r12 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r3 = new com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 16
            r21 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r18, r19, r20, r21)
            r14 = 2
            r15 = 0
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r0 = r24
            goto L_0x00c1
        L_0x005a:
            java.util.List r8 = r22.getVideoList()
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = r6
            r6 = 0
        L_0x0066:
            if (r6 >= r8) goto L_0x00b2
            java.util.List r7 = r22.getVideoList()
            java.lang.Object r7 = r7.get(r6)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r7 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r7
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r11 = r7.getVideoCutInfo()
            if (r11 == 0) goto L_0x0089
            long r12 = r11.getEnd()
            long r14 = r11.getStart()
            long r12 = r12 - r14
            float r12 = (float) r12
            float r11 = r11.getSpeed()
            float r12 = r12 / r11
            long r11 = (long) r12
            goto L_0x0091
        L_0x0089:
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r11 = r7.getVideoFileInfo()
            long r11 = r11.getDuration()
        L_0x0091:
            r13 = 0
            long r11 = r11 + r9
            int r13 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r13 <= 0) goto L_0x00ae
            long r0 = r24 - r9
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r7 = r7.getVideoCutInfo()
            if (r7 == 0) goto L_0x00b5
            float r0 = (float) r0
            float r1 = r7.getSpeed()
            float r0 = r0 * r1
            long r7 = r7.getStart()
            float r1 = (float) r7
            float r0 = r0 + r1
            long r0 = (long) r0
            goto L_0x00b5
        L_0x00ae:
            int r6 = r6 + 1
            r9 = r11
            goto L_0x0066
        L_0x00b2:
            r0 = r24
            r6 = 0
        L_0x00b5:
            java.util.List r3 = r22.getVideoList()
            java.lang.Object r3 = r3.get(r6)
            r8 = r3
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r8 = (com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r8
            r6 = r9
        L_0x00c1:
            r2[r5] = r6
            r5 = r2[r5]
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r3 = r8.getVideoCutInfo()
            if (r3 == 0) goto L_0x00dc
            long r9 = r3.getEnd()
            long r11 = r3.getStart()
            long r9 = r9 - r11
            float r7 = (float) r9
            float r3 = r3.getSpeed()
            float r7 = r7 / r3
            long r9 = (long) r7
            goto L_0x00e4
        L_0x00dc:
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r3 = r8.getVideoFileInfo()
            long r9 = r3.getDuration()
        L_0x00e4:
            r3 = 0
            long r5 = r5 + r9
            r2[r4] = r5
            d.s r3 = new d.s
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.<init>(r8, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b.m95934a(com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo, boolean, long):d.s");
    }

    /* renamed from: a */
    public static final VEPreviewParams m95935a(VideoPublishEditModel videoPublishEditModel, int i, int i2) {
        C52711k.m112240b(videoPublishEditModel, "$this$toPreviewParams");
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        int size = previewInfo.getVideoList().size();
        String[] strArr = new String[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            strArr[i4] = "";
        }
        vEPreviewParams.mVideoPaths = strArr;
        String[] strArr2 = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr2[i5] = "";
        }
        vEPreviewParams.mAudioPaths = strArr2;
        for (Object next : previewInfo.getVideoList()) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                C52575l.m112100b();
            }
            EditVideoSegment editVideoSegment = (EditVideoSegment) next;
            vEPreviewParams.mVideoPaths[i3] = editVideoSegment.getVideoPath();
            vEPreviewParams.mAudioPaths[i3] = editVideoSegment.getAudioPath();
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                if (vEPreviewParams.speedArray == null) {
                    vEPreviewParams.speedArray = new float[size];
                }
                if (vEPreviewParams.rotateArray == null) {
                    vEPreviewParams.rotateArray = new int[size];
                }
                if (vEPreviewParams.mVTrimIn == null) {
                    vEPreviewParams.mVTrimIn = new int[size];
                }
                if (vEPreviewParams.mVTrimOut == null) {
                    vEPreviewParams.mVTrimOut = new int[size];
                }
                vEPreviewParams.speedArray[i3] = videoCutInfo.getSpeed();
                vEPreviewParams.rotateArray[i3] = videoCutInfo.getRotate();
                vEPreviewParams.mVTrimIn[i3] = (int) videoCutInfo.getStart();
                vEPreviewParams.mVTrimOut[i3] = (int) videoCutInfo.getEnd();
            }
            i3 = i6;
        }
        vEPreviewParams.sceneIn = (int) previewInfo.getSceneIn();
        vEPreviewParams.sceneOut = (int) previewInfo.getSceneOut();
        vEPreviewParams.previewWidth = previewInfo.getPreviewWidth();
        vEPreviewParams.previewHeight = previewInfo.getPreviewHeight();
        if (i != -1) {
            vEPreviewParams.mPageType = i;
        }
        if (i2 != -1) {
            vEPreviewParams.mFps = i2;
        }
        vEPreviewParams.mWorkspace = videoPublishEditModel.draftDir();
        vEPreviewParams.canvasWidth = videoPublishEditModel.mVideoCanvasWidth;
        vEPreviewParams.canvasHeight = videoPublishEditModel.mVideoCanvasHeight;
        vEPreviewParams.mVolume = videoPublishEditModel.voiceVolume;
        vEPreviewParams.mMusicVolume = videoPublishEditModel.musicVolume;
        vEPreviewParams.mMusicInPoint = videoPublishEditModel.mMusicStart;
        vEPreviewParams.mMusicOutPoint = videoPublishEditModel.mMusicEnd;
        vEPreviewParams.mMusicPath = videoPublishEditModel.mMusicPath;
        vEPreviewParams.isFastImport = videoPublishEditModel.isFastImport;
        vEPreviewParams.isCutSameType = videoPublishEditModel.isCutSameVideoType();
        vEPreviewParams.mIsFromDraft = videoPublishEditModel.mIsFromDraft;
        vEPreviewParams.videoEditorType = videoPublishEditModel.videoEditorType;
        vEPreviewParams.mvCreateVideoData = videoPublishEditModel.mvCreateVideoData;
        vEPreviewParams.statusCreateVideoData = videoPublishEditModel.statusCreateVideoData;
        vEPreviewParams.recordData = videoPublishEditModel.multiEditVideoRecordData;
        vEPreviewParams.stitchParams = videoPublishEditModel.stitchParams;
        if (videoPublishEditModel.veCherEffectParam != null) {
            String[] matrix = videoPublishEditModel.veCherEffectParam.getMatrix();
            double[] duration = videoPublishEditModel.veCherEffectParam.getDuration();
            boolean[] segUseCher = videoPublishEditModel.veCherEffectParam.getSegUseCher();
            if (segUseCher == null) {
                C52711k.m112234a();
            }
            vEPreviewParams.veCherEffectParam = new VECherEffectParam(matrix, duration, segUseCher);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            vEPreviewParams.veAudioEffectParam = videoPublishEditModel.veAudioEffectParam;
        }
        if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
            vEPreviewParams.mAudioPaths = null;
        }
        vEPreviewParams.fromPublishVideo = videoPublishEditModel.isReviewVideo();
        String[] strArr3 = vEPreviewParams.mAudioPaths;
        if (strArr3 != null) {
            List c = C52568f.m112082c(strArr3);
            if (c != null && c.isEmpty()) {
                vEPreviewParams.mAudioPaths = null;
            }
        }
        return vEPreviewParams;
    }
}
