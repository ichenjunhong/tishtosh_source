package android.support.p043v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.bf */
final class C1459bf {

    /* renamed from: a */
    private final Context f5269a;

    /* renamed from: b */
    private final View f5270b;

    /* renamed from: c */
    private final TextView f5271c;

    /* renamed from: d */
    private final LayoutParams f5272d = new LayoutParams();

    /* renamed from: e */
    private final Rect f5273e = new Rect();

    /* renamed from: f */
    private final int[] f5274f = new int[2];

    /* renamed from: g */
    private final int[] f5275g = new int[2];

    /* renamed from: b */
    private boolean m5097b() {
        if (this.f5270b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5703a() {
        if (m5097b()) {
            ((WindowManager) this.f5269a.getSystemService("window")).removeView(this.f5270b);
        }
    }

    /* renamed from: a */
    private static View m5095a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    C1459bf(Context context) {
        this.f5269a = context;
        this.f5270b = LayoutInflater.from(this.f5269a).inflate(R.layout.a1, null);
        this.f5271c = (TextView) this.f5270b.findViewById(R.id.bld);
        this.f5272d.setTitle(getClass().getSimpleName());
        this.f5272d.packageName = this.f5269a.getPackageName();
        this.f5272d.type = BaseNotice.CHECK_PROFILE;
        this.f5272d.width = -2;
        this.f5272d.height = -2;
        this.f5272d.format = -3;
        this.f5272d.windowAnimations = R.style.w;
        this.f5272d.flags = 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5704a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m5097b()) {
            mo5703a();
        }
        this.f5271c.setText(charSequence);
        m5096a(view, i, i2, z, this.f5272d);
        ((WindowManager) this.f5269a.getSystemService("window")).addView(this.f5270b, this.f5272d);
    }

    /* renamed from: a */
    private void m5096a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        int i5;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f5269a.getResources().getDimensionPixelOffset(R.dimen.ne);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f5269a.getResources().getDimensionPixelOffset(R.dimen.nd);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f5269a.getResources();
        if (z) {
            i5 = R.dimen.nh;
        } else {
            i5 = R.dimen.ng;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
        View a = m5095a(view);
        if (a != null) {
            a.getWindowVisibleDisplayFrame(this.f5273e);
            if (this.f5273e.left < 0 && this.f5273e.top < 0) {
                Resources resources2 = this.f5269a.getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i6 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i6 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                this.f5273e.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            a.getLocationOnScreen(this.f5275g);
            view.getLocationOnScreen(this.f5274f);
            int[] iArr = this.f5274f;
            iArr[0] = iArr[0] - this.f5275g[0];
            int[] iArr2 = this.f5274f;
            iArr2[1] = iArr2[1] - this.f5275g[1];
            layoutParams.x = (this.f5274f[0] + i) - (a.getWidth() / 2);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            this.f5270b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f5270b.getMeasuredHeight();
            int i7 = ((this.f5274f[1] + i3) - dimensionPixelOffset3) - measuredHeight;
            int i8 = this.f5274f[1] + i4 + dimensionPixelOffset3;
            if (z) {
                if (i7 < 0) {
                    layoutParams.y = i8;
                    return;
                }
            } else if (measuredHeight + i8 <= this.f5273e.height()) {
                layoutParams.y = i8;
                return;
            }
            layoutParams.y = i7;
        }
    }
}
