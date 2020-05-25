package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.profile.C39718ad;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.profile.presenter.C39987u;
import com.p683ss.android.ugc.aweme.profile.util.C40569t;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateUserInfoDialog */
public abstract class UpdateUserInfoDialog extends C1164e implements C39985s {

    /* renamed from: b */
    C39718ad f102595b;

    /* renamed from: c */
    protected C39954ad f102596c;

    /* renamed from: d */
    protected User f102597d;

    /* renamed from: e */
    boolean f102598e;
    ImageView mClose;
    TextView mConfirmUpdate;
    EditText mNickNameEditText;

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo82389c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo82390d();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo82385a() {
        this.f102597d = BaseUserService.getBaseUserService_Monster().getCurrentUser();
        this.f102595b = new C39718ad();
    }

    /* renamed from: e */
    static String m89389e() {
        String string = C11010c.m22280a().getString(R.string.dc6);
        String str = (String) SharePrefCache.inst().getUpdateUserTipContent().mo47782d();
        if (TextUtils.isEmpty(str)) {
            str = C23723j.m58219b(R.string.anw);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(string);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42942b() {
        this.mConfirmUpdate.setOnClickListener(new C40371ee(this));
        this.mClose.setOnClickListener(new C40372ef(this));
        String o = C47915gg.m103666o(this.f102597d);
        this.mNickNameEditText.setText(o);
        if (!TextUtils.isEmpty(o)) {
            this.mNickNameEditText.setSelection(o.length());
        }
        this.mNickNameEditText.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EditText editText = UpdateUserInfoDialog.this.mNickNameEditText;
                Editable text = editText.getText();
                if (text.length() > 20) {
                    C10691a.m21545b(C11010c.m22280a(), C11010c.m22280a().getString(R.string.c59, new Object[]{"20"})).mo19066a();
                    int selectionEnd = Selection.getSelectionEnd(text);
                    editText.setText(text.toString().substring(0, 20));
                    Editable text2 = editText.getText();
                    if (selectionEnd > text2.length()) {
                        selectionEnd = text2.length();
                    }
                    Selection.setSelection(text2, selectionEnd);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo82392b(View view) {
        mo82389c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo82390d());
        ButterKnife.bind((Dialog) this);
        mo82385a();
        mo42942b();
        this.f102596c = new C39954ad();
        this.f102596c.mo81850a((C39985s) this);
    }

    /* renamed from: b */
    static boolean m89388b(String str) {
        if (!C40569t.m90003a(str)) {
            C10691a.m21548c(C11010c.m22280a(), (int) R.string.cgq).mo19066a();
            return true;
        } else if (str.length() <= 20) {
            return false;
        } else {
            C10691a.m21545b(C11010c.m22280a(), C11010c.m22280a().getString(R.string.c59, new Object[]{"20"})).mo19066a();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        C10691a.m21548c(C11010c.m22280a(), (int) R.string.f7j).mo19066a();
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        dismiss();
        C10691a.m21548c(C11010c.m22280a(), (int) R.string.f7k).mo19066a();
        new C39987u().mo44934a_(new Object[0]);
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        C10691a.m21551c(C11010c.m22280a(), str).mo19066a();
    }
}
