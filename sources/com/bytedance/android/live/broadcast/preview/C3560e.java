package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.e */
final /* synthetic */ class C3560e implements OnClickListener {

    /* renamed from: a */
    private final Context f10135a;

    C3560e(Context context) {
        this.f10135a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f10135a;
        StringBuilder sb = new StringBuilder();
        sb.append("https://www.tiktok.com/aweme/in_app/suicide/help/");
        sb.append(C3558c.m9387a());
        sb.append("?is_live=1");
        sb.append("&title=");
        sb.append(context.getString(R.string.eyw));
        ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(context, C4704c.m11227b(sb.toString()));
    }
}
