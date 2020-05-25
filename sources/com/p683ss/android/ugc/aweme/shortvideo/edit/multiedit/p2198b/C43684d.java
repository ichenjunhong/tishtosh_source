package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.tools.C46797a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50199c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d */
public final class C43684d {

    /* renamed from: a */
    public static final String f110615a;

    /* renamed from: b */
    public static final C43684d f110616b = new C43684d();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d$a */
    static final class C43685a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f110617a;

        /* renamed from: b */
        final /* synthetic */ String f110618b;

        C43685a(String str, String str2) {
            this.f110617a = str;
            this.f110618b = str2;
        }

        public final /* synthetic */ Object call() {
            C48016e.m103943b(this.f110617a, this.f110618b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d$b */
    static final class C43686b<TTaskResult, TContinuationResult> implements C0011g<C52860x, Object> {

        /* renamed from: a */
        final /* synthetic */ MultiEditVideoStatusRecordData f110619a;

        /* renamed from: b */
        final /* synthetic */ boolean f110620b;

        /* renamed from: c */
        final /* synthetic */ String f110621c;

        /* renamed from: d */
        final /* synthetic */ String f110622d;

        /* renamed from: e */
        final /* synthetic */ C52670a f110623e;

        C43686b(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z, String str, String str2, C52670a aVar) {
            this.f110619a = multiEditVideoStatusRecordData;
            this.f110620b = z;
            this.f110621c = str;
            this.f110622d = str2;
            this.f110623e = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            List<MultiEditVideoSegmentRecordData> list = this.f110619a.curMultiEditVideoRecordData.segmentDataList;
            C52711k.m112236a((Object) list, "multiEditVideoRecordData…ecordData.segmentDataList");
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                if (multiEditVideoSegmentRecordData != null) {
                    if (this.f110620b) {
                        if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.audioPath)) {
                            String str = multiEditVideoSegmentRecordData.audioPath;
                            C52711k.m112236a((Object) str, "it.audioPath");
                            multiEditVideoSegmentRecordData.draftAudioPath = C52830p.m112401a(str, this.f110621c, this.f110622d, false, 4, (Object) null);
                        }
                        if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath)) {
                            String str2 = multiEditVideoSegmentRecordData.videoPath;
                            C52711k.m112236a((Object) str2, "it.videoPath");
                            multiEditVideoSegmentRecordData.draftVideoPath = C52830p.m112401a(str2, this.f110621c, this.f110622d, false, 4, (Object) null);
                        }
                    } else {
                        if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftAudioPath)) {
                            String str3 = multiEditVideoSegmentRecordData.draftAudioPath;
                            C52711k.m112236a((Object) str3, "it.draftAudioPath");
                            multiEditVideoSegmentRecordData.audioPath = C52830p.m112401a(str3, this.f110621c, this.f110622d, false, 4, (Object) null);
                        }
                        if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
                            String str4 = multiEditVideoSegmentRecordData.draftVideoPath;
                            C52711k.m112236a((Object) str4, "it.draftVideoPath");
                            multiEditVideoSegmentRecordData.videoPath = C52830p.m112401a(str4, this.f110621c, this.f110622d, false, 4, (Object) null);
                        }
                    }
                }
            }
            if (this.f110619a.restoreMultiEditVideoRecordData != null) {
                List<MultiEditVideoSegmentRecordData> list2 = this.f110619a.restoreMultiEditVideoRecordData.segmentDataList;
                C52711k.m112236a((Object) list2, "multiEditVideoRecordData…ecordData.segmentDataList");
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : list2) {
                    if (multiEditVideoSegmentRecordData2 != null) {
                        if (this.f110620b) {
                            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData2.audioPath)) {
                                String str5 = multiEditVideoSegmentRecordData2.audioPath;
                                C52711k.m112236a((Object) str5, "it.audioPath");
                                multiEditVideoSegmentRecordData2.draftAudioPath = C52830p.m112401a(str5, this.f110621c, this.f110622d, false, 4, (Object) null);
                            }
                            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData2.videoPath)) {
                                String str6 = multiEditVideoSegmentRecordData2.videoPath;
                                C52711k.m112236a((Object) str6, "it.videoPath");
                                multiEditVideoSegmentRecordData2.draftVideoPath = C52830p.m112401a(str6, this.f110621c, this.f110622d, false, 4, (Object) null);
                            }
                        } else {
                            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData2.draftAudioPath)) {
                                String str7 = multiEditVideoSegmentRecordData2.draftAudioPath;
                                C52711k.m112236a((Object) str7, "it.draftAudioPath");
                                multiEditVideoSegmentRecordData2.audioPath = C52830p.m112401a(str7, this.f110621c, this.f110622d, false, 4, (Object) null);
                            }
                            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData2.draftVideoPath)) {
                                String str8 = multiEditVideoSegmentRecordData2.draftVideoPath;
                                C52711k.m112236a((Object) str8, "it.draftVideoPath");
                                multiEditVideoSegmentRecordData2.videoPath = C52830p.m112401a(str8, this.f110621c, this.f110622d, false, 4, (Object) null);
                            }
                        }
                    }
                }
            }
            this.f110623e.invoke();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d$c */
    public static final class C43687c<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C43687c f110624a = new C43687c();

        C43687c() {
        }

        public final /* synthetic */ Object call() {
            if (C48016e.m103944b(C43684d.f110615a)) {
                new File(C43684d.f110615a).delete();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d$d */
    public static final class C43688d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f110625a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f110626b;

        public C43688d(String str, Bitmap bitmap) {
            this.f110625a = str;
            this.f110626b = bitmap;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            BufferedOutputStream bufferedOutputStream;
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.f110625a)));
                try {
                    this.f110626b.compress(CompressFormat.PNG, 100, bufferedOutputStream);
                    bufferedOutputStream.flush();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream;
                    th = th;
                    bufferedOutputStream2 = bufferedOutputStream3;
                    C50199c.m108336a((OutputStream) bufferedOutputStream2);
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                C50199c.m108336a((OutputStream) bufferedOutputStream2);
                throw th;
            }
            C50199c.m108336a((OutputStream) bufferedOutputStream);
            return null;
        }
    }

    private C43684d() {
    }

    /* renamed from: a */
    public static void m95972a() {
        String str = C43307ea.f109492e;
        if (C48016e.m103944b(str)) {
            C48016e.m103954e(str);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("multi_edit");
        sb.append(File.separator);
        f110615a = sb.toString();
    }

    /* renamed from: a */
    public static MultiEditVideoRecordData m95970a(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData == null) {
            return new MultiEditVideoRecordData();
        }
        if (multiEditVideoRecordData2 == null) {
            MultiEditVideoRecordData cloneData = multiEditVideoRecordData.cloneData();
            C52711k.m112236a((Object) cloneData, "srcData.cloneData()");
            return cloneData;
        }
        multiEditVideoRecordData2.concatVideo = multiEditVideoRecordData.concatVideo;
        multiEditVideoRecordData2.concatAudio = multiEditVideoRecordData.concatAudio;
        multiEditVideoRecordData2.useMusic = multiEditVideoRecordData.useMusic;
        multiEditVideoRecordData2.startTime = multiEditVideoRecordData.startTime;
        multiEditVideoRecordData2.endTime = multiEditVideoRecordData.endTime;
        multiEditVideoRecordData2.leftSlideX = multiEditVideoRecordData.leftSlideX;
        multiEditVideoRecordData2.rightSlideX = multiEditVideoRecordData.rightSlideX;
        multiEditVideoRecordData2.curRecordingDir = multiEditVideoRecordData.curRecordingDir;
        multiEditVideoRecordData2.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData cloneData2 : multiEditVideoRecordData.segmentDataList) {
            multiEditVideoRecordData2.segmentDataList.add(cloneData2.cloneData());
        }
        multiEditVideoRecordData2.musicPath = multiEditVideoRecordData.musicPath;
        multiEditVideoRecordData2.originVolume = multiEditVideoRecordData.originVolume;
        multiEditVideoRecordData2.musicVolume = multiEditVideoRecordData.musicVolume;
        multiEditVideoRecordData2.hasRetake = multiEditVideoRecordData.hasRetake;
        multiEditVideoRecordData2.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
        multiEditVideoRecordData2.musicDuration = multiEditVideoRecordData.musicDuration;
        multiEditVideoRecordData2.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
        multiEditVideoRecordData2.coverPath = multiEditVideoRecordData.coverPath;
        return multiEditVideoRecordData2;
    }

    /* renamed from: b */
    public static MultiEditVideoRecordData m95974b(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData == null || multiEditVideoRecordData2 == null || C9190h.m18253a(multiEditVideoRecordData2.segmentDataList) || C9190h.m18253a(multiEditVideoRecordData.segmentDataList)) {
            return multiEditVideoRecordData;
        }
        multiEditVideoRecordData.copyData(multiEditVideoRecordData2);
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData2.segmentDataList) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : multiEditVideoRecordData.segmentDataList) {
                if (multiEditVideoSegmentRecordData != null && !TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath) && C52711k.m112239a((Object) multiEditVideoSegmentRecordData.videoPath, (Object) multiEditVideoSegmentRecordData2.videoPath)) {
                    multiEditVideoSegmentRecordData2.copyData(multiEditVideoSegmentRecordData);
                }
            }
        }
        return multiEditVideoRecordData;
    }

    /* renamed from: a */
    public static void m95973a(String str, String str2, boolean z, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, C52670a<C52860x> aVar) {
        if (multiEditVideoStatusRecordData != null && !C9190h.m18253a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
            C0013i a = C0013i.m18a((Callable<TResult>) new C43685a<TResult>(str, str2), (Executor) C46797a.m101642a());
            C43686b bVar = new C43686b(multiEditVideoStatusRecordData, z, str, str2, aVar);
            a.mo19a((C0011g<TResult, TContinuationResult>) bVar);
        }
    }
}
