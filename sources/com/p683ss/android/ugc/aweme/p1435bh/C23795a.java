package com.p683ss.android.ugc.aweme.p1435bh;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.bh.a */
public final class C23795a {

    /* renamed from: com.ss.android.ugc.aweme.bh.a$a */
    static final class C23796a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Object f63405a;

        /* renamed from: b */
        final /* synthetic */ String f63406b;

        C23796a(Object obj, String str) {
            this.f63405a = obj;
            this.f63406b = str;
        }

        public final /* synthetic */ Object call() {
            String str;
            if (((VideoPublishEditModel) this.f63405a).isMvThemeVideoType()) {
                str = ((VideoPublishEditModel) this.f63405a).mvCreateVideoData.videoCoverImgPath;
            } else {
                str = ((VideoPublishEditModel) this.f63405a).multiEditVideoRecordData.coverImagePath;
            }
            C48016e.m103948c(str, this.f63406b);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.a$b */
    static final class C23797b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Object f63407a;

        /* renamed from: b */
        final /* synthetic */ String f63408b;

        C23797b(Object obj, String str) {
            this.f63407a = obj;
            this.f63408b = str;
        }

        public final /* synthetic */ Object call() {
            C48016e.m103948c(((VideoPublishEditModel) this.f63407a).statusCreateVideoData.getVideoCoverImgPath(), this.f63408b);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00eb, code lost:
        if (r12 != null) goto L_0x00fe;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p683ss.android.ugc.aweme.shortvideo.publish.C44386j m58413a(android.os.Bundle r12) {
        /*
            java.lang.String r0 = "$this$toPublishModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "shoot_way"
            java.lang.String r1 = ""
            java.lang.String r3 = r12.getString(r0, r1)
            java.lang.String r0 = "publish_retry"
            r1 = 0
            boolean r6 = r12.getBoolean(r0, r1)
            java.lang.String r0 = "review_video_fast_publish"
            boolean r7 = r12.getBoolean(r0, r1)
            java.lang.String r0 = "extra_photo_publish_args"
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "extra_photo_publish_args"
            java.io.Serializable r0 = r12.getSerializable(r0)
            if (r0 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.photo.PhotoContext r0 = (com.p683ss.android.ugc.aweme.photo.PhotoContext) r0
            r2 = 5
            r11 = r0
            r9 = 5
            goto L_0x0087
        L_0x0030:
            d.u r12 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.photo.PhotoContext"
            r12.<init>(r0)
            throw r12
        L_0x0038:
            java.lang.String r0 = "extra_video_publish_args"
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "extra_video_publish_args"
            java.io.Serializable r0 = r12.getSerializable(r0)
            if (r0 != 0) goto L_0x004b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x004b:
            r11 = r0
            r9 = 0
            goto L_0x0087
        L_0x004e:
            java.lang.String r0 = "photo_movie_publish_args"
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "photo_movie_publish_args"
            android.os.Parcelable r0 = r12.getParcelable(r0)
            java.lang.String r2 = "getParcelable(IPhotoMovi…EXTRA_VIDEO_PUBLISH_ARGS)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            r2 = 6
            r11 = r0
            r9 = 6
            goto L_0x0087
        L_0x0065:
            java.lang.String r0 = "story_args"
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "story_args"
            java.io.Serializable r0 = r12.getSerializable(r0)
            if (r0 != 0) goto L_0x0078
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0078:
            java.lang.String r2 = "story_type"
            r4 = -1
            int r2 = r12.getInt(r2, r4)
            boolean r4 = com.p683ss.android.ugc.aweme.photo.publish.C38704c.m86062c(r2)
            if (r4 == 0) goto L_0x0106
            r11 = r0
            r9 = r2
        L_0x0087:
            java.lang.String r0 = "parallel_synthesize_upload"
            boolean r8 = r12.getBoolean(r0, r1)
            java.lang.String r0 = "pre_publish_type"
            int r5 = r12.getInt(r0, r1)
            boolean r12 = r11 instanceof com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
            if (r12 == 0) goto L_0x009e
            r0 = r11
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            java.lang.String r0 = r0.creationId
        L_0x009c:
            r4 = r0
            goto L_0x00ab
        L_0x009e:
            boolean r0 = r11 instanceof com.p683ss.android.ugc.aweme.photo.PhotoContext
            if (r0 == 0) goto L_0x00a8
            r0 = r11
            com.ss.android.ugc.aweme.photo.PhotoContext r0 = (com.p683ss.android.ugc.aweme.photo.PhotoContext) r0
            java.lang.String r0 = r0.creationId
            goto L_0x009c
        L_0x00a8:
            java.lang.String r0 = ""
            goto L_0x009c
        L_0x00ab:
            com.ss.android.ugc.aweme.shortvideo.publish.j r0 = new com.ss.android.ugc.aweme.shortvideo.publish.j
            java.lang.String r1 = "shootWay"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r1)
            java.lang.String r1 = "creationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r1)
            java.lang.String r1 = "publishArgs"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r1)
            java.lang.String r1 = ""
            if (r12 == 0) goto L_0x0100
            r12 = r11
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = (com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r12
            boolean r2 = r12.isMvThemeVideoType()
            if (r2 != 0) goto L_0x00ee
            boolean r2 = r12.isMultiVideoEdit()
            if (r2 == 0) goto L_0x00d0
            goto L_0x00ee
        L_0x00d0:
            boolean r2 = r12.isStatusVideoType()
            if (r2 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.shortvideo.edit.q$a r12 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43761q.f110814a
            java.lang.String r12 = r12.mo89271a()
            com.ss.android.ugc.aweme.bh.a$b r1 = new com.ss.android.ugc.aweme.bh.a$b
            r1.<init>(r11, r12)
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            p001a.C0013i.m16a(r1)
            goto L_0x00fe
        L_0x00e7:
            java.lang.String r12 = r12.getValidVideoCoverPath()
            if (r12 == 0) goto L_0x0100
            goto L_0x00fe
        L_0x00ee:
            com.ss.android.ugc.aweme.shortvideo.edit.q$a r12 = com.p683ss.android.ugc.aweme.shortvideo.edit.C43761q.f110814a
            java.lang.String r12 = r12.mo89271a()
            com.ss.android.ugc.aweme.bh.a$a r1 = new com.ss.android.ugc.aweme.bh.a$a
            r1.<init>(r11, r12)
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            p001a.C0013i.m16a(r1)
        L_0x00fe:
            r10 = r12
            goto L_0x0101
        L_0x0100:
            r10 = r1
        L_0x0101:
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0106:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "publish service not supported this publish "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            throw r12
        L_0x011c:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r0 = "publish service not supported this publish"
            r12.<init>(r0)
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1435bh.C23795a.m58413a(android.os.Bundle):com.ss.android.ugc.aweme.shortvideo.publish.j");
    }
}
