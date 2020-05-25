package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.widget.EditText;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.e */
public final class C43630e {

    /* renamed from: a */
    public static int f110523a = 200;

    /* renamed from: b */
    public static int f110524b = 0;

    /* renamed from: c */
    public static int f110525c = 1;

    /* renamed from: d */
    public static int f110526d = 2;

    /* renamed from: e */
    public static int f110527e = 3;

    /* renamed from: f */
    public static int f110528f;

    /* renamed from: b */
    public static final void m95898b(EditText editText) {
        if (editText != null) {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.requestFocus();
            KeyboardUtils.m58183b(editText);
            editText.setSelection(editText.getText().length());
        }
    }

    /* renamed from: a */
    public static final int m95894a(EditText editText) {
        int i;
        if (editText == null) {
            return 0;
        }
        try {
            if (editText.getLayout() == null) {
                StaticLayout staticLayout = new StaticLayout(editText.getText(), editText.getPaint(), editText.getMaxWidth(), Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                i = staticLayout.getLineCount();
            } else {
                Layout layout = editText.getLayout();
                C52711k.m112236a((Object) layout, "layout");
                i = layout.getLineCount();
            }
        } catch (Exception unused) {
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public static final void m95895a(EditText editText, double d) {
        if (editText != null) {
            if (!TextUtils.isEmpty(editText.getText().toString()) || editText.getHint() == null) {
                editText.setGravity(17);
                m95897a(editText, C23728o.m58241a(d), 0, C23728o.m58241a(d), 0);
                return;
            }
            Paint paint = new Paint();
            paint.setTextSize(editText.getTextSize());
            paint.setTypeface(editText.getTypeface());
            int measureText = (int) ((((float) editText.getLayoutParams().width) - paint.measureText(editText.getHint().toString())) / 2.0f);
            if (measureText < 0) {
                m95897a(editText, 0, 0, 0, 0);
                editText.setGravity(8388659);
                return;
            }
            m95897a(editText, measureText, 0, 0, 0);
            editText.setGravity(8388627);
        }
    }

    /* renamed from: a */
    public static final void m95896a(EditText editText, int i) {
        boolean z;
        if (editText != null) {
            CharSequence text = editText.getText();
            if (text == null || text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && m95894a(editText) > i) {
                String obj = editText.getText().toString();
                int i2 = i * 50;
                if (obj.length() >= i2) {
                    if (obj != null) {
                        obj = obj.substring(0, i2);
                        C52711k.m112236a((Object) obj, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
                int length = obj.length() - 1;
                if (obj != null) {
                    String substring = obj.substring(0, length);
                    C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int length2 = substring.length() - 1;
                    while (length2 >= 0 && Character.isHighSurrogate(substring.charAt(length2))) {
                        if (substring != null) {
                            substring = substring.substring(0, length2);
                            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            length2--;
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    editText.setText(substring);
                    editText.setSelection(editText.getText().length());
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }

    /* renamed from: a */
    private static void m95897a(EditText editText, int i, int i2, int i3, int i4) {
        if (editText != null) {
            if (VERSION.SDK_INT >= 17) {
                editText.setPaddingRelative(i, 0, i3, 0);
            } else if (!C47918gj.m103682a(editText.getContext())) {
                editText.setPadding(i, 0, i3, 0);
            } else {
                editText.setPadding(i3, 0, i, 0);
            }
        }
    }
}
