package com.tencent.wcdb;

import com.tencent.wcdb.database.C51772m;
import com.tencent.wcdb.database.SQLiteDatabase;

/* renamed from: com.tencent.wcdb.i */
public final class C51779i {

    /* renamed from: a */
    private static final char[] f129173a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static int m111058a(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m111060a(String str) {
        StringBuilder sb = new StringBuilder();
        m111061a(sb, str);
        return sb.toString();
    }

    /* renamed from: b */
    public static int m111062b(String str) {
        String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= 3) {
                i = i3;
                break;
            }
            int charAt = trim.charAt(i2);
            if (charAt >= 97 && charAt <= 122) {
                charAt = (charAt - 97) + 65;
            } else if (charAt >= 128) {
                break;
            }
            i3 |= (charAt & 127) << (i2 * 8);
            i2++;
        }
        switch (i) {
            case 4279873:
            case 5522756:
                return 9;
            case 4280912:
                return 7;
            case 4476485:
            case 5066563:
                return 5;
            case 4477013:
            case 4998468:
            case 5260626:
            case 5459529:
                return 2;
            case 4543043:
            case 5198404:
            case 5524545:
                return 8;
            case 4670786:
                return 4;
            case 4998483:
                return 1;
            case 5001042:
                return 6;
            case 5526593:
                return 3;
            default:
                return 99;
        }
    }

    /* renamed from: a */
    public static int m111057a(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    /* renamed from: a */
    private static void m111061a(StringBuilder sb, String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }

    /* renamed from: b */
    public static String m111063b(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        C51772m a = sQLiteDatabase.mo107180a(str);
        try {
            a.mo107226a((String[]) null);
            return a.mo107246c(null);
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    public static long m111059a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        C51772m a = sQLiteDatabase.mo107180a(str);
        try {
            a.mo107226a((String[]) null);
            return a.mo107245b(null);
        } finally {
            a.close();
        }
    }
}
