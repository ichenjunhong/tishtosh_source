package com.p683ss.android.ugc.aweme.services;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p683ss.android.ugc.aweme.services.function.IFunctionSupportService;

/* renamed from: com.ss.android.ugc.aweme.services.FunctionSupportServiceImpl */
public class FunctionSupportServiceImpl implements IFunctionSupportService {
    public boolean notSupport(IFunctionKey iFunctionKey) {
        return false;
    }

    public static IFunctionSupportService createIFunctionSupportServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IFunctionSupportService.class);
        if (a != null) {
            return (IFunctionSupportService) a;
        }
        if (C27991b.f73453aJ == null) {
            synchronized (IFunctionSupportService.class) {
                if (C27991b.f73453aJ == null) {
                    C27991b.f73453aJ = new FunctionSupportServiceImpl();
                }
            }
        }
        return (FunctionSupportServiceImpl) C27991b.f73453aJ;
    }
}
