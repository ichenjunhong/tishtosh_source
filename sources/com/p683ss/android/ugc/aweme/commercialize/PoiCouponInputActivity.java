package com.p683ss.android.ugc.aweme.commercialize;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity */
public class PoiCouponInputActivity extends AmeActivity {

    /* renamed from: a */
    public static final int[] f67701a = {4, 9, 14};

    /* renamed from: b */
    int f67702b = R.drawable.mx;

    /* renamed from: c */
    ObjectAnimator f67703c = null;
    View clear;
    ImageView confirm;

    /* renamed from: d */
    private int f67704d = R.drawable.aub;

    /* renamed from: e */
    private boolean f67705e;

    /* renamed from: f */
    private int f67706f;

    /* renamed from: g */
    private final C25584a f67707g = new C25584a();
    EditText input;
    TextTitleBar titleBar;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity$a */
    static class C25584a {

        /* renamed from: a */
        CharSequence f67710a;

        /* renamed from: b */
        StringBuilder f67711b;

        /* renamed from: c */
        int f67712c;

        /* renamed from: d */
        int f67713d;

        /* renamed from: e */
        int f67714e;

        /* renamed from: f */
        int f67715f;

        /* renamed from: g */
        int f67716g;

        /* renamed from: h */
        boolean f67717h;

        private C25584a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final StringBuilder mo52721a() {
            if (this.f67711b == null) {
                this.f67711b = new StringBuilder();
                this.f67711b.append(this.f67710a.subSequence(0, this.f67715f));
            }
            return this.f67711b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo52722a(char c) {
            if (this.f67711b != null) {
                this.f67711b.append(c);
            }
            this.f67715f++;
            this.f67716g++;
        }
    }

    /* access modifiers changed from: 0000 */
    public void onClearClicked() {
        m62113b();
    }

    /* renamed from: b */
    private void m62113b() {
        this.f67705e = true;
        try {
            this.input.setText("");
        } finally {
            this.f67705e = false;
        }
    }

    public void onResume() {
        super.onResume();
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.input, 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo52716a() {
        Editable text = this.input.getText();
        int length = text.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Character.isDigit(text.charAt(i2))) {
                i++;
            }
        }
        if (i == 12) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void onConfirmClicked() {
        StringBuilder sb = new StringBuilder();
        Editable text = this.input.getText();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(text.charAt(i))) {
                sb.append(text.charAt(i));
            }
        }
        String sb2 = sb.toString();
        m62113b();
        this.confirm.setImageResource(this.f67704d);
        this.f67703c = ObjectAnimator.ofFloat(this.confirm, "rotation", new float[]{0.0f, 360.0f});
        this.f67703c.setDuration(800);
        int i2 = 1;
        this.f67703c.setRepeatMode(1);
        this.f67703c.setRepeatCount(-1);
        this.f67703c.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                PoiCouponInputActivity.this.confirm.setRotation(0.0f);
            }
        });
        this.f67703c.start();
        if (this.f67706f != 1) {
            i2 = 0;
        }
        C17832m couponDetail = CouponRedeemApi.m62163a().getCouponDetail(sb2, i2);
        couponDetail.mo6039a(new C26149n(this, couponDetail, sb2), C23551l.f62672a);
    }

    /* access modifiers changed from: 0000 */
    public void onInputChanged() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        View view = this.clear;
        if (this.input.getText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        ImageView imageView = this.confirm;
        if (this.f67703c != null || !mo52716a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        imageView.setEnabled(z2);
        if (!this.f67705e) {
            C25584a aVar = this.f67707g;
            EditText editText = this.input;
            aVar.f67710a = editText.getText();
            aVar.f67711b = null;
            aVar.f67712c = editText.getSelectionStart();
            aVar.f67713d = editText.getSelectionEnd();
            aVar.f67714e = aVar.f67710a.length();
            aVar.f67715f = 0;
            aVar.f67716g = 0;
            if (aVar.f67714e >= 14) {
                z3 = true;
            } else {
                z3 = false;
            }
            aVar.f67717h = z3;
            C25584a aVar2 = this.f67707g;
            while (aVar2.f67715f < aVar2.f67714e && aVar2.f67716g < 14) {
                char charAt = aVar2.f67710a.charAt(aVar2.f67715f);
                int[] iArr = f67701a;
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z4 = false;
                        break;
                    } else if (iArr[i2] == aVar2.f67716g) {
                        z4 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z4) {
                    if (charAt == ' ') {
                        aVar2.mo52722a(charAt);
                    } else {
                        aVar2.mo52721a().append(' ');
                        if (aVar2.f67712c >= aVar2.f67716g) {
                            aVar2.f67712c++;
                        }
                        if (aVar2.f67713d >= aVar2.f67716g) {
                            aVar2.f67713d++;
                        }
                        aVar2.f67716g++;
                    }
                } else if (Character.isDigit(charAt)) {
                    aVar2.mo52722a(charAt);
                } else {
                    aVar2.mo52721a();
                    aVar2.f67715f++;
                    if (aVar2.f67712c >= aVar2.f67716g) {
                        aVar2.f67712c--;
                    }
                    if (aVar2.f67713d >= aVar2.f67716g) {
                        aVar2.f67713d--;
                    }
                }
            }
            C25584a aVar3 = this.f67707g;
            if (aVar3.f67711b != null) {
                mo52715a(aVar3.f67711b, Math.min(aVar3.f67712c, 14), Math.min(aVar3.f67713d, 14));
            } else if (aVar3.f67717h) {
                mo52715a(aVar3.f67710a.subSequence(0, 14), Math.min(aVar3.f67712c, 14), Math.min(aVar3.f67713d, 14));
            }
            aVar3.f67710a = null;
            aVar3.f67711b = null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.db);
        ButterKnife.bind((Activity) this);
        this.f67706f = getIntent().getIntExtra("from_page", 0);
        this.confirm.setEnabled(false);
        this.titleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                PoiCouponInputActivity.this.finish();
            }
        });
    }

    /* renamed from: a */
    public final void mo52715a(CharSequence charSequence, int i, int i2) {
        this.f67705e = true;
        try {
            this.input.setText(charSequence);
            this.input.setSelection(i, i2);
        } finally {
            this.f67705e = false;
        }
    }
}
