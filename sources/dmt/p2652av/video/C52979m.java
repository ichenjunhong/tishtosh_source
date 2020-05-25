package dmt.p2652av.video;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0198r;
import android.os.Looper;
import android.support.p030v4.p040os.C0958a;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p523c.C9393e;
import com.google.gson.p1077b.C17956a;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ttve.editorInfo.C20084a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C42447bc;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43211de;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43808fc;
import com.p683ss.android.ugc.aweme.shortvideo.C43810fe;
import com.p683ss.android.ugc.aweme.shortvideo.C43829ff;
import com.p683ss.android.ugc.aweme.shortvideo.C43830fg;
import com.p683ss.android.ugc.aweme.shortvideo.StoryBoomModel;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42669p.C42670a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43446ba;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43449bd;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43451be;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2190b.C43442b;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44455e;
import com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45376ac;
import com.p683ss.android.ugc.aweme.utils.C47807de;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.VEVideoEncodeSettings;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.C50585a;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET;
import com.p683ss.android.vesdk.VEWatermarkParam;
import dmt.p2652av.video.p2653a.C52885a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p001a.C0013i;

/* renamed from: dmt.av.video.m */
public final class C52979m implements C0184k {

    /* renamed from: a */
    public List<String> f131393a;

    /* renamed from: b */
    public int f131394b;

    /* renamed from: c */
    public C50711k f131395c;

    /* renamed from: d */
    public C50711k f131396d;

    /* renamed from: e */
    private C0185l f131397e;

    public final C0176h getLifecycle() {
        return this.f131397e;
    }

    private C52979m() {
        this.f131397e = new C0185l(this);
        this.f131393a = new ArrayList();
        this.f131394b = -1;
        this.f131397e.mo333a(C0178b.STARTED);
    }

    public C52979m(int i) {
        this();
        this.f131394b = i;
    }

    /* renamed from: a */
    private static boolean m112709a(int i) {
        if (C38704c.m86062c(i)) {
            if (C39618d.f101153Q.f103917a > 0.0f) {
                return true;
            }
            return false;
        } else if (C39618d.f101153Q.f103918b > 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m112712c(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isFastImport || C39618d.f101151O.mo83117a(C40796a.VEFastImportIgnoreRecode)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int[] m112710a(VideoPublishEditModel videoPublishEditModel) {
        int[] d = m112713d(videoPublishEditModel);
        if (d[0] > 0 && d[1] > 0) {
            return d;
        }
        return new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
    }

    /* renamed from: b */
    public static boolean m112711b(VideoPublishEditModel videoPublishEditModel) {
        if (C39618d.f101152P.mo83103a(C40790a.NeedRecode) || m112712c(videoPublishEditModel) || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.hasStickers() || videoPublishEditModel.mTimeEffect != null || C9414h.m18631b(videoPublishEditModel.mEffectList) || videoPublishEditModel.mSelectedId != 0 || C52928al.m112615d(videoPublishEditModel.videoPath()) * 1000 > C39618d.f101151O.mo83118b(C40796a.BitrateOfRecodeThreshold) || m112709a(videoPublishEditModel.videoType)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int[] m112713d(VideoPublishEditModel videoPublishEditModel) {
        int[] iArr;
        if (C38704c.m86062c(videoPublishEditModel.videoType)) {
            iArr = C40797m.m90244a(C39618d.f101153Q.f103920d);
        } else {
            iArr = C40797m.m90244a(C39618d.f101153Q.f103919c);
        }
        if (iArr == null || iArr.length != 2 || iArr[0] <= 0 || iArr[1] <= 0) {
            if (!C43446ba.m95221a(videoPublishEditModel) || videoPublishEditModel.mOutVideoWidth <= 0 || videoPublishEditModel.mOutVideoHeight <= 0) {
                iArr = videoPublishEditModel.isFastImport ? new int[]{-1, -1} : new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
            } else {
                iArr = new int[]{videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight};
            }
        }
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isStatusVideoType()) {
            return iArr;
        }
        float f = (float) iArr[0];
        float f2 = (float) iArr[1];
        int[] iArr2 = null;
        int b = C39629l.m88232a().mo58583n().mo83104b(C40790a.CompileVideoSizeIndex);
        List list = (List) C40797m.m90241a(C39629l.m88232a().mo58574e().mo83121e(C40796a.VideoSizeCategory), new C17956a<List<String>>() {
        }.f49843c);
        if (C9414h.m18631b(list) && b < list.size()) {
            iArr2 = C40797m.m90244a((String) list.get(b));
        }
        if (videoPublishEditModel.isDuet()) {
            int[] i = C40797m.m90254i();
            if (i == null || i.length < 2 || iArr == null || iArr.length < 2) {
                return iArr;
            }
            if (C45376ac.m98926a(((float) iArr[0]) / ((float) iArr[1]), ((float) i[0]) / ((float) i[1]), 0.05f)) {
                return iArr;
            }
            StringBuilder sb = new StringBuilder("DuetCompileVideoSize, original video width:");
            sb.append(iArr[0]);
            sb.append("height:");
            sb.append(iArr[1]);
            sb.append(" server RecordSize width ");
            sb.append(i[0]);
            sb.append(" height: ");
            sb.append(i[1]);
            C50203g.m108358a(sb.toString());
            int min = Math.min(i[0], i[1]);
            int[] iArr3 = new int[2];
            float f3 = (float) (i[0] * 2);
            if (f3 > ((float) i[1])) {
                iArr3[1] = min;
                iArr3[0] = (int) ((f3 / ((float) i[1])) * ((float) iArr3[1]));
            } else {
                iArr3[0] = min;
                iArr3[1] = (int) ((((float) i[1]) / f3) * ((float) iArr3[0]));
            }
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = iArr3[i2] % 16;
                if (i3 < 8) {
                    iArr3[i2] = iArr3[i2] - i3;
                } else {
                    iArr3[i2] = (iArr3[i2] + 16) - i3;
                }
            }
            StringBuilder sb2 = new StringBuilder("DuetCompileVideoSize, final compile width:");
            sb2.append(iArr3[0]);
            sb2.append("height:");
            sb2.append(iArr3[1]);
            C50203g.m108358a(sb2.toString());
            return iArr3;
        }
        if (iArr2 != null && videoPublishEditModel.mOrigin == 1) {
            if (((float) iArr2[1]) * f >= ((float) iArr2[0]) * f2) {
                iArr[0] = iArr2[0];
                iArr[1] = (int) ((((float) iArr[0]) * f2) / f);
            } else {
                iArr[1] = iArr2[1];
                iArr[0] = (int) ((((float) iArr[1]) * f) / f2);
            }
        }
        StringBuilder sb3 = new StringBuilder("getCompileVideoSize,width:");
        sb3.append(iArr[0]);
        sb3.append("height:");
        sb3.append(iArr[1]);
        C50203g.m108358a(sb3.toString());
        return iArr;
    }

    /* renamed from: a */
    private static int m112706a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C43449bd a = C43451be.m95243a(videoPublishEditModel, z);
        if (a.mo88380b() == 0 || a.mo88379a() == 0) {
            return 0;
        }
        float a2 = ((float) videoPublishEditModel.mOutVideoWidth) / ((float) a.mo88379a());
        float b = ((float) videoPublishEditModel.mOutVideoHeight) / ((float) a.mo88380b());
        boolean z2 = true;
        if (a2 != 1.0f && b != 1.0f && a2 == b) {
            return 1;
        }
        if (!(a.mo88382d() == a.mo88380b() && a.mo88381c() == a.mo88379a())) {
            z2 = false;
        }
        if (z2 || videoPublishEditModel.mOutVideoWidth == a.mo88379a()) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a */
    public final C43211de<SynthetiseResult> mo110544a(VideoPublishEditModel videoPublishEditModel, VEWatermarkParam vEWatermarkParam, C0958a aVar) {
        final VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        final VEWatermarkParam vEWatermarkParam2 = vEWatermarkParam;
        final C0958a aVar2 = aVar;
        C529801 r0 = new C43211de<SynthetiseResult>("VECompiler") {
            {
                final C52908ad adVar;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C0013i a = C0013i.m18a((Callable<TResult>) new C52982n<TResult>(this, videoPublishEditModel2), (Executor) C23551l.f62672a);
                    try {
                        a.mo36g();
                    } catch (InterruptedException unused) {
                    }
                    adVar = (C52908ad) a.mo34e();
                } else {
                    adVar = C52979m.m112708a(videoPublishEditModel2, (C0184k) C52979m.this, (SurfaceView) null);
                }
                final SynthetiseResult synthetiseResult = new SynthetiseResult();
                synthetiseResult.draftHardEncode = videoPublishEditModel2.mHardEncode;
                synthetiseResult.outputFile = videoPublishEditModel2.getOutputFile();
                synthetiseResult.needRecode = C52979m.m112711b(videoPublishEditModel2);
                synthetiseResult.flags |= 1;
                synthetiseResult.isEnableFpsSet = C39618d.f101151O.mo83117a(C40796a.EnableSyntheticFpsSet);
                synthetiseResult.editPreviewInfo = videoPublishEditModel2.getPreviewInfo();
                synthetiseResult.videoWidth = videoPublishEditModel2.videoWidth();
                synthetiseResult.videoHeight = videoPublishEditModel2.videoHeight();
                synthetiseResult.texts = videoPublishEditModel2.texts;
                synthetiseResult.isFastImport = videoPublishEditModel2.isFastImport;
                synthetiseResult.segmentCount = videoPublishEditModel2.segmentCounts();
                synthetiseResult.fastImportResolution = videoPublishEditModel2.fastImportResolution;
                synthetiseResult.hasSubtitle = videoPublishEditModel2.hasSubtitle();
                if (synthetiseResult.isFastImport) {
                    C42670a.m93644a(videoPublishEditModel2.getPreviewInfo().getVideoList(), adVar.f131275u);
                }
                C43577d.m95728a((C20347c) adVar.f131275u, videoPublishEditModel2.getMainBusinessContext());
                adVar.f131275u.mo43046c(C52979m.this.f131394b);
                if (C52979m.this.f131395c == null) {
                    C52979m.this.f131395c = new C52983o(this, synthetiseResult, adVar);
                }
                adVar.f131275u.mo43018a(C52979m.this.f131395c);
                if (C52979m.this.f131396d == null) {
                    C52979m.this.f131396d = new C50711k() {

                        /* renamed from: a */
                        AtomicInteger f131402a = new AtomicInteger(0);

                        public final void onCallback(int i, int i2, float f, String str) {
                            int i3;
                            boolean z = true;
                            if (vEWatermarkParam2 == null) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            if (i == 4103) {
                                StringBuilder sb = new StringBuilder("TE_INFO_COMPILE_DONE ext:");
                                sb.append(i2);
                                sb.append(" videoExt:");
                                sb.append(i3);
                                sb.append(" isDone():");
                                sb.append(C529801.this.isDone());
                                C50203g.m108363d(sb.toString());
                            } else if (i == 4118) {
                                StringBuilder sb2 = new StringBuilder("TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:");
                                sb2.append(i2);
                                sb2.append(" videoExt:");
                                sb2.append(i3);
                                String sb3 = sb2.toString();
                                C50203g.m108361b(sb3);
                                C23569o.m57779a("aweme_synthesis_compile_log_vesdk", C42437ay.m93202a().mo86521a("log", sb3).mo86522b());
                            }
                            if (!C529801.this.isDone()) {
                                if (i == 4103) {
                                    if (i2 == 0) {
                                        synthetiseResult.videoLength = f;
                                    }
                                    if (!(vEWatermarkParam2 == null || this.f131402a.incrementAndGet() == 2)) {
                                        z = false;
                                    }
                                    if (z) {
                                        synthetiseResult.outputVideoFileInfo = C52928al.m112613b(videoPublishEditModel2.mOutputFile);
                                        try {
                                            new C52965e().mo110541a(videoPublishEditModel2);
                                            if (videoPublishEditModel2.isSaveLocalWithoutWaterMark()) {
                                                C48016e.m103954e(C43308eb.f109498k);
                                                C48016e.m103948c(synthetiseResult.outputFile, videoPublishEditModel2.getLocalTempPath());
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        if (C529801.this.mo34624b(synthetiseResult)) {
                                            C0013i.m16a((Callable<TResult>) new C52986r<TResult>(adVar));
                                        }
                                    }
                                } else if (i == 4105 && i2 == i3) {
                                    C529801.this.mo87842a((int) (f * 100.0f));
                                } else if (i == 4112) {
                                    synthetiseResult.synthetiseCPUEncode = i2 ^ 1;
                                } else if (i == 4113) {
                                    synthetiseResult.audioLength = f;
                                } else if (i == 4114) {
                                    C0013i.m18a((Callable<TResult>) new C52987s<TResult>(this, i, i2, f), C0013i.f25b);
                                } else if (i == 4116) {
                                    if (C39618d.f101152P.mo83103a(C40790a.EnableUploadMetadata)) {
                                        if (videoPublishEditModel2.metadataMap == null) {
                                            videoPublishEditModel2.metadataMap = C20084a.m49601a();
                                        } else {
                                            videoPublishEditModel2.metadataMap.putAll(C20084a.m49601a());
                                        }
                                    }
                                    C32458a.m75144a("receive prepare done event in vecomplier");
                                    SubtitleModule.m97950a(adVar.f131275u, C39618d.f101160a, videoPublishEditModel2, SubtitleModule.m97953ab());
                                }
                            }
                        }
                    };
                }
                adVar.f131275u.mo43039b(C52979m.this.f131396d);
                aVar2.mo2939a(new C52984p(this, synthetiseResult, adVar, vEWatermarkParam2));
                try {
                    VEVideoEncodeSettings a2 = C52979m.m112707a(videoPublishEditModel2, synthetiseResult, vEWatermarkParam2);
                    adVar.f131275u.mo43002a("te_is_fast_import", String.valueOf(videoPublishEditModel2.isFastImport ? 1 : 0));
                    if (videoPublishEditModel2.isMultiVideoEdit() && !TextUtils.isEmpty(videoPublishEditModel2.multiEditVideoRecordData.videoMetaData)) {
                        adVar.f131275u.mo43002a("description", videoPublishEditModel2.multiEditVideoRecordData.videoMetaData);
                    }
                    if (C39618d.f101152P.mo83103a(C40790a.VideoSynthesisOpt)) {
                        C9393e.submitRunnable(new C52985q(adVar, videoPublishEditModel2, a2));
                    } else {
                        adVar.f131275u.mo43022a(videoPublishEditModel2.getOutputFile(), (String) null, a2);
                    }
                } catch (Throwable th) {
                    mo34623a(th);
                }
            }
        };
        C17825i.m43740a(r0, new C43829ff(), C0013i.f25b);
        C17825i.m43740a(r0, new C43830fg(videoPublishEditModel.getOutputFile(), (long) videoPublishEditModel.getVideoLength()), C0013i.f25b);
        C17825i.m43740a(r0, new C43808fc(), C0013i.f25b);
        C17825i.m43740a(r0, new C43810fe(this.f131393a), C0013i.f25b);
        return r0;
    }

    /* renamed from: a */
    public static VEVideoEncodeSettings m112707a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, VEWatermarkParam vEWatermarkParam) {
        boolean z;
        float f;
        int[] d = m112713d(videoPublishEditModel);
        C50585a aVar = new C50585a(2);
        aVar.mo98716g(C52929b.m112618a(C40797m.m90259n())).mo98692a(d[0], d[1]);
        if (C43446ba.m95221a(videoPublishEditModel) && (d[0] > videoPublishEditModel.videoWidth() || d[1] > videoPublishEditModel.videoHeight())) {
            aVar.mo98715f(3).mo98690a(0.0f).mo98706b(0.0f);
        } else if (videoPublishEditModel.isFastImport || videoPublishEditModel.isDuet() || videoPublishEditModel.isStitchMode()) {
            aVar.mo98715f(1);
        }
        if (!C40797m.m90247b() || C40797m.m90248c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (C38704c.m86062c(videoPublishEditModel.videoType)) {
                f = C39618d.f101153Q.f103917a;
            } else {
                f = C39618d.f101153Q.f103918b;
            }
            if (f <= 0.0f) {
                f = C40797m.m90250e();
            }
            aVar.mo98703a(true).mo98696a(ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, C52929b.m112617a(f));
            aVar.mo98698a(C44455e.m97282b());
        } else {
            aVar.mo98703a(false).mo98696a(ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, C52929b.m112620b(C40797m.m90256k()));
        }
        ENCODE_PRESET c = C52929b.m112621c(C40797m.m90258m());
        if (c != null) {
            aVar.mo98697a(c);
        }
        aVar.mo98693a(C52929b.m112619a(C40797m.m90257l()));
        if (videoPublishEditModel.hasInfoStickers() || (!C9414h.m18630a(videoPublishEditModel.mEffectList) && videoPublishEditModel.videoFps() < 10)) {
            if (C42447bc.m93239a() > 0) {
                int videoFps = videoPublishEditModel.videoFps();
                if (videoFps < 30) {
                    aVar.mo98691a(30);
                } else {
                    aVar.mo98691a(videoFps);
                }
            } else {
                aVar.mo98691a(30);
            }
        } else if (C39618d.f101151O.mo83117a(C40796a.EnableSyntheticFpsSet)) {
            int videoFps2 = videoPublishEditModel.videoFps();
            if (videoFps2 > 0) {
                aVar.mo98691a(videoFps2);
            }
        }
        aVar.mo98704a(!synthetiseResult.needRecode, C39618d.f101151O.mo83117a(C40796a.VEFastImportIgnoreRecodeForRotation));
        if (videoPublishEditModel.isUseMultiEdit()) {
            aVar.mo98704a(false, C39618d.f101151O.mo83117a(C40796a.VEFastImportIgnoreRecodeForRotation));
        }
        C52972j.m112699a(videoPublishEditModel, aVar, new Integer[]{Integer.valueOf(d[0]), Integer.valueOf(d[1])});
        C52972j.m112701a(videoPublishEditModel.uploadSpeedInfo, videoPublishEditModel.compileProbeResult, aVar);
        VEVideoEncodeSettings a = aVar.mo98705a();
        a.setWatermark(vEWatermarkParam);
        videoPublishEditModel.isSyntheticHardEncode = a.getVideoCompileEncodeSetting().useHWEncoder;
        return a;
    }

    /* renamed from: a */
    public static C52908ad m112708a(VideoPublishEditModel videoPublishEditModel, C0184k kVar, SurfaceView surfaceView) {
        boolean z;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        C52967f fVar = new C52967f();
        if (videoPublishEditModel2.mEffectList != null) {
            C53027v.m112770a(videoPublishEditModel2.mEffectList, fVar);
        }
        VEPreviewParams a = C43668b.m95935a(videoPublishEditModel2, 3, -1);
        if (videoPublishEditModel.getAvetParameter().getShootMode() == 6 && videoPublishEditModel2.storyBoomModel != null) {
            StoryBoomModel storyBoomModel = videoPublishEditModel2.storyBoomModel;
            a.mAudioPaths = null;
            a.mFps = storyBoomModel.getFps();
            a.mVideoPaths = storyBoomModel.getVideoList();
        }
        if (videoPublishEditModel2.veAudioEffectParam != null) {
            a.veAudioEffectParam = videoPublishEditModel2.veAudioEffectParam;
        }
        if (videoPublishEditModel2.videoType == 9) {
            a.mVTrimIn = new int[]{0};
            a.mVTrimOut = new int[]{C39618d.f101151O.mo83118b(C40796a.StoryImagePlayTime)};
        }
        C0198r rVar = new C0198r();
        rVar.setValue(new C43442b(videoPublishEditModel2.autoEnhanceOn, videoPublishEditModel2.autoEnhanceType, false));
        C0198r rVar2 = new C0198r();
        rVar2.setValue(a);
        C0198r rVar3 = new C0198r();
        if (videoPublishEditModel.isMusic() == 1) {
            VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
            vEPreviewMusicParams.f131142i = videoPublishEditModel2.isFastImport;
            vEPreviewMusicParams.f131141h = 3;
            vEPreviewMusicParams.f131134a = videoPublishEditModel2.mMusicPath;
            vEPreviewMusicParams.f131135b = videoPublishEditModel2.mMusicStart;
            vEPreviewMusicParams.f131136c = C47807de.m103443a(videoPublishEditModel2.mMusicPath, C47807de.m103445a(videoPublishEditModel));
            C42482c b = C43214dh.m94817a().mo50201b();
            if (b == null || b.getShootDuration() <= 0 || Math.abs(vEPreviewMusicParams.f131136c - b.getShootDuration()) < 1000) {
                vEPreviewMusicParams.f131137d = vEPreviewMusicParams.f131136c;
            } else {
                vEPreviewMusicParams.f131137d = b.getShootDuration();
            }
            vEPreviewMusicParams.f131138e = videoPublishEditModel2.musicVolume;
            vEPreviewMusicParams.f131139f = videoPublishEditModel2.musicId;
            vEPreviewMusicParams.f131140g = videoPublishEditModel2.previewStartTime;
            rVar3.setValue(vEPreviewMusicParams);
        }
        C0198r<InfoStickerModel> rVar4 = new C0198r<>();
        if (videoPublishEditModel2.infoStickerModel == null || !C9414h.m18631b(videoPublishEditModel2.infoStickerModel.stickers) || !C43446ba.m95223b(videoPublishEditModel)) {
            rVar4.setValue(videoPublishEditModel2.infoStickerModel);
        } else {
            InfoStickerModel clone = videoPublishEditModel2.infoStickerModel.clone();
            for (StickerItemModel stickerItemModel : clone.stickers) {
                if (!stickerItemModel.isImageStickerLayer) {
                    float[] a2 = C43446ba.m95222a(stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY, videoPublishEditModel2.mVideoCanvasWidth, videoPublishEditModel2.mVideoCanvasHeight, videoPublishEditModel2.mOutVideoWidth, videoPublishEditModel2.mOutVideoHeight);
                    stickerItemModel.currentOffsetX = a2[0];
                    stickerItemModel.currentOffsetY = a2[1];
                }
            }
            rVar4.setValue(clone);
        }
        C52970h<C52906ab> hVar = new C52970h<>();
        C0198r rVar5 = new C0198r();
        C52970h<C52977l> hVar2 = new C52970h<>();
        C0198r<AudioRecorderParam> rVar6 = new C0198r<>();
        C52908ad adVar = new C52908ad(videoPublishEditModel2.videoEditorType);
        adVar.mo110521a(C52885a.f131169q);
        adVar.mo110530b(m112706a(videoPublishEditModel2, C38704c.m86062c(videoPublishEditModel2.videoType)));
        adVar.mo110527a(false);
        adVar.mo110525a(new ArrayList<>());
        adVar.mo110522a(rVar5);
        adVar.f131267m = new C0198r();
        adVar.f131263i = hVar;
        adVar.f131265k = rVar6;
        adVar.f131264j = hVar2;
        adVar.mo110531b(new C0198r<>());
        adVar.f131266l = new C0198r();
        adVar.f131262h = fVar;
        adVar.f131261g = new C0198r();
        adVar.f131269o = rVar4;
        adVar.f131260f = new C0198r();
        adVar.f131259e = rVar3;
        adVar.f131271q = rVar;
        adVar.f131258d = rVar2;
        adVar.mo110523a(null, kVar, null);
        adVar.f131252G.mo110481a();
        C52906ab a3 = C29164a.m68668a(0, videoPublishEditModel2);
        if (a3 != null) {
            hVar.setValue(a3);
        }
        if (videoPublishEditModel2.mTimeEffect == null || !videoPublishEditModel2.mTimeEffect.getKey().equals("1")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (videoPublishEditModel2.isFastImport) {
                adVar.f131275u.mo43010a(videoPublishEditModel.getPreviewInfo().getReverseVideoArray(), videoPublishEditModel.getPreviewInfo().getReverseAudioArray());
                adVar.f131275u.mo43020a(videoPublishEditModel.getPreviewInfo().getTempVideoArray());
            } else {
                adVar.f131275u.mo43036b(videoPublishEditModel.getPreviewInfo().getReverseVideoArray());
            }
            adVar.f131275u.mo43043c(true);
            if (videoPublishEditModel2.isFastImport) {
                adVar.f131275u.mo43021a(adVar.f131275u.mo43013a().f127518i, adVar.f131275u.mo43013a().f127519j, a.mVolume);
            }
        }
        if (videoPublishEditModel2.veAudioRecorderParam != null) {
            rVar6.setValue(videoPublishEditModel2.veAudioRecorderParam);
        }
        if (videoPublishEditModel2.veAudioEffectParam != null) {
            videoPublishEditModel2.veAudioEffectParam.setShowErrorToast(false);
            videoPublishEditModel2.veAudioEffectParam.setPreprocessResult(null);
            hVar2.setValue(C52977l.m112704a(true, videoPublishEditModel.isReviewVideo(), videoPublishEditModel2.veAudioEffectParam));
        }
        if (videoPublishEditModel2.mSelectedId != 0) {
            if (C39618d.f101152P.mo83103a(C40790a.EnableFilterIntensityJust)) {
                adVar.f131275u.mo43033b(C31460h.m73281a(C39618d.f101144H.mo58584o().mo64333c().mo64346b(videoPublishEditModel2.mSelectedId)), videoPublishEditModel2.mSelectedFilterIntensity);
            } else {
                adVar.f131275u.mo42997a(C31460h.m73281a(C39618d.f101144H.mo58584o().mo64333c().mo64346b(videoPublishEditModel2.mSelectedId)), 1.0f);
            }
        }
        return adVar;
    }
}
