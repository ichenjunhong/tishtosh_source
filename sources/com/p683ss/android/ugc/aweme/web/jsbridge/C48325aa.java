package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.aa */
public final class C48325aa implements C10762d {

    /* renamed from: a */
    protected WeakReference<Context> f121597a;

    /* renamed from: b */
    private C10757a f121598b;

    public C48325aa(WeakReference<Context> weakReference, C10757a aVar) {
        this.f121597a = weakReference;
        this.f121598b = aVar;
    }

    /* renamed from: a */
    public final void mo95817a(C10766h hVar, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", z ? 1 : 0);
        } catch (JSONException unused) {
        }
        this.f121598b.mo19455a(hVar.f28945b, jSONObject);
    }

    public final void call(final C10766h hVar, JSONObject jSONObject) throws Exception {
        String str;
        if (this.f121597a.get() != null) {
            hVar.f28951h = false;
            String optString = hVar.f28947d.optString(C42311c.f106865i);
            String optString2 = hVar.f28947d.optString("title");
            String optString3 = hVar.f28947d.optString("confirm_text");
            String optString4 = hVar.f28947d.optString("cancel_text");
            final boolean optBoolean = hVar.f28947d.optBoolean("swap");
            C10643a aVar = new C10643a((Context) this.f121597a.get());
            C10643a b = aVar.mo18892a(optString2).mo18902b(optString);
            if (optBoolean) {
                str = optString4;
            } else {
                str = optString3;
            }
            C10643a a = b.mo18893a(str, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C48325aa.this.mo95817a(hVar, !optBoolean);
                }
            });
            if (!optBoolean) {
                optString3 = optString4;
            }
            a.mo18903b(optString3, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C48325aa.this.mo95817a(hVar, optBoolean);
                }
            });
            aVar.mo18897a().mo18882b().setCancelable(false);
        }
    }
}
