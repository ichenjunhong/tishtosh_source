package dmt.p2652av.video.superentrance;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39645w;
import com.p683ss.android.ugc.aweme.port.p2082in.C39645w.C39646a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.superentrance.c */
public final class C53008c {

    /* renamed from: a */
    public final AmeActivity f131449a;

    /* renamed from: b */
    private boolean f131450b;

    /* renamed from: c */
    private boolean f131451c;

    /* renamed from: d */
    private boolean f131452d;

    /* renamed from: dmt.av.video.superentrance.c$a */
    public static final class C53009a implements C39646a {

        /* renamed from: a */
        final /* synthetic */ C53008c f131453a;

        /* renamed from: b */
        final /* synthetic */ C52671b f131454b;

        C53009a(C53008c cVar, C52671b bVar) {
            this.f131453a = cVar;
            this.f131454b = bVar;
        }

        /* renamed from: a */
        public final void mo80715a(String[] strArr, int[] iArr) {
            boolean z;
            boolean z2;
            C53002a.m112726a(strArr, iArr);
            if (iArr != null) {
                if (iArr.length == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    int length = iArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = true;
                            break;
                        } else if (iArr[i] != 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            z = false;
            if (z) {
                this.f131454b.invoke(Boolean.valueOf(true));
            } else {
                this.f131454b.invoke(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: dmt.av.video.superentrance.c$b */
    static final class C53010b implements OnCancelListener {

        /* renamed from: a */
        public static final C53010b f131455a = new C53010b();

        C53010b() {
        }

        public final void onCancel(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: dmt.av.video.superentrance.c$c */
    static final class C53011c implements OnClickListener {

        /* renamed from: a */
        public static final C53011c f131456a = new C53011c();

        C53011c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: dmt.av.video.superentrance.c$d */
    static final class C53012d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C53008c f131457a;

        /* renamed from: b */
        final /* synthetic */ boolean f131458b;

        /* renamed from: c */
        final /* synthetic */ C52671b f131459c;

        C53012d(C53008c cVar, boolean z, C52671b bVar) {
            this.f131457a = cVar;
            this.f131458b = z;
            this.f131459c = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f131458b) {
                C39618d.f101145I.mo58605c().mo49441d(this.f131457a.f131449a);
                dialogInterface.dismiss();
                return;
            }
            this.f131457a.mo110561a(this.f131459c);
        }
    }

    /* renamed from: b */
    private final boolean m112735b() {
        if (!this.f131451c || !this.f131450b || !this.f131452d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m112734a() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (C39618d.f101145I.mo58605c().mo49440c(this.f131449a) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f131450b = z;
        if (C39618d.f101145I.mo58605c().mo49439b(this.f131449a) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f131451c = z2;
        if (C39618d.f101145I.mo58605c().mo49434a(this.f131449a) == 0) {
            z3 = true;
        }
        this.f131452d = z3;
        return m112735b();
    }

    public C53008c(AmeActivity ameActivity) {
        C52711k.m112240b(ameActivity, "activity");
        this.f131449a = ameActivity;
    }

    /* renamed from: a */
    public final void mo110561a(C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "requestPermissionCallback");
        if (m112734a()) {
            bVar.invoke(Boolean.valueOf(true));
            return;
        }
        if (!C39618d.f101145I.mo58605c().mo49437a()) {
            bVar.invoke(Boolean.valueOf(false));
            return;
        }
        List arrayList = new ArrayList();
        if (!this.f131450b) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!this.f131451c) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!this.f131452d) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            for (String a : strArr) {
                C26890h.m65011a("permission_toast_show", C23089d.m56640a().mo47829a("permission_type", C53002a.m112724a(a)).mo47829a("enter_from", "video_shoot_page").f61491a);
            }
            C39645w c = C39618d.f101144H.mo58572c();
            AmeActivity ameActivity = this.f131449a;
            if (ameActivity != null) {
                c.mo49436a(ameActivity, new C53009a(this, bVar), (String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
