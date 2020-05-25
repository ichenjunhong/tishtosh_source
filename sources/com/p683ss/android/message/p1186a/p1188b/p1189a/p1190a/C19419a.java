package com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a;

import com.p683ss.android.message.p1191b.C19464g.C19465a;
import java.io.IOException;
import java.util.Map;
import org.msgpack.template.Template;

/* renamed from: com.ss.android.message.a.b.a.a.a */
public final class C19419a extends C19422d {

    /* renamed from: a */
    public String f53668a;

    /* renamed from: b */
    public String f53669b;

    /* renamed from: a */
    public final void mo40517a(byte[] bArr) {
        if (bArr.length != 0 && this.f53683i != null) {
            try {
                C19465a aVar = (C19465a) this.f53683i.mo113062a(bArr, (Template<T>) this.f53684j);
                if (aVar != null) {
                    Map<String, Object> map = aVar.f53790a;
                    if (map != null) {
                        if (map.containsKey("en")) {
                            this.f53668a = new String((byte[]) map.get("en"));
                        }
                        if (map.containsKey("ct")) {
                            this.f53669b = new String((byte[]) map.get("em"));
                        }
                    }
                }
            } catch (IOException unused) {
            } catch (Exception unused2) {
            }
        }
    }
}
