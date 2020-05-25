package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f */
public final class C43804f {

    /* renamed from: a */
    public String f110924a;

    /* renamed from: b */
    public String f110925b;

    /* renamed from: c */
    public boolean f110926c;

    /* renamed from: d */
    public Music f110927d = null;

    /* renamed from: e */
    public C42482c f110928e;

    /* renamed from: f */
    public boolean f110929f;

    /* renamed from: g */
    public String f110930g;

    /* renamed from: h */
    public boolean f110931h;

    /* renamed from: i */
    public List<String> f110932i;

    /* renamed from: j */
    public boolean f110933j;

    /* renamed from: k */
    public List<TaskMentionedUser> f110934k;

    /* renamed from: l */
    public boolean f110935l;

    /* renamed from: m */
    public String f110936m;

    /* renamed from: n */
    public boolean f110937n;

    /* renamed from: a */
    private static boolean m96243a(List<Integer> list, int i) {
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = (Integer) list.get(i2);
                if (num != null && num.intValue() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public C43804f(String str, String str2, Music music, C42482c cVar, String str3, List<String> list, List<TaskMentionedUser> list2, List<Integer> list3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f110924a = str;
        this.f110925b = str2;
        this.f110928e = cVar;
        this.f110930g = str3;
        this.f110932i = list;
        this.f110934k = list2;
        boolean isEmpty = TextUtils.isEmpty(str2);
        boolean z5 = false;
        if (isEmpty || m96243a(list3, 4)) {
            z = true;
        } else {
            z = false;
        }
        this.f110926c = z;
        if (cVar == null || m96243a(list3, 3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f110929f = z2;
        if (TextUtils.isEmpty(str3) || m96243a(list3, 5)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f110931h = z3;
        if (C9376b.m18558a((Collection<T>) list) || m96243a(list3, 2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f110933j = z4;
        if (C9376b.m18558a((Collection<T>) list2) || m96243a(list3, 7)) {
            z5 = true;
        }
        this.f110935l = z5;
        this.f110937n = true;
    }
}
