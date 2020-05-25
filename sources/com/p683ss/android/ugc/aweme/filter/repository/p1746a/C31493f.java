package com.p683ss.android.ugc.aweme.filter.repository.p1746a;

import android.net.Uri;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.f */
public final class C31493f {

    /* renamed from: a */
    public final int f82404a;

    /* renamed from: b */
    public final String f82405b;

    /* renamed from: c */
    public final String f82406c;

    /* renamed from: d */
    public final ToolsUrlModel f82407d;

    /* renamed from: e */
    public final List<String> f82408e;

    /* renamed from: f */
    public final Uri f82409f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31493f) {
                C31493f fVar = (C31493f) obj;
                if (!(this.f82404a == fVar.f82404a) || !C52711k.m112239a((Object) this.f82405b, (Object) fVar.f82405b) || !C52711k.m112239a((Object) this.f82406c, (Object) fVar.f82406c) || !C52711k.m112239a((Object) this.f82407d, (Object) fVar.f82407d) || !C52711k.m112239a((Object) this.f82408e, (Object) fVar.f82408e) || !C52711k.m112239a((Object) this.f82409f, (Object) fVar.f82409f)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f82404a * 31;
        String str = this.f82405b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f82406c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ToolsUrlModel toolsUrlModel = this.f82407d;
        int hashCode3 = (hashCode2 + (toolsUrlModel != null ? toolsUrlModel.hashCode() : 0)) * 31;
        List<String> list = this.f82408e;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Uri uri = this.f82409f;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterMeta(id=");
        sb.append(this.f82404a);
        sb.append(", name=");
        sb.append(this.f82405b);
        sb.append(", enName=");
        sb.append(this.f82406c);
        sb.append(", resource=");
        sb.append(this.f82407d);
        sb.append(", tags=");
        sb.append(this.f82408e);
        sb.append(", thumbnail=");
        sb.append(this.f82409f);
        sb.append(")");
        return sb.toString();
    }

    public C31493f(int i, String str, String str2, ToolsUrlModel toolsUrlModel, List<String> list, Uri uri) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(list, C42311c.f106869m);
        this.f82404a = i;
        this.f82405b = str;
        this.f82406c = str2;
        this.f82407d = toolsUrlModel;
        this.f82408e = list;
        this.f82409f = uri;
    }
}
