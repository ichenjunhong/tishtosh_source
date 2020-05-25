package com.p683ss.android.ugc.aweme.commercialize;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity_ViewBinding */
public class PoiCouponInputActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiCouponInputActivity f67718a;

    /* renamed from: b */
    private View f67719b;

    /* renamed from: c */
    private TextWatcher f67720c;

    /* renamed from: d */
    private View f67721d;

    /* renamed from: e */
    private View f67722e;

    public void unbind() {
        PoiCouponInputActivity poiCouponInputActivity = this.f67718a;
        if (poiCouponInputActivity != null) {
            this.f67718a = null;
            poiCouponInputActivity.titleBar = null;
            poiCouponInputActivity.input = null;
            poiCouponInputActivity.clear = null;
            poiCouponInputActivity.confirm = null;
            ((TextView) this.f67719b).removeTextChangedListener(this.f67720c);
            this.f67720c = null;
            this.f67719b = null;
            this.f67721d.setOnClickListener(null);
            this.f67721d = null;
            this.f67722e.setOnClickListener(null);
            this.f67722e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiCouponInputActivity_ViewBinding(final PoiCouponInputActivity poiCouponInputActivity, View view) {
        this.f67718a = poiCouponInputActivity;
        poiCouponInputActivity.titleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'titleBar'", TextTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.au2, "field 'input' and method 'onInputChanged'");
        poiCouponInputActivity.input = (EditText) Utils.castView(findRequiredView, R.id.au2, "field 'input'", EditText.class);
        this.f67719b = findRequiredView;
        this.f67720c = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                poiCouponInputActivity.onInputChanged();
            }
        };
        ((TextView) findRequiredView).addTextChangedListener(this.f67720c);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.to, "field 'clear' and method 'onClearClicked'");
        poiCouponInputActivity.clear = findRequiredView2;
        this.f67721d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiCouponInputActivity.onClearClicked();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.yn, "field 'confirm' and method 'onConfirmClicked'");
        poiCouponInputActivity.confirm = (ImageView) Utils.castView(findRequiredView3, R.id.yn, "field 'confirm'", ImageView.class);
        this.f67722e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiCouponInputActivity.onConfirmClicked();
            }
        });
    }
}
