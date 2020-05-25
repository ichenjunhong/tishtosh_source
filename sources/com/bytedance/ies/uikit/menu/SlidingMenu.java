package com.bytedance.ies.uikit.menu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.view.C1044i;
import android.support.p030v4.view.C1055t;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.uikit.menu.C11132a.C11134a;

public final class SlidingMenu extends RelativeLayout {

    /* renamed from: a */
    public C11130e f29968a;

    /* renamed from: b */
    public C11128c f29969b;

    /* renamed from: c */
    Handler f29970c;

    /* renamed from: d */
    protected int f29971d;

    /* renamed from: e */
    protected VelocityTracker f29972e;

    /* renamed from: f */
    protected int f29973f;

    /* renamed from: g */
    private boolean f29974g;

    /* renamed from: h */
    private boolean f29975h;

    /* renamed from: i */
    private C11132a f29976i;

    /* renamed from: j */
    private C11135b f29977j;

    /* renamed from: k */
    private C11127b f29978k;

    /* renamed from: l */
    private boolean f29979l;

    /* renamed from: m */
    private boolean f29980m;

    /* renamed from: n */
    private boolean f29981n;

    /* renamed from: o */
    private int f29982o;

    /* renamed from: p */
    private float f29983p;

    /* renamed from: q */
    private float f29984q;

    /* renamed from: r */
    private float f29985r;

    /* renamed from: s */
    private int f29986s;

    /* renamed from: t */
    private int f29987t;

    /* renamed from: u */
    private boolean f29988u;

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$1 */
    class C111231 implements C11134a {
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C111231) null);
            }
        };

        /* renamed from: a */
        public final int f29991a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f29991a = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, C111231 r2) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f29991a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f29991a);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$a */
    public interface C11126a {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$b */
    public interface C11127b {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$c */
    public interface C11128c {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$d */
    public interface C11129d {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$e */
    public interface C11130e {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$f */
    public interface C11131f {
    }

    /* renamed from: a */
    private boolean m22517a() {
        return this.f29976i.mo20286a();
    }

    /* renamed from: b */
    private void m22518b() {
        this.f29979l = true;
        this.f29981n = false;
    }

    public final float getBehindScrollScale() {
        return this.f29977j.getScrollScale();
    }

    public final View getContent() {
        return this.f29976i.getContent();
    }

    public final int getCurrentItem() {
        return this.f29976i.getCurrentItem();
    }

    public final View getMenu() {
        return this.f29977j.getContent();
    }

    public final int getMode() {
        return this.f29977j.getMode();
    }

    public final View getSecondaryMenu() {
        return this.f29977j.getSecondaryContent();
    }

    public final int getTouchModeAbove() {
        return this.f29976i.getTouchMode();
    }

    public final int getBehindOffset() {
        return ((LayoutParams) this.f29977j.getLayoutParams()).rightMargin;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f29976i.getCurrentItem());
    }

    /* renamed from: c */
    private void m22520c() {
        this.f29981n = false;
        this.f29979l = false;
        this.f29980m = false;
        this.f29971d = -1;
        if (this.f29972e != null) {
            this.f29972e.recycle();
            this.f29972e = null;
        }
    }

    public final void setIgnoreContentsBackground(boolean z) {
        this.f29975h = z;
    }

    public final void setOnClickCloseListener(C11127b bVar) {
        this.f29978k = bVar;
    }

    public final void setOnCloseListener(C11128c cVar) {
        this.f29969b = cVar;
    }

    public final void setOnOpenListener(C11130e eVar) {
        this.f29968a = eVar;
    }

    public final void setAboveOffset(int i) {
        this.f29976i.setAboveOffset(i);
    }

    public final void setBehindCanvasTransformer(C11126a aVar) {
        this.f29977j.setCanvasTransformer(aVar);
    }

    public final void setBehindOffset(int i) {
        this.f29977j.setWidthOffset(i);
    }

    public final void setFadeDegree(float f) {
        this.f29977j.setFadeDegree(f);
    }

    public final void setFadeEnabled(boolean z) {
        this.f29977j.setFadeEnabled(z);
    }

    public final void setMenu(View view) {
        this.f29977j.setContent(view);
    }

    public final void setOnClosedListener(C11129d dVar) {
        this.f29976i.setOnClosedListener(dVar);
    }

    public final void setOnOpenedListener(C11131f fVar) {
        this.f29976i.setOnOpenedListener(fVar);
    }

    public final void setRightBehindOffset(int i) {
        this.f29977j.setSecondaryWidthOffset(i);
    }

    public final void setSecondaryMenu(View view) {
        this.f29977j.setSecondaryContent(view);
    }

    public final void setSecondaryShadowDrawable(Drawable drawable) {
        this.f29977j.setSecondaryShadowDrawable(drawable);
    }

    public final void setSelectedView(View view) {
        this.f29977j.setSelectedView(view);
    }

    public final void setSelectorBitmap(Bitmap bitmap) {
        this.f29977j.setSelectorBitmap(bitmap);
    }

    public final void setSelectorEnabled(boolean z) {
        this.f29977j.setSelectorEnabled(true);
    }

    public final void setShadowDrawable(Drawable drawable) {
        this.f29977j.setShadowDrawable(drawable);
    }

    public final void setShadowWidth(int i) {
        this.f29977j.setShadowWidth(i);
    }

    public final void setSlidingEnabled(boolean z) {
        this.f29988u = z;
        this.f29976i.setSlidingEnabled(z);
    }

    public final void setContent(View view) {
        this.f29976i.setContent(view);
        this.f29976i.mo20283a(1, true);
    }

    public final void setSecondaryShadowDrawable(int i) {
        setSecondaryShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public final void setSelectorDrawable(int i) {
        this.f29977j.setSelectorBitmap(BitmapFactory.decodeResource(getResources(), i));
    }

    public final void setShadowDrawable(int i) {
        setShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public final void setShadowWidthRes(int i) {
        setShadowWidth((int) getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        int i = rect.left;
        int i2 = rect.right;
        int i3 = rect.top;
        int i4 = rect.bottom;
        if (!this.f29974g) {
            setPadding(i, i3, i2, i4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f29976i.setCurrentItem(savedState.f29991a);
    }

    public final void setAboveOffsetRes(int i) {
        setAboveOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setBehindOffsetRes(int i) {
        setBehindOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setBehindScrollScale(float f) {
        if (f >= 0.0f || f <= 1.0f) {
            this.f29977j.setScrollScale(f);
            return;
        }
        throw new IllegalStateException("ScrollScale must be between 0 and 1");
    }

    public final void setBehindWidthRes(int i) {
        setBehindWidth((int) getContext().getResources().getDimension(i));
    }

    public final void setContent(int i) {
        setContent(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public final void setMenu(int i) {
        setMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public final void setMode(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.f29977j.setMode(i);
            return;
        }
        throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
    }

    public final void setRightBehindOffsetRes(int i) {
        setRightBehindOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setSecondaryMenu(int i) {
        setSecondaryMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public final void setTouchModeAbove(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f29976i.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    public final void setTouchModeBehind(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f29977j.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    /* renamed from: b */
    private void m22519b(MotionEvent motionEvent) {
        int i;
        int b = C1044i.m2983b(motionEvent);
        if (C1044i.m2984b(motionEvent, b) == this.f29971d) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f29984q = C1044i.m2985c(motionEvent, i);
            this.f29971d = C1044i.m2984b(motionEvent, i);
            if (this.f29972e != null) {
                this.f29972e.clear();
            }
        }
    }

    public final void setBehindWidth(int i) {
        int i2;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Class<Display> cls = Display.class;
        try {
            Class[] clsArr = {Point.class};
            Point point = new Point();
            cls.getMethod("getSize", clsArr).invoke(defaultDisplay, new Object[]{point});
            i2 = point.x;
        } catch (Exception unused) {
            i2 = defaultDisplay.getWidth();
        }
        setBehindOffset(i2 - i);
    }

    public final void setStatic(boolean z) {
        if (z) {
            setSlidingEnabled(false);
            this.f29976i.setCustomViewBehind(null);
            this.f29976i.setCurrentItem(1);
            return;
        }
        this.f29976i.setCurrentItem(1);
        this.f29976i.setCustomViewBehind(this.f29977j);
        setSlidingEnabled(true);
    }

    /* renamed from: a */
    private void m22516a(MotionEvent motionEvent) {
        int i;
        int i2 = this.f29971d;
        int a = m22515a(motionEvent, i2);
        if (i2 != -1) {
            float c = C1044i.m2985c(motionEvent, a);
            float f = c - this.f29984q;
            float abs = Math.abs(f);
            float d = C1044i.m2986d(motionEvent, a);
            float abs2 = Math.abs(d - this.f29985r);
            if (m22517a()) {
                i = this.f29982o / 2;
            } else {
                i = this.f29982o;
            }
            if (abs <= ((float) i) || abs <= abs2 || !this.f29976i.mo20287a(f)) {
                if (abs > ((float) this.f29982o)) {
                    this.f29980m = true;
                }
                return;
            }
            m22518b();
            this.f29984q = c;
            this.f29985r = d;
            this.f29976i.setScrollingCacheEnabled(true);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f29988u) {
            return false;
        }
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 3 || action == 1 || (action != 0 && this.f29980m)) {
            m22520c();
            return false;
        }
        if (action == 0) {
            int b = C1044i.m2983b(motionEvent);
            this.f29971d = C1044i.m2984b(motionEvent, b);
            if (this.f29971d != -1) {
                float c = C1044i.m2985c(motionEvent, b);
                this.f29983p = c;
                this.f29984q = c;
                this.f29985r = C1044i.m2986d(motionEvent, b);
                if (this.f29976i.mo20288a(motionEvent)) {
                    this.f29979l = false;
                    this.f29980m = false;
                    this.f29981n = false;
                    if (m22517a() && this.f29976i.mo20290b(motionEvent)) {
                        this.f29981n = true;
                    }
                } else {
                    this.f29980m = true;
                }
            }
        } else if (action == 2) {
            m22516a(motionEvent);
        } else if (action == 6) {
            m22519b(motionEvent);
        }
        if (!this.f29979l) {
            if (this.f29972e == null) {
                this.f29972e = VelocityTracker.obtain();
            }
            this.f29972e.addMovement(motionEvent);
        }
        if (this.f29979l || this.f29981n) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29988u) {
            return false;
        }
        if (!this.f29979l && !this.f29976i.mo20288a(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.f29972e == null) {
            this.f29972e = VelocityTracker.obtain();
        }
        this.f29972e.addMovement(motionEvent);
        switch (action & NormalGiftView.ALPHA_255) {
            case 0:
                this.f29976i.mo20289b();
                this.f29971d = C1044i.m2984b(motionEvent, C1044i.m2983b(motionEvent));
                float x = motionEvent.getX();
                this.f29983p = x;
                this.f29984q = x;
                break;
            case 1:
                if (!this.f29979l) {
                    if (this.f29981n && this.f29976i.mo20290b(motionEvent)) {
                        this.f29976i.setCurrentItem(1);
                        m22520c();
                        break;
                    }
                } else {
                    VelocityTracker velocityTracker = this.f29972e;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f29973f);
                    int a = (int) C1055t.m3015a(velocityTracker, this.f29971d);
                    float scrollX = ((float) (this.f29976i.getScrollX() - this.f29976i.getDestScrollX())) / ((float) this.f29977j.getBehindWidth());
                    int a2 = m22515a(motionEvent, this.f29971d);
                    if (this.f29971d != -1) {
                        int c = (int) (C1044i.m2985c(motionEvent, a2) - this.f29983p);
                        int currentItem = this.f29976i.getCurrentItem();
                        if (Math.abs(c) <= this.f29987t || Math.abs(a) <= this.f29986s) {
                            currentItem = Math.round(((float) currentItem) + scrollX);
                        } else if (a > 0 && c > 0) {
                            currentItem--;
                        } else if (a < 0 && c < 0) {
                            currentItem++;
                        }
                        this.f29976i.mo20285a(currentItem, true, true, a);
                    } else {
                        this.f29976i.mo20285a(this.f29976i.getCurrentItem(), true, true, a);
                    }
                    this.f29971d = -1;
                    m22520c();
                    break;
                }
                break;
            case 2:
                if (!this.f29979l) {
                    m22516a(motionEvent);
                    if (this.f29980m) {
                        return false;
                    }
                }
                if (this.f29979l) {
                    int a3 = m22515a(motionEvent, this.f29971d);
                    if (this.f29971d != -1) {
                        float c2 = C1044i.m2985c(motionEvent, a3);
                        float f = this.f29984q - c2;
                        this.f29984q = c2;
                        float scrollX2 = ((float) this.f29976i.getScrollX()) + f;
                        float leftBound = (float) this.f29976i.getLeftBound();
                        float rightBound = (float) this.f29976i.getRightBound();
                        if (scrollX2 < leftBound) {
                            scrollX2 = leftBound;
                        } else if (scrollX2 > rightBound) {
                            scrollX2 = rightBound;
                        }
                        int i = (int) scrollX2;
                        this.f29984q += scrollX2 - ((float) i);
                        this.f29976i.scrollTo(i, getScrollY());
                        this.f29976i.mo20282a(i);
                        break;
                    }
                }
                break;
            case 3:
                if (this.f29979l) {
                    this.f29976i.mo20284a(this.f29976i.getCurrentItem(), true, true);
                    this.f29971d = -1;
                    m22520c();
                    break;
                }
                break;
            case 5:
                int b = C1044i.m2983b(motionEvent);
                this.f29984q = C1044i.m2985c(motionEvent, b);
                this.f29971d = C1044i.m2984b(motionEvent, b);
                break;
            case 6:
                m22519b(motionEvent);
                int a4 = m22515a(motionEvent, this.f29971d);
                if (this.f29971d != -1) {
                    this.f29984q = C1044i.m2985c(motionEvent, a4);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    private int m22515a(MotionEvent motionEvent, int i) {
        int a = C1044i.m2982a(motionEvent, i);
        if (a == -1) {
            this.f29971d = -1;
        }
        return a;
    }
}
