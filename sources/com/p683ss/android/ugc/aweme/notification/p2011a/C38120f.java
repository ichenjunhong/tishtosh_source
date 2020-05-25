package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.facebook.drawee.p940f.C13833a;
import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteRoundImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.notice.api.C38042c.C38043a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38087b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.notification.utils.C38452a;
import com.p683ss.android.ugc.aweme.notification.utils.C38456e;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p2108r.p2110b.C41052b;
import com.p683ss.android.ugc.aweme.p2108r.p2110b.C41053c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ReshootConfig;
import com.p683ss.android.ugc.aweme.utils.C47787cs;
import com.p683ss.android.ugc.aweme.utils.C47817dl;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.utils.C47862et;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.notification.a.f */
public final class C38120f extends C38114b implements OnClickListener {

    /* renamed from: A */
    private boolean f97027A;

    /* renamed from: B */
    private String f97028B;

    /* renamed from: C */
    private BaseNotice f97029C;

    /* renamed from: D */
    private boolean f97030D;

    /* renamed from: c */
    public TextView f97031c;

    /* renamed from: d */
    Activity f97032d;

    /* renamed from: e */
    private AvatarImageView f97033e;

    /* renamed from: f */
    private ImageView f97034f;

    /* renamed from: g */
    private View f97035g;

    /* renamed from: h */
    private View f97036h;

    /* renamed from: i */
    private TextView f97037i;

    /* renamed from: j */
    private TextView f97038j;

    /* renamed from: k */
    private TextView f97039k;

    /* renamed from: l */
    private TextView f97040l;

    /* renamed from: m */
    private RemoteRoundImageView f97041m;

    /* renamed from: n */
    private Button f97042n;

    /* renamed from: o */
    private ConstraintLayout f97043o;

    /* renamed from: p */
    private View f97044p;

    /* renamed from: q */
    private String f97045q;

    /* renamed from: r */
    private boolean f97046r;

    /* renamed from: s */
    private User f97047s;

    /* renamed from: t */
    private String f97048t;

    /* renamed from: u */
    private String f97049u;

    /* renamed from: v */
    private String f97050v;

    /* renamed from: w */
    private String f97051w = "";

    /* renamed from: x */
    private int f97052x;

    /* renamed from: y */
    private boolean f97053y;

    /* renamed from: z */
    private boolean f97054z;

    /* renamed from: com.ss.android.ugc.aweme.notification.a.f$a */
    public class C38123a extends ClickableSpan {
        public C38123a() {
        }

        public final void onClick(View view) {
            if (C38120f.this.f97031c.isEnabled()) {
                C38120f.this.mo78097c();
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
            textPaint.setColor(C0726c.m2098c(C38120f.this.itemView.getContext(), R.color.a17));
            textPaint.setFakeBoldText(true);
        }
    }

    /* renamed from: e */
    private void m85215e() {
        if (this.f97041m.getVisibility() == 0 || this.f97042n.getVisibility() == 0) {
            this.f97044p.setVisibility(0);
        } else {
            this.f97044p.setVisibility(8);
        }
    }

    /* renamed from: g */
    private String m85217g() {
        String str = "";
        if (this.f97052x == 5) {
            return "official_info";
        }
        if (this.f97052x == 9) {
            return "subscribe_account";
        }
        if (this.f97052x == 4) {
            return "douyin_assistant";
        }
        if (this.f97052x == 16) {
            return "starmap_assisstant";
        }
        if (this.f97052x == 17) {
            return "live_assistant";
        }
        if (this.f97052x == 10) {
            return "official_info";
        }
        if (this.f97052x == 62) {
            return "tcm";
        }
        return str;
    }

    /* renamed from: f */
    private void m85216f() {
        if (this.f97052x == 10) {
            int type = this.f97029C.getType();
            if (type == 2 || type == 5) {
                C23515d.m57668a((RemoteImageView) this.f97033e, (int) R.drawable.clw);
            } else {
                C23515d.m57668a((RemoteImageView) this.f97033e, (int) R.drawable.clt);
            }
        } else if (this.f97052x == 4) {
            C23515d.m57668a((RemoteImageView) this.f97033e, (int) R.drawable.clt);
        } else if (this.f97052x == 5) {
            C23515d.m57668a((RemoteImageView) this.f97033e, (int) R.drawable.clw);
        } else if (this.f97052x == 7) {
            C23515d.m57668a((RemoteImageView) this.f97033e, (int) R.drawable.clp);
        } else if (this.f97052x == 62) {
            C23515d.m57668a((RemoteImageView) this.f97033e, (int) R.drawable.clx);
        }
    }

    /* renamed from: c */
    public final void mo78097c() {
        if (this.f97052x != 7) {
            if (this.f97046r) {
                C41302w.m91042a().mo83858a(this.f97032d, this.f97045q);
                return;
            }
            if (this.f97047s != null) {
                C41302w a = C41302w.m91042a();
                Activity activity = this.f97032d;
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                sb.append(this.f97047s.getUid());
                a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", this.f97047s.getSecUid()).mo83871a());
            }
        }
    }

    /* renamed from: h */
    private void m85218h() {
        if (this.f97029C != null) {
            UserTextNotice textNotice = this.f97029C.getTextNotice();
            AnnouncementNotice announcement = this.f97029C.getAnnouncement();
            int type = this.f97029C.getType();
            String str = "";
            if (type == 1 || type == 12) {
                str = "douyin_assistant";
            } else if (type == 2 || type == 11) {
                str = "official_info";
            } else if (type == 61 || type == 62) {
                str = "starmap_assistant";
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.f97029C.getTcmNotice() != null) {
                    HashMap hashMap = new HashMap();
                    try {
                        hashMap = (HashMap) new C17971f().mo34884a(this.f97029C.getTcmNotice().f96949d, HashMap.class);
                    } catch (C18091u unused) {
                    }
                    C26890h.m65011a("official_message_inner_message", C23089d.m56640a().mo47829a("account_type", str).mo47829a("action_type", "click").mo47830a(hashMap).f61491a);
                }
                if (textNotice != null) {
                    String objectId = textNotice.getObjectId();
                    int subType = textNotice.getSubType();
                    if (subType == 22) {
                        m85210b(objectId, str);
                    } else if (subType == 23) {
                        m85209a(objectId, str);
                    } else {
                        if (subType == 21) {
                            m85212c(objectId, str);
                        }
                    }
                } else if (announcement != null) {
                    String objectId2 = announcement.getObjectId();
                    int type2 = announcement.getType();
                    if (type2 == 3) {
                        m85210b(objectId2, str);
                    } else if (type2 == 4) {
                        m85209a(objectId2, str);
                    } else if (type2 == 1) {
                        m85212c(objectId2, str);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m85214d() {
        if (this.f97029C != null && this.f97029C.getType() == 2) {
            UserTextNotice textNotice = this.f97029C.getTextNotice();
            if (textNotice != null) {
                int subType = textNotice.getSubType();
                if (subType == 4) {
                    C26890h.onEvent(MobClick.obtain().setEventName("toutiao_message_click").setLabelName("message_add"));
                    m85208a(textNotice);
                    return;
                } else if (subType == 24) {
                    C26890h.m65011a("enter_violation_record", C23089d.m56640a().mo47829a("enter_from", "notification_page").mo47829a("enter_method", "message").f61491a);
                }
            }
        }
        m85218h();
        if (!C47817dl.m103456a().handleClick(this.f97032d, this.f97053y, this.f97054z, this.f97027A, this.f97028B)) {
            Uri parse = Uri.parse(this.f97045q);
            if (TextUtils.equals(C23060d.f61427a, parse.getHost())) {
                if (!TextUtils.isEmpty(parse.getQueryParameter("rn_schema"))) {
                    C41302w.m91042a().mo83858a(this.f97032d, C41053c.m90724a(this.f97045q.replace(C38456e.m85782a(), "aweme")).mo83572a().toString());
                } else {
                    Intent handleAmeWebViewBrowserForDeeplink = C47862et.m103534a().handleAmeWebViewBrowserForDeeplink((Context) this.f97032d, parse);
                    if (handleAmeWebViewBrowserForDeeplink != null) {
                        handleAmeWebViewBrowserForDeeplink.putExtra("hide_more", false);
                        handleAmeWebViewBrowserForDeeplink.putExtra("enter_from", "notification");
                        handleAmeWebViewBrowserForDeeplink.putExtra("bundle_user_webview_title", true);
                        this.f97032d.startActivity(handleAmeWebViewBrowserForDeeplink);
                    } else {
                        C41302w.m91042a().mo83858a(this.f97032d, this.f97045q);
                    }
                }
            } else if (m85211b(this.f97045q)) {
                AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C38124g(this, new Builder().shootWay("direct_shoot").defaultTab(2).reshootConfig(new ReshootConfig(true, Boolean.valueOf(AVExternalServiceImpl.getAVServiceImpl_Monster().configService().shortVideoConfig().isRecording()), true)).build()));
            } else if (m85213c(this.f97045q)) {
                C47862et.m103534a().startAdsAppActivity(this.f97032d, this.f97045q.replace("aweme://stickers/detail/", "sslocal://stickers/detail/"));
            } else {
                if (TextUtils.isEmpty(this.f97051w)) {
                    this.f97051w = UUID.randomUUID().toString();
                }
                C41302w.m91042a().mo83858a(this.f97032d, C41311y.m91065a(this.f97045q).mo83870a("process_id", this.f97051w).mo83871a());
            }
        }
        if (!TextUtils.isEmpty(this.f97048t)) {
            C26898j jVar = new C26898j();
            jVar.mo54849a("user_type", this.f97048t);
            C26890h.onEvent(new MobClick().setEventName("challenge_click").setLabelName("message_add").setValue(this.f97049u).setExtValueString(this.f97050v).setJsonObject(jVar.mo54850a()));
        }
        m85207a(this.f97029C, "click");
    }

    /* renamed from: b */
    private static boolean m85211b(String str) {
        return C47787cs.m103416a(str);
    }

    /* renamed from: c */
    private static boolean m85213c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("aweme://stickers/detail/")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo78082a(boolean z) {
        super.mo78082a(z);
        if (z) {
            this.f97035g.setVisibility(8);
            C41052b.m90722a(this.f97043o);
            return;
        }
        this.f97035g.setVisibility(0);
        C41052b.m90723a(this.f97043o, R.drawable.cm0, R.color.ana);
    }

    /* renamed from: a */
    private void m85208a(final UserTextNotice userTextNotice) {
        new C11105a(this.f97032d).mo20146b((CharSequence) this.f97032d.getString(R.string.bqu, new Object[]{this.f97032d.getString(R.string.btz)})).mo20136a((int) R.string.bqt, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(7:12|(1:14)(1:15)|16|(2:18|(1:(3:20|(2:22|(2:37|26))(1:38)|27)(1:36)))(0)|28|29|30)|31|32|33) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0099 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.content.DialogInterface r10, int r11) {
                /*
                    r9 = this;
                    com.ss.android.ugc.aweme.notification.a.f r10 = com.p683ss.android.ugc.aweme.notification.p2011a.C38120f.this
                    com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r11 = r6
                    java.lang.String r11 = r11.getSchemaUrl()
                    boolean r0 = android.text.TextUtils.isEmpty(r11)
                    if (r0 != 0) goto L_0x00ad
                    android.net.Uri r11 = android.net.Uri.parse(r11)
                    java.lang.String r0 = "android_pkg_name"
                    java.lang.String r0 = r11.getQueryParameter(r0)     // Catch:{ Exception -> 0x001f }
                    java.lang.String r1 = "UTF-8"
                    java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch:{ Exception -> 0x001f }
                    goto L_0x0020
                L_0x001f:
                    r0 = 0
                L_0x0020:
                    r2 = r0
                    java.lang.String r11 = r11.getScheme()
                    java.lang.String r11 = r11.toLowerCase()
                    boolean r11 = android.text.TextUtils.isEmpty(r11)
                    if (r11 != 0) goto L_0x00ad
                    android.app.Activity r10 = r10.f97032d     // Catch:{ Exception -> 0x00ad }
                    com.ss.android.ugc.aweme.IAccountUserService r11 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r11 = r11.getCurUserId()     // Catch:{ Exception -> 0x00ad }
                    com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()     // Catch:{ Exception -> 0x00ad }
                    boolean r0 = r0.isLogin()     // Catch:{ Exception -> 0x00ad }
                    if (r0 == 0) goto L_0x0099
                    java.lang.String r0 = ""
                    android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()     // Catch:{ Exception -> 0x00ad }
                    if (r1 != 0) goto L_0x004e
                    java.lang.String r1 = ""
                    goto L_0x0054
                L_0x004e:
                    java.lang.String r3 = com.p683ss.android.p1140c.C18845b.f52036a     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r1 = r1.getCookie(r3)     // Catch:{ Exception -> 0x00ad }
                L_0x0054:
                    boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00ad }
                    if (r3 != 0) goto L_0x008c
                    java.lang.String r3 = ";"
                    java.lang.String[] r1 = r1.split(r3)     // Catch:{ Exception -> 0x00ad }
                    int r3 = r1.length     // Catch:{ Exception -> 0x00ad }
                    r4 = 0
                    r5 = 0
                L_0x0063:
                    if (r5 >= r3) goto L_0x008c
                    r6 = r1[r5]     // Catch:{ Exception -> 0x00ad }
                    boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00ad }
                    if (r7 != 0) goto L_0x0089
                    java.lang.String r7 = "="
                    java.lang.String[] r6 = r6.split(r7)     // Catch:{ Exception -> 0x00ad }
                    int r7 = r6.length     // Catch:{ Exception -> 0x00ad }
                    r8 = 2
                    if (r7 < r8) goto L_0x0089
                    r7 = r6[r4]     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r7 = r7.trim()     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r8 = "sessionid"
                    boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x00ad }
                    if (r7 == 0) goto L_0x0089
                    r0 = 1
                    r0 = r6[r0]     // Catch:{ Exception -> 0x00ad }
                    goto L_0x008c
                L_0x0089:
                    int r5 = r5 + 1
                    goto L_0x0063
                L_0x008c:
                    r5 = r0
                    com.ss.android.ttplatformsdk.c.a r1 = com.p683ss.android.ttplatformsdk.p1224c.C20061b.m49546a(r10)     // Catch:{ Exception -> 0x0099 }
                    long r3 = java.lang.Long.parseLong(r11)     // Catch:{ Exception -> 0x0099 }
                    r6 = 0
                    r1.mo42110a(r2, r3, r5, r6)     // Catch:{ Exception -> 0x0099 }
                L_0x0099:
                    com.ss.android.ugc.aweme.common.MobClick r10 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r11 = "app_awake_from_fans_power"
                    com.ss.android.ugc.aweme.common.MobClick r10 = r10.setEventName(r11)     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r11 = "message_add"
                    com.ss.android.ugc.aweme.common.MobClick r10 = r10.setLabelName(r11)     // Catch:{ Exception -> 0x00ad }
                    com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r10)     // Catch:{ Exception -> 0x00ad }
                    return
                L_0x00ad:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.p2011a.C38120f.C381222.onClick(android.content.DialogInterface, int):void");
            }
        }).mo20145b((int) R.string.wf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).mo20141a(false).mo20148b();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!mo78092b() && !C32800a.m75679a(view)) {
            super.onClick(view);
            int id = view.getId();
            if (id == R.id.bsj || id == R.id.bsm) {
                mo78097c();
            } else if (id != R.id.bso && id != R.id.bsk && id != R.id.bs1) {
                if (id == R.id.bsr) {
                    m85214d();
                }
            } else if (this.f97052x == 7) {
                if (!(this.f97032d == null || this.f97029C == null)) {
                    C38087b adHelperNotice = this.f97029C.getAdHelperNotice();
                    if (adHelperNotice != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("notice_id", this.f97029C.getNid());
                        hashMap.put("aid", String.valueOf(C38043a.f96819a));
                        hashMap.put("channel", C47862et.m103534a().getChannel());
                        C47862et.m103534a().openAdWebUrl(this.f97032d, adHelperNotice.f96892d, this.f97032d.getString(R.string.bnb), true, hashMap);
                    }
                }
            } else {
                m85214d();
            }
        }
    }

    /* renamed from: a */
    private static void m85209a(String str, String str2) {
        C26890h.m65011a("enter_prop_detail", C23089d.m56640a().mo47829a("previous_page", "message").mo47829a("account_type", str2).mo47829a("prop_id", str).f61491a);
    }

    /* renamed from: b */
    private static void m85210b(String str, String str2) {
        C26890h.m65011a("enter_music_detail", C23089d.m56640a().mo47829a("previous_page", "message").mo47829a("account_type", str2).mo47829a("music_id", str).f61491a);
    }

    /* renamed from: c */
    private void m85212c(String str, String str2) {
        this.f97051w = UUID.randomUUID().toString();
        C26890h.m65011a("enter_tag_detail", C23089d.m56640a().mo47829a("previous_page", "message").mo47829a("account_type", str2).mo47829a("process_id", this.f97051w).mo47829a("tag_id", str).f61491a);
    }

    /* renamed from: a */
    private void m85207a(BaseNotice baseNotice, String str) {
        long taskId = baseNotice.getTaskId();
        String g = m85217g();
        if (!TextUtils.isEmpty(g)) {
            C23089d a = C23089d.m56640a().mo47829a("action_type", str).mo47829a("account_type", g).mo47829a("content_id", baseNotice.getNid());
            if (this.f97052x == 5) {
                if (C38452a.m85773a(this.f97029C)) {
                    a.mo47829a("content_type", "online_contract");
                } else {
                    a.mo47829a("content_type", "");
                }
            }
            a.mo47827a("task_id", taskId);
            C26890h.m65011a("official_message_inner_message", a.f61491a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0741, code lost:
        if (r13.getSubType() == 4) goto L_0x0745;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78081a(com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r12, boolean r13, java.lang.String r14) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            r11.f97029C = r12
            super.mo78081a(r12, r13, r14)
            r11.mo78082a(r13)
            android.widget.TextView r13 = r11.f97040l
            android.app.Activity r14 = r11.f97032d
            long r0 = r12.getCreateTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.String r14 = com.p683ss.android.ugc.aweme.utils.C47903fw.m103624a(r14, r0)
            r13.setText(r14)
            r13 = 0
            r11.f97048t = r13
            com.ss.android.ugc.aweme.notice.repo.list.bean.ChallengeNotice r13 = r12.getChallengeNotice()
            r14 = 2132545616(0x7f1c1050, float:2.0744427E38)
            r0 = 4
            r1 = 1
            r2 = 8
            r3 = 0
            if (r13 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.notice.repo.list.bean.ChallengeNotice r13 = r12.getChallengeNotice()
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r13.getChallenge()
            if (r4 == 0) goto L_0x05e0
            r11.f97046r = r3
            com.ss.android.ugc.aweme.discover.model.Challenge r13 = r13.getChallenge()
            android.widget.TextView r4 = r11.f97031c
            r4.setVisibility(r3)
            android.widget.TextView r4 = r11.f97037i
            r4.setVisibility(r3)
            android.widget.TextView r4 = r11.f97038j
            r4.setVisibility(r3)
            android.widget.ImageView r4 = r11.f97034f
            r4.setVisibility(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            r4.setVisibility(r0)
            android.widget.Button r4 = r11.f97042n
            r4.setVisibility(r3)
            android.widget.TextView r4 = r11.f97039k
            r4.setVisibility(r2)
            com.ss.android.ugc.aweme.profile.model.User r4 = r13.getAuthor()
            if (r4 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r5 = r11.f97033e
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r4.getAvatarThumb()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r5, r6)
            android.widget.TextView r5 = r11.f97031c
            java.lang.String r4 = r4.getNickname()
            r5.setText(r4)
        L_0x007a:
            android.widget.TextView r4 = r11.f97038j
            java.lang.String r5 = r13.getChallengeName()
            r4.setText(r5)
            com.ss.android.ugc.aweme.profile.model.User r4 = r13.getAuthor()
            r11.f97047s = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "aweme://challenge/detail/"
            r4.<init>(r5)
            java.lang.String r5 = r13.getCid()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.ss.android.ugc.aweme.router.y r4 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r4)
            java.lang.String r5 = "is_commerce"
            com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26430bo.m63913a()
            com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil r6 = (com.p683ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil) r6
            boolean r6 = r6.isCommerce(r13)
            if (r6 == 0) goto L_0x00b0
            java.lang.String r6 = "1"
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r6 = "0"
        L_0x00b2:
            com.ss.android.ugc.aweme.router.y r4 = r4.mo83870a(r5, r6)
            java.lang.String r4 = r4.mo83871a()
            r11.f97045q = r4
            java.lang.String r4 = "peer"
            r11.f97048t = r4
            java.lang.String r13 = r13.getCid()
            r11.f97049u = r13
            com.ss.android.ugc.aweme.profile.model.User r13 = r11.f97047s
            if (r13 != 0) goto L_0x00cd
            java.lang.String r13 = ""
            goto L_0x00d3
        L_0x00cd:
            com.ss.android.ugc.aweme.profile.model.User r13 = r11.f97047s
            java.lang.String r13 = r13.getUid()
        L_0x00d3:
            r11.f97050v = r13
            r11.m85215e()
            goto L_0x05e0
        L_0x00da:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r13 = r12.getAnnouncement()
            r4 = 2132545401(0x7f1c0f79, float:2.074399E38)
            if (r13 == 0) goto L_0x018b
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r13 = r12.getAnnouncement()
            com.ss.android.ugc.aweme.discover.model.Challenge r13 = r13.getChallenge()
            if (r13 == 0) goto L_0x018b
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r13 = r12.getAnnouncement()
            r11.f97046r = r1
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = r13.getChallenge()
            android.widget.TextView r6 = r11.f97031c
            r6.setVisibility(r2)
            android.widget.TextView r6 = r11.f97037i
            r6.setVisibility(r2)
            android.widget.TextView r6 = r11.f97038j
            r6.setVisibility(r3)
            android.widget.ImageView r6 = r11.f97034f
            r6.setVisibility(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r6 = r11.f97041m
            r6.setVisibility(r0)
            android.widget.Button r6 = r11.f97042n
            r6.setVisibility(r3)
            android.widget.TextView r6 = r11.f97039k
            r6.setVisibility(r3)
            android.widget.Button r6 = r11.f97042n
            r6.setText(r4)
            r11.m85216f()
            com.ss.android.ugc.aweme.profile.model.User r4 = r5.getAuthor()
            r11.f97047s = r4
            android.widget.TextView r4 = r11.f97038j
            java.lang.String r6 = r5.getChallengeName()
            r4.setText(r6)
            android.widget.TextView r4 = r11.f97039k
            java.lang.String r13 = r13.getContent()
            r4.setText(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r4 = "aweme://challenge/detail/"
            r13.<init>(r4)
            java.lang.String r4 = r5.getCid()
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            com.ss.android.ugc.aweme.router.y r13 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r13)
            java.lang.String r4 = "is_commerce"
            com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil r6 = com.p683ss.android.ugc.aweme.commercialize.utils.C26430bo.m63913a()
            com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil r6 = (com.p683ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil) r6
            boolean r6 = r6.isCommerce(r5)
            if (r6 == 0) goto L_0x0161
            java.lang.String r6 = "1"
            goto L_0x0163
        L_0x0161:
            java.lang.String r6 = "0"
        L_0x0163:
            com.ss.android.ugc.aweme.router.y r13 = r13.mo83870a(r4, r6)
            java.lang.String r13 = r13.mo83871a()
            r11.f97045q = r13
            java.lang.String r13 = "official"
            r11.f97048t = r13
            java.lang.String r13 = r5.getCid()
            r11.f97049u = r13
            com.ss.android.ugc.aweme.profile.model.User r13 = r11.f97047s
            if (r13 != 0) goto L_0x017e
            java.lang.String r13 = ""
            goto L_0x0184
        L_0x017e:
            com.ss.android.ugc.aweme.profile.model.User r13 = r11.f97047s
            java.lang.String r13 = r13.getUid()
        L_0x0184:
            r11.f97050v = r13
            r11.m85215e()
            goto L_0x05e0
        L_0x018b:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r13 = r12.getAnnouncement()
            r5 = 2132545567(0x7f1c101f, float:2.0744327E38)
            r6 = 2132545566(0x7f1c101e, float:2.0744325E38)
            if (r13 == 0) goto L_0x0278
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r13 = r12.getAnnouncement()
            r11.f97046r = r1
            android.widget.TextView r7 = r11.f97037i
            r7.setVisibility(r2)
            int r7 = r13.getType()
            if (r7 != r1) goto L_0x01bc
            android.widget.TextView r7 = r11.f97031c
            r7.setVisibility(r2)
            android.widget.TextView r7 = r11.f97038j
            java.lang.String r8 = r13.getTitle()
            r7.setText(r8)
            android.widget.TextView r7 = r11.f97038j
            r7.setVisibility(r3)
            goto L_0x01cf
        L_0x01bc:
            android.widget.TextView r7 = r11.f97031c
            java.lang.String r8 = r13.getTitle()
            r7.setText(r8)
            android.widget.TextView r7 = r11.f97031c
            r7.setVisibility(r3)
            android.widget.TextView r7 = r11.f97038j
            r7.setVisibility(r2)
        L_0x01cf:
            android.widget.ImageView r7 = r11.f97034f
            r7.setVisibility(r2)
            android.widget.TextView r7 = r11.f97039k
            r7.setVisibility(r3)
            r11.m85216f()
            android.widget.TextView r7 = r11.f97031c
            java.lang.String r8 = r13.getTitle()
            r7.setText(r8)
            android.widget.TextView r7 = r11.f97039k
            java.lang.String r8 = r13.getContent()
            r7.setText(r8)
            java.lang.String r7 = r13.getSchemaUrl()
            r11.f97045q = r7
            int r7 = r13.getType()
            r8 = 3
            if (r7 != r8) goto L_0x0201
            android.widget.Button r4 = r11.f97042n
            r4.setText(r6)
            goto L_0x021e
        L_0x0201:
            int r6 = r13.getType()
            if (r6 != r0) goto L_0x020d
            android.widget.Button r4 = r11.f97042n
            r4.setText(r5)
            goto L_0x021e
        L_0x020d:
            int r5 = r13.getType()
            if (r5 != r1) goto L_0x0219
            android.widget.Button r5 = r11.f97042n
            r5.setText(r4)
            goto L_0x021e
        L_0x0219:
            android.widget.Button r4 = r11.f97042n
            r4.setText(r14)
        L_0x021e:
            java.lang.String r4 = r11.f97045q
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r4)
            if (r4 == 0) goto L_0x0240
            android.widget.Button r13 = r11.f97042n
            r13.setVisibility(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r13 = r11.f97041m
            r13.setVisibility(r0)
            android.support.constraint.ConstraintLayout r13 = r11.f97043o
            r13.setEnabled(r3)
            android.widget.TextView r13 = r11.f97031c
            r13.setEnabled(r3)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r13 = r11.f97033e
            r13.setEnabled(r3)
            goto L_0x0273
        L_0x0240:
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r13.getImageUrl()
            if (r4 == 0) goto L_0x025a
            android.widget.Button r4 = r11.f97042n
            r4.setVisibility(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            r4.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            com.ss.android.ugc.aweme.base.model.UrlModel r13 = r13.getImageUrl()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r4, r13)
            goto L_0x0264
        L_0x025a:
            android.widget.Button r13 = r11.f97042n
            r13.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r13 = r11.f97041m
            r13.setVisibility(r0)
        L_0x0264:
            android.support.constraint.ConstraintLayout r13 = r11.f97043o
            r13.setEnabled(r1)
            android.widget.TextView r13 = r11.f97031c
            r13.setEnabled(r1)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r13 = r11.f97033e
            r13.setEnabled(r1)
        L_0x0273:
            r11.m85215e()
            goto L_0x05e0
        L_0x0278:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r13 = r12.getTextNotice()
            r7 = 2132548100(0x7f1c1a04, float:2.0749465E38)
            if (r13 == 0) goto L_0x03f2
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r13 = r12.getTextNotice()
            r11.f97046r = r1
            android.widget.TextView r8 = r11.f97037i
            r8.setVisibility(r2)
            int r8 = r13.getSubType()
            r9 = 21
            if (r8 != r9) goto L_0x02a8
            android.widget.TextView r8 = r11.f97031c
            r8.setVisibility(r2)
            android.widget.TextView r8 = r11.f97038j
            java.lang.String r10 = r13.getTitle()
            r8.setText(r10)
            android.widget.TextView r8 = r11.f97038j
            r8.setVisibility(r3)
            goto L_0x02bb
        L_0x02a8:
            android.widget.TextView r8 = r11.f97031c
            java.lang.String r10 = r13.getTitle()
            r8.setText(r10)
            android.widget.TextView r8 = r11.f97031c
            r8.setVisibility(r3)
            android.widget.TextView r8 = r11.f97038j
            r8.setVisibility(r2)
        L_0x02bb:
            android.widget.ImageView r8 = r11.f97034f
            r8.setVisibility(r2)
            android.widget.TextView r8 = r11.f97039k
            r8.setVisibility(r3)
            r11.m85216f()
            android.widget.TextView r8 = r11.f97031c
            java.lang.String r10 = r13.getTitle()
            r8.setText(r10)
            android.widget.TextView r8 = r11.f97039k
            java.lang.String r10 = r13.getContent()
            r8.setText(r10)
            java.lang.String r8 = r13.getSchemaUrl()
            r11.f97045q = r8
            java.lang.String r8 = r11.f97045q
            java.lang.String r10 = "http"
            boolean r8 = r8.startsWith(r10)
            if (r8 == 0) goto L_0x0300
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "aweme://webview/?url="
            r8.<init>(r10)
            java.lang.String r10 = r11.f97045q
            java.lang.String r10 = android.net.Uri.encode(r10)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r11.f97045q = r8
        L_0x0300:
            java.lang.String r8 = r11.f97045q
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r10 = "effects"
            boolean r10 = r8.getBooleanQueryParameter(r10, r3)
            r11.f97054z = r10
            java.lang.String r10 = "blur"
            boolean r10 = r8.getBooleanQueryParameter(r10, r3)
            r11.f97053y = r10
            java.lang.String r10 = "duet"
            boolean r10 = r8.getBooleanQueryParameter(r10, r3)
            r11.f97027A = r10
            java.lang.String r10 = "aweme_id"
            java.lang.String r8 = r8.getQueryParameter(r10)
            r11.f97028B = r8
            boolean r8 = r11.f97027A
            if (r8 == 0) goto L_0x0338
            java.lang.String r8 = r11.f97028B
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0338
            android.widget.Button r4 = r11.f97042n
            r4.setText(r7)
            goto L_0x0376
        L_0x0338:
            java.lang.String r7 = r11.f97045q
            boolean r7 = m85211b(r7)
            if (r7 == 0) goto L_0x0349
            android.widget.Button r4 = r11.f97042n
            r5 = 2132545570(0x7f1c1022, float:2.0744333E38)
            r4.setText(r5)
            goto L_0x0376
        L_0x0349:
            int r7 = r13.getSubType()
            r8 = 22
            if (r7 != r8) goto L_0x0357
            android.widget.Button r4 = r11.f97042n
            r4.setText(r6)
            goto L_0x0376
        L_0x0357:
            int r6 = r13.getSubType()
            r7 = 23
            if (r6 != r7) goto L_0x0365
            android.widget.Button r4 = r11.f97042n
            r4.setText(r5)
            goto L_0x0376
        L_0x0365:
            int r5 = r13.getSubType()
            if (r5 != r9) goto L_0x0371
            android.widget.Button r5 = r11.f97042n
            r5.setText(r4)
            goto L_0x0376
        L_0x0371:
            android.widget.Button r4 = r11.f97042n
            r4.setText(r14)
        L_0x0376:
            java.lang.String r4 = r13.getTitle()
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r4)
            if (r4 == 0) goto L_0x038a
            android.widget.TextView r4 = r11.f97031c
            r4.setVisibility(r2)
            android.widget.TextView r4 = r11.f97038j
            r4.setVisibility(r2)
        L_0x038a:
            java.lang.String r4 = r11.f97045q
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r4)
            if (r4 == 0) goto L_0x03ac
            android.widget.Button r13 = r11.f97042n
            r13.setVisibility(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r13 = r11.f97041m
            r13.setVisibility(r0)
            android.support.constraint.ConstraintLayout r13 = r11.f97043o
            r13.setEnabled(r3)
            android.widget.TextView r13 = r11.f97031c
            r13.setEnabled(r3)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r13 = r11.f97033e
            r13.setEnabled(r3)
            goto L_0x03ed
        L_0x03ac:
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r13.getImageUrl()
            if (r4 == 0) goto L_0x03ca
            boolean r4 = r11.f97027A
            if (r4 != 0) goto L_0x03ca
            android.widget.Button r4 = r11.f97042n
            r4.setVisibility(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            r4.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            com.ss.android.ugc.aweme.base.model.UrlModel r13 = r13.getImageUrl()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r4, r13)
            goto L_0x03de
        L_0x03ca:
            boolean r13 = r11.f97054z
            if (r13 == 0) goto L_0x03d4
            android.widget.Button r13 = r11.f97042n
            r13.setVisibility(r0)
            goto L_0x03d9
        L_0x03d4:
            android.widget.Button r13 = r11.f97042n
            r13.setVisibility(r3)
        L_0x03d9:
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r13 = r11.f97041m
            r13.setVisibility(r0)
        L_0x03de:
            android.support.constraint.ConstraintLayout r13 = r11.f97043o
            r13.setEnabled(r1)
            android.widget.TextView r13 = r11.f97031c
            r13.setEnabled(r1)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r13 = r11.f97033e
            r13.setEnabled(r1)
        L_0x03ed:
            r11.m85215e()
            goto L_0x05e0
        L_0x03f2:
            com.ss.android.ugc.aweme.notice.repo.list.bean.b r13 = r12.getAdHelperNotice()
            if (r13 == 0) goto L_0x04b3
            com.ss.android.ugc.aweme.notice.repo.list.bean.b r13 = r12.getAdHelperNotice()
            r11.f97046r = r1
            android.widget.TextView r4 = r11.f97031c
            r4.setVisibility(r3)
            android.widget.TextView r4 = r11.f97037i
            r4.setVisibility(r2)
            android.widget.TextView r4 = r11.f97038j
            r4.setVisibility(r2)
            android.widget.ImageView r4 = r11.f97034f
            r4.setVisibility(r2)
            android.widget.TextView r4 = r11.f97039k
            r4.setVisibility(r3)
            r11.m85216f()
            android.widget.TextView r4 = r11.f97031c
            java.lang.String r5 = r13.f96890b
            r4.setText(r5)
            android.widget.TextView r4 = r11.f97039k
            java.lang.String r5 = r13.f96889a
            r4.setText(r5)
            java.lang.String r4 = r13.f96891c
            r11.f97045q = r4
            java.lang.String r4 = r11.f97045q
            java.lang.String r5 = "http"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L_0x0448
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "aweme://webview/?url="
            r4.<init>(r5)
            java.lang.String r5 = r11.f97045q
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r11.f97045q = r4
        L_0x0448:
            android.widget.Button r4 = r11.f97042n
            r5 = 2132545194(0x7f1c0eaa, float:2.074357E38)
            r4.setText(r5)
            java.lang.String r4 = r13.f96890b
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r4)
            if (r4 == 0) goto L_0x045d
            android.widget.TextView r4 = r11.f97031c
            r4.setVisibility(r2)
        L_0x045d:
            java.lang.String r4 = r11.f97045q
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r4)
            if (r4 == 0) goto L_0x047f
            android.widget.Button r13 = r11.f97042n
            r13.setVisibility(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r13 = r11.f97041m
            r13.setVisibility(r0)
            android.support.constraint.ConstraintLayout r13 = r11.f97043o
            r13.setEnabled(r3)
            android.widget.TextView r13 = r11.f97031c
            r13.setEnabled(r3)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r13 = r11.f97033e
            r13.setEnabled(r3)
            goto L_0x04ae
        L_0x047f:
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r13.f96894f
            if (r4 == 0) goto L_0x0495
            android.widget.Button r4 = r11.f97042n
            r4.setVisibility(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            r4.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            com.ss.android.ugc.aweme.base.model.UrlModel r13 = r13.f96894f
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r4, r13)
            goto L_0x049f
        L_0x0495:
            android.widget.Button r13 = r11.f97042n
            r13.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r13 = r11.f97041m
            r13.setVisibility(r0)
        L_0x049f:
            android.support.constraint.ConstraintLayout r13 = r11.f97043o
            r13.setEnabled(r1)
            android.widget.TextView r13 = r11.f97031c
            r13.setEnabled(r1)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r13 = r11.f97033e
            r13.setEnabled(r1)
        L_0x04ae:
            r11.m85215e()
            goto L_0x05e0
        L_0x04b3:
            com.ss.android.ugc.aweme.notice.repo.list.bean.r r13 = r12.getTcmNotice()
            if (r13 == 0) goto L_0x05e0
            com.ss.android.ugc.aweme.notice.repo.list.bean.r r13 = r12.getTcmNotice()
            r11.f97046r = r1
            android.widget.TextView r4 = r11.f97037i
            r4.setVisibility(r2)
            android.widget.TextView r4 = r11.f97031c
            java.lang.String r5 = r13.f96946a
            r4.setText(r5)
            android.widget.TextView r4 = r11.f97031c
            r4.setVisibility(r3)
            android.widget.TextView r4 = r11.f97038j
            r4.setVisibility(r2)
            android.widget.ImageView r4 = r11.f97034f
            r4.setVisibility(r2)
            android.widget.TextView r4 = r11.f97039k
            r4.setVisibility(r3)
            r11.m85216f()
            android.widget.TextView r4 = r11.f97031c
            java.lang.String r5 = r13.f96946a
            r4.setText(r5)
            android.widget.TextView r4 = r11.f97039k
            java.lang.String r5 = r13.f96947b
            r4.setText(r5)
            java.lang.String r4 = r13.f96948c
            r11.f97045q = r4
            java.lang.String r4 = r11.f97045q
            java.lang.String r5 = "http"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L_0x0514
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "aweme://webview/?url="
            r4.<init>(r5)
            java.lang.String r5 = r11.f97045q
            java.lang.String r5 = android.net.Uri.encode(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r11.f97045q = r4
        L_0x0514:
            java.lang.String r4 = r11.f97045q
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r5 = "effects"
            boolean r5 = r4.getBooleanQueryParameter(r5, r3)
            r11.f97054z = r5
            java.lang.String r5 = "blur"
            boolean r5 = r4.getBooleanQueryParameter(r5, r3)
            r11.f97053y = r5
            java.lang.String r5 = "duet"
            boolean r5 = r4.getBooleanQueryParameter(r5, r3)
            r11.f97027A = r5
            java.lang.String r5 = "aweme_id"
            java.lang.String r4 = r4.getQueryParameter(r5)
            r11.f97028B = r4
            boolean r4 = r11.f97027A
            if (r4 == 0) goto L_0x054c
            java.lang.String r4 = r11.f97028B
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x054c
            android.widget.Button r4 = r11.f97042n
            r4.setText(r7)
            goto L_0x0551
        L_0x054c:
            android.widget.Button r4 = r11.f97042n
            r4.setText(r14)
        L_0x0551:
            java.lang.String r4 = r13.f96946a
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r4)
            if (r4 == 0) goto L_0x0563
            android.widget.TextView r4 = r11.f97031c
            r4.setVisibility(r2)
            android.widget.TextView r4 = r11.f97038j
            r4.setVisibility(r2)
        L_0x0563:
            java.lang.String r4 = r11.f97045q
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r4)
            if (r4 == 0) goto L_0x0585
            android.widget.Button r4 = r11.f97042n
            r4.setVisibility(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            r4.setVisibility(r0)
            android.support.constraint.ConstraintLayout r4 = r11.f97043o
            r4.setEnabled(r3)
            android.widget.TextView r4 = r11.f97031c
            r4.setEnabled(r3)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r11.f97033e
            r4.setEnabled(r3)
            goto L_0x05a8
        L_0x0585:
            boolean r4 = r11.f97054z
            if (r4 == 0) goto L_0x058f
            android.widget.Button r4 = r11.f97042n
            r4.setVisibility(r0)
            goto L_0x0594
        L_0x058f:
            android.widget.Button r4 = r11.f97042n
            r4.setVisibility(r3)
        L_0x0594:
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            r4.setVisibility(r0)
            android.support.constraint.ConstraintLayout r4 = r11.f97043o
            r4.setEnabled(r1)
            android.widget.TextView r4 = r11.f97031c
            r4.setEnabled(r1)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r11.f97033e
            r4.setEnabled(r1)
        L_0x05a8:
            r11.m85215e()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.gson.f r5 = new com.google.gson.f     // Catch:{ u -> 0x05c0 }
            r5.<init>()     // Catch:{ u -> 0x05c0 }
            java.lang.String r13 = r13.f96949d     // Catch:{ u -> 0x05c0 }
            java.lang.Class<java.util.HashMap> r6 = java.util.HashMap.class
            java.lang.Object r13 = r5.mo34884a(r13, r6)     // Catch:{ u -> 0x05c0 }
            java.util.HashMap r13 = (java.util.HashMap) r13     // Catch:{ u -> 0x05c0 }
            goto L_0x05c1
        L_0x05c0:
            r13 = r4
        L_0x05c1:
            java.lang.String r4 = "official_message_inner_message"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r6 = "account_type"
            java.lang.String r7 = "starmap_assistant"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            java.lang.String r6 = "action_type"
            java.lang.String r7 = "show"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r7)
            com.ss.android.ugc.aweme.app.f.d r13 = r5.mo47830a(r13)
            java.util.Map<java.lang.String, java.lang.String> r13 = r13.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r13)
        L_0x05e0:
            boolean r13 = r11.f97030D
            if (r13 == 0) goto L_0x0728
            android.app.Activity r13 = r11.f97032d
            int r13 = com.bytedance.common.utility.C9432q.m18670a(r13)
            float r13 = (float) r13
            android.app.Activity r4 = r11.f97032d
            r5 = 1119354880(0x42b80000, float:92.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)
            float r13 = r13 - r4
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x060b
            android.view.View r4 = r11.f97036h
            r4.setVisibility(r2)
            android.app.Activity r4 = r11.f97032d
            r5 = 1113063424(0x42580000, float:54.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)
            float r13 = r13 - r4
            goto L_0x0618
        L_0x060b:
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            int r4 = r4.getVisibility()
            if (r4 != r0) goto L_0x0618
            com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView r4 = r11.f97041m
            r4.setVisibility(r2)
        L_0x0618:
            android.widget.Button r4 = r11.f97042n
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x0659
            android.widget.Button r4 = r11.f97042n
            java.lang.CharSequence r4 = r4.getText()
            android.widget.Button r5 = r11.f97042n
            android.content.Context r5 = r5.getContext()
            java.lang.String r14 = r5.getString(r14)
            boolean r14 = android.text.TextUtils.equals(r4, r14)
            if (r14 == 0) goto L_0x064a
            android.widget.Button r14 = r11.f97042n
            r14.setVisibility(r2)
            android.view.View r14 = r11.f97036h
            r14.setVisibility(r3)
            android.app.Activity r14 = r11.f97032d
            r4 = 1107296256(0x42000000, float:32.0)
            float r14 = com.bytedance.common.utility.C9432q.m18687b(r14, r4)
            float r13 = r13 - r14
            goto L_0x0666
        L_0x064a:
            android.view.View r14 = r11.f97036h
            r14.setVisibility(r2)
            android.app.Activity r14 = r11.f97032d
            r4 = 1120403456(0x42c80000, float:100.0)
            float r14 = com.bytedance.common.utility.C9432q.m18687b(r14, r4)
            float r13 = r13 - r14
            goto L_0x0666
        L_0x0659:
            android.widget.Button r14 = r11.f97042n
            int r14 = r14.getVisibility()
            if (r14 != r0) goto L_0x0666
            android.widget.Button r14 = r11.f97042n
            r14.setVisibility(r2)
        L_0x0666:
            android.widget.TextView r14 = r11.f97040l
            int r14 = r14.getVisibility()
            if (r14 != 0) goto L_0x0673
            android.widget.TextView r14 = r11.f97040l
            r14.setVisibility(r2)
        L_0x0673:
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>()
            boolean r4 = r11.f97004b
            if (r4 == 0) goto L_0x0681
            r4 = 8296(0x2068, float:1.1625E-41)
            r14.append(r4)
        L_0x0681:
            android.widget.TextView r4 = r11.f97031c
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x06a5
            android.widget.TextView r4 = r11.f97031c
            java.lang.CharSequence r4 = r4.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x06a5
            android.widget.TextView r4 = r11.f97031c
            java.lang.CharSequence r4 = r4.getText()
            r14.append(r4)
            android.widget.TextView r4 = r11.f97031c
            r4.setVisibility(r2)
            r4 = 1
            goto L_0x06a6
        L_0x06a5:
            r4 = 0
        L_0x06a6:
            android.widget.TextView r5 = r11.f97038j
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x06ce
            android.widget.TextView r5 = r11.f97038j
            java.lang.CharSequence r5 = r5.getText()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x06ce
            java.lang.String r4 = "#"
            r14.append(r4)
            android.widget.TextView r4 = r11.f97038j
            java.lang.CharSequence r4 = r4.getText()
            r14.append(r4)
            android.widget.TextView r4 = r11.f97038j
            r4.setVisibility(r2)
            r4 = 1
        L_0x06ce:
            android.widget.TextView r2 = r11.f97039k
            int r2 = r2.getVisibility()
            r5 = 33
            if (r2 != 0) goto L_0x0702
            android.widget.TextView r2 = r11.f97039k
            java.lang.CharSequence r2 = r2.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0702
            if (r4 == 0) goto L_0x06f8
            java.lang.String r2 = ": "
            android.text.SpannableStringBuilder r2 = r14.append(r2)
            com.ss.android.ugc.aweme.notification.a.f$a r4 = new com.ss.android.ugc.aweme.notification.a.f$a
            r4.<init>()
            int r6 = r14.length()
            r2.setSpan(r4, r3, r6, r5)
        L_0x06f8:
            android.widget.TextView r2 = r11.f97039k
            java.lang.CharSequence r2 = r2.getText()
            r14.append(r2)
            goto L_0x0710
        L_0x0702:
            if (r4 == 0) goto L_0x0710
            com.ss.android.ugc.aweme.notification.a.f$a r2 = new com.ss.android.ugc.aweme.notification.a.f$a
            r2.<init>()
            int r4 = r14.length()
            r14.setSpan(r2, r3, r4, r5)
        L_0x0710:
            boolean r2 = r11.f97004b
            if (r2 == 0) goto L_0x0719
            r2 = 8297(0x2069, float:1.1627E-41)
            r14.append(r2)
        L_0x0719:
            android.widget.TextView r2 = r11.f97039k
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r4 = r11.f97029C
            r5 = 10
            int r13 = (int) r13
            com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38389i.m85696a(r2, r14, r4, r5, r13)
            android.widget.TextView r13 = r11.f97039k
            r13.setVisibility(r3)
        L_0x0728:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r13 = r11.f97029C
            if (r13 == 0) goto L_0x0744
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r13 = r11.f97029C
            int r13 = r13.getType()
            r14 = 2
            if (r13 != r14) goto L_0x0744
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r13 = r11.f97029C
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r13 = r13.getTextNotice()
            if (r13 == 0) goto L_0x0744
            int r13 = r13.getSubType()
            if (r13 != r0) goto L_0x0744
            goto L_0x0745
        L_0x0744:
            r1 = 0
        L_0x0745:
            if (r1 == 0) goto L_0x075a
            com.ss.android.ugc.aweme.common.MobClick r13 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r14 = "toutiao_message_show"
            com.ss.android.ugc.aweme.common.MobClick r13 = r13.setEventName(r14)
            java.lang.String r14 = "message_add"
            com.ss.android.ugc.aweme.common.MobClick r13 = r13.setLabelName(r14)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r13)
        L_0x075a:
            java.lang.String r13 = "show"
            r11.m85207a(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.p2011a.C38120f.mo78081a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice, boolean, java.lang.String):void");
    }

    public C38120f(View view, Activity activity, int i, boolean z) {
        super(view);
        this.f97032d = activity;
        this.f97052x = i;
        this.f97030D = z;
        this.f97033e = (AvatarImageView) view.findViewById(R.id.bsj);
        ((C13833a) this.f97033e.getHierarchy()).mo25902b((int) R.color.au0);
        this.f97034f = (ImageView) view.findViewById(R.id.bsn);
        this.f97035g = view.findViewById(R.id.bsq);
        this.f97031c = (TextView) view.findViewById(R.id.bsm);
        this.f97037i = (TextView) view.findViewById(R.id.bsi);
        this.f97038j = (TextView) view.findViewById(R.id.bsg);
        this.f97039k = (TextView) view.findViewById(R.id.bsh);
        this.f97040l = (TextView) view.findViewById(R.id.bsp);
        this.f97041m = (RemoteRoundImageView) view.findViewById(R.id.bsr);
        this.f97042n = (Button) view.findViewById(R.id.bsk);
        this.f97043o = (ConstraintLayout) view.findViewById(R.id.bso);
        this.f97044p = view.findViewById(R.id.bsl);
        C38446k.m85764a(this.f97031c);
        C38446k.m85764a(this.f97042n);
        this.f97033e.setOnClickListener(this);
        this.f97031c.setOnClickListener(this);
        this.f97043o.setOnClickListener(this);
        this.f97042n.setOnClickListener(this);
        this.f97041m.setOnClickListener(this);
        if (z) {
            this.f97039k.setMovementMethod((C38116d) C38116d.f97008a.getValue());
            this.f97039k.setClickable(false);
            this.f97039k.setLongClickable(false);
            this.f97036h = view.findViewById(R.id.bs1);
            this.f97036h.setOnClickListener(this);
        }
        this.f97004b = C47842ed.m103485a(this.f97039k.getContext());
    }
}
