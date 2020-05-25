package com.snapchat.kit.sdk.core.models;

import com.google.gson.C17971f;
import com.google.gson.p1076a.C17950a;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.Objects;

public class AuthToken implements Serializable {
    @C17952c(mo34828a = "access_token")
    @C17950a
    private String mAccessToken;
    @C17952c(mo34828a = "expires_in")
    @C17950a
    private long mExpiresIn;
    @C17952c(mo34828a = "last_updated")
    @C17950a
    private long mLastUpdated;
    @C17952c(mo34828a = "refresh_token")
    @C17950a
    private String mRefreshToken;
    @C17952c(mo34828a = "scope")
    @C17950a
    private String mScope;
    @C17952c(mo34828a = "token_type")
    @C17950a
    private String mTokenType;

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public long getExpiresIn() {
        return this.mExpiresIn;
    }

    public long getLastUpdated() {
        return this.mLastUpdated;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getScope() {
        return this.mScope;
    }

    public String getTokenType() {
        return this.mTokenType;
    }

    public long getExpiresInMillis() {
        return this.mExpiresIn * 1000;
    }

    public String toString() {
        return toJson();
    }

    public String toJson() {
        return new C17971f().mo34889b(this);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mAccessToken, this.mTokenType, this.mRefreshToken, Long.valueOf(this.mExpiresIn), Long.valueOf(this.mLastUpdated)});
    }

    public void setLastUpdated(long j) {
        this.mLastUpdated = j;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) obj;
        if (!Objects.equals(this.mAccessToken, authToken.mAccessToken) || !Objects.equals(this.mTokenType, authToken.mTokenType) || !Objects.equals(this.mRefreshToken, authToken.mRefreshToken) || !Objects.equals(Long.valueOf(this.mExpiresIn), Long.valueOf(authToken.mExpiresIn)) || !Objects.equals(Long.valueOf(this.mLastUpdated), Long.valueOf(authToken.mLastUpdated))) {
            return false;
        }
        return true;
    }

    public AuthToken(String str, String str2) {
        this.mAccessToken = str;
        this.mScope = str2;
    }
}
