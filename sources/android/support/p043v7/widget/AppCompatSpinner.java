package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1054s;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.p044a.p045a.C1124a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.AppCompatSpinner */
public class AppCompatSpinner extends Spinner implements C1054s {

    /* renamed from: d */
    private static final int[] f4471d = {16843505};

    /* renamed from: a */
    C1295b f4472a;

    /* renamed from: b */
    int f4473b;

    /* renamed from: c */
    final Rect f4474c;

    /* renamed from: e */
    private final C1478e f4475e;

    /* renamed from: f */
    private final Context f4476f;

    /* renamed from: g */
    private C1407ac f4477g;

    /* renamed from: h */
    private SpinnerAdapter f4478h;

    /* renamed from: i */
    private final boolean f4479i;

    /* renamed from: android.support.v7.widget.AppCompatSpinner$a */
    static class C1294a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f4482a;

        /* renamed from: b */
        private ListAdapter f4483b;

        public final int getItemViewType(int i) {
            return 0;
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f4483b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            if (this.f4482a == null) {
                return 0;
            }
            return this.f4482a.getCount();
        }

        public final boolean hasStableIds() {
            if (this.f4482a == null || !this.f4482a.hasStableIds()) {
                return false;
            }
            return true;
        }

        public final boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        public final Object getItem(int i) {
            if (this.f4482a == null) {
                return null;
            }
            return this.f4482a.getItem(i);
        }

        public final long getItemId(int i) {
            if (this.f4482a == null) {
                return -1;
            }
            return this.f4482a.getItemId(i);
        }

        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f4483b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f4482a != null) {
                this.f4482a.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f4482a != null) {
                this.f4482a.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public C1294a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f4482a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f4483b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f4482a == null) {
                return null;
            }
            return this.f4482a.getDropDownView(i, view, viewGroup);
        }
    }

    /* renamed from: android.support.v7.widget.AppCompatSpinner$b */
    class C1295b extends ListPopupWindow {

        /* renamed from: a */
        public CharSequence f4484a;

        /* renamed from: b */
        ListAdapter f4485b;

        /* renamed from: c */
        final Rect f4486c = new Rect();

        /* renamed from: d */
        public final void mo4075d() {
            boolean e = mo4077e();
            mo4587a();
            mo4778d(2);
            super.mo4075d();
            mo4078f().setChoiceMode(1);
            mo4779e(AppCompatSpinner.this.getSelectedItemPosition());
            if (!e) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    final C12972 r1 = new OnGlobalLayoutListener() {
                        public final void onGlobalLayout() {
                            boolean z;
                            C1295b bVar = C1295b.this;
                            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                            if (!C1056u.m3018B(appCompatSpinner) || !appCompatSpinner.getGlobalVisibleRect(bVar.f4486c)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                C1295b.this.dismiss();
                                return;
                            }
                            C1295b.this.mo4587a();
                            C1295b.super.mo4075d();
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(r1);
                    mo4771a((OnDismissListener) new OnDismissListener() {
                        public final void onDismiss() {
                            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeGlobalOnLayoutListener(r1);
                            }
                        }
                    });
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4587a() {
            int i;
            int i2;
            Drawable b = mo4773b();
            int i3 = 0;
            if (b != null) {
                b.getPadding(AppCompatSpinner.this.f4474c);
                if (C1467bj.m5138a(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f4474c.right;
                } else {
                    i2 = -AppCompatSpinner.this.f4474c.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.f4474c;
                AppCompatSpinner.this.f4474c.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.f4473b == -2) {
                int a = AppCompatSpinner.this.mo4552a((SpinnerAdapter) this.f4485b, mo4773b());
                int i4 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.f4474c.left) - AppCompatSpinner.this.f4474c.right;
                if (a > i4) {
                    a = i4;
                }
                mo4774b(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (AppCompatSpinner.this.f4473b == -1) {
                mo4774b((width - paddingLeft) - paddingRight);
            } else {
                mo4774b(AppCompatSpinner.this.f4473b);
            }
            if (C1467bj.m5138a(AppCompatSpinner.this)) {
                i = i3 + ((width - paddingRight) - this.f4604g);
            } else {
                i = i3 + paddingLeft;
            }
            this.f4605h = i;
        }

        /* renamed from: a */
        public final void mo4588a(ListAdapter listAdapter) {
            super.mo4588a(listAdapter);
            this.f4485b = listAdapter;
        }

        public C1295b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f4612o = AppCompatSpinner.this;
            mo4772a(true);
            this.f4611n = 0;
            this.f4614q = new OnItemClickListener(AppCompatSpinner.this) {
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i, C1295b.this.f4485b.getItemId(i));
                    }
                    C1295b.this.dismiss();
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4475e != null) {
            this.f4475e.mo5764c();
        }
    }

    public CharSequence getPrompt() {
        if (this.f4472a != null) {
            return this.f4472a.f4484a;
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4475e != null) {
            return this.f4475e.mo5757a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4475e != null) {
            return this.f4475e.mo5763b();
        }
        return null;
    }

    public int getDropDownHorizontalOffset() {
        if (this.f4472a != null) {
            return this.f4472a.f4605h;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        if (this.f4472a != null) {
            return this.f4472a.mo4776c();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f4472a != null) {
            return this.f4473b;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        if (this.f4472a != null) {
            return this.f4472a.mo4773b();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.f4472a != null) {
            return this.f4476f;
        }
        if (VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4472a != null && this.f4472a.mo4077e()) {
            this.f4472a.dismiss();
        }
    }

    public boolean performClick() {
        if (this.f4472a == null) {
            return super.performClick();
        }
        if (!this.f4472a.mo4077e()) {
            this.f4472a.mo4075d();
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4475e != null) {
            this.f4475e.mo5761a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4475e != null) {
            this.f4475e.mo5758a(i);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C1124a.m3315b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f4472a != null) {
            this.f4472a.f4484a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4475e != null) {
            this.f4475e.mo5759a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4475e != null) {
            this.f4475e.mo5760a(mode);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4477g == null || !this.f4477g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f4472a != null) {
            this.f4472a.f4605h = i;
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f4472a != null) {
            this.f4472a.mo4769a(i);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f4472a != null) {
            this.f4473b = i;
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f4472a != null) {
            this.f4472a.mo4770a(drawable);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        Context context;
        if (!this.f4479i) {
            this.f4478h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f4472a != null) {
            if (this.f4476f == null) {
                context = getContext();
            } else {
                context = this.f4476f;
            }
            this.f4472a.mo4588a((ListAdapter) new C1294a(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a2q);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4472a != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo4552a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo4552a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f4474c);
            i2 += this.f4474c.left + this.f4474c.right;
        }
        return i2;
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    private AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, -1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r2 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r2 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r6.f4474c = r11
            r11 = 5
            int[] r0 = new int[r11]
            r0 = {16842930, 16843126, 16843131, 16843362, 2131362664} // fill-array
            r1 = 0
            android.support.v7.widget.bb r0 = android.support.p043v7.widget.C1451bb.m5032a(r7, r8, r0, r9, r1)
            android.support.v7.widget.e r2 = new android.support.v7.widget.e
            r2.<init>(r6)
            r6.f4475e = r2
            r2 = 4
            int r2 = r0.mo5665g(r2, r1)
            r3 = 0
            if (r2 == 0) goto L_0x002a
            android.support.v7.view.d r4 = new android.support.v7.view.d
            r4.<init>(r7, r2)
            goto L_0x0033
        L_0x002a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 >= r4) goto L_0x0032
            r4 = r7
            goto L_0x0033
        L_0x0032:
            r4 = r3
        L_0x0033:
            r6.f4476f = r4
            android.content.Context r2 = r6.f4476f
            r4 = 1
            if (r2 == 0) goto L_0x0098
            r2 = -1
            if (r10 != r2) goto L_0x0062
            int[] r2 = f4471d     // Catch:{ Exception -> 0x005e, all -> 0x0056 }
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r8, r2, r9, r1)     // Catch:{ Exception -> 0x005e, all -> 0x0056 }
            boolean r5 = r2.hasValue(r1)     // Catch:{ Exception -> 0x005f, all -> 0x0054 }
            if (r5 == 0) goto L_0x004e
            int r5 = r2.getInt(r1, r1)     // Catch:{ Exception -> 0x005f, all -> 0x0054 }
            r10 = r5
        L_0x004e:
            if (r2 == 0) goto L_0x0062
        L_0x0050:
            r2.recycle()
            goto L_0x0062
        L_0x0054:
            r7 = move-exception
            goto L_0x0058
        L_0x0056:
            r7 = move-exception
            r2 = r3
        L_0x0058:
            if (r2 == 0) goto L_0x005d
            r2.recycle()
        L_0x005d:
            throw r7
        L_0x005e:
            r2 = r3
        L_0x005f:
            if (r2 == 0) goto L_0x0062
            goto L_0x0050
        L_0x0062:
            if (r10 != r4) goto L_0x0098
            android.support.v7.widget.AppCompatSpinner$b r10 = new android.support.v7.widget.AppCompatSpinner$b
            android.content.Context r2 = r6.f4476f
            r10.<init>(r2, r8, r9)
            android.content.Context r2 = r6.f4476f
            int[] r11 = new int[r11]
            r11 = {16842930, 16843126, 16843131, 16843362, 2131362664} // fill-array
            android.support.v7.widget.bb r11 = android.support.p043v7.widget.C1451bb.m5032a(r2, r8, r11, r9, r1)
            r2 = 3
            r5 = -2
            int r2 = r11.mo5663f(r2, r5)
            r6.f4473b = r2
            android.graphics.drawable.Drawable r2 = r11.mo5652a(r4)
            r10.mo4770a(r2)
            r2 = 2
            java.lang.String r2 = r0.mo5660d(r2)
            r10.f4484a = r2
            r11.mo5653a()
            r6.f4472a = r10
            android.support.v7.widget.AppCompatSpinner$1 r11 = new android.support.v7.widget.AppCompatSpinner$1
            r11.<init>(r6, r10)
            r6.f4477g = r11
        L_0x0098:
            android.content.res.TypedArray r10 = r0.f5231a
            java.lang.CharSequence[] r10 = r10.getTextArray(r1)
            if (r10 == 0) goto L_0x00b1
            android.widget.ArrayAdapter r11 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r11.<init>(r7, r1, r10)
            r7 = 2132215870(0x7f17083e, float:2.0075622E38)
            r11.setDropDownViewResource(r7)
            r6.setAdapter(r11)
        L_0x00b1:
            r0.mo5653a()
            r6.f4479i = r4
            android.widget.SpinnerAdapter r7 = r6.f4478h
            if (r7 == 0) goto L_0x00c1
            android.widget.SpinnerAdapter r7 = r6.f4478h
            r6.setAdapter(r7)
            r6.f4478h = r3
        L_0x00c1:
            android.support.v7.widget.e r7 = r6.f4475e
            r7.mo5762a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
