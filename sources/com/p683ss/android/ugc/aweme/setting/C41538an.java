package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.setting.an */
public final class C41538an {

    /* renamed from: a */
    public static int f105223a = 1;

    /* renamed from: b */
    public static int f105224b = 2;

    /* renamed from: c */
    public static int f105225c = 3;

    /* renamed from: d */
    public static int f105226d = 2;

    /* renamed from: e */
    public static int f105227e = 1;

    /* renamed from: f */
    public static int f105228f;

    /* renamed from: a */
    public static void m91368a() {
        if (!C39618d.f101151O.mo83117a(C40796a.ReactDuetSettingChanged)) {
            C0013i.m16a(C41539ao.f105229a).mo19a(C41540ap.f105230a);
        }
    }

    /* renamed from: a */
    public static boolean m91369a(BaseShortVideoContext baseShortVideoContext) {
        boolean z;
        boolean z2;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) ? baseShortVideoContext == null || baseShortVideoContext.getVideoLength() <= 0 || ((long) baseShortVideoContext.getVideoLength()) > 60500 : (baseShortVideoContext == null || baseShortVideoContext.getVideoLength() <= 0 || ((long) baseShortVideoContext.getVideoLength()) > 60500) && ((VideoPublishEditModel) baseShortVideoContext).recordMode != 1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (baseShortVideoContext == null || baseShortVideoContext.getVideoLength() <= 0 || ((long) baseShortVideoContext.getVideoLength()) > 60500) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
