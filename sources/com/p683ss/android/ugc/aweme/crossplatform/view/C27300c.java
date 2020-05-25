package com.p683ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p683ss.android.common.applog.GlobalContext;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.c */
public final class C27300c extends CrossPlatformWebView {

    /* renamed from: i */
    public static final C27301a f72022i = new C27301a(null);

    /* renamed from: j */
    private boolean f72023j;

    /* renamed from: k */
    private Activity f72024k;

    /* renamed from: l */
    private boolean f72025l;

    /* renamed from: m */
    private boolean f72026m = true;

    /* renamed from: n */
    private final String f72027n;

    /* renamed from: o */
    private HashMap f72028o;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.c$a */
    public static final class C27301a {
        private C27301a() {
        }

        public /* synthetic */ C27301a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final View mo55669a(int i) {
        if (this.f72028o == null) {
            this.f72028o = new HashMap();
        }
        View view = (View) this.f72028o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f72028o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final boolean getMFromPreload() {
        return this.f72025l;
    }

    public final boolean getMLoadRnSuccess() {
        return this.f72026m;
    }

    public final Activity getActivity() {
        Activity activity = super.getActivity();
        if (activity != null) {
            return activity;
        }
        return this.f72024k;
    }

    /* access modifiers changed from: protected */
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater cloneInContext = LayoutInflater.from(getContext()).cloneInContext(getContext());
        C52711k.m112236a((Object) cloneInContext, "LayoutInflater.from(cont…).cloneInContext(context)");
        return cloneInContext;
    }

    public final void setMFromPreload(boolean z) {
        this.f72025l = z;
    }

    public final void setMLoadRnSuccess(boolean z) {
        this.f72026m = z;
    }

    /* renamed from: g */
    public final void mo55690g(Activity activity) {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        if (C27278a.m65729a(this.f72027n) == this) {
            mo55675a("onDestroy");
        } else {
            super.mo55690g(activity);
        }
    }

    /* renamed from: e */
    public final void mo55688e(Activity activity) {
        C52711k.m112240b(activity, "activity");
        super.mo55688e(activity);
        this.f72024k = activity;
        Context context = getContext();
        if (!(context instanceof MutableContextWrapper)) {
            context = null;
        }
        MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context;
        if (mutableContextWrapper != null) {
            mutableContextWrapper.setBaseContext(activity);
        }
        String str = this.f72027n;
        C52711k.m112240b(str, "url");
        Integer num = (Integer) C27278a.f71959a.get(str);
        if (num == null) {
            C27278a.f71959a.put(str, Integer.valueOf(1));
        } else {
            C27278a.f71959a.put(str, Integer.valueOf(num.intValue() + 1));
        }
        C23794bh.m58383I().sendInitDataToFe(this);
    }

    /* renamed from: f */
    public final void mo55689f(Activity activity) {
        C52711k.m112240b(activity, "activity");
        super.mo55689f(activity);
        this.f72024k = null;
        Context context = getContext();
        if (!(context instanceof MutableContextWrapper)) {
            context = null;
        }
        MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context;
        if (mutableContextWrapper != null) {
            mutableContextWrapper.setBaseContext(GlobalContext.getContext());
        }
        String str = this.f72027n;
        C52711k.m112240b(str, "url");
        Integer num = (Integer) C27278a.f71959a.get(str);
        if (num == null) {
            C27278a.f71959a.put(str, Integer.valueOf(0));
        } else if (num.intValue() != 0) {
            C27278a.f71959a.put(str, Integer.valueOf(num.intValue() - 1));
        }
        mo55678a("search_middle_quit", (JSONObject) null, getReactId());
    }

    public C27300c(String str, Context context) {
        C52711k.m112240b(str, "mBaseUrl");
        C52711k.m112240b(context, "context");
        super(context, null, 0, 6, null);
        this.f72027n = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo55676a(String str, Map<String, String> map) {
        super.mo55676a(str, map);
        this.f72026m = false;
        C27278a.m65732b(this.f72027n);
        if (this.f72024k == null) {
            super.mo55690g(this.f72024k);
        }
    }

    /* renamed from: a */
    public final void mo55679a(String str, boolean z, boolean z2) {
        C52711k.m112240b(str, "url");
        if (!this.f72023j) {
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("container_launch_type", "preload");
            setAdditionalReportParams(linkedHashMap);
            super.mo55679a(str, z, z2);
            this.f72023j = true;
        }
    }
}
