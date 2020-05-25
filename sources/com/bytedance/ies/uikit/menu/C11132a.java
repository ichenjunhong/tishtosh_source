package com.bytedance.ies.uikit.menu;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.bytedance.ies.uikit.menu.SlidingMenu.C11129d;
import com.bytedance.ies.uikit.menu.SlidingMenu.C11131f;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ies.uikit.menu.a */
public final class C11132a extends ViewGroup {

    /* renamed from: d */
    private static final Interpolator f29992d = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public C11135b f29993a;

    /* renamed from: b */
    public boolean f29994b;

    /* renamed from: c */
    protected int f29995c;

    /* renamed from: e */
    private View f29996e;

    /* renamed from: f */
    private int f29997f;

    /* renamed from: g */
    private Scroller f29998g;

    /* renamed from: h */
    private boolean f29999h;

    /* renamed from: i */
    private boolean f30000i;

    /* renamed from: j */
    private C11134a f30001j;

    /* renamed from: k */
    private C11129d f30002k;

    /* renamed from: l */
    private C11131f f30003l;

    /* renamed from: m */
    private List<View> f30004m;

    /* renamed from: n */
    private float f30005n;

    /* renamed from: com.bytedance.ies.uikit.menu.a$a */
    public interface C11134a {
    }

    public final View getContent() {
        return this.f29996e;
    }

    public final int getCurrentItem() {
        return this.f29997f;
    }

    public final int getTouchMode() {
        return this.f29995c;
    }

    public final int getDestScrollX() {
        return m22523b(this.f29997f);
    }

    /* renamed from: c */
    private boolean m22524c() {
        if (this.f29997f <= 0) {
            return false;
        }
        mo20283a(this.f29997f - 1, true);
        return true;
    }

    /* renamed from: d */
    private boolean m22526d() {
        if (this.f29997f > 0) {
            return false;
        }
        mo20283a(this.f29997f + 1, true);
        return true;
    }

    public final int getBehindWidth() {
        if (this.f29993a == null) {
            return 0;
        }
        return this.f29993a.getBehindWidth();
    }

    public final int getContentLeft() {
        return this.f29996e.getLeft() + this.f29996e.getPaddingLeft();
    }

    /* renamed from: a */
    public final boolean mo20286a() {
        if (this.f29997f == 0 || this.f29997f == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final float getPercentOpen() {
        return Math.abs(this.f30005n - ((float) this.f29996e.getLeft())) / ((float) getBehindWidth());
    }

    public final void computeScroll() {
        if (this.f29998g.isFinished() || !this.f29998g.computeScrollOffset()) {
            mo20289b();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f29998g.getCurrX();
        int currY = this.f29998g.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            mo20282a(currX);
        }
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public final int getLeftBound() {
        C11135b bVar = this.f29993a;
        View view = this.f29996e;
        if (bVar.f30010e == 0 || bVar.f30010e == 2) {
            return view.getLeft() - bVar.getBehindWidth();
        }
        if (bVar.f30010e == 1) {
            return view.getLeft();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final int getRightBound() {
        C11135b bVar = this.f29993a;
        View view = this.f29996e;
        if (bVar.f30010e == 0) {
            return view.getLeft();
        }
        if (bVar.f30010e == 1 || bVar.f30010e == 2) {
            return view.getLeft() + bVar.getSecondaryBehindWidth();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo20289b() {
        if (this.f30000i) {
            setScrollingCacheEnabled(false);
            this.f29998g.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f29998g.getCurrX();
            int currY = this.f29998g.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f30000i = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20282a(int i) {
        getWidth();
    }

    public final void setCustomViewBehind(C11135b bVar) {
        this.f29993a = bVar;
    }

    public final void setOnClosedListener(C11129d dVar) {
        this.f30002k = dVar;
    }

    public final void setOnOpenedListener(C11131f fVar) {
        this.f30003l = fVar;
    }

    public final void setOnPageChangeListener(C11134a aVar) {
        this.f30001j = aVar;
    }

    public final void setSlidingEnabled(boolean z) {
        this.f29994b = z;
    }

    public final void setTouchMode(int i) {
        this.f29995c = i;
    }

    public final void setCurrentItem(int i) {
        mo20284a(i, true, false);
    }

    /* access modifiers changed from: 0000 */
    public final void setScrollingCacheEnabled(boolean z) {
        if (this.f29999h != z) {
            this.f29999h = z;
        }
    }

    /* renamed from: b */
    private static float m22522b(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public final void setAboveOffset(int i) {
        View view = this.f29996e;
        view.setPadding(i, view.getPaddingTop(), this.f29996e.getPaddingRight(), this.f29996e.getPaddingBottom());
    }

    public final void setContent(View view) {
        if (this.f29996e != null) {
            removeView(this.f29996e);
        }
        this.f29996e = view;
        addView(this.f29996e);
    }

    /* renamed from: b */
    private int m22523b(int i) {
        switch (i) {
            case 0:
            case 2:
                return this.f29993a.mo20319a(this.f29996e, i);
            case 1:
                return this.f29996e.getLeft();
            default:
                return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r6 != 2) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22525c(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            if (r0 != r5) goto L_0x0007
            r0 = 0
        L_0x0007:
            r1 = 0
            android.view.FocusFinder r2 = android.view.FocusFinder.getInstance()
            android.view.View r2 = r2.findNextFocus(r5, r0, r6)
            r3 = 66
            r4 = 17
            if (r2 == 0) goto L_0x0032
            if (r2 == r0) goto L_0x0032
            if (r6 != r4) goto L_0x001f
            boolean r1 = r2.requestFocus()
            goto L_0x0046
        L_0x001f:
            if (r6 != r3) goto L_0x0046
            if (r0 == 0) goto L_0x002d
            int r1 = r2.getLeft()
            int r0 = r0.getLeft()
            if (r1 <= r0) goto L_0x003d
        L_0x002d:
            boolean r1 = r2.requestFocus()
            goto L_0x0046
        L_0x0032:
            if (r6 == r4) goto L_0x0042
            r0 = 1
            if (r6 != r0) goto L_0x0038
            goto L_0x0042
        L_0x0038:
            if (r6 == r3) goto L_0x003d
            r0 = 2
            if (r6 != r0) goto L_0x0046
        L_0x003d:
            boolean r1 = r5.m22526d()
            goto L_0x0046
        L_0x0042:
            boolean r1 = r5.m22524c()
        L_0x0046:
            if (r1 == 0) goto L_0x004f
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.menu.C11132a.m22525c(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.dispatchKeyEvent(r5)
            r1 = 1
            if (r0 != 0) goto L_0x004a
            int r0 = r5.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0045
            int r0 = r5.getKeyCode()
            r3 = 61
            if (r0 == r3) goto L_0x0028
            switch(r0) {
                case 21: goto L_0x0021;
                case 22: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0045
        L_0x001a:
            r5 = 66
            boolean r5 = r4.m22525c(r5)
            goto L_0x0046
        L_0x0021:
            r5 = 17
            boolean r5 = r4.m22525c(r5)
            goto L_0x0046
        L_0x0028:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r0 < r3) goto L_0x0045
            boolean r0 = android.support.v4.view.KeyEventCompat.hasNoModifiers(r5)
            if (r0 == 0) goto L_0x003a
            r5 = 2
            boolean r5 = r4.m22525c(r5)
            goto L_0x0046
        L_0x003a:
            boolean r5 = android.support.v4.view.KeyEventCompat.hasModifiers(r5, r1)
            if (r5 == 0) goto L_0x0045
            boolean r5 = r4.m22525c(r1)
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            if (r5 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            return r2
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.menu.C11132a.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo20287a(float f) {
        if (mo20286a()) {
            C11135b bVar = this.f29993a;
            if (bVar.f30010e == 0) {
                if (f >= 0.0f) {
                    return false;
                }
            } else if (bVar.f30010e == 1) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (bVar.f30010e != 2) {
                return false;
            }
        } else {
            C11135b bVar2 = this.f29993a;
            if (bVar2.f30010e == 0) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (bVar2.f30010e == 1) {
                if (f >= 0.0f) {
                    return false;
                }
            } else if (bVar2.f30010e != 2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo20290b(MotionEvent motionEvent) {
        return this.f29993a.mo20320a(this.f29996e, this.f29997f, motionEvent.getX() + this.f30005n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo20288a(MotionEvent motionEvent) {
        boolean z;
        int x = (int) (motionEvent.getX() + this.f30005n);
        boolean z2 = true;
        if (mo20286a()) {
            C11135b bVar = this.f29993a;
            View view = this.f29996e;
            int i = this.f29997f;
            float f = (float) x;
            switch (bVar.f30006a) {
                case 0:
                    return bVar.mo20320a(view, i, f);
                case 1:
                    return true;
                default:
                    return false;
            }
        } else {
            switch (this.f29995c) {
                case 0:
                    C11135b bVar2 = this.f29993a;
                    View view2 = this.f29996e;
                    int left = view2.getLeft();
                    int right = view2.getRight();
                    if (bVar2.f30010e == 0) {
                        if (x < left || x > bVar2.f30009d + left) {
                            return false;
                        }
                    } else if (bVar2.f30010e == 1) {
                        if (x > right || x < right - bVar2.f30009d) {
                            return false;
                        }
                    } else if (bVar2.f30010e != 2) {
                        z2 = false;
                    } else if ((x < left || x > bVar2.f30009d + left) && (x > right || x < right - bVar2.f30009d)) {
                        return false;
                    }
                    return z2;
                case 1:
                    Rect rect = new Rect();
                    Iterator it = this.f30004m.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ((View) it.next()).getHitRect(rect);
                            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (!z) {
                        return true;
                    }
                    return false;
                case 2:
                    return false;
                default:
                    return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.dispatchDraw(canvas);
        C11135b bVar = this.f29993a;
        View view = this.f29996e;
        if (bVar.f30014i != null && bVar.f30016k > 0) {
            if (bVar.f30010e != 0) {
                if (bVar.f30010e == 1) {
                    i3 = view.getRight();
                } else if (bVar.f30010e != 2) {
                    i3 = 0;
                } else if (bVar.f30015j != null) {
                    int right = view.getRight();
                    bVar.f30015j.setBounds(right, 0, bVar.f30016k + right, bVar.getHeight());
                    bVar.f30015j.draw(canvas);
                }
                bVar.f30014i.setBounds(i3, 0, bVar.f30016k + i3, bVar.getHeight());
                bVar.f30014i.draw(canvas);
            }
            i3 = view.getLeft() - bVar.f30016k;
            bVar.f30014i.setBounds(i3, 0, bVar.f30016k + i3, bVar.getHeight());
            bVar.f30014i.draw(canvas);
        }
        C11135b bVar2 = this.f29993a;
        View view2 = this.f29996e;
        float percentOpen = getPercentOpen();
        if (bVar2.f30011f) {
            bVar2.f30012g.setColor(Color.argb((int) (bVar2.f30017l * 255.0f * Math.abs(1.0f - percentOpen)), 0, 0, 0));
            if (bVar2.f30010e == 0) {
                i = view2.getLeft() - bVar2.getBehindWidth();
                i2 = view2.getLeft();
            } else if (bVar2.f30010e == 1) {
                i = view2.getRight();
                i2 = view2.getRight() + bVar2.getSecondaryBehindWidth();
            } else if (bVar2.f30010e == 2) {
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) (view2.getLeft() - bVar2.getSecondaryBehindWidth()), 0.0f, (float) view2.getLeft(), (float) bVar2.getHeight(), bVar2.f30012g);
                i = view2.getRight();
                i2 = view2.getRight() + bVar2.getSecondaryBehindWidth();
            } else {
                i2 = 0;
                i = 0;
            }
            canvas.drawRect((float) i, 0.0f, (float) i2, (float) bVar2.getHeight(), bVar2.f30012g);
        }
        C11135b bVar3 = this.f29993a;
        View view3 = this.f29996e;
        float percentOpen2 = getPercentOpen();
        if (bVar3.f30018m && bVar3.f30019n != null && bVar3.f30020o != null && ((String) bVar3.f30020o.getTag(R.id.ckw)).equals("CustomViewBehindSelectedView")) {
            canvas.save();
            int width = (int) (((float) bVar3.f30019n.getWidth()) * percentOpen2);
            if (bVar3.f30010e == 0) {
                int left = view3.getLeft();
                int i4 = left - width;
                canvas.clipRect(i4, 0, left, bVar3.getHeight());
                canvas.drawBitmap(bVar3.f30019n, (float) i4, (float) bVar3.getSelectorTop(), null);
            } else if (bVar3.f30010e == 1) {
                int right2 = view3.getRight();
                int i5 = width + right2;
                canvas.clipRect(right2, 0, i5, bVar3.getHeight());
                Bitmap bitmap = bVar3.f30019n;
                canvas.drawBitmap(bitmap, (float) (i5 - bitmap.getWidth()), (float) bVar3.getSelectorTop(), null);
            }
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void mo20283a(int i, boolean z) {
        mo20284a(i, z, false);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        this.f29996e.measure(getChildMeasureSpec(i, 0, defaultSize), getChildMeasureSpec(i2, 0, defaultSize2));
    }

    public final void scrollTo(int i, int i2) {
        int i3;
        int i4;
        super.scrollTo(i, i2);
        this.f30005n = (float) i;
        int i5 = 2;
        boolean z = true;
        if (this.f29994b) {
            C11135b bVar = this.f29993a;
            View view = this.f29996e;
            int i6 = 4;
            if (bVar.f30010e == 0) {
                if (i < view.getLeft()) {
                    i6 = 0;
                }
                bVar.scrollTo((int) (((float) (i + bVar.getBehindWidth())) * bVar.f30013h), i2);
            } else if (bVar.f30010e == 1) {
                if (i > view.getLeft()) {
                    i6 = 0;
                }
                bVar.scrollTo((int) (((float) (bVar.getSecondaryBehindWidth() - bVar.getWidth())) + (((float) (i - bVar.getSecondaryBehindWidth())) * bVar.f30013h)), i2);
            } else if (bVar.f30010e == 2) {
                View view2 = bVar.f30007b;
                if (i >= view.getLeft()) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                view2.setVisibility(i3);
                View view3 = bVar.f30008c;
                if (i <= view.getLeft()) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                view3.setVisibility(i4);
                if (i != 0) {
                    i6 = 0;
                }
                if (i <= view.getLeft()) {
                    bVar.scrollTo((int) (((float) (i + bVar.getBehindWidth())) * bVar.f30013h), i2);
                } else {
                    bVar.scrollTo((int) (((float) (bVar.getSecondaryBehindWidth() - bVar.getWidth())) + (((float) (i - bVar.getSecondaryBehindWidth())) * bVar.f30013h)), i2);
                }
            } else {
                i6 = 0;
            }
            bVar.setVisibility(i6);
        }
        SlidingMenu slidingMenu = (SlidingMenu) getParent();
        float percentOpen = getPercentOpen();
        if (VERSION.SDK_INT >= 11) {
            if (percentOpen <= 0.0f || percentOpen >= 1.0f) {
                z = false;
            }
            if (!z) {
                i5 = 0;
            }
            if (i5 != slidingMenu.getContent().getLayerType()) {
                slidingMenu.f29970c.post(new Runnable(i5) {

                    /* renamed from: a */
                    final /* synthetic */ int f29989a;

                    public final void run() {
                        boolean z;
                        StringBuilder sb = new StringBuilder("changing layerType. hardware? ");
                        if (this.f29989a == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb.append(z);
                        SlidingMenu.this.getContent().setLayerType(this.f29989a, null);
                        SlidingMenu.this.getMenu().setLayerType(this.f29989a, null);
                        if (SlidingMenu.this.getSecondaryMenu() != null) {
                            SlidingMenu.this.getSecondaryMenu().setLayerType(this.f29989a, null);
                        }
                    }

                    {
                        this.f29989a = r2;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20284a(int i, boolean z, boolean z2) {
        mo20285a(i, z, z2, 0);
    }

    /* renamed from: a */
    private void m22521a(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i5 = i - scrollX;
        int i6 = 0 - scrollY;
        if (i5 == 0 && i6 == 0) {
            mo20289b();
            return;
        }
        setScrollingCacheEnabled(true);
        this.f30000i = true;
        int behindWidth = getBehindWidth();
        float f = (float) (behindWidth / 2);
        float b = f + (m22522b(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / ((float) behindWidth))) * f);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i4 = Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4;
        } else {
            Math.abs(i5);
            i4 = 600;
        }
        this.f29998g.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            mo20289b();
            scrollTo(m22523b(this.f29997f), getScrollY());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20285a(int i, boolean z, boolean z2, int i2) {
        if (z2 || this.f29997f != i) {
            this.f29997f = this.f29993a.mo20318a(i);
            int b = m22523b(this.f29997f);
            if (z) {
                m22521a(b, 0, i2);
                return;
            }
            mo20289b();
            scrollTo(b, 0);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f29996e.layout(0, 0, i3 - i, i4 - i2);
    }
}
