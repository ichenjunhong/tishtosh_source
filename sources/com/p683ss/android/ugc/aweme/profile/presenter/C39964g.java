package com.p683ss.android.ugc.aweme.profile.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.C1160b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileCoverLibActivity;
import com.p683ss.android.ugc.aweme.profile.util.C40557p;
import com.p683ss.android.ugc.aweme.profile.util.C40557p.C40565b;
import com.p683ss.android.ugc.aweme.utils.C47663ad;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.C45331a;
import com.zhihu.matisse.C45333b;
import com.zhihu.matisse.p2249a.C45332a;
import java.io.File;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.g */
public final class C39964g {

    /* renamed from: g */
    public static final int f101886g = 1;

    /* renamed from: h */
    public static final int f101887h = 2;

    /* renamed from: i */
    public static final C39965a f101888i = new C39965a(null);

    /* renamed from: a */
    public Activity f101889a;

    /* renamed from: b */
    public C1160b f101890b;

    /* renamed from: c */
    public final String[] f101891c;

    /* renamed from: d */
    public File f101892d;

    /* renamed from: e */
    public final Fragment f101893e = null;

    /* renamed from: f */
    public final boolean f101894f = true;

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.g$a */
    public static final class C39965a {
        private C39965a() {
        }

        public /* synthetic */ C39965a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.g$b */
    public static final class C39966b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39964g f101895a;

        public C39966b(C39964g gVar) {
            this.f101895a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            String str2;
            switch (i) {
                case 0:
                    str2 = "camera";
                    C39964g gVar = this.f101895a;
                    C23361b.m57419a(gVar.f101889a, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C39967c(gVar));
                    C23183v a = C23183v.m56778a();
                    C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
                    a.mo47916l().mo47776a(Integer.valueOf(Integer.MAX_VALUE));
                    break;
                case 1:
                    str2 = "sys_album";
                    C39964g gVar2 = this.f101895a;
                    C23361b.m57419a(gVar2.f101889a, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C39968d(gVar2));
                    C23183v a2 = C23183v.m56778a();
                    C52711k.m112236a((Object) a2, "CommonSharePrefCache.inst()");
                    a2.mo47916l().mo47776a(Integer.valueOf(Integer.MAX_VALUE));
                    break;
                case 2:
                    str = "app_album";
                    C39964g gVar3 = this.f101895a;
                    Intent intent = new Intent(gVar3.f101889a, ProfileCoverLibActivity.class);
                    Activity activity = gVar3.f101889a;
                    if (activity == null) {
                        C52711k.m112234a();
                    }
                    activity.startActivity(intent);
                    C23183v a3 = C23183v.m56778a();
                    C52711k.m112236a((Object) a3, "CommonSharePrefCache.inst()");
                    C23051bf l = a3.mo47916l();
                    C52711k.m112236a((Object) l, "CommonSharePrefCache.inst().editCoverTipShowTime");
                    l.mo47776a(Integer.valueOf(Integer.MAX_VALUE));
                    if (this.f101895a.f101894f) {
                        Activity activity2 = this.f101895a.f101889a;
                        if (activity2 == null) {
                            C52711k.m112234a();
                        }
                        activity2.finish();
                        break;
                    }
                    break;
                default:
                    str = "cancel";
                    C1160b bVar = this.f101895a.f101890b;
                    if (bVar == null) {
                        C52711k.m112234a();
                    }
                    bVar.dismiss();
                    break;
            }
            str = str2;
            C26890h.m65011a("replace_profile_cover", new C23089d().mo47829a("enter_method", str).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.g$c */
    static final class C39967c implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C39964g f101896a;

        C39967c(C39964g gVar) {
            this.f101896a = gVar;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            if (strArr.length > 1 && iArr[0] == 0 && iArr[1] == 0) {
                this.f101896a.f101892d = new File(C48016e.m103934a("profileCover"), "profileCoverOrigin.data");
                Activity activity = this.f101896a.f101889a;
                if (activity == null) {
                    C52711k.m112234a();
                }
                Fragment fragment = this.f101896a.f101893e;
                int i = C39964g.f101887h;
                File file = this.f101896a.f101892d;
                if (file == null) {
                    C52711k.m112234a();
                }
                String parent = file.getParent();
                C52711k.m112236a((Object) parent, "mProfileCoverFile!!.parent");
                File file2 = this.f101896a.f101892d;
                if (file2 == null) {
                    C52711k.m112234a();
                }
                String name = file2.getName();
                C52711k.m112236a((Object) name, "mProfileCoverFile!!.name");
                C47663ad.m103171a(activity, fragment, i, parent, name);
                return;
            }
            Activity activity2 = this.f101896a.f101889a;
            if (activity2 == null) {
                C52711k.m112234a();
            }
            C10691a.m21543b((Context) activity2, (int) R.string.cny, 0).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.g$d */
    static final class C39968d implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C39964g f101897a;

        C39968d(C39964g gVar) {
            this.f101897a = gVar;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            C45331a aVar;
            C52711k.m112236a((Object) strArr, "permissions");
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z) || iArr[0] != 0) {
                Activity activity = this.f101897a.f101889a;
                if (activity == null) {
                    C52711k.m112234a();
                }
                C10691a.m21543b((Context) activity, (int) R.string.co0, 0).mo19066a();
            } else {
                C39964g gVar = this.f101897a;
                int i = C39964g.f101886g;
                try {
                    if (gVar.f101893e == null) {
                        aVar = C45331a.m98815a(gVar.f101889a);
                    } else {
                        aVar = C45331a.m98816a(gVar.f101893e);
                    }
                    aVar.mo91622a(C45333b.ofImage()).mo91630a(true).mo91632b(false).mo91631b(1).mo91633c(-1).mo91628a((int) R.style.hh).mo91627a(0.85f).mo91629a((C45332a) new C40565b()).mo91634d(i);
                } catch (Exception e) {
                    C32458a.m75143a(e);
                    Activity activity2 = gVar.f101889a;
                    if (activity2 == null) {
                        C52711k.m112234a();
                    }
                    C19547d.m47841a(activity2, gVar.f101893e, i);
                }
            }
        }
    }

    public C39964g(Activity activity, Fragment fragment, boolean z) {
        this.f101889a = activity;
        if (this.f101889a == null) {
            Fragment fragment2 = this.f101893e;
            if (fragment2 == null) {
                C52711k.m112234a();
            }
            this.f101889a = fragment2.getActivity();
        }
        Activity activity2 = this.f101889a;
        if (activity2 == null) {
            C52711k.m112234a();
        }
        String[] a = C40557p.m89975a(activity2.getResources(), 0, 1, 2, 4);
        C52711k.m112236a((Object) a, "HeadUploadHelper.resStri…_STRING_ARRAY_IDX_CANCEL)");
        this.f101891c = a;
    }
}
