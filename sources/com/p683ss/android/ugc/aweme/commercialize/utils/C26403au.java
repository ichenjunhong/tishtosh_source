package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.net.Uri;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.au */
public final class C26403au {

    /* renamed from: a */
    public static final C26403au f69648a = new C26403au();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f69649b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final LinkedList<String> f69650c = new LinkedList<>();

    private C26403au() {
    }

    /* renamed from: b */
    public static final boolean m63866b(Challenge challenge) {
        if (challenge == null || !m63869c(challenge)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m63863a(TextExtraStruct textExtraStruct) {
        if (textExtraStruct != null && textExtraStruct.isCommerce()) {
            m63864a(textExtraStruct.getCid());
            m63864a(textExtraStruct.getHashTagName());
        }
    }

    /* renamed from: b */
    public static final boolean m63867b(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        ReadLock readLock = f69649b.readLock();
        readLock.lock();
        try {
            return f69650c.contains(str);
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: c */
    private static void m63868c(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f69650c.remove(str);
            f69650c.add(str);
            while (f69650c.size() > 100) {
                f69650c.removeFirst();
            }
        }
    }

    /* renamed from: c */
    public static final boolean m63869c(Challenge challenge) {
        boolean z;
        C52711k.m112240b(challenge, "$this$isCommerceChallenge");
        if (challenge.isCommerce() || challenge.isCommerceAndValid()) {
            return true;
        }
        CharSequence schema = challenge.getSchema();
        if (schema == null || schema.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String queryParameter = Uri.parse(challenge.getSchema()).getQueryParameter("is_commerce");
            if (C52711k.m112239a((Object) queryParameter, (Object) "1") || C52830p.m112406a("true", queryParameter, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final void m63862a(Challenge challenge) {
        int i;
        if (challenge != null && m63869c(challenge)) {
            ReentrantReadWriteLock reentrantReadWriteLock = f69649b;
            ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
            WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                m63868c(challenge.getCid());
                m63868c(challenge.getChallengeName());
                writeLock.unlock();
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public static final void m63864a(String str) {
        boolean z;
        int i;
        CharSequence charSequence = str;
        int i2 = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ReentrantReadWriteLock reentrantReadWriteLock = f69649b;
            ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
            WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                m63868c(str);
                writeLock.unlock();
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public static final void m63865a(String str, String str2) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                m63861a(parse, str2);
            }
        }
    }

    /* renamed from: a */
    public static final void m63861a(Uri uri, String str) {
        boolean z;
        int i;
        if (uri != null) {
            CharSequence charSequence = str;
            int i2 = 0;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String queryParameter = uri.getQueryParameter("is_commerce");
                if (C52711k.m112239a((Object) queryParameter, (Object) "1") || C52830p.m112406a("true", queryParameter, true)) {
                    ReentrantReadWriteLock reentrantReadWriteLock = f69649b;
                    ReadLock readLock = reentrantReadWriteLock.readLock();
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock.getReadHoldCount();
                    } else {
                        i = 0;
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                    WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        m63868c(str);
                        writeLock.unlock();
                    } finally {
                        while (i2 < i) {
                            readLock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                    }
                }
            }
        }
    }
}
