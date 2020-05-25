package com.p683ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.friends.api.C32558a;
import com.p683ss.android.ugc.aweme.friends.api.FriendApi;
import com.p683ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p683ss.android.ugc.aweme.friends.invite.C32585c;
import com.p683ss.android.ugc.aweme.friends.invite.C32586d;
import com.p683ss.android.ugc.aweme.friends.p1788b.C32564a;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32568a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47672am;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel */
public class InviteContactFriendsModel extends C32568a<Friend> {
    private final FriendApi friendApi = ((FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FriendApi.class));
    private HashMap<String, ContactModel> hashContactsMap = new HashMap<>();
    public List<Integer> mIndexCounts = new ArrayList();
    public List<String> mIndexLetters = new ArrayList();
    private InvitedContactCacher sInvitedContactCacher = new InvitedContactCacher(604800000);

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$ContactFriend */
    public static class ContactFriend extends Friend {
        String firstName;
        String lastName;
        public int originIndex;
        public String section;
        String url;

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getOriginIndex() {
            return this.originIndex;
        }

        public String getSection() {
            return this.section;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public ContactFriend(String str) {
            super(str);
        }

        public void setFirstName(String str) {
            this.firstName = str;
        }

        public void setLastName(String str) {
            this.lastName = str;
        }

        public void setOriginIndex(int i) {
            this.originIndex = i;
        }

        public void setSection(String str) {
            this.section = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ContactFriend) {
                ContactFriend contactFriend = (ContactFriend) obj;
                if (TextUtils.equals(getSocialName(), contactFriend.getSocialName()) && TextUtils.equals(getNickname(), contactFriend.getNickname())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$IFetchShareConfigCallback */
    public interface IFetchShareConfigCallback {
        void onFailed();

        void onSuccess(C32586d dVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$InviteFriendsCallback */
    public interface InviteFriendsCallback {
        void onFailed(String str);

        void onSuccess();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$InvitedContactCacher */
    static class InvitedContactCacher {
        private Map<String, Long> invited;
        private final long mExpiredTime;
        private final Object mLock = new Object();
        private Runnable mSaveRunnable = new InviteContactFriendsModel$InvitedContactCacher$$Lambda$0(this);

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void lambda$new$1$InviteContactFriendsModel$InvitedContactCacher() {
            C0013i.m16a((Callable<TResult>) new InviteContactFriendsModel$InvitedContactCacher$$Lambda$1<TResult>(this));
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|(4:10|(4:13|(2:19|32)|20|11)|31|21)|22|23|(1:25)) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0067 */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void delayInit() {
            /*
                r11 = this;
                java.lang.Object r0 = r11.mLock
                monitor-enter(r0)
                java.util.Map<java.lang.String, java.lang.Long> r1 = r11.invited     // Catch:{ all -> 0x0074 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0074 }
                return
            L_0x0009:
                com.ss.android.ugc.aweme.friends.b.a r1 = com.p683ss.android.ugc.aweme.friends.p1788b.C32564a.m75339a()     // Catch:{ Exception -> 0x0067 }
                android.content.SharedPreferences r1 = r1.f84793a     // Catch:{ Exception -> 0x0067 }
                java.lang.String r2 = "contact_invited"
                java.lang.String r3 = ""
                java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ Exception -> 0x0067 }
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0067 }
                if (r2 != 0) goto L_0x0067
                java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x0067 }
                r2.<init>()     // Catch:{ Exception -> 0x0067 }
                r11.invited = r2     // Catch:{ Exception -> 0x0067 }
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0067 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0067 }
                r1 = 0
            L_0x002a:
                int r3 = r2.length()     // Catch:{ Exception -> 0x0067 }
                if (r1 >= r3) goto L_0x0062
                org.json.JSONObject r3 = r2.optJSONObject(r1)     // Catch:{ Exception -> 0x0067 }
                java.lang.String r4 = "social_name"
                java.lang.String r4 = r3.optString(r4)     // Catch:{ Exception -> 0x0067 }
                java.lang.String r5 = "invited_time"
                long r5 = r3.optLong(r5)     // Catch:{ Exception -> 0x0067 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0067 }
                boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r4)     // Catch:{ Exception -> 0x0067 }
                if (r3 != 0) goto L_0x005f
                r9 = 0
                int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r3 <= 0) goto L_0x005f
                boolean r3 = r11.hasExpired(r5, r7)     // Catch:{ Exception -> 0x0067 }
                if (r3 != 0) goto L_0x005f
                java.util.Map<java.lang.String, java.lang.Long> r3 = r11.invited     // Catch:{ Exception -> 0x0067 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0067 }
                r3.put(r4, r5)     // Catch:{ Exception -> 0x0067 }
            L_0x005f:
                int r1 = r1 + 1
                goto L_0x002a
            L_0x0062:
                java.lang.Runnable r1 = r11.mSaveRunnable     // Catch:{ Exception -> 0x0067 }
                r1.run()     // Catch:{ Exception -> 0x0067 }
            L_0x0067:
                java.util.Map<java.lang.String, java.lang.Long> r1 = r11.invited     // Catch:{ all -> 0x0074 }
                if (r1 != 0) goto L_0x0072
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                r11.invited = r1     // Catch:{ all -> 0x0074 }
            L_0x0072:
                monitor-exit(r0)     // Catch:{ all -> 0x0074 }
                return
            L_0x0074:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0074 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InvitedContactCacher.delayInit():void");
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ Object lambda$null$0$InviteContactFriendsModel$InvitedContactCacher() throws Exception {
            if (this.invited == null) {
                SharePrefCache.inst().setInvitedContacts("");
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.invited.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (hasExpired(((Long) entry.getValue()).longValue(), currentTimeMillis)) {
                    it.remove();
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("social_name", entry.getKey());
                    jSONObject.put("invited_time", entry.getValue());
                    jSONArray.put(jSONObject);
                }
            }
            C32564a a = C32564a.m75339a();
            a.f84793a.edit().putString("contact_invited", jSONArray.toString()).apply();
            return null;
        }

        InvitedContactCacher(long j) {
            this.mExpiredTime = j;
        }

        public void add(String str) {
            delayInit();
            synchronized (this.mLock) {
                this.invited.put(str, Long.valueOf(System.currentTimeMillis()));
                this.mSaveRunnable.run();
            }
        }

        private boolean hasExpired(long j, long j2) {
            if (j + this.mExpiredTime <= j2) {
                return true;
            }
            return false;
        }

        public boolean contains(String str, long j) {
            delayInit();
            if (!this.invited.containsKey(str) || hasExpired(((Long) this.invited.get(str)).longValue(), j)) {
                return false;
            }
            return true;
        }
    }

    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    private C0013i<FriendList<ContactFriend>> uploadContacts() {
        AtomicReference atomicReference = new AtomicReference();
        return C0013i.m16a((Callable<TResult>) new InviteContactFriendsModel$$Lambda$1<TResult>(this, atomicReference)).mo29c(new InviteContactFriendsModel$$Lambda$2(this, atomicReference));
    }

    public void addInvitedContact(String str) {
        if (this.sInvitedContactCacher != null) {
            this.sInvitedContactCacher.add(str);
        }
    }

    public void fetchShareConfig(IFetchShareConfigCallback iFetchShareConfigCallback) {
        C0013i.m16a((Callable<TResult>) new InviteContactFriendsModel$$Lambda$7<TResult>(this, iFetchShareConfigCallback));
    }

    public C32585c shortenUrl(String str) throws ExecutionException, InterruptedException {
        return (C32585c) C32558a.m75336a().shortenUrl(str).get();
    }

    public static Key getKey(String str) {
        try {
            return new SecretKeySpec(str.getBytes(), "AES");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static final /* synthetic */ C0013i lambda$fetchList$0$InviteContactFriendsModel(C0013i iVar) throws Exception {
        if (!iVar.mo33d()) {
            iVar.getClass();
            return C0013i.m16a(InviteContactFriendsModel$$Lambda$11.get$Lambda(iVar));
        }
        throw iVar.mo35f();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object lambda$fetchShareConfig$10$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback) throws Exception {
        C32586d dVar;
        try {
            dVar = (C32586d) C32558a.m75336a().getInviteContactFriendsSettings().get();
        } catch (Throwable unused) {
            dVar = null;
        }
        if (dVar != null) {
            this.mHandler.post(new InviteContactFriendsModel$$Lambda$8(iFetchShareConfigCallback, dVar));
        }
        return null;
    }

    public InviteContactFriendsModel(String str) {
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$1$InviteContactFriendsModel(AtomicReference atomicReference) throws Exception {
        atomicReference.set(C47673an.m103182a(C11010c.m22280a(), "sort_key", true));
        List<ContactModelV2> list = ((C47672am) atomicReference.get()).f120150a;
        filterInvalidVal(list);
        if (C9376b.m18558a((Collection<T>) list)) {
            return new UploadContactsResult();
        }
        encodeAndAddToCache((C47672am) atomicReference.get());
        if (C9376b.m18558a((Collection<T>) list)) {
            return new UploadContactsResult();
        }
        return UploadContactsApi.m75335a(list, 1);
    }

    private void encodeAndAddToCache(C47672am amVar) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        this.hashContactsMap.clear();
        int i = 0;
        for (ContactModelV2 contactModelV2 : amVar.f120150a) {
            for (String str : contactModelV2.phoneNumber) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = contactModelV2.name;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    ContactModel contactModel = new ContactModel(str, str2);
                    contactModel.url = contactModelV2.mImageUrl;
                    contactModel.firstName = contactModelV2.givenName;
                    contactModel.lastName = contactModelV2.familyName;
                    contactModel.originIndex = i;
                    contactModel.mSection = contactModelV2.section;
                    HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C9395d.m18572a(instance.digest(contactModelV2.nationalNumber(str).getBytes("UTF-8"))));
                    sb.append(C9395d.m18572a(instance.digest(str2.getBytes("UTF-8"))));
                    hashMap.put(sb.toString(), contactModel);
                }
            }
            i++;
        }
    }

    private void filterInvalidVal(List<ContactModelV2> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ContactModelV2 contactModelV2 = (ContactModelV2) it.next();
            if (C9431p.m18664a(contactModelV2.name) || contactModelV2.phoneNumber.isEmpty()) {
                it.remove();
            } else if (!C9431p.m18664a(contactModelV2.familyName) || !C9431p.m18664a(contactModelV2.givenName)) {
                Iterator it2 = contactModelV2.phoneNumber.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    try {
                        if (C9431p.m18664a(str)) {
                            it2.remove();
                        } else if (str.charAt(0) == '+') {
                            if (!PhoneNumberUtil.getInstance().isPossibleNumber(str, null)) {
                                it2.remove();
                            }
                        } else if (str.length() < 2 || str.length() > 17 || !str.matches("[0-9.-]+")) {
                            it2.remove();
                        }
                    } catch (Exception unused) {
                    }
                }
                if (contactModelV2.phoneNumber.isEmpty()) {
                    it.remove();
                }
            } else {
                it.remove();
            }
        }
    }

    private void sortWithContactIndex(List<ContactFriend> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ContactFriend contactFriend = (ContactFriend) it.next();
            if (!TextUtils.equals(contactFriend.section, "#") && !TextUtils.equals(contactFriend.section, "…") && contactFriend.section != null && !TextUtils.isEmpty(contactFriend.section.trim())) {
                z = false;
            }
            if (z) {
                it.remove();
                contactFriend.setSection("#");
                arrayList.add(contactFriend);
            }
        }
        Collections.sort(arrayList, InviteContactFriendsModel$$Lambda$3.$instance);
        Collections.sort(list, InviteContactFriendsModel$$Lambda$4.$instance);
        list.addAll(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ContactFriend contactFriend2 : list) {
            if (contactFriend2 != null) {
                String section = contactFriend2.getSection();
                if (!linkedHashMap.containsKey(section)) {
                    linkedHashMap.put(section, Integer.valueOf(1));
                } else {
                    linkedHashMap.put(section, Integer.valueOf(((Integer) linkedHashMap.get(section)).intValue() + 1));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : linkedHashMap.keySet()) {
            arrayList2.add(str);
            arrayList3.add(linkedHashMap.get(str));
        }
        this.mIndexLetters = arrayList2;
        this.mIndexCounts = arrayList3;
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$4$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        return contactFriend.originIndex - contactFriend2.originIndex;
    }

    static final /* synthetic */ void lambda$null$9$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback, C32586d dVar) {
        if (iFetchShareConfigCallback != null) {
            if (dVar != null) {
                iFetchShareConfigCallback.onSuccess(dVar);
                return;
            }
            iFetchShareConfigCallback.onFailed();
        }
    }

    private static String encryptAES(String str, String str2) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
        byte[] bytes = str.getBytes("UTF-8");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        try {
            instance.init(1, getKey(str2), new IvParameterSpec(str2.getBytes("UTF-8")));
            return Base64.encodeToString(instance.doFinal(bytes), 2);
        } catch (InvalidAlgorithmParameterException unused) {
            return "";
        }
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$3$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        char charAt = contactFriend.getNickname().toLowerCase().charAt(0);
        char charAt2 = contactFriend2.getNickname().toLowerCase().charAt(0);
        if (charAt < 'a' || charAt > 'z') {
            if (charAt2 >= 'a' && charAt2 <= 'z') {
                return 1;
            }
            if (charAt < '0' || charAt > '9') {
                if (charAt2 < '0' || charAt2 > '9') {
                    return contactFriend.originIndex - contactFriend2.originIndex;
                }
                return 1;
            } else if (charAt2 < '0' || charAt2 > '9') {
                return -1;
            } else {
                return charAt - charAt2;
            }
        } else if (charAt2 < 'a' || charAt2 > 'z') {
            return -1;
        } else {
            return contactFriend.originIndex - contactFriend2.originIndex;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void sort(com.p683ss.android.ugc.aweme.utils.C47672am r7, java.util.List<com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.ContactFriend> r8) {
        /*
            r6 = this;
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r8)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            int[] r0 = r7.f120152c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String[] r7 = r7.f120151b
            if (r7 == 0) goto L_0x0013
            r7 = 1
            goto L_0x0014
        L_0x0013:
            r7 = 0
        L_0x0014:
            if (r7 != 0) goto L_0x00c7
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getLanguage()
            java.util.Locale r0 = java.util.Locale.CHINESE
            java.lang.String r0 = r0.getLanguage()
            boolean r7 = android.text.TextUtils.equals(r7, r0)
            if (r7 != 0) goto L_0x0041
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getLanguage()
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.getLanguage()
            boolean r7 = android.text.TextUtils.equals(r7, r0)
            if (r7 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r7 = 0
            goto L_0x0042
        L_0x0041:
            r7 = 1
        L_0x0042:
            if (r7 == 0) goto L_0x00ca
            java.util.Iterator r7 = r8.iterator()
        L_0x0048:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r0 = r7.next()
            com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$ContactFriend r0 = (com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.ContactFriend) r0
            java.lang.String r3 = r0.getNickname()
            java.lang.String r4 = "#"
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x00c3
            char r4 = r3.charAt(r2)
            r5 = 19968(0x4e00, float:2.7981E-41)
            if (r4 < r5) goto L_0x006f
            r5 = 40869(0x9fa5, float:5.727E-41)
            if (r4 > r5) goto L_0x006f
            r5 = 1
            goto L_0x0070
        L_0x006f:
            r5 = 0
        L_0x0070:
            if (r5 != 0) goto L_0x0087
            boolean r5 = java.lang.Character.isUpperCase(r4)
            if (r5 != 0) goto L_0x0081
            boolean r5 = java.lang.Character.isLowerCase(r4)
            if (r5 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r5 = 0
            goto L_0x0082
        L_0x0081:
            r5 = 1
        L_0x0082:
            if (r5 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r5 = 0
            goto L_0x0088
        L_0x0087:
            r5 = 1
        L_0x0088:
            if (r5 == 0) goto L_0x00a5
            java.lang.String r4 = com.p683ss.android.ugc.aweme.utils.C47665af.m103175b(r3)
            java.lang.String r4 = r4.substring(r2, r1)
            java.lang.String r4 = r4.toUpperCase()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00c3
            java.lang.String r3 = r3.substring(r2, r1)
            java.lang.String r4 = r3.toUpperCase()
            goto L_0x00c3
        L_0x00a5:
            boolean r5 = com.p683ss.android.ugc.aweme.utils.C47665af.m103173a(r4)
            if (r5 != 0) goto L_0x00b4
            boolean r4 = com.p683ss.android.ugc.aweme.utils.C47665af.m103176b(r4)
            if (r4 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r4 = 0
            goto L_0x00b5
        L_0x00b4:
            r4 = 1
        L_0x00b5:
            if (r4 != 0) goto L_0x00c1
            boolean r3 = com.p683ss.android.ugc.aweme.utils.C47665af.m103174a(r3)
            if (r3 == 0) goto L_0x00be
            goto L_0x00c1
        L_0x00be:
            java.lang.String r4 = "#"
            goto L_0x00c3
        L_0x00c1:
            java.lang.String r4 = "#"
        L_0x00c3:
            r0.setSection(r4)
            goto L_0x0048
        L_0x00c7:
            r6.sortWithContactIndex(r8)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.sort(com.ss.android.ugc.aweme.utils.am, java.util.List):void");
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$uploadContacts$2$InviteContactFriendsModel(AtomicReference atomicReference, C0013i iVar) throws Exception {
        ArrayList arrayList;
        List<ContactModel> list = ((UploadContactsResult) iVar.mo34e()).contacts;
        if (!C9376b.m18558a((Collection<T>) list)) {
            arrayList = new ArrayList(list.size());
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            for (ContactModel contactModel : list) {
                HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                StringBuilder sb = new StringBuilder();
                sb.append(contactModel.phoneNumber);
                sb.append(contactModel.name);
                ContactModel contactModel2 = (ContactModel) hashMap.get(sb.toString());
                if (contactModel2 != null) {
                    contactModel.phoneNumber = contactModel2.phoneNumber;
                    contactModel.name = contactModel2.name;
                }
                ContactFriend contactFriend = new ContactFriend(contactModel.phoneNumber);
                contactFriend.setNickname(contactModel.name);
                if (contactModel2 != null) {
                    contactFriend.setFirstName(contactModel2.firstName);
                    contactFriend.setLastName(contactModel2.lastName);
                    contactFriend.setOriginIndex(contactModel2.originIndex);
                    contactFriend.setSection(contactModel2.mSection);
                    String str = contactModel2.url;
                    if (!C9431p.m18664a(str)) {
                        UrlModel urlModel = new UrlModel();
                        urlModel.setHeight(-1);
                        urlModel.setWidth(-1);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(str);
                        urlModel.setUrlList(arrayList2);
                        contactFriend.setAvatarThumb(urlModel);
                    }
                }
                if (!arrayList.contains(contactFriend)) {
                    if (this.sInvitedContactCacher.contains(contactModel.phoneNumber, currentTimeMillis)) {
                        contactFriend.setInvited(true);
                        arrayList.add(contactFriend);
                    } else {
                        arrayList.add(i, contactFriend);
                        i++;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        FriendList friendList = new FriendList();
        sort((C47672am) atomicReference.get(), arrayList);
        friendList.friends = arrayList;
        return friendList;
    }

    static final /* synthetic */ void lambda$null$5$InviteContactFriendsModel(boolean z, InviteFriendsCallback inviteFriendsCallback, String str) {
        if (z) {
            inviteFriendsCallback.onSuccess();
        } else {
            inviteFriendsCallback.onFailed(str);
        }
    }

    static final /* synthetic */ void lambda$null$7$InviteContactFriendsModel(boolean z, InviteFriendsCallback inviteFriendsCallback, String str) {
        if (z) {
            inviteFriendsCallback.onSuccess();
        } else {
            inviteFriendsCallback.onFailed(str);
        }
    }

    public void fetchList(int i, int i2, int i3) {
        uploadContacts().mo23b(InviteContactFriendsModel$$Lambda$0.$instance).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public void inviteFriendsForDouyin(String str, List<ContactModel> list, InviteFriendsCallback inviteFriendsCallback) {
        if (!C9431p.m18664a(str) && !C9376b.m18558a((Collection<T>) list)) {
            try {
                C0013i.m16a((Callable<TResult>) new InviteContactFriendsModel$$Lambda$5<TResult>(this, list, str, inviteFriendsCallback));
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.friends.model.ContactModel>, for r5v0, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.friends.model.ContactModel>] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object lambda$inviteFriendsForDouyin$6$InviteContactFriendsModel(java.util.List<com.p683ss.android.ugc.aweme.friends.model.ContactModel> r5, java.lang.String r6, com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback r7) throws java.lang.Exception {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0040 }
            r2.<init>()     // Catch:{ Exception -> 0x0040 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0040 }
        L_0x000b:
            boolean r3 = r5.hasNext()     // Catch:{ Exception -> 0x0040 }
            if (r3 == 0) goto L_0x001f
            java.lang.Object r3 = r5.next()     // Catch:{ Exception -> 0x0040 }
            com.ss.android.ugc.aweme.friends.model.ContactModel r3 = (com.p683ss.android.ugc.aweme.friends.model.ContactModel) r3     // Catch:{ Exception -> 0x0040 }
            if (r3 == 0) goto L_0x000b
            java.lang.String r3 = r3.phoneNumber     // Catch:{ NumberFormatException -> 0x000b }
            r2.add(r3)     // Catch:{ NumberFormatException -> 0x000b }
            goto L_0x000b
        L_0x001f:
            com.ss.android.ugc.aweme.friends.api.FriendApi r5 = com.p683ss.android.ugc.aweme.friends.api.C32558a.m75336a()     // Catch:{ Exception -> 0x0040 }
            java.lang.String r3 = ","
            java.lang.String r2 = android.text.TextUtils.join(r3, r2)     // Catch:{ Exception -> 0x0040 }
            com.google.b.h.a.m r5 = r5.inviteBySmsDouyin(r6, r2)     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x0040 }
            com.ss.android.ugc.aweme.friends.api.c r5 = (com.p683ss.android.ugc.aweme.friends.api.C32560c) r5     // Catch:{ Exception -> 0x0040 }
            if (r5 == 0) goto L_0x003b
            int r6 = r5.f84788d     // Catch:{ Exception -> 0x0040 }
            if (r6 != 0) goto L_0x003b
            r1 = 1
            goto L_0x0040
        L_0x003b:
            if (r5 == 0) goto L_0x0040
            java.lang.String r5 = r5.f84785a     // Catch:{ Exception -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r5 = r0
        L_0x0041:
            if (r7 != 0) goto L_0x0044
            return r0
        L_0x0044:
            com.bytedance.common.utility.b.g r6 = r4.mHandler
            com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$10 r2 = new com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$10
            r2.<init>(r1, r7, r5)
            r6.post(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.lambda$inviteFriendsForDouyin$6$InviteContactFriendsModel(java.util.List, java.lang.String, com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$InviteFriendsCallback):java.lang.Object");
    }

    public void inviteFriendsForMT(String str, List<ContactModel> list, String str2, InviteFriendsCallback inviteFriendsCallback) {
        if (!C9431p.m18664a(str) && !C9376b.m18558a((Collection<T>) list)) {
            try {
                InviteContactFriendsModel$$Lambda$6 inviteContactFriendsModel$$Lambda$6 = new InviteContactFriendsModel$$Lambda$6(this, list, str, str2, inviteFriendsCallback);
                C0013i.m16a((Callable<TResult>) inviteContactFriendsModel$$Lambda$6);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.friends.model.ContactModel>, for r4v0, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.friends.model.ContactModel>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object lambda$inviteFriendsForMT$8$InviteContactFriendsModel(java.util.List<com.p683ss.android.ugc.aweme.friends.model.ContactModel> r4, java.lang.String r5, java.lang.String r6, com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback r7) throws java.lang.Exception {
        /*
            r3 = this;
            r0 = 0
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0044 }
            r1.<init>()     // Catch:{ Exception -> 0x0044 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0044 }
        L_0x000a:
            boolean r2 = r4.hasNext()     // Catch:{ Exception -> 0x0044 }
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r4.next()     // Catch:{ Exception -> 0x0044 }
            com.ss.android.ugc.aweme.friends.model.ContactModel r2 = (com.p683ss.android.ugc.aweme.friends.model.ContactModel) r2     // Catch:{ Exception -> 0x0044 }
            if (r2 == 0) goto L_0x000a
            java.lang.String r2 = r2.phoneNumber     // Catch:{ Exception -> 0x0044 }
            r1.put(r2)     // Catch:{ Exception -> 0x0044 }
            goto L_0x000a
        L_0x001e:
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = "J?I7iAd=3j9AM1P="
            java.lang.String r4 = encryptAES(r4, r1)     // Catch:{ Exception -> 0x0044 }
            com.ss.android.ugc.aweme.friends.api.FriendApi r1 = com.p683ss.android.ugc.aweme.friends.api.C32558a.m75336a()     // Catch:{ Exception -> 0x0044 }
            com.google.b.h.a.m r4 = r1.inviteBySms(r5, r6, r4)     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0044 }
            com.ss.android.ugc.aweme.friends.api.c r4 = (com.p683ss.android.ugc.aweme.friends.api.C32560c) r4     // Catch:{ Exception -> 0x0044 }
            if (r4 == 0) goto L_0x0044
            java.lang.String r5 = "success"
            java.lang.String r4 = r4.f84785a     // Catch:{ Exception -> 0x0044 }
            boolean r4 = android.text.TextUtils.equals(r5, r4)     // Catch:{ Exception -> 0x0044 }
            if (r4 == 0) goto L_0x0044
            r4 = 1
            r0 = 1
        L_0x0044:
            r4 = 0
            if (r7 != 0) goto L_0x0048
            return r4
        L_0x0048:
            com.bytedance.common.utility.b.g r5 = r3.mHandler
            com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$9 r6 = new com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$9
            r6.<init>(r0, r7, r4)
            r5.post(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.lambda$inviteFriendsForMT$8$InviteContactFriendsModel(java.util.List, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$InviteFriendsCallback):java.lang.Object");
    }
}
