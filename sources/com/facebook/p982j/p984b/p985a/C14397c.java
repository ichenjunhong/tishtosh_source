package com.facebook.p982j.p984b.p985a;

import android.graphics.Color;
import com.facebook.p982j.p984b.C14394a;
import com.facebook.p982j.p984b.C14415e;
import com.facebook.p982j.p984b.C14428j;
import java.util.List;

/* renamed from: com.facebook.j.b.a.c */
public final class C14397c extends C14402e<C14415e, C14398a> {

    /* renamed from: a */
    private final C14399b f37389a;

    /* renamed from: com.facebook.j.b.a.c$a */
    public static class C14398a {

        /* renamed from: a */
        public int f37390a;

        /* renamed from: b */
        public int f37391b;
    }

    /* renamed from: com.facebook.j.b.a.c$b */
    public enum C14399b {
        START,
        END
    }

    /* renamed from: a */
    public static C14397c m29507a(C14428j jVar, C14399b bVar) {
        return new C14397c(jVar.f37469a, jVar.f37470b, bVar);
    }

    private C14397c(List<C14415e> list, float[][][] fArr, C14399b bVar) {
        super(list, fArr);
        this.f37389a = bVar;
    }

    /* renamed from: a */
    private static int m29506a(float f, int i, int i2) {
        int alpha = Color.alpha(i);
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        return ((alpha + ((int) (((float) (Color.alpha(i2) - alpha)) * f))) << 24) | ((red + ((int) (((float) (Color.red(i2) - red)) * f))) << 16) | ((green + ((int) (((float) (Color.green(i2) - green)) * f))) << 8) | (blue + ((int) (f * ((float) (Color.blue(i2) - blue)))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo26581a(C14394a aVar, C14394a aVar2, float f, Object obj) {
        C14415e eVar = (C14415e) aVar;
        C14415e eVar2 = (C14415e) aVar2;
        C14398a aVar3 = (C14398a) obj;
        if (eVar2 == null) {
            if (this.f37389a == C14399b.START) {
                aVar3.f37390a = eVar.f37424a;
            } else {
                aVar3.f37391b = eVar.f37424a;
            }
        } else if (this.f37389a == C14399b.START) {
            aVar3.f37390a = m29506a(f, eVar.f37424a, eVar2.f37424a);
        } else {
            aVar3.f37391b = m29506a(f, eVar.f37424a, eVar2.f37424a);
        }
    }
}
