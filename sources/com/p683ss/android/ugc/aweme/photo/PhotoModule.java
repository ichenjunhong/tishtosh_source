package com.p683ss.android.ugc.aweme.photo;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;

/* renamed from: com.ss.android.ugc.aweme.photo.PhotoModule */
public class PhotoModule implements C0183j {

    /* renamed from: a */
    public static final int[] f98313a = {C38681j.f98387a, C38681j.f98388b};

    /* renamed from: b */
    public final AbsActivity f98314b;

    /* renamed from: c */
    public final C20426a f98315c;

    /* renamed from: d */
    public C38650a f98316d;

    /* renamed from: e */
    public final C38706r f98317e = new C38655c();

    /* renamed from: f */
    public C45547d f98318f;

    /* renamed from: g */
    public boolean f98319g;

    /* renamed from: com.ss.android.ugc.aweme.photo.PhotoModule$a */
    public interface C38650a {
        /* renamed from: a */
        void mo49449a(String str);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void dismissDialog() {
        if (this.f98318f != null && this.f98318f.isShowing()) {
            this.f98318f.dismiss();
        }
    }

    /* renamed from: a */
    public static boolean m85988a(String str) {
        if ((!C39629l.m88232a().mo58583n().mo83103a(C40790a.PhotoEditEnabled) || (!"direct_shoot".equals(str) && !"xs".equals(str) && !"prop_reuse".equals(str) && !"challenge".equals(str))) && !"task_platform".equals(str)) {
            boolean equals = "super_entrance".equals(str);
        }
        return false;
    }

    public PhotoModule(AbsActivity absActivity, C20426a aVar, C38650a aVar2) {
        this.f98314b = absActivity;
        this.f98315c = aVar;
        this.f98316d = aVar2;
        absActivity.getLifecycle().mo324a(this);
    }
}
