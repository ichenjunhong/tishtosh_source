package com.p683ss.android.ugc.aweme;

import android.app.Application;
import android.os.Handler;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.ugc.aweme.IAccountService.C20834a;
import com.p683ss.android.ugc.aweme.IAccountService.C20835b;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.AgeGateService;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseBindService;
import com.p683ss.android.ugc.aweme.services.BaseLoginService;
import com.p683ss.android.ugc.aweme.services.BindService;
import com.p683ss.android.ugc.aweme.services.LoginService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.bi */
public class C23826bi {

    /* renamed from: a */
    static List<C20834a> f63473a = new CopyOnWriteArrayList();

    /* renamed from: b */
    static C27980q f63474b;

    /* renamed from: c */
    private static LoginService f63475c;

    /* renamed from: d */
    private static BindService f63476d;

    /* renamed from: b */
    public static Application m58460b() {
        return C20842a.f56783a;
    }

    /* renamed from: e */
    public static C20835b m58464e() {
        return C20842a.f56785c;
    }

    /* renamed from: a */
    public static void m58459a(boolean z, User user) {
        for (C20834a a : f63473a) {
            a.mo44376a(2, z, 0, user);
        }
    }

    /* renamed from: a */
    public static void m58458a(boolean z) {
        for (C20834a a : f63473a) {
            a.mo44376a(3, z, 0, null);
        }
    }

    /* renamed from: a */
    public static IAccountUserService m58449a() {
        return f63474b.userService();
    }

    /* renamed from: h */
    public static void m58467h() {
        m58449a().accountUserClear();
    }

    /* renamed from: j */
    public static void m58469j() {
        m58449a().queryUser();
    }

    /* renamed from: d */
    public static String m58463d() {
        return m58449a().getCurUserId();
    }

    /* renamed from: f */
    public static AgeGateService m58465f() {
        return (AgeGateService) f63474b.ageGateService();
    }

    /* renamed from: g */
    public static boolean m58466g() {
        return f63474b.userService().isLogin();
    }

    /* renamed from: i */
    public static User m58468i() {
        return m58449a().getCurUser();
    }

    /* renamed from: c */
    public static boolean m58462c() {
        if (m58470k().getLoginParam() == null || !m58470k().getLoginParam().f56775g) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static BaseLoginService m58470k() {
        if (f63475c == null) {
            f63475c = (LoginService) f63474b.loginService();
        }
        return f63475c;
    }

    /* renamed from: l */
    public static BaseBindService m58471l() {
        if (f63476d == null) {
            f63476d = (BindService) f63474b.bindService();
        }
        return f63476d;
    }

    /* renamed from: m */
    public static void m58472m() {
        for (C20834a a : f63473a) {
            a.mo44376a(4, true, 0, null);
        }
    }

    /* renamed from: a */
    public static <T> T m58450a(Class<T> cls) {
        return C20842a.m53148a(cls);
    }

    /* renamed from: b */
    public static void m58461b(User user) {
        for (C20834a a : f63473a) {
            a.mo44376a(1, true, 0, user);
        }
    }

    /* renamed from: a */
    public static void m58455a(C13207b bVar) {
        f63474b.userService().updateUserInfo(bVar);
    }

    /* renamed from: a */
    public static void m58456a(C20834a aVar) {
        synchronized (C23826bi.class) {
            if (!f63473a.contains(aVar)) {
                f63473a.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m58457a(User user) {
        m58449a().updateCurUser(user);
    }

    /* renamed from: a */
    public static void m58454a(Handler handler, boolean z) {
        m58449a().updateSecret(handler, false, 0);
    }

    /* renamed from: a */
    public static void m58451a(int i, int i2, Object obj) {
        f63474b.returnResult(i, i2, obj);
    }

    /* renamed from: a */
    public static void m58452a(int i, int i2, String str) {
        f63474b.notifyProgress(i, i2, str);
    }

    /* renamed from: a */
    public static void m58453a(int i, String str, String str2, int i2, C20840g gVar) {
        f63474b.proAccountService().switchProAccount(i, str, str2, 0, gVar);
    }
}
