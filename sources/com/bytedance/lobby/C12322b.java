package com.bytedance.lobby;

import android.text.TextUtils;

/* renamed from: com.bytedance.lobby.b */
public final class C12322b extends Exception {

    /* renamed from: a */
    private int f32480a;

    /* renamed from: b */
    private String f32481b;

    /* renamed from: c */
    private int f32482c;

    /* renamed from: d */
    private boolean f32483d;

    /* renamed from: e */
    private boolean f32484e;

    public final int getErrorCode() {
        return this.f32480a;
    }

    public final int getProviderErrorCode() {
        return this.f32482c;
    }

    public final boolean isCancelled() {
        return this.f32484e;
    }

    public final boolean isFromLobby() {
        return this.f32483d;
    }

    public final String getMessage() {
        if (getCause() != null) {
            return super.getMessage();
        }
        return this.f32481b;
    }

    public final String toString() {
        if (getCause() != null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("LobbyException{");
        sb.append("code: ");
        sb.append(getErrorCode());
        sb.append(", providerCode: ");
        sb.append(getProviderErrorCode());
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", cancelled: ");
        sb.append(isCancelled());
        sb.append(", fromLobby: ");
        sb.append(isFromLobby());
        sb.append("}");
        return sb.toString();
    }

    public final C12322b setCancelled(boolean z) {
        this.f32484e = z;
        return this;
    }

    public C12322b(Exception exc) {
        super(exc);
        this.f32480a = -999;
    }

    public C12322b(int i, String str) {
        this(i, 0, str);
    }

    public C12322b(int i, int i2, String str) {
        this.f32480a = -999;
        this.f32480a = i;
        this.f32482c = i2;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f32481b = str;
        this.f32483d = true;
        if (i == 4) {
            setCancelled(true);
        }
    }
}
