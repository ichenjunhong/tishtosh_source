package com.bytedance.android.live.uikit.menu;

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
import com.bytedance.android.live.uikit.menu.C4235a.C4237a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public final class SlidingMenu extends RelativeLayout {

    /* renamed from: a */
    public C4233e f11542a;

    /* renamed from: b */
    public C4231c f11543b;

    /* renamed from: c */
    Handler f11544c;

    /* renamed from: d */
    protected int f11545d;

    /* renamed from: e */
    protected VelocityTracker f11546e;

    /* renamed from: f */
    protected int f11547f;

    /* renamed from: g */
    private boolean f11548g;

    /* renamed from: h */
    private boolean f11549h;

    /* renamed from: i */
    private C4235a f11550i;

    /* renamed from: j */
    private C4238b f11551j;

    /* renamed from: k */
    private C4230b f11552k;

    /* renamed from: l */
    private boolean f11553l;

    /* renamed from: m */
    private boolean f11554m;

    /* renamed from: n */
    private boolean f11555n;

    /* renamed from: o */
    private int f11556o;

    /* renamed from: p */
    private float f11557p;

    /* renamed from: q */
    private float f11558q;

    /* renamed from: r */
    private float f11559r;

    /* renamed from: s */
    private int f11560s;

    /* renamed from: t */
    private int f11561t;

    /* renamed from: u */
    private boolean f11562u;

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$1 */
    class C42261 implements C4237a {
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C42261) null);
            }
        };

        /* renamed from: a */
        public final int f11565a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f11565a = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, C42261 r2) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f11565a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11565a);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$a */
    public interface C4229a {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$b */
    public interface C4230b {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$c */
    public interface C4231c {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$d */
    public interface C4232d {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$e */
    public interface C4233e {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$f */
    public interface C4234f {
    }

    /* renamed from: a */
    private boolean m10454a() {
        return this.f11550i.mo9776a();
    }

    /* renamed from: b */
    private void m10455b() {
        this.f11553l = true;
        this.f11555n = false;
    }

    public final float getBehindScrollScale() {
        return this.f11551j.getScrollScale();
    }

    public final View getContent() {
        return this.f11550i.getContent();
    }

    public final int getCurrentItem() {
        return this.f11550i.getCurrentItem();
    }

    public final View getMenu() {
        return this.f11551j.getContent();
    }

    public final int getMode() {
        return this.f11551j.getMode();
    }

    public final View getSecondaryMenu() {
        return this.f11551j.getSecondaryContent();
    }

    public final int getTouchModeAbove() {
        return this.f11550i.getTouchMode();
    }

    public final int getBehindOffset() {
        return ((LayoutParams) this.f11551j.getLayoutParams()).rightMargin;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f11550i.getCurrentItem());
    }

    /* renamed from: c */
    private void m10457c() {
        this.f11555n = false;
        this.f11553l = false;
        this.f11554m = false;
        this.f11545d = -1;
        if (this.f11546e != null) {
            this.f11546e.recycle();
            this.f11546e = null;
        }
    }

    public final void setIgnoreContentsBackground(boolean z) {
        this.f11549h = z;
    }

    public final void setOnClickCloseListener(C4230b bVar) {
        this.f11552k = bVar;
    }

    public final void setOnCloseListener(C4231c cVar) {
        this.f11543b = cVar;
    }

    public final void setOnOpenListener(C4233e eVar) {
        this.f11542a = eVar;
    }

    public final void setAboveOffset(int i) {
        this.f11550i.setAboveOffset(i);
    }

    public final void setBehindCanvasTransformer(C4229a aVar) {
        this.f11551j.setCanvasTransformer(aVar);
    }

    public final void setBehindOffset(int i) {
        this.f11551j.setWidthOffset(i);
    }

    public final void setFadeDegree(float f) {
        this.f11551j.setFadeDegree(f);
    }

    public final void setFadeEnabled(boolean z) {
        this.f11551j.setFadeEnabled(z);
    }

    public final void setMenu(View view) {
        this.f11551j.setContent(view);
    }

    public final void setOnClosedListener(C4232d dVar) {
        this.f11550i.setOnClosedListener(dVar);
    }

    public final void setOnOpenedListener(C4234f fVar) {
        this.f11550i.setOnOpenedListener(fVar);
    }

    public final void setRightBehindOffset(int i) {
        this.f11551j.setSecondaryWidthOffset(i);
    }

    public final void setSecondaryMenu(View view) {
        this.f11551j.setSecondaryContent(view);
    }

    public final void setSecondaryShadowDrawable(Drawable drawable) {
        this.f11551j.setSecondaryShadowDrawable(drawable);
    }

    public final void setSelectedView(View view) {
        this.f11551j.setSelectedView(view);
    }

    public final void setSelectorBitmap(Bitmap bitmap) {
        this.f11551j.setSelectorBitmap(bitmap);
    }

    public final void setSelectorEnabled(boolean z) {
        this.f11551j.setSelectorEnabled(true);
    }

    public final void setShadowDrawable(Drawable drawable) {
        this.f11551j.setShadowDrawable(drawable);
    }

    public final void setShadowWidth(int i) {
        this.f11551j.setShadowWidth(i);
    }

    public final void setSlidingEnabled(boolean z) {
        this.f11562u = z;
        this.f11550i.setSlidingEnabled(z);
    }

    public final void setContent(View view) {
        this.f11550i.setContent(view);
        this.f11550i.mo9773a(1, true);
    }

    public final void setSecondaryShadowDrawable(int i) {
        setSecondaryShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public final void setSelectorDrawable(int i) {
        this.f11551j.setSelectorBitmap(BitmapFactory.decodeResource(getResources(), i));
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
        if (!this.f11548g) {
            setPadding(i, i3, i2, i4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f11550i.setCurrentItem(savedState.f11565a);
    }

    public final void setAboveOffsetRes(int i) {
        setAboveOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setBehindOffsetRes(int i) {
        setBehindOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setBehindScrollScale(float f) {
        if (f >= 0.0f || f <= 1.0f) {
            this.f11551j.setScrollScale(f);
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
            this.f11551j.setMode(i);
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
            this.f11550i.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    public final void setTouchModeBehind(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f11551j.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    /* renamed from: b */
    private void m10456b(MotionEvent motionEvent) {
        int i;
        int b = C1044i.m2983b(motionEvent);
        if (C1044i.m2984b(motionEvent, b) == this.f11545d) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f11558q = C1044i.m2985c(motionEvent, i);
            this.f11545d = C1044i.m2984b(motionEvent, i);
            if (this.f11546e != null) {
                this.f11546e.clear();
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
            this.f11550i.setCustomViewBehind(null);
            this.f11550i.setCurrentItem(1);
            return;
        }
        this.f11550i.setCurrentItem(1);
        this.f11550i.setCustomViewBehind(this.f11551j);
        setSlidingEnabled(true);
    }

    /* renamed from: a */
    private void m10453a(MotionEvent motionEvent) {
        int i;
        int i2 = this.f11545d;
        int a = m10452a(motionEvent, i2);
        if (i2 != -1) {
            float c = C1044i.m2985c(motionEvent, a);
            float f = c - this.f11558q;
            float abs = Math.abs(f);
            float d = C1044i.m2986d(motionEvent, a);
            float abs2 = Math.abs(d - this.f11559r);
            if (m10454a()) {
                i = this.f11556o / 2;
            } else {
                i = this.f11556o;
            }
            if (abs <= ((float) i) || abs <= abs2 || !this.f11550i.mo9777a(f)) {
                if (abs > ((float) this.f11556o)) {
                    this.f11554m = true;
                }
                return;
            }
            m10455b();
            this.f11558q = c;
            this.f11559r = d;
            this.f11550i.setScrollingCacheEnabled(true);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f11562u) {
            return false;
        }
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 3 || action == 1 || (action != 0 && this.f11554m)) {
            m10457c();
            return false;
        }
        if (action == 0) {
            int b = C1044i.m2983b(motionEvent);
            this.f11545d = C1044i.m2984b(motionEvent, b);
            if (this.f11545d != -1) {
                float c = C1044i.m2985c(motionEvent, b);
                this.f11557p = c;
                this.f11558q = c;
                this.f11559r = C1044i.m2986d(motionEvent, b);
                if (this.f11550i.mo9778a(motionEvent)) {
                    this.f11553l = false;
                    this.f11554m = false;
                    this.f11555n = false;
                    if (m10454a() && this.f11550i.mo9780b(motionEvent)) {
                        this.f11555n = true;
                    }
                } else {
                    this.f11554m = true;
                }
            }
        } else if (action == 2) {
            m10453a(motionEvent);
        } else if (action == 6) {
            m10456b(motionEvent);
        }
        if (!this.f11553l) {
            if (this.f11546e == null) {
                this.f11546e = VelocityTracker.obtain();
            }
            this.f11546e.addMovement(motionEvent);
        }
        if (this.f11553l || this.f11555n) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f11562u) {
            return false;
        }
        if (!this.f11553l && !this.f11550i.mo9778a(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.f11546e == null) {
            this.f11546e = VelocityTracker.obtain();
        }
        this.f11546e.addMovement(motionEvent);
        switch (action & NormalGiftView.ALPHA_255) {
            case 0:
                this.f11550i.mo9779b();
                this.f11545d = C1044i.m2984b(motionEvent, C1044i.m2983b(motionEvent));
                float x = motionEvent.getX();
                this.f11557p = x;
                this.f11558q = x;
                break;
            case 1:
                if (!this.f11553l) {
                    if (this.f11555n && this.f11550i.mo9780b(motionEvent)) {
                        this.f11550i.setCurrentItem(1);
                        m10457c();
                        break;
                    }
                } else {
                    VelocityTracker velocityTracker = this.f11546e;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f11547f);
                    int a = (int) C1055t.m3015a(velocityTracker, this.f11545d);
                    float scrollX = ((float) (this.f11550i.getScrollX() - this.f11550i.getDestScrollX())) / ((float) this.f11551j.getBehindWidth());
                    int a2 = m10452a(motionEvent, this.f11545d);
                    if (this.f11545d != -1) {
                        int c = (int) (C1044i.m2985c(motionEvent, a2) - this.f11557p);
                        int currentItem = this.f11550i.getCurrentItem();
                        if (Math.abs(c) <= this.f11561t || Math.abs(a) <= this.f11560s) {
                            currentItem = Math.round(((float) currentItem) + scrollX);
                        } else if (a > 0 && c > 0) {
                            currentItem--;
                        } else if (a < 0 && c < 0) {
                            currentItem++;
                        }
                        this.f11550i.mo9775a(currentItem, true, true, a);
                    } else {
                        this.f11550i.mo9775a(this.f11550i.getCurrentItem(), true, true, a);
                    }
                    this.f11545d = -1;
                    m10457c();
                    break;
                }
                break;
            case 2:
                if (!this.f11553l) {
                    m10453a(motionEvent);
                    if (this.f11554m) {
                        return false;
                    }
                }
                if (this.f11553l) {
                    int a3 = m10452a(motionEvent, this.f11545d);
                    if (this.f11545d != -1) {
                        float c2 = C1044i.m2985c(motionEvent, a3);
                        float f = this.f11558q - c2;
                        this.f11558q = c2;
                        float scrollX2 = ((float) this.f11550i.getScrollX()) + f;
                        float leftBound = (float) this.f11550i.getLeftBound();
                        float rightBound = (float) this.f11550i.getRightBound();
                        if (scrollX2 < leftBound) {
                            scrollX2 = leftBound;
                        } else if (scrollX2 > rightBound) {
                            scrollX2 = rightBound;
                        }
                        int i = (int) scrollX2;
                        this.f11558q += scrollX2 - ((float) i);
                        this.f11550i.scrollTo(i, getScrollY());
                        this.f11550i.mo9772a(i);
                        break;
                    }
                }
                break;
            case 3:
                if (this.f11553l) {
                    this.f11550i.mo9774a(this.f11550i.getCurrentItem(), true, true);
                    this.f11545d = -1;
                    m10457c();
                    break;
                }
                break;
            case 5:
                int b = C1044i.m2983b(motionEvent);
                this.f11558q = C1044i.m2985c(motionEvent, b);
                this.f11545d = C1044i.m2984b(motionEvent, b);
                break;
            case 6:
                m10456b(motionEvent);
                int a4 = m10452a(motionEvent, this.f11545d);
                if (this.f11545d != -1) {
                    this.f11558q = C1044i.m2985c(motionEvent, a4);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    private int m10452a(MotionEvent motionEvent, int i) {
        int a = C1044i.m2982a(motionEvent, i);
        if (a == -1) {
            this.f11545d = -1;
        }
        return a;
    }
}
