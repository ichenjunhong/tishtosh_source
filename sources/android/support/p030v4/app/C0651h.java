package android.support.p030v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: android.support.v4.app.h */
public abstract class C0651h {
    /* renamed from: a */
    public abstract View mo1968a(int i);

    /* renamed from: a */
    public abstract boolean mo1969a();

    /* renamed from: a */
    public Fragment mo1967a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
