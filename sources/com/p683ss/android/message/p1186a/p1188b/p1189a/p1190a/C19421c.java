package com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a;

import com.p683ss.android.message.p1191b.C19464g.C19465a;
import java.io.IOException;
import java.util.Map;
import org.msgpack.template.Template;

/* renamed from: com.ss.android.message.a.b.a.a.c */
public final class C19421c extends C19422d {

    /* renamed from: a */
    public long f53678a;

    /* renamed from: b */
    public int f53679b;

    /* renamed from: c */
    public long f53680c;

    /* renamed from: d */
    public byte[] f53681d;

    /* renamed from: e */
    public long f53682e;

    /* renamed from: a */
    public final byte[] mo40519a() {
        C19465a aVar = new C19465a();
        try {
            aVar.f53790a.put("rt", Long.valueOf(this.f53682e));
            return this.f53683i.mo113064a(aVar, (Template<T>) this.f53684j);
        } catch (IOException | Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo40517a(byte[] bArr) {
        try {
            Map<String, Object> map = ((C19465a) this.f53683i.mo113062a(bArr, (Template<T>) this.f53684j)).f53790a;
            if (map.containsKey("a")) {
                this.f53679b = ((Integer) map.get("a")).intValue();
            }
            if (map.containsKey("m")) {
                this.f53680c = ((Long) map.get("m")).longValue();
            }
            if (map.containsKey("ct")) {
                this.f53678a = ((Long) map.get("ct")).longValue();
            }
            if (map.containsKey("c")) {
                this.f53681d = (byte[]) map.get("c");
            }
        } catch (IOException unused) {
        } catch (Exception unused2) {
        }
    }
}
