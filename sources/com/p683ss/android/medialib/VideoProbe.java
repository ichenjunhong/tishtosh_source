package com.p683ss.android.medialib;

import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.medialib.VideoProbe */
public final class VideoProbe {

    /* renamed from: com.ss.android.medialib.VideoProbe$VideoInfo */
    public static class VideoInfo {

        /* renamed from: a */
        public long f52970a;

        /* renamed from: b */
        public String f52971b;

        /* renamed from: c */
        public long f52972c;

        /* renamed from: d */
        public long f52973d;

        /* renamed from: e */
        public int f52974e;

        /* renamed from: f */
        public int f52975f;

        /* renamed from: g */
        public float f52976g;

        /* renamed from: h */
        public int f52977h;

        public String toString() {
            StringBuilder sb = new StringBuilder("VideoInfo{duration=");
            sb.append(this.f52970a);
            sb.append(", videoCodec='");
            sb.append(this.f52971b);
            sb.append('\'');
            sb.append(", nbFrames=");
            sb.append(this.f52972c);
            sb.append(", videoBitRate=");
            sb.append(this.f52973d);
            sb.append(", width=");
            sb.append(this.f52974e);
            sb.append(", height=");
            sb.append(this.f52975f);
            sb.append(", frameRate=");
            sb.append(this.f52976g);
            sb.append(", rotate=");
            sb.append(this.f52977h);
            sb.append('}');
            return sb.toString();
        }
    }

    static {
        C20129b.m49687d();
    }

    private VideoProbe() {
    }

    private static native VideoInfo nativeProbe(String str);
}
