package com.bytedance.crash;

import com.bytedance.crash.p545e.C9578a;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Collection;
import java.util.Map;

class EnsureImpl$1 implements IEnsure {
    final /* synthetic */ C9583f this$0;

    public void ensureNotReachHere() {
        C9583f.m19007a(null, "EnsureNotReachHere", null);
    }

    public void reportLogException(Throwable th) {
        ensureNotReachHere(th);
    }

    EnsureImpl$1(C9583f fVar) {
        this.this$0 = fVar;
    }

    public boolean ensureFalse(boolean z) {
        if (z) {
            C9583f.m19007a(null, "EnsureFalse", null);
        }
        return z;
    }

    public boolean ensureNotNull(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C9583f.m19007a(null, "EnsureNotNull", null);
        }
        return z;
    }

    public void ensureNotReachHere(String str) {
        C9583f.m19007a(str, "EnsureNotReachHere", null);
    }

    public boolean ensureTrue(boolean z) {
        if (!z) {
            C9583f.m19007a(null, "EnsureTrue", null);
        }
        return z;
    }

    public boolean ensureNotEmpty(Collection collection) {
        boolean z;
        if (collection == null || collection.size() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C9583f.m19007a(null, "EnsureNotEmpty", null);
        }
        return z;
    }

    public void ensureNotReachHere(Throwable th) {
        if (C9583f.m19008a(th)) {
            C9578a.m19003a(Thread.currentThread().getStackTrace(), 5, th, (String) null, true);
        }
    }

    public void reportLogException(Throwable th, String str) {
        ensureNotReachHere(th, str);
    }

    public boolean ensureFalse(boolean z, String str) {
        if (z) {
            C9583f.m19007a(str, "EnsureFalse", null);
        }
        return z;
    }

    public boolean ensureNotNull(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C9583f.m19007a(str, "EnsureNotNull", null);
        }
        return z;
    }

    public void ensureNotReachHere(String str, Map<String, String> map) {
        C9583f.m19007a(str, "EnsureNotReachHere", map);
    }

    public boolean ensureTrue(boolean z, String str) {
        if (!z) {
            C9583f.m19007a(str, "EnsureTrue", null);
        }
        return z;
    }

    public void ensureNotReachHere(Throwable th, String str) {
        if (C9583f.m19008a(th)) {
            C9578a.m19003a(Thread.currentThread().getStackTrace(), 5, th, str, true);
        }
    }

    public boolean ensureFalse(boolean z, String str, Map<String, String> map) {
        if (z) {
            C9583f.m19007a(str, "EnsureFalse", map);
        }
        return z;
    }

    public boolean ensureTrue(boolean z, String str, Map<String, String> map) {
        if (!z) {
            C9583f.m19007a(str, "EnsureTrue", map);
        }
        return z;
    }

    public void reportLogException(int i, Throwable th, String str) {
        C9583f fVar = this.this$0;
        if (C9583f.m19008a(th)) {
            C9578a.m19003a(Thread.currentThread().getStackTrace(), i + 2, th, str, false);
        }
    }

    public void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        if (C9583f.m19008a(th)) {
            C9578a.m19004a(Thread.currentThread().getStackTrace(), 5, th, str, true, map);
        }
    }
}
