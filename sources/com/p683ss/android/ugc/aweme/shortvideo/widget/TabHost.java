package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.utils.C23716e;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost */
public class TabHost extends FrameLayout implements OnTouchListener {

    /* renamed from: a */
    public static final String f115281a = "TabHost";

    /* renamed from: b */
    public boolean f115282b;

    /* renamed from: c */
    List<Integer> f115283c;

    /* renamed from: d */
    Scroller f115284d;

    /* renamed from: e */
    public LinearLayout f115285e;

    /* renamed from: f */
    public int f115286f;

    /* renamed from: g */
    public View f115287g;

    /* renamed from: h */
    private int f115288h;

    /* renamed from: i */
    private GestureDetector f115289i;

    /* renamed from: j */
    private C45588b f115290j;

    /* renamed from: k */
    private C45589c f115291k;

    /* renamed from: l */
    private C45587a f115292l;

    /* renamed from: m */
    private float f115293m;

    /* renamed from: n */
    private float f115294n;

    /* renamed from: o */
    private float f115295o;

    /* renamed from: p */
    private float f115296p;

    /* renamed from: q */
    private int f115297q;

    /* renamed from: r */
    private int f115298r;

    /* renamed from: s */
    private int f115299s;

    /* renamed from: t */
    private boolean f115300t;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost$a */
    public interface C45587a {
        /* renamed from: a */
        boolean mo91952a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost$b */
    public interface C45588b {
        /* renamed from: a */
        void mo91953a(int i, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost$c */
    public interface C45589c {
    }

    public int getCurrentIndex() {
        return this.f115288h;
    }

    public int getTabCount() {
        if (this.f115285e == null) {
            return 0;
        }
        return this.f115285e.getChildCount();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f115285e = (LinearLayout) findViewById(R.id.yw);
    }

    public void setOnAnimationRunningLisntener(C45587a aVar) {
        this.f115292l = aVar;
    }

    public void setOnIndexChangedListener(C45588b bVar) {
        this.f115290j = bVar;
    }

    public void setScrollEnabled(boolean z) {
        this.f115282b = z;
    }

    public void setTouchEventWrapper(C45589c cVar) {
        this.f115291k = cVar;
    }

    public TabHost(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final Object mo91934a(int i) {
        if (this.f115285e == null) {
            return null;
        }
        View childAt = this.f115285e.getChildAt(i);
        if (childAt == null) {
            return null;
        }
        return childAt.getTag();
    }

    public TabHost(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo91936b(int i, boolean z) {
        m99294a(this.f115288h, this.f115298r);
        m99294a(i, this.f115297q);
        if (!(this.f115288h == i || this.f115290j == null || !z)) {
            this.f115290j.mo91953a(this.f115288h, i);
        }
        StringBuilder sb = new StringBuilder("the set index is ");
        sb.append(i);
        sb.append(" mCurIndex:");
        sb.append(this.f115288h);
        C47625i.m103103a(sb.toString());
        this.f115288h = i;
        requestLayout();
    }

    /* renamed from: a */
    private void m99294a(int i, int i2) {
        if (this.f115285e != null) {
            View childAt = this.f115285e.getChildAt(i);
            if (childAt != null) {
                int i3 = 0;
                if (childAt instanceof TabItemView) {
                    TabItemView tabItemView = (TabItemView) childAt;
                    tabItemView.setTextColor(i2);
                    int alpha = Color.alpha(i2);
                    Drawable[] compoundDrawables = tabItemView.getTextView().getCompoundDrawables();
                    int length = compoundDrawables.length;
                    while (i3 < length) {
                        Drawable drawable = compoundDrawables[i3];
                        if (drawable != null) {
                            drawable.setAlpha(alpha);
                            i3++;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    textView.setTextColor(i2);
                    int alpha2 = Color.alpha(i2);
                    Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                    int length2 = compoundDrawables2.length;
                    while (i3 < length2) {
                        Drawable drawable2 = compoundDrawables2[i3];
                        if (drawable2 != null) {
                            drawable2.setAlpha(alpha2);
                            i3++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91935a(int i, boolean z) {
        m99294a(this.f115288h, this.f115298r);
        m99294a(i, this.f115297q);
        if (!(this.f115288h == i || this.f115290j == null || !z)) {
            this.f115290j.mo91953a(this.f115288h, i);
        }
        StringBuilder sb = new StringBuilder("withoutAnim the set index is ");
        sb.append(i);
        sb.append(" mCurIndex:");
        sb.append(this.f115288h);
        C47625i.m103103a(sb.toString());
        this.f115288h = i;
        if (!this.f115283c.isEmpty() && i >= 0 && i < this.f115283c.size()) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f115285e.getScrollX(), ((Integer) this.f115283c.get(i)).intValue() - ((Integer) this.f115283c.get(0)).intValue()});
            ofInt.setDuration(150);
            ofInt.addUpdateListener(new C45614k(this));
            ofInt.start();
        }
    }

    /* renamed from: b */
    private void m99295b(int i, int i2) {
        int childCount = this.f115285e.getChildCount();
        this.f115283c.clear();
        int i3 = i;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.f115285e.getChildAt(i4);
            if (childAt != null) {
                if (i4 == 0) {
                    i3 = (i3 + ((i2 - i) / 2)) - (childAt.getWidth() / 2);
                }
                if (childAt instanceof TabItemView) {
                    TabItemView tabItemView = (TabItemView) childAt;
                    this.f115283c.add(Integer.valueOf(tabItemView.getTextView().getPaddingLeft() + i3 + (((tabItemView.getTextView().getWidth() - tabItemView.getTextView().getPaddingLeft()) - tabItemView.getTextView().getPaddingRight()) / 2)));
                } else if (childAt instanceof TextView) {
                    this.f115283c.add(Integer.valueOf((childAt.getWidth() / 2) + i3));
                }
                childAt.layout(i3, childAt.getTop(), childAt.getWidth() + i3, childAt.getBottom());
                i3 += childAt.getWidth();
            }
        }
        StringBuilder sb = new StringBuilder("the xPivots size is ");
        sb.append(childCount);
        sb.append(" mCurIndex:");
        sb.append(this.f115288h);
        C47625i.m103103a(sb.toString());
        int a = C23716e.m58205a(this.f115288h, 0, childCount - 1);
        try {
            this.f115285e.scrollTo(((Integer) this.f115283c.get(a)).intValue() - ((Integer) this.f115283c.get(0)).intValue(), 0);
            if (this.f115288h > a) {
                StringBuilder sb2 = new StringBuilder("mCurIndex is dangerous， modify it !!! safeIndex: ");
                sb2.append(a);
                sb2.append(" mCurIndex:");
                sb2.append(this.f115288h);
                C47625i.m103103a(sb2.toString());
                this.f115288h = a;
            }
        } catch (IndexOutOfBoundsException e) {
            StringBuilder sb3 = new StringBuilder();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = this.f115285e.getChildAt(i5);
                sb3.append("index ");
                sb3.append(i5);
                sb3.append(' ');
                sb3.append(childAt2.getClass());
                sb3.append(' ');
                sb3.append(childAt2.getTag());
                sb3.append(10);
            }
            StringBuilder sb4 = new StringBuilder("Inconsistency detected. children are ");
            sb4.append(sb3);
            throw new IllegalStateException(sb4.toString(), e);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        if (this.f115292l != null && this.f115292l.mo91952a()) {
            return true;
        }
        int i3 = 0;
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f115293m = motionEvent.getX();
            this.f115295o = motionEvent.getY();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f115285e != null) {
                int childCount = this.f115285e.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        this.f115287g = this.f115285e;
                        break;
                    }
                    View childAt = this.f115285e.getChildAt(i4);
                    if (x < ((float) (childAt.getRight() - this.f115285e.getScrollX())) && x > ((float) (childAt.getLeft() - this.f115285e.getScrollX())) && y < ((float) childAt.getBottom()) && y > ((float) childAt.getTop())) {
                        this.f115286f = i4;
                        this.f115287g = childAt;
                        break;
                    }
                    i4++;
                }
            }
        }
        switch (motionEvent.getAction()) {
            case 1:
                this.f115294n = motionEvent.getX();
                this.f115296p = motionEvent.getY();
                if (Math.abs(this.f115294n - this.f115293m) < ((float) (this.f115299s * 2)) || Math.abs(this.f115296p - this.f115295o) > ((float) (C23724k.m58221a(getContext()) / 4))) {
                    mo91935a(this.f115288h, true);
                    break;
                } else {
                    if (C47842ed.m103485a(getContext())) {
                        if (this.f115293m < this.f115294n) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float scrollX = ((float) this.f115285e.getScrollX()) + ((float) ((Integer) this.f115283c.get(0)).intValue());
                        int size = this.f115283c.size();
                        if (z2) {
                            i2 = 0;
                            while (true) {
                                if (i < size) {
                                    if (((float) ((Integer) this.f115283c.get(i)).intValue()) >= scrollX) {
                                        int i5 = i;
                                        i3 = i + 1;
                                        i2 = i5;
                                    }
                                }
                            }
                            mo91935a(i, true);
                            break;
                        } else {
                            i = size - 1;
                            int i6 = 0;
                            while (true) {
                                if (i >= 0) {
                                    if (((float) ((Integer) this.f115283c.get(i)).intValue()) < scrollX) {
                                        int i7 = i;
                                        i--;
                                        i6 = i7;
                                    }
                                }
                            }
                            mo91935a(i, true);
                        }
                    } else {
                        if (this.f115293m < this.f115294n) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float scrollX2 = ((float) this.f115285e.getScrollX()) + ((float) ((Integer) this.f115283c.get(0)).intValue());
                        int size2 = this.f115283c.size();
                        if (z) {
                            int i8 = size2 - 1;
                            int i9 = 0;
                            while (true) {
                                if (i >= 0) {
                                    if (((float) ((Integer) this.f115283c.get(i)).intValue()) >= scrollX2) {
                                        int i10 = i;
                                        i8 = i - 1;
                                        i9 = i10;
                                    }
                                }
                            }
                            mo91935a(i, true);
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i < size2) {
                                    if (((float) ((Integer) this.f115283c.get(i)).intValue()) < scrollX2) {
                                        int i12 = i;
                                        i3 = i + 1;
                                        i11 = i12;
                                    }
                                }
                            }
                            mo91935a(i, true);
                        }
                    }
                    i = i2;
                    mo91935a(i, true);
                }
                break;
            case 2:
                float x2 = motionEvent.getX() - this.f115293m;
                float y2 = motionEvent.getY() - this.f115295o;
                if (Math.abs(x2) > ((float) this.f115299s) && Math.abs(x2) > Math.abs(y2)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
        }
        return this.f115289i.onTouchEvent(motionEvent);
    }

    public TabHost(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f115282b = true;
        this.f115297q = C0726c.m2098c(getContext(), R.color.w2);
        this.f115298r = C0726c.m2098c(getContext(), R.color.vc);
        this.f115300t = false;
        this.f115299s = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f115283c = new ArrayList();
        setOnTouchListener(this);
        this.f115284d = new Scroller(getContext());
        this.f115289i = new GestureDetector(getContext(), new OnGestureListener() {
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            public final void onLongPress(MotionEvent motionEvent) {
            }

            public final void onShowPress(MotionEvent motionEvent) {
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (TabHost.this.equals(TabHost.this.f115287g) || TabHost.this.f115285e.equals(TabHost.this.f115287g)) {
                    return false;
                }
                TabHost.this.mo91935a(TabHost.this.f115286f, true);
                return false;
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (TabHost.this.f115282b && f2 < 20.0f) {
                    TabHost.this.f115284d.fling(TabHost.this.f115284d.getFinalX(), TabHost.this.f115284d.getFinalY(), (int) f2, 0, 500, (int) f, 0, TabHost.this.getHeight());
                }
                return false;
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!TabHost.this.f115282b) {
                    return false;
                }
                if (f2 < 20.0f) {
                    f2 = 20.0f;
                }
                TabHost.this.f115285e.scrollBy((int) ((f * 20.0f) / f2), 0);
                TabHost.this.invalidate();
                return true;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (C47842ed.m103485a(getContext())) {
            int childCount = this.f115285e.getChildCount();
            this.f115283c.clear();
            int i5 = i3;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = this.f115285e.getChildAt(i6);
                if (childAt != null) {
                    if (i6 == 0) {
                        int i7 = i3 - i;
                        i5 = (i5 - (i7 / 2)) + (childAt.getWidth() / 2) + ((this.f115285e.getRight() - this.f115285e.getLeft()) - i7);
                    }
                    this.f115283c.add(Integer.valueOf(i5 - (childAt.getWidth() / 2)));
                    childAt.layout(i5 - childAt.getWidth(), childAt.getTop(), i5, childAt.getBottom());
                    i5 -= childAt.getWidth();
                }
            }
            StringBuilder sb = new StringBuilder("the xPivots size is ");
            sb.append(childCount);
            sb.append(" mCurIndex:");
            sb.append(this.f115288h);
            C47625i.m103103a(sb.toString());
            int a = C23716e.m58205a(this.f115288h, 0, childCount - 1);
            try {
                this.f115285e.scrollTo(((Integer) this.f115283c.get(a)).intValue() - ((Integer) this.f115283c.get(0)).intValue(), 0);
                if (this.f115288h > a) {
                    StringBuilder sb2 = new StringBuilder("mCurIndex is dangerous， modify it !!! safeIndex: ");
                    sb2.append(a);
                    sb2.append(" mCurIndex:");
                    sb2.append(this.f115288h);
                    C47625i.m103103a(sb2.toString());
                    this.f115288h = a;
                }
            } catch (IndexOutOfBoundsException e) {
                StringBuilder sb3 = new StringBuilder();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt2 = this.f115285e.getChildAt(i8);
                    sb3.append("index ");
                    sb3.append(i8);
                    sb3.append(' ');
                    sb3.append(childAt2.getClass());
                    sb3.append(' ');
                    sb3.append(childAt2.getTag());
                    sb3.append(10);
                }
                StringBuilder sb4 = new StringBuilder("Inconsistency detected. children are ");
                sb4.append(sb3);
                throw new IllegalStateException(sb4.toString(), e);
            }
        } else {
            m99295b(i, i3);
        }
    }
}
