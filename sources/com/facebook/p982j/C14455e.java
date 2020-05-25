package com.facebook.p982j;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.facebook.p982j.C14433c.C14434a;
import com.facebook.p982j.p984b.C14430k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.j.e */
public final class C14455e {

    /* renamed from: a */
    public C14430k f37544a;

    /* renamed from: b */
    public int f37545b = 60;

    /* renamed from: c */
    public C14456a f37546c = new C14456a();

    /* renamed from: com.facebook.j.e$a */
    public class C14456a {

        /* renamed from: a */
        public Map<String, C14434a> f37547a;

        /* renamed from: a */
        public final C14433c mo26618a() {
            C14455e eVar = C14455e.this;
            if (eVar.f37544a != null) {
                return new C14433c(eVar);
            }
            throw new IllegalArgumentException("No KFImage provided!");
        }

        public C14456a() {
        }

        /* renamed from: a */
        public final C14456a mo26619a(Pair<String, Pair<Drawable, Matrix>>... pairArr) {
            this.f37547a = new HashMap();
            for (int i = 0; i <= 0; i++) {
                Pair<String, Pair<Drawable, Matrix>> pair = pairArr[0];
                this.f37547a.put(pair.first, new C14434a((Drawable) ((Pair) pair.second).first, (Matrix) ((Pair) pair.second).second));
            }
            return this;
        }
    }

    /* renamed from: a */
    public final C14455e mo26617a(C14430k kVar) {
        this.f37544a = kVar;
        return this;
    }
}
