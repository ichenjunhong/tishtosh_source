package com.p683ss.avframework.livestreamv2.audioeffect;

import android.os.SystemClock;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import java.io.File;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEqualizer */
public class AudioEqualizer {
    private long handle;
    private final int mChannels;

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEqualizer$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (C18973a.m46144a(str)) {
                    C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
                    StringBuilder sb = new StringBuilder();
                    C47964c.m103778e();
                    sb.append(C47964c.m103775a());
                    sb.append("/lib");
                    sb.append(str);
                    sb.append(".so");
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        C18973a.m46142a(str, 2);
                        System.load(sb2);
                        C18973a.m46141a(uptimeMillis, str);
                        return;
                    }
                    C18973a.m46142a(str, 3);
                }
            } catch (Throwable unused) {
            }
            C11511a.m23578a(str);
            C18973a.m46141a(uptimeMillis, str);
        }
    }

    private native long deleteInstance(long j);

    private static native void init(String str);

    private static native long newInstance(int i, int i2, String str);

    private native int process(long j, float[] fArr, float[] fArr2, int i, int i2);

    private native void updateParams(long j, String str);

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.handle != 0) {
            release();
        }
    }

    public synchronized void release() {
        this.handle = 0;
        deleteInstance(this.handle);
    }

    static {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("audioeffect");
        init(AudioEqualizer.class.getCanonicalName().replaceAll("\\.", "/"));
    }

    public void updateParams(EqualizerParams equalizerParams) {
        if (this.handle != 0) {
            updateParams(this.handle, equalizerParams.getParamsAsString());
        }
    }

    public AudioEqualizer(int i, int i2, EqualizerParams equalizerParams) {
        this.mChannels = i2;
        this.handle = newInstance(i, i2, equalizerParams.getParamsAsString());
    }

    public int process(float[] fArr, float[] fArr2, int i) {
        return process(this.handle, fArr, fArr2, i, this.mChannels);
    }
}
