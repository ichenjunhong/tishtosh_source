package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b;

import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.e */
public final class C34848e {

    /* renamed from: a */
    public static final C34848e f89771a = new C34848e();

    private C34848e() {
    }

    /* renamed from: a */
    public static C52847n<List<String>, List<Integer>> m78926a(List<? extends IMUser> list) {
        int i;
        C52711k.m112240b(list, "users");
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        int size = list.size();
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            String initialLetter = ((IMUser) list.get(i3)).getInitialLetter();
            CharSequence charSequence = initialLetter;
            if (!TextUtils.isEmpty(charSequence)) {
                if (obj == null || TextUtils.equals(charSequence, (CharSequence) obj)) {
                    i = i2 + 1;
                } else {
                    arrayList.add(obj);
                    arrayList2.add(Integer.valueOf(i2));
                    i = 1;
                }
                if (i3 == list.size() - 1) {
                    C52711k.m112236a((Object) initialLetter, "lastLetter");
                    arrayList.add(initialLetter);
                    arrayList2.add(Integer.valueOf(i));
                }
                i2 = i;
                obj = initialLetter;
            }
        }
        return C52856t.m112465a(arrayList, arrayList2);
    }

    /* renamed from: a */
    public final void mo72966a(TextView textView, IMUser iMUser, String str) {
        boolean z;
        C52711k.m112240b(textView, "textView");
        C52711k.m112240b(iMUser, "user");
        C52711k.m112240b(str, "keyword");
        CharSequence charSequence = str;
        boolean z2 = true;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            textView.setText(iMUser.getDisplayName());
            return;
        }
        if (C35279p.m79763a()) {
            CharSequence nickName = iMUser.getNickName();
            if (!(nickName == null || nickName.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                String nickName2 = iMUser.getNickName();
                C52711k.m112236a((Object) nickName2, "user.nickName");
                if (!C52830p.m112456b((CharSequence) nickName2, charSequence, false, 2, (Object) null)) {
                    str = str.toLowerCase();
                    C52711k.m112236a((Object) str, "(this as java.lang.String).toLowerCase()");
                    String nickName3 = iMUser.getNickName();
                    C52711k.m112236a((Object) nickName3, "user.nickName");
                    if (nickName3 != null) {
                        String lowerCase = nickName3.toLowerCase();
                        C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        int a = C52830p.m112419a((CharSequence) lowerCase, str, 0, false, 6, (Object) null);
                        if (a != -1) {
                            int min = Math.min(str.length() + a, iMUser.getNickName().length());
                            String nickName4 = iMUser.getNickName();
                            C52711k.m112236a((Object) nickName4, "user.nickName");
                            if (nickName4 != null) {
                                str = nickName4.substring(a, min);
                                C52711k.m112236a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            } else {
                                throw new C52857u("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        } else if (iMUser.getSearchType() == 5) {
            str = C34839a.m78903a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str);
            C52711k.m112236a((Object) str, "CharacterUtil.convertPin…nitial, highLightKeyword)");
        } else if (iMUser.getSearchType() == 3) {
            str = C34839a.m78903a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
            C52711k.m112236a((Object) str, "CharacterUtil.convertPin…nitial, highLightKeyword)");
        }
        String displayName = iMUser.getDisplayName();
        C52711k.m112236a((Object) displayName, "user.displayName");
        m78928a(textView, displayName, str, 0);
    }

    /* renamed from: a */
    public static void m78928a(TextView textView, String str, String str2, int i) {
        C52711k.m112240b(textView, "textView");
        C52711k.m112240b(str, "src");
        C52711k.m112240b(str2, "keyword");
        textView.setText(C34847d.m78925a(C0726c.m2098c(textView.getContext(), R.color.rd), str, str2, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m78927a(TextView textView, IMUser iMUser, String str, boolean z) {
        boolean z2;
        boolean z3;
        C52711k.m112240b(textView, "textView");
        C52711k.m112240b(iMUser, "user");
        C52711k.m112240b(str, "keyword");
        boolean z4 = true;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                CharSequence signature = iMUser.getSignature();
                if (!(signature == null || signature.length() == 0)) {
                    z4 = false;
                }
                if (!z4) {
                    textView.setText(iMUser.getSignature());
                    textView.setVisibility(0);
                    return;
                }
            }
            textView.setVisibility(8);
        } else if (iMUser.getSearchType() == 5) {
            if (z) {
                CharSequence signature2 = iMUser.getSignature();
                if (!(signature2 == null || signature2.length() == 0)) {
                    z4 = false;
                }
                if (!z4) {
                    textView.setText(iMUser.getSignature());
                    textView.setVisibility(0);
                    return;
                }
            }
            textView.setVisibility(8);
        } else if (iMUser.getSearchType() == 3) {
            CharSequence remarkName = iMUser.getRemarkName();
            if (remarkName == null || remarkName.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (z) {
                    CharSequence signature3 = iMUser.getSignature();
                    if (!(signature3 == null || signature3.length() == 0)) {
                        z4 = false;
                    }
                    if (!z4) {
                        textView.setText(iMUser.getSignature());
                        textView.setVisibility(0);
                        return;
                    }
                }
                textView.setVisibility(8);
                return;
            }
            String string = C11010c.m22280a().getResources().getString(R.string.blf, new Object[]{iMUser.getNickName()});
            String a = C34839a.m78903a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
            C52711k.m112236a((Object) a, "CharacterUtil.convertPin…nitial, highLightKeyword)");
            C52711k.m112236a((Object) string, "str");
            m78928a(textView, string, a, 3);
            textView.setVisibility(0);
        } else if (iMUser.getSearchType() == 1) {
            String displayId = iMUser.getDisplayId();
            String c = C34839a.m78908c(displayId);
            C52711k.m112236a((Object) c, "CharacterUtil.hanziToPinyin(id)");
            if (c != null) {
                String lowerCase = c.toLowerCase();
                C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                String a2 = C34839a.m78903a(displayId, lowerCase, C34839a.m78906b(displayId), str);
                C52711k.m112236a((Object) a2, "CharacterUtil.convertPin…al(id), highLightKeyword)");
                StringBuilder sb = new StringBuilder();
                sb.append(C11010c.m22280a().getResources().getString(R.string.bdn));
                sb.append(displayId);
                m78928a(textView, sb.toString(), a2, 4);
                textView.setVisibility(0);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        } else if (iMUser.getSearchType() == 2) {
            String string2 = C11010c.m22280a().getResources().getString(R.string.bg5, new Object[]{iMUser.getContactName()});
            String a3 = C34839a.m78903a(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str);
            C52711k.m112236a((Object) a3, "CharacterUtil.convertPin…tactNameInitial, keyword)");
            C52711k.m112236a((Object) string2, "str");
            m78928a(textView, string2, a3, 6);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }
}
