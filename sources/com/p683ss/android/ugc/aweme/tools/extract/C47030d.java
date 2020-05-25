package com.p683ss.android.ugc.aweme.tools.extract;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.d */
public final class C47030d extends C47027a {

    /* renamed from: e */
    public final VideoPublishEditModel f118781e;

    /* renamed from: f */
    private int f118782f;

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.d$a */
    static final class C47031a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C47030d f118783a;

        C47031a(C47030d dVar) {
            this.f118783a = dVar;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            ArrayList a = ShortVideoContext.m93017a(this.f118783a.f118781e.mVideoSegmentsDesc);
            C47040k kVar = this.f118783a.f118776c;
            C52711k.m112236a((Object) kVar, "photoPathGenerator");
            String str = kVar.f118792a;
            C52711k.m112236a((Object) str, "frameDir");
            String str2 = File.separator;
            C52711k.m112236a((Object) str2, "File.separator");
            if (!C52830p.m112413c(str, str2, false, 2, null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                str = sb.toString();
            }
            C47030d dVar = this.f118783a;
            C52711k.m112236a((Object) a, "videoSegments");
            Iterable iterable = a;
            Collection arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) next;
                C52711k.m112236a((Object) timeSpeedModelExtension, "it");
                if (timeSpeedModelExtension.getBackgroundVideo() == null) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            int i = 0;
            for (Entry entry : dVar.mo94326a((List) arrayList).entrySet()) {
                String str3 = (String) entry.getKey();
                int[] a2 = this.f118783a.mo94327a((int) ((Number) entry.getValue()).longValue());
                int i2 = C47037i.f118791a[0];
                StringBuilder sb2 = new StringBuilder();
                int i3 = i + 1;
                sb2.append(i);
                sb2.append("_extract_frame");
                VEUtils.saveVideoFrames(str3, a2, i2, -1, false, str, sb2.toString(), 1);
                i = i3;
            }
            String str4 = this.f118783a.f118781e.extractFramesModel.extractFramesDir;
            C52711k.m112236a((Object) str4, "shootExtractDir");
            String str5 = File.separator;
            C52711k.m112236a((Object) str5, "File.separator");
            if (!C52830p.m112413c(str4, str5, false, 2, null)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(File.separator);
                str4 = sb3.toString();
            }
            File[] listFiles = new File(str).listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (File file : listFiles) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str4);
                        C52711k.m112236a((Object) file, "frameImage");
                        sb4.append(file.getName());
                        String sb5 = sb4.toString();
                        C48016e.m103948c(file.getAbsolutePath(), sb5);
                        this.f118783a.f118781e.extractFramesModel.addFrameAtLastSegment(sb5);
                    }
                }
            }
            C48016e.m103954e(str);
            C48016e.m103947c(str);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.d$b */
    static final class C47032b<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C47030d f118784a;

        /* renamed from: b */
        final /* synthetic */ C47039a f118785b;

        C47032b(C47030d dVar, C47039a aVar) {
            this.f118784a = dVar;
            this.f118785b = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C47039a aVar = this.f118785b;
            C52711k.m112236a((Object) iVar, "it");
            aVar.mo86668a(iVar.mo26b());
            this.f118784a.mo94320a(true);
            this.f118784a.mo94316a();
            return null;
        }
    }

    /* renamed from: f */
    public final String mo94328f() {
        return "extract_bgv";
    }

    public C47030d(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "videoPublishEditModel");
        this.f118781e = videoPublishEditModel;
    }

    /* renamed from: a */
    public final int[] mo94327a(int i) {
        this.f118782f = i / 500;
        int[] iArr = new int[this.f118782f];
        int i2 = this.f118782f;
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3 * 500;
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo94318a(C47039a aVar) {
        C52711k.m112240b(aVar, "listener");
        super.mo94318a(aVar);
        if (m102125b()) {
            C0013i.m16a((Callable<TResult>) new C47031a<TResult>(this)).mo19a((C0011g<TResult, TContinuationResult>) new C47032b<TResult,TContinuationResult>(this, aVar));
        }
    }

    /* renamed from: a */
    public final Map<String, Long> mo94326a(List<? extends TimeSpeedModelExtension> list) {
        long j;
        Map<String, Long> linkedHashMap = new LinkedHashMap<>();
        for (TimeSpeedModelExtension timeSpeedModelExtension : list) {
            C46066a backgroundVideo = timeSpeedModelExtension.getBackgroundVideo();
            if (backgroundVideo != null) {
                String videoPath = backgroundVideo.getVideoPath();
                if (videoPath != null) {
                    CharSequence charSequence = videoPath;
                    String str = File.separator;
                    C52711k.m112236a((Object) str, "File.separator");
                    int b = C52830p.m112446b(charSequence, str, 0, false, 6, (Object) null) + 1;
                    if (videoPath != null) {
                        String substring = videoPath.substring(b);
                        C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                        String uniqueVideoSessionDir = this.f118781e.uniqueVideoSessionDir(C43308eb.f109496i);
                        StringBuilder sb = new StringBuilder();
                        sb.append(uniqueVideoSessionDir);
                        sb.append(File.separator);
                        sb.append(substring);
                        String sb2 = sb.toString();
                        if (C48016e.m103944b(sb2)) {
                            videoPath = sb2;
                        }
                        if (C48016e.m103944b(videoPath)) {
                            if (videoPath == null) {
                                C52711k.m112234a();
                            }
                            Long l = (Long) linkedHashMap.get(videoPath);
                            if (timeSpeedModelExtension.getSpeed() > ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                                if (l != null) {
                                    j = l.longValue();
                                } else {
                                    j = 0;
                                }
                                linkedHashMap.put(videoPath, Long.valueOf(j + ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()))));
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    continue;
                }
            }
        }
        return linkedHashMap;
    }
}
