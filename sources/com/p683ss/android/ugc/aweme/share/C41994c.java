package com.p683ss.android.ugc.aweme.share;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p683ss.android.ugc.aweme.setting.UgDiffDownloadReportOnlyDiff;
import com.p683ss.android.ugc.aweme.setting.UgDiffDownloadUnreportExtra;
import com.p683ss.android.ugc.aweme.share.AwemeACLStruct.ACLCommonStruct;
import com.p683ss.android.ugc.aweme.share.AwemeACLStruct.ServerExtra;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47891fl;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.c */
public final class C41994c {

    /* renamed from: a */
    public static final C41994c f106287a = new C41994c();

    /* renamed from: b */
    private static String f106288b = "share_panel";

    /* renamed from: c */
    private static String f106289c = "";

    private C41994c() {
    }

    /* renamed from: a */
    public static final void m91963a(String str) {
        C52711k.m112240b(str, "<set-?>");
        f106288b = str;
    }

    /* renamed from: b */
    public static final void m91967b(String str) {
        C52711k.m112240b(str, "<set-?>");
        f106289c = str;
    }

    /* renamed from: a */
    private static ACLCommonShare m91960a(Aweme aweme) {
        ACLCommonShare aCLCommonShare;
        if (aweme == null) {
            return null;
        }
        AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
        if (awemeACLShareInfo != null) {
            aCLCommonShare = awemeACLShareInfo.getDownloadSharePanel();
        } else {
            aCLCommonShare = null;
        }
        if (aCLCommonShare != null) {
            return awemeACLShareInfo.getDownloadSharePanel();
        }
        if (awemeACLShareInfo != null) {
            return awemeACLShareInfo.getDownloadGeneral();
        }
        return null;
    }

    /* renamed from: b */
    private static ACLCommonShare m91966b(Aweme aweme) {
        ACLCommonShare aCLCommonShare;
        if (aweme == null) {
            return null;
        }
        AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
        if (awemeACLShareInfo != null) {
            aCLCommonShare = awemeACLShareInfo.getDownloadMaskPanel();
        } else {
            aCLCommonShare = null;
        }
        if (aCLCommonShare != null) {
            return awemeACLShareInfo.getDownloadMaskPanel();
        }
        if (awemeACLShareInfo != null) {
            return awemeACLShareInfo.getDownloadGeneral();
        }
        return null;
    }

    /* renamed from: a */
    private static void m91961a(ACLCommonStruct aCLCommonStruct) {
        C52711k.m112240b(aCLCommonStruct, "aclCommonStruct");
        aCLCommonStruct.setCode(0);
        aCLCommonStruct.setShowType(2);
        aCLCommonStruct.setToastMsg("");
        aCLCommonStruct.setExtra("");
    }

    /* renamed from: a */
    private static int m91959a(ACLCommonShare aCLCommonShare, ACLCommonStruct aCLCommonStruct) {
        if (aCLCommonShare.getCode() == aCLCommonStruct.getCode() && aCLCommonShare.getShowType() == aCLCommonStruct.getShowType() && C52711k.m112239a((Object) aCLCommonShare.getToastMsg(), (Object) aCLCommonStruct.getToastMsg())) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static final void m91964a(String str, Aweme aweme) {
        ACLCommonShare aCLCommonShare;
        boolean z;
        boolean z2;
        int i;
        String str2;
        if (aweme != null) {
            if (C52711k.m112239a((Object) f106288b, (Object) "long_press_download")) {
                aCLCommonShare = m91966b(aweme);
            } else {
                aCLCommonShare = m91960a(aweme);
            }
            int i2 = 1;
            if (aCLCommonShare == null) {
                aCLCommonShare = new ACLCommonShare();
                z = true;
            } else {
                z = false;
            }
            ACLCommonStruct a = AwemeACLStruct.m91858a();
            if (C47891fl.m103593a(a.getToastMsg()) || a.getShowType() != 2) {
                a.setCode(1);
            }
            int a2 = m91959a(aCLCommonShare, a);
            if (a2 != 0 || !C10193n.m20607a().mo18204a(UgDiffDownloadReportOnlyDiff.class, "ug_diff_download_report_only_diff", C10181b.m20511a().mo18175c().getUgDiffDownloadReportOnlyDiff(), false)) {
                C23089d a3 = C23089d.m56640a();
                String str3 = "enter_from";
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = f106289c;
                }
                a3.mo47829a(str3, str);
                a3.mo47829a("group_id", aweme.getAid());
                a3.mo47829a("download_method", f106288b);
                String str4 = "downloadable_client";
                if (a.getCode() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                a3.mo47826a(str4, i);
                String str5 = "downloadable_server";
                if (aCLCommonShare.getCode() != 0) {
                    i2 = 0;
                }
                a3.mo47826a(str5, i2);
                a3.mo47826a("client_diff_result", a2);
                a3.mo47829a("download_client_json", C47760cd.m103385a(a));
                if (!C10193n.m20607a().mo18204a(UgDiffDownloadUnreportExtra.class, "ug_diff_download_unreport_extra", C10181b.m20511a().mo18175c().getUgDiffDownloadUnreportExtra(), false)) {
                    String str6 = "download_server_json";
                    if (z) {
                        str2 = null;
                    } else {
                        str2 = C47760cd.m103385a(aCLCommonShare);
                    }
                    a3.mo47829a(str6, str2);
                    a3.mo47829a("server_extra_json", C47760cd.m103385a(new ServerExtra().buildServerExtraJson(aweme)));
                }
                C26890h.m65011a("ug_diff_download", a3.f61491a);
            }
        }
    }

    /* renamed from: a */
    public static final void m91962a(C42350b bVar, String str, Aweme aweme) {
        C52711k.m112240b(bVar, "builder");
        m91961a(AwemeACLStruct.m91858a());
        f106288b = "share_panel";
        Iterator it = bVar.f106961b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C42357g gVar = (C42357g) it.next();
            if (C52711k.m112239a((Object) gVar.mo49954c(), (Object) "download")) {
                AwemeACLStruct.m91858a().setCode(0);
                int i = 2;
                if (!gVar.mo49957f()) {
                    i = 1;
                }
                AwemeACLStruct.m91858a().setShowType(i);
            } else {
                AwemeACLStruct.m91858a().setShowType(0);
                AwemeACLStruct.m91858a().setCode(1);
            }
        }
        if (AwemeACLStruct.m91858a().getShowType() == 0) {
            m91964a(str, aweme);
        }
    }

    /* renamed from: a */
    public static final void m91965a(boolean z, String str, Aweme aweme) {
        m91961a(AwemeACLStruct.m91858a());
        if (!z) {
            AwemeACLStruct.m91858a().setShowType(0);
            AwemeACLStruct.m91858a().setCode(1);
            f106288b = "long_press_download";
            m91964a(str, aweme);
        }
    }
}
