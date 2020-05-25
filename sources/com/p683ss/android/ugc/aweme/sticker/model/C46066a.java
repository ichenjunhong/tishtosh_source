package com.p683ss.android.ugc.aweme.sticker.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.UUID;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.a */
public final class C46066a implements Serializable {
    @C17952c(mo34828a = "videoPath")

    /* renamed from: a */
    private final String f116239a;
    @C17952c(mo34828a = "audioPath")

    /* renamed from: b */
    private final String f116240b;
    @C17952c(mo34828a = "maxDuration")

    /* renamed from: c */
    private final long f116241c;
    @C17952c(mo34828a = "isMultiBgVideo")

    /* renamed from: d */
    private final boolean f116242d;
    @C17952c(mo34828a = "endTime")

    /* renamed from: e */
    private long f116243e;
    @C17952c(mo34828a = "uid")

    /* renamed from: f */
    private final String f116244f;

    public final String getAudioPath() {
        return this.f116240b;
    }

    public final long getEndTime() {
        return this.f116243e;
    }

    public final long getMaxDuration() {
        return this.f116241c;
    }

    public final String getUid() {
        return this.f116244f;
    }

    public final String getVideoPath() {
        return this.f116239a;
    }

    public final boolean isMultiBgVideo() {
        return this.f116242d;
    }

    public final int hashCode() {
        return this.f116239a.hashCode();
    }

    public final void setEndTime(long j) {
        this.f116243e = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C46066a)) {
            return false;
        }
        C46066a aVar = (C46066a) obj;
        if (!C52711k.m112239a((Object) this.f116239a, (Object) aVar.f116239a) || !C52711k.m112239a((Object) this.f116240b, (Object) aVar.f116240b)) {
            return false;
        }
        return true;
    }

    public C46066a(String str, String str2, long j, boolean z, long j2, String str3) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        C52711k.m112240b(str3, "uid");
        this.f116239a = str;
        this.f116240b = str2;
        this.f116241c = j;
        this.f116242d = z;
        this.f116243e = j2;
        this.f116244f = str3;
    }

    public /* synthetic */ C46066a(String str, String str2, long j, boolean z, long j2, String str3, int i, C52707g gVar) {
        boolean z2;
        long j3;
        String str4;
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            j3 = 0;
        } else {
            j3 = j2;
        }
        if ((i & 32) != 0) {
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str3;
        }
        this(str, str2, j, z2, j3, str4);
    }
}
