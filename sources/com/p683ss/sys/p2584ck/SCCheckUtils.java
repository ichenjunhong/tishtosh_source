package com.p683ss.sys.p2584ck;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnKeyListener;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.p1096a.p1097a.C18477a;
import com.p683ss.p1096a.p1098b.C18484d;
import com.p683ss.sys.p2584ck.C51421a.C51425a;
import com.p683ss.sys.p2584ck.C51438b.C51441a;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ck.SCCheckUtils */
public class SCCheckUtils {
    public static SCCheckCallback sCallback;
    private static volatile SCCheckUtils sCkInstance;
    public Activity activity;
    protected int appID;
    protected String appName = "";
    protected int challenge_code;
    protected String channel = "";
    public Context ctx;
    protected String deviceID = "";
    private C51444e dlg;
    protected String iid = "";
    protected String language = "";
    private SCCheckListener listener;
    private HashMap<String, String> maps;
    private float percent;
    protected String session = "";
    protected int versionCode;

    private SCCheckUtils(Context context, String str, int i, String str2, String str3, String str4, String str5) {
        this.ctx = context.getApplicationContext();
        this.maps = new HashMap<>();
        RegisterJSBridge();
        try {
            updateHttpParams(str, i, str2, str3, str4, str5);
            this.versionCode = this.ctx.getPackageManager().getPackageInfo(this.ctx.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
        }
    }

    public static void closeDialog(WebView webView, final JSONObject jSONObject, C51443d dVar) {
        try {
            getInstance().activity.runOnUiThread(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x001f A[Catch:{ Throwable -> 0x0027 }] */
                /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r3 = this;
                        com.ss.sys.ck.SCCheckUtils r0 = com.p683ss.sys.p2584ck.SCCheckUtils.getInstance()     // Catch:{ Throwable -> 0x0027 }
                        r0.dlgDismiss()     // Catch:{ Throwable -> 0x0027 }
                        r0 = 0
                        org.json.JSONObject r1 = r1     // Catch:{ Exception -> 0x0014 }
                        java.lang.String r2 = "result"
                        int r1 = r1.getInt(r2)     // Catch:{ Exception -> 0x0014 }
                        if (r1 != 0) goto L_0x0014
                        r1 = 1
                        goto L_0x0015
                    L_0x0014:
                        r1 = 0
                    L_0x0015:
                        com.ss.sys.ck.SCCheckUtils r2 = com.p683ss.sys.p2584ck.SCCheckUtils.getInstance()     // Catch:{ Throwable -> 0x0027 }
                        com.ss.sys.ck.SCCheckListener r2 = r2.getListener()     // Catch:{ Throwable -> 0x0027 }
                        if (r2 == 0) goto L_0x0027
                        r2.dialogOnClose(r0)     // Catch:{ Throwable -> 0x0027 }
                        java.lang.String r0 = ""
                        r2.dialogOnResult(r1, r0)     // Catch:{ Throwable -> 0x0027 }
                    L_0x0027:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.p2584ck.SCCheckUtils.C514184.run():void");
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static SCCheckUtils getInstance() {
        return sCkInstance;
    }

    public static void resgisterSCCheckUtilsCallBack(SCCheckCallback sCCheckCallback) {
        sCallback = sCCheckCallback;
    }

    /* access modifiers changed from: protected */
    public void dlgDismiss() {
        if (this.dlg != null) {
            this.dlg.dismiss();
            this.dlg = null;
        }
    }

    public String getAid() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(getInstance().appID);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getChannel() {
        try {
            return getInstance().channel;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getDid() {
        try {
            return getInstance().deviceID;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getIid() {
        try {
            return getInstance().iid;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public SCCheckListener getListener() {
        return this.listener;
    }

    public String getSession() {
        try {
            return getInstance().session;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getUid() {
        return "";
    }

    /* access modifiers changed from: protected */
    public void netWorkError() {
        try {
            if (this.activity != null) {
                this.activity.runOnUiThread(new Runnable() {
                    public final void run() {
                        String str;
                        String str2;
                        String str3;
                        try {
                            if (!SCCheckUtils.this.activity.isFinishing()) {
                                try {
                                    str = SCCheckUtils.this.ctx.getResources().getString(R.string.va);
                                } catch (Throwable unused) {
                                    str = "NETWORK ERROR, TRY LATTER";
                                }
                                try {
                                    str2 = SCCheckUtils.this.ctx.getResources().getString(R.string.v_);
                                } catch (Throwable unused2) {
                                    str2 = "CONTINUE";
                                }
                                try {
                                    str3 = SCCheckUtils.this.ctx.getResources().getString(R.string.v9);
                                } catch (Throwable unused3) {
                                    str3 = "CANCEL";
                                }
                                final C51421a aVar = new C51421a(SCCheckUtils.getInstance().activity, str, str2, str3);
                                aVar.f128581a = new C51425a() {
                                    /* renamed from: a */
                                    public final void mo102150a() {
                                        SCCheckUtils.getInstance().dlgDismiss();
                                    }

                                    /* renamed from: b */
                                    public final void mo102151b() {
                                        SCCheckUtils.getInstance().reloadUrl();
                                    }
                                };
                                aVar.setOnKeyListener(new OnKeyListener() {
                                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                                        if (i != 4 || keyEvent.getRepeatCount() != 0) {
                                            return false;
                                        }
                                        aVar.dismiss();
                                        SCCheckUtils.this.dlgDismiss();
                                        return true;
                                    }
                                });
                                aVar.show();
                            }
                        } catch (Throwable unused4) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void reloadUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(getUrl());
        sb.append("&challenge_code=");
        sb.append(this.challenge_code);
        String sb2 = sb.toString();
        if (this.dlg != null && this.dlg.f128634a != null) {
            this.dlg.f128634a.loadUrl(sb2);
        }
    }

    public void setDialogTouch(boolean z) {
        if (this.dlg != null) {
            this.dlg.setCanceledOnTouchOutside(z);
        }
    }

    public boolean updateHttpParams(String str, int i, String str2, String str3, String str4, String str5) {
        this.language = str;
        if (str == null || TextUtils.isEmpty(str)) {
            this.language = Locale.getDefault().getLanguage();
            this.language = this.language == null ? "zh-cn" : this.language;
            if (this.language.equalsIgnoreCase("zh")) {
                try {
                    this.language = Locale.getDefault().getCountry().equalsIgnoreCase("tw") ? "zh-tw" : "zh-cn";
                } catch (Throwable unused) {
                    this.language = "zh-cn";
                }
            }
        }
        this.appID = i;
        this.iid = str3;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            this.appName = str2;
        }
        if (str4 != null && !TextUtils.isEmpty(str4)) {
            this.deviceID = str4;
        }
        if (str5 != null && !TextUtils.isEmpty(str5)) {
            this.channel = str5;
        }
        return true;
    }

    public String getUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(C51438b.f128620b);
        sb.append("?aid=");
        sb.append(this.appID);
        sb.append("&lang=");
        sb.append(this.language);
        sb.append("&app_name=");
        sb.append(this.appName);
        sb.append("&iid=");
        sb.append(this.iid);
        sb.append("&vc=");
        sb.append(this.versionCode);
        sb.append("&did=");
        sb.append(this.deviceID);
        sb.append("&ch=");
        sb.append(this.channel);
        sb.append("&os=0");
        return sb.toString();
    }

    public static SCCheckUtils getInstance(Context context, String str, int i, String str2, String str3, String str4, String str5) {
        if (sCkInstance == null) {
            synchronized (SCCheckUtils.class) {
                if (sCkInstance == null) {
                    C18477a.m44715b(i);
                    SCCheckUtils sCCheckUtils = new SCCheckUtils(context, str, i, str2, str3, str4, str5);
                    sCkInstance = sCCheckUtils;
                    C51441a aVar = new C51441a(Integer.valueOf(1105), 1.1533333f, 200);
                    C51441a aVar2 = new C51441a(Integer.valueOf(3058), 1.1533333f, 200);
                    C51441a aVar3 = new C51441a(Integer.valueOf(10031), 1.1533333f, 200);
                    C51441a aVar4 = new C51441a(Integer.valueOf(1104), 0.9533333f, 200);
                    C51441a aVar5 = new C51441a(Integer.valueOf(3059), 0.9533333f, 200);
                    C51441a aVar6 = new C51441a(Integer.valueOf(10030), 0.9533333f, 200);
                    C51438b.f128622d.put(aVar.f128627a, aVar);
                    C51438b.f128622d.put(aVar2.f128627a, aVar2);
                    C51438b.f128622d.put(aVar3.f128627a, aVar3);
                    C51438b.f128622d.put(aVar4.f128627a, aVar4);
                    C51438b.f128622d.put(aVar5.f128627a, aVar5);
                    C51438b.f128622d.put(aVar6.f128627a, aVar6);
                    new Thread("CZL-11") {
                        public final void run() {
                            try {
                                Context context = SCCheckUtils.getInstance().ctx;
                                Long.valueOf(0);
                                long longValue = Long.valueOf(C35807d.m80935a(context, "sdk_config", 0).getLong("vs_wait", 0)).longValue();
                                new StringBuilder("vs_wait exec time ").append(longValue);
                                if (longValue <= 0) {
                                    longValue = 5000;
                                }
                                Thread.currentThread();
                                Thread.sleep(longValue);
                            } catch (Throwable unused) {
                            }
                            C51438b.m110620a();
                        }
                    }.start();
                    new Thread("CZL-22") {
                        public final void run() {
                            C18484d.m44731a(3600000);
                            C51438b.m110620a();
                        }
                    }.start();
                }
            }
        }
        return sCkInstance;
    }

    public void popupCheckCode(Activity activity2, String str, int i, SCCheckListener sCCheckListener) {
        this.activity = activity2;
        this.listener = sCCheckListener;
        this.challenge_code = i;
        if ((this.dlg == null || !this.dlg.isShowing()) && !activity2.isFinishing()) {
            dlgDismiss();
            View inflate = activity2.getLayoutInflater().inflate(R.layout.aej, null);
            StringBuilder sb = new StringBuilder();
            sb.append(getUrl());
            sb.append("&challenge_code=");
            sb.append(i);
            C51444e eVar = new C51444e(activity2, 0, 0, inflate, R.style.gz, sb.toString(), str);
            this.dlg = eVar;
            this.dlg.f128635b = C51438b.f128622d.containsKey(Integer.valueOf(i)) ? (C51441a) C51438b.f128622d.get(Integer.valueOf(i)) : new C51441a(Integer.valueOf(1005), 1.1533333f, 200);
            this.dlg.show();
            this.dlg.setOnCancelListener(new OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    SCCheckUtils.this.dlgDismiss();
                    SCCheckListener listener = SCCheckUtils.this.getListener();
                    if (listener != null) {
                        listener.dialogOnClose(1);
                        listener.dialogOnResult(false, "");
                    }
                }
            });
            this.dlg.setOnKeyListener(new OnKeyListener() {
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i != 4 || keyEvent.getRepeatCount() != 0) {
                        return false;
                    }
                    SCCheckUtils.this.dlgDismiss();
                    SCCheckListener listener = SCCheckUtils.this.getListener();
                    if (listener != null) {
                        listener.dialogOnClose(2);
                        listener.dialogOnResult(false, "");
                    }
                    return true;
                }
            });
        }
    }

    private void RegisterJSBridge() {
        Method[] declaredMethods;
        String str = "TTCK";
        Class<SCCheckUtils> cls = SCCheckUtils.class;
        if (!C51442c.f128630a.containsKey(str)) {
            try {
                Map<String, HashMap<String, Method>> map = C51442c.f128630a;
                HashMap hashMap = new HashMap();
                for (Method method : cls.getDeclaredMethods()) {
                    if (method.getModifiers() == 9) {
                        String name = method.getName();
                        if (name != null) {
                            Class<C51443d>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes != null && parameterTypes.length == 3 && parameterTypes[0] == WebView.class && parameterTypes[1] == JSONObject.class && parameterTypes[2] == C51443d.class) {
                                hashMap.put(name, method);
                            }
                        }
                    }
                }
                map.put(str, hashMap);
            } catch (Exception unused) {
            }
        }
    }
}
