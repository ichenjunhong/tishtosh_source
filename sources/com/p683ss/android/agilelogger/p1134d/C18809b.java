package com.p683ss.android.agilelogger.p1134d;

import com.p683ss.android.agilelogger.C18816f;
import com.p683ss.android.agilelogger.p1133c.C18804a;
import com.p683ss.android.agilelogger.p1133c.C18805b;
import com.p683ss.android.agilelogger.p1136f.C18822d;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.agilelogger.d.b */
public abstract class C18809b implements C18810c {

    /* renamed from: b */
    protected List<C18804a> f51972b = new LinkedList();

    /* renamed from: c */
    protected C18805b f51973c = new C18805b();

    /* renamed from: d */
    public int f51974d;

    /* renamed from: e */
    protected SimpleDateFormat f51975e = new SimpleDateFormat("yyyy-MM-dd z HH:mm:ss.SSS", Locale.ENGLISH);

    /* renamed from: a */
    public void mo38400a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38401a(C18816f fVar);

    /* renamed from: b */
    public void mo38402b() {
    }

    public C18809b() {
        this.f51975e.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        this.f51972b.add(this.f51973c);
    }

    /* renamed from: a */
    public final void mo38403a(int i) {
        this.f51973c.f51958a = i;
    }

    /* renamed from: a */
    public final void mo38404a(List<C18804a> list) {
        if (!C18822d.m45910a(list)) {
            this.f51972b.addAll(list);
        }
    }

    /* renamed from: b */
    public final void mo38405b(C18816f fVar) {
        boolean z = false;
        for (C18804a a : this.f51972b) {
            if (!a.mo38398a(fVar)) {
                z = true;
            }
        }
        if (!z && fVar != null && fVar.f51988d != null) {
            mo38401a(fVar);
        }
    }
}
