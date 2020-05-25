package com.p683ss.android.ugc.aweme.promote;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.promote.d */
public class C40743d implements C40739a {
    /* renamed from: a */
    public final void mo83026a(Context context, String str, String str2) {
        if (context != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = "https://api.tiktokv.com/magic/runtime/?id=1079";
            }
            intent.setData(Uri.parse(str));
            String string = context.getResources().getString(R.string.d07);
            if (C35837h.m80977b()) {
                string = context.getResources().getString(R.string.d0a);
            }
            String str3 = "title";
            if (!TextUtils.isEmpty(str2)) {
                string = str2;
            }
            intent.putExtra(str3, string);
            intent.putExtra("aweme_model", bundle);
            context.startActivity(intent);
        }
    }
}
