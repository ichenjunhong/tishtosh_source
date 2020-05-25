package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29293i;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ab */
public final class C25332ab implements C29293i {

    /* renamed from: a */
    public int f67004a;

    /* renamed from: b */
    private EditText f67005b;

    /* renamed from: c */
    private InputConnection f67006c = this.f67005b.onCreateInputConnection(new EditorInfo());

    /* renamed from: d */
    private C25359ba f67007d;

    /* renamed from: a */
    public final void mo51883a() {
        this.f67007d.mo51862e();
    }

    /* renamed from: b */
    public final void mo51888b(int i) {
        this.f67007d.mo51842a(i);
    }

    /* renamed from: a */
    public final void mo51884a(int i) {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (this.f67006c != null) {
            this.f67006c.sendKeyEvent(keyEvent);
        } else {
            this.f67005b.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: a */
    public final void mo51887a(String str, int i) {
        if (this.f67005b.getText().length() + str.length() > this.f67004a) {
            C10691a.m21545b((Context) C32463a.m75161a(), C32463a.m75161a().getResources().getString(R.string.dd_, new Object[]{Integer.valueOf(this.f67004a)})).mo19066a();
            return;
        }
        int selectionStart = this.f67005b.getSelectionStart();
        int selectionEnd = this.f67005b.getSelectionEnd();
        int max = Math.max(0, selectionStart);
        int max2 = Math.max(0, selectionEnd);
        if (max == max2) {
            this.f67005b.getText().insert(max, str);
        } else {
            try {
                this.f67005b.getText().replace(max, max2, str);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        int length = max + str.length();
        if (length >= this.f67005b.length()) {
            this.f67005b.setSelection(this.f67005b.length());
        } else {
            this.f67005b.setSelection(length);
        }
    }

    public C25332ab(EditText editText, int i, C25359ba baVar) {
        this.f67005b = editText;
        this.f67004a = i;
        this.f67007d = baVar;
    }

    /* renamed from: a */
    public final void mo51886a(C29285a aVar, int i, int i2) {
        this.f67007d.mo51848a(aVar.f76668d, i, i2);
    }

    /* renamed from: a */
    public final void mo51885a(View view, C29285a aVar, int i, int i2) {
        this.f67007d.mo51844a(view, aVar.f76668d, i, i2);
    }
}
