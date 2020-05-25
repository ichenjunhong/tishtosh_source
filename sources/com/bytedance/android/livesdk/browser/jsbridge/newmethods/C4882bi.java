package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a.C8687a;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bi */
final /* synthetic */ class C4882bi implements OnClickListener {

    /* renamed from: a */
    private final C4881bh f13151a;

    /* renamed from: b */
    private final JSONObject f13152b;

    /* renamed from: c */
    private final long f13153c;

    /* renamed from: d */
    private final String f13154d;

    /* renamed from: e */
    private final String f13155e;

    /* renamed from: f */
    private final Context f13156f;

    C4882bi(C4881bh bhVar, JSONObject jSONObject, long j, String str, String str2, Context context) {
        this.f13151a = bhVar;
        this.f13152b = jSONObject;
        this.f13153c = j;
        this.f13154d = str;
        this.f13155e = str2;
        this.f13156f = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        C4881bh bhVar = this.f13151a;
        JSONObject jSONObject = this.f13152b;
        long j = this.f13153c;
        String str = this.f13154d;
        String str2 = this.f13155e;
        Context context = this.f13156f;
        try {
            i2 = jSONObject.getInt("follow_status");
        } catch (Throwable unused) {
            i2 = 0;
        }
        C8686a aVar = new C8686a();
        aVar.f23736e = i2;
        aVar.f23737f = C8687a.FromWeb;
        aVar.f23732a = j;
        aVar.f23735d = str;
        aVar.f23734c = str2;
        bhVar.mo10635a(aVar, context);
    }
}
