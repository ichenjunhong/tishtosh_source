package com.bytedance.android.live.uikit.menu;

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
import com.bytedance.android.live.uikit.menu.SlidingMenu.C4232d;
import com.bytedance.android.live.uikit.menu.SlidingMenu.C4234f;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.live.uikit.menu.a */
public final class C4235a extends ViewGroup {

    /* renamed from: d */
    private static final Interpolator f11566d = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public C4238b f11567a;

    /* renamed from: b */
    public boolean f11568b;

    /* renamed from: c */
    protected int f11569c;

    /* renamed from: e */
    private View f11570e;

    /* renamed from: f */
    private int f11571f;

    /* renamed from: g */
    private Scroller f11572g;

    /* renamed from: h */
    private boolean f11573h;

    /* renamed from: i */
    private boolean f11574i;

    /* renamed from: j */
    private C4237a f11575j;

    /* renamed from: k */
    private C4232d f11576k;

    /* renamed from: l */
    private C4234f f11577l;

    /* renamed from: m */
    private List<View> f11578m;

    /* renamed from: n */
    private float f11579n;

    /* renamed from: com.bytedance.android.live.uikit.menu.a$a */
    public interface C4237a {
    }

    public final View getContent() {
        return this.f11570e;
    }

    public final int getCurrentItem() {
        return this.f11571f;
    }

    public final int getTouchMode() {
        return this.f11569c;
    }

    public final int getDestScrollX() {
        return m10460b(this.f11571f);
    }

    /* renamed from: c */
    private boolean m10461c() {
        if (this.f11571f <= 0) {
            return false;
        }
        mo9773a(this.f11571f - 1, true);
        return true;
    }

    /* renamed from: d */
    private boolean m10463d() {
        if (this.f11571f > 0) {
            return false;
        }
        mo9773a(this.f11571f + 1, true);
        return true;
    }

    public final int getBehindWidth() {
        if (this.f11567a == null) {
            return 0;
        }
        return this.f11567a.getBehindWidth();
    }

    public final int getContentLeft() {
        return this.f11570e.getLeft() + this.f11570e.getPaddingLeft();
    }

    /* renamed from: a */
    public final boolean mo9776a() {
        if (this.f11571f == 0 || this.f11571f == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final float getPercentOpen() {
        return Math.abs(this.f11579n - ((float) this.f11570e.getLeft())) / ((float) getBehindWidth());
    }

    public final void computeScroll() {
        if (this.f11572g.isFinished() || !this.f11572g.computeScrollOffset()) {
            mo9779b();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f11572g.getCurrX();
        int currY = this.f11572g.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            mo9772a(currX);
        }
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public final int getLeftBound() {
        C4238b bVar = this.f11567a;
        View view = this.f11570e;
        if (bVar.f11584e == 0 || bVar.f11584e == 2) {
            return view.getLeft() - bVar.getBehindWidth();
        }
        if (bVar.f11584e == 1) {
            return view.getLeft();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final int getRightBound() {
        C4238b bVar = this.f11567a;
        View view = this.f11570e;
        if (bVar.f11584e == 0) {
            return view.getLeft();
        }
        if (bVar.f11584e == 1 || bVar.f11584e == 2) {
            return view.getLeft() + bVar.getSecondaryBehindWidth();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo9779b() {
        if (this.f11574i) {
            setScrollingCacheEnabled(false);
            this.f11572g.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f11572g.getCurrX();
            int currY = this.f11572g.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f11574i = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9772a(int i) {
        getWidth();
    }

    public final void setCustomViewBehind(C4238b bVar) {
        this.f11567a = bVar;
    }

    public final void setOnClosedListener(C4232d dVar) {
        this.f11576k = dVar;
    }

    public final void setOnOpenedListener(C4234f fVar) {
        this.f11577l = fVar;
    }

    public final void setOnPageChangeListener(C4237a aVar) {
        this.f11575j = aVar;
    }

    public final void setSlidingEnabled(boolean z) {
        this.f11568b = z;
    }

    public final void setTouchMode(int i) {
        this.f11569c = i;
    }

    public final void setCurrentItem(int i) {
        mo9774a(i, true, false);
    }

    /* access modifiers changed from: 0000 */
    public final void setScrollingCacheEnabled(boolean z) {
        if (this.f11573h != z) {
            this.f11573h = z;
        }
    }

    /* renamed from: b */
    private static float m10459b(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public final void setAboveOffset(int i) {
        View view = this.f11570e;
        view.setPadding(i, view.getPaddingTop(), this.f11570e.getPaddingRight(), this.f11570e.getPaddingBottom());
    }

    public final void setContent(View view) {
        if (this.f11570e != null) {
            removeView(this.f11570e);
        }
        this.f11570e = view;
        addView(this.f11570e);
    }

    /* renamed from: b */
    private int m10460b(int i) {
        switch (i) {
            case 0:
            case 2:
                return this.f11567a.mo9809a(this.f11570e, i);
            case 1:
                return this.f11570e.getLeft();
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
    private boolean m10462c(int r6) {
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
            boolean r1 = r5.m10463d()
            goto L_0x0046
        L_0x0042:
            boolean r1 = r5.m10461c()
        L_0x0046:
            if (r1 == 0) goto L_0x004f
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.menu.C4235a.m10462c(int):boolean");
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
            boolean r5 = r4.m10462c(r5)
            goto L_0x0046
        L_0x0021:
            r5 = 17
            boolean r5 = r4.m10462c(r5)
            goto L_0x0046
        L_0x0028:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r0 < r3) goto L_0x0045
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L_0x003a
            r5 = 2
            boolean r5 = r4.m10462c(r5)
            goto L_0x0046
        L_0x003a:
            boolean r5 = r5.hasModifiers(r1)
            if (r5 == 0) goto L_0x0045
            boolean r5 = r4.m10462c(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.menu.C4235a.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo9777a(float f) {
        if (mo9776a()) {
            C4238b bVar = this.f11567a;
            if (bVar.f11584e == 0) {
                if (f >= 0.0f) {
                    return false;
                }
            } else if (bVar.f11584e == 1) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (bVar.f11584e != 2) {
                return false;
            }
        } else {
            C4238b bVar2 = this.f11567a;
            if (bVar2.f11584e == 0) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (bVar2.f11584e == 1) {
                if (f >= 0.0f) {
                    return false;
                }
            } else if (bVar2.f11584e != 2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo9780b(MotionEvent motionEvent) {
        return this.f11567a.mo9810a(this.f11570e, this.f11571f, motionEvent.getX() + this.f11579n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo9778a(MotionEvent motionEvent) {
        boolean z;
        int x = (int) (motionEvent.getX() + this.f11579n);
        boolean z2 = true;
        if (mo9776a()) {
            C4238b bVar = this.f11567a;
            View view = this.f11570e;
            int i = this.f11571f;
            float f = (float) x;
            switch (bVar.f11580a) {
                case 0:
                    return bVar.mo9810a(view, i, f);
                case 1:
                    return true;
                default:
                    return false;
            }
        } else {
            switch (this.f11569c) {
                case 0:
                    C4238b bVar2 = this.f11567a;
                    View view2 = this.f11570e;
                    int left = view2.getLeft();
                    int right = view2.getRight();
                    if (bVar2.f11584e == 0) {
                        if (x < left || x > bVar2.f11583d + left) {
                            return false;
                        }
                    } else if (bVar2.f11584e == 1) {
                        if (x > right || x < right - bVar2.f11583d) {
                            return false;
                        }
                    } else if (bVar2.f11584e != 2) {
                        z2 = false;
                    } else if ((x < left || x > bVar2.f11583d + left) && (x > right || x < right - bVar2.f11583d)) {
                        return false;
                    }
                    return z2;
                case 1:
                    Rect rect = new Rect();
                    Iterator it = this.f11578m.iterator();
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
        C4238b bVar = this.f11567a;
        View view = this.f11570e;
        if (bVar.f11588i != null && bVar.f11590k > 0) {
            if (bVar.f11584e != 0) {
                if (bVar.f11584e == 1) {
                    i3 = view.getRight();
                } else if (bVar.f11584e != 2) {
                    i3 = 0;
                } else if (bVar.f11589j != null) {
                    int right = view.getRight();
                    bVar.f11589j.setBounds(right, 0, bVar.f11590k + right, bVar.getHeight());
                    bVar.f11589j.draw(canvas);
                }
                bVar.f11588i.setBounds(i3, 0, bVar.f11590k + i3, bVar.getHeight());
                bVar.f11588i.draw(canvas);
            }
            i3 = view.getLeft() - bVar.f11590k;
            bVar.f11588i.setBounds(i3, 0, bVar.f11590k + i3, bVar.getHeight());
            bVar.f11588i.draw(canvas);
        }
        C4238b bVar2 = this.f11567a;
        View view2 = this.f11570e;
        float percentOpen = getPercentOpen();
        if (bVar2.f11585f) {
            bVar2.f11586g.setColor(Color.argb((int) (bVar2.f11591l * 255.0f * Math.abs(1.0f - percentOpen)), 0, 0, 0));
            if (bVar2.f11584e == 0) {
                i = view2.getLeft() - bVar2.getBehindWidth();
                i2 = view2.getLeft();
            } else if (bVar2.f11584e == 1) {
                i = view2.getRight();
                i2 = view2.getRight() + bVar2.getSecondaryBehindWidth();
            } else if (bVar2.f11584e == 2) {
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) (view2.getLeft() - bVar2.getSecondaryBehindWidth()), 0.0f, (float) view2.getLeft(), (float) bVar2.getHeight(), bVar2.f11586g);
                i = view2.getRight();
                i2 = view2.getRight() + bVar2.getSecondaryBehindWidth();
            } else {
                i2 = 0;
                i = 0;
            }
            canvas.drawRect((float) i, 0.0f, (float) i2, (float) bVar2.getHeight(), bVar2.f11586g);
        }
        C4238b bVar3 = this.f11567a;
        View view3 = this.f11570e;
        float percentOpen2 = getPercentOpen();
        if (bVar3.f11592m && bVar3.f11593n != null && bVar3.f11594o != null && ((String) bVar3.f11594o.getTag(R.id.ckw)).equals("CustomViewBehindSelectedView")) {
            canvas.save();
            int width = (int) (((float) bVar3.f11593n.getWidth()) * percentOpen2);
            if (bVar3.f11584e == 0) {
                int left = view3.getLeft();
                int i4 = left - width;
                canvas.clipRect(i4, 0, left, bVar3.getHeight());
                canvas.drawBitmap(bVar3.f11593n, (float) i4, (float) bVar3.getSelectorTop(), null);
            } else if (bVar3.f11584e == 1) {
                int right2 = view3.getRight();
                int i5 = width + right2;
                canvas.clipRect(right2, 0, i5, bVar3.getHeight());
                Bitmap bitmap = bVar3.f11593n;
                canvas.drawBitmap(bitmap, (float) (i5 - bitmap.getWidth()), (float) bVar3.getSelectorTop(), null);
            }
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void mo9773a(int i, boolean z) {
        mo9774a(i, z, false);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        this.f11570e.measure(getChildMeasureSpec(i, 0, defaultSize), getChildMeasureSpec(i2, 0, defaultSize2));
    }

    public final void scrollTo(int i, int i2) {
        int i3;
        int i4;
        super.scrollTo(i, i2);
        this.f11579n = (float) i;
        int i5 = 2;
        boolean z = true;
        if (this.f11568b) {
            C4238b bVar = this.f11567a;
            View view = this.f11570e;
            int i6 = 4;
            if (bVar.f11584e == 0) {
                if (i < view.getLeft()) {
                    i6 = 0;
                }
                bVar.scrollTo((int) (((float) (i + bVar.getBehindWidth())) * bVar.f11587h), i2);
            } else if (bVar.f11584e == 1) {
                if (i > view.getLeft()) {
                    i6 = 0;
                }
                bVar.scrollTo((int) (((float) (bVar.getSecondaryBehindWidth() - bVar.getWidth())) + (((float) (i - bVar.getSecondaryBehindWidth())) * bVar.f11587h)), i2);
            } else if (bVar.f11584e == 2) {
                View view2 = bVar.f11581b;
                if (i >= view.getLeft()) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                view2.setVisibility(i3);
                View view3 = bVar.f11582c;
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
                    bVar.scrollTo((int) (((float) (i + bVar.getBehindWidth())) * bVar.f11587h), i2);
                } else {
                    bVar.scrollTo((int) (((float) (bVar.getSecondaryBehindWidth() - bVar.getWidth())) + (((float) (i - bVar.getSecondaryBehindWidth())) * bVar.f11587h)), i2);
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
                slidingMenu.f11544c.post(new Runnable(i5) {

                    /* renamed from: a */
                    final /* synthetic */ int f11563a;

                    public final void run() {
                        boolean z;
                        StringBuilder sb = new StringBuilder("changing layerType. hardware? ");
                        if (this.f11563a == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb.append(z);
                        SlidingMenu.this.getContent().setLayerType(this.f11563a, null);
                        SlidingMenu.this.getMenu().setLayerType(this.f11563a, null);
                        if (SlidingMenu.this.getSecondaryMenu() != null) {
                            SlidingMenu.this.getSecondaryMenu().setLayerType(this.f11563a, null);
                        }
                    }

                    {
                        this.f11563a = r2;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9774a(int i, boolean z, boolean z2) {
        mo9775a(i, z, z2, 0);
    }

    /* renamed from: a */
    private void m10458a(int i, int i2, int i3) {
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
            mo9779b();
            return;
        }
        setScrollingCacheEnabled(true);
        this.f11574i = true;
        int behindWidth = getBehindWidth();
        float f = (float) (behindWidth / 2);
        float b = f + (m10459b(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / ((float) behindWidth))) * f);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i4 = Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4;
        } else {
            Math.abs(i5);
            i4 = 600;
        }
        this.f11572g.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            mo9779b();
            scrollTo(m10460b(this.f11571f), getScrollY());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9775a(int i, boolean z, boolean z2, int i2) {
        if (z2 || this.f11571f != i) {
            this.f11571f = this.f11567a.mo9808a(i);
            int b = m10460b(this.f11571f);
            if (z) {
                m10458a(b, 0, i2);
                return;
            }
            mo9779b();
            scrollTo(b, 0);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f11570e.layout(0, 0, i3 - i, i4 - i2);
    }
}
