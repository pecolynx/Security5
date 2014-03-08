package security.controller.main;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping(value = "/view")
public class MainViewController {
 
  private static Logger logger = LoggerFactory.getLogger("Security");
 
  @RequestMapping(method = RequestMethod.GET)
  public String main(Model model) {
    logger.info("main");
 
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
     
    model.addAttribute("loginId", auth.getName());
     
    return "main";
  }
}
