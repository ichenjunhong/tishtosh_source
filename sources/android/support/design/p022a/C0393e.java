package android.support.design.p022a;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.WeakHashMap;

/* renamed from: android.support.design.a.e */
public final class C0393e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final Property<Drawable, Integer> f1274a = new C0393e();

    /* renamed from: b */
    private final WeakHashMap<Drawable, Integer> f1275b = new WeakHashMap<>();

    private C0393e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    public final /* synthetic */ Object get(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f1275b.containsKey(drawable)) {
            return (Integer) this.f1275b.get(drawable);
        }
        return Integer.valueOf(NormalGiftView.ALPHA_255);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        Integer num = (Integer) obj2;
        if (VERSION.SDK_INT < 19) {
            this.f1275b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
