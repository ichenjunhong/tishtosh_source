package com.p683ss.android.ugc.aweme.i18n.musically.cut;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.p683ss.android.ugc.aweme.utils.p2388b.C47705a;
import com.p683ss.android.ugc.aweme.utils.p2388b.C47705a.C47706a;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.f */
public final class C33141f implements C47706a {

    /* renamed from: a */
    C33146b f86037a;

    /* renamed from: b */
    private C33145a f86038b;

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.f$a */
    public interface C33145a {
        /* renamed from: a */
        void mo70187a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.f$b */
    public interface C33146b {
        /* renamed from: a */
        void mo70152a(Intent intent);
    }

    /* renamed from: b */
    public final void mo70184b(Activity activity, C33145a aVar) {
        this.f86038b = aVar;
        new C47705a(activity).mo94988a(new Intent(activity, AvatarChooseActivity.class), 2, this);
    }

    /* renamed from: a */
    public final void mo70183a(final Activity activity, final C33145a aVar) {
        if (C47946e.m103737c(activity) == 0) {
            mo70184b(activity, aVar);
            return;
        }
        C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
            /* renamed from: a */
            public final void mo40906a(String[] strArr, int[] iArr) {
                if (activity != null && !activity.isFinishing()) {
                    if (iArr[0] == 0) {
                        C33141f.this.mo70184b(activity, aVar);
                        return;
                    }
                    Activity activity = activity;
                    C1160b b = new C1161a(activity, R.style.mp).mo3758a((int) R.string.ci3).mo3768b((int) R.string.ci1).mo3769b((int) R.string.wf, (OnClickListener) new OnClickListener(activity) {

                        /* renamed from: a */
                        final /* synthetic */ Activity f86043a;

                        {
                            this.f86043a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            this.f86043a.finish();
                        }
                    }).mo3759a((int) R.string.ah2, (OnClickListener) new OnClickListener(activity) {

                        /* renamed from: a */
                        final /* synthetic */ Activity f86042a;

                        {
                            this.f86042a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C47720bh.m103294a(this.f86042a);
                        }
                    }).mo3772b();
                    try {
                        b.setCancelable(false);
                        b.setCanceledOnTouchOutside(false);
                        b.show();
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo44816a(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 2) {
                this.f86038b.mo70187a(intent.getStringExtra("mp4"));
                return;
            }
            if (i == 3) {
                this.f86037a.mo70152a(intent);
            }
        }
    }
}
