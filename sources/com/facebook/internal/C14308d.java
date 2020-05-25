package com.facebook.internal;

import android.content.Intent;
import com.facebook.C13855f;
import com.facebook.C14533n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.d */
public final class C14308d implements C13855f {

    /* renamed from: b */
    private static final String f37248b = "d";

    /* renamed from: c */
    private static Map<Integer, C14309a> f37249c = new HashMap();

    /* renamed from: a */
    public Map<Integer, C14309a> f37250a = new HashMap();

    /* renamed from: com.facebook.internal.d$a */
    public interface C14309a {
        /* renamed from: a */
        boolean mo26520a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.d$b */
    public enum C14310b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);
        

        /* renamed from: a */
        private final int f37252a;

        public final int toRequestCode() {
            C14283ab.m29303a();
            return C14533n.f37755c + this.f37252a;
        }

        private C14310b(int i) {
            this.f37252a = i;
        }
    }

    /* renamed from: a */
    private static synchronized C14309a m29347a(Integer num) {
        C14309a aVar;
        synchronized (C14308d.class) {
            aVar = (C14309a) f37249c.get(num);
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo26519b(int i, C14309a aVar) {
        C14283ab.m29306a((Object) aVar, "callback");
        this.f37250a.put(Integer.valueOf(i), aVar);
    }

    /* renamed from: a */
    public static synchronized void m29348a(int i, C14309a aVar) {
        synchronized (C14308d.class) {
            C14283ab.m29306a((Object) aVar, "callback");
            if (!f37249c.containsKey(Integer.valueOf(i))) {
                f37249c.put(Integer.valueOf(i), aVar);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25994a(int i, int i2, Intent intent) {
        C14309a aVar = (C14309a) this.f37250a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.mo26520a(i2, intent);
        }
        C14309a a = m29347a(Integer.valueOf(i));
        if (a != null) {
            return a.mo26520a(i2, intent);
        }
        return false;
    }
}
