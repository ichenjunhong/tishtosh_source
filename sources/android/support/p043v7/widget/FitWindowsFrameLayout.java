package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p043v7.widget.C1405ab.C1406a;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.FitWindowsFrameLayout */
public class FitWindowsFrameLayout extends FrameLayout implements C1405ab {

    /* renamed from: a */
    private C1406a f4518a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public void setOnFitSystemWindowsListener(C1406a aVar) {
        this.f4518a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f4518a != null) {
            this.f4518a.mo3702a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
