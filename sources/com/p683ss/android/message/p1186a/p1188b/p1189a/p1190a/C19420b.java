package com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a;

import com.p683ss.android.message.p1191b.C19464g.C19465a;
import com.p683ss.android.socialbase.downloader.impls.C19974n;
import java.io.IOException;
import java.util.Map;
import org.msgpack.template.Template;

/* renamed from: com.ss.android.message.a.b.a.a.b */
public final class C19420b extends C19422d {

    /* renamed from: a */
    public byte f53670a;

    /* renamed from: b */
    public byte f53671b;

    /* renamed from: c */
    public long f53672c;

    /* renamed from: d */
    public long f53673d;

    /* renamed from: e */
    public double f53674e;

    /* renamed from: f */
    public double f53675f;

    /* renamed from: g */
    public String f53676g;

    /* renamed from: h */
    public int f53677h = -1;

    /* renamed from: a */
    public final byte[] mo40518a() {
        C19465a aVar = new C19465a();
        try {
            aVar.f53790a.put("v", Byte.valueOf(this.f53670a));
            aVar.f53790a.put(C19974n.f54904f, Byte.valueOf(this.f53671b));
            aVar.f53790a.put("d", Long.valueOf(this.f53672c));
            aVar.f53790a.put("i", Long.valueOf(this.f53673d));
            aVar.f53790a.put("lo", Double.valueOf(this.f53674e));
            aVar.f53790a.put("la", Double.valueOf(this.f53675f));
            aVar.f53790a.put("c", this.f53676g);
            return this.f53683i.mo113064a(aVar, (Template<T>) this.f53684j);
        } catch (IOException | Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo40517a(byte[] bArr) {
        try {
            Map<String, Object> map = ((C19465a) this.f53683i.mo113062a(bArr, (Template<T>) this.f53684j)).f53790a;
            if (map.containsKey("h")) {
                this.f53677h = ((Integer) map.get("h")).intValue();
            }
        } catch (IOException unused) {
        } catch (Exception unused2) {
        }
    }
}
