package com.p683ss.android.ugc.aweme.base.activity;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.base.activity.f */
final /* synthetic */ class C23427f implements C1710e {

    /* renamed from: a */
    private final CustomErrorActivity f62487a;

    C23427f(CustomErrorActivity customErrorActivity) {
        this.f62487a = customErrorActivity;
    }

    public final void accept(Object obj) {
        CustomErrorActivity customErrorActivity = this.f62487a;
        RetraceResponseBean retraceResponseBean = (RetraceResponseBean) obj;
        if (retraceResponseBean == null || !retraceResponseBean.isSuccess() || TextUtils.isEmpty(retraceResponseBean.getStack())) {
            C9432q.m18676a((Context) customErrorActivity, "retrace failed ...");
            return;
        }
        TextView textView = customErrorActivity.f62483a;
        StringBuilder sb = new StringBuilder("retraced stack trace : \n");
        sb.append(retraceResponseBean.getStack());
        textView.setText(sb.toString());
        C9432q.m18676a((Context) customErrorActivity, "retrace success ...");
    }
}
