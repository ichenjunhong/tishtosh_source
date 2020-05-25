package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.IOException;

/* renamed from: com.facebook.soloader.b */
public final class C14668b extends C14685j {

    /* renamed from: a */
    private Context f38045a;

    /* renamed from: b */
    private int f38046b;

    /* renamed from: c */
    private C14669c f38047c;

    public final String toString() {
        return this.f38047c.toString();
    }

    /* renamed from: a */
    public final boolean mo26945a() throws IOException {
        try {
            File file = this.f38047c.f38048b;
            Context createPackageContext = this.f38045a.createPackageContext(this.f38045a.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            this.f38046b |= 1;
            this.f38047c = new C14669c(file2, this.f38046b);
            this.f38047c.mo26944a(this.f38046b);
            this.f38045a = createPackageContext;
            return true;
        } catch (NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26944a(int i) throws IOException {
        this.f38047c.mo26944a(i);
    }

    public C14668b(Context context, int i) {
        this.f38045a = context.getApplicationContext();
        if (this.f38045a == null) {
            this.f38045a = context;
        }
        this.f38046b = i;
        this.f38047c = new C14669c(new File(this.f38045a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: a */
    public final int mo26943a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        return this.f38047c.mo26943a(str, i, threadPolicy);
    }
}
