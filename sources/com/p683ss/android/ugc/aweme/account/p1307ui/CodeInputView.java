package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Rect;
import android.support.p030v4.content.C0726c;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.p683ss.android.ugc.aweme.account.utils.C22295c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView */
public final class CodeInputView extends DmtEditText implements TextWatcher {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59821a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CodeInputView.class), "linePaint", "getLinePaint()Landroid/graphics/Paint;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CodeInputView.class), "cursorPaint", "getCursorPaint()Landroid/graphics/Paint;"))};

    /* renamed from: c */
    public static final C22175b f59822c = new C22175b(null);

    /* renamed from: b */
    public OnClickListener f59823b;

    /* renamed from: d */
    private boolean f59824d;

    /* renamed from: e */
    private boolean f59825e;

    /* renamed from: f */
    private int f59826f;

    /* renamed from: g */
    private float f59827g;

    /* renamed from: h */
    private float f59828h;

    /* renamed from: i */
    private float f59829i;

    /* renamed from: j */
    private Integer f59830j;

    /* renamed from: k */
    private int f59831k;

    /* renamed from: l */
    private int f59832l;

    /* renamed from: m */
    private int f59833m;

    /* renamed from: n */
    private int f59834n;

    /* renamed from: o */
    private int f59835o;

    /* renamed from: p */
    private int f59836p;

    /* renamed from: q */
    private int f59837q;

    /* renamed from: r */
    private int f59838r;

    /* renamed from: s */
    private int f59839s;

    /* renamed from: t */
    private final C52668f f59840t;

    /* renamed from: u */
    private final C52668f f59841u;

    /* renamed from: v */
    private Rect f59842v;

    /* renamed from: w */
    private C22174a f59843w;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$a */
    public interface C22174a {
        /* renamed from: a */
        void mo45688a(String str);

        /* renamed from: b */
        void mo45690b(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$b */
    public static final class C22175b {
        private C22175b() {
        }

        public /* synthetic */ C22175b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$c */
    static final class C22176c extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        public static final C22176c f59844a = new C22176c();

        C22176c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Paint();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$d */
    public static final class C22177d implements Callback {
        C22177d() {
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$e */
    static final class C22178e extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        public static final C22178e f59845a = new C22178e();

        C22178e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Paint();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.CodeInputView$f */
    static final class C22179f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CodeInputView f59846a;

        C22179f(CodeInputView codeInputView) {
            this.f59846a = codeInputView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            CodeInputView codeInputView = this.f59846a;
            Editable text = this.f59846a.getText();
            if (text == null) {
                C52711k.m112234a();
            }
            codeInputView.setSelection(text.length());
            OnClickListener onClickListener = this.f59846a.f59823b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public CodeInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Paint getCursorPaint() {
        return (Paint) this.f59841u.getValue();
    }

    private final Paint getLinePaint() {
        return (Paint) this.f59840t.getValue();
    }

    public final C22174a getCallback() {
        return this.f59843w;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: a */
    public final void mo46260a() {
        super.setOnClickListener(new C22179f(this));
    }

    /* renamed from: b */
    public final void mo46262b() {
        super.setCustomSelectionActionModeCallback(new C22177d());
    }

    /* renamed from: c */
    public final void mo46264c() {
        getLinePaint().setColor(this.f59834n);
        invalidate();
    }

    /* renamed from: d */
    public final void mo46265d() {
        getLinePaint().setColor(this.f59832l);
        invalidate();
    }

    public final void setCallback(C22174a aVar) {
        this.f59843w = aVar;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f59823b = onClickListener;
    }

    public final void setTextAndAutoCheck(CharSequence charSequence) {
        this.f59824d = true;
        setText(charSequence);
        this.f59824d = false;
    }

    public final void setInputLength(int i) {
        if (i > 0) {
            this.f59838r = 0;
            this.f59837q = i;
            C22295c.m55180a(this, i);
            invalidate();
        }
    }

    public final void afterTextChanged(Editable editable) {
        int i;
        if (this.f59843w != null) {
            boolean z = false;
            if (editable != null) {
                i = editable.length();
            } else {
                i = 0;
            }
            if (this.f59826f > 0 && i >= 0 && this.f59826f > i) {
                C22174a aVar = this.f59843w;
                if (aVar != null) {
                    aVar.mo45690b(String.valueOf(editable));
                }
            }
            if (this.f59825e || this.f59824d) {
                z = true;
            }
            if (z && i > 0 && i == this.f59837q) {
                C22174a aVar2 = this.f59843w;
                if (aVar2 != null) {
                    String valueOf = String.valueOf(editable);
                    if (valueOf != null) {
                        String obj = C52830p.m112447b(valueOf).toString();
                        if (obj != null) {
                            String lowerCase = obj.toLowerCase();
                            C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                            aVar2.mo45688a(lowerCase);
                            return;
                        }
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            int r2 = android.support.p030v4.view.C1056u.m3061i(r1)
            int r3 = android.support.p030v4.view.C1056u.m3063j(r1)
            int r1 = android.support.p030v4.view.C1056u.m3055f(r1)
            r8 = 0
            r9 = 1
            if (r1 != r9) goto L_0x0017
            r10 = 1
            goto L_0x0018
        L_0x0017:
            r10 = 0
        L_0x0018:
            int r1 = r0.f59838r
            if (r1 != 0) goto L_0x003a
            int r1 = r18.getWidth()
            int r1 = r1 - r2
            int r1 = r1 - r3
            int r3 = r0.f59836p
            if (r3 >= 0) goto L_0x002d
            int r3 = r0.f59837q
            int r3 = r3 * 2
            int r3 = r3 - r9
            int r1 = r1 / r3
            goto L_0x0038
        L_0x002d:
            int r3 = r0.f59836p
            int r4 = r0.f59837q
            int r4 = r4 - r9
            int r3 = r3 * r4
            int r1 = r1 - r3
            int r3 = r0.f59837q
            int r1 = r1 / r3
        L_0x0038:
            r0.f59838r = r1
        L_0x003a:
            float r1 = r0.f59827g
            r11 = 0
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0074
            android.text.Editable r1 = r18.getText()
            if (r1 == 0) goto L_0x0074
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r1 != r9) goto L_0x0074
            android.text.Editable r1 = r18.getText()
            if (r1 != 0) goto L_0x005d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005d:
            int r1 = r1.length()
            float[] r3 = new float[r1]
            android.text.TextPaint r4 = r18.getPaint()
            android.text.Editable r5 = r18.getText()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.getTextWidths(r5, r8, r1, r3)
            r1 = r3[r8]
            r0.f59827g = r1
        L_0x0074:
            android.graphics.Rect r1 = r0.f59842v
            if (r1 != 0) goto L_0x00ed
            android.text.Editable r1 = r18.getText()
            if (r1 == 0) goto L_0x00ed
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0088
            r1 = 1
            goto L_0x0089
        L_0x0088:
            r1 = 0
        L_0x0089:
            if (r1 != r9) goto L_0x00ed
            android.text.Editable r1 = r18.getText()
            java.lang.String r3 = "0"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r0.f59842v = r3
            android.text.TextPaint r3 = r18.getPaint()
            android.text.Editable r4 = r18.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            android.text.Editable r5 = r18.getText()
            if (r5 != 0) goto L_0x00b2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b2:
            int r5 = r5.length()
            android.graphics.Rect r6 = r0.f59842v
            r3.getTextBounds(r4, r8, r5, r6)
            android.graphics.Rect r3 = r0.f59842v
            r4 = 0
            if (r3 == 0) goto L_0x00c7
            int r3 = r3.bottom
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00c8
        L_0x00c7:
            r3 = r4
        L_0x00c8:
            if (r3 != 0) goto L_0x00cd
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00cd:
            int r3 = r3.intValue()
            android.graphics.Rect r5 = r0.f59842v
            if (r5 == 0) goto L_0x00db
            int r4 = r5.top
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x00db:
            if (r4 != 0) goto L_0x00e0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00e0:
            int r4 = r4.intValue()
            int r3 = r3 - r4
            float r3 = (float) r3
            r0.f59828h = r3
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x00ed:
            if (r10 == 0) goto L_0x00f8
            int r1 = r18.getWidth()
            int r1 = r1 - r2
            int r2 = r0.f59838r
            int r2 = r1 - r2
        L_0x00f8:
            float r1 = (float) r2
            int r2 = r18.getHeight()
            int r3 = r18.getPaddingBottom()
            int r2 = r2 - r3
            float r12 = (float) r2
            int r13 = r0.f59837q
            r15 = r1
            r14 = 0
        L_0x0107:
            if (r14 >= r13) goto L_0x0202
            if (r19 == 0) goto L_0x011c
            int r1 = r0.f59838r
            float r1 = (float) r1
            float r4 = r15 + r1
            android.graphics.Paint r6 = r18.getLinePaint()
            r1 = r19
            r2 = r15
            r3 = r12
            r5 = r12
            r1.drawLine(r2, r3, r4, r5, r6)
        L_0x011c:
            int r1 = r0.f59838r
            int r1 = r1 / 2
            float r1 = (float) r1
            float r16 = r15 + r1
            android.text.Editable r1 = r18.getText()
            if (r1 != 0) goto L_0x012c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x012c:
            int r1 = r1.length()
            r17 = 1073741824(0x40000000, float:2.0)
            if (r1 <= r14) goto L_0x0181
            if (r1 <= r9) goto L_0x015e
            if (r10 == 0) goto L_0x015e
            android.text.Editable r1 = r18.getText()
            if (r1 != 0) goto L_0x0141
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0141:
            java.lang.String r2 = "text!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "$this$reversed"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r1 = r2.reverse()
            java.lang.String r2 = "StringBuilder(this).reverse()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0164
        L_0x015e:
            android.text.Editable r1 = r18.getText()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x0164:
            r2 = r1
            if (r19 == 0) goto L_0x0181
            int r4 = r14 + 1
            float r1 = r0.f59827g
            float r1 = r1 / r17
            float r5 = r16 - r1
            int r1 = r0.f59839s
            float r1 = (float) r1
            float r6 = r12 - r1
            android.text.TextPaint r1 = r18.getPaint()
            r7 = r1
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            r1 = r19
            r3 = r14
            r1.drawText(r2, r3, r4, r5, r6, r7)
        L_0x0181:
            int r1 = r0.f59837q
            int r1 = r1 - r9
            if (r14 != r1) goto L_0x0199
            android.text.Editable r1 = r18.getText()
            if (r1 != 0) goto L_0x018f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x018f:
            int r1 = r1.length()
            int r2 = r0.f59837q
            if (r1 != r2) goto L_0x0199
            r1 = 1
            goto L_0x019a
        L_0x0199:
            r1 = 0
        L_0x019a:
            boolean r2 = r18.isFocused()
            if (r2 == 0) goto L_0x01e5
            int r2 = r18.getSelectionStart()
            int r3 = r18.getSelectionEnd()
            if (r2 != r3) goto L_0x01e5
            int r2 = r18.getSelectionStart()
            if (r14 == r2) goto L_0x01b2
            if (r1 == 0) goto L_0x01e5
        L_0x01b2:
            int r2 = r0.f59839s
            float r2 = (float) r2
            float r2 = r12 - r2
            float r3 = r0.f59828h
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            float r3 = r3 * r4
            if (r1 == 0) goto L_0x01cc
            float r1 = r0.f59827g
            float r1 = r1 / r17
            float r4 = r0.f59827g
            r5 = 1048576000(0x3e800000, float:0.25)
            float r4 = r4 * r5
            float r1 = r1 + r4
            goto L_0x01cd
        L_0x01cc:
            r1 = 0
        L_0x01cd:
            float r4 = r0.f59828h
            float r4 = r2 - r4
            float r4 = r4 - r3
            float r5 = r2 + r3
            if (r19 == 0) goto L_0x01e5
            float r6 = r16 + r1
            android.graphics.Paint r7 = r18.getCursorPaint()
            r1 = r19
            r2 = r6
            r3 = r4
            r4 = r6
            r6 = r7
            r1.drawLine(r2, r3, r4, r5, r6)
        L_0x01e5:
            if (r10 == 0) goto L_0x01e9
            r1 = -1
            goto L_0x01ea
        L_0x01e9:
            r1 = 1
        L_0x01ea:
            int r2 = r0.f59836p
            if (r2 >= 0) goto L_0x01f5
            int r2 = r0.f59838r
            int r1 = r1 * r2
            int r1 = r1 * 2
            goto L_0x01fc
        L_0x01f5:
            int r2 = r0.f59838r
            int r3 = r0.f59836p
            int r2 = r2 + r3
            int r1 = r1 * r2
        L_0x01fc:
            float r1 = (float) r1
            float r15 = r15 + r1
            int r14 = r14 + 1
            goto L_0x0107
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1307ui.CodeInputView.onDraw(android.graphics.Canvas):void");
    }

    public CodeInputView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Integer num;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f59830j = Integer.valueOf(17170444);
        this.f59840t = C52732g.m112285a(C22178e.f59845a);
        this.f59841u = C52732g.m112285a(C22176c.f59844a);
        setBackgroundResource(0);
        if (attributeSet != null) {
            i2 = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
        } else {
            i2 = 4;
        }
        this.f59837q = i2;
        if (attributeSet != null) {
            num = Integer.valueOf(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", 17170444));
        } else {
            num = null;
        }
        this.f59830j = num;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.j5, R.attr.j7, R.attr.kx, R.attr.mn, R.attr.sf, R.attr.sg, R.attr.sh});
        this.f59832l = obtainStyledAttributes.getColor(4, -16777216);
        this.f59833m = obtainStyledAttributes.getColor(0, -65536);
        this.f59834n = obtainStyledAttributes.getColor(2, -65536);
        this.f59831k = obtainStyledAttributes.getDimensionPixelSize(1, C23728o.m58241a(2.0d));
        this.f59835o = obtainStyledAttributes.getDimensionPixelSize(5, C23728o.m58241a(1.0d));
        this.f59836p = obtainStyledAttributes.getDimensionPixelSize(3, C23728o.m58241a(10.0d));
        this.f59839s = obtainStyledAttributes.getDimensionPixelSize(6, C23728o.m58241a(5.0d));
        obtainStyledAttributes.recycle();
        TextPaint paint = getPaint();
        C52711k.m112236a((Object) paint, "paint");
        Integer num2 = this.f59830j;
        if (num2 == null) {
            C52711k.m112234a();
        }
        paint.setColor(C0726c.m2098c(context, num2.intValue()));
        getLinePaint().setColor(this.f59832l);
        getLinePaint().setStrokeWidth((float) this.f59835o);
        getLinePaint().setAntiAlias(true);
        getCursorPaint().setColor(this.f59833m);
        getCursorPaint().setStrokeWidth((float) this.f59831k);
        getCursorPaint().setAntiAlias(true);
        getCursorPaint().setStrokeCap(Cap.ROUND);
        this.f59829i = getCursorPaint().getStrokeWidth() / 2.0f;
        setCursorVisible(false);
        addTextChangedListener(this);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 0;
        }
        this.f59826f = i4;
        boolean z = true;
        if (i3 > 1) {
            z = false;
        }
        this.f59825e = z;
    }

    public /* synthetic */ CodeInputView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = R.attr.k8;
        }
        this(context, attributeSet, i);
    }
}
