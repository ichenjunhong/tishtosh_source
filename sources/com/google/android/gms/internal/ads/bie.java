package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class bie {

    /* renamed from: a */
    public final String f42471a;

    /* renamed from: b */
    public final long f42472b;

    /* renamed from: c */
    public final int f42473c;

    /* renamed from: d */
    public final int f42474d;

    /* renamed from: e */
    public final float f42475e;

    /* renamed from: f */
    public final List<byte[]> f42476f;

    /* renamed from: g */
    private final int f42477g;

    /* renamed from: h */
    private final int f42478h;

    /* renamed from: i */
    private final int f42479i;

    /* renamed from: j */
    private int f42480j;

    /* renamed from: k */
    private int f42481k;

    /* renamed from: l */
    private int f42482l;

    /* renamed from: m */
    private MediaFormat f42483m;

    /* renamed from: a */
    public static bie m35769a(String str, int i, long j, int i2, int i3, List<byte[]> list) {
        return m35768a(str, -1, j, i2, i3, 1.0f, list);
    }

    /* renamed from: a */
    public static bie m35768a(String str, int i, long j, int i2, int i3, float f, List<byte[]> list) {
        bie bie = new bie(str, -1, j, i2, i3, f, -1, -1, list);
        return bie;
    }

    /* renamed from: b */
    public static bie m35771b(String str, int i, long j, int i2, int i3, List<byte[]> list) {
        bie bie = new bie(str, i, j, -1, -1, -1.0f, i2, i3, list);
        return bie;
    }

    bie(MediaFormat mediaFormat) {
        this.f42483m = mediaFormat;
        this.f42471a = mediaFormat.getString("mime");
        this.f42477g = m35767a(mediaFormat, "max-input-size");
        this.f42473c = m35767a(mediaFormat, "width");
        this.f42474d = m35767a(mediaFormat, "height");
        this.f42478h = m35767a(mediaFormat, "channel-count");
        this.f42479i = m35767a(mediaFormat, "sample-rate");
        String str = "com.google.android.videos.pixelWidthHeightRatio";
        this.f42475e = mediaFormat.containsKey(str) ? mediaFormat.getFloat(str) : -1.0f;
        this.f42476f = new ArrayList();
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            if (!mediaFormat.containsKey(sb.toString())) {
                break;
            }
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("csd-");
            sb2.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.get(bArr);
            this.f42476f.add(bArr);
            byteBuffer.flip();
            i++;
        }
        this.f42472b = mediaFormat.containsKey("durationUs") ? mediaFormat.getLong("durationUs") : -1;
        this.f42480j = -1;
        this.f42481k = -1;
    }

    bie(String str, int i, long j, int i2, int i3, float f, int i4, int i5, List<byte[]> list) {
        this.f42471a = str;
        this.f42477g = i;
        this.f42472b = j;
        this.f42473c = i2;
        this.f42474d = i3;
        this.f42475e = f;
        this.f42478h = i4;
        this.f42479i = i5;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f42476f = list;
        this.f42480j = -1;
        this.f42481k = -1;
    }

    public final int hashCode() {
        if (this.f42482l == 0) {
            int hashCode = (((((((((((((((((((this.f42471a == null ? 0 : this.f42471a.hashCode()) + 527) * 31) + this.f42477g) * 31) + this.f42473c) * 31) + this.f42474d) * 31) + Float.floatToRawIntBits(this.f42475e)) * 31) + ((int) this.f42472b)) * 31) + this.f42480j) * 31) + this.f42481k) * 31) + this.f42478h) * 31) + this.f42479i;
            for (int i = 0; i < this.f42476f.size(); i++) {
                hashCode = (hashCode * 31) + Arrays.hashCode((byte[]) this.f42476f.get(i));
            }
            this.f42482l = hashCode;
        }
        return this.f42482l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bie bie = (bie) obj;
        if (this.f42477g == bie.f42477g && this.f42473c == bie.f42473c && this.f42474d == bie.f42474d && this.f42475e == bie.f42475e && this.f42480j == bie.f42480j && this.f42481k == bie.f42481k && this.f42478h == bie.f42478h && this.f42479i == bie.f42479i) {
            String str = this.f42471a;
            String str2 = bie.f42471a;
            boolean z = str == null ? str2 == null : str.equals(str2);
            if (z && this.f42476f.size() == bie.f42476f.size()) {
                for (int i = 0; i < this.f42476f.size(); i++) {
                    if (!Arrays.equals((byte[]) this.f42476f.get(i), (byte[]) bie.f42476f.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f42471a;
        int i = this.f42477g;
        int i2 = this.f42473c;
        int i3 = this.f42474d;
        float f = this.f42475e;
        int i4 = this.f42478h;
        int i5 = this.f42479i;
        long j = this.f42472b;
        int i6 = this.f42480j;
        int i7 = this.f42481k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 143);
        sb.append("MediaFormat(");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(i7);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final MediaFormat mo30219a() {
        if (this.f42483m == null) {
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", this.f42471a);
            m35770a(mediaFormat, "max-input-size", this.f42477g);
            m35770a(mediaFormat, "width", this.f42473c);
            m35770a(mediaFormat, "height", this.f42474d);
            m35770a(mediaFormat, "channel-count", this.f42478h);
            m35770a(mediaFormat, "sample-rate", this.f42479i);
            String str = "com.google.android.videos.pixelWidthHeightRatio";
            float f = this.f42475e;
            if (f != -1.0f) {
                mediaFormat.setFloat(str, f);
            }
            for (int i = 0; i < this.f42476f.size(); i++) {
                StringBuilder sb = new StringBuilder(15);
                sb.append("csd-");
                sb.append(i);
                mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) this.f42476f.get(i)));
            }
            if (this.f42472b != -1) {
                mediaFormat.setLong("durationUs", this.f42472b);
            }
            m35770a(mediaFormat, "max-width", this.f42480j);
            m35770a(mediaFormat, "max-height", this.f42481k);
            this.f42483m = mediaFormat;
        }
        return this.f42483m;
    }

    /* renamed from: a */
    private static final void m35770a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    private static final int m35767a(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }
}
