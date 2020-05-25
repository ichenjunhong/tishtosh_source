package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.sdk.webview.p1210b.C19746f;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.live.p1920c.C36064c;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.web.C48278h;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.e */
public final class C48343e extends C19746f {

    /* renamed from: a */
    public C10757a f121624a;

    /* renamed from: b */
    public String f121625b;

    /* renamed from: c */
    private JSONObject f121626c;

    @C53771m
    public final void onEvent(C48278h hVar) {
        String str = hVar.f121493a;
        JSONObject jSONObject = hVar.f121494b;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException unused) {
        }
        if (this.f121624a != null) {
            this.f121624a.mo19458b("H5_nativeEvent", jSONObject2);
        }
        C47718bf.m103291d(this);
        this.f121626c = null;
    }

    public C48343e(WeakReference<Context> weakReference, C10757a aVar) {
        super(weakReference);
        this.f121624a = aVar;
    }

    public final void call(final C10766h hVar, final JSONObject jSONObject) throws Exception {
        final JSONObject jSONObject2;
        String string = hVar.f28947d.getString("type");
        hVar.f28946c = "open";
        hVar.f28947d.put("type", string);
        this.f121625b = hVar.f28945b;
        this.f121626c = jSONObject;
        if (hVar.f28947d.has("args")) {
            jSONObject2 = hVar.f28947d.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            hVar.f28947d.put("args", jSONObject2);
        }
        if ("item".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("item_id"));
        } else if ("profile".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("user_id"));
        } else if ("challenge".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("challenge_id"));
        } else if ("music".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("music_id"));
        } else if ("collection".equals(string)) {
            jSONObject2.put("id", jSONObject2.get("collection_id"));
        } else if (CustomActionPushReceiver.f104061f.equals(string)) {
            hVar.f28951h = false;
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    String str;
                    int i;
                    int i2;
                    final int i3 = 63;
                    final int i4 = 0;
                    try {
                        String string = jSONObject2.getString("user_id");
                        String optString = jSONObject2.optString("sec_user_id");
                        C40733z zVar = C40733z.f103767a;
                        if (C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
                            str = C40733z.f103767a.userUrl(optString, string, null, 0);
                        } else if (TextUtils.isEmpty(optString)) {
                            str = C40733z.f103767a.getUserApi(string);
                        } else {
                            str = C40733z.f103767a.getUserApi(string, optString, "", 0);
                        }
                        User queryUser = zVar.queryUser(str, false, null);
                        if (queryUser.roomId == 0) {
                            i2 = 0;
                            i = 47;
                        } else {
                            i2 = 1;
                            i = 31;
                        }
                        jSONObject2.put("room_id", String.valueOf(queryUser.roomId));
                        i4 = i2;
                        i3 = i;
                    } catch (Exception | JSONException unused) {
                    }
                    C18842a.m45934b(new Runnable() {
                        public final void run() {
                            if (i3 != 47) {
                                C48343e.this.open(hVar.f28947d);
                            }
                            try {
                                jSONObject.put("code", i4);
                            } catch (JSONException unused) {
                            }
                            C48343e.this.f121624a.mo19455a(C48343e.this.f121625b, jSONObject2);
                        }
                    });
                }
            });
            return;
        } else if ("login".equals(string)) {
            String optString = jSONObject2.optString("enter_from");
            if (!C20902b.m53242a().isLogin() && this.mContextRef != null) {
                Activity contextToActivity = contextToActivity((Context) this.mContextRef.get());
                C47718bf.m103290c(this);
                try {
                    C27965f.m66719a(contextToActivity, optString, "");
                    return;
                } catch (Throwable unused) {
                    C47718bf.m103291d(this);
                    return;
                }
            } else {
                return;
            }
        } else if (C23060d.f61427a.equals(string)) {
            try {
                String string2 = hVar.f28947d.getJSONObject("args").getString("url");
                if (TextUtils.equals("1", Uri.parse(string2).getQueryParameter("live_half_charge_dialog"))) {
                    C47718bf.m103288a(new C36064c(string2));
                    if (this.f121624a != null) {
                        this.f121624a.mo19455a(this.f121625b, jSONObject);
                    }
                    return;
                }
            } catch (Exception unused2) {
            }
        }
        C47718bf.m103290c(this);
        jSONObject2.put("group", "0");
        open(hVar.f28947d);
        jSONObject.put("code", 1);
    }
}
