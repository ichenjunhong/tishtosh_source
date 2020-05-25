package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43789em;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.b */
public final class C46448b {

    /* renamed from: a */
    public static final C46448b f117173a = new C46448b();

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.b$a */
    static final class C46449a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C43789em f117174a;

        /* renamed from: b */
        final /* synthetic */ C46066a f117175b;

        C46449a(C43789em emVar, C46066a aVar) {
            this.f117174a = emVar;
            this.f117175b = aVar;
        }

        public final /* synthetic */ Object call() {
            for (TimeSpeedModelExtension timeSpeedModelExtension : this.f117174a) {
                if (timeSpeedModelExtension != null) {
                    C46066a backgroundVideo = timeSpeedModelExtension.getBackgroundVideo();
                    if (backgroundVideo != null && (!C52711k.m112239a((Object) backgroundVideo, (Object) this.f117175b))) {
                        C46448b.m100836a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    private C46448b() {
    }

    /* renamed from: a */
    public static final String m100834a(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.uniqueVideoSessionDir(C43308eb.f109496i);
        } else {
            str = null;
        }
        return C52711k.m112231a(str, (Object) File.separator);
    }

    /* renamed from: a */
    public static final void m100837a(List<TimeSpeedModelExtension> list) {
        if (list != null) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : list) {
                if (timeSpeedModelExtension != null) {
                    C46066a backgroundVideo = timeSpeedModelExtension.getBackgroundVideo();
                    if (backgroundVideo != null) {
                        m100836a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static final void m100838b(C43789em emVar, C46066a aVar) {
        C52711k.m112240b(emVar, "segments");
        C0013i.m16a((Callable<TResult>) new C46449a<TResult>(emVar, aVar));
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.aweme.shortvideo.em, code=com.ss.android.ugc.aweme.shortvideo.em<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension>, for r3v0, types: [com.ss.android.ugc.aweme.shortvideo.em<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension>, com.ss.android.ugc.aweme.shortvideo.em, java.lang.Object] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m100835a(com.p683ss.android.ugc.aweme.shortvideo.C43789em<com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension> r3, com.p683ss.android.ugc.aweme.sticker.model.C46066a r4) {
        /*
            java.lang.String r0 = "segments"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            if (r4 == 0) goto L_0x0039
            r0 = 1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x000e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r1 = (com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension) r1
            java.lang.String r2 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.sticker.model.a r1 = r1.getBackgroundVideo()
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r4)
            if (r1 == 0) goto L_0x000e
            r0 = 0
            goto L_0x000e
        L_0x002b:
            if (r0 == 0) goto L_0x0038
            java.lang.String r3 = r4.getVideoPath()
            java.lang.String r4 = r4.getAudioPath()
            m100836a(r3, r4)
        L_0x0038:
            return
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46448b.m100835a(com.ss.android.ugc.aweme.shortvideo.em, com.ss.android.ugc.aweme.sticker.model.a):void");
    }

    /* renamed from: a */
    public static final void m100836a(String str, String str2) {
        try {
            C48016e.m103947c(str);
            C48016e.m103947c(str2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Delete BGV failed, videoPath: ");
            sb.append(str);
            sb.append(" audioPath: ");
            sb.append(str2);
            sb.append(" error: ");
            sb.append(e.getMessage());
            C32458a.m75144a(sb.toString());
        }
    }
}
