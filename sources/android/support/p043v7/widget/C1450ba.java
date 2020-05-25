package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ba */
final class C1450ba extends C1430ao {

    /* renamed from: a */
    private final WeakReference<Context> f5230a;

    public final Drawable getDrawable(int i) throws NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f5230a.get();
        if (!(drawable == null || context == null)) {
            C1480g.m5205a();
            C1480g.m5209a(context, i, drawable);
        }
        return drawable;
    }

    public C1450ba(Context context, Resources resources) {
        super(resources);
        this.f5230a = new WeakReference<>(context);
    }
}
