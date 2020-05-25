package com.p683ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.C0643c;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.C23060d;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.router.b */
public final class C41271b implements C41288m {

    /* renamed from: a */
    public String f104712a;

    /* renamed from: b */
    public C41272c f104713b;

    /* renamed from: c */
    public boolean f104714c;

    /* renamed from: d */
    private Context f104715d;

    /* renamed from: e */
    private Class<? extends Activity> f104716e;

    /* renamed from: f */
    private String f104717f;

    /* renamed from: b */
    private static void m91016b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service", "in_app_router_no_matched");
            jSONObject.put(C23060d.f61428b, str);
            C9951d.m19997a("common_log", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo47182a(String str) {
        return m91017b((Activity) null, str, (View) null);
    }

    /* renamed from: a */
    public final boolean mo47180a(Activity activity, String str) {
        return m91017b(activity, str, (View) null);
    }

    /* renamed from: a */
    private void m91013a(Intent intent, String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
        } else {
            Uri parse = Uri.parse(str);
            HashMap hashMap2 = new HashMap();
            for (String str2 : parse.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(parse.getQueryParameter(str2))) {
                    hashMap2.put(str2, str2);
                }
            }
            hashMap = hashMap2;
        }
        for (String str3 : hashMap.keySet()) {
            m91015b(intent, str3, C41312z.m91072b(str, (String) hashMap.get(str3)));
        }
    }

    public C41271b(Context context, String str, Class<? extends Activity> cls) {
        this.f104715d = context;
        this.f104712a = str;
        this.f104716e = cls;
    }

    /* renamed from: a */
    public final boolean mo47181a(Activity activity, String str, View view) {
        return m91017b(activity, str, view);
    }

    /* renamed from: a */
    private static void m91014a(Intent intent, String str, String str2) {
        List a = C41312z.m91070a(str);
        List a2 = C41312z.m91070a(str2);
        int size = a.size();
        for (int i = 1; i < size; i++) {
            if (i < size) {
                String str3 = (String) a2.get(i);
                intent.putExtra(((String) a.get(i)).substring(1), str3);
            }
        }
    }

    /* renamed from: b */
    private static void m91015b(Intent intent, String str, String str2) {
        char c;
        C41300u uVar = C41302w.m91042a().f104758d;
        if (uVar != null) {
            if (C41300u.m91036a(uVar.f104741a, str)) {
                c = 1;
            } else if (C41300u.m91036a(uVar.f104742b, str)) {
                c = 2;
            } else if (C41300u.m91036a(uVar.f104743c, str)) {
                c = 3;
            } else if (C41300u.m91036a(uVar.f104744d, str)) {
                c = 4;
            } else if (C41300u.m91036a(uVar.f104745e, str)) {
                c = 5;
            } else if (C41300u.m91036a(uVar.f104746f, str)) {
                c = 6;
            } else if (C41300u.m91036a(uVar.f104747g, str)) {
                c = 7;
            } else if (C41300u.m91036a(uVar.f104748h, str)) {
                c = 8;
            } else if (C41300u.m91036a(uVar.f104749i, str)) {
                c = 0;
            } else {
                c = 65535;
            }
            switch (c) {
                case 1:
                    intent.putExtra(str, Integer.parseInt(str2));
                    return;
                case 2:
                    intent.putExtra(str, Long.parseLong(str2));
                    return;
                case 3:
                    intent.putExtra(str, Boolean.parseBoolean(str2));
                    return;
                case 4:
                    intent.putExtra(str, Short.parseShort(str2));
                    return;
                case 5:
                    intent.putExtra(str, Float.parseFloat(str2));
                    return;
                case 6:
                    intent.putExtra(str, Double.parseDouble(str2));
                    return;
                case 7:
                    intent.putExtra(str, Byte.parseByte(str2));
                    return;
                case 8:
                    intent.putExtra(str, str2.charAt(0));
                    return;
                default:
                    intent.putExtra(str, str2);
                    return;
            }
        }
    }

    /* renamed from: b */
    private boolean m91017b(Activity activity, String str, View view) {
        Context context;
        Intent intent;
        if (activity != 0) {
            context = activity;
        } else {
            context = this.f104715d;
        }
        if (context == 0) {
            return false;
        }
        boolean z = true;
        if (!this.f104714c) {
            if (!TextUtils.isEmpty(this.f104717f)) {
                intent = new Intent();
                intent.setClassName(context, this.f104717f);
            } else {
                intent = new Intent(context, this.f104716e);
            }
            m91014a(intent, this.f104712a, str);
            m91013a(intent, str);
            C41302w.m91042a().f104758d.mo83853a();
            if (activity == 0) {
                intent.addFlags(268435456);
            }
            if (this.f104713b == null) {
                if (view == null) {
                    context.startActivity(intent);
                } else {
                    C0636b.m2094a((Context) activity, intent, C0643c.m1728a(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0).mo2171a());
                }
                return true;
            }
            int i = this.f104713b.f104722e;
            intent.addFlags(this.f104713b.f104721d);
            if (i == 0) {
                context.startActivity(intent);
            } else if (1 != i || activity == 0) {
                z = false;
            } else {
                activity.startActivityForResult(intent, this.f104713b.f104720c);
            }
            if (!(activity == 0 || this.f104713b.f104718a == -1 || this.f104713b.f104719b == -1)) {
                activity.overridePendingTransition(this.f104713b.f104718a, this.f104713b.f104719b);
            }
            return z;
        } else if (!SmartRouter.canOpen(str)) {
            m91016b(str);
            return false;
        } else {
            if (this.f104713b != null) {
                Intent buildIntent = SmartRouter.buildRoute(context, str).buildIntent();
                if (buildIntent == null) {
                    return false;
                }
                int i2 = this.f104713b.f104722e;
                buildIntent.addFlags(this.f104713b.f104721d);
                if (activity == 0) {
                    buildIntent.addFlags(268435456);
                }
                if (i2 == 0) {
                    context.startActivity(buildIntent);
                } else if (1 == i2 && activity != 0) {
                    activity.startActivityForResult(buildIntent, this.f104713b.f104720c);
                }
                if (!(activity == 0 || this.f104713b.f104718a == -1 || this.f104713b.f104719b == -1)) {
                    activity.overridePendingTransition(this.f104713b.f104718a, this.f104713b.f104719b);
                }
            } else if (view == null) {
                SmartRouter.buildRoute(context, str).open();
            } else {
                Intent buildIntent2 = SmartRouter.buildRoute(context, str).buildIntent();
                if (buildIntent2 == null) {
                    return false;
                }
                C0643c a = C0643c.m1728a(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);
                if (activity == 0) {
                    buildIntent2.addFlags(268435456);
                }
                C0636b.m2094a(context, buildIntent2, a.mo2171a());
            }
            return true;
        }
    }
}
