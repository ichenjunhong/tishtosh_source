package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

import android.content.Context;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.b */
public final class C41030b {
    /* renamed from: a */
    public static int m90689a(C40952c cVar) {
        int i = cVar.type;
        if (i == 1) {
            return R.drawable.pm;
        }
        if (i == 7) {
            return R.drawable.pl;
        }
        if (i != 17) {
            return R.drawable.pk;
        }
        return R.drawable.pn;
    }

    /* renamed from: a */
    public static String m90690a(Context context, C40952c cVar) {
        int i = cVar.type;
        if (!(i == 11 || i == 17 || i == 23)) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                default:
                    switch (i) {
                        case 7:
                        case 8:
                        case 9:
                            break;
                        default:
                            return "";
                    }
            }
        }
        return cVar.title;
    }

    /* renamed from: b */
    public static String m90691b(Context context, C40952c cVar) {
        int i = cVar.type;
        if (i == 11) {
            return "";
        }
        if (i != 17) {
            if (i != 23) {
                switch (i) {
                    case 1:
                        return context.getString(R.string.ffc, new Object[]{cVar.describe});
                    case 2:
                        break;
                    case 3:
                        return context.getString(R.string.cev, new Object[]{cVar.describe});
                    case 4:
                        return cVar.describe;
                    case 5:
                        return "";
                    default:
                        switch (i) {
                            case 7:
                                return cVar.describe;
                            case 8:
                                return "";
                            case 9:
                                return "";
                            default:
                                return "";
                        }
                }
            }
            return context.getString(R.string.bu1, new Object[]{cVar.describe});
        }
        return context.getString(R.string.cev, new Object[]{cVar.describe});
    }

    /* renamed from: c */
    public static String m90692c(Context context, C40952c cVar) {
        int i = cVar.type;
        if (i == 11) {
            return "";
        }
        if (i == 17) {
            return context.getString(R.string.d2v);
        }
        if (i != 23) {
            switch (i) {
                case 1:
                    return context.getString(R.string.d34);
                case 2:
                    break;
                case 3:
                    return context.getString(R.string.d2o);
                case 4:
                    if (!cVar.isEnterpriseUser) {
                        return context.getString(R.string.d30);
                    }
                    return context.getString(R.string.d2i, new Object[]{cVar.title});
                case 5:
                    return "";
                default:
                    switch (i) {
                        case 7:
                            return context.getString(R.string.d2s);
                        case 8:
                            return "";
                        case 9:
                            return "";
                        default:
                            return "";
                    }
            }
        }
        return context.getString(R.string.d2e);
    }
}
