package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.livesdk.chatroom.event.C5205x;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4609s;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ey */
public final class C6187ey extends C0649f {

    /* renamed from: a */
    public boolean f16623a = false;

    /* renamed from: b */
    public C6189a f16624b = null;

    /* renamed from: c */
    protected EditText f16625c;

    /* renamed from: d */
    protected View f16626d;

    /* renamed from: e */
    public View f16627e;

    /* renamed from: f */
    protected String f16628f = null;

    /* renamed from: g */
    protected int f16629g = 0;

    /* renamed from: h */
    protected boolean f16630h = false;

    /* renamed from: i */
    private final OnLayoutChangeListener f16631i = new OnLayoutChangeListener() {

        /* renamed from: b */
        private float f16635b = -1.0f;

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C6187ey.this.f16627e != null) {
                if (this.f16635b < 0.0f) {
                    this.f16635b = ((float) C6187ey.this.getResources().getDisplayMetrics().heightPixels) * 0.75f;
                }
                if (((float) i4) < this.f16635b) {
                    if (!C6187ey.this.f16623a) {
                        C6187ey.this.f16623a = true;
                        int i9 = i8 - i4;
                        C6187ey.this.f16627e.setVisibility(0);
                        C6187ey.m13376a(true, i9);
                    }
                } else if (C6187ey.this.f16623a) {
                    C6187ey.this.f16623a = false;
                    C6187ey.this.f16627e.setVisibility(4);
                    try {
                        C6187ey.this.dismiss();
                    } catch (IllegalStateException unused) {
                    }
                    C6187ey.m13376a(false, 0);
                }
            }
        }
    };

    /* renamed from: j */
    private boolean f16632j = false;

    /* renamed from: k */
    private boolean f16633k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ey$a */
    public interface C6189a {
        /* renamed from: a */
        void mo12234a(String str);

        /* renamed from: b */
        void mo12235b(String str);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f16627e.removeOnLayoutChangeListener(this.f16631i);
    }

    /* renamed from: a */
    public final void mo12227a() {
        if (this.f16625c != null) {
            C4609s.m11068b(getContext(), this.f16625c);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f16632j) {
            this.f16632j = false;
            m13377b(200, 1, 5);
            return;
        }
        this.f16625c.postDelayed(new C6193fb(this), 50);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12232b() {
        if (isAdded()) {
            C4609s.m11067a(getContext(), this.f16625c);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16632j = this.f16623a;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f16628f = getArguments().getString("live.intent.extra.HINT", null);
            this.f16629g = getArguments().getInt("live.intent.extra.MAX_LENGTH", 0);
            this.f16630h = getArguments().getBoolean("live.intent.extra.TOUCH_MODAL", false);
            this.f16633k = getArguments().getBoolean("live.intent.extra.IS_BROADCASTER", false);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            if (!this.f16633k && !C3894h.m9842a(getActivity())) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (!this.f16630h) {
                window.addFlags(32);
                window.clearFlags(2);
            }
        }
        return onCreateDialog;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        super.onDismiss(dialogInterface);
        if (this.f16624b != null) {
            if (this.f16625c.getText() == null) {
                str = "";
            } else {
                str = this.f16625c.getText().toString().trim();
            }
            this.f16624b.mo12235b(str);
            this.f16624b = null;
            this.f16623a = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12229a(View view) {
        String str;
        if (this.f16624b != null) {
            if (this.f16625c.getText() == null) {
                str = "";
            } else {
                str = this.f16625c.getText().toString().trim();
            }
            this.f16624b.mo12234a(str);
        }
    }

    /* renamed from: a */
    public final void mo12230a(String str) {
        if (isAdded() && !TextUtils.isEmpty(str)) {
            this.f16625c.setText(str);
            this.f16625c.setSelection(this.f16625c.getText().length());
        }
    }

    /* renamed from: a */
    protected static void m13376a(boolean z, int i) {
        C4495a.m10823a().mo10301a((Object) new C5205x(i, z));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            mo12230a(getArguments().getString("live.intent.extra.INPUT"));
        }
        this.f16625c.setOnEditorActionListener(new C6190ez(this));
        this.f16626d.setOnClickListener(new C6192fa(this));
    }

    /* renamed from: b */
    private void m13377b(long j, int i, int i2) {
        if (this.f16625c != null && i <= i2) {
            EditText editText = this.f16625c;
            C6194fc fcVar = new C6194fc(this, j, i, i2);
            editText.postDelayed(fcVar, j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12228a(long j, int i, int i2) {
        if (isResumed() && this.f16623a) {
            C4609s.m11067a(getContext(), this.f16625c);
            m13377b(j, i + 1, i2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InputFilter[] inputFilterArr;
        this.f16627e = LayoutInflater.from(getContext()).inflate(R.layout.aks, viewGroup, false);
        this.f16627e.addOnLayoutChangeListener(this.f16631i);
        this.f16625c = (EditText) this.f16627e.findViewById(R.id.a3u);
        this.f16626d = this.f16627e.findViewById(R.id.cl5);
        ((KeyboardShadowView) this.f16627e.findViewById(R.id.drs)).setActivity(getActivity());
        this.f16625c.setHint(this.f16628f);
        if (this.f16629g > 0) {
            InputFilter[] filters = this.f16625c.getFilters();
            if (filters == null || filters.length == 0) {
                inputFilterArr = new InputFilter[1];
            } else {
                inputFilterArr = new InputFilter[(filters.length + 1)];
                for (int i = 0; i < filters.length; i++) {
                    inputFilterArr[i] = filters[i];
                }
            }
            inputFilterArr[inputFilterArr.length - 1] = new LengthFilter(this.f16629g);
            this.f16625c.setFilters(inputFilterArr);
        }
        this.f16627e.findViewById(R.id.a3v).getLayoutParams().width = getResources().getDisplayMetrics().widthPixels;
        return this.f16627e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo12231a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        if (this.f16626d.isEnabled()) {
            this.f16626d.performClick();
        }
        return true;
    }
}
