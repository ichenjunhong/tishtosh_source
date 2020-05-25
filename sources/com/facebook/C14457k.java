package com.facebook;

import com.C2240a;
import com.facebook.internal.C14327m;
import com.facebook.internal.C14327m.C14330a;
import com.facebook.internal.C14327m.C14331b;
import com.facebook.internal.p979a.C14270b;
import com.facebook.internal.p979a.p981b.C14272a;
import java.util.Random;

/* renamed from: com.facebook.k */
public class C14457k extends RuntimeException {
    static final long serialVersionUID = 1;

    public C14457k() {
    }

    public String toString() {
        return getMessage();
    }

    public C14457k(Throwable th) {
        super(th);
    }

    public C14457k(final String str) {
        super(str);
        Random random = new Random();
        if (str != null && C14533n.m29764a() && random.nextInt(100) > 50) {
            C14327m.m29381a(C14331b.ErrorReport, new C14330a() {
                /* renamed from: a */
                public final void mo25363a(boolean z) {
                    if (z) {
                        try {
                            try {
                                C14272a aVar = new C14272a(str);
                                if (aVar.mo26478a()) {
                                    C14270b.m29238a(aVar.f37186a, aVar.toString());
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            });
        }
    }

    public C14457k(String str, Throwable th) {
        super(str, th);
    }

    public C14457k(String str, Object... objArr) {
        this(C2240a.m6772a(str, objArr));
    }
}
