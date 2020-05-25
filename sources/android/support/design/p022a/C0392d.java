package android.support.design.p022a;

import android.util.Property;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.design.a.d */
public final class C0392d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f1273a = new C0392d("childrenAlpha");

    private C0392d(String str) {
        super(Float.class, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.bnj);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.bnj, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
