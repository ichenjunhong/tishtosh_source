package com.p683ss.android.ugc.aweme.p1706fe.base;

import android.arch.lifecycle.C0183j;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.sdk.webview.C19749d;
import com.p683ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27151e;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod */
public abstract class BaseCommonJavaMethod implements C0183j, C10762d {

    /* renamed from: e */
    public WeakReference<Context> f77793e;

    /* renamed from: f */
    protected WeakReference<C19749d> f77794f;

    /* renamed from: g */
    protected C10757a f77795g;

    /* renamed from: com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a */
    public interface C29789a {
        /* renamed from: a */
        void mo60038a(int i, String str);

        /* renamed from: a */
        void mo60039a(Object obj);

        /* renamed from: a */
        void mo60040a(Object obj, int i, String str);

        /* renamed from: a */
        void mo60041a(JSONObject jSONObject);
    }

    public BaseCommonJavaMethod() {
    }

    /* renamed from: a */
    public abstract void mo49914a(JSONObject jSONObject, C29789a aVar) throws JSONException;

    /* renamed from: c */
    private C19749d mo95790c() {
        if (this.f77794f != null) {
            return (C19749d) this.f77794f.get();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbsActivityContainer mo60033a() {
        C19749d c = mo95790c();
        if (c != null) {
            return (AbsActivityContainer) c.mo41177a(AbsActivityContainer.class);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C22521l mo60036b() {
        C19749d c = mo95790c();
        if (c != null) {
            return (C22521l) c.mo41177a(C22521l.class);
        }
        return null;
    }

    /* renamed from: a */
    public BaseCommonJavaMethod mo60035a(WeakReference<Context> weakReference) {
        this.f77793e = weakReference;
        return this;
    }

    public BaseCommonJavaMethod(C10757a aVar) {
        this.f77795g = aVar;
    }

    /* renamed from: a */
    public final BaseCommonJavaMethod mo60034a(C19749d dVar) {
        if (dVar != null) {
            this.f77794f = new WeakReference<>(dVar);
        }
        return this;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) {
        try {
            C27151e.m65508a().mo55463b();
            JSONObject jSONObject2 = hVar.f28947d;
            if (jSONObject2 != null) {
                jSONObject2.put("func", hVar.f28946c);
            }
            final String str = hVar.f28945b;
            hVar.f28951h = false;
            final String str2 = hVar.f28950g;
            mo49914a(jSONObject2, new C29789a() {
                /* renamed from: a */
                public final void mo60039a(Object obj) {
                    if (BaseCommonJavaMethod.this.f77795g != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", 1);
                            jSONObject.put("data", obj);
                        } catch (JSONException unused) {
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            BaseCommonJavaMethod.this.f77795g.mo19454a(str2, str, jSONObject);
                            return;
                        }
                        BaseCommonJavaMethod.this.f77795g.mo19455a(str, jSONObject);
                    }
                }

                /* renamed from: a */
                public final void mo60041a(JSONObject jSONObject) {
                    if (BaseCommonJavaMethod.this.f77795g != null) {
                        if (!TextUtils.isEmpty(str2)) {
                            BaseCommonJavaMethod.this.f77795g.mo19454a(str2, str, jSONObject);
                            return;
                        }
                        BaseCommonJavaMethod.this.f77795g.mo19455a(str, jSONObject);
                    }
                }

                /* renamed from: a */
                public final void mo60038a(int i, String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("code", i);
                        jSONObject.put("msg", str);
                    } catch (JSONException unused) {
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        BaseCommonJavaMethod.this.f77795g.mo19454a(str2, str, jSONObject);
                    } else {
                        BaseCommonJavaMethod.this.f77795g.mo19455a(str, jSONObject);
                    }
                }

                /* renamed from: a */
                public final void mo60040a(Object obj, int i, String str) {
                    if (BaseCommonJavaMethod.this.f77795g != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", i);
                            jSONObject.put("msg", str);
                            jSONObject.put("data", obj);
                        } catch (JSONException unused) {
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            BaseCommonJavaMethod.this.f77795g.mo19454a(str2, str, jSONObject);
                            return;
                        }
                        BaseCommonJavaMethod.this.f77795g.mo19455a(str, jSONObject);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo60037b(String str, JSONObject jSONObject, int i) {
        if ((i == 1 || i == 3) && this.f77795g != null) {
            this.f77795g.mo19458b(str, jSONObject);
        }
    }
}
