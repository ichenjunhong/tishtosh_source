package com.p683ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fd */
public final class C43809fd extends RuntimeException {

    /* renamed from: a */
    SynthetiseResult f110947a;

    public final SynthetiseResult getResult() {
        return this.f110947a;
    }

    public final int getCode() {
        return this.f110947a.ret;
    }

    public static int resolveErrorCode(Throwable th) {
        if (th instanceof C43809fd) {
            return ((C43809fd) th).getCode();
        }
        return 10038;
    }

    public static boolean isCancel(Throwable th) {
        int resolveErrorCode = resolveErrorCode(th);
        if (resolveErrorCode == -66666 || resolveErrorCode == -6666601) {
            return true;
        }
        return false;
    }

    public C43809fd(String str, SynthetiseResult synthetiseResult) {
        super(str);
        this.f110947a = synthetiseResult;
    }

    public C43809fd(Throwable th, SynthetiseResult synthetiseResult) {
        super(th);
        this.f110947a = synthetiseResult;
    }
}
