package p2628d.p2650m;

import java.util.regex.Matcher;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: d.m.m */
public final class C52826m {

    /* renamed from: d.m.m$a */
    public static final class C52827a extends C52712l implements C52671b<T, Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f131078a;

        public C52827a(int i) {
            this.f131078a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((T) (Enum) obj));
        }

        public final boolean invoke(T t) {
            C52811f fVar = (C52811f) t;
            if ((this.f131078a & fVar.getMask()) == fVar.getValue()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final int m112384a(Iterable<? extends C52811f> iterable) {
        int i = 0;
        for (C52811f value : iterable) {
            i |= value.getValue();
        }
        return i;
    }

    /* renamed from: a */
    public static final C52815j m112385a(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C52816k(matcher, charSequence);
    }
}
