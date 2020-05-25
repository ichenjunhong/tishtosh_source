package com.p683ss.android.ugc.aweme.freeflowcard.strategy;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.strategy.a */
public class C32492a implements C32494c {

    /* renamed from: a */
    public static volatile String f84587a = "";

    /* renamed from: b */
    public static volatile boolean f84588b;

    /* renamed from: d */
    private static volatile C32492a f84589d;

    /* renamed from: c */
    private List<C32495d> f84590c = new ArrayList();

    /* renamed from: b */
    public final boolean mo65808b() {
        return true;
    }

    private C32492a() {
        this.f84590c.add(C32493b.f84591a);
        this.f84590c.add(C32496e.f84592a);
        this.f84590c.add(C32500g.f84601b);
    }

    /* renamed from: a */
    public static C32492a m75236a() {
        if (f84589d == null) {
            synchronized (C32492a.class) {
                if (f84589d == null) {
                    f84589d = new C32492a();
                }
            }
        }
        return f84589d;
    }

    /* renamed from: a */
    public final boolean mo65806a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        f84587a = str;
        boolean a = mo65807a(false);
        f84587a = "";
        return a;
    }

    /* renamed from: a */
    public final boolean mo65807a(boolean z) {
        if (!C23718g.m58207b().mo49153d()) {
            return true;
        }
        for (C32495d dVar : this.f84590c) {
            if (dVar.mo65808b()) {
                return dVar.mo65807a(z);
            }
        }
        return true;
    }
}
