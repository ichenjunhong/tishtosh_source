package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1112l;
import android.support.p043v7.view.menu.C1268s;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ListPopupWindow */
public class ListPopupWindow implements C1268s {

    /* renamed from: a */
    private static Method f4588a;

    /* renamed from: b */
    private static Method f4589b;

    /* renamed from: c */
    private static Method f4590c;

    /* renamed from: A */
    private boolean f4591A;

    /* renamed from: B */
    private boolean f4592B;

    /* renamed from: C */
    private boolean f4593C;

    /* renamed from: D */
    private View f4594D;

    /* renamed from: E */
    private DataSetObserver f4595E;

    /* renamed from: F */
    private final C1313d f4596F;

    /* renamed from: G */
    private final C1312c f4597G;

    /* renamed from: H */
    private final C1310a f4598H;

    /* renamed from: I */
    private Runnable f4599I;

    /* renamed from: J */
    private final Rect f4600J;

    /* renamed from: d */
    private Context f4601d;

    /* renamed from: e */
    C1519z f4602e;

    /* renamed from: f */
    public int f4603f;

    /* renamed from: g */
    public int f4604g;

    /* renamed from: h */
    public int f4605h;

    /* renamed from: i */
    public int f4606i;

    /* renamed from: j */
    public int f4607j;

    /* renamed from: k */
    public boolean f4608k;

    /* renamed from: l */
    public boolean f4609l;

    /* renamed from: m */
    public int f4610m;

    /* renamed from: n */
    public int f4611n;

    /* renamed from: o */
    public View f4612o;

    /* renamed from: p */
    public Drawable f4613p;

    /* renamed from: q */
    public OnItemClickListener f4614q;

    /* renamed from: r */
    public OnItemSelectedListener f4615r;

    /* renamed from: s */
    final C1314e f4616s;

    /* renamed from: t */
    final Handler f4617t;

    /* renamed from: u */
    public Rect f4618u;

    /* renamed from: v */
    public boolean f4619v;

    /* renamed from: w */
    public PopupWindow f4620w;

    /* renamed from: x */
    private ListAdapter f4621x;

    /* renamed from: y */
    private int f4622y;

    /* renamed from: z */
    private boolean f4623z;

    /* renamed from: android.support.v7.widget.ListPopupWindow$a */
    class C1310a implements Runnable {
        public final void run() {
            ListPopupWindow.this.mo4780g();
        }

        C1310a() {
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$b */
    class C1311b extends DataSetObserver {
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }

        public final void onChanged() {
            if (ListPopupWindow.this.mo4077e()) {
                ListPopupWindow.this.mo4075d();
            }
        }

        C1311b() {
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$c */
    class C1312c implements OnScrollListener {
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        C1312c() {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.mo4781h() && ListPopupWindow.this.f4620w.getContentView() != null) {
                ListPopupWindow.this.f4617t.removeCallbacks(ListPopupWindow.this.f4616s);
                ListPopupWindow.this.f4616s.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$d */
    class C1313d implements OnTouchListener {
        C1313d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.f4620w != null && ListPopupWindow.this.f4620w.isShowing() && x >= 0 && x < ListPopupWindow.this.f4620w.getWidth() && y >= 0 && y < ListPopupWindow.this.f4620w.getHeight()) {
                ListPopupWindow.this.f4617t.postDelayed(ListPopupWindow.this.f4616s, 250);
            } else if (action == 1) {
                ListPopupWindow.this.f4617t.removeCallbacks(ListPopupWindow.this.f4616s);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$e */
    class C1314e implements Runnable {
        public final void run() {
            if (ListPopupWindow.this.f4602e != null && C1056u.m3018B(ListPopupWindow.this.f4602e) && ListPopupWindow.this.f4602e.getCount() > ListPopupWindow.this.f4602e.getChildCount() && ListPopupWindow.this.f4602e.getChildCount() <= ListPopupWindow.this.f4610m) {
                ListPopupWindow.this.f4620w.setInputMethodMode(2);
                ListPopupWindow.this.mo4075d();
            }
        }

        C1314e() {
        }
    }

    /* renamed from: f */
    public final ListView mo4078f() {
        return this.f4602e;
    }

    /* renamed from: b */
    public final Drawable mo4773b() {
        return this.f4620w.getBackground();
    }

    /* renamed from: e */
    public final boolean mo4077e() {
        return this.f4620w.isShowing();
    }

    /* renamed from: c */
    public final int mo4776c() {
        if (!this.f4623z) {
            return 0;
        }
        return this.f4622y;
    }

    /* renamed from: g */
    public final void mo4780g() {
        C1519z zVar = this.f4602e;
        if (zVar != null) {
            zVar.setListSelectionHidden(true);
            zVar.requestLayout();
        }
    }

    /* renamed from: h */
    public final boolean mo4781h() {
        if (this.f4620w.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    static {
        try {
            f4588a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
        }
        try {
            f4589b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
        }
        try {
            f4590c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
        }
    }

    public void dismiss() {
        this.f4620w.dismiss();
        if (this.f4594D != null) {
            ViewParent parent = this.f4594D.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f4594D);
            }
        }
        this.f4620w.setContentView(null);
        this.f4602e = null;
        this.f4617t.removeCallbacks(this.f4616s);
    }

    /* renamed from: d */
    public void mo4075d() {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int makeMeasureSpec;
        View view;
        int i10;
        int i11;
        boolean z3 = true;
        if (this.f4602e == null) {
            Context context = this.f4601d;
            this.f4599I = new Runnable() {
                public final void run() {
                    View view = ListPopupWindow.this.f4612o;
                    if (view != null && view.getWindowToken() != null) {
                        ListPopupWindow.this.mo4075d();
                    }
                }
            };
            this.f4602e = mo4768a(context, !this.f4619v);
            if (this.f4613p != null) {
                this.f4602e.setSelector(this.f4613p);
            }
            this.f4602e.setAdapter(this.f4621x);
            this.f4602e.setOnItemClickListener(this.f4614q);
            this.f4602e.setFocusable(true);
            this.f4602e.setFocusableInTouchMode(true);
            this.f4602e.setOnItemSelectedListener(new OnItemSelectedListener() {
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (i != -1) {
                        C1519z zVar = ListPopupWindow.this.f4602e;
                        if (zVar != null) {
                            zVar.setListSelectionHidden(false);
                        }
                    }
                }
            });
            this.f4602e.setOnScrollListener(this.f4597G);
            if (this.f4615r != null) {
                this.f4602e.setOnItemSelectedListener(this.f4615r);
            }
            View view2 = this.f4602e;
            View view3 = this.f4594D;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
                switch (this.f4611n) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams);
                        linearLayout.addView(view3);
                        break;
                }
                if (this.f4604g >= 0) {
                    i11 = this.f4604g;
                    i10 = DynamicTabYellowPointVersion.DEFAULT;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i11, i10), 0);
                LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
                view = view2;
            }
            this.f4620w.setContentView(view);
        } else {
            this.f4620w.getContentView();
            View view4 = this.f4594D;
            if (view4 != null) {
                LayoutParams layoutParams3 = (LayoutParams) view4.getLayoutParams();
                i = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f4620w.getBackground();
        if (background != null) {
            background.getPadding(this.f4600J);
            i2 = this.f4600J.top + this.f4600J.bottom;
            if (!this.f4623z) {
                this.f4622y = -this.f4600J.top;
            }
        } else {
            this.f4600J.setEmpty();
            i2 = 0;
        }
        if (this.f4620w.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        int a = m4222a(this.f4612o, this.f4622y, z);
        if (this.f4608k || this.f4603f == -1) {
            i3 = a + i2;
        } else {
            switch (this.f4604g) {
                case -2:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f4601d.getResources().getDisplayMetrics().widthPixels - (this.f4600J.left + this.f4600J.right), DynamicTabYellowPointVersion.DEFAULT);
                    break;
                case -1:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f4601d.getResources().getDisplayMetrics().widthPixels - (this.f4600J.left + this.f4600J.right), 1073741824);
                    break;
                default:
                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f4604g, 1073741824);
                    break;
            }
            int a2 = this.f4602e.mo5502a(makeMeasureSpec, 0, -1, a - i, -1);
            if (a2 > 0) {
                i += i2 + this.f4602e.getPaddingTop() + this.f4602e.getPaddingBottom();
            }
            i3 = a2 + i;
        }
        boolean h = mo4781h();
        C1112l.m3246a(this.f4620w, this.f4606i);
        if (!this.f4620w.isShowing()) {
            if (this.f4604g == -1) {
                i4 = -1;
            } else if (this.f4604g == -2) {
                i4 = this.f4612o.getWidth();
            } else {
                i4 = this.f4604g;
            }
            if (this.f4603f == -1) {
                i3 = -1;
            } else if (this.f4603f != -2) {
                i3 = this.f4603f;
            }
            this.f4620w.setWidth(i4);
            this.f4620w.setHeight(i3);
            if (f4588a != null) {
                try {
                    f4588a.invoke(this.f4620w, new Object[]{Boolean.valueOf(true)});
                } catch (Exception unused) {
                }
            }
            PopupWindow popupWindow = this.f4620w;
            if (this.f4609l || this.f4608k) {
                z2 = false;
            } else {
                z2 = true;
            }
            popupWindow.setOutsideTouchable(z2);
            this.f4620w.setTouchInterceptor(this.f4596F);
            if (this.f4593C) {
                C1112l.m3248a(this.f4620w, this.f4592B);
            }
            if (f4590c != null) {
                try {
                    f4590c.invoke(this.f4620w, new Object[]{this.f4618u});
                } catch (Exception unused2) {
                }
            }
            C1112l.m3247a(this.f4620w, this.f4612o, this.f4605h, this.f4622y, this.f4607j);
            this.f4602e.setSelection(-1);
            if (!this.f4619v || this.f4602e.isInTouchMode()) {
                mo4780g();
            }
            if (!this.f4619v) {
                this.f4617t.post(this.f4598H);
            }
        } else if (C1056u.m3018B(this.f4612o)) {
            if (this.f4604g == -1) {
                i5 = -1;
            } else if (this.f4604g == -2) {
                i5 = this.f4612o.getWidth();
            } else {
                i5 = this.f4604g;
            }
            if (this.f4603f == -1) {
                if (!h) {
                    i3 = -1;
                }
                if (h) {
                    PopupWindow popupWindow2 = this.f4620w;
                    if (this.f4604g == -1) {
                        i9 = -1;
                    } else {
                        i9 = 0;
                    }
                    popupWindow2.setWidth(i9);
                    this.f4620w.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.f4620w;
                    if (this.f4604g == -1) {
                        i8 = -1;
                    } else {
                        i8 = 0;
                    }
                    popupWindow3.setWidth(i8);
                    this.f4620w.setHeight(-1);
                }
            } else if (this.f4603f != -2) {
                i3 = this.f4603f;
            }
            PopupWindow popupWindow4 = this.f4620w;
            if (this.f4609l || this.f4608k) {
                z3 = false;
            }
            popupWindow4.setOutsideTouchable(z3);
            PopupWindow popupWindow5 = this.f4620w;
            View view5 = this.f4612o;
            int i12 = this.f4605h;
            int i13 = this.f4622y;
            if (i5 < 0) {
                i6 = -1;
            } else {
                i6 = i5;
            }
            if (i3 < 0) {
                i7 = -1;
            } else {
                i7 = i3;
            }
            popupWindow5.update(view5, i12, i13, i6, i7);
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.st);
    }

    /* renamed from: d */
    public final void mo4778d(int i) {
        this.f4620w.setInputMethodMode(2);
    }

    /* renamed from: a */
    public final void mo4769a(int i) {
        this.f4622y = i;
        this.f4623z = true;
    }

    /* renamed from: b */
    public final void mo4775b(boolean z) {
        this.f4593C = true;
        this.f4592B = true;
    }

    /* renamed from: a */
    public final void mo4770a(Drawable drawable) {
        this.f4620w.setBackgroundDrawable(drawable);
    }

    /* renamed from: b */
    public final void mo4774b(int i) {
        Drawable background = this.f4620w.getBackground();
        if (background != null) {
            background.getPadding(this.f4600J);
            this.f4604g = this.f4600J.left + this.f4600J.right + i;
            return;
        }
        this.f4604g = i;
    }

    /* renamed from: c */
    public final void mo4777c(int i) {
        if (i >= 0 || -2 == i || -1 == i) {
            this.f4603f = i;
            return;
        }
        throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }

    /* renamed from: e */
    public final void mo4779e(int i) {
        C1519z zVar = this.f4602e;
        if (mo4077e() && zVar != null) {
            zVar.setListSelectionHidden(false);
            zVar.setSelection(i);
            if (zVar.getChoiceMode() != 0) {
                zVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: a */
    public void mo4588a(ListAdapter listAdapter) {
        if (this.f4595E == null) {
            this.f4595E = new C1311b();
        } else if (this.f4621x != null) {
            this.f4621x.unregisterDataSetObserver(this.f4595E);
        }
        this.f4621x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4595E);
        }
        if (this.f4602e != null) {
            this.f4602e.setAdapter(this.f4621x);
        }
    }

    /* renamed from: a */
    public final void mo4771a(OnDismissListener onDismissListener) {
        this.f4620w.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public final void mo4772a(boolean z) {
        this.f4619v = true;
        this.f4620w.setFocusable(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1519z mo4768a(Context context, boolean z) {
        return new C1519z(context, z);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private int m4222a(View view, int i, boolean z) {
        if (f4589b != null) {
            try {
                return ((Integer) f4589b.invoke(this.f4620w, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f4620w.getMaxAvailableHeight(view, i);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4603f = -2;
        this.f4604g = -2;
        this.f4606i = BaseNotice.CHECK_PROFILE;
        this.f4591A = true;
        this.f4610m = Integer.MAX_VALUE;
        this.f4616s = new C1314e();
        this.f4596F = new C1313d();
        this.f4597G = new C1312c();
        this.f4598H = new C1310a();
        this.f4600J = new Rect();
        this.f4601d = context;
        this.f4617t = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843436, 16843437}, i, i2);
        this.f4605h = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f4622y = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        if (this.f4622y != 0) {
            this.f4623z = true;
        }
        obtainStyledAttributes.recycle();
        this.f4620w = new C1488j(context, attributeSet, i, i2);
        this.f4620w.setInputMethodMode(1);
    }
}
