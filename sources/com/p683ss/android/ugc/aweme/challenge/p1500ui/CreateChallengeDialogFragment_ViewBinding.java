package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.CreateChallengeDialogFragment_ViewBinding */
public class CreateChallengeDialogFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateChallengeDialogFragment f65119a;

    /* renamed from: b */
    private View f65120b;

    /* renamed from: c */
    private TextWatcher f65121c;

    /* renamed from: d */
    private View f65122d;

    /* renamed from: e */
    private TextWatcher f65123e;

    /* renamed from: f */
    private View f65124f;

    /* renamed from: g */
    private View f65125g;

    /* renamed from: h */
    private View f65126h;

    public void unbind() {
        CreateChallengeDialogFragment createChallengeDialogFragment = this.f65119a;
        if (createChallengeDialogFragment != null) {
            this.f65119a = null;
            createChallengeDialogFragment.mTitleView = null;
            createChallengeDialogFragment.mEditTitleView = null;
            createChallengeDialogFragment.mEditDescView = null;
            createChallengeDialogFragment.mCountView = null;
            createChallengeDialogFragment.mConfirmView = null;
            createChallengeDialogFragment.mDeleteView = null;
            ((TextView) this.f65120b).removeTextChangedListener(this.f65121c);
            this.f65121c = null;
            this.f65120b = null;
            ((TextView) this.f65122d).removeTextChangedListener(this.f65123e);
            this.f65123e = null;
            this.f65122d = null;
            this.f65124f.setOnClickListener(null);
            this.f65124f = null;
            this.f65125g.setOnClickListener(null);
            this.f65125g = null;
            this.f65126h.setOnClickListener(null);
            this.f65126h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CreateChallengeDialogFragment_ViewBinding(final CreateChallengeDialogFragment createChallengeDialogFragment, View view) {
        this.f65119a = createChallengeDialogFragment;
        createChallengeDialogFragment.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.s6, "field 'mEditTitleView' and method 'onTitleTextChange'");
        createChallengeDialogFragment.mEditTitleView = (EditText) Utils.castView(findRequiredView, R.id.s6, "field 'mEditTitleView'", EditText.class);
        this.f65120b = findRequiredView;
        this.f65121c = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                createChallengeDialogFragment.onTitleTextChange(charSequence);
            }
        };
        ((TextView) findRequiredView).addTextChangedListener(this.f65121c);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.rz, "field 'mEditDescView' and method 'onDescTextChange'");
        createChallengeDialogFragment.mEditDescView = (EditText) Utils.castView(findRequiredView2, R.id.rz, "field 'mEditDescView'", EditText.class);
        this.f65122d = findRequiredView2;
        this.f65123e = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                createChallengeDialogFragment.onDescTextChange(charSequence);
            }
        };
        ((TextView) findRequiredView2).addTextChangedListener(this.f65123e);
        createChallengeDialogFragment.mCountView = (TextView) Utils.findRequiredViewAsType(view, R.id.a0y, "field 'mCountView'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.yo, "field 'mConfirmView' and method 'click'");
        createChallengeDialogFragment.mConfirmView = (TextView) Utils.castView(findRequiredView3, R.id.yo, "field 'mConfirmView'", TextView.class);
        this.f65124f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                createChallengeDialogFragment.click(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.cyi, "field 'mDeleteView' and method 'click'");
        createChallengeDialogFragment.mDeleteView = findRequiredView4;
        this.f65125g = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                createChallengeDialogFragment.click(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.ik, "method 'click' and method 'back'");
        this.f65126h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                createChallengeDialogFragment.click(view);
                createChallengeDialogFragment.back();
            }
        });
    }
}
