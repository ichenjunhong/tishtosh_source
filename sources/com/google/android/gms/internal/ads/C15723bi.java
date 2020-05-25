package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.bi */
final class C15723bi implements Callable<Boolean> {
    C15723bi() {
    }

    public final /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
