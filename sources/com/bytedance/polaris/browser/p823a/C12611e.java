package com.bytedance.polaris.browser.p823a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Message;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import android.util.Base64;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebView;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.p502b.p503a.p504a.C9208a;
import com.bytedance.p502b.p503a.p504a.C9217f;
import com.bytedance.polaris.base.C12580b;
import com.bytedance.polaris.base.C12581c;
import com.bytedance.polaris.browser.PolarisBrowserActivity;
import com.bytedance.polaris.browser.p823a.p824a.C12597c;
import com.bytedance.polaris.browser.p823a.p824a.C12597c.C12598a;
import com.bytedance.polaris.p821a.C12559e;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p826d.C12650p;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.e */
public final class C12611e implements C9382a, C12590a, C12598a {

    /* renamed from: d */
    private static final List<String> f33104d;

    /* renamed from: a */
    protected final WeakReference<FragmentActivity> f33105a;

    /* renamed from: b */
    public final C12597c f33106b;

    /* renamed from: c */
    protected C9381g f33107c = new C9381g(this);

    /* renamed from: e */
    private final WeakReference<C12580b> f33108e;

    /* renamed from: f */
    private WebView f33109f;

    /* renamed from: g */
    private WeakReference<C1160b> f33110g;

    /* renamed from: a */
    public final void mo23664a() {
        C1160b bVar;
        if (this.f33110g != null) {
            bVar = (C1160b) this.f33110g.get();
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f33104d = arrayList;
        arrayList.add("dispatch_message");
        f33104d.add("private");
        f33104d.add("domReady");
        f33104d.add("log_event_v3");
        f33104d.add("close_current_page");
        f33104d.add("disable_swipe");
    }

    /* renamed from: b */
    public final void mo23668b() {
        for (C12608b bVar : this.f33106b.f33073b.values()) {
            if (bVar != null) {
                try {
                    bVar.mo23674a();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo23671c() {
        for (C12608b bVar : this.f33106b.f33073b.values()) {
            if (bVar != null) {
                try {
                    bVar.mo23676b();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo23673d() {
        C12597c cVar = this.f33106b;
        C9208a aVar = cVar.f33074c;
        aVar.f25181b.remove(cVar.getClass());
        Iterator it = aVar.f25180a.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = ((List) aVar.f25180a.get(str)).iterator();
            while (it2.hasNext()) {
                if (cVar.equals(((C9217f) it2.next()).mo16582a())) {
                    it2.remove();
                }
            }
            if (((List) aVar.f25180a.get(str)).isEmpty()) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    private void m25330a(JSONObject jSONObject) {
        if (this.f33109f != null) {
            StringBuilder sb = new StringBuilder("javascript:ToutiaoJSBridge._handleMessageFromToutiao(");
            sb.append(jSONObject.toString());
            sb.append(")");
            C12613f.m25344a(this.f33109f, sb.toString());
        }
    }

    /* renamed from: d */
    private void m25331d(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C12610d dVar = new C12610d();
                dVar.f33099a = jSONObject.getString("__msg_type");
                dVar.f33100b = jSONObject.optString("__callback_id", null);
                dVar.f33101c = jSONObject.optString("func");
                dVar.f33102d = jSONObject.optJSONObject("params");
                dVar.f33103e = jSONObject.optInt("JSSDK");
                if (!C9431p.m18664a(dVar.f33099a) && !C9431p.m18664a(dVar.f33101c)) {
                    Message obtainMessage = this.f33107c.obtainMessage(11);
                    obtainMessage.obj = dVar;
                    this.f33107c.sendMessage(obtainMessage);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo23665a(String str) {
        if (str != null && str.startsWith("bytedance://") && !C9431p.m18664a(str)) {
            try {
                Uri parse = Uri.parse(str);
                if (mo23667a(parse)) {
                    Message obtainMessage = this.f33107c.obtainMessage(10);
                    obtainMessage.obj = parse;
                    this.f33107c.sendMessage(obtainMessage);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo23672c(String str) {
        if (str != null && str.startsWith("bytedance://")) {
            String str2 = "bytedance://private/setresult/";
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    if (this.f33109f != null) {
                        C12613f.m25344a(this.f33109f, "javascript:ToutiaoJSBridge._fetchQueue()");
                    }
                } else if (str.startsWith(str2)) {
                    int length = str2.length();
                    int indexOf = str.indexOf(38, length);
                    if (indexOf > 0) {
                        String substring = str.substring(length, indexOf);
                        String substring2 = str.substring(indexOf + 1);
                        if (substring.equals("SCENE_FETCHQUEUE") && substring2.length() > 0) {
                            m25331d(substring2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void handleMsg(Message message) {
        if (message != null) {
            switch (message.what) {
                case 10:
                    Uri uri = null;
                    try {
                        if (message.obj instanceof Uri) {
                            uri = (Uri) message.obj;
                        }
                        if (uri != null) {
                            mo23669b(uri);
                        }
                        return;
                    } catch (Exception unused) {
                        break;
                    }
                case 11:
                    if (message.obj instanceof C12610d) {
                        try {
                            C12610d dVar = (C12610d) message.obj;
                            if (dVar != null) {
                                JSONObject jSONObject = new JSONObject();
                                if (this.f33106b.mo23679a(dVar, jSONObject)) {
                                    if (!jSONObject.has("code")) {
                                        jSONObject.put("code", 1);
                                    }
                                    mo23707a(dVar.f33100b, jSONObject);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo23670b(String str) {
        if (str != null && str.startsWith("file:///android_asset/article/")) {
            return true;
        }
        if (!C12650p.m25425c(str)) {
            return false;
        }
        try {
            if (Uri.parse(str).getHost() == null) {
                return false;
            }
            C12563i.m25221c();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo23669b(Uri uri) {
        String str;
        try {
            String host = uri.getHost();
            boolean z = false;
            if (C9431p.m18665a("log_event_v3", host)) {
                String queryParameter = uri.getQueryParameter("event");
                String queryParameter2 = uri.getQueryParameter("params");
                String queryParameter3 = uri.getQueryParameter("is_double_sending");
                if (!C9431p.m18664a(queryParameter) && !C9431p.m18664a(queryParameter2)) {
                    String decode = URLDecoder.decode(queryParameter, "UTF-8");
                    String decode2 = URLDecoder.decode(queryParameter2, "UTF-8");
                    if (C9431p.m18664a(queryParameter3)) {
                        str = "0";
                    } else {
                        str = URLDecoder.decode(queryParameter3, "UTF-8");
                    }
                    JSONObject jSONObject = new JSONObject(decode2);
                    if (Integer.parseInt(str) == 1) {
                        z = true;
                    }
                    if (!z) {
                        C12559e g = C12563i.m25225g();
                        if (g != null) {
                            g.mo23613a(decode, jSONObject);
                        }
                    } else {
                        jSONObject.put("_staging_flag", 1);
                        C12559e g2 = C12563i.m25225g();
                        if (g2 != null) {
                            g2.mo23613a(decode, jSONObject);
                        }
                    }
                }
            }
            FragmentActivity fragmentActivity = null;
            if ("disable_swipe".equals(host)) {
                if (this.f33105a != null) {
                    fragmentActivity = (FragmentActivity) this.f33105a.get();
                }
                if (fragmentActivity instanceof C12581c) {
                    ((C12581c) fragmentActivity).mo23653a();
                }
            } else if ("enable_swipe".equals(host)) {
                if (this.f33105a != null) {
                    fragmentActivity = (FragmentActivity) this.f33105a.get();
                }
                if (fragmentActivity instanceof C12581c) {
                    ((C12581c) fragmentActivity).mo23654g();
                }
            } else if ("close_current_page".equals(host)) {
                if (this.f33105a != null) {
                    fragmentActivity = (FragmentActivity) this.f33105a.get();
                }
                if (!(fragmentActivity == null || this.f33108e == null)) {
                    C12580b bVar = (C12580b) this.f33108e.get();
                    if (bVar != null && bVar.mo23639p_()) {
                        z = true;
                    }
                    if (z && (fragmentActivity instanceof PolarisBrowserActivity)) {
                        try {
                            fragmentActivity.finish();
                        } catch (Exception e) {
                            C9415i.m18634a((Throwable) e);
                        }
                    }
                }
            } else if ("private".equals(host) || "dispatch_message".equals(host)) {
                mo23672c(uri.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo23667a(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!"bytedance".equals(uri.getScheme())) {
                return false;
            }
            if (f33104d.contains(uri.getHost())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
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
                m25330a(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo23666a(final String str, final Callback callback) {
        Activity activity;
        if (!C9431p.m18664a(str) && callback != null) {
            C1160b bVar = null;
            if (this.f33105a != null) {
                activity = (FragmentActivity) this.f33105a.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                if (this.f33110g != null) {
                    bVar = (C1160b) this.f33110g.get();
                }
                if (bVar != null && bVar.isShowing()) {
                    bVar.dismiss();
                }
                C1161a aVar = new C1161a(activity);
                aVar.mo3758a((int) R.string.cu7);
                aVar.mo3770b((CharSequence) activity.getString(R.string.cu6, new Object[]{str}));
                C126121 r0 = new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i == -2) {
                            callback.invoke(str, false, false);
                            dialogInterface.dismiss();
                            return;
                        }
                        if (i == -1) {
                            callback.invoke(str, true, true);
                            dialogInterface.dismiss();
                        }
                    }
                };
                aVar.mo3769b((int) R.string.cu5, (OnClickListener) r0);
                aVar.mo3759a((int) R.string.cu4, (OnClickListener) r0);
                aVar.mo3766a(false);
                this.f33110g = new WeakReference<>(aVar.mo3775c());
            }
        }
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
            m25330a(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public C12611e(Fragment fragment, C12580b bVar, WebView webView) {
        this.f33109f = webView;
        this.f33105a = new WeakReference<>(fragment.getActivity());
        this.f33108e = new WeakReference<>(bVar);
        this.f33106b = new C12597c(fragment.getActivity(), this);
    }
}
