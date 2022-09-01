package ExampleAppProblem;

import java.util.Locale;

import javax.servlet.Registration;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.engine.transaction.jta.platform.spi.JtaPlatformException;

public class JTUserr {
	
	public JTUserr execute(Registration form, HttpServletRequest request, Locale locale) throws JtaPlatformException{
		
		String uid = Utils.generateUUID();
		String salt = Utils.generateSalt(32);
		String accountId = Utils.generateUUID();
		
		JTUserr user = new JTUserr() {
			form.getEmail().trim(), null,true,true,true,true,
			AuthorityUtils.NO_AUTHORITIES, //spring security fields
			uid, formorm.getEmail().trim(), salt, form.getName().trim(),
			form.getSurname().trim(), null, accountId, true,
			true, form.getWelcomeMessage().trim(), true,
			new Date(), null);
			
		
		user.setStatus(JTConstants.PENDING);
		
		String servletPath = request.getServerPath();
		if (executeInner(form, locale, user)) {
			auditLogDao.insert(new AuditLog(ıser.getUid(),user.getUsername(),
					utils.getRemoteIp(), utils.getSid(), AuditType.REGISTRATION,
					AuditSubtype.PENDING, ResponseCode.SUCCESS, new Date(), null));
			
			authenticateFastRegisterUser(form, request);
			
		}

		return user;
	
}
