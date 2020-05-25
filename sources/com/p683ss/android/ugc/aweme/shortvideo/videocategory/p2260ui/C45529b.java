package com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui;

import android.app.Application;
import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a.C45490b;
import com.p683ss.android.ugc.aweme.tools.C46811b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.b */
public final class C45529b extends C1331h {

    /* renamed from: b */
    public static final C45530a f115045b = new C45530a(null);

    /* renamed from: a */
    List<C45490b> f115046a;

    /* renamed from: c */
    private final boolean f115047c;

    /* renamed from: d */
    private final int f115048d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.b$a */
    public static final class C45530a {
        private C45530a() {
        }

        public /* synthetic */ C45530a(C52707g gVar) {
            this();
        }
    }

    public C45529b() {
        this(0, 1, null);
    }

    /* renamed from: a */
    private final boolean m99171a(int i) {
        if (i % this.f115048d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m99173b(int i) {
        if ((i + 1) % this.f115048d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m99175c(int i) {
        int i2 = this.f115048d;
        if (i >= 0 && i2 > i) {
            return true;
        }
        return false;
    }

    public C45529b(int i) {
        this.f115048d = i;
        this.f115047c = C46811b.m101654a(C39629l.m88233b());
        this.f115046a = C52575l.m112097a();
    }

    /* renamed from: a */
    private final int m99169a(int i, int i2) {
        int size = this.f115046a.size();
        boolean z = false;
        if (i < 0 || size <= i) {
            return 0;
        }
        int i3 = ((C45490b) this.f115046a.get(i)).f114945b;
        Object obj = ((C45490b) this.f115046a.get(i)).f114947d;
        switch (((C45490b) this.f115046a.get(i)).f114944a) {
            case 0:
                return m99174c(i3, i2);
            case 1:
                if (obj instanceof C52847n) {
                    Object second = ((C52847n) obj).getSecond();
                    if (!(second instanceof Boolean)) {
                        second = null;
                    }
                    Boolean bool = (Boolean) second;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                }
                return m99170a(z, i2);
            case 2:
                return m99172b(i3, i2);
            case 3:
                return 0;
            default:
                StringBuilder sb = new StringBuilder("Unsupported direction, direction = ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static int m99170a(boolean z, int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                if (!z) {
                    return 0;
                }
                Application b = C39629l.m88233b();
                C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                return b.getResources().getDimensionPixelOffset(R.dimen.a0z);
            case 2:
                return 0;
            case 3:
                return 0;
            default:
                StringBuilder sb = new StringBuilder("Unsupported direction, direction = ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private final int m99172b(int i, int i2) {
        switch (i2) {
            case 0:
                if (m99171a(i)) {
                    Application b = C39629l.m88233b();
                    C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                    return b.getResources().getDimensionPixelOffset(R.dimen.a0x);
                }
                Application b2 = C39629l.m88233b();
                C52711k.m112236a((Object) b2, "CameraClient.getApplication()");
                return b2.getResources().getDimensionPixelOffset(R.dimen.a0y);
            case 1:
                Application b3 = C39629l.m88233b();
                C52711k.m112236a((Object) b3, "CameraClient.getApplication()");
                return b3.getResources().getDimensionPixelOffset(R.dimen.a0z);
            case 2:
                if (!m99173b(i)) {
                    return 0;
                }
                Application b4 = C39629l.m88233b();
                C52711k.m112236a((Object) b4, "CameraClient.getApplication()");
                return b4.getResources().getDimensionPixelOffset(R.dimen.a0x);
            case 3:
                Application b5 = C39629l.m88233b();
                C52711k.m112236a((Object) b5, "CameraClient.getApplication()");
                return b5.getResources().getDimensionPixelOffset(R.dimen.a0z);
            default:
                StringBuilder sb = new StringBuilder("Unsupported direction, direction = ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private final int m99174c(int i, int i2) {
        switch (i2) {
            case 0:
                if (m99171a(i)) {
                    Application b = C39629l.m88233b();
                    C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                    return b.getResources().getDimensionPixelOffset(R.dimen.a0x);
                }
                Application b2 = C39629l.m88233b();
                C52711k.m112236a((Object) b2, "CameraClient.getApplication()");
                return b2.getResources().getDimensionPixelOffset(R.dimen.a0y);
            case 1:
                if (m99175c(i)) {
                    Application b3 = C39629l.m88233b();
                    C52711k.m112236a((Object) b3, "CameraClient.getApplication()");
                    return b3.getResources().getDimensionPixelOffset(R.dimen.a0z);
                }
                Application b4 = C39629l.m88233b();
                C52711k.m112236a((Object) b4, "CameraClient.getApplication()");
                return b4.getResources().getDimensionPixelOffset(R.dimen.a0y);
            case 2:
                if (!m99173b(i)) {
                    return 0;
                }
                Application b5 = C39629l.m88233b();
                C52711k.m112236a((Object) b5, "CameraClient.getApplication()");
                return b5.getResources().getDimensionPixelOffset(R.dimen.a0x);
            case 3:
                return 0;
            default:
                StringBuilder sb = new StringBuilder("Unsupported direction, direction = ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private /* synthetic */ C45529b(int i, int i2, C52707g gVar) {
        this(3);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        int g = RecyclerView.m4276g(view);
        int i2 = 0;
        if (this.f115047c) {
            i = 2;
        } else {
            i = 0;
        }
        rect.left = m99169a(g, i);
        if (!this.f115047c) {
            i2 = 2;
        }
        rect.right = m99169a(g, i2);
        rect.top = m99169a(g, 1);
        rect.bottom = m99169a(g, 3);
    }
}
