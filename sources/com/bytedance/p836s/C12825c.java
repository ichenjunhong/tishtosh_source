package com.bytedance.p836s;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.s.c */
public final class C12825c {

    /* renamed from: d */
    public static String f33576d = "TTVideoSettingsStoreKey";

    /* renamed from: i */
    private static C12825c f33577i;

    /* renamed from: a */
    Context f33578a;

    /* renamed from: b */
    public JSONObject f33579b;

    /* renamed from: c */
    public JSONObject f33580c;

    /* renamed from: e */
    final ReentrantReadWriteLock f33581e = new ReentrantReadWriteLock();

    /* renamed from: f */
    public final ReentrantReadWriteLock f33582f = new ReentrantReadWriteLock();

    /* renamed from: g */
    public ArrayList<C12824b> f33583g = new ArrayList<>();

    /* renamed from: h */
    public boolean f33584h = false;

    /* renamed from: a */
    public static synchronized C12825c m25728a(Context context) throws JSONException {
        C12825c cVar;
        synchronized (C12825c.class) {
            if (f33577i == null) {
                f33577i = new C12825c(context.getApplicationContext());
            }
            cVar = f33577i;
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo24293a(int i) {
        this.f33582f.readLock().lock();
        Iterator it = this.f33583g.iterator();
        while (it.hasNext()) {
            ((C12824b) it.next()).oNotify(0);
        }
        this.f33582f.readLock().unlock();
    }

    private C12825c(Context context) throws JSONException {
        this.f33578a = context;
        if (this.f33584h) {
            String a = C12826d.m25732a(this.f33578a, f33576d);
            if (a == null || a.isEmpty()) {
                this.f33579b = new JSONObject();
                this.f33580c = new JSONObject();
            } else {
                this.f33579b = new JSONObject(a);
                this.f33580c = new JSONObject(a);
            }
        }
    }
}
