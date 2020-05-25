package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.BubbleTextInputView */
public final class BubbleTextInputView extends EffectTextInputView {

    /* renamed from: j */
    private LayoutParams f117386j;

    /* renamed from: k */
    private View f117387k;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.BubbleTextInputView$a */
    public static final class C46523a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ BubbleTextInputView f117388a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        C46523a(BubbleTextInputView bubbleTextInputView) {
            this.f117388a = bubbleTextInputView;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            if ((this.f117388a.f117398i.length() <= this.f117388a.f117397h || this.f117388a.f117397h <= 0) && this.f117388a.f117395f != null) {
                this.f117388a.f117395f.mo93304a(editable.toString());
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
            this.f117388a.f117398i = charSequence.toString();
            if (this.f117388a.f117398i == null) {
                this.f117388a.f117398i = "";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.BubbleTextInputView$b */
    public static final class C46524b extends LengthFilter {

        /* renamed from: a */
        final /* synthetic */ BubbleTextInputView f117389a;

        C46524b(BubbleTextInputView bubbleTextInputView, int i) {
            this.f117389a = bubbleTextInputView;
            super(i);
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            C52711k.m112240b(charSequence, "source");
            C52711k.m112240b(spanned, "dest");
            CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
            if (this.f117389a.f117397h - (spanned.length() - (i4 - i3)) < i2 - i) {
                EditText editText = this.f117389a.f117390a;
                C52711k.m112236a((Object) editText, "editView");
                C50275d.m108539b(editText.getContext(), this.f117389a.f117396g).mo98174a();
            }
            return filter;
        }
    }

    public BubbleTextInputView(Context context) {
        this(context, null, 2, null);
    }

    /* access modifiers changed from: protected */
    public final int getLayout() {
        return R.layout.a57;
    }

    public final LayoutParams getParams() {
        return this.f117386j;
    }

    public final TextWatcher getTextWatcher() {
        return new C46523a(this);
    }

    /* renamed from: a */
    public final void mo93287a() {
        super.mo93287a();
        this.f117395f.mo93305b(this.f117398i);
    }

    public final void setParams(LayoutParams layoutParams) {
        C52711k.m112240b(layoutParams, "<set-?>");
        this.f117386j = layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo93288a(Context context) {
        super.mo93288a(context);
        this.f117387k = this.f117392c.findViewById(R.id.zl);
    }

    public final void setMaxTextCount(int i) {
        super.setMaxTextCount(i);
        EditText editText = this.f117390a;
        C52711k.m112236a((Object) editText, "editView");
        editText.setFilters((InputFilter[]) new C46524b[]{new C46524b(this, this.f117397h)});
    }

    /* renamed from: a */
    public final void mo93276a(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f117387k;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            View view2 = this.f117387k;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
            }
            View view3 = this.f117393d;
            C52711k.m112236a((Object) view3, "titleLayout");
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            if (layoutParams3 != null) {
                LayoutParams layoutParams4 = (LayoutParams) layoutParams3;
                layoutParams4.topMargin = C43303dy.m94972c(getContext()) - C22452a.m55498d();
                View view4 = this.f117393d;
                C52711k.m112236a((Object) view4, "titleLayout");
                view4.setLayoutParams(layoutParams4);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public BubbleTextInputView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        EditText editText = this.f117390a;
        C52711k.m112236a((Object) editText, "editView");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams != null) {
            this.f117386j = (LayoutParams) layoutParams;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    private /* synthetic */ BubbleTextInputView(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        this(context, null);
    }
}
