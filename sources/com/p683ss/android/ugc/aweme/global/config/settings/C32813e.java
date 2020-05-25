package com.p683ss.android.ugc.aweme.global.config.settings;

import android.app.Application;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.C10198b;
import com.bytedance.ies.abmock.C10181b;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.C20852ac;
import com.p683ss.android.ugc.aweme.global.config.settings.C32811d.C32812a;
import com.p683ss.android.ugc.aweme.global.config.settings.SettingsUtil.C32807b;
import com.p683ss.android.ugc.aweme.global.config.settings._default.SettingsGroup;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.e */
final class C32813e {

    /* renamed from: a */
    final Object f85417a = new Object();

    /* renamed from: b */
    final CopyOnWriteArrayList<C32811d> f85418b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public IESSettingsProxy f85419c;

    /* renamed from: d */
    final IESSettings f85420d;

    /* renamed from: e */
    C17971f f85421e;

    /* renamed from: f */
    private final C32815g f85422f = new C32815g();

    /* renamed from: a */
    public final void mo66394a(boolean z) {
        C32815g gVar = this.f85422f;
        gVar.f85424a = z;
        gVar.mo66397b();
    }

    C32813e(Application application) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(new SettingsGroup());
        new C32806a();
        IESSettings a = C32806a.m75700a(copyOnWriteArrayList);
        this.f85421e = new C32807b(a, copyOnWriteArrayList).f85409a;
        C10198b bVar = new C10198b(application, IESSettings.ADAPTER, new C32821l(a), null, false);
        this.f85420d = (IESSettings) bVar.mo18225a(C10198b.m20654a(bVar.f27526a));
        mo66392a(this.f85420d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo66392a(IESSettings iESSettings) {
        synchronized (this.f85417a) {
            if (iESSettings == null) {
                try {
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (C10181b.m20511a().f27515d.mo18216a()) {
                    this.f85419c = new C20852ac(iESSettings, this.f85422f);
                } else {
                    this.f85419c = new IESSettingsProxy(iESSettings, this.f85422f);
                }
                Iterator it = this.f85418b.iterator();
                while (it.hasNext()) {
                    C32811d dVar = (C32811d) it.next();
                    dVar.change(this.f85419c);
                    if (dVar instanceof C32812a) {
                        this.f85418b.remove(dVar);
                    }
                }
                new Handler(Looper.getMainLooper()).post(C32814f.f85423a);
            }
        }
    }

    /* renamed from: a */
    public final void mo66391a(C32811d dVar, boolean z) {
        synchronized (this.f85417a) {
            CopyOnWriteArrayList<C32811d> copyOnWriteArrayList = this.f85418b;
            if (z) {
                dVar = new C32812a(dVar);
            }
            copyOnWriteArrayList.add(dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> void mo66393a(String str, Class<T> cls, T t) {
        C32815g gVar = this.f85422f;
        gVar.f85425b.put(str, t);
        Editor edit = gVar.mo66396a().edit();
        if (t instanceof String) {
            edit.putString(str, (String) t);
        } else if (t instanceof Integer) {
            edit.putInt(str, ((Integer) t).intValue());
        } else if (t instanceof Float) {
            edit.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Long) {
            edit.putLong(str, ((Long) t).longValue());
        } else if (t instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Set) {
            edit.putStringSet(str, (Set) t);
        }
        edit.apply();
    }
}
