package com.p683ss.android.ugc.aweme.profile.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.i18n.musically.cut.C33141f;
import com.p683ss.android.ugc.aweme.i18n.musically.cut.C33141f.C33145a;
import com.p683ss.android.ugc.aweme.profile.util.C40557p.C40564a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.util.b */
public final class C40537b extends C40557p {

    /* renamed from: a */
    protected String f103435a;

    /* renamed from: com.ss.android.ugc.aweme.profile.util.b$a */
    public interface C40541a extends C40564a {
        /* renamed from: a */
        void mo80922a(Activity activity, View view);

        /* renamed from: b */
        void mo80924b();

        /* renamed from: b */
        void mo80926b(String str);
    }

    /* renamed from: a */
    public final boolean mo82810a(int i, int i2, Intent intent) {
        return i == 10004;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo82811b() {
        return this.f103435a;
    }

    /* renamed from: a */
    public final void mo82806a() {
        new C33141f().mo70183a(this.f103482b, new C33145a() {
            /* renamed from: a */
            public final void mo70187a(String str) {
                if (C40537b.this.f103488h != null) {
                    ((C40541a) C40537b.this.f103488h).mo80926b(str);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo82807a(int i) {
        m89943a(i, mo82811b());
    }

    /* renamed from: a */
    public final void mo82808a(final View view) {
        new C11105a(this.f103482b).mo20142a((CharSequence[]) this.f103483c.getStringArray(R.array.ba), (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(C40537b.this.f103485e)) {
                    C10691a.m21548c((Context) C40537b.this.f103482b, (int) R.string.da8).mo19066a();
                    return;
                }
                switch (i) {
                    case 0:
                        C40537b.this.mo82806a();
                        return;
                    case 1:
                        if (C40537b.this.f103488h != null) {
                            ((C40541a) C40537b.this.f103488h).mo80924b();
                            return;
                        }
                        break;
                    case 2:
                        if (C40537b.this.f103488h != null) {
                            ((C40541a) C40537b.this.f103488h).mo80922a(C40537b.this.f103482b, view);
                            break;
                        }
                        break;
                }
            }
        }).mo20143a().show();
    }

    /* renamed from: a */
    public final void mo82809a(String str) {
        this.f103435a = str;
        m89943a(0, str);
    }

    /* renamed from: a */
    private void m89943a(int i, final String str) {
        C18842a.m45933a(new Runnable() {
            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append(Api.f61284d);
                sb.append("?uid=");
                sb.append(C20902b.m53242a().getCurUserId());
                C20902b.m53242a().uploadVideoAvatar(C40537b.this.f103487g, sb.toString(), 4194304, str);
                C20902b.m53242a().getCurUser().setAvatarUpdateReminder(false);
            }
        }, i);
    }

    public C40537b(Activity activity, Fragment fragment, C9381g gVar, C40541a aVar) {
        super(activity, fragment, gVar, aVar);
    }
}
