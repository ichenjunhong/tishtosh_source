package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.shortvideo.C43852fu;
import com.p683ss.android.ugc.aweme.shortvideo.p2266z.C45642b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45252b;
import com.p683ss.ttuploader.TTVideoInfo;
import com.p683ss.ttuploader.TTVideoUploader;
import com.p683ss.ttuploader.TTVideoUploaderListener;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask */
public final class SubtitleOriginalSoundUploadTask implements Parcelable {
    public static final C44849a CREATOR = new C44849a(null);

    /* renamed from: a */
    public String f113496a;

    /* renamed from: b */
    public final String f113497b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask$a */
    public static final class C44849a implements Creator<SubtitleOriginalSoundUploadTask> {
        private C44849a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SubtitleOriginalSoundUploadTask[i];
        }

        public /* synthetic */ C44849a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new SubtitleOriginalSoundUploadTask(parcel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask$b */
    public static final class C44850b implements TTVideoUploaderListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleOriginalSoundUploadTask f113498a;

        /* renamed from: b */
        final /* synthetic */ C43852fu f113499b;

        /* renamed from: c */
        final /* synthetic */ TTVideoUploader f113500c;

        /* renamed from: d */
        final /* synthetic */ C0027j f113501d;

        public final String getStringFromExtern(int i) {
            return null;
        }

        public final void onLog(int i, int i2, String str) {
        }

        public final void onUploadVideoStage(int i, long j) {
        }

        public final int videoUploadCheckNetState(int i, int i2) {
            return C45252b.m98738a(this.f113499b, "SubtitleOriginalSoundUpload");
        }

        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i != 0) {
                if (i == 2) {
                    this.f113500c.close();
                    C0027j jVar = this.f113501d;
                    StringBuilder sb = new StringBuilder("upload failed ");
                    sb.append(j);
                    sb.append('.');
                    jVar.mo46b((Exception) new IllegalArgumentException(sb.toString()));
                }
                return;
            }
            SubtitleOriginalSoundUploadTask subtitleOriginalSoundUploadTask = this.f113498a;
            if (tTVideoInfo == null) {
                C52711k.m112234a();
            }
            subtitleOriginalSoundUploadTask.f113496a = tTVideoInfo.mTosKey;
            this.f113500c.close();
            this.f113501d.mo47b(this.f113498a);
        }

        C44850b(SubtitleOriginalSoundUploadTask subtitleOriginalSoundUploadTask, C43852fu fuVar, TTVideoUploader tTVideoUploader, C0027j jVar) {
            this.f113498a = subtitleOriginalSoundUploadTask;
            this.f113499b = fuVar;
            this.f113500c = tTVideoUploader;
            this.f113501d = jVar;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f113497b, (java.lang.Object) ((com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask) r2).f113497b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask r2 = (com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask) r2
            java.lang.String r0 = r1.f113497b
            java.lang.String r2 = r2.f113497b
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f113497b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleOriginalSoundUploadTask(originalSoundPath=");
        sb.append(this.f113497b);
        sb.append(")");
        return sb.toString();
    }

    public SubtitleOriginalSoundUploadTask(String str) {
        C52711k.m112240b(str, "originalSoundPath");
        this.f113497b = str;
    }

    public SubtitleOriginalSoundUploadTask(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            C52711k.m112234a();
        }
        this(readString);
        this.f113496a = parcel.readString();
    }

    /* renamed from: a */
    public final C0013i<SubtitleOriginalSoundUploadTask> mo90938a(C43852fu fuVar) {
        C52711k.m112240b(fuVar, "config");
        int a = C45642b.m99389a(this.f113497b);
        if (a != 0) {
            StringBuilder sb = new StringBuilder("file error, ");
            sb.append(this.f113497b);
            sb.append(" checkResult = ");
            sb.append(a);
            C0013i<SubtitleOriginalSoundUploadTask> a2 = C0013i.m13a((Exception) new IllegalStateException(sb.toString()));
            C52711k.m112236a((Object) a2, "Task.forError(IllegalSta…kResult = $checkResult\"))");
            return a2;
        }
        C0027j jVar = new C0027j();
        TTVideoUploader tTVideoUploader = new TTVideoUploader();
        try {
            tTVideoUploader.setListener(new C44850b(this, fuVar, tTVideoUploader, jVar));
            tTVideoUploader.setMaxFailTime(fuVar.f111072h);
            tTVideoUploader.setSliceSize(fuVar.f111070f);
            tTVideoUploader.setFileUploadDomain(fuVar.f111066b);
            tTVideoUploader.setVideoUploadDomain(fuVar.f111067c);
            tTVideoUploader.setSliceTimeout(fuVar.f111068d);
            tTVideoUploader.setPathName(this.f113497b);
            tTVideoUploader.setFileRetryCount(1);
            tTVideoUploader.setUserKey(fuVar.f111060A);
            tTVideoUploader.setAuthorization(fuVar.f111061B);
            tTVideoUploader.setSocketNum(1);
            tTVideoUploader.start();
        } catch (Exception unused) {
            tTVideoUploader.close();
        }
        C0013i<TResult> iVar = jVar.f77a;
        C52711k.m112236a((Object) iVar, "taskCompletionSource.task");
        return iVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f113497b);
        parcel.writeString(this.f113496a);
    }
}
