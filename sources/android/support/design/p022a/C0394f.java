package android.support.design.p022a;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: android.support.design.a.f */
public final class C0394f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f1276a = new Matrix();

    public C0394f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final /* synthetic */ Object get(Object obj) {
        this.f1276a.set(((ImageView) obj).getImageMatrix());
        return this.f1276a;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
