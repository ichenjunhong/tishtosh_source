package android.support.p043v7.widget.p052a;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.a.c */
final class C1399c implements C1398b {

    /* renamed from: a */
    static final C1398b f5032a = new C1399c();

    C1399c() {
    }

    /* renamed from: a */
    public final void mo5468a(View view) {
        if (VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.axd);
            if (tag != null && (tag instanceof Float)) {
                C1056u.m3048c(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.axd, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: a */
    public final void mo5467a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (VERSION.SDK_INT >= 21 && z && view.getTag(R.id.axd) == null) {
            Float valueOf = Float.valueOf(C1056u.m3069o(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float o = C1056u.m3069o(childAt);
                    if (o > f3) {
                        f3 = o;
                    }
                }
            }
            C1056u.m3048c(view, 1.0f + f3);
            view.setTag(R.id.axd, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
