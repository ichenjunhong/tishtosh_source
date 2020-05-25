package android.support.p043v7.p050d;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: android.support.v7.d.a */
public final class C1205a implements TransformationMethod {

    /* renamed from: a */
    private Locale f3990a;

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C1205a(Context context) {
        this.f3990a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f3990a);
        }
        return null;
    }
}
