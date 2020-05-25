package com.p683ss.android.ugc.aweme.base.activity;

import android.content.DialogInterface;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.activity.m */
final /* synthetic */ class C23434m implements OnClickListener {

    /* renamed from: a */
    private final CustomErrorActivity f62500a;

    /* renamed from: b */
    private final String f62501b;

    C23434m(CustomErrorActivity customErrorActivity, String str) {
        this.f62500a = customErrorActivity;
        this.f62501b = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CustomErrorActivity customErrorActivity = this.f62500a;
        String str = this.f62501b;
        View inflate = LayoutInflater.from(customErrorActivity).inflate(R.layout.b94, null);
        EditText editText = (EditText) inflate.findViewById(R.id.e7p);
        String a = C23859b.m58575b().mo49460a(C11010c.m22280a(), "local_test_lark_user_email");
        if (!TextUtils.isEmpty(a)) {
            editText.setText(a);
            editText.setSelection(a.length());
        }
        C1160b c = new C1161a(customErrorActivity).mo3762a(inflate).mo3764a((CharSequence) "Invite me to join the crash feedback group").mo3770b((CharSequence) "Note: Please input your Bytedance Email Prefix(eg: guanweilin.6). If you still have problems, contact guanweilin.6").mo3766a(true).mo3765a((CharSequence) "OK", (DialogInterface.OnClickListener) null).mo3775c();
        c.mo3753a(-1).setOnClickListener(new C23429h(customErrorActivity, editText, str, c));
    }
}
