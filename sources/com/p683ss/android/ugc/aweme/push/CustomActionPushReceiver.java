package com.p683ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1807im.C33206p.C33207a;
import com.p683ss.android.ugc.aweme.push.C40887d.C40888a;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.push.CustomActionPushReceiver */
public final class CustomActionPushReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f104056a = f104056a;

    /* renamed from: b */
    public static final String f104057b = f104057b;

    /* renamed from: c */
    public static final String f104058c = f104058c;

    /* renamed from: d */
    public static final String f104059d = f104059d;

    /* renamed from: e */
    public static final String f104060e = f104060e;

    /* renamed from: f */
    public static final String f104061f = f104061f;

    /* renamed from: g */
    public static final C40883a f104062g = new C40883a(null);

    /* renamed from: com.ss.android.ugc.aweme.push.CustomActionPushReceiver$a */
    public static final class C40883a {
        private C40883a() {
        }

        public /* synthetic */ C40883a(C52707g gVar) {
            this();
        }
    }

    @C53771m
    public final void onHideLivePopupWindowEvent(C40886c cVar) {
        C52711k.m112240b(cVar, "event");
        C40887d a = C40888a.m90459a();
        if (a.mo83379a() != null && a.mo83379a().isShowing()) {
            C40900e a2 = a.mo83379a();
            C40904g.m90483a(a2.f104096k, C29094ad.f76264a);
            a2.mo63557c();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        JSONObject jSONObject;
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f104059d);
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    jSONObject = new JSONObject(stringExtra);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    String optString = jSONObject.optString(f104060e, null);
                    if (optString != null && TextUtils.equals(f104061f, optString)) {
                        C40887d a = C40888a.m90459a();
                        C52711k.m112240b(intent, "intent");
                        boolean isRecording = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().shortVideoConfig().isRecording();
                        boolean z = C33207a.m76310a().f86199b;
                        if (!C47915gg.m103651b() && !isRecording && z) {
                            String stringExtra2 = intent.getStringExtra("message_title");
                            String stringExtra3 = intent.getStringExtra("message_text");
                            String stringExtra4 = intent.getStringExtra("message_image_url");
                            String stringExtra5 = intent.getStringExtra("message_open_url");
                            if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3) && !TextUtils.isEmpty(stringExtra4) && !TextUtils.isEmpty(stringExtra5)) {
                                Activity g = C11016e.m22312g();
                                if (!(g instanceof MainActivity) || !((MainActivity) g).isADShowing()) {
                                    try {
                                        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
                                        if (!(g == null || baseUserService_Monster == null || !baseUserService_Monster.isLogin())) {
                                            a.mo83379a().f104090e = g;
                                            C40900e a2 = a.mo83379a();
                                            C12203q.m24646a(stringExtra4).mo23118a("LivePopupView").mo23116a((C12197k) a2.f104092g).mo23121a();
                                            a2.f104093h.setText(stringExtra2);
                                            a2.f104094i.setText(stringExtra3);
                                            a2.f104095j = stringExtra5;
                                            String queryParameter = Uri.parse(stringExtra5).getQueryParameter("room_id");
                                            if (TextUtils.isEmpty(queryParameter)) {
                                                queryParameter = "";
                                            }
                                            a2.f104096k = queryParameter;
                                            a.mo83379a().mo63556b();
                                        }
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
