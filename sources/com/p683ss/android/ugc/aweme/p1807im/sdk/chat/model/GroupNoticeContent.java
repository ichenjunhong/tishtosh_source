package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35189ae;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent */
public final class GroupNoticeContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "active_users")
    private List<? extends IMUser> activeUsers;
    private boolean hasShow;
    @C17952c(mo34828a = "locale_resources")
    private List<NoticeTemplate> noticeTemplates;
    @C17952c(mo34828a = "passive_users")
    private List<? extends IMUser> passiveUsers;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final List<IMUser> getActiveUsers() {
        return this.activeUsers;
    }

    public final boolean getHasShow() {
        return this.hasShow;
    }

    public final List<NoticeTemplate> getNoticeTemplates() {
        return this.noticeTemplates;
    }

    public final List<IMUser> getPassiveUsers() {
        return this.passiveUsers;
    }

    public final String getMsgHint() {
        return getNoticeText();
    }

    public final boolean isDefinedType() {
        if (this.type <= 100106) {
            return true;
        }
        return false;
    }

    public final boolean isActive() {
        User c = C35265e.m79732c();
        if (c == null) {
            return false;
        }
        List<? extends IMUser> list = this.activeUsers;
        if (list != null) {
            return list.contains(IMUser.fromUser(c));
        }
        return false;
    }

    public final boolean isPassive() {
        User c = C35265e.m79732c();
        if (c == null) {
            return false;
        }
        List<? extends IMUser> list = this.passiveUsers;
        if (list != null) {
            return list.contains(IMUser.fromUser(c));
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTemplateText() {
        /*
            r11 = this;
            boolean r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35189ae.m79441b()
            boolean r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35189ae.m79441b()
            r2 = 0
            if (r1 == 0) goto L_0x0099
            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate> r1 = r11.noticeTemplates
            if (r1 == 0) goto L_0x0099
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.NoticeTemplate) r4
            if (r0 == 0) goto L_0x002f
            java.lang.String r4 = r4.getLanguage()
            java.lang.String r5 = "zh-Hans"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
            goto L_0x0039
        L_0x002f:
            java.lang.String r4 = r4.getLanguage()
            java.lang.String r5 = "en"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
        L_0x0039:
            if (r4 == 0) goto L_0x0015
            goto L_0x003d
        L_0x003c:
            r3 = r2
        L_0x003d:
            com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.NoticeTemplate) r3
            if (r3 == 0) goto L_0x0099
            int r0 = r11.type
            r1 = 100106(0x1870a, float:1.40278E-40)
            r4 = 0
            if (r0 != r1) goto L_0x0073
            boolean r0 = r11.isActive()
            if (r0 == 0) goto L_0x0073
            java.lang.String r5 = r3.getText()
            if (r5 == 0) goto L_0x0087
            java.lang.String r6 = "{0}"
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2132545373(0x7f1c0f5d, float:2.0743934E38)
            java.lang.String r7 = r0.getString(r1)
            java.lang.String r0 = "AppContextManager.getApp…up_notice_edit_name_host)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r0 = p2628d.p2650m.C52830p.m112401a(r5, r6, r7, r8, r9, r10)
            goto L_0x0088
        L_0x0073:
            java.lang.String r5 = r3.getText()
            if (r5 == 0) goto L_0x0087
            java.lang.String r6 = "{0}"
            java.lang.String r7 = r11.getActiveText(r4)
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r0 = p2628d.p2650m.C52830p.m112401a(r5, r6, r7, r8, r9, r10)
            goto L_0x0088
        L_0x0087:
            r0 = r2
        L_0x0088:
            r5 = r0
            if (r5 == 0) goto L_0x0099
            java.lang.String r6 = "{1}"
            java.lang.String r7 = r11.getPassiveText(r4)
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r0 = p2628d.p2650m.C52830p.m112401a(r5, r6, r7, r8, r9, r10)
            r2 = r0
        L_0x0099:
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = ""
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupNoticeContent.getTemplateText():java.lang.String");
    }

    public final boolean isNormalOrder() {
        Object obj;
        int i;
        int i2;
        boolean z;
        if (!isDefinedType()) {
            boolean b = C35189ae.m79441b();
            List<NoticeTemplate> list = this.noticeTemplates;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    NoticeTemplate noticeTemplate = (NoticeTemplate) obj;
                    if (b) {
                        z = C52711k.m112239a((Object) noticeTemplate.getLanguage(), (Object) "zh-Hans");
                        continue;
                    } else {
                        z = C52711k.m112239a((Object) noticeTemplate.getLanguage(), (Object) "en");
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                NoticeTemplate noticeTemplate2 = (NoticeTemplate) obj;
                if (noticeTemplate2 != null) {
                    String text = noticeTemplate2.getText();
                    if (text != null) {
                        i = C52830p.m112419a((CharSequence) text, "{0}", 0, false, 6, (Object) null);
                    } else {
                        i = 0;
                    }
                    String text2 = noticeTemplate2.getText();
                    if (text2 != null) {
                        i2 = C52830p.m112419a((CharSequence) text2, "{1}", 0, false, 6, (Object) null);
                    } else {
                        i2 = 0;
                    }
                    if (i <= i2) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        } else if (this.type == 100101 || this.type == 100102) {
            return false;
        } else {
            return true;
        }
    }

    public final String getNoticeText() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        int i = this.type;
        boolean z2 = true;
        switch (i) {
            case 100100:
                if (!isActive()) {
                    if (isPassive()) {
                        if (!TextUtils.isEmpty(getPassiveText$default(this, false, 1, null))) {
                            Context a = C11010c.m22280a();
                            StringBuilder sb2 = new StringBuilder(", ");
                            sb2.append(getPassiveText$default(this, false, 1, null));
                            sb.append(a.getString(R.string.biv, new Object[]{getActiveText$default(this, false, 1, null), sb2.toString()}));
                            break;
                        } else {
                            sb.append(C11010c.m22280a().getString(R.string.biv, new Object[]{getActiveText$default(this, false, 1, null), getPassiveText$default(this, false, 1, null)}));
                            break;
                        }
                    } else {
                        sb.append(C11010c.m22280a().getString(R.string.bix, new Object[]{getActiveText$default(this, false, 1, null), getPassiveText$default(this, false, 1, null)}));
                        break;
                    }
                } else {
                    sb.append(C11010c.m22280a().getString(R.string.biw, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
            case 100101:
                if (!isActive()) {
                    if (!isPassive()) {
                        sb.append(C11010c.m22280a().getString(R.string.bj0, new Object[]{getPassiveText$default(this, false, 1, null), getActiveText$default(this, false, 1, null)}));
                        break;
                    } else {
                        sb.append(C11010c.m22280a().getString(R.string.biy, new Object[]{getActiveText$default(this, false, 1, null)}));
                        break;
                    }
                } else {
                    sb.append(C11010c.m22280a().getString(R.string.biz, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
            case 100102:
                if (!isActive()) {
                    if (!isPassive()) {
                        sb.append(C11010c.m22280a().getString(R.string.bj8, new Object[]{getPassiveText$default(this, false, 1, null), getActiveText$default(this, false, 1, null)}));
                        break;
                    } else {
                        sb.append(C11010c.m22280a().getString(R.string.bj6, new Object[]{getActiveText$default(this, false, 1, null)}));
                        break;
                    }
                } else {
                    sb.append(C11010c.m22280a().getString(R.string.bj7, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
            case 100103:
                sb.append(C11010c.m22280a().getString(R.string.bj_));
                break;
            case 100104:
                if (!isActive()) {
                    if (isPassive()) {
                        sb.append(C11010c.m22280a().getString(R.string.bmj));
                        break;
                    }
                } else {
                    sb.append(C11010c.m22280a().getString(R.string.bj9, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
                break;
            case 100105:
                sb.append(C11010c.m22280a().getString(R.string.bj5, new Object[]{getActiveText$default(this, false, 1, null)}));
                break;
            case 100106:
                sb.append(getTemplateText());
                break;
            default:
                switch (i) {
                    case 100120:
                        sb.append(C11010c.m22280a().getString(R.string.bja));
                        break;
                    case 100121:
                        sb.append(C11010c.m22280a().getString(R.string.bj4));
                        break;
                    default:
                        sb.append(getTemplateText());
                        break;
                }
        }
        z2 = false;
        if (z2) {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                Boolean groupNewMemberCanPullOldMsg = b.getGroupNewMemberCanPullOldMsg();
                C52711k.m112236a((Object) groupNewMemberCanPullOldMsg, "SettingsReader.get().groupNewMemberCanPullOldMsg");
                z = groupNewMemberCanPullOldMsg.booleanValue();
            } catch (C10174a unused) {
                z = false;
            }
            if (z) {
                sb.append(C11010c.m22280a().getString(R.string.ft6));
            }
        }
        String sb3 = sb.toString();
        C52711k.m112236a((Object) sb3, "builder.toString()");
        return sb3;
    }

    public final void setActiveUsers(List<? extends IMUser> list) {
        this.activeUsers = list;
    }

    public final void setHasShow(boolean z) {
        this.hasShow = z;
    }

    public final void setNoticeTemplates(List<NoticeTemplate> list) {
        this.noticeTemplates = list;
    }

    public final void setPassiveUsers(List<? extends IMUser> list) {
        this.passiveUsers = list;
    }

    public final String getActiveText(boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        User c = C35265e.m79732c();
        C52711k.m112236a((Object) c, "AppUtil.getCurrentUser()");
        List<? extends IMUser> list = this.activeUsers;
        boolean z3 = false;
        if (list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                IMUser iMUser = (IMUser) next;
                if (!z || (!C52711k.m112239a((Object) iMUser.getUid(), (Object) c.getUid()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            for (IMUser iMUser2 : (List) arrayList) {
                if (!this.hasShow) {
                    IMUser a = C34010e.m77748a().mo71952a(iMUser2.getUid());
                    if (a != null) {
                        iMUser2.setNickName(a.getNickName());
                        iMUser2.setRemarkName(a.getRemarkName());
                    }
                }
                String displayName = iMUser2.getDisplayName();
                if (displayName != null) {
                    sb.append(displayName);
                    sb.append("、");
                }
            }
        }
        if (sb.length() > 0) {
            z3 = true;
        }
        if (z3) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "activeText.also {\n      …UNT)\n        }.toString()");
        return sb2;
    }

    public final String getPassiveText(boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        User c = C35265e.m79732c();
        C52711k.m112236a((Object) c, "AppUtil.getCurrentUser()");
        List<? extends IMUser> list = this.passiveUsers;
        boolean z3 = false;
        if (list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                IMUser iMUser = (IMUser) next;
                if (!z || (!C52711k.m112239a((Object) iMUser.getUid(), (Object) c.getUid()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            for (IMUser iMUser2 : (List) arrayList) {
                if (!this.hasShow) {
                    IMUser a = C34010e.m77748a().mo71952a(iMUser2.getUid());
                    if (a != null) {
                        iMUser2.setNickName(a.getNickName());
                        iMUser2.setRemarkName(a.getRemarkName());
                    }
                }
                String displayName = iMUser2.getDisplayName();
                if (displayName != null) {
                    sb.append(displayName);
                    sb.append("、");
                }
            }
        }
        if (sb.length() > 0) {
            z3 = true;
        }
        if (z3) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "passiveText.also {\n     …UNT)\n        }.toString()");
        return sb2;
    }

    public static /* synthetic */ String getActiveText$default(GroupNoticeContent groupNoticeContent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return groupNoticeContent.getActiveText(z);
    }

    public static /* synthetic */ String getPassiveText$default(GroupNoticeContent groupNoticeContent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return groupNoticeContent.getPassiveText(z);
    }
}
