package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.k */
public final class C31340k extends C31338j {
    /* renamed from: a */
    public final String mo64209a() {
        return "abnor_read_record";
    }

    /* renamed from: c */
    public final String mo64212c() {
        String str;
        boolean z;
        String str2;
        Iterable<AwemeToolFeedbackInfo> d = mo64223d();
        Collection arrayList = new ArrayList(C52575l.m112104a(d, 10));
        for (AwemeToolFeedbackInfo awemeToolFeedbackInfo : d) {
            if (awemeToolFeedbackInfo.getECode().isEmpty()) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder("(");
                Iterable<AwemeToolFeedbackECode> eCode = awemeToolFeedbackInfo.getECode();
                Collection arrayList2 = new ArrayList(C52575l.m112104a(eCode, 10));
                for (AwemeToolFeedbackECode awemeToolFeedbackECode : eCode) {
                    CharSequence stage = awemeToolFeedbackECode.getStage();
                    if (stage == null || stage.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str2 = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(awemeToolFeedbackECode.getStage());
                        sb2.append(':');
                        str2 = sb2.toString();
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(awemeToolFeedbackECode.getCode());
                    arrayList2.add(sb3.toString());
                }
                Iterator it = ((List) arrayList2).iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        String str4 = (String) next;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str4);
                        sb4.append(';');
                        sb4.append(str3);
                        next = sb4.toString();
                    }
                    sb.append((String) next);
                    sb.append(')');
                    str = sb.toString();
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
            StringBuilder sb5 = new StringBuilder("[");
            sb5.append(awemeToolFeedbackInfo.getName());
            sb5.append(':');
            sb5.append(awemeToolFeedbackInfo.getCount());
            sb5.append(' ');
            sb5.append(awemeToolFeedbackInfo.getSuccessCount());
            sb5.append("成功|");
            sb5.append(awemeToolFeedbackInfo.getCancelCount());
            sb5.append("取消|");
            sb5.append(awemeToolFeedbackInfo.getECode().size());
            sb5.append("失败");
            sb5.append(str);
            sb5.append(']');
            arrayList.add(sb5.toString());
        }
        Iterator it2 = ((List) arrayList).iterator();
        if (it2.hasNext()) {
            Object next2 = it2.next();
            while (it2.hasNext()) {
                String str5 = (String) it2.next();
                String str6 = (String) next2;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str6);
                sb6.append(str5);
                next2 = sb6.toString();
            }
            return (String) next2;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
