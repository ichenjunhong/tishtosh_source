package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p683ss.android.ugc.aweme.notification.p2013c.C38161b;
import com.p683ss.android.ugc.aweme.notification.util.C38439g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.notification.a.b */
public class C38114b extends C1352v implements OnClickListener, OnLongClickListener {

    /* renamed from: a */
    public C38131m f97003a;

    /* renamed from: b */
    protected boolean f97004b;

    /* renamed from: c */
    private BaseNotice f97005c;

    /* renamed from: d */
    private Map<String, BaseNotice> f97006d;

    /* renamed from: e */
    private View f97007e;

    /* renamed from: a */
    protected static boolean m85186a(int i) {
        return i == 7 || i == 8 || i == 9 || i == 10;
    }

    /* renamed from: c */
    private static String mo78097c() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo78083a() {
        return false;
    }

    /* renamed from: a */
    public final void mo78091a(Map<String, BaseNotice> map, BaseNotice baseNotice, boolean z, String str) {
        this.f97006d = map;
        mo78081a(baseNotice, z, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo78082a(boolean z) {
        if (z && this.f97006d != null && this.f97005c != null) {
            this.f97006d.put(this.f97005c.getNid(), this.f97005c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo78087a(String str, String str2, int i, BaseNotice baseNotice, boolean z, String str3, String str4) {
        mo78088a(str, str2, i, baseNotice, z, str3, str4, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo78088a(String str, String str2, int i, BaseNotice baseNotice, boolean z, String str3, String str4, String str5) {
        if (baseNotice != null) {
            C38161b j = new C38161b().mo78147a(str).mo78151b(str2).mo78145a(baseNotice.getCreateTime()).mo78152c(str3).mo78146a(baseNotice.logPbBean).mo78159j(str4);
            char c = 65535;
            if (baseNotice.timeLineType != -1) {
                j.mo78157h(C38439g.m85756a(baseNotice.timeLineType)).mo78158i("1002");
            }
            if (!TextUtils.isEmpty(baseNotice.getLabelText())) {
                j.mo78161l(baseNotice.getLabelText());
            }
            if (i != -1) {
                j.mo78144a(i);
            }
            j.mo78148a(!z);
            if (!TextUtils.isEmpty(str5)) {
                j.mo78160k(str5);
            }
            int hashCode = str2.hashCode();
            if (hashCode != 3123) {
                if (hashCode != 3135424) {
                    if (hashCode != 3321751) {
                        if (hashCode == 950398559 && str2.equals("comment")) {
                            c = 2;
                        }
                    } else if (str2.equals("like")) {
                        c = 1;
                    }
                } else if (str2.equals("fans")) {
                    c = 0;
                }
            } else if (str2.equals("at")) {
                c = 3;
            }
            switch (c) {
                case 0:
                    m85183a(j, baseNotice);
                    break;
                case 1:
                    m85187b(j, baseNotice);
                    break;
                case 2:
                    m85189c(j, baseNotice);
                    break;
                case 3:
                    m85190d(j, baseNotice);
                    break;
            }
            j.mo78149a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo78089a(String str, String str2, int i, boolean z) {
        mo78090a(str, str2, i, z, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo78090a(String str, String str2, int i, boolean z, String str3) {
        m85184a(str, str2, i, z ? "yellow_dot" : "", str3);
    }

    /* renamed from: b */
    public final boolean mo78092b() {
        if (C38115c.m85202a(C11010c.m22280a())) {
            return false;
        }
        C10691a.m21542b(this.f97007e.getContext(), (int) R.string.cg1).mo19066a();
        return true;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        mo78082a(true);
    }

    public C38114b(View view) {
        super(view);
        this.f97007e = view;
        if (mo78083a()) {
            this.f97007e.setOnLongClickListener(this);
        }
    }

    /* renamed from: a */
    protected static String m85181a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\d+\\d$").matcher(str);
        if (matcher.find()) {
            str2 = matcher.group();
        }
        return str2;
    }

    /* renamed from: a */
    protected static String m85180a(CommentNotice commentNotice) {
        if (commentNotice == null) {
            return "";
        }
        String str = "";
        switch (commentNotice.getCommentType()) {
            case 11:
            case 14:
                str = "comment_a";
                break;
            case 12:
            case 15:
                str = "comment_b";
                break;
            case 13:
            case 16:
                str = "comment_c";
                break;
        }
        return str;
    }

    public boolean onLongClick(View view) {
        boolean z;
        if (this.f97005c == null || this.f97005c.getVcdAuthStatus() != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        int layoutPosition = getLayoutPosition();
        if (this.f97003a != null && layoutPosition >= 0) {
            this.f97003a.mo78105b(layoutPosition);
        }
        return true;
    }

    /* renamed from: d */
    private static void m85190d(C38161b bVar, BaseNotice baseNotice) {
        AtMe atMe = baseNotice.getAtMe();
        if (atMe != null) {
            bVar.mo78150b(0);
            bVar.mo78154e(atMe.getUser().getUid());
        }
    }

    /* renamed from: c */
    private static void m85189c(C38161b bVar, BaseNotice baseNotice) {
        CommentNotice commentNotice = baseNotice.getCommentNotice();
        if (commentNotice != null) {
            bVar.mo78150b(0);
            bVar.mo78154e(commentNotice.getComment().getUser().getUid());
            switch (commentNotice.getCommentType()) {
                case 0:
                case 1:
                case 5:
                case 11:
                case 14:
                    bVar.mo78155f("video");
                    bVar.mo78156g(commentNotice.getForwardId());
                    return;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    bVar.mo78155f("comment");
                    bVar.mo78156g(commentNotice.getForwardId());
                    break;
            }
        }
    }

    /* renamed from: a */
    private static void m85183a(C38161b bVar, BaseNotice baseNotice) {
        FollowNotice followNotice = baseNotice.getFollowNotice();
        if (followNotice != null) {
            bVar.mo78150b(0);
            bVar.mo78154e(followNotice.getUser().getUid());
            int followStatus = followNotice.getUser().getFollowStatus();
            if (followStatus == 0) {
                bVar.mo78153d("follow");
                return;
            }
            if (followStatus == 1 || followStatus == 2) {
                bVar.mo78153d("followed");
            }
        }
    }

    /* renamed from: b */
    private static void m85187b(C38161b bVar, BaseNotice baseNotice) {
        DiggNotice diggNotice = baseNotice.getDiggNotice();
        if (diggNotice != null) {
            List users = diggNotice.getUsers();
            if (users != null && users.size() != 0) {
                if (diggNotice.getMergeCount() == 1) {
                    bVar.mo78150b(0);
                    bVar.mo78154e(((User) users.get(0)).getUid());
                } else {
                    bVar.mo78150b(1);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < users.size(); i++) {
                        User user = (User) users.get(i);
                        if (i == users.size() - 1) {
                            sb.append(user.getUid());
                        } else {
                            sb.append(user.getUid());
                            sb.append(",");
                        }
                    }
                    bVar.mo78154e(sb.toString());
                }
                if (diggNotice.getDiggType() == 3) {
                    bVar.mo78155f("comment");
                    bVar.mo78156g(diggNotice.getCid());
                    return;
                }
                bVar.mo78155f("video");
                bVar.mo78156g(diggNotice.getForwardId());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo78081a(BaseNotice baseNotice, boolean z, String str) {
        this.f97005c = baseNotice;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo78085a(Activity activity, String str, String str2) {
        m85182a(activity, str, str2, "message");
    }

    /* renamed from: a */
    protected static void m85185a(String str, String str2, String str3) {
        C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", str2).mo47829a("enter_method", str3).mo47829a("to_user_id", str).mo47831b().f61491a);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.app.Activity, code=android.content.Context, for r1v0, types: [android.content.Context, android.app.Activity] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m85182a(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            if (r1 != 0) goto L_0x0006
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
        L_0x0006:
            java.lang.String r0 = "aweme://user/profile/"
            com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            java.lang.String r0 = "uid"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r0, r2)
            java.lang.String r2 = "enter_from"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r4)
            java.lang.String r2 = "sec_user_id"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r3)
            java.lang.String r2 = "previous_page"
            java.lang.String r3 = "message"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r3)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "follow_button"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r3)
            java.lang.String r2 = "extra_previous_page_position"
            java.lang.String r3 = "other_places"
            com.bytedance.router.SmartRoute r1 = r1.withParam(r2, r3)
            r1.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.p2011a.C38114b.m85182a(android.app.Activity, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    private void m85184a(String str, String str2, int i, String str3, String str4) {
        C23089d a = C23089d.m56640a().mo47829a("action_type", str).mo47829a("account_type", str2).mo47829a("client_order", String.valueOf(i)).mo47829a("notice_type", str3).mo47829a("notification_type", str4);
        String c = mo78097c();
        if (!TextUtils.isEmpty(c)) {
            a.mo47829a("explain_relation", c);
        }
        C26890h.m65011a("notification_message_inner_message", a.f61491a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo78086a(String str, String str2, int i, BaseNotice baseNotice, boolean z, String str3) {
        mo78087a(str, str2, i, baseNotice, z, "", str3);
    }
}
