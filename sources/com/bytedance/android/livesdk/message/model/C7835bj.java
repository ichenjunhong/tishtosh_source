package com.bytedance.android.livesdk.message.model;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.message.C7792f;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.http.p1169a.p1174d.C19190d;
import com.ss.android.ugc.trill.R;
import java.util.Comparator;

/* renamed from: com.bytedance.android.livesdk.message.model.bj */
public class C7835bj extends C7859c implements Comparator {
    @C17952c(mo34828a = "member_count")

    /* renamed from: a */
    public int f21633a;
    @C17952c(mo34828a = "user")

    /* renamed from: b */
    public User f21634b;
    @C17952c(mo34828a = "is_top_user")

    /* renamed from: c */
    boolean f21635c;
    @C17952c(mo34828a = "action")

    /* renamed from: d */
    public int f21636d;
    @C17952c(mo34828a = "top_user_no")

    /* renamed from: e */
    public int f21637e;
    @C17952c(mo34828a = "operator")

    /* renamed from: f */
    public User f21638f;
    @C17952c(mo34828a = "is_set_to_admin")

    /* renamed from: g */
    public boolean f21639g;
    @C17952c(mo34828a = "rank_score")

    /* renamed from: h */
    public int f21640h;
    @C17952c(mo34828a = "enter_type")

    /* renamed from: i */
    public int f21641i;
    @C17952c(mo34828a = "action_description")

    /* renamed from: j */
    public String f21642j;
    @C17952c(mo34828a = "enter_effect_config")

    /* renamed from: k */
    public C7836a f21643k;
    @C17952c(mo34828a = "user_id")

    /* renamed from: l */
    public long f21644l;
    @C17952c(mo34828a = "pop_str")

    /* renamed from: m */
    public String f21645m;
    @C17952c(mo34828a = "background_image_v2")

    /* renamed from: n */
    public ImageModel f21646n;

    /* renamed from: com.bytedance.android.livesdk.message.model.bj$a */
    public static class C7836a {
        @C17952c(mo34828a = "type")

        /* renamed from: a */
        public int f21647a;
        @C17952c(mo34828a = "icon")

        /* renamed from: b */
        public ImageModel f21648b;
        @C17952c(mo34828a = "text")

        /* renamed from: c */
        public C8851g f21649c;
        @C17952c(mo34828a = "avatar_pos")

        /* renamed from: d */
        public int f21650d;
        @C17952c(mo34828a = "text_icon")

        /* renamed from: e */
        public ImageModel f21651e;
        @C17952c(mo34828a = "stay_time")

        /* renamed from: f */
        public int f21652f;
        @C17952c(mo34828a = "anim_asset_id")

        /* renamed from: g */
        public long f21653g;
        @C17952c(mo34828a = "badge")

        /* renamed from: h */
        public ImageModel f21654h;
    }

    /* renamed from: a */
    public final long mo14147a() {
        return (long) this.f21636d;
    }

    /* renamed from: b */
    public final long mo14148b() {
        return (long) this.f21637e;
    }

    public C7835bj() {
        this.type = C8629a.MEMBER;
    }

    public int hashCode() {
        return C19190d.m46779a(17, (Object) Long.valueOf(this.baseMessage.f24133d));
    }

    /* renamed from: d */
    private String m15873d() {
        if (this.f21642j == null) {
            if (this.f21636d != 1) {
                this.f21642j = "";
            } else {
                this.f21642j = m15872a(R.string.euf, new Object[0]);
            }
        }
        return this.f21642j;
    }

    /* renamed from: e */
    private boolean m15874e() {
        if (this.f21638f == null || this.f21638f.getUserAttr() == null || !this.f21638f.getUserAttr().f8852c) {
            return false;
        }
        return true;
    }

    public boolean canText() {
        if (this.f21634b == null || C9431p.m18664a(mo14149c())) {
            return false;
        }
        return true;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null || this.f21635c) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MemberMessage{action=");
        sb.append(this.f21636d);
        sb.append(", enterType=");
        sb.append(this.f21641i);
        sb.append(", actionDescription='");
        sb.append(this.f21642j);
        sb.append('\'');
        sb.append(", enterEffectConfig=");
        sb.append(this.f21643k);
        sb.append(", userId=");
        sb.append(this.f21644l);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo14149c() {
        String str;
        int i;
        Object[] objArr;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.f21638f == null) {
            str = "";
        } else {
            str = C7792f.m15860a(this.f21638f);
        }
        switch (this.f21636d) {
            case 1:
                if (!this.f21635c) {
                    return m15873d();
                }
                return m15872a(R.string.eu3, Integer.valueOf(this.f21637e), m15873d());
            case 2:
                if (this.f21635c) {
                    i = R.string.eu4;
                    objArr = new Object[]{Integer.valueOf(this.f21637e)};
                } else {
                    i = R.string.euk;
                    objArr = new Object[0];
                }
                return m15872a(i, objArr);
            case 3:
                if (m15874e()) {
                    if (this.f21634b == null) {
                        return "";
                    }
                    return m15872a(R.string.eur, C7792f.m15860a(this.f21634b), str);
                } else if (this.f21634b == null) {
                    return "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C7792f.m15860a(this.f21634b));
                    sb.append(m15872a(R.string.euq, new Object[0]));
                    return sb.toString();
                }
            case 4:
                if (m15874e()) {
                    if (this.f21634b == null) {
                        return "";
                    }
                    return m15872a(R.string.eut, C7792f.m15860a(this.f21634b), str);
                } else if (this.f21634b == null) {
                    return "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C7792f.m15860a(this.f21634b));
                    sb2.append(m15872a(R.string.eus, new Object[0]));
                    return sb2.toString();
                }
            case 5:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C7792f.m15860a(this.f21634b));
                sb3.append(" ");
                sb3.append(m15872a(R.string.euo, new Object[0]));
                return sb3.toString();
            case 6:
                StringBuilder sb4 = new StringBuilder();
                sb4.append(C7792f.m15860a(this.f21634b));
                sb4.append(" ");
                sb4.append(m15872a(R.string.eud, new Object[0]));
                return sb4.toString();
            case 8:
                if (this.f21637e > 0) {
                    if (this.f21639g) {
                        str2 = m15872a(R.string.euc, C7792f.m15860a(this.f21634b), Integer.valueOf(this.f21637e));
                    } else {
                        str2 = m15872a(R.string.eub, C7792f.m15860a(this.f21634b), Integer.valueOf(this.f21637e));
                    }
                    return str2;
                }
                break;
            case 9:
                Object[] objArr2 = new Object[2];
                if (this.f21634b == null) {
                    str3 = "";
                } else {
                    str3 = C7792f.m15860a(this.f21634b);
                }
                objArr2[0] = str3;
                if (this.f21638f == null) {
                    str4 = "";
                } else {
                    str4 = C7792f.m15860a(this.f21638f);
                }
                objArr2[1] = str4;
                return m15872a(R.string.eur, objArr2);
            case 10:
                Object[] objArr3 = new Object[2];
                if (this.f21634b == null) {
                    str5 = "";
                } else {
                    str5 = C7792f.m15860a(this.f21634b);
                }
                objArr3[0] = str5;
                if (this.f21638f == null) {
                    str6 = "";
                } else {
                    str6 = C7792f.m15860a(this.f21638f);
                }
                objArr3[1] = str6;
                return m15872a(R.string.eut, objArr3);
            case 11:
                if (m15874e()) {
                    if (this.f21634b == null) {
                        return "";
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(C7792f.m15860a(this.f21634b));
                    sb5.append(m15872a(R.string.eui, new Object[0]));
                    return sb5.toString();
                } else if (this.f21634b == null) {
                    return "";
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(C7792f.m15860a(this.f21634b));
                    sb6.append(m15872a(R.string.euh, new Object[0]));
                    return sb6.toString();
                }
        }
        return "";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7835bj) || this.baseMessage.f24133d != ((C7835bj) obj).baseMessage.f24133d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m15872a(int i, Object... objArr) {
        Context e = C3922z.m9915e();
        if (objArr.length > 0) {
            return e.getResources().getString(i, objArr);
        }
        return e.getResources().getString(i);
    }

    public int compare(Object obj, Object obj2) {
        C7835bj bjVar = (C7835bj) obj;
        C7835bj bjVar2 = (C7835bj) obj2;
        if (bjVar.f21640h == bjVar2.f21640h) {
            return -1;
        }
        return bjVar.f21640h - bjVar2.f21640h;
    }
}
