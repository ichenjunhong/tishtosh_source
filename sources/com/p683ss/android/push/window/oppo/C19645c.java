package com.p683ss.android.push.window.oppo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.p683ss.android.push.window.oppo.C19655d.C19656a;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.push.window.oppo.c */
public final class C19645c {

    /* renamed from: a */
    public static C19643a f54113a;

    /* renamed from: t */
    private static C19645c f54114t;

    /* renamed from: b */
    public WindowManager f54115b;

    /* renamed from: c */
    public LayoutParams f54116c;

    /* renamed from: d */
    public View f54117d;

    /* renamed from: e */
    public Context f54118e;

    /* renamed from: f */
    public Handler f54119f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public String f54120g;

    /* renamed from: h */
    public boolean f54121h = false;

    /* renamed from: i */
    public int f54122i = 2005;

    /* renamed from: j */
    public int f54123j;

    /* renamed from: k */
    public int f54124k;

    /* renamed from: l */
    public int f54125l = 2;

    /* renamed from: m */
    public boolean f54126m;

    /* renamed from: n */
    public boolean f54127n = true;

    /* renamed from: o */
    public boolean f54128o = false;

    /* renamed from: p */
    public boolean f54129p = false;

    /* renamed from: q */
    public boolean f54130q = false;

    /* renamed from: r */
    public int f54131r = 0;

    /* renamed from: s */
    public Runnable f54132s = new Runnable() {
        public final void run() {
            C19645c cVar = C19645c.this;
            cVar.f54130q = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cVar.f54117d, "translationY", new float[]{(float) cVar.f54131r, (float) (-cVar.f54117d.getMeasuredHeight())});
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    try {
                        C19645c.this.f54130q = false;
                        C19645c.this.f54128o = false;
                        C19645c.this.f54115b.removeViewImmediate(C19645c.this.f54117d);
                    } catch (Exception unused) {
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    try {
                        C19645c.this.f54130q = false;
                        C19645c.this.f54128o = false;
                        C19645c.this.f54115b.removeViewImmediate(C19645c.this.f54117d);
                    } catch (Exception unused) {
                    }
                }
            });
            ofFloat.setDuration(200);
            ofFloat.start();
        }
    };

    /* renamed from: d */
    public static C19643a m48009d() {
        return f54113a;
    }

    /* renamed from: b */
    public final void mo40968b() {
        try {
            this.f54130q = false;
            this.f54128o = false;
            this.f54119f.removeCallbacks(this.f54132s);
            this.f54115b.removeViewImmediate(this.f54117d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private void m48010e() {
        boolean z;
        boolean z2;
        if (!TextUtils.isEmpty(this.f54120g)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f54120g);
                boolean z3 = false;
                if (jSONObject.optInt("is_show", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f54121h = z;
                if (jSONObject.optInt("is_cache_message", 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f54126m = z2;
                this.f54124k = jSONObject.optInt("show_time_mill", 5000);
                if (jSONObject.optInt("is_auto_dismiss", 1) == 1) {
                    z3 = true;
                }
                this.f54127n = z3;
                this.f54125l = jSONObject.optInt("cache_size", 2);
                this.f54122i = jSONObject.optInt("type", 2005);
                this.f54123j = jSONObject.optInt("flag", 1160);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    public final C19656a mo40969c() {
        C19655d a = C19655d.m48020a(this.f54118e);
        LinkedList linkedList = new LinkedList();
        if (!m48006a(a.f54147a).f54126m) {
            a.f54148b.mo40961a();
        } else {
            Map b = a.f54148b.mo40962b();
            if (!b.isEmpty()) {
                for (Entry entry : b.entrySet()) {
                    if (entry != null) {
                        linkedList.add(entry.getValue());
                    }
                }
            }
        }
        if (!linkedList.isEmpty()) {
            return (C19656a) linkedList.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo40967a() {
        if (!this.f54121h || C19657e.m48025a(this.f54118e) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo40964a(Editor editor) {
        editor.putString("tt_push_pop_window_rule", this.f54120g);
        m48010e();
    }

    /* renamed from: a */
    public static synchronized C19645c m48006a(Context context) {
        C19645c cVar;
        synchronized (C19645c.class) {
            if (f54113a != null) {
                if (f54114t == null) {
                    f54114t = new C19645c(context);
                }
                cVar = f54114t;
            } else {
                throw new RuntimeException("should call init(context, pushWindowDepend) in Application");
            }
        }
        return cVar;
    }

    private C19645c(Context context) {
        this.f54118e = context.getApplicationContext();
        this.f54115b = (WindowManager) context.getSystemService("window");
        this.f54119f.postDelayed(new Runnable() {
            public final void run() {
                if (C19645c.this.mo40967a() && C19645c.this.f54126m) {
                    C19645c.m48006a(C19645c.this.f54118e).mo40969c();
                }
            }
        }, 10000);
    }

    /* renamed from: a */
    public final void mo40965a(SharedPreferences sharedPreferences) {
        this.f54120g = sharedPreferences.getString("tt_push_pop_window_rule", "");
        m48010e();
    }

    /* renamed from: a */
    public static synchronized C19645c m48007a(Context context, C19643a aVar) {
        C19645c a;
        synchronized (C19645c.class) {
            f54113a = aVar;
            a = m48006a(context);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo40966a(String str, int i, String str2) {
        C19655d.m48020a(this.f54118e).mo40983a(1, str, i, str2);
    }

    /* renamed from: a */
    public static void m48008a(Context context, String str, long j, long j2, boolean z, JSONObject... jSONObjectArr) {
        JSONObject[] jSONObjectArr2 = jSONObjectArr;
        if (z) {
            if (jSONObjectArr2.length > 0) {
                f54113a.mo40957a(context, "umeng", "client_apn", str, j, -1, jSONObjectArr2[0]);
                return;
            }
            f54113a.mo40957a(context, "umeng", "client_apn", str, j, -1, null);
        } else if (jSONObjectArr2.length > 0) {
            f54113a.mo40957a(context, "umeng", "apn", str, j, -1, jSONObjectArr2[0]);
        } else {
            f54113a.mo40957a(context, "umeng", "apn", str, j, -1, null);
        }
    }
}
