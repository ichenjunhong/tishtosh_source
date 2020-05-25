package com.bytedance.android.livesdk.feed.p341i;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.i.j */
final /* synthetic */ class C6981j implements C1710e {

    /* renamed from: a */
    private final C6959a f19073a;

    C6981j(C6959a aVar) {
        this.f19073a = aVar;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Context context = this.f19073a.itemView.getContext();
        if (th instanceof C2949a) {
            C2949a aVar = (C2949a) th;
            String alert = aVar.getAlert();
            String prompt = aVar.getPrompt();
            if (!TextUtils.isEmpty(alert)) {
                String string = context.getResources().getString(R.string.e6a);
                if (context != null) {
                    C4221a aVar2 = new C4221a(context);
                    aVar2.mo9689a((CharSequence) context.getResources().getString(R.string.e8f));
                    aVar2.mo9695b((CharSequence) alert);
                    aVar2.mo9690a((CharSequence) string, (OnClickListener) null);
                    aVar2.mo9692a().show();
                }
            } else {
                if (!TextUtils.isEmpty(prompt)) {
                    C4204a.m10423a(context, prompt);
                }
            }
        } else {
            C4204a.m10421a(context, (int) R.string.e84);
        }
    }
}
