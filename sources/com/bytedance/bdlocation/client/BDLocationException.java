package com.bytedance.bdlocation.client;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BDLocationException extends Exception {
    private final List<Throwable> causes;
    private final String code;
    private final String detailMessage;
    private final Map<String, String> extra;
    private final int isAssembleError;
    private final String sdkName;

    public List<Throwable> getCauses() {
        return this.causes;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public String getCode() {
        if (this.isAssembleError == 0) {
            return this.code;
        }
        String str = "";
        Iterator it = getRootCauses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Throwable th = (Throwable) it.next();
            if (th instanceof BDLocationException) {
                str = ((BDLocationException) th).getCode();
                break;
            }
        }
        return str;
    }

    public Map<String, String> getExtra() {
        if (this.isAssembleError == 0) {
            return this.extra;
        }
        Map<String, String> hashMap = new HashMap<>(0);
        Iterator it = getRootCauses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Throwable th = (Throwable) it.next();
            if (th instanceof BDLocationException) {
                hashMap = ((BDLocationException) th).getExtra();
                break;
            }
        }
        return hashMap;
    }

    public String getSdkName() {
        if (this.isAssembleError == 0) {
            return this.sdkName;
        }
        String str = "";
        Iterator it = getRootCauses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Throwable th = (Throwable) it.next();
            if (th instanceof BDLocationException) {
                str = ((BDLocationException) th).getSdkName();
                break;
            }
        }
        return str;
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuffer stringBuffer = new StringBuffer(71);
        if (TextUtils.isEmpty(this.detailMessage)) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("错误信息: ");
            sb.append(this.detailMessage);
            sb.append(10);
            str = sb.toString();
        }
        stringBuffer.append(str);
        if (TextUtils.isEmpty(this.code)) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder("错误码: ");
            sb2.append(this.code);
            sb2.append(10);
            str2 = sb2.toString();
        }
        stringBuffer.append(str2);
        if (TextUtils.isEmpty(this.sdkName)) {
            str3 = "";
        } else {
            StringBuilder sb3 = new StringBuilder("SdkName: ");
            sb3.append(this.sdkName);
            sb3.append(10);
            str3 = sb3.toString();
        }
        stringBuffer.append(str3);
        if (getExtra().size() == 0) {
            str4 = "";
        } else {
            StringBuilder sb4 = new StringBuilder("错误描述: ");
            sb4.append(getExtra());
            sb4.append(10);
            str4 = sb4.toString();
        }
        stringBuffer.append(str4);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return stringBuffer.toString();
        }
        if (rootCauses.size() == 1) {
            stringBuffer.append("There was 1 cause:\n");
        } else {
            stringBuffer.append("There were ");
            stringBuffer.append(rootCauses.size());
            stringBuffer.append(" causes:\n");
        }
        for (Throwable th : rootCauses) {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append("\n(");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(")\n");
        }
        return stringBuffer.toString();
    }

    public BDLocationException(List<Throwable> list) {
        this("定位失败", "", "", new HashMap(), list, 1);
    }

    public BDLocationException addExtra(String str, String str2) {
        this.extra.put(str, str2);
        return this;
    }

    private void addRootCauses(Throwable th, List<Throwable> list) {
        if (th instanceof BDLocationException) {
            for (Throwable th2 : ((BDLocationException) th).getCauses()) {
                addRootCauses(th2, list);
                if ((th2 instanceof BDLocationException) && ((BDLocationException) th2).isAssembleError == 0) {
                    list.add(th2);
                }
            }
            return;
        }
        list.add(th);
    }

    public BDLocationException(String str, String str2, String str3) {
        this(str, str2, str3, new HashMap(), Collections.emptyList(), 0);
    }

    public BDLocationException(Throwable th, String str, String str2) {
        this("", str, str2, new HashMap(), Collections.singletonList(th), 0);
    }

    public BDLocationException(String str, String str2, String str3, Map<String, String> map, List<Throwable> list, int i) {
        this.detailMessage = str;
        this.sdkName = str2;
        this.code = str3;
        this.extra = map;
        this.causes = list;
        this.isAssembleError = i;
    }
}
