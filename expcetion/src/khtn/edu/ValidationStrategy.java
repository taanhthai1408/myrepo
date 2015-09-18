package khtn.edu;

import java.security.GeneralSecurityException;
import java.security.cert.CertPath;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;

 interface ValidationStrategy {
	 boolean validate(X509Certificate certificate, CertPath certPath,
	            PKIXParameters parameters) throws GeneralSecurityException;
}
