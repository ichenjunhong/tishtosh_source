package com.p683ss.android.ugc.aweme.setting;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41565b;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41577i;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41578j;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Field;
import java.util.TreeMap;

/* renamed from: com.ss.android.ugc.aweme.setting.ax */
public final class C41559ax {
    /* renamed from: a */
    public static String m91395a() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        AbTestModel d = C41589c.m91432a().mo85306m();
        Field[] declaredFields = d.getClass().getDeclaredFields();
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        int i = 0;
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (((C41565b) field.getAnnotation(C41565b.class)) != null && field.getType().equals(Boolean.TYPE)) {
                treeMap2.put(field.getName(), field);
            } else if (((C41578j) field.getAnnotation(C41578j.class)) != null && field.getType().equals(Integer.TYPE)) {
                treeMap.put(new C41577i(field, d).mo85356b(), field);
            }
        }
        for (Field field2 : treeMap2.values()) {
            try {
                field2.setAccessible(true);
                boolean booleanValue = ((Boolean) field2.get(d)).booleanValue();
                C41565b bVar = (C41565b) field2.getAnnotation(C41565b.class);
                if (!TextUtils.isEmpty(bVar.mo85351b()) || !TextUtils.isEmpty(bVar.mo85350a())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i);
                    sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb2.append(field2.getName());
                    sb2.append("        ");
                    sb2.append(booleanValue);
                    sb2.append("(");
                    if (booleanValue) {
                        str3 = bVar.mo85350a();
                    } else {
                        str3 = bVar.mo85351b();
                    }
                    sb2.append(str3);
                    sb2.append(")\r\n");
                    sb.append(sb2.toString());
                    i++;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb3.append(field2.getName());
                    sb3.append("        ");
                    sb3.append(booleanValue);
                    sb3.append("\r\n");
                    sb.append(sb3.toString());
                    i++;
                }
            } catch (IllegalAccessException unused) {
            }
        }
        for (Field field3 : treeMap.values()) {
            C41577i iVar = new C41577i(field3, d);
            try {
                String a = iVar.mo85355a();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(((Integer) field3.get(d)).intValue());
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(i);
                sb6.append(ClassUtils.PACKAGE_SEPARATOR);
                sb6.append(field3.getName());
                if (field3.getName().equals(iVar.mo85356b())) {
                    str = "";
                } else {
                    StringBuilder sb7 = new StringBuilder("(");
                    sb7.append(iVar.mo85356b());
                    sb7.append(")");
                    str = sb7.toString();
                }
                sb6.append(str);
                sb6.append("        ");
                sb6.append(sb5);
                if (sb5.equals(a)) {
                    str2 = "";
                } else {
                    StringBuilder sb8 = new StringBuilder("(");
                    sb8.append(a);
                    sb8.append(")");
                    str2 = sb8.toString();
                }
                sb6.append(str2);
                sb6.append("\r\n");
                sb.append(sb6.toString());
                i++;
            } catch (IllegalAccessException unused2) {
            }
        }
        return sb.toString();
    }
}
