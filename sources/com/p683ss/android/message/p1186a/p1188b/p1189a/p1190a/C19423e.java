package com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a;

import com.p683ss.android.message.p1191b.C19464g.C19465a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.msgpack.template.Template;

/* renamed from: com.ss.android.message.a.b.a.a.e */
public final class C19423e extends C19422d {

    /* renamed from: a */
    public List<C19424a> f53685a = new ArrayList();

    /* renamed from: com.ss.android.message.a.b.a.a.e$a */
    public class C19424a {

        /* renamed from: a */
        public Long f53686a;

        /* renamed from: b */
        public long f53687b;

        /* renamed from: c */
        public boolean f53688c;

        public final int hashCode() {
            return this.f53686a.hashCode();
        }

        public C19424a() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C19424a) || obj == null) {
                return super.equals(obj);
            }
            return this.f53686a.equals(((C19424a) obj).f53686a);
        }
    }

    /* renamed from: a */
    public final void mo40517a(byte[] bArr) {
    }

    /* renamed from: a */
    public final byte[] mo40520a() {
        C19465a aVar = new C19465a();
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f53685a != null && !this.f53685a.isEmpty()) {
                for (C19424a aVar2 : this.f53685a) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("a", aVar2.f53686a);
                    hashMap.put("i", Long.valueOf(aVar2.f53687b));
                    hashMap.put("e", Boolean.valueOf(aVar2.f53688c));
                    arrayList.add(hashMap);
                }
            }
            aVar.f53790a.put("as", arrayList);
            return this.f53683i.mo113064a(aVar, (Template<T>) this.f53684j);
        } catch (IOException | Exception unused) {
            return null;
        }
    }
}
