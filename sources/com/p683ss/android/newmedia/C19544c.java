package com.p683ss.android.newmedia;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.p043v7.app.C1160b.C1161a;

/* renamed from: com.ss.android.newmedia.c */
public final class C19544c {
    /* renamed from: a */
    public final boolean mo40799a(final Context context, String str) {
        if (context == null) {
            return false;
        }
        if (!str.startsWith("alipays:") && !str.startsWith("alipay")) {
            return false;
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
            new C1161a(context).mo3770b((CharSequence) "未检测到支付宝客户端，请安装后重试。").mo3765a((CharSequence) "立即安装", (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://d.alipay.com")));
                }
            }).mo3771b((CharSequence) "取消", (OnClickListener) null).mo3775c();
        }
        return true;
    }
}
