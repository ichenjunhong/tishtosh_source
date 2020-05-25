package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView */
public final class NoticeButtonView extends LinearLayout implements OnClickListener, C10682e {

    /* renamed from: a */
    public static final C40403a f103108a = new C40403a(null);

    /* renamed from: b */
    private C40404b f103109b;

    /* renamed from: c */
    private int f103110c;

    /* renamed from: d */
    private final Context f103111d;

    /* renamed from: e */
    private final AttributeSet f103112e;

    /* renamed from: f */
    private final int f103113f;

    /* renamed from: g */
    private HashMap f103114g;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView$a */
    public static final class C40403a {
        private C40403a() {
        }

        public /* synthetic */ C40403a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView$b */
    public interface C40404b {
        /* renamed from: a */
        void mo82657a();

        /* renamed from: b */
        void mo82658b();
    }

    /* renamed from: b */
    private View m89781b(int i) {
        if (this.f103114g == null) {
            this.f103114g = new HashMap();
        }
        View view = (View) this.f103114g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103114g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
    }

    public final AttributeSet getAttrs() {
        return this.f103112e;
    }

    public final int getDefStyleAttr() {
        return this.f103113f;
    }

    public final C40404b getMClickListener() {
        return this.f103109b;
    }

    public final int getMColorMode() {
        return this.f103110c;
    }

    public final Context getMContext() {
        return this.f103111d;
    }

    public final TextView getContextTextView() {
        DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.eeg);
        C52711k.m112236a((Object) dmtTextView, "iv_context");
        return dmtTextView;
    }

    public final TextView getTitleTextView() {
        DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.b4x);
        C52711k.m112236a((Object) dmtTextView, "iv_title");
        return dmtTextView;
    }

    public final void setMClickListener(C40404b bVar) {
        this.f103109b = bVar;
    }

    public final void setMColorMode(int i) {
        this.f103110c = i;
    }

    public final void setOnInternalClickListener(C40404b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f103109b = bVar;
    }

    public NoticeButtonView(Context context) {
        C52711k.m112240b(context, "mContext");
        this(context, null);
    }

    private final void setColorMode(int i) {
        if (this.f103110c != i) {
            this.f103110c = i;
            mo19029a(this.f103110c);
        }
    }

    public final void setCloseImage(int i) {
        ((ImageView) m89781b(R.id.az9)).setImageResource(i);
    }

    public final void setContextTextColor(int i) {
        ((DmtTextView) m89781b(R.id.eeg)).setTextColor(i);
    }

    public final void setIconImage(int i) {
        ((ImageView) m89781b(R.id.b1k)).setImageResource(i);
    }

    public final void setNoticeBackgroundColor(int i) {
        ((LinearLayout) m89781b(R.id.brq)).setBackgroundColor(i);
    }

    public final void setCloseImage(Bitmap bitmap) {
        C52711k.m112240b(bitmap, "bitmap");
        ((ImageView) m89781b(R.id.az9)).setImageBitmap(bitmap);
    }

    public final void setContextText(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "text");
        DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.eeg);
        C52711k.m112236a((Object) dmtTextView, "iv_context");
        dmtTextView.setText(charSequence);
    }

    public final void setIconImage(Bitmap bitmap) {
        C52711k.m112240b(bitmap, "bitmap");
        ((ImageView) m89781b(R.id.b1k)).setImageBitmap(bitmap);
    }

    public final void setItemText(String str) {
        C52711k.m112240b(str, "text");
        DmtButton dmtButton = (DmtButton) m89781b(R.id.ee5);
        C52711k.m112236a((Object) dmtButton, "iv_button");
        dmtButton.setText(str);
    }

    public final void setTitleText(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "text");
        DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.b4x);
        C52711k.m112236a((Object) dmtTextView, "iv_title");
        dmtTextView.setText(charSequence);
    }

    public final void setContextText(int i) {
        DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.eeg);
        C52711k.m112236a((Object) dmtTextView, "iv_context");
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        dmtTextView.setText(context.getResources().getText(i));
    }

    public final void setTitleText(int i) {
        DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.b4x);
        C52711k.m112236a((Object) dmtTextView, "iv_title");
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        dmtTextView.setText(context.getResources().getText(i));
    }

    public final void setContextText(String str) {
        C52711k.m112240b(str, "text");
        DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.eeg);
        C52711k.m112236a((Object) dmtTextView, "iv_context");
        dmtTextView.setText(str);
    }

    public final void setTitleText(String str) {
        C52711k.m112240b(str, "text");
        DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.b4x);
        C52711k.m112236a((Object) dmtTextView, "iv_title");
        dmtTextView.setText(str);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        DmtButton dmtButton = (DmtButton) m89781b(R.id.ee5);
        C52711k.m112236a((Object) dmtButton, "iv_button");
        int id = dmtButton.getId();
        if (num != null && num.intValue() == id) {
            C40404b bVar = this.f103109b;
            if (bVar != null) {
                bVar.mo82657a();
            }
        } else {
            ImageView imageView = (ImageView) m89781b(R.id.az9);
            C52711k.m112236a((Object) imageView, "iv_close");
            int id2 = imageView.getId();
            if (num != null && num.intValue() == id2) {
                C40404b bVar2 = this.f103109b;
                if (bVar2 != null) {
                    bVar2.mo82658b();
                }
            } else {
                DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.eeg);
                C52711k.m112236a((Object) dmtTextView, "iv_context");
                int id3 = dmtTextView.getId();
                if (num == null || num.intValue() != id3) {
                    DmtTextView dmtTextView2 = (DmtTextView) m89781b(R.id.b4x);
                    C52711k.m112236a((Object) dmtTextView2, "iv_title");
                    dmtTextView2.getId();
                    if (num != null) {
                        num.intValue();
                    }
                }
            }
        }
    }

    public NoticeButtonView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "mContext");
        this(context, attributeSet, 0);
    }

    public NoticeButtonView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "mContext");
        super(context, attributeSet, i);
        this.f103111d = context;
        this.f103112e = attributeSet;
        this.f103113f = i;
        this.f103110c = -1;
        Context context2 = this.f103111d;
        AttributeSet attributeSet2 = this.f103112e;
        C52711k.m112240b(context2, "mContext");
        LinearLayout.inflate(context2, R.layout.bq0, this);
        OnClickListener onClickListener = this;
        ((DmtButton) m89781b(R.id.ee5)).setOnClickListener(onClickListener);
        ((ImageView) m89781b(R.id.az9)).setOnClickListener(onClickListener);
        ((DmtTextView) m89781b(R.id.eeg)).setOnClickListener(onClickListener);
        ((DmtTextView) m89781b(R.id.b4x)).setOnClickListener(onClickListener);
        ((DmtButton) m89781b(R.id.ee5)).setOnTouchListener(new C48221a(0.5f, 150, null));
        ((ImageView) m89781b(R.id.az9)).setOnTouchListener(new C48221a(0.5f, 150, null));
        C10675b a = C10675b.m21494a();
        C52711k.m112236a((Object) a, "ColorModeManager.getInstance()");
        setColorMode(a.f28434a);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, new int[]{R.attr.abj, R.attr.abk, R.attr.abl, R.attr.abm, R.attr.abn, R.attr.abo, R.attr.abp, R.attr.abq});
        Drawable drawable = obtainStyledAttributes.getDrawable(3);
        if (drawable != null) {
            ((ImageView) m89781b(R.id.b1k)).setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            ((ImageView) m89781b(R.id.az9)).setImageDrawable(drawable2);
        }
        DmtTextView dmtTextView = (DmtTextView) m89781b(R.id.b4x);
        C52711k.m112236a((Object) dmtTextView, "iv_title");
        dmtTextView.setText(obtainStyledAttributes.getString(6));
        ((DmtTextView) m89781b(R.id.b4x)).setTextColor(obtainStyledAttributes.getColor(7, getResources().getColor(R.color.py)));
        DmtTextView dmtTextView2 = (DmtTextView) m89781b(R.id.eeg);
        C52711k.m112236a((Object) dmtTextView2, "iv_context");
        dmtTextView2.setText(obtainStyledAttributes.getString(1));
        ((DmtTextView) m89781b(R.id.eeg)).setTextColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.py)));
        DmtButton dmtButton = (DmtButton) m89781b(R.id.ee5);
        C52711k.m112236a((Object) dmtButton, "iv_button");
        dmtButton.setText(obtainStyledAttributes.getString(4));
        obtainStyledAttributes.recycle();
    }
}
