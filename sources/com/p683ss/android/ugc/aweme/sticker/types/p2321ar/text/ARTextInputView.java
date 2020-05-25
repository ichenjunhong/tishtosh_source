package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.ARTextInputView */
public final class ARTextInputView extends EffectTextInputView {

    /* renamed from: j */
    private LayoutParams f117382j;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.ARTextInputView$a */
    public static final class C46522a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ARTextInputView f117383a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        C46522a(ARTextInputView aRTextInputView) {
            this.f117383a = aRTextInputView;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                EditText editText = this.f117383a.f117390a;
                C52711k.m112236a((Object) editText, "editView");
                int selectionStart = editText.getSelectionStart();
                EditText editText2 = this.f117383a.f117390a;
                C52711k.m112236a((Object) editText2, "editView");
                int selectionEnd = editText2.getSelectionEnd();
                if (this.f117383a.f117398i.length() > this.f117383a.f117397h && this.f117383a.f117397h > 0) {
                    editable.delete(selectionStart - 1, selectionEnd);
                    EditText editText3 = this.f117383a.f117390a;
                    C52711k.m112236a((Object) editText3, "editView");
                    editText3.setText(editable);
                    this.f117383a.f117390a.setSelection(editable.toString().length());
                    EditText editText4 = this.f117383a.f117390a;
                    C52711k.m112236a((Object) editText4, "editView");
                    C50275d.m108539b(editText4.getContext(), this.f117383a.f117396g).mo98174a();
                } else if (this.f117383a.f117395f != null) {
                    this.f117383a.f117395f.mo93304a(editable.toString());
                }
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
            this.f117383a.f117398i = charSequence.toString();
            if (this.f117383a.f117398i == null) {
                this.f117383a.f117398i = "";
            }
        }
    }

    public ARTextInputView(Context context) {
        this(context, null, 2, null);
    }

    /* access modifiers changed from: protected */
    public final int getLayout() {
        return R.layout.a6r;
    }

    public final LayoutParams getParams() {
        return this.f117382j;
    }

    public final TextWatcher getTextWatcher() {
        return new C46522a(this);
    }

    public final void setParams(LayoutParams layoutParams) {
        C52711k.m112240b(layoutParams, "<set-?>");
        this.f117382j = layoutParams;
    }

    public final void setHintText(String str) {
        if (this.f117390a != null) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                EditText editText = this.f117390a;
                C52711k.m112236a((Object) editText, "editView");
                editText.setHint(charSequence);
            }
        }
    }

    /* renamed from: a */
    public final void mo93276a(int i) {
        if (this.f117390a != null) {
            LayoutParams layoutParams = this.f117382j;
            float f = (float) i;
            EditText editText = this.f117390a;
            C52711k.m112236a((Object) editText, "editView");
            layoutParams.bottomMargin = (int) (f + C9432q.m18687b(editText.getContext(), 16.0f));
            EditText editText2 = this.f117390a;
            C52711k.m112236a((Object) editText2, "editView");
            editText2.setLayoutParams(this.f117382j);
        }
        View view = this.f117393d;
        C52711k.m112236a((Object) view, "titleLayout");
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            LayoutParams layoutParams3 = (LayoutParams) layoutParams2;
            layoutParams3.topMargin = C43303dy.m94972c(getContext()) - C22452a.m55498d();
            View view2 = this.f117393d;
            C52711k.m112236a((Object) view2, "titleLayout");
            view2.setLayoutParams(layoutParams3);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public ARTextInputView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        EditText editText = this.f117390a;
        C52711k.m112236a((Object) editText, "editView");
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        if (layoutParams != null) {
            this.f117382j = (LayoutParams) layoutParams;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    private /* synthetic */ ARTextInputView(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        this(context, null);
    }
}
