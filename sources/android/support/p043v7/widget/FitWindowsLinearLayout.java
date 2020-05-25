package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p043v7.widget.C1405ab.C1406a;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C1405ab {

    /* renamed from: a */
    private C1406a f4519a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public void setOnFitSystemWindowsListener(C1406a aVar) {
        this.f4519a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f4519a != null) {
            this.f4519a.mo3702a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
