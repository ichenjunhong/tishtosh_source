package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bg */
public final class C1460bg extends Resources {

    /* renamed from: a */
    public static boolean f5276a;

    /* renamed from: b */
    private final WeakReference<Context> f5277b;

    /* renamed from: b */
    private static boolean m5101b() {
        return f5276a;
    }

    /* renamed from: a */
    public static boolean m5100a() {
        if (!m5101b() || VERSION.SDK_INT > 20) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo5705a(int i) {
        return super.getDrawable(i);
    }

    public final Drawable getDrawable(int i) throws NotFoundException {
        Context context = (Context) this.f5277b.get();
        if (context != null) {
            return C1480g.m5205a().mo5772a(context, this, i);
        }
        return super.getDrawable(i);
    }

    public C1460bg(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f5277b = new WeakReference<>(context);
    }
}
