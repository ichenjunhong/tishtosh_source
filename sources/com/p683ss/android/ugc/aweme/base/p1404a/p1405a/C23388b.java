package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.C22718c;
import com.p683ss.android.ugc.aweme.base.p1417h.C23537b;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28219f;
import com.p683ss.android.ugc.aweme.festival.christmas.C31364d;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33122m;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36211e;
import com.p683ss.android.ugc.aweme.memory.C36771b;
import com.p683ss.android.ugc.aweme.p1382aq.p1385c.C23230a;
import com.p683ss.android.ugc.aweme.setting.C41536al;
import com.p683ss.android.ugc.aweme.setting.model.IVerifyActionCache;
import com.p683ss.android.ugc.aweme.setting.util.C41899a.C41900a;
import com.p683ss.android.ugc.aweme.share.C41962ag;
import com.p683ss.android.ugc.aweme.story.shootvideo.C46666b;
import com.p683ss.android.ugc.trill.share.p2525a.C50413a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.b */
public final class C23388b {

    /* renamed from: a */
    public static Map<Class, Object> f62414a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m57471a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface()) {
            return null;
        }
        if (C22718c.class.equals(cls)) {
            T t = f62414a.get(cls);
            if (t == null || !(t instanceof C23400n)) {
                t = new C23400n(applicationContext);
                f62414a.put(cls, t);
            }
            return t;
        } else if (C36771b.class.equals(cls)) {
            T t2 = f62414a.get(cls);
            if (t2 == null || !(t2 instanceof C23410x)) {
                t2 = new C23410x(applicationContext);
                f62414a.put(cls, t2);
            }
            return t2;
        } else if (C36211e.class.equals(cls)) {
            T t3 = f62414a.get(cls);
            if (t3 == null || !(t3 instanceof C23408v)) {
                t3 = new C23408v(applicationContext);
                f62414a.put(cls, t3);
            }
            return t3;
        } else if (C41962ag.class.equals(cls)) {
            T t4 = f62414a.get(cls);
            if (t4 == null || !(t4 instanceof C23382aj)) {
                t4 = new C23382aj(applicationContext);
                f62414a.put(cls, t4);
            }
            return t4;
        } else if (C23537b.class.equals(cls)) {
            T t5 = f62414a.get(cls);
            if (t5 == null || !(t5 instanceof C23401o)) {
                t5 = new C23401o(applicationContext);
                f62414a.put(cls, t5);
            }
            return t5;
        } else if (C28219f.class.equals(cls)) {
            T t6 = f62414a.get(cls);
            if (t6 == null || !(t6 instanceof C23403q)) {
                t6 = new C23403q(applicationContext);
                f62414a.put(cls, t6);
            }
            return t6;
        } else if (C31364d.class.equals(cls)) {
            T t7 = f62414a.get(cls);
            if (t7 == null || !(t7 instanceof C23405s)) {
                t7 = new C23405s(applicationContext);
                f62414a.put(cls, t7);
            }
            return t7;
        } else if (C33122m.class.equals(cls)) {
            T t8 = f62414a.get(cls);
            if (t8 == null || !(t8 instanceof C23407u)) {
                t8 = new C23407u(applicationContext);
                f62414a.put(cls, t8);
            }
            return t8;
        } else if (C23230a.class.equals(cls)) {
            T t9 = f62414a.get(cls);
            if (t9 == null || !(t9 instanceof C23411y)) {
                t9 = new C23411y(applicationContext);
                f62414a.put(cls, t9);
            }
            return t9;
        } else if (C41536al.class.equals(cls)) {
            T t10 = f62414a.get(cls);
            if (t10 == null || !(t10 instanceof C23379ag)) {
                t10 = new C23379ag(applicationContext);
                f62414a.put(cls, t10);
            }
            return t10;
        } else if (IVerifyActionCache.class.equals(cls)) {
            T t11 = f62414a.get(cls);
            if (t11 == null || !(t11 instanceof C23380ah)) {
                t11 = new C23380ah(applicationContext);
                f62414a.put(cls, t11);
            }
            return t11;
        } else if (C41900a.class.equals(cls)) {
            T t12 = f62414a.get(cls);
            if (t12 == null || !(t12 instanceof C23381ai)) {
                t12 = new C23381ai(applicationContext);
                f62414a.put(cls, t12);
            }
            return t12;
        } else if (C46666b.class.equals(cls)) {
            T t13 = f62414a.get(cls);
            if (t13 == null || !(t13 instanceof C23386an)) {
                t13 = new C23386an(applicationContext);
                f62414a.put(cls, t13);
            }
            return t13;
        } else if (!C50413a.class.equals(cls)) {
            return null;
        } else {
            T t14 = f62414a.get(cls);
            if (t14 == null || !(t14 instanceof C23387ao)) {
                t14 = new C23387ao(applicationContext);
                f62414a.put(cls, t14);
            }
            return t14;
        }
    }
}
