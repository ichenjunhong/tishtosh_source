package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1890b;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.common.utility.C9415i;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29293i;
import com.p683ss.android.ugc.aweme.emoji.p1684d.C29303a;
import com.p683ss.android.ugc.aweme.emoji.p1684d.C29307d;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.b.a */
public final class C35145a implements C29293i {

    /* renamed from: a */
    public static final C35146a f90388a = new C35146a(null);

    /* renamed from: b */
    private final InputConnection f90389b = this.f90390c.onCreateInputConnection(new EditorInfo());

    /* renamed from: c */
    private final EditText f90390c;

    /* renamed from: d */
    private final int f90391d;

    /* renamed from: e */
    private final String f90392e;

    /* renamed from: f */
    private final C29303a f90393f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.b.a$a */
    public static final class C35146a {
        private C35146a() {
        }

        public /* synthetic */ C35146a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C29293i m79385a(EditText editText, int i, String str, C29303a aVar) {
            C52711k.m112240b(editText, "editText");
            return new C35145a(editText, i, str, aVar);
        }
    }

    /* renamed from: a */
    public final void mo51883a() {
    }

    /* renamed from: a */
    public final void mo51885a(View view, C29285a aVar, int i, int i2) {
    }

    /* renamed from: a */
    public final void mo51886a(C29285a aVar, int i, int i2) {
    }

    /* renamed from: b */
    public final void mo51888b(int i) {
    }

    /* renamed from: a */
    public final void mo51884a(int i) {
        StringBuilder sb = new StringBuilder("keyCode:");
        sb.append(67);
        C32458a.m75141a(3, "EmojiSwitchPanel", sb.toString());
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (this.f90389b != null) {
            this.f90389b.sendKeyEvent(keyEvent);
        } else {
            this.f90390c.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: a */
    public final void mo51887a(String str, int i) {
        C35145a aVar;
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            aVar = this;
        } else {
            aVar = null;
        }
        C35145a aVar2 = aVar;
        if (aVar2 != null) {
            if (!C9415i.m18635b()) {
                aVar2 = null;
            }
            if (aVar2 != null) {
                throw new RuntimeException("emoji text is empty");
            }
            return;
        }
        C29307d dVar = C29307d.f76696c;
        if (str == null) {
            C52711k.m112234a();
        }
        C52711k.m112240b(str, "emojiText");
        C29307d.f76695b.set(true);
        if (dVar.mo59255b().contains(str)) {
            dVar.mo59255b().remove(str);
            dVar.mo59255b().addFirst(str);
        } else {
            dVar.mo59255b().addFirst(str);
            if (dVar.mo59255b().size() > 8) {
                dVar.mo59255b().removeLast();
            }
        }
        C29303a aVar3 = this.f90393f;
        if (aVar3 != null) {
            aVar3.mo59248a(str);
        }
        if (this.f90390c.getText().length() + str.length() > this.f90391d) {
            C10691a.m21545b(C11010c.m22280a(), this.f90392e).mo19066a();
            return;
        }
        int max = Math.max(0, this.f90390c.getSelectionStart());
        int max2 = Math.max(0, this.f90390c.getSelectionEnd());
        if (max == max2) {
            this.f90390c.getText().insert(max, charSequence);
            C29408b.m69342a((TextView) this.f90390c);
        } else {
            try {
                this.f90390c.getText().replace(max, max2, str);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        int length = max + str.length();
        int length2 = this.f90390c.length();
        if (length >= length2) {
            this.f90390c.setSelection(length2);
        } else {
            this.f90390c.setSelection(length);
        }
    }

    public C35145a(EditText editText, int i, String str, C29303a aVar) {
        C52711k.m112240b(editText, "editText");
        this.f90390c = editText;
        this.f90391d = i;
        this.f90392e = str;
        this.f90393f = aVar;
    }
}
