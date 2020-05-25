package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1063y;
import android.support.p030v4.widget.C1111k;
import android.support.p043v7.p046b.p047a.C1193c;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.z */
class C1519z extends ListView {

    /* renamed from: a */
    public boolean f5458a;

    /* renamed from: b */
    C1521b f5459b;

    /* renamed from: c */
    private final Rect f5460c = new Rect();

    /* renamed from: d */
    private int f5461d = 0;

    /* renamed from: e */
    private int f5462e = 0;

    /* renamed from: f */
    private int f5463f = 0;

    /* renamed from: g */
    private int f5464g = 0;

    /* renamed from: h */
    private int f5465h;

    /* renamed from: i */
    private Field f5466i;

    /* renamed from: j */
    private C1520a f5467j;

    /* renamed from: k */
    private boolean f5468k;

    /* renamed from: l */
    private boolean f5469l;

    /* renamed from: m */
    private C1063y f5470m;

    /* renamed from: n */
    private C1111k f5471n;

    /* renamed from: android.support.v7.widget.z$a */
    static class C1520a extends C1193c {

        /* renamed from: a */
        public boolean f5472a = true;

        C1520a(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.f5472a) {
                super.draw(canvas);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.f5472a) {
                return super.setState(iArr);
            }
            return false;
        }

        public final void setHotspot(float f, float f2) {
            if (this.f5472a) {
                super.setHotspot(f, f2);
            }
        }

        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f5472a) {
                return super.setVisible(z, z2);
            }
            return false;
        }

        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f5472a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }
    }

    /* renamed from: android.support.v7.widget.z$b */
    class C1521b implements Runnable {
        public final void run() {
            C1519z.this.f5459b = null;
            C1519z.this.drawableStateChanged();
        }

        C1521b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f5459b = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f5459b == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m5430a();
        }
    }

    public boolean hasFocus() {
        if (this.f5469l || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.f5469l || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public boolean isFocused() {
        if (this.f5469l || super.isFocused()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m5430a() {
        Drawable selector = getSelector();
        if (selector != null && this.f5458a && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public boolean isInTouchMode() {
        if ((!this.f5469l || !this.f5468k) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f5468k = z;
    }

    private void setSelectorEnabled(boolean z) {
        if (this.f5467j != null) {
            this.f5467j.f5472a = z;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.f5460c.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f5460c);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5465h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f5459b != null) {
            C1521b bVar = this.f5459b;
            C1519z.this.f5459b = null;
            C1519z.this.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSelector(Drawable drawable) {
        C1520a aVar;
        if (drawable != null) {
            aVar = new C1520a(drawable);
        } else {
            aVar = null;
        }
        this.f5467j = aVar;
        super.setSelector(this.f5467j);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5461d = rect.left;
        this.f5462e = rect.top;
        this.f5463f = rect.right;
        this.f5464g = rect.bottom;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f5459b == null) {
            this.f5459b = new C1521b();
            C1521b bVar = this.f5459b;
            C1519z.this.post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m5430a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    C1519z(Context context, boolean z) {
        super(context, null, R.attr.k3);
        this.f5469l = z;
        setCacheColorHint(0);
        try {
            this.f5466i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f5466i.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* renamed from: a */
    private void m5431a(int i, View view) {
        Rect rect = this.f5460c;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f5461d;
        rect.top -= this.f5462e;
        rect.right += this.f5463f;
        rect.bottom += this.f5464g;
        try {
            boolean z = this.f5466i.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f5466i.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0118  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5503a(android.view.MotionEvent r12, int r13) {
        /*
            r11 = this;
            int r0 = r12.getActionMasked()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0013;
                case 2: goto L_0x0011;
                case 3: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            r13 = 0
            r3 = 1
            goto L_0x00d8
        L_0x000d:
            r13 = 0
            r3 = 0
            goto L_0x00d8
        L_0x0011:
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            int r13 = r12.findPointerIndex(r13)
            if (r13 >= 0) goto L_0x001b
            goto L_0x000d
        L_0x001b:
            float r4 = r12.getX(r13)
            int r4 = (int) r4
            float r13 = r12.getY(r13)
            int r13 = (int) r13
            int r5 = r11.pointToPosition(r4, r13)
            r6 = -1
            if (r5 != r6) goto L_0x002f
            r13 = 1
            goto L_0x00d8
        L_0x002f:
            int r3 = r11.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r11.getChildAt(r3)
            float r4 = (float) r4
            float r13 = (float) r13
            r11.f5458a = r1
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 < r8) goto L_0x0046
            r11.drawableHotspotChanged(r4, r13)
        L_0x0046:
            boolean r7 = r11.isPressed()
            if (r7 != 0) goto L_0x004f
            r11.setPressed(r1)
        L_0x004f:
            r11.layoutChildren()
            int r7 = r11.f5465h
            if (r7 == r6) goto L_0x006e
            int r7 = r11.f5465h
            int r9 = r11.getFirstVisiblePosition()
            int r7 = r7 - r9
            android.view.View r7 = r11.getChildAt(r7)
            if (r7 == 0) goto L_0x006e
            if (r7 == r3) goto L_0x006e
            boolean r9 = r7.isPressed()
            if (r9 == 0) goto L_0x006e
            r7.setPressed(r2)
        L_0x006e:
            r11.f5465h = r5
            int r7 = r3.getLeft()
            float r7 = (float) r7
            float r7 = r4 - r7
            int r9 = r3.getTop()
            float r9 = (float) r9
            float r9 = r13 - r9
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r8) goto L_0x0085
            r3.drawableHotspotChanged(r7, r9)
        L_0x0085:
            boolean r7 = r3.isPressed()
            if (r7 != 0) goto L_0x008e
            r3.setPressed(r1)
        L_0x008e:
            android.graphics.drawable.Drawable r7 = r11.getSelector()
            if (r7 == 0) goto L_0x0098
            if (r5 == r6) goto L_0x0098
            r8 = 1
            goto L_0x0099
        L_0x0098:
            r8 = 0
        L_0x0099:
            if (r8 == 0) goto L_0x009e
            r7.setVisible(r2, r2)
        L_0x009e:
            r11.m5431a(r5, r3)
            if (r8 == 0) goto L_0x00bc
            android.graphics.Rect r8 = r11.f5460c
            float r9 = r8.exactCenterX()
            float r8 = r8.exactCenterY()
            int r10 = r11.getVisibility()
            if (r10 != 0) goto L_0x00b5
            r10 = 1
            goto L_0x00b6
        L_0x00b5:
            r10 = 0
        L_0x00b6:
            r7.setVisible(r10, r2)
            android.support.p030v4.graphics.drawable.C0809a.m2324a(r7, r9, r8)
        L_0x00bc:
            android.graphics.drawable.Drawable r7 = r11.getSelector()
            if (r7 == 0) goto L_0x00c7
            if (r5 == r6) goto L_0x00c7
            android.support.p030v4.graphics.drawable.C0809a.m2324a(r7, r4, r13)
        L_0x00c7:
            r11.setSelectorEnabled(r2)
            r11.refreshDrawableState()
            if (r0 != r1) goto L_0x0009
            long r6 = r11.getItemIdAtPosition(r5)
            r11.performItemClick(r3, r5, r6)
            goto L_0x0009
        L_0x00d8:
            if (r3 == 0) goto L_0x00dc
            if (r13 == 0) goto L_0x0100
        L_0x00dc:
            r11.f5458a = r2
            r11.setPressed(r2)
            r11.drawableStateChanged()
            int r13 = r11.f5465h
            int r0 = r11.getFirstVisiblePosition()
            int r13 = r13 - r0
            android.view.View r13 = r11.getChildAt(r13)
            if (r13 == 0) goto L_0x00f4
            r13.setPressed(r2)
        L_0x00f4:
            android.support.v4.view.y r13 = r11.f5470m
            if (r13 == 0) goto L_0x0100
            android.support.v4.view.y r13 = r11.f5470m
            r13.mo3251b()
            r13 = 0
            r11.f5470m = r13
        L_0x0100:
            if (r3 == 0) goto L_0x0118
            android.support.v4.widget.k r13 = r11.f5471n
            if (r13 != 0) goto L_0x010d
            android.support.v4.widget.k r13 = new android.support.v4.widget.k
            r13.<init>(r11)
            r11.f5471n = r13
        L_0x010d:
            android.support.v4.widget.k r13 = r11.f5471n
            r13.mo3484a(r1)
            android.support.v4.widget.k r13 = r11.f5471n
            r13.onTouch(r11, r12)
            goto L_0x0121
        L_0x0118:
            android.support.v4.widget.k r12 = r11.f5471n
            if (r12 == 0) goto L_0x0121
            android.support.v4.widget.k r12 = r11.f5471n
            r12.mo3484a(r2)
        L_0x0121:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1519z.mo5503a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    public int mo5502a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        View view = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i6 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i6 = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i9 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 < i4) {
                if (i5 >= 0 && i9 >= i5) {
                    i11 = i8;
                }
                i9++;
            } else if (i5 < 0 || i9 <= i5 || i11 <= 0 || i8 == i4) {
                return i4;
            } else {
                return i11;
            }
        }
        return i8;
    }
}
