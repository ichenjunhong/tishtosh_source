package com.google.gson;

import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: com.google.gson.d */
public enum C17963d implements C17970e {
    IDENTITY {
        /* renamed from: a */
        public final String mo34872a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public final String mo34872a(Field field) {
            return m44067a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public final String mo34872a(Field field) {
            return m44067a(m44068a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public final String mo34872a(Field field) {
            return m44068a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public final String mo34872a(Field field) {
            return m44068a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: a */
        public final String mo34872a(Field field) {
            return m44068a(field.getName(), ClassUtils.PACKAGE_SEPARATOR).toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    static String m44067a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i2 = i + 1;
        if (i2 < str.length()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(upperCase);
            sb2.append(str.substring(i2));
            str2 = sb2.toString();
        } else {
            str2 = String.valueOf(upperCase);
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    static String m44068a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
