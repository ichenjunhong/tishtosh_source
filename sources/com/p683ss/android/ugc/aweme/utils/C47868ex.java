package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.utils.ex */
final /* synthetic */ class C47868ex implements C0011g {

    /* renamed from: a */
    private final C47865ew f120451a;

    /* renamed from: b */
    private final JSONObject f120452b;

    C47868ex(C47865ew ewVar, JSONObject jSONObject) {
        this.f120451a = ewVar;
        this.f120452b = jSONObject;
    }

    public final Object then(C0013i iVar) {
        C47865ew ewVar = this.f120451a;
        JSONObject jSONObject = this.f120452b;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            View inflate = LayoutInflater.from(topActivity).inflate(R.layout.bkd, null);
            EditText editText = (EditText) inflate.findViewById(R.id.e7s);
            TextView textView = (TextView) inflate.findViewById(R.id.f46);
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.eo3);
            EditText editText2 = (EditText) inflate.findViewById(R.id.e7r);
            StringBuilder sb = new StringBuilder("异常Url: ");
            sb.append(jSONObject.getString(LeakCanaryFileProvider.f132050j));
            textView.setText(sb.toString());
            if (!TextUtils.isEmpty(ewVar.f120437c)) {
                editText2.setText(ewVar.f120437c);
                editText2.setSelection(ewVar.f120437c.length());
            }
            C1160b c = new C1161a(topActivity).mo3762a(inflate).mo3764a((CharSequence) "Warning: Illegal Request Params!（警告：异常请求参数!）").mo3770b((CharSequence) "No security user id in this request.（请求中未携带加密用户id。)\n\nNote: Please input your Bytedance Email Prefix(eg: ming.yao). If you still have problems, contact river.li.\n注意：请输入自己的公司邮箱前缀（例如：ming.yao）。有疑问请飞书联系黎志强。").mo3766a(false).mo3765a((CharSequence) "upload / 反馈", (OnClickListener) null).mo3775c();
            Button a = c.mo3753a(-1);
            C47869ey eyVar = new C47869ey(ewVar, editText2, editText, progressBar, c, jSONObject);
            a.setOnClickListener(eyVar);
        }
        return null;
    }
}
