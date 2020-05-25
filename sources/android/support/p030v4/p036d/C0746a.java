package android.support.p030v4.p036d;

import android.support.p030v4.p038f.C0799m;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.d.a */
public final class C0746a {

    /* renamed from: a */
    public final String f2571a;

    /* renamed from: b */
    public final String f2572b;

    /* renamed from: c */
    public final String f2573c;

    /* renamed from: d */
    public final List<List<byte[]>> f2574d;

    /* renamed from: e */
    public final int f2575e = 0;

    /* renamed from: f */
    public final String f2576f;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.f2571a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f2572b);
        sb2.append(", mQuery: ");
        sb2.append(this.f2573c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f2574d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f2574d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(this.f2575e);
        sb.append(sb3.toString());
        return sb.toString();
    }

    public C0746a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2571a = (String) C0799m.m2267a(str);
        this.f2572b = (String) C0799m.m2267a(str2);
        this.f2573c = (String) C0799m.m2267a(str3);
        this.f2574d = (List) C0799m.m2267a(list);
        StringBuilder sb = new StringBuilder(this.f2571a);
        sb.append("-");
        sb.append(this.f2572b);
        sb.append("-");
        sb.append(this.f2573c);
        this.f2576f = sb.toString();
    }
}
