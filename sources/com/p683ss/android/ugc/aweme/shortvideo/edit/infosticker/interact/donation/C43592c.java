package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import com.p683ss.android.ugc.aweme.sticker.data.C45868a;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.c */
public final class C43592c implements C45868a {

    /* renamed from: a */
    public C49481b f110315a;

    /* renamed from: b */
    public InteractStickerStruct f110316b;

    /* renamed from: c */
    public int f110317c;

    /* renamed from: d */
    public int f110318d;

    public C43592c() {
        this(null, null, 0, 0, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43592c) {
                C43592c cVar = (C43592c) obj;
                if (C52711k.m112239a((Object) this.f110315a, (Object) cVar.f110315a) && C52711k.m112239a((Object) this.f110316b, (Object) cVar.f110316b)) {
                    if (this.f110317c == cVar.f110317c) {
                        if (this.f110318d == cVar.f110318d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C49481b bVar = this.f110315a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        InteractStickerStruct interactStickerStruct = this.f110316b;
        if (interactStickerStruct != null) {
            i = interactStickerStruct.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f110317c) * 31) + this.f110318d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonationStickerData(orgModel=");
        sb.append(this.f110315a);
        sb.append(", interactStruct=");
        sb.append(this.f110316b);
        sb.append(", startTime=");
        sb.append(this.f110317c);
        sb.append(", endTime=");
        sb.append(this.f110318d);
        sb.append(")");
        return sb.toString();
    }

    private C43592c(C49481b bVar, InteractStickerStruct interactStickerStruct, int i, int i2) {
        this.f110315a = bVar;
        this.f110316b = interactStickerStruct;
        this.f110317c = i;
        this.f110318d = i2;
    }

    public /* synthetic */ C43592c(C49481b bVar, InteractStickerStruct interactStickerStruct, int i, int i2, int i3, C52707g gVar) {
        if ((i3 & 1) != 0) {
            bVar = null;
        }
        this(bVar, null, 0, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ C43592c m95768a(C43592c cVar, C49481b bVar, InteractStickerStruct interactStickerStruct, int i, int i2, int i3, Object obj) {
        return new C43592c(cVar.f110315a, cVar.f110316b, cVar.f110317c, cVar.f110318d);
    }
}
