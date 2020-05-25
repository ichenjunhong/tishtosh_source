package com.p683ss.android.ugc.aweme.services;

/* renamed from: com.ss.android.ugc.aweme.services.SDKServiceImpl */
public final class SDKServiceImpl implements ISDKService {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void split(android.content.Context r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, com.p683ss.android.ugc.aweme.services.ISDKService.SplitCallback r14) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "workspace"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "videoPath"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.lang.String r0 = "targetAudioFile"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            java.lang.String r0 = "targetVideoFile"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "callback"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r0)
            boolean r0 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r11)
            r1 = 0
            if (r0 == 0) goto L_0x006a
            boolean r0 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r12)
            if (r0 == 0) goto L_0x006a
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x0056 }
            r7.<init>()     // Catch:{ Exception -> 0x0056 }
            r7.setDataSource(r12)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            r8 = 18
            java.lang.String r8 = r7.extractMetadata(r8)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            r9 = 19
            java.lang.String r9 = r7.extractMetadata(r9)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            r14.onSuccess(r8, r9)     // Catch:{ Exception -> 0x0050, all -> 0x004e }
            r7.release()
            return
        L_0x004e:
            r8 = move-exception
            goto L_0x0064
        L_0x0050:
            r8 = move-exception
            r1 = r7
            goto L_0x0057
        L_0x0053:
            r8 = move-exception
            r7 = r1
            goto L_0x0064
        L_0x0056:
            r8 = move-exception
        L_0x0057:
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r8)     // Catch:{ all -> 0x0053 }
            r14.onFail()     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0063
            r1.release()
            return
        L_0x0063:
            return
        L_0x0064:
            if (r7 == 0) goto L_0x0069
            r7.release()
        L_0x0069:
            throw r8
        L_0x006a:
            r0 = 11
            int[] r0 = new int[r0]
            r2 = 0
            r3 = 2
            r4 = 1
            if (r13 == 0) goto L_0x00e5
            com.ss.android.vesdk.o r7 = new com.ss.android.vesdk.o     // Catch:{ p -> 0x00bf }
            r7.<init>(r9)     // Catch:{ p -> 0x00bf }
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ p -> 0x00bf }
            r9[r2] = r10     // Catch:{ p -> 0x00bf }
            com.ss.android.vesdk.o$j r13 = com.p683ss.android.vesdk.C50720o.C50749j.VIDEO_OUT_RATIO_ORIGINAL     // Catch:{ p -> 0x00bf }
            int r9 = r7.mo99324a(r9, r1, r1, r13)     // Catch:{ p -> 0x00bf }
            if (r9 == 0) goto L_0x0087
            r14.onFail()     // Catch:{ p -> 0x00bf }
        L_0x0087:
            int r9 = r7.mo99379i()     // Catch:{ p -> 0x00bf }
            if (r9 == 0) goto L_0x0090
            r14.onFail()     // Catch:{ p -> 0x00bf }
        L_0x0090:
            int r9 = r7.mo99407v()     // Catch:{ p -> 0x00bf }
            if (r9 >= r8) goto L_0x0099
            r14.onFail()     // Catch:{ p -> 0x00bf }
        L_0x0099:
            com.p683ss.android.vesdk.VEUtils.getVideoFileInfo(r10, r0)     // Catch:{ p -> 0x00bf }
            r8 = r0[r2]     // Catch:{ p -> 0x00bf }
            r9 = r0[r4]     // Catch:{ p -> 0x00bf }
            com.ss.android.vesdk.VEVideoEncodeSettings$a r10 = new com.ss.android.vesdk.VEVideoEncodeSettings$a     // Catch:{ p -> 0x00bf }
            r10.<init>(r3)     // Catch:{ p -> 0x00bf }
            com.ss.android.vesdk.VEVideoEncodeSettings$a r10 = r10.mo98692a(r8, r9)     // Catch:{ p -> 0x00bf }
            r13 = 7
            r13 = r0[r13]     // Catch:{ p -> 0x00bf }
            com.ss.android.vesdk.VEVideoEncodeSettings$a r10 = r10.mo98691a(r13)     // Catch:{ p -> 0x00bf }
            com.ss.android.vesdk.VEVideoEncodeSettings r10 = r10.mo98705a()     // Catch:{ p -> 0x00bf }
            com.ss.android.ugc.aweme.services.SDKServiceImpl$split$1 r13 = new com.ss.android.ugc.aweme.services.SDKServiceImpl$split$1     // Catch:{ p -> 0x00bf }
            r13.<init>(r14, r8, r9, r7)     // Catch:{ p -> 0x00bf }
            com.ss.android.vesdk.VEListener$k r13 = (com.p683ss.android.vesdk.VEListener.C50547k) r13     // Catch:{ p -> 0x00bf }
            r7.mo99336a(r12, r11, r10, r13)     // Catch:{ p -> 0x00bf }
            return
        L_0x00bf:
            r7 = move-exception
            r14.onFail()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "VEEditor compile failed, ret = "
            r8.<init>(r9)
            int r9 = r7.getRetCd()
            r8.append(r9)
            java.lang.String r9 = ", e: "
            r8.append(r9)
            java.lang.String r7 = r7.getMsgDes()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r7)
            return
        L_0x00e5:
            com.ss.android.medialib.FFMpegManager r9 = com.p683ss.android.medialib.FFMpegManager.m46826a()
            int[] r9 = r9.mo39233a(r10)
            com.ss.android.medialib.FFMpegManager r13 = com.p683ss.android.medialib.FFMpegManager.m46826a()
            r13.mo39234b()
            r13 = r9[r2]
            if (r13 == 0) goto L_0x00fc
            r14.onFail()
            return
        L_0x00fc:
            r13 = r9[r3]
            int r13 = r13 / r3
            r0 = 3
            r0 = r9[r0]
            int r0 = r0 / r3
            com.ss.android.medialib.FFMpegManager$a r1 = new com.ss.android.medialib.FFMpegManager$a
            r1.<init>()
            int r3 = r13 % 2
            if (r3 != 0) goto L_0x010e
            r5 = r13
            goto L_0x0110
        L_0x010e:
            int r5 = r13 + -1
        L_0x0110:
            r1.f52959o = r5
            if (r3 != 0) goto L_0x0116
            r3 = r0
            goto L_0x0118
        L_0x0116:
            int r3 = r0 + -1
        L_0x0118:
            r1.f52960p = r3
            r1.f52947c = r11
            r1.f52945a = r10
            r1.f52946b = r12
            int r7 = com.bytedance.common.utility.C9432q.m18670a(r7)
            r1.f52950f = r7
            r10 = 0
            r1.f52948d = r10
            r7 = r9[r4]
            long r9 = (long) r7
            r1.f52949e = r9
            r1.f52954j = r2
            r1.f52958n = r8
            r1.f52965u = r4
            com.ss.android.medialib.FFMpegManager r7 = com.p683ss.android.medialib.FFMpegManager.m46826a()
            int r7 = r7.mo39231a(r1)
            if (r7 != 0) goto L_0x0143
            r14.onSuccess(r13, r0)
            return
        L_0x0143:
            r14.onFail()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.services.SDKServiceImpl.split(android.content.Context, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.ss.android.ugc.aweme.services.ISDKService$SplitCallback):void");
    }
}
