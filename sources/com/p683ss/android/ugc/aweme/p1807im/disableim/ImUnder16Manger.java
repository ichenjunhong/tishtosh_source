package com.p683ss.android.ugc.aweme.p1807im.disableim;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Typeface;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p666b.C10657o.C10658a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.keva.Keva;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.p1807im.disableim.C33185b.C33188c;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.im.disableim.ImUnder16Manger */
public final class ImUnder16Manger {

    /* renamed from: a */
    public static final IUnder16Api f86148a = ((IUnder16Api) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(IUnder16Api.class));

    /* renamed from: b */
    static boolean f86149b;

    /* renamed from: c */
    static boolean f86150c;

    /* renamed from: d */
    public static boolean f86151d = true;

    /* renamed from: e */
    static boolean f86152e;

    /* renamed from: f */
    static boolean f86153f;

    /* renamed from: g */
    public static boolean f86154g;

    /* renamed from: h */
    static String f86155h = "";

    /* renamed from: i */
    static String f86156i = "";

    /* renamed from: j */
    static String f86157j = "";

    /* renamed from: k */
    static String f86158k = "";

    /* renamed from: l */
    public static String f86159l = "";

    /* renamed from: m */
    public static String f86160m = "";

    /* renamed from: n */
    public static long f86161n = Long.MAX_VALUE;

    /* renamed from: o */
    static final Keva f86162o = Keva.getRepo("disable_im_under_sixteen_repo");

    /* renamed from: p */
    public static final ImUnder16Manger f86163p = new ImUnder16Manger();

    /* renamed from: com.ss.android.ugc.aweme.im.disableim.ImUnder16Manger$IUnder16Api */
    public interface IUnder16Api {
        @C53075f(mo110603a = "/aweme/v1/im/disable/chat/notice/")
        C0013i<C33184a> getUnder16Info();

        @C53075f(mo110603a = "/aweme/v1/im/disable/status/upload/")
        C0013i<BaseResponse> uploadStatus(@C53089t(mo110619a = "status") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.disableim.ImUnder16Manger$a */
    public static final class C33183a<TTaskResult, TContinuationResult> implements C0011g<C33184a, C52860x> {

        /* renamed from: a */
        public static final C33183a f86164a = new C33183a();

        C33183a() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            C33184a aVar = (C33184a) iVar.mo34e();
            if (aVar != null) {
                ImUnder16Manger.f86162o.storeBoolean("show_msg_disappear_alert", aVar.f86167c);
                ImUnder16Manger.f86162o.storeBoolean("is_chat_function_off", aVar.f86168d);
                ImUnder16Manger.f86162o.storeBoolean("show_msg_privacy_entrance", aVar.f86175k);
                ImUnder16Manger.f86162o.storeString("download_data_page_url", aVar.f86169e);
                ImUnder16Manger.f86162o.storeString("msg_disappear_page_url", aVar.f86170f);
                ImUnder16Manger.f86162o.storeString("alert_title", aVar.f86171g);
                ImUnder16Manger.f86162o.storeString("alert_content", aVar.f86172h);
                ImUnder16Manger.f86162o.storeString("chat_cell_title", aVar.f86173i);
                ImUnder16Manger.f86162o.storeString("chat_cell_content", aVar.f86174j);
                ImUnder16Manger.f86162o.storeBoolean("show_msg_disappear_chat_cell", aVar.f86176l);
                ImUnder16Manger.f86162o.storeBoolean("clear_im_chatlist", aVar.f86178n);
                ImUnder16Manger.f86162o.storeBoolean("redirect_to_msg_disappear_page", aVar.f86177m);
                ImUnder16Manger.f86162o.storeLong("msg_disappear_chat_cell_server_time", aVar.f86179o);
            }
            return C52860x.f131107a;
        }
    }

    private ImUnder16Manger() {
    }

    /* renamed from: a */
    public static IUnder16Api m76247a() {
        return f86148a;
    }

    /* renamed from: b */
    public static boolean m76249b() {
        return f86149b;
    }

    /* renamed from: c */
    public static boolean m76250c() {
        return f86150c;
    }

    /* renamed from: d */
    public static boolean m76251d() {
        return f86152e;
    }

    /* renamed from: e */
    public static boolean m76252e() {
        return f86153f;
    }

    /* renamed from: f */
    public static String m76253f() {
        return f86155h;
    }

    /* renamed from: g */
    public static String m76254g() {
        return f86156i;
    }

    /* renamed from: h */
    public static String m76255h() {
        return f86157j;
    }

    /* renamed from: i */
    public static String m76256i() {
        return f86158k;
    }

    /* renamed from: a */
    public static void m76248a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C33185b bVar = new C33185b(activity);
        if (m76249b() && !C13248c.m26638a(m76255h()) && !C13248c.m26638a(m76256i())) {
            DmtTextView dmtTextView = (DmtTextView) new C10643a(bVar.f86183c).mo18906c().mo18892a(m76255h()).mo18902b(m76256i()).mo18888a((OnDismissListener) new C33187b(bVar)).mo18905b(false).mo18890a((C10658a) new C33188c(bVar)).mo18893a(bVar.f86183c.getString(R.string.h_g), (OnClickListener) new C33189d(bVar)).mo18908c(bVar.f86183c.getString(R.string.h_f), C33190e.f86188a).mo18897a().mo18883c().findViewById(R.id.emw);
            if (dmtTextView != null) {
                dmtTextView.setTextColor(-16777216);
            }
            if (dmtTextView != null) {
                dmtTextView.setTypeface(Typeface.defaultFromStyle(1));
            }
            f86162o.storeBoolean("show_msg_disappear_alert", false);
        }
    }
}
