package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15428c.C15429a;
import com.google.android.gms.common.internal.C15428c.C15430b;
import com.google.android.gms.common.internal.C15447h.C15448a;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C15446g<T extends IInterface> extends C15428c<T> implements C15222f, C15448a {

    /* renamed from: a */
    private final Set<Scope> f39846a;

    /* renamed from: l */
    public final C15441d f39847l;

    /* renamed from: m */
    private final Account f39848m;

    protected C15446g(Context context, Looper looper, int i, C15441d dVar, C15235b bVar, C15236c cVar) {
        this(context, looper, C15449i.m32101a(context), GoogleApiAvailability.getInstance(), i, dVar, (C15235b) C15464q.m32123a(bVar), (C15236c) C15464q.m32123a(cVar));
    }

    /* renamed from: m */
    public final Account mo28410m() {
        return this.f39848m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Set<Scope> mo28414q() {
        return this.f39846a;
    }

    /* renamed from: e */
    public int mo27967e() {
        return super.mo27967e();
    }

    private C15446g(Context context, Looper looper, C15449i iVar, GoogleApiAvailability googleApiAvailability, int i, C15441d dVar, C15235b bVar, C15236c cVar) {
        C15430b bVar2;
        C15441d dVar2 = dVar;
        C15235b bVar3 = bVar;
        C15236c cVar2 = cVar;
        C15429a xVar = bVar3 == null ? null : new C15474x(bVar3);
        if (cVar2 == null) {
            bVar2 = null;
        } else {
            bVar2 = new C15475y(cVar2);
        }
        super(context, looper, iVar, googleApiAvailability, i, xVar, bVar2, dVar2.f39833h);
        this.f39847l = dVar2;
        this.f39848m = dVar2.f39826a;
        Set<Scope> set = dVar2.f39828c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f39846a = set;
    }
}
