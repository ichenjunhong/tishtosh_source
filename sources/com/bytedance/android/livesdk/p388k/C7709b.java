package com.bytedance.android.livesdk.p388k;

import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.k.b */
public final class C7709b {

    /* renamed from: d */
    public static final C7710a f21212d = new C7710a(null);

    /* renamed from: a */
    public final int f21213a = 1;

    /* renamed from: b */
    public final String f21214b;

    /* renamed from: c */
    public final JSONObject f21215c;

    /* renamed from: com.bytedance.android.livesdk.k.b$a */
    public static final class C7710a {
        private C7710a() {
        }

        public /* synthetic */ C7710a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7709b) {
                C7709b bVar = (C7709b) obj;
                if (!(this.f21213a == bVar.f21213a) || !C52711k.m112239a((Object) this.f21214b, (Object) bVar.f21214b) || !C52711k.m112239a((Object) this.f21215c, (Object) bVar.f21215c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f21213a * 31;
        String str = this.f21214b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f21215c;
        if (jSONObject != null) {
            i2 = jSONObject.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerH5RoomStatusChangeEvent(position=");
        sb.append(this.f21213a);
        sb.append(", type=");
        sb.append(this.f21214b);
        sb.append(", data=");
        sb.append(this.f21215c);
        sb.append(")");
        return sb.toString();
    }

    public C7709b(int i, String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(jSONObject, "data");
        this.f21214b = str;
        this.f21215c = jSONObject;
    }
}
