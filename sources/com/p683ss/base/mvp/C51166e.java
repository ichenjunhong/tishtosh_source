package com.p683ss.base.mvp;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.base.mvp.C51164c;
import com.p683ss.base.mvp.p2548a.C51162a;
import com.p683ss.base.p2547b.C51160c;
import com.ss.base.mvp.e$a.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

/* renamed from: com.ss.base.mvp.e */
public class C51166e<T extends C51164c> implements C51161a {

    /* renamed from: a */
    protected Context f127788a;

    /* renamed from: b */
    T f127789b;

    /* renamed from: c */
    protected Bundle f127790c;

    /* renamed from: d */
    protected ArrayList<C51162a> f127791d = new ArrayList<>();

    /* renamed from: e */
    private String f127792e = UUID.randomUUID().toString();

    /* renamed from: f */
    private final Class<T> f127793f;

    /* renamed from: g */
    private final C51167a f127794g;

    /* renamed from: h */
    private T f127795h;

    /* renamed from: com.ss.base.mvp.e$a */
    class C51167a implements InvocationHandler {

        /* renamed from: a */
        Queue<a> f127796a;

        /* renamed from: com.ss.base.mvp.e$a$a */
        class C51168a {

            /* renamed from: a */
            Method f127798a;

            /* renamed from: b */
            Object[] f127799b;

            private C51168a() {
            }

            /* synthetic */ C51168a(C51167a aVar, byte b) {
                this();
            }
        }

        /* renamed from: a */
        public final void mo101701a() {
            if (C51166e.this.f127789b != null) {
                while (!this.f127796a.isEmpty()) {
                    C51168a aVar = (C51168a) this.f127796a.poll();
                    try {
                        aVar.f127798a.invoke(C51166e.this.f127789b, aVar.f127799b);
                    } catch (Exception e) {
                        throw new IllegalStateException("apply pending method invocation error when view attached", e);
                    }
                }
            }
        }

        private C51167a() {
            this.f127796a = new LinkedList();
        }

        /* synthetic */ C51167a(C51166e eVar, byte b) {
            this();
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (C51160c.m110049a()) {
                C51168a aVar = new C51168a(this, 0);
                aVar.f127798a = method;
                aVar.f127799b = objArr;
                this.f127796a.offer(aVar);
                mo101701a();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final void mo101685a() {
        this.f127789b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo101696b(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo101697c(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo101698d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo101700f() {
        if (this.f127788a == null) {
            throw new IllegalStateException("Do not call this method before onInit");
        }
    }

    /* renamed from: b */
    public final void mo101690b() {
        Iterator it = this.f127791d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: c */
    public final void mo101691c() {
        mo101698d();
        this.f127789b = null;
        Iterator it = this.f127791d.iterator();
        while (it.hasNext()) {
            ((C51162a) it.next()).mo101692a();
        }
        this.f127794g.f127796a.clear();
        this.f127791d.clear();
    }

    /* renamed from: e */
    public final T mo101699e() {
        if (C51160c.m110049a()) {
            if (this.f127795h == null) {
                this.f127795h = (C51164c) Proxy.newProxyInstance(this.f127793f.getClassLoader(), new Class[]{this.f127793f}, this.f127794g);
            }
            return this.f127795h;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo101689a(C51164c cVar) {
        this.f127789b = cVar;
        this.f127794g.mo101701a();
    }

    /* renamed from: a */
    public final void mo101688a(Bundle bundle) {
        bundle.putString("SAVE_ID", this.f127792e);
        mo101697c(bundle);
    }

    public C51166e(Class<T> cls) {
        this.f127793f = cls;
        this.f127794g = new C51167a<>(this, 0);
    }

    /* renamed from: a */
    public final void mo101686a(int i, int i2, Bundle bundle) {
        Iterator it = this.f127791d.iterator();
        while (it.hasNext()) {
            ((C51162a) it.next()).mo101693a(i, i2, bundle);
        }
    }

    /* renamed from: a */
    public final void mo101687a(Context context, Bundle bundle, Bundle bundle2) {
        this.f127788a = context.getApplicationContext();
        this.f127790c = bundle;
        if (bundle2 != null) {
            this.f127792e = bundle2.getString("SAVE_ID");
        }
        mo101696b(bundle2);
    }
}
