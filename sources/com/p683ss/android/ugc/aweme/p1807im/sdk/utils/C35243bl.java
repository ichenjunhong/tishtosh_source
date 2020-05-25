package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import com.p683ss.android.ugc.aweme.C23791bg;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImMayaPreDownloadSettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34602c.C34603a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h.C34371a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.service.C35430c;
import com.p683ss.android.ugc.aweme.p1807im.service.C35433d;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35469f;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35472i;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35423b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53682y.C53684a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bl */
public final class C35243bl {

    /* renamed from: a */
    public static C35262bt f90555a = new C35262bt();

    /* renamed from: b */
    public static int f90556b = 80;

    /* renamed from: c */
    public static boolean f90557c = false;

    /* renamed from: d */
    public static C23791bg f90558d = null;

    /* renamed from: e */
    public static AtomicBoolean f90559e = new AtomicBoolean(false);

    /* renamed from: f */
    private static AtomicBoolean f90560f = new AtomicBoolean(false);

    /* renamed from: a */
    public static boolean m79709a() {
        return C34371a.m78265a().isXPlanOpen();
    }

    /* renamed from: a */
    public static boolean m79710a(Context context) {
        return C18920g.m46052b(context, "my.maya.android");
    }

    /* renamed from: a */
    private static void m79703a(Dialog dialog, C35423b bVar) {
        if (!(dialog == null || bVar == null)) {
            bVar.getClass();
            dialog.setOnCancelListener(C35256bn.m79716a(bVar));
            bVar.getClass();
            dialog.setOnDismissListener(C35257bo.m79717a(bVar));
            bVar.getClass();
            dialog.setOnShowListener(C35258bp.m79718a(bVar));
        }
        if (dialog != null) {
            dialog.show();
        }
    }

    /* renamed from: a */
    public static void m79704a(Context context, int i, Object obj) {
        Intent intent = new Intent("android.intent.action.VIEW");
        C18922i a = m79693a(i, obj);
        User c = C35265e.m79732c();
        if (c != null) {
            a.mo38778a("uid", c.getUid());
            a.mo38778a("nick_name", c.getNickname());
            if (c.getAvatarMedium() != null && !C9376b.m18558a((Collection<T>) c.getAvatarMedium().getUrlList())) {
                a.mo38778a("image_url", (String) c.getAvatarMedium().getUrlList().get(0));
            }
        }
        intent.setData(Uri.parse(a.mo38774a()));
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m79707a(Context context, boolean z, final OnClickListener onClickListener) {
        String string = context.getString(R.string.bf7);
        if (!m79709a() || !z || !C35284t.m79782a().mo73416e() || !C35284t.m79782a().mo73408c(3)) {
            new C10643a(context).mo18902b(string).mo18886a((int) R.string.bg2, (OnClickListener) new C35259bq(onClickListener)).mo18900b((int) R.string.bf_, (OnClickListener) new C35260br(onClickListener)).mo18897a().mo18883c();
            return;
        }
        C10643a aVar = new C10643a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.boj));
        sb.append("，");
        sb.append(string);
        aVar.mo18902b(sb.toString()).mo18886a((int) R.string.bg2, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C35284t.m79782a().mo73401b(3);
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, -1);
                }
            }
        }).mo18900b((int) R.string.bf_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C35284t.m79782a().mo73401b(3);
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, -2);
                }
            }
        }).mo18897a().mo18883c();
    }

    /* renamed from: a */
    public static void m79705a(Context context, int i, boolean z, Runnable runnable) {
        m79706a(context, i, z, runnable, null);
    }

    /* renamed from: a */
    public static void m79706a(Context context, int i, boolean z, Runnable runnable, C35423b bVar) {
        boolean z2 = true;
        if (i == 1 || z) {
            if (!m79709a() || !C35284t.m79782a().mo73416e() || !C35284t.m79782a().mo73408c(i)) {
                z2 = false;
            }
            if (z2) {
                String string = context.getString(R.string.bom);
                switch (i) {
                    case 1:
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(context.getString(R.string.bok));
                        string = sb.toString();
                        break;
                    case 2:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(string);
                        sb2.append(context.getString(R.string.bol));
                        string = sb2.toString();
                        break;
                    case 3:
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(string);
                        sb3.append(context.getString(R.string.boj));
                        string = sb3.toString();
                        break;
                }
                C35261bs bsVar = new C35261bs(i, bVar, runnable);
                m79703a((Dialog) new C1161a(context, R.style.mp).mo3770b((CharSequence) string).mo3759a((int) R.string.bg2, (OnClickListener) bsVar).mo3769b((int) R.string.bf_, (OnClickListener) bsVar).mo3772b(), bVar);
                return;
            }
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static void m79708a(RemoteImageView remoteImageView, int i) {
        C13833a aVar = (C13833a) remoteImageView.getHierarchy();
        if (aVar != null) {
            aVar.mo25902b(i);
            aVar.mo25907c(i);
            return;
        }
        remoteImageView.setHierarchy(C13834b.m28085a(remoteImageView.getResources()).mo25926d(i).mo25920b(i).mo25912a());
    }

    /* renamed from: a */
    public static void m79702a(Activity activity, Object obj, int i, C35423b bVar) {
        if (activity != null && obj != null) {
            m79698a(activity, i, obj, bVar);
        }
    }

    /* renamed from: b */
    public static boolean m79712b() {
        return C34371a.m78265a().isXPlanB();
    }

    /* renamed from: c */
    public static boolean m79713c() {
        C35469f fVar = C34004b.m77717a().mo71949f().getIMSetting().f91147e;
        ArrayList arrayList = new ArrayList();
        arrayList.add("http://d.ppkankan01.com/PcVn/");
        if (fVar != null) {
            arrayList.add(fVar.f91186z);
            arrayList.add(fVar.f91158B);
            arrayList.add(fVar.f91157A);
            arrayList.add(fVar.f91159C);
            arrayList.add(fVar.mo73883a());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                DownloadInfo appDownloadInfo = C34004b.m77717a().mo71949f().getAppDownloadInfo(C11010c.m22280a(), str);
                if (appDownloadInfo != null && C19994e.m49356a(appDownloadInfo.getSavePath(), appDownloadInfo.getName(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private static int m79714d() {
        C35469f fVar = C34004b.m77717a().mo71949f().getIMSetting().f91147e;
        ArrayList arrayList = new ArrayList();
        arrayList.add("http://d.ppkankan01.com/PcVn/");
        if (fVar != null) {
            arrayList.add(fVar.f91186z);
            arrayList.add(fVar.f91157A);
            arrayList.add(fVar.f91158B);
            arrayList.add(fVar.f91159C);
            arrayList.add(fVar.mo73883a());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                DownloadInfo appDownloadInfo = C34004b.m77717a().mo71949f().getAppDownloadInfo(C11010c.m22280a(), str);
                if (appDownloadInfo != null && C19994e.m49356a(appDownloadInfo.getSavePath(), appDownloadInfo.getName(), false)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m79694a(int i) {
        C35469f fVar = C34004b.m77717a().mo71949f().getIMSetting().f91147e;
        f90557c = false;
        if (fVar == null) {
            return "http://d.ppkankan01.com/PcVn/";
        }
        int d = m79714d();
        C35262bt c = C35284t.m79782a().mo73405c();
        String str = null;
        if (d < 0) {
            if (c == null) {
                switch (i) {
                    case 1:
                        if (!TextUtils.isEmpty(fVar.f91186z)) {
                            str = fVar.f91186z;
                            break;
                        }
                        break;
                    case 2:
                    case 3:
                        if (!TextUtils.isEmpty(fVar.f91158B)) {
                            str = fVar.f91158B;
                            break;
                        }
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 10:
                    case 12:
                    case 13:
                        if (!TextUtils.isEmpty(fVar.f91159C)) {
                            str = fVar.f91159C;
                            break;
                        }
                        break;
                    case 8:
                    case 9:
                        if (!TextUtils.isEmpty(fVar.f91157A)) {
                            str = fVar.f91157A;
                            break;
                        }
                        break;
                    case 14:
                        if (!TextUtils.isEmpty(fVar.mo73883a())) {
                            str = fVar.mo73883a();
                            break;
                        }
                        break;
                }
            } else {
                if (!TextUtils.isEmpty(fVar.mo73883a())) {
                    str = fVar.mo73883a();
                }
                f90557c = true;
            }
        } else {
            switch (d) {
                case 0:
                    str = "http://d.ppkankan01.com/PcVn/";
                    break;
                case 1:
                    if (!TextUtils.isEmpty(fVar.f91186z)) {
                        str = fVar.f91186z;
                        break;
                    }
                    break;
                case 2:
                    if (!TextUtils.isEmpty(fVar.f91157A)) {
                        str = fVar.f91157A;
                        break;
                    }
                    break;
                case 3:
                    if (!TextUtils.isEmpty(fVar.f91158B)) {
                        str = fVar.f91158B;
                        break;
                    }
                    break;
                case 4:
                    if (!TextUtils.isEmpty(fVar.f91159C)) {
                        str = fVar.f91159C;
                        break;
                    }
                    break;
                case 5:
                    if (!TextUtils.isEmpty(fVar.mo73883a())) {
                        str = fVar.mo73883a();
                        break;
                    }
                    break;
            }
        }
        if (str == null) {
            return "http://d.ppkankan01.com/PcVn/";
        }
        return str;
    }

    /* renamed from: a */
    public static void m79695a(final Activity activity) {
        boolean z;
        C35459a.m80148a("XPlanUtils", "preDownloadX");
        if (!m79710a((Context) activity) && !m79713c()) {
            C34387b.m78292a();
            if (C34387b.m78309m() > ImMayaPreDownloadSettings.INSTANCE.getXDownloadConfig().getFriends_count()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder("preDownloadX, hasPreloadX = ");
                sb.append(f90560f.get());
                C35459a.m80148a("XPlanUtils", sb.toString());
                if (!f90560f.getAndSet(true)) {
                    final String a = m79694a(14);
                    StringBuilder sb2 = new StringBuilder("preDownloadX, url = ");
                    sb2.append(a);
                    C35459a.m80148a("XPlanUtils", sb2.toString());
                    new C53684a().mo111666a(true).mo111667a().mo111325a(new C53499a().mo111262a(a).mo111270b("User-Agent").mo111271b("User-Agent", "Android").mo111272c()).mo111246a(new C53526f() {
                        public final void onFailure(C53524e eVar, IOException iOException) {
                            C35459a.m80148a("XPlanUtils", "onFailure");
                        }

                        public final void onResponse(C53524e eVar, C53504ad adVar) throws IOException {
                            StringBuilder sb = new StringBuilder("onResponse");
                            sb.append(adVar.toString());
                            C35459a.m80148a("XPlanUtils", sb.toString());
                            String tVar = adVar.f132398a.f132378a.toString();
                            StringBuilder sb2 = new StringBuilder("location = ");
                            sb2.append(tVar);
                            C35459a.m80148a("XPlanUtils", sb2.toString());
                            Activity activity = activity;
                            String str = a;
                            C35262bt c = C35284t.m79782a().mo73405c();
                            C35459a.m80148a("XPlanUtils", "realPreloadX");
                            if (c == null || !c.f90596b.equals(tVar) || c.f90597c < C35243bl.f90556b) {
                                if (c != null && !c.f90596b.equals(tVar)) {
                                    C34004b.m77717a().mo71949f().cancelDownload(activity, c.f90595a);
                                    C35284t.m79782a().mo73394a((C35262bt) null);
                                    C35243bl.f90555a = new C35262bt();
                                    C35459a.m80148a("XPlanUtils", "cleanPreloadInfo");
                                }
                                C34004b.m77717a().mo71949f().handleXDownload(activity, str, new C35430c(tVar, activity) {

                                    /* renamed from: a */
                                    final /* synthetic */ String f90570a;

                                    /* renamed from: b */
                                    final /* synthetic */ Activity f90571b;

                                    {
                                        this.f90570a = r1;
                                        this.f90571b = r2;
                                    }
                                }, true, false);
                                return;
                            }
                            C35459a.m80148a("XPlanUtils", "preload done");
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public static void m79711b(RemoteImageView remoteImageView, int i) {
        C13833a aVar = (C13833a) remoteImageView.getHierarchy();
        if (aVar != null) {
            aVar.mo25907c(i);
        } else {
            remoteImageView.setHierarchy(C13834b.m28085a(remoteImageView.getResources()).mo25926d(i).mo25912a());
        }
    }

    /* renamed from: a */
    public static void m79696a(Activity activity, int i) {
        StringBuilder sb = new StringBuilder("pauseDownload, downloadTaskId = ");
        sb.append(i);
        C35459a.m80148a("XPlanUtils", sb.toString());
        if (i != 0) {
            C34004b.m77717a().mo71949f().pauseDownload(activity, i);
        }
    }

    /* renamed from: a */
    private static C18922i m79693a(int i, Object obj) {
        C18922i iVar = new C18922i("maya1349://home?tab=im&enter_from=aweme");
        switch (i) {
            case 1:
                if (!(obj instanceof String)) {
                    return iVar;
                }
                C18922i iVar2 = new C18922i((String) obj);
                iVar2.mo38778a("enter_from", "aweme");
                return iVar2;
            case 2:
            case 3:
            case 4:
            case 12:
                if (!(obj instanceof IMUser)) {
                    return iVar;
                }
                String uid = ((IMUser) obj).getUid();
                String a = C11190e.m22687a(Long.parseLong(uid));
                C18922i iVar3 = new C18922i("maya1349://message?enter_from=aweme");
                iVar3.mo38778a("conversation_id", a);
                iVar3.mo38778a("talk_to", uid);
                return iVar3;
            case 5:
            case 7:
                if (!(obj instanceof C11207p)) {
                    return iVar;
                }
                C11207p pVar = (C11207p) obj;
                C18922i iVar4 = new C18922i("maya1349://message?enter_from=aweme");
                iVar4.mo38778a("conversation_id", pVar.getConversationId());
                iVar4.mo38777a("short_conversation_id", pVar.getConversationShortId());
                return iVar4;
            case 6:
                if (!(obj instanceof C11180b)) {
                    return iVar;
                }
                C11180b bVar = (C11180b) obj;
                C18922i iVar5 = new C18922i("maya1349://message?enter_from=aweme");
                iVar5.mo38778a("conversation_id", bVar.getConversationId());
                iVar5.mo38777a("short_conversation_id", bVar.getConversationShortId());
                return iVar5;
            case 8:
            case 9:
                if (!(obj instanceof SharePackage)) {
                    return iVar;
                }
                C18922i iVar6 = new C18922i("maya1349://message_forward?enter_from=aweme");
                BaseContent b = C35106c.m79334b((SharePackage) obj);
                iVar6.mo38776a("external_msg_type", C35197am.m79553a(b));
                iVar6.mo38778a("external_msg_content", C35277o.m79761a(b));
                return iVar6;
            case 10:
                if (!(obj instanceof C35472i)) {
                    return iVar;
                }
                C35472i iVar7 = (C35472i) obj;
                if (iVar7.f91189a == null) {
                    return iVar;
                }
                C18922i iVar8 = new C18922i(iVar7.f91189a);
                iVar8.mo38778a("enter_from", "aweme");
                if (iVar7.f91190b == null || iVar7.f91190b.isEmpty()) {
                    return iVar8;
                }
                for (Entry entry : iVar7.f91190b.entrySet()) {
                    iVar8.mo38778a((String) entry.getKey(), (String) entry.getValue());
                }
                return iVar8;
            default:
                return iVar;
        }
    }

    /* renamed from: a */
    public static void m79697a(Activity activity, int i, Object obj) {
        m79698a(activity, i, obj, (C35423b) null);
    }

    /* renamed from: a */
    public static void m79701a(Activity activity, Object obj, int i) {
        m79702a(activity, obj, i, (C35423b) null);
    }

    /* renamed from: a */
    private static void m79698a(Activity activity, int i, Object obj, C35423b bVar) {
        m79699a(activity, i, false, "", obj, bVar, null);
    }

    /* renamed from: a */
    public static void m79700a(Activity activity, IMUser iMUser, int i, final Runnable runnable) {
        if (activity != null && iMUser != null) {
            if (!m79709a() || iMUser.getCommerceUserLevel() != 0) {
                runnable.run();
            } else if (!m79712b()) {
                m79697a(activity, i, (Object) iMUser);
            } else if (!C35284t.m79782a().mo73417e(i) || m79710a((Context) activity)) {
                runnable.run();
            } else {
                C35284t.m79782a().mo73411d(i);
                m79698a(activity, i, (Object) iMUser, (C35423b) new C35423b() {
                    /* renamed from: a */
                    public final void mo70618a(DialogInterface dialogInterface, int i) {
                        if (i == -2 && runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m79699a(final Activity activity, final int i, boolean z, String str, Object obj, C35423b bVar, C35430c cVar) {
        boolean z2;
        int i2 = i;
        final C35423b bVar2 = bVar;
        final C35430c cVar2 = cVar;
        if (activity != null) {
            if (!f90559e.get() || f90555a.f90597c <= 0) {
                if (f90559e.get()) {
                    C34004b.m77717a().mo71949f().cancelDownload(activity, f90555a.f90595a);
                }
                if (i2 == 6) {
                    final boolean a = m79710a((Context) activity);
                    if (a) {
                        C35190af.m79445a(6, "open", "duoshan_banner_click");
                    } else {
                        C35190af.m79445a(6, "install", "duoshan_banner_click");
                        C35190af.m79444a(6, "show");
                    }
                    C1161a b = new C1161a(activity, R.style.mp).mo3770b((CharSequence) activity.getString(R.string.bpp));
                    final boolean z3 = a;
                    final Activity activity2 = activity;
                    final int i3 = i;
                    final Object obj2 = obj;
                    final C35430c cVar3 = cVar;
                    C352516 r0 = new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (z3) {
                                C35243bl.m79704a((Context) activity2, i3, obj2);
                            } else {
                                String a = C35243bl.m79694a(6);
                                if (C35243bl.f90557c && (cVar3 instanceof C35433d)) {
                                    C35262bt c = C35284t.m79782a().mo73405c();
                                    if (c != null) {
                                        ((C35433d) cVar3).f91104f = c.f90597c;
                                    }
                                }
                                C34004b.m77717a().mo71949f().handleXDownload(activity2, a, cVar3, false, C35243bl.f90557c);
                            }
                            if (!z3) {
                                C35190af.m79444a(6, "confirm");
                            }
                        }
                    };
                    b.mo3759a((int) R.string.bpt, (OnClickListener) r0).mo3769b((int) R.string.bf_, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (!a) {
                                C35190af.m79444a(6, "cancel");
                            }
                        }
                    }).mo3775c();
                    return;
                }
                if (C33229c.f86227e.mo70575h() == 1 || C33229c.f86227e.mo70575h() == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m79710a((Context) activity)) {
                    C35190af.m79445a(i, "open", "duoshan_banner_click");
                    m79704a((Context) activity, i, obj);
                    return;
                }
                C35190af.m79445a(i, "install", "duoshan_banner_click");
                if (m79713c()) {
                    String a2 = m79694a(i);
                    if (f90557c && (cVar2 instanceof C35433d)) {
                        C35262bt c = C35284t.m79782a().mo73405c();
                        if (c != null) {
                            ((C35433d) cVar2).f91104f = c.f90597c;
                        }
                    }
                    C34004b.m77717a().mo71949f().handleXDownload(activity, a2, cVar, false, f90557c);
                } else if (z2) {
                    if (bVar2 != null) {
                        bVar2.mo70618a(null, 1);
                    }
                    String a3 = m79694a(i);
                    if (f90557c && (cVar2 instanceof C35433d)) {
                        C35262bt c2 = C35284t.m79782a().mo73405c();
                        if (c2 != null) {
                            ((C35433d) cVar2).f91104f = c2.f90597c;
                        }
                    }
                    C34004b.m77717a().mo71949f().handleXDownload(activity, a3, cVar, false, f90557c);
                } else {
                    C35469f fVar = C34004b.m77717a().mo71949f().getIMSetting().f91147e;
                    String string = activity.getString(R.string.bps);
                    switch (i2) {
                        case 1:
                        case 8:
                        case 9:
                            if (fVar != null && !TextUtils.isEmpty(fVar.f91161a)) {
                                string = fVar.f91161a;
                                break;
                            } else {
                                string = activity.getString(R.string.bps);
                                break;
                            }
                        case 2:
                        case 3:
                            if (fVar != null && !TextUtils.isEmpty(fVar.f91162b)) {
                                string = fVar.f91162b;
                                break;
                            } else {
                                string = activity.getString(R.string.bps);
                                break;
                            }
                        case 4:
                            if (m79712b()) {
                                if (fVar != null && !TextUtils.isEmpty(fVar.f91161a)) {
                                    string = fVar.f91161a;
                                    break;
                                } else {
                                    string = activity.getString(R.string.bps);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            string = activity.getString(R.string.bps);
                            break;
                        case 6:
                            string = activity.getString(R.string.bpp);
                            break;
                        case 10:
                            if (fVar != null && !TextUtils.isEmpty(fVar.f91184x)) {
                                string = fVar.f91184x;
                                break;
                            } else {
                                string = activity.getString(R.string.bq9);
                                break;
                            }
                            break;
                        case 12:
                            string = activity.getString(R.string.bpy);
                            break;
                    }
                    if (z) {
                        View inflate = LayoutInflater.from(activity).inflate(R.layout.bce, null);
                        TextView textView = (TextView) inflate.findViewById(R.id.d8j);
                        ((SimpleDraweeView) inflate.findViewById(R.id.b50)).setActualImageResource(C34603a.f89149a);
                        ((ImageView) inflate.findViewById(R.id.b28)).setImageResource(C34603a.f89150b);
                        String str2 = str;
                        textView.setText(str);
                        C10643a aVar = new C10643a(activity);
                        aVar.f28288s = inflate;
                        Dialog c3 = aVar.mo18886a((int) R.string.bg2, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                String a = C35243bl.m79694a(i);
                                if (C35243bl.f90557c && (cVar2 instanceof C35433d)) {
                                    C35262bt c = C35284t.m79782a().mo73405c();
                                    if (c != null) {
                                        ((C35433d) cVar2).f91104f = c.f90597c;
                                    }
                                }
                                C34004b.m77717a().mo71949f().handleXDownload(activity, a, cVar2, false, C35243bl.f90557c);
                                if (bVar2 != null) {
                                    bVar2.mo70618a(dialogInterface, i);
                                }
                                C35190af.m79444a(i, "confirm");
                            }
                        }).mo18900b((int) R.string.bf_, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (bVar2 != null) {
                                    bVar2.mo70618a(dialogInterface, i);
                                }
                                C35190af.m79444a(i, "cancel");
                            }
                        }).mo18897a().mo18883c();
                        c3.setCanceledOnTouchOutside(false);
                        c3.setCancelable(false);
                        if (bVar2 != null) {
                            bVar.getClass();
                            c3.setOnDismissListener(new C35255bm(bVar2));
                        }
                    } else {
                        m79703a((Dialog) new C1161a(activity, R.style.mp).mo3770b((CharSequence) string).mo3766a(false).mo3759a((int) R.string.bg2, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                String a = C35243bl.m79694a(i);
                                if (C35243bl.f90557c && (cVar2 instanceof C35433d)) {
                                    C35262bt c = C35284t.m79782a().mo73405c();
                                    if (c != null) {
                                        ((C35433d) cVar2).f91104f = c.f90597c;
                                    }
                                }
                                C34004b.m77717a().mo71949f().handleXDownload(activity, a, cVar2, false, C35243bl.f90557c);
                                if (bVar2 != null) {
                                    bVar2.mo70618a(dialogInterface, i);
                                }
                                C35190af.m79444a(i, "confirm");
                            }
                        }).mo3769b((int) R.string.bf_, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (bVar2 != null) {
                                    bVar2.mo70618a(dialogInterface, i);
                                }
                                C35190af.m79444a(i, "cancel");
                            }
                        }).mo3772b(), bVar2);
                    }
                    C35190af.m79444a(i, "show");
                }
            } else {
                C35284t.m79782a().mo73394a(new C35262bt(f90555a.f90595a, f90555a.f90596b, f90555a.f90597c));
                C23791bg bgVar = new C23791bg(i, z, str, obj, bVar, cVar);
                f90558d = bgVar;
                C35459a.m80148a("XPlanUtils", "handleXDownload, pauseDownload, isPrelaoding = true");
                C34004b.m77717a().mo71949f().pauseDownload(activity, f90555a.f90595a);
            }
        }
    }
}
