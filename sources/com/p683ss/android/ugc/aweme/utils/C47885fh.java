package com.p683ss.android.ugc.aweme.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.fh */
public final class C47885fh {

    /* renamed from: a */
    List<String> f120478a = new ArrayList();

    /* renamed from: b */
    String f120479b;

    /* renamed from: c */
    boolean f120480c = true;

    /* renamed from: d */
    private C17971f f120481d = new C17971f();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo95092a() {
        this.f120480c = false;
        m103579b();
    }

    /* renamed from: b */
    private void m103579b() {
        this.f120479b = null;
        this.f120478a.clear();
    }

    /* renamed from: a */
    public final void mo95093a(EditText editText) {
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    C47885fh fhVar = C47885fh.this;
                    String obj = editable.toString();
                    if (TextUtils.isEmpty(obj)) {
                        fhVar.f120480c = true;
                        return;
                    }
                    if (fhVar.f120480c) {
                        if (TextUtils.isEmpty(fhVar.f120479b)) {
                            fhVar.f120478a.add(obj);
                            fhVar.f120479b = obj;
                            return;
                        }
                        int length = fhVar.f120479b.length();
                        int length2 = obj.length();
                        if (length != length2) {
                            if (length > length2) {
                                fhVar.mo95092a();
                            } else if (!obj.startsWith(fhVar.f120479b)) {
                                fhVar.mo95092a();
                            } else {
                                fhVar.f120478a.add(obj.substring(length));
                                fhVar.f120479b = obj;
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo95094a(String str) {
        if (!this.f120478a.isEmpty() && this.f120480c) {
            C26890h.m65011a("input_word_cut", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("input_content", this.f120479b).mo47829a("input_content_cut", this.f120481d.mo34889b(this.f120478a)).f61491a);
            mo95092a();
        }
    }
}
