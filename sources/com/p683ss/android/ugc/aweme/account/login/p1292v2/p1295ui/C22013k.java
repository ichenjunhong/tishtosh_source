package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import com.bef.effectsdk.message.MessageCenter;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21862a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21876e;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21883g;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21887h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21894i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21926m;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21930n;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21934o;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21945q;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21951r;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21957s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21967t;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21979u;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21986v;
import com.p683ss.android.ugc.aweme.account.login.recover.C21428b;
import com.p683ss.android.ugc.aweme.account.login.recover.C21444f;
import com.p683ss.android.ugc.aweme.account.p1267b.C20903a;
import com.p683ss.android.ugc.aweme.account.p1267b.C20910b;
import com.p683ss.android.ugc.aweme.account.p1271d.C20946a;
import com.p683ss.android.ugc.aweme.account.p1271d.C20953b;
import com.p683ss.android.ugc.aweme.account.p1271d.C20958c;
import com.p683ss.android.ugc.aweme.account.p1300n.C22057a;
import com.p683ss.android.ugc.aweme.account.p1300n.C22061b;
import com.p683ss.android.ugc.aweme.account.p1300n.C22065c;
import com.p683ss.android.ugc.aweme.account.p1303p.C22100a;
import com.p683ss.android.ugc.aweme.account.p1303p.C22109b;
import com.p683ss.android.ugc.aweme.account.p1303p.C22115c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.k */
public final class C22013k {

    /* renamed from: a */
    public static final C22013k f59487a = new C22013k();

    private C22013k() {
    }

    /* renamed from: b */
    public static int m54759b(C21850i iVar) {
        C52711k.m112240b(iVar, "step");
        switch (C22014l.f59489b[iVar.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 7;
            case 3:
                return 1;
            case 4:
                return 0;
            default:
                throw new IllegalArgumentException("此step暂不支持");
        }
    }

    /* renamed from: a */
    public static C21829b m54758a(C21850i iVar) {
        C52711k.m112240b(iVar, "step");
        switch (C22014l.f59488a[iVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new C21876e();
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return new C21894i();
            case 13:
                return new C22109b();
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return new C21862a();
            case 19:
            case 20:
            case 21:
                return new C21934o();
            case 22:
                return new C21926m();
            case 23:
                return new C21930n();
            case 24:
                return new C21945q();
            case 25:
                return new C21951r();
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                return new C21979u();
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
            case 28:
                return new C21883g();
            case 29:
                return new C21957s();
            case 30:
                return new C21967t();
            case 31:
                return new C21887h();
            case 32:
                return new C21428b();
            case 33:
                return new C21444f();
            case 34:
                return new C21883g();
            case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                return new C21957s();
            case 36:
                return new C21894i();
            case 37:
                return new C22061b();
            case 38:
                return new C22065c();
            case 39:
                return new C20903a();
            case 40:
                return new C20910b();
            case BaseNotice.LIKE /*41*/:
                return new C20953b();
            case 42:
                return new C20958c();
            case 43:
                return new C20946a();
            case 44:
                return new C22100a();
            case BaseNotice.f96882AT /*45*/:
                return new C22115c();
            case 46:
                return new C22057a();
            case 47:
            case 48:
            case 49:
                return new C21986v();
            default:
                throw new IllegalArgumentException("此step暂不支持");
        }
    }
}
