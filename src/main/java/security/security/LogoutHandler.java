package security.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

public class LogoutHandler extends SimpleUrlLogoutSuccessHandler{
	@Override
	public void onLogoutSuccess(HttpServletRequest request,
			HttpServletResponse response,
			Authentication authentication)
					throws IOException, ServletException {
		logger.info("onLogoutSuccess");

		RedirectStrategy redirectStrategy = getRedirectStrategy();
		redirectStrategy.sendRedirect(request, response, "/login");
	}
}
