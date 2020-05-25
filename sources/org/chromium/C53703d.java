package org.chromium;

import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;

/* renamed from: org.chromium.d */
public class C53703d implements ICronetDepend {

    /* renamed from: a */
    private static volatile C53703d f133252a;

    /* renamed from: b */
    private ICronetDepend f133253b;

    private C53703d() {
    }

    public String getSsCookieKey() {
        if (this.f133253b != null) {
            return this.f133253b.getSsCookieKey();
        }
        return "X-SS-Cookie";
    }

    public boolean loggerDebug() {
        if (this.f133253b != null) {
            return this.f133253b.loggerDebug();
        }
        return false;
    }

    /* renamed from: a */
    public static C53703d m114300a() {
        if (f133252a == null) {
            synchronized (C53703d.class) {
                if (f133252a == null) {
                    f133252a = new C53703d();
                }
            }
        }
        return f133252a;
    }

    public void setAdapter(ICronetDepend iCronetDepend) {
        this.f133253b = iCronetDepend;
    }

    public void loggerD(String str, String str2) {
        if (this.f133253b != null) {
            this.f133253b.loggerD(str, str2);
        }
    }
}
