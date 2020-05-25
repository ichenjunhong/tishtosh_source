package com.p683ss.android.ugc.aweme.account.login.recover.p1288a;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1289a.C21412b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21418b;
import java.io.Serializable;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.b */
public final class C21414b extends C13090h<C21418b> {

    /* renamed from: e */
    public static final C21415a f58096e = new C21415a(null);

    /* renamed from: f */
    private C21418b f58097f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.b$a */
    public static final class C21415a {
        private C21415a() {
        }

        public /* synthetic */ C21415a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.b$b */
    public static final class C21416b implements Serializable {

        /* renamed from: a */
        private final int f58098a;

        /* renamed from: b */
        private final String f58099b;

        /* renamed from: c */
        private final String f58100c;

        /* renamed from: d */
        private final String f58101d;

        /* renamed from: e */
        private final String f58102e;

        public static /* synthetic */ C21416b copy$default(C21416b bVar, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bVar.f58098a;
            }
            if ((i2 & 2) != 0) {
                str = bVar.f58099b;
            }
            String str5 = str;
            if ((i2 & 4) != 0) {
                str2 = bVar.f58100c;
            }
            String str6 = str2;
            if ((i2 & 8) != 0) {
                str3 = bVar.f58101d;
            }
            String str7 = str3;
            if ((i2 & 16) != 0) {
                str4 = bVar.f58102e;
            }
            return bVar.copy(i, str5, str6, str7, str4);
        }

        public final int component1() {
            return this.f58098a;
        }

        public final String component2() {
            return this.f58099b;
        }

        public final String component3() {
            return this.f58100c;
        }

        public final String component4() {
            return this.f58101d;
        }

        public final String component5() {
            return this.f58102e;
        }

        public final C21416b copy(int i, String str, String str2, String str3, String str4) {
            C21416b bVar = new C21416b(i, str, str2, str3, str4);
            return bVar;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C21416b) {
                    C21416b bVar = (C21416b) obj;
                    if (!(this.f58098a == bVar.f58098a) || !C52711k.m112239a((Object) this.f58099b, (Object) bVar.f58099b) || !C52711k.m112239a((Object) this.f58100c, (Object) bVar.f58100c) || !C52711k.m112239a((Object) this.f58101d, (Object) bVar.f58101d) || !C52711k.m112239a((Object) this.f58102e, (Object) bVar.f58102e)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final String getArea_code() {
            return this.f58099b;
        }

        public final String getDouyin_no() {
            return this.f58101d;
        }

        public final String getEmail() {
            return this.f58102e;
        }

        public final int getFind_way() {
            return this.f58098a;
        }

        public final String getMobile() {
            return this.f58100c;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f58098a) * 31;
            String str = this.f58099b;
            int i = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f58100c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f58101d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f58102e;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GetAccountTicketRequestObj(find_way=");
            sb.append(this.f58098a);
            sb.append(", area_code=");
            sb.append(this.f58099b);
            sb.append(", mobile=");
            sb.append(this.f58100c);
            sb.append(", douyin_no=");
            sb.append(this.f58101d);
            sb.append(", email=");
            sb.append(this.f58102e);
            sb.append(")");
            return sb.toString();
        }

        public C21416b(int i, String str, String str2, String str3, String str4) {
            this.f58098a = i;
            this.f58099b = str;
            this.f58100c = str2;
            this.f58101d = str3;
            this.f58102e = str4;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) {
        C21418b bVar = new C21418b(true, 10017);
        this.f58097f = bVar;
        if (jSONObject2 != null) {
            bVar.f58106h = jSONObject2.optString("token");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C21418b bVar2;
        if (this.f58097f == null) {
            bVar2 = new C21418b(z, 10017);
        } else {
            bVar2 = this.f58097f;
            if (bVar2 == null) {
                C52711k.m112234a();
            }
            bVar2.f33998a = z;
        }
        if (!z && bVar != null) {
            bVar2.f34000c = bVar.f34150b;
            bVar2.f34001d = bVar.f34151c;
        }
        return bVar2;
    }

    public C21414b(Context context, C13073a aVar, C21412b bVar) {
        C52711k.m112240b(bVar, "call");
        super(context, aVar, bVar);
    }
}
