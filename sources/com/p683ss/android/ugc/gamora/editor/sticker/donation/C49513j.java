package com.p683ss.android.ugc.gamora.editor.sticker.donation;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.j */
public final class C49513j extends ClickableSpan {

    /* renamed from: a */
    public String f124226a;

    /* renamed from: b */
    private final Context f124227b;

    /* renamed from: c */
    private final String f124228c;

    /* renamed from: d */
    private final String f124229d;

    public final void updateDrawState(TextPaint textPaint) {
        C52711k.m112240b(textPaint, "ds");
        textPaint.setColor(C0726c.m2098c(this.f124227b, R.color.a3c));
    }

    public final void onClick(View view) {
        C52711k.m112240b(view, "widget");
        if (!C32800a.m75679a(view)) {
            C49464a aVar = C49464a.f124115b;
            String str = this.f124228c;
            String str2 = this.f124229d;
            JSONObject jSONObject = new JSONObject();
            C49464a.m106725a(jSONObject, new C49470f(str, str2));
            C47702b.f120193a.mo94985a("tiltify_about_click", jSONObject);
            Bundle bundle = new Bundle();
            bundle.putString("url", this.f124226a);
            bundle.putString("title", this.f124227b.getString(R.string.g9a));
            bundle.putString("enter_from", "tiltify_page");
            SmartRouter.buildRoute(this.f124227b, "aweme://donation/web/page").withParam(bundle).open();
        }
    }

    public C49513j(Context context, String str, String str2) {
        C52711k.m112240b(context, "mContext");
        this.f124227b = context;
        this.f124228c = str;
        this.f124229d = str2;
    }
}
