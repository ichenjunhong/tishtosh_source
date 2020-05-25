package com.p683ss.android.ugc.aweme.imported;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.imported.f */
public final class C35525f {

    /* renamed from: a */
    List<String> f91298a = new ArrayList();

    /* renamed from: b */
    String f91299b;

    /* renamed from: c */
    boolean f91300c = true;

    /* renamed from: d */
    private C17971f f91301d = C39618d.f101161b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo73907a() {
        this.f91300c = false;
        m80268b();
    }

    /* renamed from: b */
    private void m80268b() {
        this.f91299b = null;
        this.f91298a.clear();
    }

    /* renamed from: a */
    public final void mo73908a(EditText editText) {
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    C35525f fVar = C35525f.this;
                    String obj = editable.toString();
                    if (TextUtils.isEmpty(obj)) {
                        fVar.f91300c = true;
                        return;
                    }
                    if (fVar.f91300c) {
                        if (TextUtils.isEmpty(fVar.f91299b)) {
                            fVar.f91298a.add(obj);
                            fVar.f91299b = obj;
                            return;
                        }
                        int length = fVar.f91299b.length();
                        int length2 = obj.length();
                        if (length != length2) {
                            if (length > length2) {
                                fVar.mo73907a();
                            } else if (!obj.startsWith(fVar.f91299b)) {
                                fVar.mo73907a();
                            } else {
                                fVar.f91298a.add(obj.substring(length));
                                fVar.f91299b = obj;
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo73909a(String str) {
        if (!this.f91298a.isEmpty() && this.f91300c) {
            C26890h.m65011a("input_word_cut", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("input_content", this.f91299b).mo47829a("input_content_cut", this.f91301d.mo34889b(this.f91298a)).f61491a);
            mo73907a();
        }
    }
}
