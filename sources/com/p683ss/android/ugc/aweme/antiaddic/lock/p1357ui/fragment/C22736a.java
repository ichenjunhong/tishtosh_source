package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.login.p1932ui.CheckButton;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.a */
public abstract class C22736a extends C23526a {

    /* renamed from: a */
    protected EditText f60947a;

    /* renamed from: b */
    protected CheckButton f60948b;

    /* renamed from: c */
    protected Button f60949c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo47186a() {
        return R.string.dzm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo47183b(String str);

    /* renamed from: a */
    public static boolean m56039a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47187a(View view) {
        if (getActivity() != null) {
            ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60947a = (EditText) view.findViewById(R.id.a9u);
        final EditText editText = this.f60947a;
        final OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
        editText.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                view.post(new Runnable() {
                    public final void run() {
                        if (C22736a.this.getActivity() != null && C22736a.this.isViewValid()) {
                            ((InputMethodManager) C22736a.this.getActivity().getSystemService("input_method")).showSoftInput(editText, 1);
                        }
                    }
                });
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                }
            }
        });
        editText.post(new Runnable() {
            public final void run() {
                editText.requestFocus();
            }
        });
        this.f60948b = (CheckButton) view.findViewById(R.id.ol);
        this.f60949c = (Button) view.findViewById(R.id.bnw);
        this.f60949c.setVisibility(0);
        this.f60949c.setAlpha(0.5f);
        this.f60948b.setVisibility(8);
        this.f60948b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String obj = C22736a.this.f60947a.getText().toString();
                if (!C22736a.m56039a(obj)) {
                    C10691a.m21542b(C22736a.this.getContext(), C22736a.this.mo47186a()).mo19066a();
                } else {
                    C22736a.this.mo47183b(obj);
                }
            }
        });
        this.f60949c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String obj = C22736a.this.f60947a.getText().toString();
                if (!C22736a.m56039a(obj)) {
                    C10691a.m21542b(C22736a.this.getContext(), C22736a.this.mo47186a()).mo19066a();
                } else {
                    C22736a.this.mo47183b(obj);
                }
            }
        });
        this.f60947a.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (editable.length() == 4) {
                    C22736a.this.f60948b.setAlpha(1.0f);
                    C22736a.this.f60949c.setAlpha(1.0f);
                    return;
                }
                C22736a.this.f60948b.setAlpha(0.5f);
                C22736a.this.f60949c.setAlpha(0.5f);
            }
        });
    }
}
