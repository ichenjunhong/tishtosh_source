package com.p683ss.android.ugc.aweme.net.p1991d;

import android.content.Context;
import com.p683ss.android.common.p1144c.C18889b;
import com.p683ss.android.common.p1144c.C18891d;
import com.p683ss.android.common.p1144c.p1145a.C18884a;
import com.p683ss.android.common.util.C18915b;
import com.p683ss.android.common.util.C18916c;
import com.p683ss.android.common.util.C18919f;
import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.http.p1169a.p1172b.C19181f;
import java.util.List;
import org.apache.http.client.RedirectHandler;

/* renamed from: com.ss.android.ugc.aweme.net.d.b */
public abstract class C37759b implements C18889b {

    /* renamed from: a */
    protected C18889b f96213a;

    /* renamed from: b */
    protected Context f96214b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C18889b mo77248a();

    /* renamed from: a */
    public final byte[] mo18240a(int i, String str) throws Exception {
        if (this.f96213a == null) {
            this.f96213a = mo77248a();
        }
        return this.f96213a.mo18240a(i, str);
    }

    /* renamed from: a */
    public final boolean mo18239a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, C18915b<String> bVar, String str2, C18919f fVar, List<C19180e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) throws Exception {
        if (this.f96213a == null) {
            this.f96213a = mo77248a();
        }
        return this.f96213a.mo18239a(i, str, stringBuffer, stringBuffer2, stringBuffer3, bVar, str2, fVar, list, strArr, iArr, redirectHandler);
    }

    public C37759b(Context context) {
        this.f96214b = context;
    }

    /* renamed from: a */
    public final String mo38696a(int i, int i2, String str, List<C19170a> list) throws Exception {
        if (this.f96213a == null) {
            return null;
        }
        return this.f96213a.mo38696a(i, i2, str, list);
    }

    /* renamed from: a */
    public final String mo18232a(int i, int i2, String str, List<C19180e> list, C18884a aVar, C18891d[] dVarArr) throws Exception {
        if (this.f96213a == null) {
            this.f96213a = mo77248a();
        }
        return this.f96213a.mo18232a(i, i2, str, list, aVar, dVarArr);
    }

    /* renamed from: a */
    public final String mo18235a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception {
        if (this.f96213a == null) {
            this.f96213a = mo77248a();
        }
        return this.f96213a.mo18235a(i, i2, str, bArr, str2, str3);
    }

    /* renamed from: a */
    public final String mo18237a(int i, String str, C18884a aVar, C18916c<Long> cVar, long j, C18891d[] dVarArr) throws Exception {
        if (this.f96213a == null) {
            this.f96213a = mo77248a();
        }
        return this.f96213a.mo18237a(i, str, aVar, cVar, j, dVarArr);
    }

    /* renamed from: b */
    public final String mo38697b(int i, int i2, String str, List<C19180e> list, boolean z, C18891d[] dVarArr, List<C19170a> list2) throws Exception {
        if (this.f96213a == null) {
            return null;
        }
        return this.f96213a.mo38697b(i, i2, str, list, z, dVarArr, list2);
    }

    /* renamed from: b */
    public final String mo38698b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C19170a> list) throws Exception {
        if (this.f96213a == null) {
            return null;
        }
        return this.f96213a.mo38698b(i, i2, str, bArr, str2, str3, list);
    }

    /* renamed from: a */
    public final String mo18234a(int i, int i2, String str, List<C19180e> list, boolean z, C18891d[] dVarArr, List<C19170a> list2) throws Exception {
        if (this.f96213a == null) {
            this.f96213a = mo77248a();
        }
        return this.f96213a.mo18234a(i, i2, str, list, z, dVarArr, list2);
    }

    /* renamed from: a */
    public final String mo18236a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C19170a> list) throws Exception {
        if (this.f96213a == null) {
            this.f96213a = mo77248a();
        }
        return this.f96213a.mo18236a(i, i2, str, bArr, str2, str3, list);
    }

    /* renamed from: a */
    public final String mo18233a(int i, int i2, String str, List<C19170a> list, boolean z, boolean z2, C19181f fVar, boolean z3) throws Exception {
        if (this.f96213a == null) {
            this.f96213a = mo77248a();
        }
        return this.f96213a.mo18233a(i, i2, str, list, z, z2, fVar, z3);
    }

    /* renamed from: a */
    public final boolean mo18238a(int i, String str, String str2, String str3, String str4, C18915b<String> bVar, String str5, C18919f fVar, List<C19180e> list, String[] strArr, int[] iArr) throws Exception {
        if (this.f96213a == null) {
            this.f96213a = mo77248a();
        }
        return this.f96213a.mo18238a(i, str, str2, str3, str4, bVar, str5, fVar, list, strArr, iArr);
    }
}
