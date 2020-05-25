package com.google.android.play.core.p1051c;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.play.core.c.ar */
class C17269ar extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f48741a;

    public C17269ar(X509Certificate x509Certificate) {
        this.f48741a = x509Certificate;
    }

    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f48741a.checkValidity();
    }

    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f48741a.checkValidity(date);
    }

    public int getBasicConstraints() {
        return this.f48741a.getBasicConstraints();
    }

    public Set<String> getCriticalExtensionOIDs() {
        return this.f48741a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f48741a.getEncoded();
    }

    public byte[] getExtensionValue(String str) {
        return this.f48741a.getExtensionValue(str);
    }

    public Principal getIssuerDN() {
        return this.f48741a.getIssuerDN();
    }

    public boolean[] getIssuerUniqueID() {
        return this.f48741a.getIssuerUniqueID();
    }

    public boolean[] getKeyUsage() {
        return this.f48741a.getKeyUsage();
    }

    public Set<String> getNonCriticalExtensionOIDs() {
        return this.f48741a.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.f48741a.getNotAfter();
    }

    public Date getNotBefore() {
        return this.f48741a.getNotBefore();
    }

    public PublicKey getPublicKey() {
        return this.f48741a.getPublicKey();
    }

    public BigInteger getSerialNumber() {
        return this.f48741a.getSerialNumber();
    }

    public String getSigAlgName() {
        return this.f48741a.getSigAlgName();
    }

    public String getSigAlgOID() {
        return this.f48741a.getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return this.f48741a.getSigAlgParams();
    }

    public byte[] getSignature() {
        return this.f48741a.getSignature();
    }

    public Principal getSubjectDN() {
        return this.f48741a.getSubjectDN();
    }

    public boolean[] getSubjectUniqueID() {
        return this.f48741a.getSubjectUniqueID();
    }

    public byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f48741a.getTBSCertificate();
    }

    public int getVersion() {
        return this.f48741a.getVersion();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.f48741a.hasUnsupportedCriticalExtension();
    }

    public String toString() {
        return this.f48741a.toString();
    }

    public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f48741a.verify(publicKey);
    }

    public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f48741a.verify(publicKey, str);
    }
}
