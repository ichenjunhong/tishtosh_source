package com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import com.p683ss.android.vesdk.C50751p;
import com.p683ss.android.vesdk.VEAudioRecorder;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.e */
public final class C43429e {

    /* renamed from: a */
    final VEAudioRecorder f109813a = new VEAudioRecorder();

    /* renamed from: a */
    public final long mo88371a() {
        return this.f109813a.mo98468a();
    }

    /* renamed from: b */
    public final String mo88372b() {
        try {
            String b = this.f109813a.mo98469b();
            C52711k.m112236a((Object) b, "mVEAudioRecorder.wavFilePath");
            return b;
        } catch (C50751p unused) {
            return "";
        }
    }
}
