package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p030v4.content.C0726c;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.account.C22307v;
import com.p683ss.android.ugc.aweme.account.util.C22270l;
import com.p683ss.android.ugc.aweme.account.utils.C22295c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator */
public final class InputWithIndicator extends LinearLayout {

    /* renamed from: c */
    public static final C22185a f59849c = new C22185a(null);

    /* renamed from: a */
    public int f59850a;

    /* renamed from: b */
    public OnClickListener f59851b;

    /* renamed from: d */
    private boolean f59852d;

    /* renamed from: e */
    private ClearButton f59853e;

    /* renamed from: f */
    private ImageView f59854f;

    /* renamed from: g */
    private LoadingCircleView f59855g;

    /* renamed from: h */
    private int f59856h;

    /* renamed from: i */
    private HashMap f59857i;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$a */
    public static final class C22185a {
        private C22185a() {
        }

        public /* synthetic */ C22185a(C52707g gVar) {
            this();
        }
    }

    public InputWithIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public final View mo46282b(int i) {
        if (this.f59857i == null) {
            this.f59857i = new HashMap();
        }
        View view = (View) this.f59857i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f59857i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean getEnableAutoHide() {
        return this.f59852d;
    }

    public final EditText getEditText() {
        DmtEditText dmtEditText = (DmtEditText) mo46282b(R.id.ecw);
        C52711k.m112236a((Object) dmtEditText, "inputWithIndicatorEditText");
        return dmtEditText;
    }

    private final ClearButton getClearButton() {
        if (this.f59853e == null) {
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            ClearButton clearButton = new ClearButton(context, null, 0, 6, null);
            this.f59853e = clearButton;
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            ClearButton clearButton2 = this.f59853e;
            if (clearButton2 == null) {
                C52711k.m112234a();
            }
            clearButton2.setLayoutParams(layoutParams);
        }
        ClearButton clearButton3 = this.f59853e;
        if (clearButton3 == null) {
            C52711k.m112234a();
        }
        return clearButton3;
    }

    private final ImageView getImageView() {
        if (this.f59854f == null) {
            this.f59854f = new ImageView(getContext());
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            ImageView imageView = this.f59854f;
            if (imageView == null) {
                C52711k.m112234a();
            }
            imageView.setLayoutParams(layoutParams);
        }
        ImageView imageView2 = this.f59854f;
        if (imageView2 == null) {
            C52711k.m112234a();
        }
        return imageView2;
    }

    public final String getText() {
        DmtEditText dmtEditText = (DmtEditText) mo46282b(R.id.ecw);
        C52711k.m112236a((Object) dmtEditText, "inputWithIndicatorEditText");
        Editable text = dmtEditText.getText();
        if (text != null) {
            String obj = text.toString();
            if (obj != null) {
                if (obj != null) {
                    String obj2 = C52830p.m112447b(obj).toString();
                    if (obj2 != null) {
                        return obj2;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private final void m54976a() {
        if (this.f59856h <= 0) {
            this.f59856h = C23728o.m58241a(16.0d);
        }
        C22270l.m55122a((FrameLayout) mo46282b(R.id.ecx), this.f59856h, this.f59856h);
        LoadingCircleView loadingCircleView = this.f59855g;
        if (loadingCircleView != null) {
            loadingCircleView.mo46300b();
        }
        switch (this.f59850a) {
            case 1:
                m54977a((View) getClearButton());
                return;
            case 2:
                m54977a((View) getLoadingView());
                return;
            case 3:
                m54978c(R.drawable.cf5);
                break;
        }
    }

    private final LoadingCircleView getLoadingView() {
        if (this.f59855g == null) {
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            LoadingCircleView loadingCircleView = new LoadingCircleView(context, null, 0, 6, null);
            this.f59855g = loadingCircleView;
            LoadingCircleView loadingCircleView2 = this.f59855g;
            if (loadingCircleView2 == null) {
                C52711k.m112234a();
            }
            loadingCircleView2.setLoadingColor(C0726c.m2098c(getContext(), R.color.b0z));
            LoadingCircleView loadingCircleView3 = this.f59855g;
            if (loadingCircleView3 == null) {
                C52711k.m112234a();
            }
            loadingCircleView3.setLineWidth((float) C23728o.m58241a(3.0d));
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            LoadingCircleView loadingCircleView4 = this.f59855g;
            if (loadingCircleView4 == null) {
                C52711k.m112234a();
            }
            loadingCircleView4.setLayoutParams(layoutParams);
        }
        LoadingCircleView loadingCircleView5 = this.f59855g;
        if (loadingCircleView5 == null) {
            C52711k.m112234a();
        }
        loadingCircleView5.mo46299a();
        LoadingCircleView loadingCircleView6 = this.f59855g;
        if (loadingCircleView6 == null) {
            C52711k.m112234a();
        }
        return loadingCircleView6;
    }

    public final void setEnableAutoHide(boolean z) {
        this.f59852d = z;
    }

    public final void setIndicatorSize(int i) {
        this.f59856h = i;
    }

    public final void setIndicatorClickListener(OnClickListener onClickListener) {
        C52711k.m112240b(onClickListener, "listener");
        this.f59851b = onClickListener;
    }

    /* renamed from: c */
    private void m54978c(int i) {
        ImageView imageView = getImageView();
        imageView.setImageResource(R.drawable.cf5);
        m54977a((View) imageView);
    }

    /* renamed from: a */
    public final void mo46281a(int i) {
        if (i != this.f59850a) {
            this.f59850a = i;
            m54976a();
        }
    }

    public final void setContainerPadding(int i) {
        ((FrameLayout) mo46282b(R.id.ecx)).setPadding(i, i, i, i);
    }

    /* renamed from: a */
    private final void m54977a(View view) {
        ((FrameLayout) mo46282b(R.id.ecx)).removeAllViews();
        ((FrameLayout) mo46282b(R.id.ecx)).addView(view);
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        C52711k.m112240b(textWatcher, "watcher");
        ((DmtEditText) mo46282b(R.id.ecw)).addTextChangedListener(textWatcher);
    }

    public final void setIndicatorVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        FrameLayout frameLayout = (FrameLayout) mo46282b(R.id.ecv);
        C52711k.m112236a((Object) frameLayout, "inputWithIndicatorClickContainer");
        frameLayout.setVisibility(i);
        FrameLayout frameLayout2 = (FrameLayout) mo46282b(R.id.ecx);
        C52711k.m112236a((Object) frameLayout2, "inputWithIndicatorViewContainer");
        frameLayout2.setVisibility(i);
    }

    public final void setText(CharSequence charSequence) {
        boolean z;
        C52711k.m112240b(charSequence, "text");
        ((DmtEditText) mo46282b(R.id.ecw)).setText(charSequence);
        if (charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((DmtEditText) mo46282b(R.id.ecw)).setSelection(charSequence.length());
        }
    }

    public InputWithIndicator(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f59852d = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091, 16843104, 16843296, R.attr.acg, R.attr.ach, R.attr.aci, R.attr.acj, R.attr.ack, R.attr.acl});
        this.f59850a = obtainStyledAttributes.getInt(3, 0);
        this.f59856h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        String string = obtainStyledAttributes.getString(6);
        int i2 = obtainStyledAttributes.getInt(0, 1);
        int i3 = obtainStyledAttributes.getInt(1, 0);
        int i4 = obtainStyledAttributes.getInt(2, 1);
        float f = (float) obtainStyledAttributes.getInt(8, 15);
        int color = obtainStyledAttributes.getColor(5, C0726c.m2098c(context, R.color.iw));
        View.inflate(context, R.layout.az9, this);
        int resourceId = obtainStyledAttributes.getResourceId(7, 80);
        if (resourceId != 80) {
            DmtEditText dmtEditText = (DmtEditText) mo46282b(R.id.ecw);
            C52711k.m112236a((Object) dmtEditText, "inputWithIndicatorEditText");
            dmtEditText.setId(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (i3 > 0) {
            C22295c.m55180a((DmtEditText) mo46282b(R.id.ecw), i3);
        }
        DmtEditText dmtEditText2 = (DmtEditText) mo46282b(R.id.ecw);
        C52711k.m112236a((Object) dmtEditText2, "inputWithIndicatorEditText");
        dmtEditText2.setMaxLines(i2);
        DmtEditText dmtEditText3 = (DmtEditText) mo46282b(R.id.ecw);
        C52711k.m112236a((Object) dmtEditText3, "inputWithIndicatorEditText");
        dmtEditText3.setHint(string);
        DmtEditText dmtEditText4 = (DmtEditText) mo46282b(R.id.ecw);
        C52711k.m112236a((Object) dmtEditText4, "inputWithIndicatorEditText");
        dmtEditText4.setTextSize(f);
        if (i4 != 129) {
            DmtEditText dmtEditText5 = (DmtEditText) mo46282b(R.id.ecw);
            C52711k.m112236a((Object) dmtEditText5, "inputWithIndicatorEditText");
            dmtEditText5.setInputType(i4);
        }
        ((DmtEditText) mo46282b(R.id.ecw)).setTextColor(color);
        ((DmtEditText) mo46282b(R.id.ecw)).addTextChangedListener(new C22307v(this) {

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f59858a;

            {
                this.f59858a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                if (this.f59858a.getEnableAutoHide()) {
                    InputWithIndicator inputWithIndicator = this.f59858a;
                    DmtEditText dmtEditText = (DmtEditText) this.f59858a.mo46282b(R.id.ecw);
                    C52711k.m112236a((Object) dmtEditText, "inputWithIndicatorEditText");
                    Editable text = dmtEditText.getText();
                    boolean z = false;
                    if (text != null) {
                        i = text.length();
                    } else {
                        i = 0;
                    }
                    if (i > 0) {
                        DmtEditText dmtEditText2 = (DmtEditText) this.f59858a.mo46282b(R.id.ecw);
                        C52711k.m112236a((Object) dmtEditText2, "inputWithIndicatorEditText");
                        if (dmtEditText2.isFocused()) {
                            z = true;
                        }
                    }
                    inputWithIndicator.setIndicatorVisible(z);
                }
            }
        });
        ((DmtEditText) mo46282b(R.id.ecw)).setOnFocusChangeListener(new OnFocusChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f59859a;

            {
                this.f59859a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                int i;
                InputWithIndicator inputWithIndicator = this.f59859a;
                boolean z2 = false;
                if (z) {
                    DmtEditText dmtEditText = (DmtEditText) this.f59859a.mo46282b(R.id.ecw);
                    C52711k.m112236a((Object) dmtEditText, "inputWithIndicatorEditText");
                    Editable text = dmtEditText.getText();
                    if (text != null) {
                        i = text.length();
                    } else {
                        i = 0;
                    }
                    if (i > 0) {
                        z2 = true;
                    }
                }
                inputWithIndicator.setIndicatorVisible(z2);
            }
        });
        ((FrameLayout) mo46282b(R.id.ecv)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f59860a;

            {
                this.f59860a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f59860a.f59850a == 1) {
                    DmtEditText dmtEditText = (DmtEditText) this.f59860a.mo46282b(R.id.ecw);
                    C52711k.m112236a((Object) dmtEditText, "inputWithIndicatorEditText");
                    dmtEditText.setText(null);
                }
                OnClickListener onClickListener = this.f59860a.f59851b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        });
        if (this.f59850a == 1 && this.f59852d) {
            FrameLayout frameLayout = (FrameLayout) mo46282b(R.id.ecx);
            C52711k.m112236a((Object) frameLayout, "inputWithIndicatorViewContainer");
            frameLayout.setVisibility(8);
        }
        ((DmtEditText) mo46282b(R.id.ecw)).setFontType(C10751d.f28908g);
        m54976a();
    }

    public /* synthetic */ InputWithIndicator(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
