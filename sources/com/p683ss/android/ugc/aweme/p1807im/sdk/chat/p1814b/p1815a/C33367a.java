package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a;

import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.io.Serializable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.a.a */
public final class C33367a implements C33368b, Serializable {

    /* renamed from: a */
    private IMUser f86530a;

    /* renamed from: b */
    private String f86531b;

    /* renamed from: c */
    private String f86532c;

    /* renamed from: d */
    private C11206o f86533d;

    public final String getAliasInitial() {
        return this.f86532c;
    }

    public final String getAliasPinyin() {
        return this.f86531b;
    }

    public final C11206o getMember() {
        return this.f86533d;
    }

    public final IMUser getUser() {
        return this.f86530a;
    }

    public final String getMemberDisplayName() {
        CharSequence charSequence;
        boolean z;
        CharSequence charSequence2;
        IMUser iMUser = this.f86530a;
        if (iMUser != null) {
            charSequence = iMUser.getRemarkName();
        } else {
            charSequence = null;
        }
        CharSequence charSequence3 = charSequence;
        boolean z2 = false;
        if (charSequence3 == null || charSequence3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IMUser iMUser2 = this.f86530a;
            if (iMUser2 != null) {
                return iMUser2.getRemarkName();
            }
            return null;
        }
        C11206o oVar = this.f86533d;
        if (oVar != null) {
            charSequence2 = oVar.getAlias();
        } else {
            charSequence2 = null;
        }
        CharSequence charSequence4 = charSequence2;
        if (charSequence4 == null || charSequence4.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            C11206o oVar2 = this.f86533d;
            if (oVar2 != null) {
                return oVar2.getAlias();
            }
            return null;
        }
        IMUser iMUser3 = this.f86530a;
        if (iMUser3 != null) {
            return iMUser3.getNickName();
        }
        return null;
    }

    public final void setAliasInitial(String str) {
        this.f86532c = str;
    }

    public final void setAliasPinyin(String str) {
        this.f86531b = str;
    }

    public final void setUser(IMUser iMUser) {
        this.f86530a = iMUser;
    }

    public final void setMember(C11206o oVar) {
        String str;
        this.f86533d = oVar;
        String str2 = null;
        if (oVar != null) {
            str = oVar.getAlias();
        } else {
            str = null;
        }
        String c = C34839a.m78908c(str);
        C52711k.m112236a((Object) c, "CharacterUtil.hanziToPinyin(member?.alias)");
        if (c != null) {
            String lowerCase = c.toLowerCase();
            C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            this.f86531b = lowerCase;
            if (oVar != null) {
                str2 = oVar.getAlias();
            }
            String b = C34839a.m78906b(str2);
            C52711k.m112236a((Object) b, "CharacterUtil.hanziToPinyinInitial(member?.alias)");
            if (b != null) {
                String lowerCase2 = b.toLowerCase();
                C52711k.m112236a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                this.f86532c = lowerCase2;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }
}
