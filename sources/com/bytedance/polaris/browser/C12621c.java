package com.bytedance.polaris.browser;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.polaris.browser.p823a.C12609c;
import com.bytedance.polaris.browser.p823a.C12610d;
import com.bytedance.polaris.browser.p823a.C12613f;
import com.bytedance.polaris.browser.p823a.p824a.C12597c;
import com.bytedance.polaris.browser.p823a.p824a.C12597c.C12598a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.c */
public final class C12621c implements C9382a, C12598a, C12609c {

    /* renamed from: a */
    private C12597c f33143a;

    /* renamed from: b */
    private WeakReference<Activity> f33144b;

    /* renamed from: c */
    private WeakReference<WebView> f33145c;

    /* renamed from: d */
    private C9381g f33146d = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: a */
    public final List<String> mo23711a() {
        if (this.f33143a == null) {
            return null;
        }
        C12597c cVar = this.f33143a;
        ArrayList arrayList = new ArrayList();
        if (cVar.f33073b != null) {
            arrayList.addAll(cVar.f33073b.keySet());
        }
        arrayList.add("appCommonParams");
        arrayList.add("check_apps_installed");
        arrayList.add("unite_share");
        arrayList.add("scanQrcode");
        arrayList.add("update_task_list");
        arrayList.add("open_notifi_setting");
        arrayList.add("is_notifi_enabled");
        arrayList.add("open_system_permission_setting");
        arrayList.add("close");
        arrayList.add("statusBar");
        arrayList.add("get_status_bar_height");
        arrayList.add("page_state_change");
        arrayList.add("get_ab_setting");
        arrayList.add("safeHttpRequest");
        arrayList.add("start_red_packet_activity");
        arrayList.add("checkClipboard");
        arrayList.add("toast");
        arrayList.add("pre_load_image_urls");
        arrayList.add("getVersion");
        arrayList.add("awardToast");
        arrayList.add("signIn");
        arrayList.add("openTreasureBox");
        arrayList.add("copyToClipboard");
        arrayList.add("feedbackVideo");
        arrayList.add("taskSetting");
        arrayList.add("feedback");
        arrayList.add("openThirdPage");
        arrayList.add("openPage");
        arrayList.add("appCommonParams");
        return arrayList;
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            try {
                m25353b((C12610d) message.obj);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m25352a(JSONObject jSONObject) {
        WebView webView = (WebView) this.f33145c.get();
        if (!(webView == null || webView == null)) {
            StringBuilder sb = new StringBuilder("javascript:ToutiaoJSBridge._handleMessageFromToutiao(");
            sb.append(jSONObject.toString());
            sb.append(")");
            C12613f.m25344a(webView, sb.toString());
        }
    }

    /* renamed from: b */
    private void m25353b(C12610d dVar) throws Exception {
        if (dVar != null) {
            JSONObject jSONObject = new JSONObject();
            if (this.f33143a.mo23679a(dVar, jSONObject)) {
                if (!jSONObject.has("code")) {
                    jSONObject.put("code", 1);
                }
                mo23707a(dVar.f33100b, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo23712a(C12610d dVar) {
        if (dVar == null) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                m25353b(dVar);
            } catch (Throwable unused) {
            }
        } else {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = dVar;
            this.f33146d.sendMessage(obtain);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo23707a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            m25352a(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public C12621c(Activity activity, WebView webView) {
        this.f33144b = new WeakReference<>(activity);
        this.f33145c = new WeakReference<>(webView);
        Activity activity2 = (Activity) this.f33144b.get();
        if (!(activity2 == null || activity2.isFinishing() || ((WebView) this.f33145c.get()) == null)) {
            this.f33143a = new C12597c(activity2, this);
        }
    }

    /* renamed from: b */
    public final void mo23708b(String str, JSONObject jSONObject) {
        try {
            if (!C9431p.m18664a(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("__msg_type", "event");
                jSONObject2.put("__event_id", str);
                if (jSONObject != null) {
                    jSONObject2.put("__params", jSONObject);
                }
                m25352a(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }
}
