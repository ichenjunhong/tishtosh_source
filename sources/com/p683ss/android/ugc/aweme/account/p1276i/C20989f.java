package com.p683ss.android.ugc.aweme.account.p1276i;

import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12318c;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;

/* renamed from: com.ss.android.ugc.aweme.account.i.f */
public final class C20989f {

    /* renamed from: a */
    public static final C20989f f57098a = new C20989f();

    private C20989f() {
    }

    /* renamed from: a */
    public static final String m53349a(AuthResult authResult) {
        if (authResult != null) {
            return authResult.f32462j.getString("code");
        }
        return "";
    }

    /* renamed from: b */
    public static final String m53352b(AuthResult authResult) {
        if (authResult != null) {
            return authResult.f32462j.getString("profile_key");
        }
        return "";
    }

    /* renamed from: d */
    public static final String m53355d(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        return m53353b(authResult.f32456d);
    }

    /* renamed from: a */
    public static final String m53350a(C12318c cVar) {
        if (cVar == null) {
            return "";
        }
        return m53353b(cVar.f32473b);
    }

    /* renamed from: a */
    public static final String m53351a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1240244679:
                    if (str.equals("google")) {
                        return "google";
                    }
                    break;
                case -916346253:
                    if (str.equals("twitter")) {
                        return "twitter";
                    }
                    break;
                case 3765:
                    if (str.equals("vk")) {
                        return "vk";
                    }
                    break;
                case 3321844:
                    if (str.equals("line")) {
                        return "line";
                    }
                    break;
                case 28903346:
                    if (str.equals("instagram")) {
                        return "instagram";
                    }
                    break;
                case 486515695:
                    if (str.equals("kakaotalk")) {
                        return "kakaotalk";
                    }
                    break;
                case 497130182:
                    if (str.equals("facebook")) {
                        return "facebook";
                    }
                    break;
            }
        }
        return "";
    }

    /* renamed from: b */
    private static String m53353b(String str) {
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case -1240244679:
                if (str.equals("google")) {
                    return "google";
                }
                break;
            case -916346253:
                if (str.equals("twitter")) {
                    return "twitter";
                }
                break;
            case 3765:
                if (str.equals("vk")) {
                    return "vk";
                }
                break;
            case 3321844:
                if (str.equals("line")) {
                    return "line";
                }
                break;
            case 28903346:
                if (str.equals("instagram")) {
                    return "instagram";
                }
                break;
            case 486515695:
                if (str.equals("kakaotalk")) {
                    return "kakaotalk";
                }
                break;
            case 497130182:
                if (str.equals("facebook")) {
                    return "facebook";
                }
                break;
        }
        return "";
    }

    /* renamed from: c */
    public static final String m53354c(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        String str = authResult.f32456d;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1240244679) {
                if (hashCode != -916346253) {
                    if (hashCode != 3765) {
                        if (hashCode != 28903346) {
                            if (hashCode == 497130182 && str.equals("facebook")) {
                                if (C22298e.m55182a()) {
                                    return "310";
                                }
                                return "";
                            }
                        } else if (str.equals("instagram")) {
                            if (C22298e.m55182a()) {
                                return "312";
                            }
                            return "204";
                        }
                    } else if (str.equals("vk")) {
                        if (C22298e.m55182a()) {
                            return "334";
                        }
                        return "";
                    }
                } else if (str.equals("twitter")) {
                    if (C22298e.m55182a()) {
                        return "313";
                    }
                    return "504";
                }
            } else if (str.equals("google")) {
                if (C22298e.m55182a()) {
                    return "311";
                }
                return "";
            }
        }
        return "";
    }
}
