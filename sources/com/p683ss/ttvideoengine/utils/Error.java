package com.p683ss.ttvideoengine.utils;

import com.C2240a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.utils.Error */
public class Error {
    public int code;
    public String description;
    public String domain;
    public int internalCode;

    private boolean needRestartPlayer() {
        if (this.code == -499999 || this.code == -499997 || this.code == -499996 || this.code == -499992 || this.code == -499991 || this.code == -499990 || this.code == -499989 || this.code == -2139062143) {
            return true;
        }
        return false;
    }

    public int getRetryStrategy() {
        if (this.domain.equals("kTTVideoErrorDomainHTTPDNS") || this.domain.equals("kTTVideoErrorDomainLocalDNS")) {
            return 2;
        }
        if (this.domain.equals("kTTVideoErrorDomainFetchingInfo")) {
            return 1;
        }
        if (!this.domain.equals("kTTVideoErrorDomainVideoOwnPlayer") || needChangeURL() || !needRestartPlayer()) {
            return 2;
        }
        return 3;
    }

    public int getType() {
        if (this.domain.equals("kTTVideoErrorDomainFetchingInfo")) {
            return 1000;
        }
        if (this.domain.equals("kTTVideoErrorDomainLocalDNS") || this.domain.equals("kTTVideoErrorDomainHTTPDNS")) {
            return 1001;
        }
        if (!this.domain.equals("kTTVideoErrorDomainVideoOwnPlayer") || !needRestartPlayer()) {
            return BaseNotice.COMMENT_REPLY_WITH_VIDEO;
        }
        return BaseNotice.CHECK_PROFILE;
    }

    public HashMap toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("domain", this.domain);
        hashMap.put("code", Integer.valueOf(this.code));
        if (this.internalCode != 0) {
            hashMap.put("internalCode", Integer.valueOf(this.internalCode));
        }
        if (this.description != null) {
            hashMap.put("description", this.description);
        }
        return hashMap;
    }

    public String toString() {
        String str;
        String str2 = "domain:%s, code:%d, internalCode:%d, description:%s";
        Object[] objArr = new Object[4];
        objArr[0] = this.domain;
        objArr[1] = Integer.valueOf(this.code);
        objArr[2] = Integer.valueOf(this.internalCode);
        if (this.description != null) {
            str = this.description;
        } else {
            str = "";
        }
        objArr[3] = str;
        return C2240a.m6772a(str2, objArr);
    }

    private boolean needChangeURL() {
        if (this.code == -499988 || this.code == -499987 || this.code == -499986 || this.code == -499985 || this.code == -499899 || this.code == -499898 || this.code == -499897 || this.code == -499896 || this.code == -499894 || this.code == -499893 || this.code == -499891 || this.code == 251658241 || this.code == -499799 || this.code == -499795 || this.code == -499794 || this.code == -499793 || this.code == -499792) {
            return true;
        }
        return false;
    }

    public Error(String str, int i) {
        this(str, i, 0);
    }

    public Error(String str, int i, int i2) {
        this(str, i, i2, null);
    }

    public Error(String str, int i, String str2) {
        this(str, i, 0, str2);
    }

    public Error(String str, int i, int i2, String str2) {
        this.domain = str;
        this.code = i;
        this.internalCode = i2;
        this.description = str2;
    }
}
