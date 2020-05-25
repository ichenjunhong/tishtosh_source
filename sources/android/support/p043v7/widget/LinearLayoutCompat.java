package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.LinearLayoutCompat */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    private int f4532a;

    /* renamed from: b */
    private int f4533b;

    /* renamed from: c */
    private int f4534c;

    /* renamed from: d */
    private int f4535d;

    /* renamed from: e */
    private int f4536e;

    /* renamed from: f */
    public boolean f4537f;

    /* renamed from: g */
    public boolean f4538g;

    /* renamed from: h */
    private float f4539h;

    /* renamed from: i */
    private int[] f4540i;

    /* renamed from: j */
    private int[] f4541j;

    /* renamed from: k */
    private Drawable f4542k;

    /* renamed from: l */
    private int f4543l;

    /* renamed from: m */
    private int f4544m;

    /* renamed from: n */
    private int f4545n;

    /* renamed from: o */
    private int f4546o;

    /* renamed from: android.support.v7.widget.LinearLayoutCompat$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: g */
        public float f4547g;

        /* renamed from: h */
        public int f4548h = -1;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, 16842996, 16842997, 16843137});
            this.f4547g = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f4548h = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4532a;
    }

    public Drawable getDividerDrawable() {
        return this.f4542k;
    }

    public int getDividerPadding() {
        return this.f4546o;
    }

    public int getDividerWidth() {
        return this.f4543l;
    }

    public int getGravity() {
        return this.f4535d;
    }

    public int getOrientation() {
        return this.f4534c;
    }

    public int getShowDividers() {
        return this.f4545n;
    }

    public float getWeightSum() {
        return this.f4539h;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public LayoutParams generateDefaultLayoutParams() {
        if (this.f4534c == 0) {
            return new LayoutParams(-2, -2);
        }
        if (this.f4534c == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public int getBaseline() {
        if (this.f4532a < 0) {
            return super.getBaseline();
        }
        if (getChildCount() > this.f4532a) {
            View childAt = getChildAt(this.f4532a);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i = this.f4533b;
                if (this.f4534c == 1) {
                    int i2 = this.f4535d & 112;
                    if (i2 != 48) {
                        if (i2 == 16) {
                            i += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4536e) / 2;
                        } else if (i2 == 80) {
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4536e;
                        }
                    }
                }
                return i + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f4532a == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setBaselineAligned(boolean z) {
        this.f4537f = z;
    }

    public void setDividerPadding(int i) {
        this.f4546o = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f4538g = z;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private View m4133b(int i) {
        return getChildAt(i);
    }

    public void setWeightSum(float f) {
        this.f4539h = Math.max(0.0f, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    public void setOrientation(int i) {
        if (this.f4534c != i) {
            this.f4534c = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4545n) {
            requestLayout();
        }
        this.f4545n = i;
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setGravity(int i) {
        if (this.f4535d != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4535d = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((8388615 & this.f4535d) != i2) {
            this.f4535d = i2 | (this.f4535d & -8388616);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.f4535d & 112) != i2) {
            this.f4535d = i2 | (this.f4535d & -113);
            requestLayout();
        }
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f4532a = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f4542k) {
            this.f4542k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f4543l = drawable.getIntrinsicWidth();
                this.f4544m = drawable.getIntrinsicHeight();
            } else {
                this.f4543l = 0;
                this.f4544m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo4695a(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f4545n & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.f4545n & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f4545n & 2) == 0) {
            return false;
        } else {
            int i2 = i - 1;
            while (true) {
                if (i2 < 0) {
                    break;
                } else if (getChildAt(i2).getVisibility() != 8) {
                    z = true;
                    break;
                } else {
                    i2--;
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        if (this.f4542k != null) {
            int i4 = 0;
            if (this.f4534c == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i4 < virtualChildCount) {
                    View b = m4133b(i4);
                    if (!(b == null || b.getVisibility() == 8 || !mo4695a(i4))) {
                        m4130a(canvas, (b.getTop() - ((LayoutParams) b.getLayoutParams()).topMargin) - this.f4544m);
                    }
                    i4++;
                }
                if (mo4695a(virtualChildCount)) {
                    View b2 = m4133b(virtualChildCount - 1);
                    if (b2 == null) {
                        i3 = (getHeight() - getPaddingBottom()) - this.f4544m;
                    } else {
                        i3 = b2.getBottom() + ((LayoutParams) b2.getLayoutParams()).bottomMargin;
                    }
                    m4130a(canvas, i3);
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a = C1467bj.m5138a(this);
            while (i4 < virtualChildCount2) {
                View b3 = m4133b(i4);
                if (!(b3 == null || b3.getVisibility() == 8 || !mo4695a(i4))) {
                    LayoutParams layoutParams = (LayoutParams) b3.getLayoutParams();
                    if (a) {
                        i2 = b3.getRight() + layoutParams.rightMargin;
                    } else {
                        i2 = (b3.getLeft() - layoutParams.leftMargin) - this.f4543l;
                    }
                    m4135b(canvas, i2);
                }
                i4++;
            }
            if (mo4695a(virtualChildCount2)) {
                View b4 = m4133b(virtualChildCount2 - 1);
                if (b4 != null) {
                    LayoutParams layoutParams2 = (LayoutParams) b4.getLayoutParams();
                    if (a) {
                        i = (b4.getLeft() - layoutParams2.leftMargin) - this.f4543l;
                    } else {
                        i = b4.getRight() + layoutParams2.rightMargin;
                    }
                } else if (a) {
                    i = getPaddingLeft();
                } else {
                    i = (getWidth() - getPaddingRight()) - this.f4543l;
                }
                m4135b(canvas, i);
            }
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m4129a(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = m4133b(i3);
            if (b.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* renamed from: b */
    private void m4135b(Canvas canvas, int i) {
        this.f4542k.setBounds(i, getPaddingTop() + this.f4546o, this.f4543l + i, (getHeight() - getPaddingBottom()) - this.f4546o);
        this.f4542k.draw(canvas);
    }

    /* renamed from: a */
    private void m4130a(Canvas canvas, int i) {
        this.f4542k.setBounds(getPaddingLeft() + this.f4546o, i, (getWidth() - getPaddingRight()) - this.f4546o, this.f4544m + i);
        this.f4542k.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02bb, code lost:
        if (r4 > 0) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c5, code lost:
        if (r4 < 0) goto L_0x02be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r37, int r38) {
        /*
            r36 = this;
            r7 = r36
            r8 = r37
            r9 = r38
            int r0 = r7.f4534c
            r10 = 1
            if (r0 != r10) goto L_0x037a
            r11 = 0
            r7.f4536e = r11
            int r12 = r36.getVirtualChildCount()
            int r13 = android.view.View.MeasureSpec.getMode(r37)
            int r14 = android.view.View.MeasureSpec.getMode(r38)
            int r15 = r7.f4532a
            boolean r6 = r7.f4538g
            r16 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r10 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
        L_0x002e:
            if (r5 >= r12) goto L_0x018f
            android.view.View r22 = r7.m4133b(r5)
            if (r22 != 0) goto L_0x0046
            int r4 = r7.f4536e
            int r4 = r4 + r11
            r7.f4536e = r4
            r29 = r12
            r28 = r14
            r9 = r20
            r4 = 1
            r20 = r6
            goto L_0x017f
        L_0x0046:
            int r11 = r22.getVisibility()
            r4 = 8
            if (r11 == r4) goto L_0x016a
            boolean r4 = r7.mo4695a(r5)
            if (r4 == 0) goto L_0x005b
            int r4 = r7.f4536e
            int r11 = r7.f4544m
            int r4 = r4 + r11
            r7.f4536e = r4
        L_0x005b:
            android.view.ViewGroup$LayoutParams r4 = r22.getLayoutParams()
            r11 = r4
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r11 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r11
            float r4 = r11.f4547g
            float r21 = r0 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            if (r14 != r4) goto L_0x0095
            int r0 = r11.height
            if (r0 != 0) goto L_0x0095
            float r0 = r11.f4547g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            int r0 = r7.f4536e
            int r4 = r11.topMargin
            int r4 = r4 + r0
            r24 = r1
            int r1 = r11.bottomMargin
            int r4 = r4 + r1
            int r0 = java.lang.Math.max(r0, r4)
            r7.f4536e = r0
            r8 = r3
            r30 = r5
            r29 = r12
            r28 = r14
            r9 = r20
            r26 = r24
            r17 = 1
            r20 = r6
            goto L_0x00fe
        L_0x0095:
            r24 = r1
            int r0 = r11.height
            if (r0 != 0) goto L_0x00a6
            float r0 = r11.f4547g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            r0 = -2
            r11.height = r0
            r4 = 0
            goto L_0x00a8
        L_0x00a6:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a8:
            r23 = 0
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00b3
            int r0 = r7.f4536e
            r25 = r0
            goto L_0x00b5
        L_0x00b3:
            r25 = 0
        L_0x00b5:
            r0 = r36
            r26 = r24
            r1 = r22
            r27 = r2
            r2 = r5
            r8 = r3
            r3 = r37
            r29 = r12
            r28 = r14
            r9 = r20
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = r4
            r4 = r23
            r30 = r5
            r5 = r38
            r20 = r6
            r6 = r25
            r0.m4132a(r1, r2, r3, r4, r5, r6)
            if (r14 == r12) goto L_0x00db
            r11.height = r14
        L_0x00db:
            int r0 = r22.getMeasuredHeight()
            int r1 = r7.f4536e
            int r2 = r1 + r0
            int r3 = r11.topMargin
            int r2 = r2 + r3
            int r3 = r11.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r7.f4536e = r1
            if (r20 == 0) goto L_0x00fb
            r1 = r27
            int r0 = java.lang.Math.max(r0, r1)
            r2 = r0
            goto L_0x00fe
        L_0x00fb:
            r1 = r27
            r2 = r1
        L_0x00fe:
            if (r15 < 0) goto L_0x010b
            r3 = r30
            int r5 = r3 + 1
            if (r15 != r5) goto L_0x010d
            int r0 = r7.f4536e
            r7.f4533b = r0
            goto L_0x010d
        L_0x010b:
            r3 = r30
        L_0x010d:
            if (r3 >= r15) goto L_0x011e
            float r0 = r11.f4547g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0116
            goto L_0x011e
        L_0x0116:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x011e:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x012b
            int r0 = r11.width
            r4 = -1
            if (r0 != r4) goto L_0x012c
            r0 = 1
            r19 = 1
            goto L_0x012d
        L_0x012b:
            r4 = -1
        L_0x012c:
            r0 = 0
        L_0x012d:
            int r1 = r11.leftMargin
            int r5 = r11.rightMargin
            int r1 = r1 + r5
            int r5 = r22.getMeasuredWidth()
            int r5 = r5 + r1
            r6 = r26
            int r6 = java.lang.Math.max(r6, r5)
            int r12 = r22.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r12)
            if (r18 == 0) goto L_0x014e
            int r12 = r11.width
            if (r12 != r4) goto L_0x014e
            r18 = 1
            goto L_0x0150
        L_0x014e:
            r18 = 0
        L_0x0150:
            float r4 = r11.f4547g
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x0160
            if (r0 == 0) goto L_0x0159
            goto L_0x015a
        L_0x0159:
            r1 = r5
        L_0x015a:
            int r0 = java.lang.Math.max(r8, r1)
            r8 = r0
            goto L_0x0178
        L_0x0160:
            if (r0 == 0) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r1 = r5
        L_0x0164:
            int r0 = java.lang.Math.max(r9, r1)
            r9 = r0
            goto L_0x0178
        L_0x016a:
            r8 = r3
            r3 = r5
            r29 = r12
            r28 = r14
            r9 = r20
            r20 = r6
            r6 = r1
            r1 = r2
            r21 = r0
        L_0x0178:
            int r5 = r3 + 0
            r1 = r6
            r3 = r8
            r0 = r21
            r4 = 1
        L_0x017f:
            int r5 = r5 + r4
            r6 = r20
            r14 = r28
            r12 = r29
            r8 = r37
            r11 = 0
            r20 = r9
            r9 = r38
            goto L_0x002e
        L_0x018f:
            r8 = r3
            r29 = r12
            r28 = r14
            r9 = r20
            r4 = -1
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = r6
            r6 = r1
            r1 = r2
            int r2 = r7.f4536e
            if (r2 <= 0) goto L_0x01b1
            r2 = r29
            boolean r3 = r7.mo4695a(r2)
            if (r3 == 0) goto L_0x01b3
            int r3 = r7.f4536e
            int r5 = r7.f4544m
            int r3 = r3 + r5
            r7.f4536e = r3
            goto L_0x01b3
        L_0x01b1:
            r2 = r29
        L_0x01b3:
            if (r20 == 0) goto L_0x01f4
            r3 = r28
            if (r3 == r12) goto L_0x01bb
            if (r3 != 0) goto L_0x01f6
        L_0x01bb:
            r5 = 0
            r7.f4536e = r5
            r11 = 0
        L_0x01bf:
            if (r11 >= r2) goto L_0x01f6
            android.view.View r12 = r7.m4133b(r11)
            if (r12 != 0) goto L_0x01cd
            int r12 = r7.f4536e
            int r12 = r12 + r5
            r7.f4536e = r12
            goto L_0x01f0
        L_0x01cd:
            int r5 = r12.getVisibility()
            r14 = 8
            if (r5 != r14) goto L_0x01d8
            int r11 = r11 + 0
            goto L_0x01f0
        L_0x01d8:
            android.view.ViewGroup$LayoutParams r5 = r12.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r5 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r5
            int r12 = r7.f4536e
            int r14 = r12 + r1
            int r15 = r5.topMargin
            int r14 = r14 + r15
            int r5 = r5.bottomMargin
            int r14 = r14 + r5
            r5 = 0
            int r14 = r14 + r5
            int r5 = java.lang.Math.max(r12, r14)
            r7.f4536e = r5
        L_0x01f0:
            r5 = 1
            int r11 = r11 + r5
            r5 = 0
            goto L_0x01bf
        L_0x01f4:
            r3 = r28
        L_0x01f6:
            r5 = 1
            int r11 = r7.f4536e
            int r12 = r36.getPaddingTop()
            int r14 = r36.getPaddingBottom()
            int r12 = r12 + r14
            int r11 = r11 + r12
            r7.f4536e = r11
            int r11 = r7.f4536e
            int r12 = r36.getSuggestedMinimumHeight()
            int r11 = java.lang.Math.max(r11, r12)
            r12 = r9
            r9 = r38
            r14 = 0
            int r11 = android.view.View.resolveSizeAndState(r11, r9, r14)
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r14 = r14 & r11
            int r15 = r7.f4536e
            int r14 = r14 - r15
            if (r17 != 0) goto L_0x0267
            if (r14 == 0) goto L_0x0227
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 <= 0) goto L_0x0227
            goto L_0x0267
        L_0x0227:
            int r0 = java.lang.Math.max(r12, r8)
            if (r20 == 0) goto L_0x0262
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == r4) goto L_0x0262
            r3 = 0
        L_0x0232:
            if (r3 >= r2) goto L_0x0262
            android.view.View r4 = r7.m4133b(r3)
            if (r4 == 0) goto L_0x025f
            int r5 = r4.getVisibility()
            r8 = 8
            if (r5 == r8) goto L_0x025f
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r5 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r5
            float r5 = r5.f4547g
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x025f
            int r5 = r4.getMeasuredWidth()
            r8 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r4.measure(r5, r12)
        L_0x025f:
            int r3 = r3 + 1
            goto L_0x0232
        L_0x0262:
            r1 = r6
            r14 = r37
            goto L_0x0353
        L_0x0267:
            float r1 = r7.f4539h
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x026f
            float r0 = r7.f4539h
        L_0x026f:
            r1 = 0
            r7.f4536e = r1
            r1 = r6
            r6 = r0
            r0 = 0
        L_0x0275:
            if (r0 >= r2) goto L_0x0342
            android.view.View r8 = r7.m4133b(r0)
            int r15 = r8.getVisibility()
            r5 = 8
            if (r15 == r5) goto L_0x0333
            android.view.ViewGroup$LayoutParams r15 = r8.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r15 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r15
            float r5 = r15.f4547g
            int r17 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r17 <= 0) goto L_0x02e0
            float r4 = (float) r14
            float r4 = r4 * r5
            float r4 = r4 / r6
            int r4 = (int) r4
            float r6 = r6 - r5
            int r14 = r14 - r4
            int r5 = r36.getPaddingLeft()
            int r17 = r36.getPaddingRight()
            int r5 = r5 + r17
            r31 = r6
            int r6 = r15.leftMargin
            int r5 = r5 + r6
            int r6 = r15.rightMargin
            int r5 = r5 + r6
            int r6 = r15.width
            r32 = r14
            r14 = r37
            int r5 = getChildMeasureSpec(r14, r5, r6)
            int r6 = r15.height
            if (r6 != 0) goto L_0x02c0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 == r6) goto L_0x02bb
            goto L_0x02c0
        L_0x02bb:
            if (r4 <= 0) goto L_0x02be
            goto L_0x02c8
        L_0x02be:
            r4 = 0
            goto L_0x02c8
        L_0x02c0:
            int r6 = r8.getMeasuredHeight()
            int r4 = r4 + r6
            if (r4 >= 0) goto L_0x02c8
            goto L_0x02be
        L_0x02c8:
            r6 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            r8.measure(r5, r4)
            int r4 = r8.getMeasuredState()
            r4 = r4 & -256(0xffffffffffffff00, float:NaN)
            int r10 = android.view.View.combineMeasuredStates(r10, r4)
            r6 = r31
            r4 = r32
            goto L_0x02e3
        L_0x02e0:
            r4 = r14
            r14 = r37
        L_0x02e3:
            int r5 = r15.leftMargin
            r33 = r3
            int r3 = r15.rightMargin
            int r5 = r5 + r3
            int r3 = r8.getMeasuredWidth()
            int r3 = r3 + r5
            int r1 = java.lang.Math.max(r1, r3)
            r34 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 == r1) goto L_0x0302
            int r1 = r15.width
            r35 = r3
            r3 = -1
            if (r1 != r3) goto L_0x0305
            r1 = 1
            goto L_0x0306
        L_0x0302:
            r35 = r3
            r3 = -1
        L_0x0305:
            r1 = 0
        L_0x0306:
            if (r1 == 0) goto L_0x0309
            goto L_0x030b
        L_0x0309:
            r5 = r35
        L_0x030b:
            int r1 = java.lang.Math.max(r12, r5)
            if (r18 == 0) goto L_0x0317
            int r5 = r15.width
            if (r5 != r3) goto L_0x0317
            r5 = 1
            goto L_0x0318
        L_0x0317:
            r5 = 0
        L_0x0318:
            int r12 = r7.f4536e
            int r8 = r8.getMeasuredHeight()
            int r8 = r8 + r12
            int r3 = r15.topMargin
            int r8 = r8 + r3
            int r3 = r15.bottomMargin
            int r8 = r8 + r3
            r3 = 0
            int r8 = r8 + r3
            int r8 = java.lang.Math.max(r12, r8)
            r7.f4536e = r8
            r12 = r1
            r18 = r5
            r1 = r34
            goto L_0x0339
        L_0x0333:
            r33 = r3
            r4 = r14
            r3 = 0
            r14 = r37
        L_0x0339:
            int r0 = r0 + 1
            r14 = r4
            r3 = r33
            r4 = -1
            r5 = 1
            goto L_0x0275
        L_0x0342:
            r14 = r37
            int r0 = r7.f4536e
            int r3 = r36.getPaddingTop()
            int r4 = r36.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            r7.f4536e = r0
            r0 = r12
        L_0x0353:
            if (r18 != 0) goto L_0x035a
            r3 = 1073741824(0x40000000, float:2.0)
            if (r13 == r3) goto L_0x035a
            goto L_0x035b
        L_0x035a:
            r0 = r1
        L_0x035b:
            int r1 = r36.getPaddingLeft()
            int r3 = r36.getPaddingRight()
            int r1 = r1 + r3
            int r0 = r0 + r1
            int r1 = r36.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = android.view.View.resolveSizeAndState(r0, r14, r10)
            r7.setMeasuredDimension(r0, r11)
            if (r19 == 0) goto L_0x0379
            r7.m4129a(r2, r9)
        L_0x0379:
            return
        L_0x037a:
            r14 = r8
            r36.m4134b(r37, r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03ae, code lost:
        if (r6 < 0) goto L_0x03a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4134b(int r42, int r43) {
        /*
            r41 = this;
            r7 = r41
            r8 = r43
            r9 = 0
            r7.f4536e = r9
            int r10 = r41.getVirtualChildCount()
            int r11 = android.view.View.MeasureSpec.getMode(r42)
            int r12 = android.view.View.MeasureSpec.getMode(r43)
            int[] r0 = r7.f4540i
            r13 = 4
            if (r0 == 0) goto L_0x001c
            int[] r0 = r7.f4541j
            if (r0 != 0) goto L_0x0024
        L_0x001c:
            int[] r0 = new int[r13]
            r7.f4540i = r0
            int[] r0 = new int[r13]
            r7.f4541j = r0
        L_0x0024:
            int[] r14 = r7.f4540i
            int[] r15 = r7.f4541j
            r16 = 3
            r6 = -1
            r14[r16] = r6
            r17 = 2
            r14[r17] = r6
            r18 = 1
            r14[r18] = r6
            r14[r9] = r6
            r15[r16] = r6
            r15[r17] = r6
            r15[r18] = r6
            r15[r9] = r6
            boolean r5 = r7.f4537f
            boolean r4 = r7.f4538g
            r3 = 1073741824(0x40000000, float:2.0)
            if (r11 != r3) goto L_0x004a
            r19 = 1
            goto L_0x004c
        L_0x004a:
            r19 = 0
        L_0x004c:
            r20 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            r13 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
            r26 = 0
        L_0x005e:
            r6 = 8
            if (r2 >= r10) goto L_0x0203
            android.view.View r3 = r7.m4133b(r2)
            if (r3 != 0) goto L_0x0076
            int r3 = r7.f4536e
            int r3 = r3 + r9
            r7.f4536e = r3
            r35 = r4
            r28 = r5
            r4 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01f4
        L_0x0076:
            int r9 = r3.getVisibility()
            if (r9 == r6) goto L_0x01dd
            boolean r6 = r7.mo4695a(r2)
            if (r6 == 0) goto L_0x0089
            int r6 = r7.f4536e
            int r9 = r7.f4543l
            int r6 = r6 + r9
            r7.f4536e = r6
        L_0x0089:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            r9 = r6
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r9 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r9
            float r6 = r9.f4547g
            float r30 = r0 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            if (r11 != r6) goto L_0x00eb
            int r0 = r9.width
            if (r0 != 0) goto L_0x00eb
            float r0 = r9.f4547g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            if (r19 == 0) goto L_0x00b1
            int r0 = r7.f4536e
            int r6 = r9.leftMargin
            r32 = r1
            int r1 = r9.rightMargin
            int r6 = r6 + r1
            int r0 = r0 + r6
            r7.f4536e = r0
            goto L_0x00c1
        L_0x00b1:
            r32 = r1
            int r0 = r7.f4536e
            int r1 = r9.leftMargin
            int r1 = r1 + r0
            int r6 = r9.rightMargin
            int r1 = r1 + r6
            int r0 = java.lang.Math.max(r0, r1)
            r7.f4536e = r0
        L_0x00c1:
            if (r5 == 0) goto L_0x00d9
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r3.measure(r1, r1)
            r31 = r3
            r35 = r4
            r28 = r5
            r33 = r32
            r27 = -2
            r32 = r2
            goto L_0x015d
        L_0x00d9:
            r31 = r3
            r35 = r4
            r28 = r5
            r33 = r32
            r1 = 1073741824(0x40000000, float:2.0)
            r21 = 1
            r27 = -2
            r32 = r2
            goto L_0x015f
        L_0x00eb:
            r32 = r1
            int r0 = r9.width
            if (r0 != 0) goto L_0x00fc
            float r0 = r9.f4547g
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fc
            r6 = -2
            r9.width = r6
            r1 = 0
            goto L_0x00ff
        L_0x00fc:
            r6 = -2
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ff:
            int r0 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0108
            int r0 = r7.f4536e
            r28 = r0
            goto L_0x010a
        L_0x0108:
            r28 = 0
        L_0x010a:
            r29 = 0
            r0 = r41
            r34 = r1
            r33 = r32
            r1 = r3
            r32 = r2
            r31 = r3
            r3 = r42
            r35 = r4
            r4 = r28
            r28 = r5
            r5 = r43
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = -2
            r6 = r29
            r0.m4132a(r1, r2, r3, r4, r5, r6)
            r0 = r34
            if (r0 == r8) goto L_0x0130
            r9.width = r0
        L_0x0130:
            int r0 = r31.getMeasuredWidth()
            if (r19 == 0) goto L_0x0144
            int r1 = r7.f4536e
            int r2 = r9.leftMargin
            int r2 = r2 + r0
            int r3 = r9.rightMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.f4536e = r1
            goto L_0x0156
        L_0x0144:
            r3 = 0
            int r1 = r7.f4536e
            int r2 = r1 + r0
            int r4 = r9.leftMargin
            int r2 = r2 + r4
            int r4 = r9.rightMargin
            int r2 = r2 + r4
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r7.f4536e = r1
        L_0x0156:
            if (r35 == 0) goto L_0x015d
            int r0 = java.lang.Math.max(r0, r13)
            r13 = r0
        L_0x015d:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x015f:
            if (r12 == r1) goto L_0x016a
            int r0 = r9.height
            r2 = -1
            if (r0 != r2) goto L_0x016a
            r0 = 1
            r25 = 1
            goto L_0x016b
        L_0x016a:
            r0 = 0
        L_0x016b:
            int r2 = r9.topMargin
            int r3 = r9.bottomMargin
            int r2 = r2 + r3
            int r3 = r31.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r31.getMeasuredState()
            r5 = r26
            int r26 = android.view.View.combineMeasuredStates(r5, r4)
            if (r28 == 0) goto L_0x01ab
            int r4 = r31.getBaseline()
            r5 = -1
            if (r4 == r5) goto L_0x01ab
            int r5 = r9.f4548h
            if (r5 >= 0) goto L_0x018f
            int r5 = r7.f4535d
            goto L_0x0191
        L_0x018f:
            int r5 = r9.f4548h
        L_0x0191:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 4
            int r5 = r5 >> r6
            r5 = r5 & -2
            int r5 = r5 >> 1
            r6 = r14[r5]
            int r6 = java.lang.Math.max(r6, r4)
            r14[r5] = r6
            r6 = r15[r5]
            int r4 = r3 - r4
            int r4 = java.lang.Math.max(r6, r4)
            r15[r5] = r4
        L_0x01ab:
            r4 = r33
            int r4 = java.lang.Math.max(r4, r3)
            if (r24 == 0) goto L_0x01bb
            int r5 = r9.height
            r6 = -1
            if (r5 != r6) goto L_0x01bb
            r24 = 1
            goto L_0x01bd
        L_0x01bb:
            r24 = 0
        L_0x01bd:
            float r5 = r9.f4547g
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d1
            if (r0 == 0) goto L_0x01c8
        L_0x01c5:
            r9 = r23
            goto L_0x01ca
        L_0x01c8:
            r2 = r3
            goto L_0x01c5
        L_0x01ca:
            int r23 = java.lang.Math.max(r9, r2)
            r9 = r23
            goto L_0x01ee
        L_0x01d1:
            r9 = r23
            if (r0 == 0) goto L_0x01d6
            r3 = r2
        L_0x01d6:
            r2 = r22
            int r22 = java.lang.Math.max(r2, r3)
            goto L_0x01ee
        L_0x01dd:
            r32 = r2
            r35 = r4
            r28 = r5
            r2 = r22
            r9 = r23
            r5 = r26
            r4 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r30 = r0
        L_0x01ee:
            int r2 = r32 + 0
            r23 = r9
            r0 = r30
        L_0x01f4:
            int r2 = r2 + 1
            r1 = r4
            r5 = r28
            r4 = r35
            r3 = 1073741824(0x40000000, float:2.0)
            r6 = -1
            r8 = r43
            r9 = 0
            goto L_0x005e
        L_0x0203:
            r35 = r4
            r28 = r5
            r2 = r22
            r9 = r23
            r5 = r26
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = -2
            r4 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = r7.f4536e
            if (r3 <= 0) goto L_0x0225
            boolean r3 = r7.mo4695a(r10)
            if (r3 == 0) goto L_0x0225
            int r3 = r7.f4536e
            int r1 = r7.f4543l
            int r3 = r3 + r1
            r7.f4536e = r3
        L_0x0225:
            r1 = r14[r18]
            r3 = -1
            if (r1 != r3) goto L_0x023c
            r1 = 0
            r6 = r14[r1]
            if (r6 != r3) goto L_0x023c
            r1 = r14[r17]
            if (r1 != r3) goto L_0x023c
            r1 = r14[r16]
            if (r1 == r3) goto L_0x0238
            goto L_0x023c
        L_0x0238:
            r1 = r4
            r36 = r5
            goto L_0x026d
        L_0x023c:
            r1 = r14[r16]
            r3 = 0
            r6 = r14[r3]
            r8 = r14[r18]
            r3 = r14[r17]
            int r3 = java.lang.Math.max(r8, r3)
            int r3 = java.lang.Math.max(r6, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r15[r16]
            r6 = 0
            r8 = r15[r6]
            r6 = r15[r18]
            r36 = r5
            r5 = r15[r17]
            int r5 = java.lang.Math.max(r6, r5)
            int r5 = java.lang.Math.max(r8, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r4, r1)
        L_0x026d:
            if (r35 == 0) goto L_0x02bf
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r3) goto L_0x0275
            if (r11 != 0) goto L_0x02bf
        L_0x0275:
            r3 = 0
            r7.f4536e = r3
            r4 = 0
        L_0x0279:
            if (r4 >= r10) goto L_0x02bf
            android.view.View r5 = r7.m4133b(r4)
            if (r5 != 0) goto L_0x0287
            int r5 = r7.f4536e
            int r5 = r5 + r3
            r7.f4536e = r5
            goto L_0x02bb
        L_0x0287:
            int r3 = r5.getVisibility()
            r6 = 8
            if (r3 != r6) goto L_0x0292
            int r4 = r4 + 0
            goto L_0x02bb
        L_0x0292:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r3 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r3
            if (r19 == 0) goto L_0x02a8
            int r5 = r7.f4536e
            int r6 = r3.leftMargin
            int r6 = r6 + r13
            int r3 = r3.rightMargin
            int r6 = r6 + r3
            r8 = 0
            int r6 = r6 + r8
            int r5 = r5 + r6
            r7.f4536e = r5
            goto L_0x02bb
        L_0x02a8:
            r8 = 0
            int r5 = r7.f4536e
            int r6 = r5 + r13
            int r8 = r3.leftMargin
            int r6 = r6 + r8
            int r3 = r3.rightMargin
            int r6 = r6 + r3
            r3 = 0
            int r6 = r6 + r3
            int r3 = java.lang.Math.max(r5, r6)
            r7.f4536e = r3
        L_0x02bb:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x0279
        L_0x02bf:
            int r3 = r7.f4536e
            int r4 = r41.getPaddingLeft()
            int r5 = r41.getPaddingRight()
            int r4 = r4 + r5
            int r3 = r3 + r4
            r7.f4536e = r3
            int r3 = r7.f4536e
            int r4 = r41.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r3, r4)
            r6 = r42
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r6, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r7.f4536e
            int r4 = r4 - r5
            if (r21 != 0) goto L_0x0334
            if (r4 == 0) goto L_0x02ee
            int r8 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r8 <= 0) goto L_0x02ee
            goto L_0x0334
        L_0x02ee:
            int r0 = java.lang.Math.max(r2, r9)
            if (r35 == 0) goto L_0x0329
            r2 = 1073741824(0x40000000, float:2.0)
            if (r11 == r2) goto L_0x0329
            r2 = 0
        L_0x02f9:
            if (r2 >= r10) goto L_0x0329
            android.view.View r4 = r7.m4133b(r2)
            if (r4 == 0) goto L_0x0326
            int r8 = r4.getVisibility()
            r9 = 8
            if (r8 == r9) goto L_0x0326
            android.view.ViewGroup$LayoutParams r8 = r4.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r8 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r8
            float r8 = r8.f4547g
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 <= 0) goto L_0x0326
            r8 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r8)
            int r11 = r4.getMeasuredHeight()
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r8)
            r4.measure(r9, r11)
        L_0x0326:
            int r2 = r2 + 1
            goto L_0x02f9
        L_0x0329:
            r13 = r0
            r0 = r1
            r40 = r3
            r37 = r10
            r1 = 0
            r4 = r43
            goto L_0x04cf
        L_0x0334:
            float r1 = r7.f4539h
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x033c
            float r0 = r7.f4539h
        L_0x033c:
            r1 = -1
            r14[r16] = r1
            r14[r17] = r1
            r14[r18] = r1
            r8 = 0
            r14[r8] = r1
            r15[r16] = r1
            r15[r17] = r1
            r15[r18] = r1
            r15[r8] = r1
            r7.f4536e = r8
            r13 = r2
            r9 = r36
            r8 = -1
            r2 = r0
            r0 = 0
        L_0x0356:
            if (r0 >= r10) goto L_0x0475
            android.view.View r1 = r7.m4133b(r0)
            if (r1 == 0) goto L_0x045d
            int r5 = r1.getVisibility()
            r6 = 8
            if (r5 == r6) goto L_0x045d
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r5 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r5
            float r6 = r5.f4547g
            int r21 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r21 <= 0) goto L_0x03c8
            r37 = r10
            float r10 = (float) r4
            float r10 = r10 * r6
            float r10 = r10 / r2
            int r10 = (int) r10
            float r2 = r2 - r6
            int r4 = r4 - r10
            int r6 = r41.getPaddingTop()
            int r21 = r41.getPaddingBottom()
            int r6 = r6 + r21
            r38 = r2
            int r2 = r5.topMargin
            int r6 = r6 + r2
            int r2 = r5.bottomMargin
            int r6 = r6 + r2
            int r2 = r5.height
            r40 = r3
            r39 = r4
            r3 = -1
            r4 = r43
            int r2 = getChildMeasureSpec(r4, r6, r2)
            int r6 = r5.width
            if (r6 != 0) goto L_0x03a9
            r6 = 1073741824(0x40000000, float:2.0)
            if (r11 == r6) goto L_0x03a3
            goto L_0x03a9
        L_0x03a3:
            if (r10 <= 0) goto L_0x03a7
            r6 = r10
            goto L_0x03b1
        L_0x03a7:
            r6 = 0
            goto L_0x03b1
        L_0x03a9:
            int r6 = r1.getMeasuredWidth()
            int r6 = r6 + r10
            if (r6 >= 0) goto L_0x03b1
            goto L_0x03a7
        L_0x03b1:
            r10 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r10)
            r1.measure(r6, r2)
            int r2 = r1.getMeasuredState()
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r6
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r38
            goto L_0x03d2
        L_0x03c8:
            r40 = r3
            r6 = r4
            r37 = r10
            r3 = -1
            r4 = r43
            r39 = r6
        L_0x03d2:
            if (r19 == 0) goto L_0x03e8
            int r6 = r7.f4536e
            int r10 = r1.getMeasuredWidth()
            int r3 = r5.leftMargin
            int r10 = r10 + r3
            int r3 = r5.rightMargin
            int r10 = r10 + r3
            r3 = 0
            int r10 = r10 + r3
            int r6 = r6 + r10
            r7.f4536e = r6
        L_0x03e5:
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x03ff
        L_0x03e8:
            r3 = 0
            int r6 = r7.f4536e
            int r10 = r1.getMeasuredWidth()
            int r10 = r10 + r6
            int r3 = r5.leftMargin
            int r10 = r10 + r3
            int r3 = r5.rightMargin
            int r10 = r10 + r3
            r3 = 0
            int r10 = r10 + r3
            int r3 = java.lang.Math.max(r6, r10)
            r7.f4536e = r3
            goto L_0x03e5
        L_0x03ff:
            if (r12 == r3) goto L_0x0408
            int r3 = r5.height
            r6 = -1
            if (r3 != r6) goto L_0x0408
            r3 = 1
            goto L_0x0409
        L_0x0408:
            r3 = 0
        L_0x0409:
            int r6 = r5.topMargin
            int r10 = r5.bottomMargin
            int r6 = r6 + r10
            int r10 = r1.getMeasuredHeight()
            int r10 = r10 + r6
            int r8 = java.lang.Math.max(r8, r10)
            if (r3 == 0) goto L_0x041a
            goto L_0x041b
        L_0x041a:
            r6 = r10
        L_0x041b:
            int r3 = java.lang.Math.max(r13, r6)
            if (r24 == 0) goto L_0x0428
            int r6 = r5.height
            r13 = -1
            if (r6 != r13) goto L_0x0429
            r6 = 1
            goto L_0x042a
        L_0x0428:
            r13 = -1
        L_0x0429:
            r6 = 0
        L_0x042a:
            if (r28 == 0) goto L_0x0457
            int r1 = r1.getBaseline()
            if (r1 == r13) goto L_0x0457
            int r13 = r5.f4548h
            if (r13 >= 0) goto L_0x0439
            int r5 = r7.f4535d
            goto L_0x043b
        L_0x0439:
            int r5 = r5.f4548h
        L_0x043b:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r5 = r5 >> 4
            r5 = r5 & -2
            int r5 = r5 >> 1
            r13 = r14[r5]
            int r13 = java.lang.Math.max(r13, r1)
            r14[r5] = r13
            r13 = r15[r5]
            int r10 = r10 - r1
            int r1 = java.lang.Math.max(r13, r10)
            r15[r5] = r1
            goto L_0x0459
        L_0x0457:
            r21 = 4
        L_0x0459:
            r13 = r3
            r24 = r6
            goto L_0x0468
        L_0x045d:
            r40 = r3
            r6 = r4
            r37 = r10
            r4 = r43
            r21 = 4
            r39 = r6
        L_0x0468:
            int r0 = r0 + 1
            r10 = r37
            r4 = r39
            r3 = r40
            r1 = -1
            r6 = r42
            goto L_0x0356
        L_0x0475:
            r40 = r3
            r37 = r10
            r4 = r43
            int r0 = r7.f4536e
            int r1 = r41.getPaddingLeft()
            int r2 = r41.getPaddingRight()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r7.f4536e = r0
            r0 = r14[r18]
            r1 = -1
            if (r0 != r1) goto L_0x049f
            r0 = 0
            r2 = r14[r0]
            if (r2 != r1) goto L_0x049f
            r0 = r14[r17]
            if (r0 != r1) goto L_0x049f
            r0 = r14[r16]
            if (r0 == r1) goto L_0x049c
            goto L_0x049f
        L_0x049c:
            r0 = r8
            r1 = 0
            goto L_0x04cd
        L_0x049f:
            r0 = r14[r16]
            r1 = 0
            r2 = r14[r1]
            r3 = r14[r18]
            r5 = r14[r17]
            int r3 = java.lang.Math.max(r3, r5)
            int r2 = java.lang.Math.max(r2, r3)
            int r0 = java.lang.Math.max(r0, r2)
            r2 = r15[r16]
            r3 = r15[r1]
            r5 = r15[r18]
            r6 = r15[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r3 = java.lang.Math.max(r3, r5)
            int r2 = java.lang.Math.max(r2, r3)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
        L_0x04cd:
            r36 = r9
        L_0x04cf:
            if (r24 != 0) goto L_0x04d6
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x04d6
            goto L_0x04d7
        L_0x04d6:
            r13 = r0
        L_0x04d7:
            int r0 = r41.getPaddingTop()
            int r2 = r41.getPaddingBottom()
            int r0 = r0 + r2
            int r13 = r13 + r0
            int r0 = r41.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r13, r0)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r36 & r2
            r2 = r40 | r2
            int r3 = r36 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r3)
            r7.setMeasuredDimension(r2, r0)
            if (r25 == 0) goto L_0x053c
            int r0 = r41.getMeasuredHeight()
            r2 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r8 = r37
            r9 = 0
        L_0x0507:
            if (r9 >= r8) goto L_0x053c
            android.view.View r1 = r7.m4133b(r9)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x0538
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r11 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r11
            int r0 = r11.height
            r3 = -1
            if (r0 != r3) goto L_0x0538
            int r12 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r4 = 0
            r5 = 0
            r0 = r41
            r2 = r42
            r13 = -1
            r3 = r4
            r4 = r6
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r12
            goto L_0x0539
        L_0x0538:
            r13 = -1
        L_0x0539:
            int r9 = r9 + 1
            goto L_0x0507
        L_0x053c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.LinearLayoutCompat.m4134b(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4537f = true;
        this.f4532a = -1;
        this.f4535d = 8388659;
        C1451bb a = C1451bb.m5032a(context, attributeSet, new int[]{16842927, 16842948, 16843046, 16843047, 16843048, R.attr.jt, R.attr.jx, R.attr.u1, R.attr.a23}, i, 0);
        int a2 = a.mo5650a(1, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo5650a(0, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo5654a(2, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f4539h = a.mo5649a(4, -1.0f);
        this.f4532a = a.mo5650a(3, -1);
        this.f4538g = a.mo5654a(7, false);
        setDividerDrawable(a.mo5652a(5));
        this.f4545n = a.mo5650a(8, 0);
        this.f4546o = a.mo5661e(6, 0);
        a.mo5653a();
    }

    /* renamed from: a */
    private static void m4131a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            int r5 = r0.f4534c
            r6 = 8
            r7 = 5
            r8 = 80
            r9 = 16
            r10 = 8388615(0x800007, float:1.1754953E-38)
            r11 = 2
            r12 = 1
            if (r5 != r12) goto L_0x00b8
            int r5 = r23.getPaddingLeft()
            int r1 = r27 - r25
            int r3 = r23.getPaddingRight()
            int r3 = r1 - r3
            int r1 = r1 - r5
            int r14 = r23.getPaddingRight()
            int r1 = r1 - r14
            int r14 = r23.getVirtualChildCount()
            int r15 = r0.f4535d
            r15 = r15 & 112(0x70, float:1.57E-43)
            int r13 = r0.f4535d
            r10 = r10 & r13
            if (r15 == r9) goto L_0x0045
            if (r15 == r8) goto L_0x0038
            int r2 = r23.getPaddingTop()
            goto L_0x0050
        L_0x0038:
            int r8 = r23.getPaddingTop()
            int r8 = r8 + r28
            int r8 = r8 - r26
            int r2 = r0.f4536e
            int r2 = r8 - r2
            goto L_0x0050
        L_0x0045:
            int r8 = r23.getPaddingTop()
            int r2 = r28 - r26
            int r4 = r0.f4536e
            int r2 = r2 - r4
            int r2 = r2 / r11
            int r2 = r2 + r8
        L_0x0050:
            r4 = r2
            r2 = 0
        L_0x0052:
            if (r2 >= r14) goto L_0x00b7
            android.view.View r8 = r0.m4133b(r2)
            if (r8 != 0) goto L_0x005d
            int r4 = r4 + 0
            goto L_0x00b2
        L_0x005d:
            int r9 = r8.getVisibility()
            if (r9 == r6) goto L_0x00b2
            int r9 = r8.getMeasuredWidth()
            int r13 = r8.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r8.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r15 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r15
            int r6 = r15.f4548h
            if (r6 >= 0) goto L_0x0076
            r6 = r10
        L_0x0076:
            int r11 = android.support.p030v4.view.C1056u.m3055f(r23)
            int r6 = android.support.p030v4.view.C1039e.m2968a(r6, r11)
            r6 = r6 & 7
            if (r6 == r12) goto L_0x008e
            if (r6 == r7) goto L_0x0088
            int r6 = r15.leftMargin
            int r6 = r6 + r5
            goto L_0x0099
        L_0x0088:
            int r6 = r3 - r9
            int r11 = r15.rightMargin
            int r6 = r6 - r11
            goto L_0x0099
        L_0x008e:
            int r6 = r1 - r9
            r11 = 2
            int r6 = r6 / r11
            int r6 = r6 + r5
            int r11 = r15.leftMargin
            int r6 = r6 + r11
            int r11 = r15.rightMargin
            int r6 = r6 - r11
        L_0x0099:
            boolean r11 = r0.mo4695a(r2)
            if (r11 == 0) goto L_0x00a2
            int r11 = r0.f4544m
            int r4 = r4 + r11
        L_0x00a2:
            int r11 = r15.topMargin
            int r4 = r4 + r11
            int r11 = r4 + 0
            m4131a(r8, r6, r11, r9, r13)
            int r6 = r15.bottomMargin
            int r13 = r13 + r6
            r6 = 0
            int r13 = r13 + r6
            int r4 = r4 + r13
            int r2 = r2 + 0
        L_0x00b2:
            int r2 = r2 + r12
            r6 = 8
            r11 = 2
            goto L_0x0052
        L_0x00b7:
            return
        L_0x00b8:
            boolean r5 = android.support.p043v7.widget.C1467bj.m5138a(r23)
            int r6 = r23.getPaddingTop()
            int r2 = r28 - r26
            int r4 = r23.getPaddingBottom()
            int r4 = r2 - r4
            int r2 = r2 - r6
            int r11 = r23.getPaddingBottom()
            int r2 = r2 - r11
            int r11 = r23.getVirtualChildCount()
            int r13 = r0.f4535d
            r10 = r10 & r13
            int r13 = r0.f4535d
            r13 = r13 & 112(0x70, float:1.57E-43)
            boolean r14 = r0.f4537f
            int[] r15 = r0.f4540i
            int[] r8 = r0.f4541j
            int r9 = android.support.p030v4.view.C1056u.m3055f(r23)
            int r9 = android.support.p030v4.view.C1039e.m2968a(r10, r9)
            if (r9 == r12) goto L_0x00fd
            if (r9 == r7) goto L_0x00f0
            int r1 = r23.getPaddingLeft()
            goto L_0x0109
        L_0x00f0:
            int r7 = r23.getPaddingLeft()
            int r7 = r7 + r27
            int r7 = r7 - r25
            int r1 = r0.f4536e
            int r1 = r7 - r1
            goto L_0x0109
        L_0x00fd:
            int r7 = r23.getPaddingLeft()
            int r1 = r27 - r25
            int r3 = r0.f4536e
            int r1 = r1 - r3
            r3 = 2
            int r1 = r1 / r3
            int r1 = r1 + r7
        L_0x0109:
            if (r5 == 0) goto L_0x010f
            int r5 = r11 + -1
            r7 = -1
            goto L_0x0111
        L_0x010f:
            r5 = 0
            r7 = 1
        L_0x0111:
            r9 = r1
            r1 = 0
        L_0x0113:
            if (r1 >= r11) goto L_0x01df
            int r10 = r7 * r1
            int r10 = r10 + r5
            android.view.View r12 = r0.m4133b(r10)
            if (r12 != 0) goto L_0x012f
            int r9 = r9 + 0
            r18 = r5
            r19 = r7
            r20 = r11
            r21 = r13
            r22 = r14
            r3 = 1
            r5 = 0
            r14 = -1
            goto L_0x01d1
        L_0x012f:
            int r3 = r12.getVisibility()
            r18 = r5
            r5 = 8
            if (r3 == r5) goto L_0x01c6
            int r3 = r12.getMeasuredWidth()
            int r5 = r12.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r12.getLayoutParams()
            r19 = r7
            r7 = r16
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r7 = (android.support.p043v7.widget.LinearLayoutCompat.LayoutParams) r7
            if (r14 == 0) goto L_0x015b
            r20 = r11
            int r11 = r7.height
            r21 = r13
            r13 = -1
            if (r11 == r13) goto L_0x015f
            int r11 = r12.getBaseline()
            goto L_0x0160
        L_0x015b:
            r20 = r11
            r21 = r13
        L_0x015f:
            r11 = -1
        L_0x0160:
            int r13 = r7.f4548h
            if (r13 >= 0) goto L_0x0166
            r13 = r21
        L_0x0166:
            r13 = r13 & 112(0x70, float:1.57E-43)
            r22 = r14
            r14 = 16
            if (r13 == r14) goto L_0x01a0
            r14 = 48
            if (r13 == r14) goto L_0x018f
            r14 = 80
            if (r13 == r14) goto L_0x0179
            r11 = r6
            r14 = -1
            goto L_0x01ac
        L_0x0179:
            int r13 = r4 - r5
            int r14 = r7.bottomMargin
            int r13 = r13 - r14
            r14 = -1
            if (r11 == r14) goto L_0x019e
            int r16 = r12.getMeasuredHeight()
            int r16 = r16 - r11
            r11 = 2
            r17 = r8[r11]
            int r17 = r17 - r16
            int r11 = r13 - r17
            goto L_0x01ac
        L_0x018f:
            r14 = -1
            int r13 = r7.topMargin
            int r13 = r13 + r6
            if (r11 == r14) goto L_0x019e
            r16 = 1
            r17 = r15[r16]
            int r17 = r17 - r11
            int r11 = r13 + r17
            goto L_0x01ac
        L_0x019e:
            r11 = r13
            goto L_0x01ac
        L_0x01a0:
            r14 = -1
            int r11 = r2 - r5
            r13 = 2
            int r11 = r11 / r13
            int r11 = r11 + r6
            int r13 = r7.topMargin
            int r11 = r11 + r13
            int r13 = r7.bottomMargin
            int r11 = r11 - r13
        L_0x01ac:
            boolean r10 = r0.mo4695a(r10)
            if (r10 == 0) goto L_0x01b5
            int r10 = r0.f4543l
            int r9 = r9 + r10
        L_0x01b5:
            int r10 = r7.leftMargin
            int r9 = r9 + r10
            int r10 = r9 + 0
            m4131a(r12, r10, r11, r3, r5)
            int r5 = r7.rightMargin
            int r3 = r3 + r5
            r5 = 0
            int r3 = r3 + r5
            int r9 = r9 + r3
            int r1 = r1 + 0
            goto L_0x01d0
        L_0x01c6:
            r19 = r7
            r20 = r11
            r21 = r13
            r22 = r14
            r5 = 0
            r14 = -1
        L_0x01d0:
            r3 = 1
        L_0x01d1:
            int r1 = r1 + r3
            r5 = r18
            r7 = r19
            r11 = r20
            r13 = r21
            r14 = r22
            r12 = 1
            goto L_0x0113
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: a */
    private void m4132a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }
}
