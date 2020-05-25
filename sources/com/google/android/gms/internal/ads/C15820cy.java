package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.C14963ax;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.cy */
public final class C15820cy implements OnClickListener {

    /* renamed from: a */
    final C16276tu f44810a;

    /* renamed from: b */
    public C15912gh f44811b;

    /* renamed from: c */
    C15948hq f44812c;

    /* renamed from: d */
    String f44813d;

    /* renamed from: e */
    Long f44814e;

    /* renamed from: f */
    WeakReference<View> f44815f;

    public C15820cy(C16276tu tuVar) {
        this.f44810a = tuVar;
    }

    public final void onClick(View view) {
        if (this.f44815f != null && this.f44815f.get() == view) {
            if (!(this.f44813d == null || this.f44814e == null)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f44813d);
                    jSONObject.put("time_interval", C14963ax.m30837g().mo28523a() - this.f44814e.longValue());
                    jSONObject.put("messageType", "onePointFiveClick");
                    this.f44810a.mo31416a("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e) {
                    abv.m32793b("Unable to dispatch sendMessageToNativeJs event", e);
                }
            }
            mo30914a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30914a() {
        this.f44813d = null;
        this.f44814e = null;
        if (this.f44815f != null) {
            View view = (View) this.f44815f.get();
            this.f44815f = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
            }
        }
    }
}
