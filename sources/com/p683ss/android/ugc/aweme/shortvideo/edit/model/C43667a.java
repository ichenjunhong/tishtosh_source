package com.p683ss.android.ugc.aweme.shortvideo.edit.model;

import java.io.File;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.a */
public final class C43667a {
    /* renamed from: b */
    public static final long m95926b(EditPreviewInfo editPreviewInfo) {
        long j = 0;
        if (editPreviewInfo == null) {
            return 0;
        }
        for (EditVideoSegment videoPath : editPreviewInfo.getVideoList()) {
            j += new File(videoPath.getVideoPath()).length();
        }
        return j;
    }

    /* renamed from: c */
    public static final long m95927c(EditPreviewInfo editPreviewInfo) {
        long j = 0;
        if (editPreviewInfo == null) {
            return 0;
        }
        for (EditVideoSegment audioPath : editPreviewInfo.getVideoList()) {
            j += new File(audioPath.getAudioPath()).length();
        }
        return j;
    }

    /* renamed from: a */
    public static final String m95925a(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object next : editPreviewInfo.getVideoList()) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            EditVideoSegment editVideoSegment = (EditVideoSegment) next;
            StringBuilder sb2 = new StringBuilder("the ");
            sb2.append(i);
            sb2.append(" video path =>{");
            sb2.append(editVideoSegment.getVideoPath());
            sb2.append("} \n");
            sb.append(sb2.toString());
            i = i2;
        }
        String sb3 = sb.toString();
        C52711k.m112236a((Object) sb3, "stringBuilder.toString()");
        return sb3;
    }

    /* renamed from: d */
    public static final String m95928d(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object next : editPreviewInfo.getVideoList()) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            EditVideoSegment editVideoSegment = (EditVideoSegment) next;
            StringBuilder sb2 = new StringBuilder("the ");
            sb2.append(i);
            sb2.append(" audio path => {");
            sb2.append(editVideoSegment.getAudioPath());
            sb2.append("} \n");
            sb.append(sb2.toString());
            i = i2;
        }
        String sb3 = sb.toString();
        C52711k.m112236a((Object) sb3, "stringBuilder.toString()");
        return sb3;
    }
}
