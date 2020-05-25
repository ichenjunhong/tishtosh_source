package com.p683ss.android.ugc.aweme.shortvideo.upload;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.k */
public final class C45307k {

    /* renamed from: a */
    public static final C45307k f114559a = new C45307k();

    private C45307k() {
    }

    /* renamed from: a */
    public static final String m98775a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            if (!videoPublishEditModel.isFastImport) {
                videoPublishEditModel = null;
            }
            if (videoPublishEditModel != null) {
                List arrayList = new ArrayList();
                if (videoPublishEditModel.getPreviewInfo() == null) {
                    return null;
                }
                for (EditVideoSegment editVideoSegment : videoPublishEditModel.getPreviewInfo().getVideoList()) {
                    arrayList.add(new VideoSegment(editVideoSegment.getVideoPath(), editVideoSegment.getVideoFileInfo().getWidth(), editVideoSegment.getVideoFileInfo().getHeight(), (int) editVideoSegment.getVideoFileInfo().getDuration()));
                }
                return m98776a(arrayList);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (r1.equals("lv") != false) goto L_0x0081;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p683ss.android.ugc.aweme.shortvideo.upload.C45309m m98774a(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "/"
            r2 = 2
            java.lang.String r6 = p2628d.p2650m.C52830p.m112450b(r6, r1, r0, r2, r0)     // Catch:{ Exception -> 0x00aa }
            d.m.l r1 = new d.m.l     // Catch:{ Exception -> 0x00aa }
            java.lang.String r2 = "^(faceu|beautyme|lv)_\\d+_\\d+[\\s\\S]*(.mp4)$"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00aa }
            r2 = r6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x00aa }
            boolean r1 = r1.containsMatchIn(r2)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00aa
            d.m.l r1 = new d.m.l     // Catch:{ Exception -> 0x00aa }
            java.lang.String r2 = "([_.])"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x00aa }
            r2 = 0
            java.util.List r6 = r1.split(r6, r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.Object r1 = r6.get(r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00aa }
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00aa }
            r4 = 3466(0xd8a, float:4.857E-42)
            r5 = 1
            if (r3 == r4) goto L_0x0079
            r4 = 97187256(0x5caf5b8, float:1.9086252E-35)
            if (r3 == r4) goto L_0x0070
            r4 = 1328934676(0x4f35ef14, float:3.05234432E9)
            if (r3 == r4) goto L_0x0043
            goto L_0x00aa
        L_0x0043:
            java.lang.String r3 = "beautyme"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00aa
            java.lang.String r1 = "beauty_me"
            java.lang.Integer[] r3 = new java.lang.Integer[r5]     // Catch:{ Exception -> 0x00aa }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00aa }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x00aa }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00aa }
            r3[r2] = r6     // Catch:{ Exception -> 0x00aa }
            java.util.ArrayList r6 = p2628d.p2629a.C52575l.m112103d(r3)     // Catch:{ Exception -> 0x00aa }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.aweme.shortvideo.upload.l r2 = new com.ss.android.ugc.aweme.shortvideo.upload.l     // Catch:{ Exception -> 0x00aa }
            r2.<init>(r1, r6)     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.aweme.shortvideo.upload.m r6 = new com.ss.android.ugc.aweme.shortvideo.upload.m     // Catch:{ Exception -> 0x00aa }
            r6.<init>(r0, r2, r5, r0)     // Catch:{ Exception -> 0x00aa }
            return r6
        L_0x0070:
            java.lang.String r3 = "faceu"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00aa
            goto L_0x0081
        L_0x0079:
            java.lang.String r3 = "lv"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00aa
        L_0x0081:
            java.lang.Object r1 = r6.get(r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00aa }
            java.lang.Integer[] r3 = new java.lang.Integer[r5]     // Catch:{ Exception -> 0x00aa }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00aa }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x00aa }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00aa }
            r3[r2] = r6     // Catch:{ Exception -> 0x00aa }
            java.util.ArrayList r6 = p2628d.p2629a.C52575l.m112103d(r3)     // Catch:{ Exception -> 0x00aa }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.aweme.shortvideo.upload.l r2 = new com.ss.android.ugc.aweme.shortvideo.upload.l     // Catch:{ Exception -> 0x00aa }
            r2.<init>(r1, r6)     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.aweme.shortvideo.upload.m r6 = new com.ss.android.ugc.aweme.shortvideo.upload.m     // Catch:{ Exception -> 0x00aa }
            r6.<init>(r0, r2, r5, r0)     // Catch:{ Exception -> 0x00aa }
            return r6
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.upload.C45307k.m98774a(java.lang.String):com.ss.android.ugc.aweme.shortvideo.upload.m");
    }

    /* renamed from: a */
    private static String m98776a(List<? extends VideoSegment> list) {
        C52711k.m112240b(list, "segments");
        List arrayList = new ArrayList();
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            for (VideoSegment a : list) {
                C45309m a2 = m98774a(a.mo86941a(false));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            try {
                return C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(arrayList);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
