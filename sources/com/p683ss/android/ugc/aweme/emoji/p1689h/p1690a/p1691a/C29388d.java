package com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.a.a.d */
public final class C29388d extends BaseResponse {
    @C17952c(mo34828a = "android_emoji_resource")

    /* renamed from: a */
    public final C29386b f76980a;
    @C17952c(mo34828a = "android_emoji_status")

    /* renamed from: b */
    public final int f76981b;
    @C17952c(mo34828a = "ios_emoji_resource")

    /* renamed from: c */
    public final C29386b f76982c;
    @C17952c(mo34828a = "ios_emoji_status")

    /* renamed from: d */
    public final int f76983d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29388d) {
                C29388d dVar = (C29388d) obj;
                if (C52711k.m112239a((Object) this.f76980a, (Object) dVar.f76980a)) {
                    if ((this.f76981b == dVar.f76981b) && C52711k.m112239a((Object) this.f76982c, (Object) dVar.f76982c)) {
                        if (this.f76983d == dVar.f76983d) {
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
        C29386b bVar = this.f76980a;
        int i = 0;
        int hashCode = (((bVar != null ? bVar.hashCode() : 0) * 31) + this.f76981b) * 31;
        C29386b bVar2 = this.f76982c;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f76983d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineSmallEmojiResponse(resources=");
        sb.append(this.f76980a);
        sb.append(", emojiStatus=");
        sb.append(this.f76981b);
        sb.append(", iosResources=");
        sb.append(this.f76982c);
        sb.append(", iosEmojiStatus=");
        sb.append(this.f76983d);
        sb.append(")");
        return sb.toString();
    }
}
