package com.p683ss.ttvideoengine.fetcher;

import com.C2240a;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.ttvideoengine.fetcher.AWSV4Auth */
public class AWSV4Auth {
    private static String MAC_ALGORITHM = "HmacSHA256";
    protected static final char[] hexArray = "0123456789ABCDEF".toCharArray();
    private static Mac mMac;
    private static MessageDigest mMessageDigest;
    private final String AWSAmzDateKey;
    private final String HMACAlgorithm;
    private String accessKeyID;
    private final String aws4Request;
    private TreeMap<String, String> awsHeaders;
    private boolean awsHeadersHasTimestamp;
    private String canonicalURI;
    private String currentDate;
    private boolean debug;
    private String httpMethodName;
    private String payload;
    private TreeMap<String, String> queryParameters;
    private String regionName;
    private String secretAccessKey;
    private String serviceName;
    private String strSignedHeader;
    private String xAmzDate;

    /* renamed from: com.ss.ttvideoengine.fetcher.AWSV4Auth$Builder */
    public static class Builder {
        public String accessKeyID;
        public TreeMap<String, String> awsHeaders;
        public String canonicalURI;
        public boolean debug;
        public String httpMethodName;
        public String payload;
        public TreeMap<String, String> queryParameters;
        public String regionName;
        public String secretAccessKey;
        public String serviceName;

        public Builder debug() {
            this.debug = true;
            return this;
        }

        public AWSV4Auth build() {
            return new AWSV4Auth(this);
        }

        public Builder awsHeaders(TreeMap<String, String> treeMap) {
            this.awsHeaders = treeMap;
            return this;
        }

        public Builder canonicalURI(String str) {
            this.canonicalURI = str;
            return this;
        }

        public Builder httpMethodName(String str) {
            this.httpMethodName = str;
            return this;
        }

        public Builder payload(String str) {
            this.payload = str;
            return this;
        }

        public Builder queryParameters(TreeMap<String, String> treeMap) {
            this.queryParameters = treeMap;
            return this;
        }

        public Builder regionName(String str) {
            this.regionName = str;
            return this;
        }

        public Builder serviceName(String str) {
            this.serviceName = str;
            return this;
        }

        public Builder(String str, String str2) {
            this.accessKeyID = str;
            this.secretAccessKey = str2;
        }
    }

    private AWSV4Auth() {
        this.HMACAlgorithm = "AWS4-HMAC-SHA256";
        this.aws4Request = "aws4_request";
        this.AWSAmzDateKey = "x-amz-date";
    }

    static {
        try {
            mMac = Mac.getInstance(MAC_ALGORITHM);
            mMessageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            TTVideoEngineLog.m110645d(e);
        }
    }

    private String getTimeStamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    private String findTimestampFromHeaderCaseInsensitive() {
        if (this.awsHeaders != null && !this.awsHeaders.isEmpty()) {
            for (Entry entry : this.awsHeaders.entrySet()) {
                if (((String) entry.getKey()).toLowerCase().equals("x-amz-date")) {
                    return (String) entry.getValue();
                }
            }
        }
        return null;
    }

    public Map<String, String> getHeaders() {
        String calculateSignature = calculateSignature(prepareStringToSign(prepareCanonicalRequest()));
        if (calculateSignature != null) {
            HashMap hashMap = new HashMap(0);
            for (Entry entry : this.awsHeaders.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap.put("Authorization", buildAuthorizationString(calculateSignature));
            if (this.debug) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("##Signature:\n");
                sb.append(calculateSignature);
                printStream.println(sb.toString());
                System.out.println("##Header:");
                for (Entry entry2 : hashMap.entrySet()) {
                    PrintStream printStream2 = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((String) entry2.getKey());
                    sb2.append(" = ");
                    sb2.append((String) entry2.getValue());
                    printStream2.println(sb2.toString());
                }
                System.out.println("================================");
            }
            return hashMap;
        }
        if (this.debug) {
            PrintStream printStream3 = System.out;
            StringBuilder sb3 = new StringBuilder("##Signature:\n");
            sb3.append(calculateSignature);
            printStream3.println(sb3.toString());
        }
        return null;
    }

    private String prepareCanonicalRequest() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("");
        sb.append(this.httpMethodName);
        sb.append("\n");
        if (this.canonicalURI == null || this.canonicalURI.trim().isEmpty()) {
            str = "/";
        } else {
            str = this.canonicalURI;
        }
        this.canonicalURI = str;
        sb.append(this.canonicalURI);
        sb.append("\n");
        StringBuilder sb2 = new StringBuilder("");
        if (this.queryParameters == null || this.queryParameters.isEmpty()) {
            sb2.append("\n");
        } else {
            for (Entry entry : this.queryParameters.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                sb2.append(str3);
                sb2.append("=");
                sb2.append(encodeParameter(str4));
                sb2.append("&");
            }
            sb2.deleteCharAt(sb2.lastIndexOf("&"));
            sb2.append("\n");
        }
        sb.append(sb2);
        StringBuilder sb3 = new StringBuilder("");
        if (this.awsHeaders == null || this.awsHeaders.isEmpty()) {
            sb.append("\n");
        } else {
            TreeMap treeMap = new TreeMap();
            for (Entry entry2 : this.awsHeaders.entrySet()) {
                treeMap.put(((String) entry2.getKey()).toLowerCase(), ((String) entry2.getValue()).trim());
            }
            for (Entry entry3 : treeMap.entrySet()) {
                String lowerCase = ((String) entry3.getKey()).toLowerCase();
                String trim = ((String) entry3.getValue()).trim();
                sb3.append(lowerCase);
                sb3.append(";");
                sb.append(lowerCase);
                sb.append(":");
                sb.append(trim);
                sb.append("\n");
            }
            sb.append("\n");
        }
        this.strSignedHeader = sb3.substring(0, sb3.length() - 1);
        sb.append(this.strSignedHeader);
        sb.append("\n");
        if (this.payload == null) {
            str2 = "";
        } else {
            str2 = this.payload;
        }
        this.payload = str2;
        sb.append(generateHex(this.payload));
        if (this.debug) {
            PrintStream printStream = System.out;
            StringBuilder sb4 = new StringBuilder("##Canonical Request:\n");
            sb4.append(sb.toString());
            printStream.println(sb4.toString());
        }
        return sb.toString();
    }

    private String calculateSignature(String str) {
        try {
            return bytesToHex(HmacSHA256(getSignatureKey(this.secretAccessKey, this.currentDate, this.regionName, this.serviceName), str));
        } catch (Exception e) {
            TTVideoEngineLog.m110645d(e);
            return null;
        }
    }

    private String encodeParameter(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (Exception unused) {
            return str;
        }
    }

    private String getDateFromTimeStamp(String str) {
        if (str == null || str.length() < 8) {
            return null;
        }
        return str.substring(0, 8);
    }

    private String bytesToHex(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = hexArray[b >>> 4];
            cArr[i2 + 1] = hexArray[b & 15];
        }
        return new String(cArr).toLowerCase();
    }

    private String generateHex(String str) {
        try {
            mMessageDigest.update(str.getBytes("UTF-8"));
            return C2240a.m6772a("%064x", new Object[]{new BigInteger(1, mMessageDigest.digest())});
        } catch (UnsupportedEncodingException e) {
            TTVideoEngineLog.m110645d(e);
            return null;
        }
    }

    private AWSV4Auth(Builder builder) {
        this.HMACAlgorithm = "AWS4-HMAC-SHA256";
        this.aws4Request = "aws4_request";
        this.AWSAmzDateKey = "x-amz-date";
        this.accessKeyID = builder.accessKeyID;
        this.secretAccessKey = builder.secretAccessKey;
        this.regionName = builder.regionName;
        this.serviceName = builder.serviceName;
        this.httpMethodName = builder.httpMethodName;
        this.canonicalURI = builder.canonicalURI;
        this.queryParameters = builder.queryParameters;
        this.awsHeaders = builder.awsHeaders;
        this.payload = builder.payload;
        this.debug = builder.debug;
        if (this.awsHeaders == null) {
            this.awsHeaders = new TreeMap<>();
        }
        this.xAmzDate = findTimestampFromHeaderCaseInsensitive();
        if (this.xAmzDate == null) {
            this.xAmzDate = getTimeStamp();
            this.awsHeaders.put("x-amz-date", this.xAmzDate);
        } else {
            this.awsHeadersHasTimestamp = true;
        }
        this.currentDate = getDateFromTimeStamp(this.xAmzDate);
    }

    private String buildAuthorizationString(String str) {
        StringBuilder sb = new StringBuilder("AWS4-HMAC-SHA256 Credential=");
        sb.append(this.accessKeyID);
        sb.append("/");
        sb.append(this.currentDate);
        sb.append("/");
        sb.append(this.regionName);
        sb.append("/");
        sb.append(this.serviceName);
        sb.append("/aws4_request");
        sb.append(",SignedHeaders=");
        sb.append(this.strSignedHeader);
        sb.append(",Signature=");
        sb.append(str);
        return sb.toString();
    }

    private String prepareStringToSign(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("AWS4-HMAC-SHA256\n");
        sb.append(this.xAmzDate);
        sb.append("\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(this.currentDate);
        sb3.append("/");
        sb3.append(this.regionName);
        sb3.append("/");
        sb3.append(this.serviceName);
        sb3.append("/aws4_request");
        sb3.append("\n");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(generateHex(str));
        String sb6 = sb5.toString();
        if (this.debug) {
            PrintStream printStream = System.out;
            StringBuilder sb7 = new StringBuilder("##String to sign:\n");
            sb7.append(sb6);
            printStream.println(sb7.toString());
        }
        return sb6;
    }

    private byte[] HmacSHA256(byte[] bArr, String str) throws Exception {
        mMac.init(new SecretKeySpec(bArr, MAC_ALGORITHM));
        return mMac.doFinal(str.getBytes("UTF8"));
    }

    private byte[] getSignatureKey(String str, String str2, String str3, String str4) throws Exception {
        StringBuilder sb = new StringBuilder("AWS4");
        sb.append(str);
        return HmacSHA256(HmacSHA256(HmacSHA256(HmacSHA256(sb.toString().getBytes("UTF8"), str2), str3), str4), "aws4_request");
    }
}
