package dmt.p2652av.video;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43738a;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.C45642b;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.VEAudioEncodeSettings;
import com.p683ss.android.vesdk.VEAudioEncodeSettings.C50523a;
import com.p683ss.android.vesdk.VEListener.C50547k;
import com.p683ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: dmt.av.video.e */
public final class C52965e {

    /* renamed from: a */
    int f131369a = -999;

    /* renamed from: a */
    public final void mo110541a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String str;
        String concatAudioPath;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if (C39618d.f101151O.mo83117a(C40796a.UploadOriginalAudioTrack) && videoPublishEditModel.shouldUploadOriginalSound()) {
            new File(C43308eb.f109497j).mkdirs();
            if (videoPublishEditModel2.veAudioRecorderParam == null || !videoPublishEditModel2.veAudioRecorderParam.hasRecord() || !C39618d.f101152P.mo83103a(C40790a.EnableRecordConversion)) {
                z = false;
            } else {
                z = true;
            }
            int i = -999;
            if (videoPublishEditModel2.isFastImport) {
                int size = videoPublishEditModel.getPreviewInfo().getVideoList().size();
                String[] strArr = new String[size];
                long[] jArr = new long[size];
                long[] jArr2 = new long[size];
                long[] jArr3 = new long[2];
                float[] fArr = new float[size];
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr;
                String[] strArr2 = strArr;
                m112694a(videoPublishEditModel.getPreviewInfo(), strArr, jArr, jArr4, fArr, jArr3);
                if (z) {
                    new File(C43308eb.f109501n).mkdirs();
                    StringBuilder sb = new StringBuilder();
                    sb.append(C43308eb.f109501n);
                    sb.append(System.currentTimeMillis());
                    sb.append("_a");
                    String sb2 = sb.toString();
                    if (videoPublishEditModel2.voiceVolume == 0.0f) {
                        this.f131369a = VEUtils.transCodeAudio(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel2.mEncodedAudioOutputFile, 1, 88200);
                    } else {
                        this.f131369a = VEUtils.detachAudioFromVideos(sb2, strArr2, jArr5, jArr4, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(sb2);
                        arrayList.add(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl());
                        i = VEUtils.mixAudio(arrayList, videoPublishEditModel2.mEncodedAudioOutputFile, null);
                        C48016e.m103947c(sb2);
                    }
                } else {
                    this.f131369a = VEUtils.detachAudioFromVideos(videoPublishEditModel2.mEncodedAudioOutputFile, strArr2, jArr5, jArr4, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                }
            } else if (videoPublishEditModel.isMultiVideoEdit()) {
                if (!z) {
                    this.f131369a = VEUtils.getAudioFromRecordData(videoPublishEditModel2.mEncodedAudioOutputFile, C43738a.m96063a(videoPublishEditModel2.multiEditVideoRecordData.curMultiEditVideoRecordData), 1, 88200, 44100);
                } else if (videoPublishEditModel2.voiceVolume == 0.0f) {
                    this.f131369a = VEUtils.transCodeAudio(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel2.mEncodedAudioOutputFile, 1, 88200);
                } else {
                    new File(C43308eb.f109501n).mkdirs();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(C43308eb.f109501n);
                    sb3.append(System.currentTimeMillis());
                    sb3.append("_a");
                    String sb4 = sb3.toString();
                    this.f131369a = VEUtils.getAudioFromRecordData(sb4, C43738a.m96063a(videoPublishEditModel2.multiEditVideoRecordData.curMultiEditVideoRecordData), 1, 88200, 44100);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(sb4);
                    arrayList2.add(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl());
                    i = VEUtils.mixAudio(arrayList2, videoPublishEditModel2.mEncodedAudioOutputFile, null);
                    C48016e.m103947c(sb4);
                }
            } else if (!videoPublishEditModel.isStitchMode()) {
                if (TextUtils.isEmpty(videoPublishEditModel.audioPath())) {
                    str = videoPublishEditModel.videoPath();
                } else {
                    str = videoPublishEditModel.audioPath();
                }
                if (!z) {
                    this.f131369a = VEUtils.transCodeAudio(str, videoPublishEditModel2.mEncodedAudioOutputFile, 1, 88200);
                } else if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel2.voiceVolume == 0.0f) {
                    this.f131369a = VEUtils.transCodeAudio(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel2.mEncodedAudioOutputFile, 1, 88200);
                } else {
                    this.f131369a = -999;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(str);
                    arrayList3.add(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl());
                    i = VEUtils.mixAudio(arrayList3, videoPublishEditModel2.mEncodedAudioOutputFile, null);
                }
            } else if (videoPublishEditModel2.stitchParams != null) {
                if (TextUtils.isEmpty(videoPublishEditModel2.stitchParams.getConcatAudioPath())) {
                    concatAudioPath = videoPublishEditModel.audioPath();
                } else {
                    concatAudioPath = videoPublishEditModel2.stitchParams.getConcatAudioPath();
                }
                String str2 = concatAudioPath;
                if (z) {
                    if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel2.voiceVolume == 0.0f) {
                        this.f131369a = VEUtils.transCodeAudio(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel2.mEncodedAudioOutputFile, 1, 88200);
                    } else {
                        C50720o oVar = new C50720o(videoPublishEditModel.draftDir());
                        oVar.mo99321a(new String[]{videoPublishEditModel2.veAudioRecorderParam.getAudioUrl()}, new int[]{0}, new int[]{-1}, new float[]{1.0f});
                        int a = oVar.mo99306a(str2, 0, oVar.mo99407v() - ((int) videoPublishEditModel2.stitchParams.getDuration()), (int) videoPublishEditModel2.stitchParams.getDuration(), oVar.mo99407v(), false);
                        oVar.mo99333a(0, 1, videoPublishEditModel2.voiceVolume);
                        oVar.mo99333a(a, 1, videoPublishEditModel2.voiceVolume);
                        oVar.mo99361d(1);
                        VEAudioEncodeSettings a2 = new C50523a().mo98460a(16000).mo98463c(2).mo98462b(128000).mo98461a();
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        if (oVar.mo99334a(videoPublishEditModel2.mEncodedAudioOutputFile, a2, (C50547k) new C50547k() {
                            public final void onCompileProgress(float f) {
                            }

                            public final void onCompileDone() {
                                C52965e.this.f131369a = 0;
                                countDownLatch.countDown();
                            }

                            public final void onCompileError(int i, int i2, float f, String str) {
                                countDownLatch.countDown();
                            }
                        })) {
                            try {
                                countDownLatch.await(40000, TimeUnit.MILLISECONDS);
                            } catch (InterruptedException unused) {
                            }
                        }
                        oVar.mo99389m();
                    }
                } else if (str2 != null) {
                    this.f131369a = VEUtils.transCodeAudio(str2, videoPublishEditModel2.mEncodedAudioOutputFile, 1, 88200);
                } else {
                    this.f131369a = -999;
                }
            } else {
                return;
            }
            int a3 = C45642b.m99389a(videoPublishEditModel2.mEncodedAudioOutputFile);
            StringBuilder sb5 = new StringBuilder("mixResult");
            sb5.append(i);
            sb5.append("encodeResult = ");
            sb5.append(this.f131369a);
            sb5.append(" checkResult = ");
            sb5.append(a3);
            sb5.append(" path = ");
            sb5.append(videoPublishEditModel2.mEncodedAudioOutputFile);
            C23569o.m57783b("aweme_movie_publish_log", "encode_audio_file", new C42437ay().mo86519a("status", Integer.valueOf(a3 + 10000)).mo86521a("errorDesc", sb5.toString()).mo86522b());
        }
    }

    /* renamed from: a */
    private static void m112694a(EditPreviewInfo editPreviewInfo, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        for (int i = 0; i < editPreviewInfo.getVideoList().size(); i++) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) editPreviewInfo.getVideoList().get(i);
            strArr[i] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                jArr[i] = videoCutInfo.getStart();
                jArr2[i] = videoCutInfo.getEnd();
                fArr[i] = videoCutInfo.getSpeed();
            } else {
                jArr[i] = -1;
                jArr2[i] = -1;
                fArr[i] = 1.0f;
            }
        }
        if (editPreviewInfo.getSceneIn() > 0 || editPreviewInfo.getSceneOut() > 0) {
            jArr3[0] = editPreviewInfo.getSceneIn();
            jArr3[1] = editPreviewInfo.getSceneOut();
            return;
        }
        jArr3[0] = -1;
        jArr3[1] = -1;
    }
}
