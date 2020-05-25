package android.support.design.p023b;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.support.design.p023b.C0403c.C0404a;
import android.support.design.widget.C0560l;
import android.util.Property;

/* renamed from: android.support.design.b.d */
public interface C0405d extends C0404a {

    /* renamed from: android.support.design.b.d$a */
    public static class C0407a implements TypeEvaluator<C0410d> {

        /* renamed from: a */
        public static final TypeEvaluator<C0410d> f1302a = new C0407a();

        /* renamed from: b */
        private final C0410d f1303b = new C0410d();

        public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            C0410d dVar = (C0410d) obj;
            C0410d dVar2 = (C0410d) obj2;
            this.f1303b.mo929a(C0560l.m1540a(dVar.f1306a, dVar2.f1306a, f), C0560l.m1540a(dVar.f1307b, dVar2.f1307b, f), C0560l.m1540a(dVar.f1308c, dVar2.f1308c, f));
            return this.f1303b;
        }
    }

    /* renamed from: android.support.design.b.d$b */
    public static class C0408b extends Property<C0405d, C0410d> {

        /* renamed from: a */
        public static final Property<C0405d, C0410d> f1304a = new C0408b("circularReveal");

        private C0408b(String str) {
            super(C0410d.class, str);
        }

        public final /* synthetic */ Object get(Object obj) {
            return ((C0405d) obj).getRevealInfo();
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((C0405d) obj).setRevealInfo((C0410d) obj2);
        }
    }

    /* renamed from: android.support.design.b.d$c */
    public static class C0409c extends Property<C0405d, Integer> {

        /* renamed from: a */
        public static final Property<C0405d, Integer> f1305a = new C0409c("circularRevealScrimColor");

        private C0409c(String str) {
            super(Integer.class, str);
        }

        public final /* synthetic */ Object get(Object obj) {
            return Integer.valueOf(((C0405d) obj).getCircularRevealScrimColor());
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((C0405d) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: android.support.design.b.d$d */
    public static class C0410d {

        /* renamed from: a */
        public float f1306a;

        /* renamed from: b */
        public float f1307b;

        /* renamed from: c */
        public float f1308c;

        private C0410d() {
        }

        /* renamed from: a */
        public final boolean mo931a() {
            if (this.f1308c == Float.MAX_VALUE) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo930a(C0410d dVar) {
            mo929a(dVar.f1306a, dVar.f1307b, dVar.f1308c);
        }

        public C0410d(C0410d dVar) {
            this(dVar.f1306a, dVar.f1307b, dVar.f1308c);
        }

        /* renamed from: a */
        public final void mo929a(float f, float f2, float f3) {
            this.f1306a = f;
            this.f1307b = f2;
            this.f1308c = f3;
        }

        public C0410d(float f, float f2, float f3) {
            this.f1306a = f;
            this.f1307b = f2;
            this.f1308c = f3;
        }
    }

    /* renamed from: a */
    void mo900a();

    /* renamed from: b */
    void mo902b();

    int getCircularRevealScrimColor();

    C0410d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C0410d dVar);
}
